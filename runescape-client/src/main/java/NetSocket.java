import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fr")
@Implements("NetSocket")
public final class NetSocket extends AbstractSocket implements Runnable {
	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		signature = "Lfl;"
	)
	@Export("socketTask")
	static Task socketTask;
	@ObfuscatedName("n")
	@Export("inputStream")
	InputStream inputStream;
	@ObfuscatedName("v")
	@Export("outputStream")
	OutputStream outputStream;
	@ObfuscatedName("d")
	@Export("socket")
	Socket socket;
	@ObfuscatedName("c")
	@Export("isClosed")
	boolean isClosed;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		signature = "Lfu;"
	)
	@Export("taskHandler")
	TaskHandler taskHandler;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "Lfl;"
	)
	@Export("task")
	Task task;
	@ObfuscatedName("z")
	@Export("outBuffer")
	byte[] outBuffer;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -80175503
	)
	@Export("outLength")
	int outLength;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -502445773
	)
	@Export("outOffset")
	int outOffset;
	@ObfuscatedName("l")
	@Export("exceptionWriting")
	boolean exceptionWriting;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1447892009
	)
	@Export("bufferLength")
	final int bufferLength;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1889811971
	)
	@Export("maxPacketLength")
	final int maxPacketLength;

	@ObfuscatedSignature(
		signature = "(Ljava/net/Socket;Lfu;I)V"
	)
	public NetSocket(Socket var1, TaskHandler var2, int var3) throws IOException {
		this.isClosed = false;
		this.outLength = 0;
		this.outOffset = 0;
		this.exceptionWriting = false;
		this.taskHandler = var2;
		this.socket = var1;
		this.bufferLength = var3;
		this.maxPacketLength = var3 - 100;
		this.socket.setSoTimeout(30000);
		this.socket.setTcpNoDelay(true);
		this.socket.setReceiveBufferSize(65536);
		this.socket.setSendBufferSize(65536);
		this.inputStream = this.socket.getInputStream();
		this.outputStream = this.socket.getOutputStream();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		garbageValue = "136255387",
		signature = "(I)V"
	)
	@Export("close")
	public void close() {
		if (!this.isClosed) {
			synchronized(this) {
				this.isClosed = true;
				this.notifyAll();
			}

			if (this.task != null) {
				while (this.task.status == 0) {
					ApproximateRouteStrategy.method1311(1L);
				}

				if (this.task.status == 1) {
					try {
						((Thread)this.task.result).join();
					} catch (InterruptedException var3) {
					}
				}
			}

			this.task = null;
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		garbageValue = "-29",
		signature = "(B)I"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() throws IOException {
		return this.isClosed ? 0 : this.inputStream.read();
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		garbageValue = "1",
		signature = "(B)I"
	)
	@Export("available")
	public int available() throws IOException {
		return this.isClosed ? 0 : this.inputStream.available();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		garbageValue = "1621767276",
		signature = "(II)Z"
	)
	@Export("isAvailable")
	public boolean isAvailable(int var1) throws IOException {
		if (this.isClosed) {
			return false;
		} else {
			return this.inputStream.available() >= var1;
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		garbageValue = "-127",
		signature = "([BIIB)I"
	)
	@Export("read")
	public int read(byte[] var1, int var2, int var3) throws IOException {
		if (this.isClosed) {
			return 0;
		} else {
			int var4;
			int var5;
			for (var4 = var3; var3 > 0; var3 -= var5) {
				var5 = this.inputStream.read(var1, var2, var3);
				if (var5 <= 0) {
					throw new EOFException();
				}

				var2 += var5;
			}

			return var4;
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "-2045267371",
		signature = "([BIII)V"
	)
	@Export("write0")
	void write0(byte[] var1, int var2, int var3) throws IOException {
		if (!this.isClosed) {
			if (this.exceptionWriting) {
				this.exceptionWriting = false;
				throw new IOException();
			} else {
				if (this.outBuffer == null) {
					this.outBuffer = new byte[this.bufferLength];
				}

				synchronized(this) {
					for (int var5 = 0; var5 < var3; ++var5) {
						this.outBuffer[this.outOffset] = var1[var5 + var2];
						this.outOffset = (this.outOffset + 1) % this.bufferLength;
						if ((this.maxPacketLength + this.outLength) % this.bufferLength == this.outOffset) {
							throw new IOException();
						}
					}

					if (this.task == null) {
						this.task = this.taskHandler.newThreadTask(this, 3);
					}

					this.notifyAll();
				}
			}
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		garbageValue = "1032488862",
		signature = "([BIII)V"
	)
	@Export("write")
	public void write(byte[] var1, int var2, int var3) throws IOException {
		this.write0(var1, var2, var3);
	}

	protected void finalize() {
		this.close();
	}

	public void run() {
		try {
			while (true) {
				label84: {
					int var1;
					int var2;
					synchronized(this) {
						if (this.outOffset == this.outLength) {
							if (this.isClosed) {
								break label84;
							}

							try {
								this.wait();
							} catch (InterruptedException var10) {
							}
						}

						var2 = this.outLength;
						if (this.outOffset >= this.outLength) {
							var1 = this.outOffset - this.outLength;
						} else {
							var1 = this.bufferLength - this.outLength;
						}
					}

					if (var1 <= 0) {
						continue;
					}

					try {
						this.outputStream.write(this.outBuffer, var2, var1);
					} catch (IOException var9) {
						this.exceptionWriting = true;
					}

					this.outLength = (var1 + this.outLength) % this.bufferLength;

					try {
						if (this.outLength == this.outOffset) {
							this.outputStream.flush();
						}
					} catch (IOException var8) {
						this.exceptionWriting = true;
					}
					continue;
				}

				try {
					if (this.inputStream != null) {
						this.inputStream.close();
					}

					if (this.outputStream != null) {
						this.outputStream.close();
					}

					if (this.socket != null) {
						this.socket.close();
					}
				} catch (IOException var7) {
				}

				this.outBuffer = null;
				break;
			}
		} catch (Exception var12) {
			SequenceDefinition.RunException_sendStackTrace((String)null, var12);
		}

	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		garbageValue = "-3619",
		signature = "(S)V"
	)
	static final void method3748() {
		class300.method5473("You can't add yourself to your own ignore list");
	}
}
