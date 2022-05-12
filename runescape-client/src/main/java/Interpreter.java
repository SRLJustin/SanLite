import java.util.ArrayList;
import java.util.Collections;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("be")
@Implements("Interpreter")
public class Interpreter {
	@ObfuscatedName("to")
	@ObfuscatedGetter(
		intValue = -1644525113
	)
	static int field838;
	@ObfuscatedName("m")
	@Export("Interpreter_arrayLengths")
	static int[] Interpreter_arrayLengths;
	@ObfuscatedName("p")
	@Export("Interpreter_arrays")
	static int[][] Interpreter_arrays;
	@ObfuscatedName("s")
	@Export("Interpreter_intStack")
	static int[] Interpreter_intStack;
	@ObfuscatedName("r")
	static int[][] field839;
	@ObfuscatedName("v")
	@Export("Interpreter_stringStack")
	static String[] Interpreter_stringStack;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -2003285519
	)
	@Export("Interpreter_frameDepth")
	static int Interpreter_frameDepth;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "[Lbc;"
	)
	@Export("Interpreter_frames")
	static ScriptFrame[] Interpreter_frames;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	@Export("scriptDotWidget")
	static Widget scriptDotWidget;
	@ObfuscatedName("e")
	@Export("Interpreter_calendar")
	static java.util.Calendar Interpreter_calendar;
	@ObfuscatedName("h")
	@Export("Interpreter_MONTHS")
	static final String[] Interpreter_MONTHS;
	@ObfuscatedName("d")
	static boolean field835;
	@ObfuscatedName("j")
	static boolean field833;
	@ObfuscatedName("z")
	static ArrayList field821;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -628954657
	)
	static int field823;
	@ObfuscatedName("am")
	static final double field837;

	static {
		Interpreter_arrayLengths = new int[5];
		Interpreter_arrays = new int[5][5000];
		Interpreter_intStack = new int[1000];
		Interpreter_stringStack = new String[1000];
		Interpreter_frameDepth = 0;
		Interpreter_frames = new ScriptFrame[50];
		Interpreter_calendar = java.util.Calendar.getInstance();
		Interpreter_MONTHS = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		field835 = false;
		field833 = false;
		field821 = new ArrayList();
		field823 = 0;
		field837 = Math.log(2.0D);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "([I[II)V",
		garbageValue = "-1325635329"
	)
	public static void method1866(int[] var0, int[] var1) {
		if (var0 != null && var1 != null) {
			FileSystem.ByteArrayPool_alternativeSizes = var0;
			GrandExchangeEvents.ByteArrayPool_altSizeArrayCounts = new int[var0.length];
			class131.ByteArrayPool_arrays = new byte[var0.length][][];

			for (int var2 = 0; var2 < FileSystem.ByteArrayPool_alternativeSizes.length; ++var2) {
				class131.ByteArrayPool_arrays[var2] = new byte[var1[var2]][];
				ByteArrayPool.field4212.add(var0[var2]);
			}

			Collections.sort(ByteArrayPool.field4212);
		} else {
			FileSystem.ByteArrayPool_alternativeSizes = null;
			GrandExchangeEvents.ByteArrayPool_altSizeArrayCounts = null;
			class131.ByteArrayPool_arrays = null;
			LoginScreenAnimation.method2217();
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(ILbb;ZI)I",
		garbageValue = "1050592537"
	)
	static int method1793(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = class92.getWidget(Interpreter_intStack[--class12.Interpreter_intStackSize]);
		} else {
			var3 = var2 ? scriptDotWidget : KeyHandler.scriptActiveWidget;
		}

		GrandExchangeOfferTotalQuantityComparator.method5781(var3);
		if (var0 != ScriptOpcodes.CC_SETOBJECT && var0 != ScriptOpcodes.CC_SETOBJECT_NONUM && var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) {
			if (var0 == ScriptOpcodes.CC_SETNPCHEAD) {
				var3.modelType = 2;
				var3.modelId = Interpreter_intStack[--class12.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) {
				var3.modelType = 3;
				var3.modelId = ModelData0.localPlayer.appearance.getChatHeadId();
				return 1;
			} else {
				return 2;
			}
		} else {
			class12.Interpreter_intStackSize -= 2;
			int var4 = Interpreter_intStack[class12.Interpreter_intStackSize];
			int var5 = Interpreter_intStack[class12.Interpreter_intStackSize + 1];
			var3.itemId = var4;
			var3.itemQuantity = var5;
			ItemComposition var6 = FileSystem.ItemDefinition_get(var4);
			var3.modelAngleX = var6.xan2d;
			var3.modelAngleY = var6.yan2d;
			var3.modelAngleZ = var6.zan2d;
			var3.modelOffsetX = var6.offsetX2d;
			var3.modelOffsetY = var6.offsetY2d;
			var3.modelZoom = var6.zoom2d;
			if (var0 == ScriptOpcodes.CC_SETOBJECT_NONUM) {
				var3.itemQuantityMode = 0;
			} else if (var0 == ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM | var6.isStackable == 1) {
				var3.itemQuantityMode = 1;
			} else {
				var3.itemQuantityMode = 2;
			}

			if (var3.field3406 > 0) {
				var3.modelZoom = var3.modelZoom * 32 / var3.field3406;
			} else if (var3.rawWidth > 0) {
				var3.modelZoom = var3.modelZoom * 32 / var3.rawWidth;
			}

			return 1;
		}
	}
}
