import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nz")
@Implements("Ignored")
public class Ignored extends Nameable {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 157062685
	)
	@Export("id")
	int id;

	Ignored() {
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lnz;B)I",
		garbageValue = "0"
	)
	@Export("compareTo_ignored")
	int compareTo_ignored(Ignored var1) {
		return this.id - var1.id;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lnb;I)I",
		garbageValue = "434999779"
	)
	@Export("compareTo_user")
	public int compareTo_user(Nameable var1) {
		return this.compareTo_ignored((Ignored)var1);
	}

	public int compareTo(Object var1) {
		return this.compareTo_ignored((Ignored)var1);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "([FIFI)F",
		garbageValue = "-1881391939"
	)
	static float method6616(float[] var0, int var1, float var2) {
		float var3 = var0[var1];

		for (int var4 = var1 - 1; var4 >= 0; --var4) {
			var3 = var2 * var3 + var0[var4];
		}

		return var3;
	}
}
