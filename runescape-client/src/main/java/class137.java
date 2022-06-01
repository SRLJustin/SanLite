import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("eo")
public class class137 extends class128 {
	@ObfuscatedName("o")
	String field1626;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Leh;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Leh;)V"
	)
	class137(class131 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)V",
		garbageValue = "-611912046"
	)
	void vmethod3040(Buffer var1) {
		this.field1626 = var1.readStringCp1252NullTerminated();
		var1.readInt();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lek;B)V",
		garbageValue = "-73"
	)
	void vmethod3041(ClanSettings var1) {
		var1.name = this.field1626;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "0"
	)
	@Export("isWorldMapEvent")
	public static boolean isWorldMapEvent(int var0) {
		return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 17;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(ILbb;ZI)I",
		garbageValue = "43434510"
	)
	static int method2873(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) {
			class12.Interpreter_intStackSize -= 3;
			WorldMapLabelSize.method4412(Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 2]);
			return 1;
		} else if (var0 == ScriptOpcodes.SOUND_SONG) {
			WorldMapIcon_0.playSong(Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]);
			return 1;
		} else if (var0 == ScriptOpcodes.SOUND_JINGLE) {
			class12.Interpreter_intStackSize -= 2;
			class306.method5593(Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]);
			return 1;
		} else {
			class83 var3;
			class82 var4;
			int var5;
			int var6;
			String var7;
			if (var0 != 3212 && var0 != 3213 && var0 != 3209 && var0 != 3181 && var0 != 3203 && var0 != 3205 && var0 != 3207) {
				if (var0 != 3214 && var0 != 3215 && var0 != 3210 && var0 != 3182 && var0 != 3204 && var0 != 3206 && var0 != 3208) {
					return var0 == 3211 ? 1 : 2;
				} else {
					var3 = class83.field1088;
					var4 = class82.field1073;
					boolean var8 = false;
					if (var0 == 3214) {
						var6 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
						var3 = (class83)class291.findEnumerated(class141.method2962(), var6);
						if (var3 == null) {
							throw new RuntimeException(String.format("Unrecognized device option %d", var6));
						}
					}

					if (var0 == 3215) {
						var6 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
						var4 = (class82)class291.findEnumerated(Player.method2159(), var6);
						if (var4 == null) {
							throw new RuntimeException(String.format("Unrecognized game option %d", var6));
						}
					}

					if (var0 == 3210) {
						var6 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
						var3 = (class83)class291.findEnumerated(class141.method2962(), var6);
						if (var3 == null) {
							var4 = (class82)class291.findEnumerated(Player.method2159(), var6);
							if (var4 == null) {
								throw new RuntimeException(String.format("Unrecognized client option %d", var6));
							}
						}
					} else if (var0 == 3182) {
						var3 = class83.field1092;
					} else if (var0 == 3204) {
						var4 = class82.field1078;
					} else if (var0 == 3206) {
						var4 = class82.field1075;
					} else if (var0 == 3208) {
						var4 = class82.field1076;
					}

					if (var4 == class82.field1073) {
						switch(var3.field1090) {
						case 1:
							var5 = class12.clientPreferences.method2257() ? 1 : 0;
							break;
						case 2:
							var5 = class12.clientPreferences.method2226() ? 1 : 0;
							break;
						case 3:
							var5 = class12.clientPreferences.method2229() ? 1 : 0;
							break;
						case 4:
							var5 = class12.clientPreferences.method2231();
							break;
						case 5:
							var5 = GameBuild.method5586();
							break;
						default:
							var7 = String.format("Unkown device option: %s.", var3.toString());
							throw new RuntimeException(var7);
						}
					} else {
						switch(var4.field1077) {
						case 1:
							var5 = class12.clientPreferences.method2222() ? 1 : 0;
							break;
						case 2:
							var6 = class12.clientPreferences.method2248();
							var5 = Math.round((float)(var6 * 100) / 255.0F);
							break;
						case 3:
							var6 = class12.clientPreferences.method2244();
							var5 = Math.round((float)(var6 * 100) / 127.0F);
							break;
						case 4:
							var6 = class12.clientPreferences.method2239();
							var5 = Math.round((float)(var6 * 100) / 127.0F);
							break;
						default:
							var7 = String.format("Unkown game option: %s.", var4.toString());
							throw new RuntimeException(var7);
						}
					}

					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var5;
					return 1;
				}
			} else {
				var3 = class83.field1088;
				var4 = class82.field1073;
				var5 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
				if (var0 == 3212) {
					var6 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
					var3 = (class83)class291.findEnumerated(class141.method2962(), var6);
					if (var3 == null) {
						throw new RuntimeException(String.format("Unrecognized device option %d", var6));
					}
				}

				if (var0 == 3213) {
					var6 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
					var4 = (class82)class291.findEnumerated(Player.method2159(), var6);
					if (var4 == null) {
						throw new RuntimeException(String.format("Unrecognized game option %d", var6));
					}
				}

				if (var0 == 3209) {
					var6 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
					var3 = (class83)class291.findEnumerated(class141.method2962(), var6);
					if (var3 == null) {
						var4 = (class82)class291.findEnumerated(Player.method2159(), var6);
						if (var4 == null) {
							throw new RuntimeException(String.format("Unrecognized client option %d", var6));
						}
					}
				} else if (var0 == 3181) {
					var3 = class83.field1092;
				} else if (var0 == 3203) {
					var4 = class82.field1078;
				} else if (var0 == 3205) {
					var4 = class82.field1075;
				} else if (var0 == 3207) {
					var4 = class82.field1076;
				}

				if (var4 == class82.field1073) {
					switch(var3.field1090) {
					case 1:
						class12.clientPreferences.method2223(var5 == 1);
						break;
					case 2:
						class12.clientPreferences.method2305(var5 == 1);
						break;
					case 3:
						class12.clientPreferences.method2227(var5 == 1);
						break;
					case 4:
						if (var5 < 0) {
							var5 = 0;
						}

						class12.clientPreferences.method2230(var5);
						break;
					case 5:
						World.method1664(var5);
						break;
					default:
						var7 = String.format("Unkown device option: %s.", var3.toString());
						throw new RuntimeException(var7);
					}
				} else {
					switch(var4.field1077) {
					case 1:
						class12.clientPreferences.method2219(var5 == 1);
						break;
					case 2:
						var5 = Math.min(Math.max(var5, 0), 100);
						var6 = Math.round((float)(var5 * 255) / 100.0F);
						class291.method5390(var6);
						break;
					case 3:
						var5 = Math.min(Math.max(var5, 0), 100);
						var6 = Math.round((float)(var5 * 127) / 100.0F);
						class67.method1881(var6);
						break;
					case 4:
						var5 = Math.min(Math.max(var5, 0), 100);
						var6 = Math.round((float)(var5 * 127) / 100.0F);
						MouseHandler.method591(var6);
						break;
					default:
						var7 = String.format("Unkown game option: %s.", var4.toString());
						throw new RuntimeException(var7);
					}
				}

				return 1;
			}
		}
	}

	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "2079145454"
	)
	@Export("addNpcsToScene")
	static final void addNpcsToScene(boolean var0) {
		for (int var1 = 0; var1 < Client.npcCount; ++var1) {
			NPC var2 = Client.npcs[Client.npcIndices[var1]];
			if (var2 != null && var2.isVisible() && var2.definition.isVisible == var0 && var2.definition.transformIsVisible()) {
				int var3 = var2.x >> 7;
				int var4 = var2.y >> 7;
				if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
					if (var2.field1167 == 1 && (var2.x & 127) == 64 && (var2.y & 127) == 64) {
						if (Client.tileLastDrawnActor[var3][var4] == Client.viewportDrawCount) {
							continue;
						}

						Client.tileLastDrawnActor[var3][var4] = Client.viewportDrawCount;
					}

					long var5 = VarbitComposition.calculateTag(0, 0, 1, !var2.definition.isInteractable, Client.npcIndices[var1]);
					var2.playerCycle = Client.cycle;
					class175.scene.drawEntity(class128.Client_plane, var2.x, var2.y, class202.getTileHeight(var2.field1167 * 64 - 64 + var2.x, var2.field1167 * 64 - 64 + var2.y, class128.Client_plane), var2.field1167 * 64 - 64 + 60, var2, var2.rotation, var5, var2.isWalking);
				}
			}
		}

	}
}
