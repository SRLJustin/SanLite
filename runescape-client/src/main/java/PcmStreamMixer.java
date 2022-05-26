import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("as")
@Implements("PcmStreamMixer")
public class PcmStreamMixer extends PcmStream {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("subStreams")
	NodeDeque subStreams;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	NodeDeque field254;
	@ObfuscatedName("l")
	int field255;
	@ObfuscatedName("k")
	int field257;

	public PcmStreamMixer() {
		this.subStreams = new NodeDeque();
		this.field254 = new NodeDeque();
		this.field255 = 0;
		this.field257 = -1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lao;)V"
	)
	@Export("addSubStream")
	public final synchronized void addSubStream(PcmStream var1) {
		this.subStreams.addLast(var1);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lao;)V"
	)
	@Export("removeSubStream")
	public final synchronized void removeSubStream(PcmStream var1) {
		var1.remove();
	}

	@ObfuscatedName("l")
	void method605() {
		if (this.field255 > 0) {
			for (PcmStreamMixerListener var1 = (PcmStreamMixerListener)this.field254.last(); var1 != null; var1 = (PcmStreamMixerListener)this.field254.previous()) {
				var1.field396 -= this.field255;
			}

			this.field257 -= this.field255;
			this.field255 = 0;
		}

	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Los;Lat;)V"
	)
	void method629(Node var1, PcmStreamMixerListener var2) {
		while (this.field254.sentinel != var1 && ((PcmStreamMixerListener)var1).field396 <= var2.field396) {
			var1 = var1.previous;
		}

		NodeDeque.NodeDeque_addBefore(var2, var1);
		this.field257 = ((PcmStreamMixerListener)this.field254.sentinel.previous).field396;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lat;)V"
	)
	void method607(PcmStreamMixerListener var1) {
		var1.remove();
		var1.remove2();
		Node var2 = this.field254.sentinel.previous;
		if (var2 == this.field254.sentinel) {
			this.field257 = -1;
		} else {
			this.field257 = ((PcmStreamMixerListener)var2).field396;
		}

	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "()Lao;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return (PcmStream)this.subStreams.last();
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "()Lao;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return (PcmStream)this.subStreams.previous();
	}

	@ObfuscatedName("s")
	protected int vmethod5295() {
		return 0;
	}

	@ObfuscatedName("r")
	@Export("fill")
	public final synchronized void fill(int[] var1, int var2, int var3) {
		do {
			if (this.field257 < 0) {
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			if (var3 + this.field255 < this.field257) {
				this.field255 += var3;
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			int var4 = this.field257 - this.field255;
			this.updateSubStreams(var1, var2, var4);
			var2 += var4;
			var3 -= var4;
			this.field255 += var4;
			this.method605();
			PcmStreamMixerListener var5 = (PcmStreamMixerListener)this.field254.last();
			synchronized(var5) {
				int var7 = var5.update();
				if (var7 < 0) {
					var5.field396 = 0;
					this.method607(var5);
				} else {
					var5.field396 = var7;
					this.method629(var5.previous, var5);
				}
			}
		} while(var3 != 0);

	}

	@ObfuscatedName("v")
	@Export("updateSubStreams")
	void updateSubStreams(int[] var1, int var2, int var3) {
		for (PcmStream var4 = (PcmStream)this.subStreams.last(); var4 != null; var4 = (PcmStream)this.subStreams.previous()) {
			var4.update(var1, var2, var3);
		}

	}

	@ObfuscatedName("y")
	@Export("skip")
	public final synchronized void skip(int var1) {
		do {
			if (this.field257 < 0) {
				this.skipSubStreams(var1);
				return;
			}

			if (this.field255 + var1 < this.field257) {
				this.field255 += var1;
				this.skipSubStreams(var1);
				return;
			}

			int var2 = this.field257 - this.field255;
			this.skipSubStreams(var2);
			var1 -= var2;
			this.field255 += var2;
			this.method605();
			PcmStreamMixerListener var3 = (PcmStreamMixerListener)this.field254.last();
			synchronized(var3) {
				int var5 = var3.update();
				if (var5 < 0) {
					var3.field396 = 0;
					this.method607(var3);
				} else {
					var3.field396 = var5;
					this.method629(var3.previous, var3);
				}
			}
		} while(var1 != 0);

	}

	@ObfuscatedName("c")
	@Export("skipSubStreams")
	void skipSubStreams(int var1) {
		for (PcmStream var2 = (PcmStream)this.subStreams.last(); var2 != null; var2 = (PcmStream)this.subStreams.previous()) {
			var2.skip(var1);
		}

	}
}
