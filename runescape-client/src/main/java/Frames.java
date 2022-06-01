import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gt")
@Implements("Frames")
public class Frames extends DualNode {
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -780977341
	)
	public static int field2492;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "[Lgu;"
	)
	@Export("frames")
	Animation[] frames;

	@ObfuscatedSignature(
		descriptor = "(Llp;Llp;IZ)V",
		garbageValue = "0"
	)
	public Frames(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		NodeDeque var5 = new NodeDeque();
		int var6 = var1.getGroupFileCount(var3);
		this.frames = new Animation[var6];
		int[] var7 = var1.getGroupFileIds(var3);

		for (int var8 = 0; var8 < var7.length; ++var8) {
			byte[] var9 = var1.takeFile(var3, var7[var8]);
			Skeleton var10 = null;
			int var11 = (var9[0] & 255) << 8 | var9[1] & 255;

			for (Skeleton var12 = (Skeleton)var5.last(); var12 != null; var12 = (Skeleton)var5.previous()) {
				if (var11 == var12.id) {
					var10 = var12;
					break;
				}
			}

			if (var10 == null) {
				byte[] var13 = var2.getFile(var11, 0);
				var10 = new Skeleton(var11, var13);
				var5.addFirst(var10);
			}

			this.frames[var7[var8]] = new Animation(var9, var10);
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-15"
	)
	@Export("hasAlphaTransform")
	public boolean hasAlphaTransform(int var1) {
		return this.frames[var1].hasAlphaTransform;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "([BB)Lqr;",
		garbageValue = "7"
	)
	public static final SpritePixels method4217(byte[] var0) {
		BufferedImage var1 = null;

		try {
			Class var2 = ImageIO.class;
			synchronized(ImageIO.class) {
				var1 = ImageIO.read(new ByteArrayInputStream(var0));
			}

			int var6 = var1.getWidth();
			int var7 = var1.getHeight();
			int[] var4 = new int[var7 * var6];
			PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var6, var7, var4, 0, var6);
			var5.grabPixels();
			return new SpritePixels(var4, var6, var7);
		} catch (IOException var9) {
		} catch (InterruptedException var10) {
		}

		return new SpritePixels(0, 0);
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Llp;Ljava/lang/String;Ljava/lang/String;B)[Lqr;",
		garbageValue = "16"
	)
	public static SpritePixels[] method4218(AbstractArchive var0, String var1, String var2) {
		int var3 = var0.getGroupId(var1);
		int var4 = var0.getFileId(var3, var2);
		SpritePixels[] var5;
		if (!Nameable.SpriteBuffer_loadSpritesFromArchive(var0, var3, var4)) {
			var5 = null;
		} else {
			SpritePixels[] var7 = new SpritePixels[class453.SpriteBuffer_spriteCount];

			for (int var8 = 0; var8 < class453.SpriteBuffer_spriteCount; ++var8) {
				SpritePixels var9 = var7[var8] = new SpritePixels();
				var9.width = class453.SpriteBuffer_spriteWidth;
				var9.height = class453.SpriteBuffer_spriteHeight;
				var9.xOffset = class453.SpriteBuffer_xOffsets[var8];
				var9.yOffset = class453.SpriteBuffer_yOffsets[var8];
				var9.subWidth = ScriptFrame.SpriteBuffer_spriteWidths[var8];
				var9.subHeight = class453.SpriteBuffer_spriteHeights[var8];
				int var10 = var9.subHeight * var9.subWidth;
				byte[] var11 = class127.SpriteBuffer_pixels[var8];
				var9.pixels = new int[var10];

				for (int var12 = 0; var12 < var10; ++var12) {
					var9.pixels[var12] = Decimator.SpriteBuffer_spritePalette[var11[var12] & 255];
				}
			}

			VarcInt.method3325();
			var5 = var7;
		}

		return var5;
	}

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "13"
	)
	@Export("updateItemPile")
	static final void updateItemPile(int var0, int var1) {
		NodeDeque var2 = Client.groundItems[class128.Client_plane][var0][var1];
		if (var2 == null) {
			class175.scene.removeGroundItemPile(class128.Client_plane, var0, var1);
		} else {
			long var3 = -99999999L;
			TileItem var5 = null;

			TileItem var6;
			for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) {
				ItemComposition var7 = FileSystem.ItemDefinition_get(var6.id);
				long var11 = (long)var7.price;
				if (var7.isStackable == 1) {
					var11 *= (long)(var6.quantity + 1);
				}

				if (var11 > var3) {
					var3 = var11;
					var5 = var6;
				}
			}

			if (var5 == null) {
				class175.scene.removeGroundItemPile(class128.Client_plane, var0, var1);
			} else {
				var2.addLast(var5);
				TileItem var13 = null;
				TileItem var8 = null;

				for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) {
					if (var6.id != var5.id) {
						if (var13 == null) {
							var13 = var6;
						}

						if (var13.id != var6.id && var8 == null) {
							var8 = var6;
						}
					}
				}

				long var9 = VarbitComposition.calculateTag(var0, var1, 3, false, 0);
				class175.scene.newGroundItemPile(class128.Client_plane, var0, var1, class202.getTileHeight(var0 * 128 + 64, var1 * 128 + 64, class128.Client_plane), var5, var9, var13, var8);
			}
		}
	}
}
