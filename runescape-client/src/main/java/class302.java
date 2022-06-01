import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("kx")
public class class302 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	static final class302 field3612;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	static final class302 field3611;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -928384515
	)
	final int field3613;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 381472807
	)
	final int field3610;

	static {
		field3612 = new class302(51, 27, 800, 0, 16, 16);
		field3611 = new class302(25, 28, 800, 656, 40, 40);
	}

	class302(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.field3613 = var5;
		this.field3610 = var6;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ILbb;ZI)I",
		garbageValue = "-1771352209"
	)
	static int method5584(int var0, Script var1, boolean var2) {
		int var3;
		int var4;
		if (var0 == ScriptOpcodes.ADD) {
			class12.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3 + var4;
			return 1;
		} else if (var0 == ScriptOpcodes.SUB) {
			class12.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3 - var4;
			return 1;
		} else if (var0 == ScriptOpcodes.MULTIPLY) {
			class12.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var4 * var3;
			return 1;
		} else if (var0 == ScriptOpcodes.DIV) {
			class12.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3 / var4;
			return 1;
		} else if (var0 == ScriptOpcodes.RANDOM) {
			var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var3);
			return 1;
		} else if (var0 == ScriptOpcodes.RANDOMINC) {
			var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var3 + 1));
			return 1;
		} else {
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.INTERPOLATE) {
				class12.Interpreter_intStackSize -= 5;
				var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 3];
				var7 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 4];
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3 + (var4 - var3) * (var7 - var5) / (var6 - var5);
				return 1;
			} else if (var0 == ScriptOpcodes.ADDPERCENT) {
				class12.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3 + var4 * var3 / 100;
				return 1;
			} else if (var0 == ScriptOpcodes.SETBIT) {
				class12.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3 | 1 << var4;
				return 1;
			} else if (var0 == ScriptOpcodes.CLEARBIT) {
				class12.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3 & -1 - (1 << var4);
				return 1;
			} else if (var0 == ScriptOpcodes.TESTBIT) {
				class12.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = (var3 & 1 << var4) != 0 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.MOD) {
				class12.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3 % var4;
				return 1;
			} else if (var0 == ScriptOpcodes.POW) {
				class12.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1];
				if (var3 == 0) {
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
				} else {
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = (int)Math.pow((double)var3, (double)var4);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.INVPOW) {
				class12.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1];
				if (var3 == 0) {
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
					return 1;
				} else {
					switch(var4) {
					case 0:
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = Integer.MAX_VALUE;
						break;
					case 1:
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3;
						break;
					case 2:
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var3);
						break;
					case 3:
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var3);
						break;
					case 4:
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var3));
						break;
					default:
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = (int)Math.pow((double)var3, 1.0D / (double)var4);
					}

					return 1;
				}
			} else if (var0 == ScriptOpcodes.AND) {
				class12.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3 & var4;
				return 1;
			} else if (var0 == ScriptOpcodes.OR) {
				class12.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3 | var4;
				return 1;
			} else if (var0 == ScriptOpcodes.SCALE) {
				class12.Interpreter_intStackSize -= 3;
				long var9 = (long)Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize];
				long var11 = (long)Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1];
				long var13 = (long)Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = (int)(var9 * var13 / var11);
				return 1;
			} else if (var0 == ScriptOpcodes.BITCOUNT) {
				var3 = VarcInt.method3324(Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]);
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3;
				return 1;
			} else if (var0 == ScriptOpcodes.TOGGLEBIT) {
				class12.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3 ^ 1 << var4;
				return 1;
			} else if (var0 == ScriptOpcodes.SETBIT_RANGE) {
				class12.Interpreter_intStackSize -= 3;
				var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = class92.method2376(var3, var4, var5);
				return 1;
			} else if (var0 == ScriptOpcodes.CLEARBIT_RANGE) {
				class12.Interpreter_intStackSize -= 3;
				var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = DynamicObject.method1957(var3, var4, var5);
				return 1;
			} else if (var0 == ScriptOpcodes.GETBIT_RANGE) {
				class12.Interpreter_intStackSize -= 3;
				var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 2];
				var6 = 31 - var5;
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3 << var6 >>> var4 + var6;
				return 1;
			} else if (var0 == 4030) {
				class12.Interpreter_intStackSize -= 4;
				var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 3];
				var3 = DynamicObject.method1957(var3, var5, var6);
				var7 = class147.method3000(var6 - var5 + 1);
				if (var4 > var7) {
					var4 = var7;
				}

				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3 | var4 << var5;
				return 1;
			} else if (var0 == 4032) {
				Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize - 1] = GameEngine.method555(Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4033) {
				Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize - 1] = Occluder.method4220(Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4034) {
				class12.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1];
				var5 = class1.method12(var3, var4);
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var5;
				return 1;
			} else if (var0 == 4035) {
				Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize - 1] = Math.abs(Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize - 1]);
				return 1;
			} else {
				return 2;
			}
		}
	}
}
