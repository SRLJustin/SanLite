import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fe")
@Implements("VarcInt")
public class VarcInt extends DualNode {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("VarcInt_archive")
	public static AbstractArchive VarcInt_archive;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("VarcInt_cached")
	public static EvictingDualNodeHashTable VarcInt_cached;
	@ObfuscatedName("l")
	@Export("persist")
	public boolean persist;

	static {
		VarcInt_cached = new EvictingDualNodeHashTable(64);
	}

	public VarcInt() {
		this.persist = false;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)V",
		garbageValue = "-2122743256"
	)
	public void method3315(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.method3316(var1, var2);
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lpx;IS)V",
		garbageValue = "223"
	)
	void method3316(Buffer var1, int var2) {
		if (var2 == 2) {
			this.persist = true;
		}

	}

	@ObfuscatedName("q")
	static boolean method3323(long var0) {
		return class357.method6392(var0) == 2;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1980570860"
	)
	public static int method3324(int var0) {
		var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765);
		var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459);
		var0 = var0 + (var0 >>> 4) & 252645135;
		var0 += var0 >>> 8;
		var0 += var0 >>> 16;
		return var0 & 255;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IIIZIZI)V",
		garbageValue = "447479880"
	)
	@Export("doWorldSorting")
	static void doWorldSorting(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) {
			int var6 = (var0 + var1) / 2;
			int var7 = var0;
			World var8 = World.World_worlds[var6];
			World.World_worlds[var6] = World.World_worlds[var1];
			World.World_worlds[var1] = var8;

			for (int var9 = var0; var9 < var1; ++var9) {
				World var11 = World.World_worlds[var9];
				int var12 = KeyHandler.compareWorlds(var11, var8, var2, var3);
				int var10;
				if (var12 != 0) {
					if (var3) {
						var10 = -var12;
					} else {
						var10 = var12;
					}
				} else if (var4 == -1) {
					var10 = 0;
				} else {
					int var13 = KeyHandler.compareWorlds(var11, var8, var4, var5);
					if (var5) {
						var10 = -var13;
					} else {
						var10 = var13;
					}
				}

				if (var10 <= 0) {
					World var14 = World.World_worlds[var9];
					World.World_worlds[var9] = World.World_worlds[var7];
					World.World_worlds[var7++] = var14;
				}
			}

			World.World_worlds[var1] = World.World_worlds[var7];
			World.World_worlds[var7] = var8;
			doWorldSorting(var0, var7 - 1, var2, var3, var4, var5);
			doWorldSorting(var7 + 1, var1, var2, var3, var4, var5);
		}

	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1070094417"
	)
	public static void method3321() {
		FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear();
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-396189333"
	)
	public static void method3325() {
		class453.SpriteBuffer_xOffsets = null;
		class453.SpriteBuffer_yOffsets = null;
		ScriptFrame.SpriteBuffer_spriteWidths = null;
		class453.SpriteBuffer_spriteHeights = null;
		Decimator.SpriteBuffer_spritePalette = null;
		class127.SpriteBuffer_pixels = null;
	}

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(IIIILqr;Lka;B)V",
		garbageValue = "-10"
	)
	@Export("worldToMinimap")
	static final void worldToMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		int var6 = var3 * var3 + var2 * var2;
		if (var6 > 4225 && var6 < 90000) {
			int var7 = Client.camAngleY & 2047;
			int var8 = Rasterizer3D.Rasterizer3D_sine[var7];
			int var9 = Rasterizer3D.Rasterizer3D_cosine[var7];
			int var10 = var9 * var2 + var3 * var8 >> 16;
			int var11 = var3 * var9 - var8 * var2 >> 16;
			double var12 = Math.atan2((double)var10, (double)var11);
			int var14 = var5.width / 2 - 25;
			int var15 = (int)(Math.sin(var12) * (double)var14);
			int var16 = (int)(Math.cos(var12) * (double)var14);
			byte var17 = 20;
			class344.redHintArrowSprite.method7992(var15 + (var0 + var5.width / 2 - var17 / 2), var5.height / 2 + var1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
		} else {
			PcmPlayer.drawSpriteOnMinimap(var0, var1, var2, var3, var4, var5);
		}

	}
}
