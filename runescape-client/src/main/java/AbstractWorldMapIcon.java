import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iw")
@Implements("AbstractWorldMapIcon")
public abstract class AbstractWorldMapIcon {
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("coord2")
	public final Coord coord2;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("coord1")
	public final Coord coord1;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1792317661
	)
	@Export("screenX")
	int screenX;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1102368635
	)
	@Export("screenY")
	int screenY;

	@ObfuscatedSignature(
		descriptor = "(Lkd;Lkd;)V"
	)
	AbstractWorldMapIcon(Coord var1, Coord var2) {
		this.coord1 = var1;
		this.coord2 = var2;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "16"
	)
	@Export("getElement")
	public abstract int getElement();

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Lip;",
		garbageValue = "1420245554"
	)
	@Export("getLabel")
	abstract WorldMapLabel getLabel();

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "102"
	)
	@Export("getSubWidth")
	abstract int getSubWidth();

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1663406998"
	)
	@Export("getSubHeight")
	abstract int getSubHeight();

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "2104661633"
	)
	@Export("fitsScreen")
	boolean fitsScreen(int var1, int var2) {
		if (this.elementFitsScreen(var1, var2)) {
			return true;
		} else {
			return this.labelFitsScreen(var1, var2);
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1482741220"
	)
	@Export("hasValidElement")
	boolean hasValidElement() {
		return this.getElement() >= 0;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "19"
	)
	@Export("elementFitsScreen")
	boolean elementFitsScreen(int var1, int var2) {
		if (!this.hasValidElement()) {
			return false;
		} else {
			WorldMapElement var3 = class120.WorldMapElement_get(this.getElement());
			int var4 = this.getSubWidth();
			int var5 = this.getSubHeight();
			switch(var3.horizontalAlignment.value) {
			case 0:
				if (var1 >= this.screenX - var4 / 2 && var1 <= var4 / 2 + this.screenX) {
					break;
				}

				return false;
			case 1:
				if (var1 >= this.screenX && var1 < var4 + this.screenX) {
					break;
				}

				return false;
			case 2:
				if (var1 <= this.screenX - var4 || var1 > this.screenX) {
					return false;
				}
			}

			switch(var3.verticalAlignment.value) {
			case 0:
				if (var2 > this.screenY - var5 && var2 <= this.screenY) {
					break;
				}

				return false;
			case 1:
				if (var2 >= this.screenY - var5 / 2 && var2 <= var5 / 2 + this.screenY) {
					break;
				}

				return false;
			case 2:
				if (var2 < this.screenY || var2 >= var5 + this.screenY) {
					return false;
				}
			}

			return true;
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "49"
	)
	@Export("labelFitsScreen")
	boolean labelFitsScreen(int var1, int var2) {
		WorldMapLabel var3 = this.getLabel();
		if (var3 == null) {
			return false;
		} else if (var1 >= this.screenX - var3.width / 2 && var1 <= var3.width / 2 + this.screenX) {
			return var2 >= this.screenY && var2 <= this.screenY + var3.height;
		} else {
			return false;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IILgw;Lgh;S)Z",
		garbageValue = "128"
	)
	public static final boolean method4863(int var0, int var1, RouteStrategy var2, CollisionMap var3) {
		int var4 = var0;
		int var5 = var1;
		byte var6 = 64;
		byte var7 = 64;
		int var8 = var0 - var6;
		int var9 = var1 - var7;
		class194.directions[var6][var7] = 99;
		class194.distances[var6][var7] = 0;
		byte var10 = 0;
		int var11 = 0;
		class194.bufferX[var10] = var0;
		byte var10001 = var10;
		int var18 = var10 + 1;
		class194.bufferY[var10001] = var1;
		int[][] var12 = var3.flags;

		while (var18 != var11) {
			var4 = class194.bufferX[var11];
			var5 = class194.bufferY[var11];
			var11 = var11 + 1 & 4095;
			int var16 = var4 - var8;
			int var17 = var5 - var9;
			int var13 = var4 - var3.xInset;
			int var14 = var5 - var3.yInset;
			if (var2.hasArrived(1, var4, var5, var3)) {
				Varps.field3348 = var4;
				class194.field2255 = var5;
				return true;
			}

			int var15 = class194.distances[var16][var17] + 1;
			if (var16 > 0 && class194.directions[var16 - 1][var17] == 0 && (var12[var13 - 1][var14] & 19136776) == 0) {
				class194.bufferX[var18] = var4 - 1;
				class194.bufferY[var18] = var5;
				var18 = var18 + 1 & 4095;
				class194.directions[var16 - 1][var17] = 2;
				class194.distances[var16 - 1][var17] = var15;
			}

			if (var16 < 127 && class194.directions[var16 + 1][var17] == 0 && (var12[var13 + 1][var14] & 19136896) == 0) {
				class194.bufferX[var18] = var4 + 1;
				class194.bufferY[var18] = var5;
				var18 = var18 + 1 & 4095;
				class194.directions[var16 + 1][var17] = 8;
				class194.distances[var16 + 1][var17] = var15;
			}

			if (var17 > 0 && class194.directions[var16][var17 - 1] == 0 && (var12[var13][var14 - 1] & 19136770) == 0) {
				class194.bufferX[var18] = var4;
				class194.bufferY[var18] = var5 - 1;
				var18 = var18 + 1 & 4095;
				class194.directions[var16][var17 - 1] = 1;
				class194.distances[var16][var17 - 1] = var15;
			}

			if (var17 < 127 && class194.directions[var16][var17 + 1] == 0 && (var12[var13][var14 + 1] & 19136800) == 0) {
				class194.bufferX[var18] = var4;
				class194.bufferY[var18] = var5 + 1;
				var18 = var18 + 1 & 4095;
				class194.directions[var16][var17 + 1] = 4;
				class194.distances[var16][var17 + 1] = var15;
			}

			if (var16 > 0 && var17 > 0 && class194.directions[var16 - 1][var17 - 1] == 0 && (var12[var13 - 1][var14 - 1] & 19136782) == 0 && (var12[var13 - 1][var14] & 19136776) == 0 && (var12[var13][var14 - 1] & 19136770) == 0) {
				class194.bufferX[var18] = var4 - 1;
				class194.bufferY[var18] = var5 - 1;
				var18 = var18 + 1 & 4095;
				class194.directions[var16 - 1][var17 - 1] = 3;
				class194.distances[var16 - 1][var17 - 1] = var15;
			}

			if (var16 < 127 && var17 > 0 && class194.directions[var16 + 1][var17 - 1] == 0 && (var12[var13 + 1][var14 - 1] & 19136899) == 0 && (var12[var13 + 1][var14] & 19136896) == 0 && (var12[var13][var14 - 1] & 19136770) == 0) {
				class194.bufferX[var18] = var4 + 1;
				class194.bufferY[var18] = var5 - 1;
				var18 = var18 + 1 & 4095;
				class194.directions[var16 + 1][var17 - 1] = 9;
				class194.distances[var16 + 1][var17 - 1] = var15;
			}

			if (var16 > 0 && var17 < 127 && class194.directions[var16 - 1][var17 + 1] == 0 && (var12[var13 - 1][var14 + 1] & 19136824) == 0 && (var12[var13 - 1][var14] & 19136776) == 0 && (var12[var13][var14 + 1] & 19136800) == 0) {
				class194.bufferX[var18] = var4 - 1;
				class194.bufferY[var18] = var5 + 1;
				var18 = var18 + 1 & 4095;
				class194.directions[var16 - 1][var17 + 1] = 6;
				class194.distances[var16 - 1][var17 + 1] = var15;
			}

			if (var16 < 127 && var17 < 127 && class194.directions[var16 + 1][var17 + 1] == 0 && (var12[var13 + 1][var14 + 1] & 19136992) == 0 && (var12[var13 + 1][var14] & 19136896) == 0 && (var12[var13][var14 + 1] & 19136800) == 0) {
				class194.bufferX[var18] = var4 + 1;
				class194.bufferY[var18] = var5 + 1;
				var18 = var18 + 1 & 4095;
				class194.directions[var16 + 1][var17 + 1] = 12;
				class194.distances[var16 + 1][var17 + 1] = var15;
			}
		}

		Varps.field3348 = var4;
		class194.field2255 = var5;
		return false;
	}

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-94279171"
	)
	@Export("worldToScreen")
	static final void worldToScreen(int var0, int var1, int var2) {
		if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) {
			int var3 = class202.getTileHeight(var0, var1, class128.Client_plane) - var2;
			var0 -= class343.cameraX;
			var3 -= class295.cameraY;
			var1 -= FaceNormal.cameraZ;
			int var4 = Rasterizer3D.Rasterizer3D_sine[GameEngine.cameraPitch];
			int var5 = Rasterizer3D.Rasterizer3D_cosine[GameEngine.cameraPitch];
			int var6 = Rasterizer3D.Rasterizer3D_sine[StudioGame.cameraYaw];
			int var7 = Rasterizer3D.Rasterizer3D_cosine[StudioGame.cameraYaw];
			int var8 = var6 * var1 + var0 * var7 >> 16;
			var1 = var7 * var1 - var0 * var6 >> 16;
			var0 = var8;
			var8 = var5 * var3 - var4 * var1 >> 16;
			var1 = var5 * var1 + var3 * var4 >> 16;
			if (var1 >= 50) {
				Client.viewportTempX = var0 * Client.viewportZoom / var1 + Client.viewportWidth / 2;
				Client.viewportTempY = var8 * Client.viewportZoom / var1 + Client.viewportHeight / 2;
			} else {
				Client.viewportTempX = -1;
				Client.viewportTempY = -1;
			}

		} else {
			Client.viewportTempX = -1;
			Client.viewportTempY = -1;
		}
	}
}
