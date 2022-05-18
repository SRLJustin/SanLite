import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ls")
public class class327 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	static final class327 field4110;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	static final class327 field4108;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	static final class327 field4109;

	static {
		field4110 = new class327();
		field4108 = new class327();
		field4109 = new class327();
	}

	class327() {
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1970190123"
	)
	static final int method5869(int var0, int var1) {
		int var2 = var0 + var1 * 57;
		var2 ^= var2 << 13;
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 255;
	}
}
