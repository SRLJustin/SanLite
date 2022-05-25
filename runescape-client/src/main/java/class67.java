import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bt")
public class class67 {
	@ObfuscatedName("o")
	static final BigInteger field875;
	@ObfuscatedName("q")
	static final BigInteger field871;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lqd;"
	)
	static IndexedSprite field872;

	static {
		field875 = new BigInteger("10001", 16);
		field871 = new BigInteger("b53e1d1321015e2b89b11477ee53d8352f43919de31343ff871ec92cae904da943010aeeb8026f3499c5850107833d2068992bf58921ee3a16ead4ac3f5b0aba763660bd6e68e45b863c2d6364b1d6faa581596c56c1117caf3f637c8dd223d6272654c304d3de1c13c47ef929a582788a1f9058b01e13082fbe05d69591d05d", 16);
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lpx;IIIIIIB)V",
		garbageValue = "109"
	)
	@Export("loadTerrain")
	static final void loadTerrain(Buffer var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7;
		if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
			Tiles.Tiles_renderFlags[var1][var2][var3] = 0;

			while (true) {
				var7 = var0.readUnsignedByte();
				if (var7 == 0) {
					if (var1 == 0) {
						Tiles.Tiles_heights[0][var2][var3] = -GrandExchangeOfferUnitPriceComparator.method5846(var4 + var2 + 932731, 556238 + var3 + var5) * 8;
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - 240;
					}
					break;
				}

				if (var7 == 1) {
					int var8 = var0.readUnsignedByte();
					if (var8 == 1) {
						var8 = 0;
					}

					if (var1 == 0) {
						Tiles.Tiles_heights[0][var2][var3] = -var8 * 8;
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - var8 * 8;
					}
					break;
				}

				if (var7 <= 49) {
					Tiles.Tiles_overlays[var1][var2][var3] = var0.readByte();
					Tiles.Tiles_shapes[var1][var2][var3] = (byte)((var7 - 2) / 4);
					RunException.field4812[var1][var2][var3] = (byte)(var7 - 2 + var6 & 3);
				} else if (var7 <= 81) {
					Tiles.Tiles_renderFlags[var1][var2][var3] = (byte)(var7 - 49);
				} else {
					Tiles.Tiles_underlays[var1][var2][var3] = (byte)(var7 - 81);
				}
			}
		} else {
			while (true) {
				var7 = var0.readUnsignedByte();
				if (var7 == 0) {
					break;
				}

				if (var7 == 1) {
					var0.readUnsignedByte();
					break;
				}

				if (var7 <= 49) {
					var0.readUnsignedByte();
				}
			}
		}

	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Llp;IB)Lqd;",
		garbageValue = "69"
	)
	public static IndexedSprite method1883(AbstractArchive var0, int var1) {
		if (!class28.method374(var0, var1)) {
			return null;
		} else {
			IndexedSprite var3 = new IndexedSprite();
			var3.width = class453.SpriteBuffer_spriteWidth;
			var3.height = class453.SpriteBuffer_spriteHeight;
			var3.xOffset = class453.SpriteBuffer_xOffsets[0];
			var3.yOffset = class453.SpriteBuffer_yOffsets[0];
			var3.subWidth = ScriptFrame.SpriteBuffer_spriteWidths[0];
			var3.subHeight = class453.SpriteBuffer_spriteHeights[0];
			var3.palette = Decimator.SpriteBuffer_spritePalette;
			var3.pixels = class127.SpriteBuffer_pixels[0];
			VarcInt.method3325();
			return var3;
		}
	}

	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1989518897"
	)
	static final void method1881(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		class12.clientPreferences.method2236(var0);
	}
}
