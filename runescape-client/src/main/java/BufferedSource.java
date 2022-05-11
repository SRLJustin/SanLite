import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("np")
@Implements("BufferedSource")
public class BufferedSource implements Runnable {
	@ObfuscatedName("uf")
	@ObfuscatedSignature(
		descriptor = "Lbd;"
	)
	@Export("friendSystem")
	public static FriendSystem friendSystem;
	@ObfuscatedName("j")
	@Export("userHomeDirectory")
	static String userHomeDirectory;
	@ObfuscatedName("o")
	@Export("thread")
	Thread thread;
	@ObfuscatedName("q")
	@Export("inputStream")
	InputStream inputStream;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1611590211
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("k")
	@Export("buffer")
	byte[] buffer;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1886855287
	)
	@Export("position")
	int position;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 360959185
	)
	@Export("limit")
	int limit;
	@ObfuscatedName("p")
	@Export("exception")
	IOException exception;

	BufferedSource(InputStream var1, int var2) {
		this.position = 0;
		this.limit = 0;
		this.inputStream = var1;
		this.capacity = var2 + 1;
		this.buffer = new byte[this.capacity];
		this.thread = new Thread(this);
		this.thread.setDaemon(true);
		this.thread.start();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-916314557"
	)
	@Export("isAvailable")
	boolean isAvailable(int var1) throws IOException {
		if (var1 == 0) {
			return true;
		} else if (var1 > 0 && var1 < this.capacity) {
			synchronized(this) {
				int var3;
				if (this.position <= this.limit) {
					var3 = this.limit - this.position;
				} else {
					var3 = this.capacity - this.position + this.limit;
				}

				if (var3 < var1) {
					if (this.exception != null) {
						throw new IOException(this.exception.toString());
					} else {
						this.notifyAll();
						return false;
					}
				} else {
					return true;
				}
			}
		} else {
			throw new IOException();
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "377483853"
	)
	@Export("available")
	int available() throws IOException {
		synchronized(this) {
			int var2;
			if (this.position <= this.limit) {
				var2 = this.limit - this.position;
			} else {
				var2 = this.capacity - this.position + this.limit;
			}

			if (var2 <= 0 && this.exception != null) {
				throw new IOException(this.exception.toString());
			} else {
				this.notifyAll();
				return var2;
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-18"
	)
	@Export("readUnsignedByte")
	int readUnsignedByte() throws IOException {
		synchronized(this) {
			if (this.limit == this.position) {
				if (this.exception != null) {
					throw new IOException(this.exception.toString());
				} else {
					return -1;
				}
			} else {
				int var2 = this.buffer[this.position] & 255;
				this.position = (this.position + 1) % this.capacity;
				this.notifyAll();
				return var2;
			}
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "([BIII)I",
		garbageValue = "-720858367"
	)
	@Export("read")
	int read(byte[] var1, int var2, int var3) throws IOException {
		if (var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) {
			synchronized(this) {
				int var5;
				if (this.position <= this.limit) {
					var5 = this.limit - this.position;
				} else {
					var5 = this.capacity - this.position + this.limit;
				}

				if (var3 > var5) {
					var3 = var5;
				}

				if (var3 == 0 && this.exception != null) {
					throw new IOException(this.exception.toString());
				} else {
					if (var3 + this.position <= this.capacity) {
						System.arraycopy(this.buffer, this.position, var1, var2, var3);
					} else {
						int var6 = this.capacity - this.position;
						System.arraycopy(this.buffer, this.position, var1, var2, var6);
						System.arraycopy(this.buffer, 0, var1, var6 + var2, var3 - var6);
					}

					this.position = (var3 + this.position) % this.capacity;
					this.notifyAll();
					return var3;
				}
			}
		} else {
			throw new IOException();
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1309478376"
	)
	@Export("close")
	void close() {
		synchronized(this) {
			if (this.exception == null) {
				this.exception = new IOException("");
			}

			this.notifyAll();
		}

		try {
			this.thread.join();
		} catch (InterruptedException var3) {
		}

	}

	public void run() {
		while (true) {
			int var1;
			synchronized(this) {
				while (true) {
					if (this.exception != null) {
						return;
					}

					if (this.position == 0) {
						var1 = this.capacity - this.limit - 1;
					} else if (this.position <= this.limit) {
						var1 = this.capacity - this.limit;
					} else {
						var1 = this.position - this.limit - 1;
					}

					if (var1 > 0) {
						break;
					}

					try {
						this.wait();
					} catch (InterruptedException var10) {
					}
				}
			}

			int var7;
			try {
				var7 = this.inputStream.read(this.buffer, this.limit, var1);
				if (var7 == -1) {
					throw new EOFException();
				}
			} catch (IOException var11) {
				IOException var3 = var11;
				synchronized(this) {
					this.exception = var3;
					return;
				}
			}

			synchronized(this) {
				this.limit = (var7 + this.limit) % this.capacity;
			}
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1918735565"
	)
	static final boolean method6702(char var0) {
		if (Character.isISOControl(var0)) {
			return false;
		} else if (class78.isAlphaNumeric(var0)) {
			return true;
		} else {
			char[] var1 = class424.field4621;

			int var2;
			char var3;
			for (var2 = 0; var2 < var1.length; ++var2) {
				var3 = var1[var2];
				if (var0 == var3) {
					return true;
				}
			}

			var1 = class424.field4623;

			for (var2 = 0; var2 < var1.length; ++var2) {
				var3 = var1[var2];
				if (var0 == var3) {
					return true;
				}
			}

			return false;
		}
	}
}
