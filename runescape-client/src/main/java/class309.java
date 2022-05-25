import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("km")
public enum class309 implements MouseWheel {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lkm;"
	)
	field3976(-1),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lkm;"
	)
	field3973(0),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lkm;"
	)
	field3974(1),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lkm;"
	)
	field3972(2);

	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -965823037
	)
	final int field3975;

	class309(int var3) {
		this.field3975 = var3;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "30"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3975;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILbb;ZB)I",
		garbageValue = "25"
	)
	static int method5600(int var0, Script var1, boolean var2) {
		int var3;
		int var6;
		int var9;
		if (var0 == ScriptOpcodes.ENUM_STRING) {
			class12.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize];
			var9 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1];
			EnumComposition var10 = Calendar.getEnum(var3);
			if (var10.outputType != 's') {
			}

			for (var6 = 0; var6 < var10.outputCount; ++var6) {
				if (var9 == var10.keys[var6]) {
					Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var10.strVals[var6];
					var10 = null;
					break;
				}
			}

			if (var10 != null) {
				Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var10.defaultStr;
			}

			return 1;
		} else if (var0 != ScriptOpcodes.ENUM) {
			if (var0 == ScriptOpcodes.ENUM_GETOUTPUTCOUNT) {
				var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
				EnumComposition var4 = Calendar.getEnum(var3);
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var4.size();
				return 1;
			} else {
				return 2;
			}
		} else {
			class12.Interpreter_intStackSize -= 4;
			var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize];
			var9 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1];
			int var5 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 2];
			var6 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 3];
			EnumComposition var7 = Calendar.getEnum(var5);
			if (var3 == var7.inputType && var9 == var7.outputType) {
				for (int var8 = 0; var8 < var7.outputCount; ++var8) {
					if (var6 == var7.keys[var8]) {
						if (var9 == 115) {
							Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var7.strVals[var8];
						} else {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var7.intVals[var8];
						}

						var7 = null;
						break;
					}
				}

				if (var7 != null) {
					if (var9 == 115) {
						Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var7.defaultStr;
					} else {
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var7.defaultInt;
					}
				}

				return 1;
			} else {
				if (var9 == 115) {
					Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = "null";
				} else {
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			}
		}
	}
}
