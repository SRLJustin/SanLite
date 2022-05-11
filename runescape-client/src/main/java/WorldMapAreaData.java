import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("iq")
@Implements("WorldMapAreaData")
public class WorldMapAreaData extends WorldMapArea {
	@ObfuscatedName("w")
	@Export("worldMapData0Set")
	HashSet worldMapData0Set;
	@ObfuscatedName("b")
	@Export("worldMapData1Set")
	HashSet worldMapData1Set;
	@ObfuscatedName("t")
	@Export("iconList")
	List iconList;

	WorldMapAreaData() {
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Lpx;Lpx;IZI)V",
		garbageValue = "696765491"
	)
	@Export("init")
	void init(Buffer var1, Buffer var2, int var3, boolean var4) {
		this.read(var1, var3);
		int var5 = var2.readUnsignedShort();
		this.worldMapData0Set = new HashSet(var5);

		int var6;
		for (var6 = 0; var6 < var5; ++var6) {
			WorldMapData_0 var7 = new WorldMapData_0();

			try {
				var7.init(var2);
			} catch (IllegalStateException var12) {
				continue;
			}

			this.worldMapData0Set.add(var7);
		}

		var6 = var2.readUnsignedShort();
		this.worldMapData1Set = new HashSet(var6);

		for (int var10 = 0; var10 < var6; ++var10) {
			WorldMapData_1 var8 = new WorldMapData_1();

			try {
				var8.init(var2);
			} catch (IllegalStateException var11) {
				continue;
			}

			this.worldMapData1Set.add(var8);
		}

		this.initIconsList(var2, var4);
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(Lpx;ZI)V",
		garbageValue = "-838366517"
	)
	@Export("initIconsList")
	void initIconsList(Buffer var1, boolean var2) {
		this.iconList = new LinkedList();
		int var3 = var1.readUnsignedShort();

		for (int var4 = 0; var4 < var3; ++var4) {
			int var5 = var1.method7532();
			Coord var6 = new Coord(var1.readInt());
			boolean var7 = var1.readUnsignedByte() == 1;
			if (var2 || !var7) {
				this.iconList.add(new WorldMapIcon_0((Coord)null, var6, var5, (WorldMapLabel)null));
			}
		}

	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "676720431"
	)
	public static boolean method4880(int var0) {
		return var0 >= 0 && var0 < 112 ? KeyHandler.field120[var0] : false;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(ILbb;ZI)I",
		garbageValue = "782138310"
	)
	static int method4887(int var0, Script var1, boolean var2) {
		int var4 = -1;
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
			var3 = class92.getWidget(var4);
		} else {
			var3 = var2 ? Interpreter.scriptDotWidget : KeyHandler.scriptActiveWidget;
		}

		if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) {
			class12.Interpreter_intStackSize -= 2;
			var3.scrollX = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize];
			if (var3.scrollX > var3.scrollWidth - var3.width) {
				var3.scrollX = var3.scrollWidth - var3.width;
			}

			if (var3.scrollX < 0) {
				var3.scrollX = 0;
			}

			var3.scrollY = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1];
			if (var3.scrollY > var3.scrollHeight - var3.height) {
				var3.scrollY = var3.scrollHeight - var3.height;
			}

			if (var3.scrollY < 0) {
				var3.scrollY = 0;
			}

			GrandExchangeOfferTotalQuantityComparator.method5781(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETCOLOUR) {
			var3.color = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
			GrandExchangeOfferTotalQuantityComparator.method5781(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETFILL) {
			var3.fill = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1;
			GrandExchangeOfferTotalQuantityComparator.method5781(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTRANS) {
			var3.transparencyTop = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
			GrandExchangeOfferTotalQuantityComparator.method5781(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETLINEWID) {
			var3.lineWid = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
			GrandExchangeOfferTotalQuantityComparator.method5781(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) {
			var3.spriteId2 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
			GrandExchangeOfferTotalQuantityComparator.method5781(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SET2DANGLE) {
			var3.spriteAngle = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
			GrandExchangeOfferTotalQuantityComparator.method5781(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTILING) {
			var3.spriteTiling = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1;
			GrandExchangeOfferTotalQuantityComparator.method5781(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODEL) {
			var3.modelType = 1;
			var3.modelId = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
			GrandExchangeOfferTotalQuantityComparator.method5781(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) {
			class12.Interpreter_intStackSize -= 6;
			var3.modelOffsetX = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize];
			var3.modelOffsetY = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1];
			var3.modelAngleX = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 2];
			var3.modelAngleY = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 3];
			var3.modelAngleZ = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 4];
			var3.modelZoom = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 5];
			GrandExchangeOfferTotalQuantityComparator.method5781(var3);
			return 1;
		} else {
			int var8;
			if (var0 == ScriptOpcodes.CC_SETMODELANIM) {
				var8 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
				if (var8 != var3.sequenceId) {
					var3.sequenceId = var8;
					var3.modelFrame = 0;
					var3.modelFrameCycle = 0;
					GrandExchangeOfferTotalQuantityComparator.method5781(var3);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) {
				var3.modelOrthog = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1;
				GrandExchangeOfferTotalQuantityComparator.method5781(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTEXT) {
				String var7 = Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize];
				if (!var7.equals(var3.text)) {
					var3.text = var7;
					GrandExchangeOfferTotalQuantityComparator.method5781(var3);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTEXTFONT) {
				var3.fontId = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
				GrandExchangeOfferTotalQuantityComparator.method5781(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) {
				class12.Interpreter_intStackSize -= 3;
				var3.textXAlignment = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize];
				var3.textYAlignment = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1];
				var3.textLineHeight = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 2];
				GrandExchangeOfferTotalQuantityComparator.method5781(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) {
				var3.textShadowed = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1;
				GrandExchangeOfferTotalQuantityComparator.method5781(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETOUTLINE) {
				var3.outline = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
				GrandExchangeOfferTotalQuantityComparator.method5781(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) {
				var3.spriteShadow = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
				GrandExchangeOfferTotalQuantityComparator.method5781(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETVFLIP) {
				var3.spriteFlipV = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1;
				GrandExchangeOfferTotalQuantityComparator.method5781(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETHFLIP) {
				var3.spriteFlipH = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1;
				GrandExchangeOfferTotalQuantityComparator.method5781(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) {
				class12.Interpreter_intStackSize -= 2;
				var3.scrollWidth = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize];
				var3.scrollHeight = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1];
				GrandExchangeOfferTotalQuantityComparator.method5781(var3);
				if (var4 != -1 && var3.type == 0) {
					UserComparator8.revalidateWidgetScroll(NetSocket.Widget_interfaceComponents[var4 >> 16], var3, false);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) {
				Skills.resumePauseWidget(var3.id, var3.childIndex);
				Client.meslayerContinueWidget = var3;
				GrandExchangeOfferTotalQuantityComparator.method5781(var3);
				return 1;
			} else if (var0 == 1122) {
				var3.spriteId = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
				GrandExchangeOfferTotalQuantityComparator.method5781(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) {
				var3.color2 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
				GrandExchangeOfferTotalQuantityComparator.method5781(var3);
				return 1;
			} else if (var0 == 1124) {
				var3.transparencyBot = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
				GrandExchangeOfferTotalQuantityComparator.method5781(var3);
				return 1;
			} else if (var0 == 1125) {
				var8 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
				class450 var6 = (class450)class291.findEnumerated(WorldMapEvent.FillMode_values(), var8);
				if (var6 != null) {
					var3.fillMode = var6;
					GrandExchangeOfferTotalQuantityComparator.method5781(var3);
				}

				return 1;
			} else {
				boolean var5;
				if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) {
					var5 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1;
					var3.field3428 = var5;
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) {
					var5 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1;
					var3.modelTransparency = var5;
					return 1;
				} else if (var0 == 1128) {
					class12.Interpreter_intStackSize -= 2;
					return 1;
				} else if (var0 == 1129) {
					var3.field3431 = Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize];
					GrandExchangeOfferTotalQuantityComparator.method5781(var3);
					return 1;
				} else if (var0 == 1130) {
					var3.method5449(Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize], UserComparator7.urlRequester, class92.method2374());
					return 1;
				} else if (var0 == 1131) {
					class12.Interpreter_intStackSize -= 2;
					var3.method5451(Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]);
					return 1;
				} else if (var0 == 1132) {
					var3.method5468(Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize], Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]);
					return 1;
				} else {
					return 2;
				}
			}
		}
	}
}
