import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("iy")
@Implements("WorldMapDecoration")
public class WorldMapDecoration {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -170825093
	)
	@Export("objectDefinitionId")
	final int objectDefinitionId;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -727750889
	)
	@Export("decoration")
	final int decoration;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1798867267
	)
	@Export("rotation")
	final int rotation;

	WorldMapDecoration(int var1, int var2, int var3) {
		this.objectDefinitionId = var1;
		this.decoration = var2;
		this.rotation = var3;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2105271367"
	)
	@Export("loadInterface")
	public static boolean loadInterface(int var0) {
		if (class120.Widget_loadedInterfaces[var0]) {
			return true;
		} else if (!class134.Widget_archive.tryLoadGroup(var0)) {
			return false;
		} else {
			int var1 = class134.Widget_archive.getGroupFileCount(var0);
			if (var1 == 0) {
				class120.Widget_loadedInterfaces[var0] = true;
				return true;
			} else {
				if (NetSocket.Widget_interfaceComponents[var0] == null) {
					NetSocket.Widget_interfaceComponents[var0] = new Widget[var1];
				}

				for (int var2 = 0; var2 < var1; ++var2) {
					if (NetSocket.Widget_interfaceComponents[var0][var2] == null) {
						byte[] var3 = class134.Widget_archive.takeFile(var0, var2);
						if (var3 != null) {
							NetSocket.Widget_interfaceComponents[var0][var2] = new Widget();
							NetSocket.Widget_interfaceComponents[var0][var2].id = var2 + (var0 << 16);
							if (var3[0] == -1) {
								NetSocket.Widget_interfaceComponents[var0][var2].decode(new Buffer(var3));
							} else {
								NetSocket.Widget_interfaceComponents[var0][var2].decodeLegacy(new Buffer(var3));
							}
						}
					}
				}

				class120.Widget_loadedInterfaces[var0] = true;
				return true;
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(ILbb;ZI)I",
		garbageValue = "1988799748"
	)
	static int method4804(int var0, Script var1, boolean var2) {
		Widget var3 = class92.getWidget(Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETSCROLLX) {
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.scrollX;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLY) {
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.scrollY;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTEXT) {
			Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var3.text;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLWIDTH) {
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.scrollWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLHEIGHT) {
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.scrollHeight;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELZOOM) {
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.modelZoom;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_X) {
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.modelAngleX;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Z) {
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.modelAngleZ;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Y) {
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.modelAngleY;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTRANS) {
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.transparencyTop;
			return 1;
		} else if (var0 == 2610) {
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.transparencyBot;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETCOLOUR) {
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.color;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETFILLCOLOUR) {
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.color2;
			return 1;
		} else if (var0 == 2613) {
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal();
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELTRANSPARENT) {
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0;
			return 1;
		} else if (var0 != 2615 && var0 != 2616) {
			return 2;
		} else {
			++class12.Interpreter_intStackSize;
			return 1;
		}
	}
}
