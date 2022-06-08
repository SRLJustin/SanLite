import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gn")
@Implements("Tile")
public final class Tile extends Node {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 887186055
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 719692751
	)
	@Export("x")
	int x;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 2070822957
	)
	@Export("y")
	int y;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1571348595
	)
	@Export("originalPlane")
	int originalPlane;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lhr;"
	)
	@Export("paint")
	SceneTilePaint paint;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lhu;"
	)
	@Export("model")
	SceneTileModel model;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lhc;"
	)
	@Export("wallObject")
	WallObject wallObject;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lhf;"
	)
	@Export("decorativeObject")
	DecorativeObject decorativeObject;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lga;"
	)
	@Export("groundObject")
	GroundObject groundObject;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	@Export("itemLayer")
	ItemLayer itemLayer;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1697073381
	)
	@Export("gameObjectsCount")
	int gameObjectsCount;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "[Lhx;"
	)
	@Export("gameObjects")
	GameObject[] gameObjects;
	@ObfuscatedName("w")
	@Export("gameObjectEdgeMasks")
	int[] gameObjectEdgeMasks;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -344605411
	)
	@Export("gameObjectsEdgeMask")
	int gameObjectsEdgeMask;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1026469489
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("g")
	@Export("drawPrimary")
	boolean drawPrimary;
	@ObfuscatedName("x")
	@Export("drawSecondary")
	boolean drawSecondary;
	@ObfuscatedName("n")
	@Export("drawGameObjects")
	boolean drawGameObjects;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1027035127
	)
	@Export("drawGameObjectEdges")
	int drawGameObjectEdges;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1807728235
	)
	int field2372;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -588428605
	)
	int field2373;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -720858367
	)
	int field2374;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lgn;"
	)
	@Export("linkedBelowTile")
	Tile linkedBelowTile;

	Tile(int var1, int var2, int var3) {
		this.gameObjects = new GameObject[5];
		this.gameObjectEdgeMasks = new int[5];
		this.gameObjectsEdgeMask = 0;
		this.originalPlane = this.plane = var1;
		this.x = var2;
		this.y = var3;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(S)Lnw;",
		garbageValue = "-23548"
	)
	public static class388 method3904() {
		synchronized(class388.field4402) {
			if (class388.field4401 == 0) {
				return new class388();
			} else {
				class388.field4402[--class388.field4401].method6861();
				return class388.field4402[class388.field4401];
			}
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(ILbb;ZB)I",
		garbageValue = "1"
	)
	static int method3903(int var0, Script var1, boolean var2) {
		Widget var3 = class92.getWidget(Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETX) {
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.x;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETY) {
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.y;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETWIDTH) {
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.width;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETHEIGHT) {
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.height;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETHIDE) {
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETLAYER) {
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.parentId;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ILbb;ZB)I",
		garbageValue = "-61"
	)
	static int method3902(int var0, Script var1, boolean var2) {
		if (var0 == 7100) {
			++class12.Interpreter_intStackSize;
			return 1;
		} else if (var0 == 7101) {
			class9.Interpreter_stringStackSize += 2;
			return 1;
		} else if (var0 != 7102 && var0 != 7103 && var0 != 7104 && var0 != 7105 && var0 != 7109) {
			if (var0 == 7106) {
				++class12.Interpreter_intStackSize;
				return 1;
			} else if (var0 == 7107) {
				++class12.Interpreter_intStackSize;
				return 1;
			} else if (var0 == 7108) {
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = CollisionMap.method3788() ? 1 : 0;
				return 1;
			} else if (var0 == 7110) {
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
				return 1;
			} else if (var0 == 7120) {
				--class12.Interpreter_intStackSize;
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
				return 1;
			} else if (var0 == 7121) {
				class12.Interpreter_intStackSize -= 2;
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1;
				return 1;
			} else if (var0 == 7122) {
				class12.Interpreter_intStackSize -= 2;
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
				return 1;
			} else {
				return 2;
			}
		} else {
			++class12.Interpreter_intStackSize;
			return 1;
		}
	}
}
