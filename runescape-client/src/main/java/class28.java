import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("am")
public class class28 {
	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	@Export("spriteIds")
	static GraphicsDefaults spriteIds;
	@ObfuscatedName("jy")
	@ObfuscatedGetter(
		intValue = -428607811
	)
	@Export("oculusOrbFocalPointY")
	static int oculusOrbFocalPointY;

	static {
		ImageIO.setUseCache(false);
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Llp;IS)Z",
		garbageValue = "6502"
	)
	static boolean method374(AbstractArchive var0, int var1) {
		byte[] var2 = var0.takeFileFlat(var1);
		if (var2 == null) {
			return false;
		} else {
			RouteStrategy.SpriteBuffer_decode(var2);
			return true;
		}
	}

	@ObfuscatedName("lj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)V",
		garbageValue = "-55"
	)
	@Export("findItemDefinitions")
	static void findItemDefinitions(String var0, boolean var1) {
		var0 = var0.toLowerCase();
		short[] var2 = new short[16];
		int var3 = 0;

		for (int var4 = 0; var4 < ItemContainer.ItemDefinition_fileCount; ++var4) {
			ItemComposition var9 = FileSystem.ItemDefinition_get(var4);
			if ((!var1 || var9.isTradable) && var9.noteTemplate == -1 && var9.name.toLowerCase().indexOf(var0) != -1) {
				if (var3 >= 250) {
					UserComparator9.foundItemIdCount = -1;
					class182.foundItemIds = null;
					return;
				}

				if (var3 >= var2.length) {
					short[] var6 = new short[var2.length * 2];

					for (int var7 = 0; var7 < var3; ++var7) {
						var6[var7] = var2[var7];
					}

					var2 = var6;
				}

				var2[var3++] = (short)var4;
			}
		}

		class182.foundItemIds = var2;
		Coord.foundItemIndex = 0;
		UserComparator9.foundItemIdCount = var3;
		String[] var8 = new String[UserComparator9.foundItemIdCount];

		for (int var5 = 0; var5 < UserComparator9.foundItemIdCount; ++var5) {
			var8[var5] = FileSystem.ItemDefinition_get(var2[var5]).name;
		}

		short[] var10 = class182.foundItemIds;
		Occluder.sortItemsByName(var8, var10, 0, var8.length - 1);
	}
}
