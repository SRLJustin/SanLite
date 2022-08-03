import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ml")
public class class344 {
	@ObfuscatedName("vj")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("worldMap")
	static WorldMap worldMap;
	@ObfuscatedName("fe")
	static String field4179;

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IILgh;Lgr;B)Z",
		garbageValue = "-94"
	)
	public static final boolean method6344(int var0, int var1, RouteStrategy var2, CollisionMap var3) {
		int var4 = var0;
		int var5 = var1;
		byte var6 = 64;
		byte var7 = 64;
		int var8 = var0 - var6;
		int var9 = var1 - var7;
		class193.directions[var6][var7] = 99;
		class193.distances[var6][var7] = 0;
		byte var10 = 0;
		int var11 = 0;
		class193.bufferX[var10] = var0;
		byte var10001 = var10;
		int var18 = var10 + 1;
		class193.bufferY[var10001] = var1;
		int[][] var12 = var3.flags;

		while (var11 != var18) {
			var4 = class193.bufferX[var11];
			var5 = class193.bufferY[var11];
			var11 = var11 + 1 & 4095;
			int var16 = var4 - var8;
			int var17 = var5 - var9;
			int var13 = var4 - var3.xInset;
			int var14 = var5 - var3.yInset;
			if (var2.hasArrived(1, var4, var5, var3)) {
				class352.field4222 = var4;
				DirectByteArrayCopier.field3302 = var5;
				return true;
			}

			int var15 = class193.distances[var16][var17] + 1;
			if (var16 > 0 && class193.directions[var16 - 1][var17] == 0 && (var12[var13 - 1][var14] & 19136776) == 0) {
				class193.bufferX[var18] = var4 - 1;
				class193.bufferY[var18] = var5;
				var18 = var18 + 1 & 4095;
				class193.directions[var16 - 1][var17] = 2;
				class193.distances[var16 - 1][var17] = var15;
			}

			if (var16 < 127 && class193.directions[var16 + 1][var17] == 0 && (var12[var13 + 1][var14] & 19136896) == 0) {
				class193.bufferX[var18] = var4 + 1;
				class193.bufferY[var18] = var5;
				var18 = var18 + 1 & 4095;
				class193.directions[var16 + 1][var17] = 8;
				class193.distances[var16 + 1][var17] = var15;
			}

			if (var17 > 0 && class193.directions[var16][var17 - 1] == 0 && (var12[var13][var14 - 1] & 19136770) == 0) {
				class193.bufferX[var18] = var4;
				class193.bufferY[var18] = var5 - 1;
				var18 = var18 + 1 & 4095;
				class193.directions[var16][var17 - 1] = 1;
				class193.distances[var16][var17 - 1] = var15;
			}

			if (var17 < 127 && class193.directions[var16][var17 + 1] == 0 && (var12[var13][var14 + 1] & 19136800) == 0) {
				class193.bufferX[var18] = var4;
				class193.bufferY[var18] = var5 + 1;
				var18 = var18 + 1 & 4095;
				class193.directions[var16][var17 + 1] = 4;
				class193.distances[var16][var17 + 1] = var15;
			}

			if (var16 > 0 && var17 > 0 && class193.directions[var16 - 1][var17 - 1] == 0 && (var12[var13 - 1][var14 - 1] & 19136782) == 0 && (var12[var13 - 1][var14] & 19136776) == 0 && (var12[var13][var14 - 1] & 19136770) == 0) {
				class193.bufferX[var18] = var4 - 1;
				class193.bufferY[var18] = var5 - 1;
				var18 = var18 + 1 & 4095;
				class193.directions[var16 - 1][var17 - 1] = 3;
				class193.distances[var16 - 1][var17 - 1] = var15;
			}

			if (var16 < 127 && var17 > 0 && class193.directions[var16 + 1][var17 - 1] == 0 && (var12[var13 + 1][var14 - 1] & 19136899) == 0 && (var12[var13 + 1][var14] & 19136896) == 0 && (var12[var13][var14 - 1] & 19136770) == 0) {
				class193.bufferX[var18] = var4 + 1;
				class193.bufferY[var18] = var5 - 1;
				var18 = var18 + 1 & 4095;
				class193.directions[var16 + 1][var17 - 1] = 9;
				class193.distances[var16 + 1][var17 - 1] = var15;
			}

			if (var16 > 0 && var17 < 127 && class193.directions[var16 - 1][var17 + 1] == 0 && (var12[var13 - 1][var14 + 1] & 19136824) == 0 && (var12[var13 - 1][var14] & 19136776) == 0 && (var12[var13][var14 + 1] & 19136800) == 0) {
				class193.bufferX[var18] = var4 - 1;
				class193.bufferY[var18] = var5 + 1;
				var18 = var18 + 1 & 4095;
				class193.directions[var16 - 1][var17 + 1] = 6;
				class193.distances[var16 - 1][var17 + 1] = var15;
			}

			if (var16 < 127 && var17 < 127 && class193.directions[var16 + 1][var17 + 1] == 0 && (var12[var13 + 1][var14 + 1] & 19136992) == 0 && (var12[var13 + 1][var14] & 19136896) == 0 && (var12[var13][var14 + 1] & 19136800) == 0) {
				class193.bufferX[var18] = var4 + 1;
				class193.bufferY[var18] = var5 + 1;
				var18 = var18 + 1 & 4095;
				class193.directions[var16 + 1][var17 + 1] = 12;
				class193.distances[var16 + 1][var17 + 1] = var15;
			}
		}

		class352.field4222 = var4;
		DirectByteArrayCopier.field3302 = var5;
		return false;
	}
}
