import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ad")
@Implements("SoundSystem")
public class SoundSystem implements Runnable {
	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "Lqr;"
	)
	@Export("compass")
	static SpritePixels compass;
	@ObfuscatedName("po")
	@ObfuscatedGetter(
		intValue = -2095633831
	)
	static int field315;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "[Lal;"
	)
	@Export("players")
	volatile PcmPlayer[] players;

	SoundSystem() {
		this.players = new PcmPlayer[2];
	}

	public void run() {
		try {
			for (int var1 = 0; var1 < 2; ++var1) {
				PcmPlayer var2 = this.players[var1];
				if (var2 != null) {
					var2.run();
				}
			}
		} catch (Exception var4) {
			ArchiveDiskActionHandler.RunException_sendStackTrace((String)null, var4);
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Lqr;",
		garbageValue = "19"
	)
	static SpritePixels method774(int var0, int var1, int var2) {
		DemotingHashTable var3 = WorldMapRegion.WorldMapRegion_cachedSprites;
		long var4 = (long)(var2 << 16 | var0 << 8 | var1);
		return (SpritePixels)var3.get(var4);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(ILbb;ZI)I",
		garbageValue = "1284020216"
	)
	static int method777(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.CC_CREATE) {
			class12.Interpreter_intStackSize -= 3;
			var9 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1];
			int var11 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 2];
			if (var4 == 0) {
				throw new RuntimeException();
			} else {
				Widget var6 = class92.getWidget(var9);
				if (var6.children == null) {
					var6.children = new Widget[var11 + 1];
				}

				if (var6.children.length <= var11) {
					Widget[] var7 = new Widget[var11 + 1];

					for (int var8 = 0; var8 < var6.children.length; ++var8) {
						var7[var8] = var6.children[var8];
					}

					var6.children = var7;
				}

				if (var11 > 0 && var6.children[var11 - 1] == null) {
					throw new RuntimeException("" + (var11 - 1));
				} else {
					Widget var12 = new Widget();
					var12.type = var4;
					var12.parentId = var12.id = var6.id;
					var12.childIndex = var11;
					var12.isIf3 = true;
					var6.children[var11] = var12;
					if (var2) {
						Interpreter.scriptDotWidget = var12;
					} else {
						KeyHandler.scriptActiveWidget = var12;
					}

					GrandExchangeOfferTotalQuantityComparator.method5781(var6);
					return 1;
				}
			}
		} else {
			Widget var3;
			if (var0 == ScriptOpcodes.CC_DELETE) {
				var3 = var2 ? Interpreter.scriptDotWidget : KeyHandler.scriptActiveWidget;
				Widget var10 = class92.getWidget(var3.id);
				var10.children[var3.childIndex] = null;
				GrandExchangeOfferTotalQuantityComparator.method5781(var10);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_DELETEALL) {
				var3 = class92.getWidget(Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]);
				var3.children = null;
				GrandExchangeOfferTotalQuantityComparator.method5781(var3);
				return 1;
			} else if (var0 == 103) {
				class12.Interpreter_intStackSize -= 3;
				return 1;
			} else if (var0 == 104) {
				--class12.Interpreter_intStackSize;
				return 1;
			} else if (var0 != ScriptOpcodes.CC_FIND) {
				if (var0 == ScriptOpcodes.IF_FIND) {
					var3 = class92.getWidget(Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]);
					if (var3 != null) {
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 1;
						if (var2) {
							Interpreter.scriptDotWidget = var3;
						} else {
							KeyHandler.scriptActiveWidget = var3;
						}
					} else {
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == 202) {
					Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1] = 0;
					return 1;
				} else if (var0 == 203) {
					Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize + 1] = 0;
					return 1;
				} else {
					return 2;
				}
			} else {
				class12.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1];
				Widget var5 = ApproximateRouteStrategy.getWidgetChild(var9, var4);
				if (var5 != null && var4 != -1) {
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 1;
					if (var2) {
						Interpreter.scriptDotWidget = var5;
					} else {
						KeyHandler.scriptActiveWidget = var5;
					}
				} else {
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			}
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-583915205"
	)
	public static void method780() {
		HitSplatDefinition.HitSplatDefinition_cached.clear();
		HitSplatDefinition.HitSplatDefinition_cachedSprites.clear();
		HitSplatDefinition.HitSplatDefinition_cachedFonts.clear();
	}

	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	static boolean method779() {
		return (Client.drawPlayerNames & 1) != 0;
	}
}
