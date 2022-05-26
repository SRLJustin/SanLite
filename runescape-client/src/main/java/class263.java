import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ja")
public class class263 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	public static final class263 field3071;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	public static final class263 field3058;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	public static final class263 field3060;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	public static final class263 field3062;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	public static final class263 field3068;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	public static final class263 field3063;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	public static final class263 field3059;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	public static final class263 field3064;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	public static final class263 field3066;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	public static final class263 field3067;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("clientLanguage")
	static Language clientLanguage;
	@ObfuscatedName("fq")
	@ObfuscatedGetter(
		intValue = 1922609665
	)
	static int field3070;

	static {
		field3071 = new class263(6);
		field3058 = new class263(7);
		field3060 = new class263(15);
		field3062 = new class263(14);
		field3068 = new class263(4);
		field3063 = new class263(3);
		field3059 = new class263(2);
		field3064 = new class263(5);
		field3066 = new class263(5);
		field3067 = new class263(4);
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "6"
	)
	class263(int var1) {
	}

	@ObfuscatedName("l")
	@Export("base37DecodeLong")
	public static String base37DecodeLong(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) {
			if (var0 % 37L == 0L) {
				return null;
			} else {
				int var2 = 0;

				for (long var3 = var0; var3 != 0L; var3 /= 37L) {
					++var2;
				}

				StringBuilder var5;
				char var8;
				for (var5 = new StringBuilder(var2); var0 != 0L; var5.append(var8)) {
					long var6 = var0;
					var0 /= 37L;
					var8 = class345.base37Table[(int)(var6 - var0 * 37L)];
					if (var8 == '_') {
						int var9 = var5.length() - 1;
						var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
						var8 = 160;
					}
				}

				var5.reverse();
				var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
				return var5.toString();
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "(Lca;ZB)V",
		garbageValue = "-125"
	)
	@Export("addPlayerToScene")
	static void addPlayerToScene(Player var0, boolean var1) {
		if (var0 != null && var0.isVisible() && !var0.isHidden) {
			var0.isUnanimated = false;
			if ((Client.isLowDetail && Players.Players_count > 50 || Players.Players_count > 200) && var1 && var0.idleSequence == var0.movementSequence) {
				var0.isUnanimated = true;
			}

			int var2 = var0.x >> 7;
			int var3 = var0.y >> 7;
			if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
				long var4 = VarbitComposition.calculateTag(0, 0, 0, false, var0.index);
				if (var0.model0 != null && Client.cycle >= var0.animationCycleStart && Client.cycle < var0.animationCycleEnd) {
					var0.isUnanimated = false;
					var0.tileHeight = class202.getTileHeight(var0.x, var0.y, class128.Client_plane);
					var0.playerCycle = Client.cycle;
					class175.scene.addNullableObject(class128.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.minX, var0.minY, var0.maxX, var0.maxY);
				} else {
					if ((var0.x & 127) == 64 && (var0.y & 127) == 64) {
						if (Client.tileLastDrawnActor[var2][var3] == Client.viewportDrawCount) {
							return;
						}

						Client.tileLastDrawnActor[var2][var3] = Client.viewportDrawCount;
					}

					var0.tileHeight = class202.getTileHeight(var0.x, var0.y, class128.Client_plane);
					var0.playerCycle = Client.cycle;
					class175.scene.drawEntity(class128.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.isWalking);
				}
			}
		}

	}
}
