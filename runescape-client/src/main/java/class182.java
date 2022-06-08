import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gj")
public class class182 extends DualNode {
	@ObfuscatedName("ud")
	@Export("foundItemIds")
	static short[] foundItemIds;

	static {
		new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILbb;ZI)I",
		garbageValue = "1933917063"
	)
	static int method3473(int var0, Script var1, boolean var2) {
		if (var0 != 3700 && var0 != 3701) {
			if (var0 == 3702) {
				++class12.Interpreter_intStackSize;
				return 1;
			} else {
				return 2;
			}
		} else {
			--class12.Interpreter_intStackSize;
			--class9.Interpreter_stringStackSize;
			return 1;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ILbb;ZI)I",
		garbageValue = "1317447781"
	)
	static int method3472(int var0, Script var1, boolean var2) {
		if (var0 >= 7200 && var0 < 7204) {
			class12.Interpreter_intStackSize -= 5;
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else if (var0 == 7204) {
			class12.Interpreter_intStackSize -= 6;
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else if (var0 >= 7205 && var0 < 7209) {
			Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else if (var0 == 7209) {
			class12.Interpreter_intStackSize -= 2;
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else if (var0 >= 7210 && var0 < 7214) {
			--class12.Interpreter_intStackSize;
			return 1;
		} else if (var0 == 7214) {
			class12.Interpreter_intStackSize -= 2;
			return 1;
		} else {
			return 2;
		}
	}
}
