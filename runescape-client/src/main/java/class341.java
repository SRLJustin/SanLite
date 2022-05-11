import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ms")
public class class341 {
	@ObfuscatedName("o")
	@Export("cp1252AsciiExtension")
	public static final char[] cp1252AsciiExtension;

	static {
		cp1252AsciiExtension = new char[]{'€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ'};
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(FFFF[FB)V",
		garbageValue = "1"
	)
	static void method6090(float var0, float var1, float var2, float var3, float[] var4) {
		float var5 = var1 - var0;
		float var6 = var2 - var1;
		float var7 = var3 - var2;
		float var8 = var6 - var5;
		var4[3] = var7 - var6 - var8;
		var4[2] = var8 + var8 + var8;
		var4[1] = var5 + var5 + var5;
		var4[0] = var0;
	}
}
