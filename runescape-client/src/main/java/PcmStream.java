import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("di")
@Implements("PcmStream")
public abstract class PcmStream extends Node {
	@ObfuscatedName("w")
	@Export("active")
	volatile boolean active;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "Ldi;"
	)
	@Export("after")
	PcmStream after;
	@ObfuscatedName("b")
	int field1508;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		signature = "Ldg;"
	)
	@Export("sound")
	AbstractSound sound;

	protected PcmStream() {
		this.active = true;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "()Ldi;"
	)
	@Export("firstSubStream")
	protected abstract PcmStream firstSubStream();

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "()Ldi;"
	)
	@Export("nextSubStream")
	protected abstract PcmStream nextSubStream();

	@ObfuscatedName("p")
	protected abstract int vmethod3927();

	@ObfuscatedName("l")
	@Export("fill")
	protected abstract void fill(int[] var1, int var2, int var3);

	@ObfuscatedName("u")
	@Export("skip")
	protected abstract void skip(int var1);

	@ObfuscatedName("ay")
	int vmethod2800() {
		return 255;
	}

	@ObfuscatedName("fh")
	@Export("update")
	final void update(int[] var1, int var2, int var3) {
		if (this.active) {
			this.fill(var1, var2, var3);
		} else {
			this.skip(var3);
		}

	}
}
