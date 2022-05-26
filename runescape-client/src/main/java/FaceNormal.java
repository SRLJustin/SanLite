import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gg")
@Implements("FaceNormal")
public class FaceNormal {
	@ObfuscatedName("jg")
	@ObfuscatedGetter(
		intValue = 1186041129
	)
	@Export("cameraZ")
	static int cameraZ;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1839266109
	)
	@Export("x")
	int x;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 475209611
	)
	@Export("y")
	int y;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1225057041
	)
	@Export("z")
	int z;

	FaceNormal() {
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(ILbb;ZI)I",
		garbageValue = "-1800924378"
	)
	static int method4212(int var0, Script var1, boolean var2) {
		Widget var7;
		if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) {
			int var4;
			if (var0 == ScriptOpcodes.CC_TRIGGEROP) {
				var7 = var2 ? Interpreter.scriptDotWidget : KeyHandler.scriptActiveWidget;
				var4 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
				if (var4 >= 1 && var4 <= 10) {
					class93 var8 = new class93(var4, var7.id, var7.childIndex, var7.itemId);
					Interpreter.field821.add(var8);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else if (var0 == ScriptOpcodes.IF_TRIGGEROP) {
				class12.Interpreter_intStackSize -= 3;
				int var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1];
				int var5 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 2];
				if (var5 >= 1 && var5 <= 10) {
					class93 var6 = new class93(var5, var3, var4, class92.getWidget(var3).itemId);
					Interpreter.field821.add(var6);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else {
				return 2;
			}
		} else if (Interpreter.field823 >= 10) {
			throw new RuntimeException();
		} else {
			if (var0 >= 2000) {
				var7 = class92.getWidget(Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]);
			} else {
				var7 = var2 ? Interpreter.scriptDotWidget : KeyHandler.scriptActiveWidget;
			}

			if (var7.onResize == null) {
				return 0;
			} else {
				ScriptEvent var9 = new ScriptEvent();
				var9.widget = var7;
				var9.args = var7.onResize;
				var9.field1054 = Interpreter.field823 + 1;
				Client.scriptEvents.addFirst(var9);
				return 1;
			}
		}
	}
}
