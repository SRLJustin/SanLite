import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("r")
public class class8 {
	@ObfuscatedName("o")
	final int field29;
	@ObfuscatedName("q")
	final int field30;
	@ObfuscatedName("l")
	final String field31;

	@ObfuscatedSignature(
		descriptor = "(Lpx;)V"
	)
	class8(Buffer var1) {
		this(var1.readUnsignedByte(), var1.readUnsignedByte(), var1.readStringCp1252NullTerminated());
	}

	class8(int var1, int var2, String var3) {
		this.field29 = var1;
		this.field30 = var2;
		this.field31 = var3;
	}

	@ObfuscatedName("o")
	String method60() {
		return Integer.toHexString(this.field29) + Integer.toHexString(this.field30) + this.field31;
	}

	@ObfuscatedName("q")
	int method58() {
		return this.field30;
	}
}
