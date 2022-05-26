import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hx")
@Implements("GameObject")
public final class GameObject {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -942035955
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -97756121
	)
	@Export("height")
	int height;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 174940337
	)
	@Export("centerX")
	int centerX;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 474371985
	)
	@Export("centerY")
	int centerY;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lgx;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -178209059
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1571383405
	)
	@Export("startX")
	int startX;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1260565151
	)
	@Export("endX")
	int endX;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1892090883
	)
	@Export("startY")
	int startY;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1693444283
	)
	@Export("endY")
	int endY;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -986708627
	)
	int field2697;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -24170279
	)
	@Export("lastDrawn")
	int lastDrawn;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		longValue = 9002525375587932575L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -304681645
	)
	@Export("flags")
	int flags;

	GameObject() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Lbb;",
		garbageValue = "1"
	)
	@Export("getWorldMapScript")
	static Script getWorldMapScript(int var0, int var1, int var2) {
		int var3 = PcmPlayer.method744(var1, var0);
		Script var5 = (Script)Script.Script_cached.get((long)(var3 << 16));
		Script var4;
		if (var5 != null) {
			var4 = var5;
		} else {
			String var6 = String.valueOf(var3);
			int var7 = class115.archive12.getGroupId(var6);
			if (var7 == -1) {
				var4 = null;
			} else {
				label59: {
					byte[] var8 = class115.archive12.takeFileFlat(var7);
					if (var8 != null) {
						if (var8.length <= 1) {
							var4 = null;
							break label59;
						}

						var5 = PcmPlayer.newScript(var8);
						if (var5 != null) {
							Script.Script_cached.put(var5, (long)(var3 << 16));
							var4 = var5;
							break label59;
						}
					}

					var4 = null;
				}
			}
		}

		if (var4 != null) {
			return var4;
		} else {
			int var12 = (-3 - var2 << 8) + var0;
			Script var14 = (Script)Script.Script_cached.get((long)(var12 << 16));
			Script var13;
			if (var14 != null) {
				var13 = var14;
			} else {
				String var9 = String.valueOf(var12);
				int var10 = class115.archive12.getGroupId(var9);
				if (var10 == -1) {
					var13 = null;
				} else {
					byte[] var11 = class115.archive12.takeFileFlat(var10);
					if (var11 != null) {
						if (var11.length <= 1) {
							var13 = null;
							return var13 != null ? var13 : null;
						}

						var14 = PcmPlayer.newScript(var11);
						if (var14 != null) {
							Script.Script_cached.put(var14, (long)(var12 << 16));
							var13 = var14;
							return var13 != null ? var13 : null;
						}
					}

					var13 = null;
				}
			}

			return var13 != null ? var13 : null;
		}
	}
}
