import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fk")
@Implements("VerticalAlignment")
public enum VerticalAlignment implements MouseWheel {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lfk;"
	)
	field2001(0, 0),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lfk;"
	)
	@Export("VerticalAlignment_centered")
	VerticalAlignment_centered(1, 1),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lfk;"
	)
	field1994(2, 2);

	@ObfuscatedName("t")
	static int[][][] field1993;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1914691403
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -156992359
	)
	@Export("id")
	final int id;

	VerticalAlignment(int var3, int var4) {
		this.value = var3;
		this.id = var4;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "30"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1009266230"
	)
	public static void method3446() {
		ItemComposition.ItemDefinition_cachedSprites.clear();
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(ILbb;ZB)I",
		garbageValue = "-27"
	)
	static int method3447(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 == ScriptOpcodes.IF_GETINVOBJECT) {
			var3 = class92.getWidget(Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]);
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.itemId;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETINVCOUNT) {
			var3 = class92.getWidget(Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]);
			if (var3.itemId != -1) {
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.IF_HASSUB) {
			int var5 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
			InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var5);
			if (var4 != null) {
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 1;
			} else {
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTOP) {
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = Client.rootInterface;
			return 1;
		} else if (var0 == 1707) {
			var3 = class92.getWidget(Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]);
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.method5498() ? 1 : 0;
			return 1;
		} else if (var0 == 1708) {
			var3 = class92.getWidget(Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]);
			return class293.method5430(var3);
		} else if (var0 == 1708) {
			var3 = class92.getWidget(Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]);
			return class20.method269(var3);
		} else {
			return 2;
		}
	}
}
