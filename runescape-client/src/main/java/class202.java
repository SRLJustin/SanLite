import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gb")
public class class202 {
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "[Ldb;"
	)
	class115[] field2406;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1286404393
	)
	int field2405;

	@ObfuscatedSignature(
		descriptor = "(Lpx;I)V"
	)
	class202(Buffer var1, int var2) {
		this.field2406 = new class115[var2];
		this.field2405 = var1.readUnsignedByte();

		for (int var3 = 0; var3 < this.field2406.length; ++var3) {
			class115 var4 = new class115(this.field2405, var1, false);
			this.field2406[var3] = var4;
		}

		this.method3998();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-95"
	)
	void method3998() {
		class115[] var1 = this.field2406;

		for (int var2 = 0; var2 < var1.length; ++var2) {
			class115 var3 = var1[var2];
			if (var3.field1455 >= 0) {
				var3.field1447 = this.field2406[var3.field1455];
			}
		}

	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-911804190"
	)
	public int method4003() {
		return this.field2406.length;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)Ldb;",
		garbageValue = "518391824"
	)
	class115 method3997(int var1) {
		return this.field2406[var1];
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)[Ldb;",
		garbageValue = "-2127910453"
	)
	class115[] method3999() {
		return this.field2406;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lds;II)V",
		garbageValue = "1007899177"
	)
	void method4000(class122 var1, int var2) {
		this.method4014(var1, var2, (boolean[])null, false);
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lds;I[ZZS)V",
		garbageValue = "30105"
	)
	void method4014(class122 var1, int var2, boolean[] var3, boolean var4) {
		int var5 = var1.method2753();
		int var6 = 0;
		class115[] var7 = this.method3999();

		for (int var8 = 0; var8 < var7.length; ++var8) {
			class115 var9 = var7[var8];
			if (var3 == null || var4 == var3[var6]) {
				var1.method2756(var2, var9, var6, var5);
			}

			++var6;
		}

	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZI)I",
		garbageValue = "1525310482"
	)
	static int method4016(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) {
			boolean var3 = false;
			boolean var4 = false;
			int var5 = 0;
			int var6 = var0.length();

			for (int var7 = 0; var7 < var6; ++var7) {
				char var8 = var0.charAt(var7);
				if (var7 == 0) {
					if (var8 == '-') {
						var3 = true;
						continue;
					}

					if (var8 == '+') {
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') {
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') {
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') {
						throw new NumberFormatException();
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) {
					throw new NumberFormatException();
				}

				if (var3) {
					var10 = -var10;
				}

				int var9 = var10 + var5 * var1;
				if (var9 / var1 != var5) {
					throw new NumberFormatException();
				}

				var5 = var9;
				var4 = true;
			}

			if (!var4) {
				throw new NumberFormatException();
			} else {
				return var5;
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "1406158008"
	)
	@Export("getTileHeight")
	static final int getTileHeight(int var0, int var1, int var2) {
		int var3 = var0 >> 7;
		int var4 = var1 >> 7;
		if (var3 >= 0 && var4 >= 0 && var3 <= 103 && var4 <= 103) {
			int var5 = var2;
			if (var2 < 3 && (Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) {
				var5 = var2 + 1;
			}

			int var6 = var0 & 127;
			int var7 = var1 & 127;
			int var8 = (128 - var6) * Tiles.Tiles_heights[var5][var3][var4] + Tiles.Tiles_heights[var5][var3 + 1][var4] * var6 >> 7;
			int var9 = var6 * Tiles.Tiles_heights[var5][var3 + 1][var4 + 1] + Tiles.Tiles_heights[var5][var3][var4 + 1] * (128 - var6) >> 7;
			return var8 * (128 - var7) + var9 * var7 >> 7;
		} else {
			return 0;
		}
	}
}
