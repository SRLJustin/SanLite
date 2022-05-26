import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("az")
public class class33 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("reflectionChecks")
	public static IterableNodeDeque reflectionChecks;

	static {
		reflectionChecks = new IterableNodeDeque();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILbb;ZI)I",
		garbageValue = "525584260"
	)
	static int method592(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.WORLDLIST_FETCH) {
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = ClientPreferences.loadWorlds() ? 1 : 0;
			return 1;
		} else {
			World var9;
			if (var0 == ScriptOpcodes.WORLDLIST_START) {
				var9 = ClientPreferences.worldListStart();
				if (var9 != null) {
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var9.id;
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var9.properties;
					Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var9.activity;
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var9.location;
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var9.population;
					Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var9.host;
				} else {
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1;
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) {
				var9 = class146.getNextWorldListWorld();
				if (var9 != null) {
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var9.id;
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var9.properties;
					Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var9.activity;
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var9.location;
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var9.population;
					Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var9.host;
				} else {
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1;
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else {
				int var3;
				World var7;
				int var8;
				if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) {
					var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
					var7 = null;

					for (var8 = 0; var8 < World.World_count; ++var8) {
						if (var3 == World.World_worlds[var8].id) {
							var7 = World.World_worlds[var8];
							break;
						}
					}

					if (var7 != null) {
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var7.id;
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var7.properties;
						Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var7.activity;
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var7.location;
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var7.population;
						Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var7.host;
					} else {
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.WORLDLIST_SORT) {
					class12.Interpreter_intStackSize -= 4;
					var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize];
					boolean var10 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1] == 1;
					var8 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 2];
					boolean var6 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 3] == 1;
					GraphicsDefaults.sortWorldList(var3, var10, var8, var6);
					return 1;
				} else if (var0 != 6511) {
					if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) {
						Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1;
						return 1;
					} else {
						int var4;
						ParamComposition var5;
						if (var0 == ScriptOpcodes.NC_PARAM) {
							class12.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1];
							var5 = class78.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = WorldMapSectionType.getNpcDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = WorldMapSectionType.getNpcDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.LC_PARAM) {
							class12.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1];
							var5 = class78.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = class82.getObjectDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = class82.getObjectDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.OC_PARAM) {
							class12.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1];
							var5 = class78.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = FileSystem.ItemDefinition_get(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = FileSystem.ItemDefinition_get(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.STRUCT_PARAM) {
							class12.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1];
							var5 = class78.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = class401.StructDefinition_getStructDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = class401.StructDefinition_getStructDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.ON_MOBILE) {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = Client.onMobile ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CLIENTTYPE) {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = Client.clientType;
							return 1;
						} else if (var0 == 6520) {
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) {
							return 1;
						} else if (var0 == 6522) {
							--class9.Interpreter_stringStackSize;
							--class12.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 6523) {
							--class9.Interpreter_stringStackSize;
							--class12.Interpreter_intStackSize;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYLEVEL) {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYCHARGING) {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 1;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_WIFIAVAILABLE) {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 1;
							return 1;
						} else if (var0 == 6527) {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = Client.field486;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
					if (var3 >= 0 && var3 < World.World_count) {
						var7 = World.World_worlds[var3];
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var7.id;
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var7.properties;
						Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var7.activity;
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var7.location;
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var7.population;
						Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var7.host;
					} else {
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "368469089"
	)
	@Export("setTapToDrop")
	static void setTapToDrop(boolean var0) {
		Client.tapToDrop = var0;
	}
}
