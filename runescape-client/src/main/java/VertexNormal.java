import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hq")
@Implements("VertexNormal")
public class VertexNormal {
	@ObfuscatedName("y")
	@Export("musicTrackBoolean")
	public static boolean musicTrackBoolean;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1611890735
	)
	@Export("x")
	int x;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1317140331
	)
	@Export("y")
	int y;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1313814185
	)
	@Export("z")
	int z;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -140777267
	)
	@Export("magnitude")
	int magnitude;

	VertexNormal() {
	}

	@ObfuscatedSignature(
		descriptor = "(Lhq;)V"
	)
	VertexNormal(VertexNormal var1) {
		this.x = var1.x;
		this.y = var1.y;
		this.z = var1.z;
		this.magnitude = var1.magnitude;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "([BIILgm;[Lgh;I)V",
		garbageValue = "1258473282"
	)
	static final void method4376(byte[] var0, int var1, int var2, Scene var3, CollisionMap[] var4) {
		Buffer var5 = new Buffer(var0);
		int var6 = -1;

		while (true) {
			int var7 = var5.method7531();
			if (var7 == 0) {
				return;
			}

			var6 += var7;
			int var8 = 0;

			while (true) {
				int var9 = var5.readUShortSmart();
				if (var9 == 0) {
					break;
				}

				var8 += var9 - 1;
				int var10 = var8 & 63;
				int var11 = var8 >> 6 & 63;
				int var12 = var8 >> 12;
				int var13 = var5.readUnsignedByte();
				int var14 = var13 >> 2;
				int var15 = var13 & 3;
				int var16 = var11 + var1;
				int var17 = var10 + var2;
				if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
					int var18 = var12;
					if ((Tiles.Tiles_renderFlags[1][var16][var17] & 2) == 2) {
						var18 = var12 - 1;
					}

					CollisionMap var19 = null;
					if (var18 >= 0) {
						var19 = var4[var18];
					}

					class19.method262(var12, var16, var17, var6, var15, var14, var3, var19);
				}
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ILbb;ZB)I",
		garbageValue = "85"
	)
	static int method4377(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.GETWINDOWMODE) {
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = ClanChannelMember.getWindowedMode();
			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.SETWINDOWMODE) {
				var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
				if (var3 == 1 || var3 == 2) {
					Widget.setWindowedMode(var3);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) {
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = class12.clientPreferences.method2274();
				return 1;
			} else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) {
				if (var0 == 5310) {
					--class12.Interpreter_intStackSize;
					return 1;
				} else if (var0 == 5311) {
					class12.Interpreter_intStackSize -= 2;
					return 1;
				} else if (var0 == 5312) {
					--class12.Interpreter_intStackSize;
					return 1;
				} else if (var0 == 5350) {
					class9.Interpreter_stringStackSize -= 2;
					--class12.Interpreter_intStackSize;
					return 1;
				} else if (var0 == 5351) {
					--class9.Interpreter_stringStackSize;
					return 1;
				} else {
					return 2;
				}
			} else {
				var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
				if (var3 == 1 || var3 == 2) {
					class12.clientPreferences.method2245(var3);
				}

				return 1;
			}
		}
	}
}
