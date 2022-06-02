import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bw")
@Implements("ItemContainer")
public class ItemContainer extends Node {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lpv;"
	)
	@Export("itemContainers")
	static NodeHashTable itemContainers;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1933505575
	)
	@Export("ItemDefinition_fileCount")
	public static int ItemDefinition_fileCount;
	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("archive20")
	static Archive archive20;
	@ObfuscatedName("q")
	@Export("ids")
	int[] ids;
	@ObfuscatedName("l")
	@Export("quantities")
	int[] quantities;

	static {
		itemContainers = new NodeHashTable(32);
	}

	ItemContainer() {
		this.ids = new int[]{-1};
		this.quantities = new int[]{0};
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Llp;IIB)[Lqd;",
		garbageValue = "123"
	)
	public static IndexedSprite[] method2062(AbstractArchive var0, int var1, int var2) {
		if (!Nameable.SpriteBuffer_loadSpritesFromArchive(var0, var1, var2)) {
			return null;
		} else {
			IndexedSprite[] var4 = new IndexedSprite[class453.SpriteBuffer_spriteCount];

			for (int var5 = 0; var5 < class453.SpriteBuffer_spriteCount; ++var5) {
				IndexedSprite var6 = var4[var5] = new IndexedSprite();
				var6.width = class453.SpriteBuffer_spriteWidth;
				var6.height = class453.SpriteBuffer_spriteHeight;
				var6.xOffset = class453.SpriteBuffer_xOffsets[var5];
				var6.yOffset = class453.SpriteBuffer_yOffsets[var5];
				var6.subWidth = ScriptFrame.SpriteBuffer_spriteWidths[var5];
				var6.subHeight = class453.SpriteBuffer_spriteHeights[var5];
				var6.palette = Decimator.SpriteBuffer_spritePalette;
				var6.pixels = class127.SpriteBuffer_pixels[var5];
			}

			VarcInt.method3325();
			return var4;
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)[Lda;",
		garbageValue = "-726850383"
	)
	static class119[] method2060() {
		return new class119[]{class119.field1508, class119.field1512, class119.field1502, class119.field1516, class119.field1518, class119.field1521, class119.field1506, class119.field1507, class119.field1500, class119.field1509, class119.field1510, class119.field1511, class119.field1503, class119.field1513, class119.field1514, class119.field1515, class119.field1504};
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1192606922"
	)
	public static int method2059(int var0) {
		if (var0 > 0) {
			return 1;
		} else {
			return var0 < 0 ? -1 : 0;
		}
	}

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "358850975"
	)
	static final void method2061(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) {
			if (Client.rootWidgetWidths[var4] + Client.rootWidgetXs[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetYs[var4] + Client.rootWidgetHeights[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) {
				Client.field704[var4] = true;
			}
		}

	}
}
