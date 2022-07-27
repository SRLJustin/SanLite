import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fy")
public class class167 {
	@ObfuscatedName("f")
	public short[] field1802;
	@ObfuscatedName("u")
	public short[] field1805;

	public class167(int var1) {
		ItemComposition var2 = class258.ItemDefinition_get(var1);
		if (var2.method3716()) {
			this.field1802 = new short[var2.recolorTo.length];
			System.arraycopy(var2.recolorTo, 0, this.field1802, 0, this.field1802.length);
		}

		if (var2.method3731()) {
			this.field1805 = new short[var2.retextureTo.length];
			System.arraycopy(var2.retextureTo, 0, this.field1805, 0, this.field1805.length);
		}

	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(CLlj;B)I",
		garbageValue = "37"
	)
	@Export("lowercaseChar")
	static int lowercaseChar(char var0, Language var1) {
		int var2 = var0 << 4;
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
			var0 = Character.toLowerCase(var0);
			var2 = (var0 << 4) + 1;
		}

		if (var0 == 241 && var1 == Language.Language_ES) {
			var2 = 1762;
		}

		return var2;
	}
}
