import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bh")
@Implements("Tiles")
public final class Tiles {
	@ObfuscatedName("n")
	@Export("Tiles_heights")
	static int[][][] Tiles_heights;
	@ObfuscatedName("v")
	@Export("Tiles_renderFlags")
	static byte[][][] Tiles_renderFlags;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -968243809
	)
	@Export("Tiles_minPlane")
	static int Tiles_minPlane;
	@ObfuscatedName("c")
	static byte[][][] field517;
	@ObfuscatedName("h")
	static byte[][][] field530;
	@ObfuscatedName("s")
	@Export("Tiles_saturation")
	static int[] Tiles_saturation;
	@ObfuscatedName("g")
	static final int[] field521;
	@ObfuscatedName("u")
	static final int[] field514;
	@ObfuscatedName("t")
	static final int[] field523;
	@ObfuscatedName("p")
	static final int[] field527;
	@ObfuscatedName("m")
	static final int[] field525;
	@ObfuscatedName("r")
	static final int[] field526;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1953607333
	)
	static int field518;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -2108936291
	)
	static int field528;
	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		signature = "Liy;"
	)
	@Export("archive14")
	static Archive archive14;

	static {
		Tiles_heights = new int[4][105][105];
		Tiles_renderFlags = new byte[4][104][104];
		Tiles_minPlane = 99;
		field521 = new int[]{1, 2, 4, 8};
		field514 = new int[]{16, 32, 64, 128};
		field523 = new int[]{1, 0, -1, 0};
		field527 = new int[]{0, -1, 0, 1};
		field525 = new int[]{1, -1, -1, 1};
		field526 = new int[]{-1, -1, 1, 1};
		field518 = (int)(Math.random() * 17.0D) - 8;
		field528 = (int)(Math.random() * 33.0D) - 16;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		garbageValue = "-1552906826",
		signature = "(I)J"
	)
	@Export("currentTimeMillis")
	public static final synchronized long currentTimeMillis() {
		long var0 = System.currentTimeMillis();
		if (var0 < class307.field3734) {
			class307.field3735 += class307.field3734 - var0;
		}

		class307.field3734 = var0;
		return class307.field3735 + var0;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		garbageValue = "-2101793788",
		signature = "(II)Lih;"
	)
	public static VarbitComposition method1219(int var0) {
		VarbitComposition var1 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0);
			var1 = new VarbitComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			VarbitComposition.VarbitDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		garbageValue = "1",
		signature = "(ILlu;Liy;B)V"
	)
	static void method1218(int var0, ArchiveDisk var1, Archive var2) {
		ArchiveDiskAction var3 = new ArchiveDiskAction();
		var3.type = 1;
		var3.key = (long)var0;
		var3.archiveDisk = var1;
		var3.archive = var2;
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3);
		}

		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
			if (ArchiveDiskActionHandler.field3187 == 0) {
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true);
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start();
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5);
			}

			ArchiveDiskActionHandler.field3187 = 600;
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		garbageValue = "-2100535609",
		signature = "(I)[Lgv;"
	)
	static LoginPacket[] method1217() {
		return new LoginPacket[]{LoginPacket.field2340, LoginPacket.field2339, LoginPacket.field2342, LoginPacket.field2338, LoginPacket.field2336, LoginPacket.field2337};
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		garbageValue = "-1993341504",
		signature = "(Ljava/lang/String;I)V"
	)
	static final void method1209(String var0) {
		class300.method5473("Please remove " + var0 + " from your friend list first");
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		garbageValue = "1872094164",
		signature = "(ILcl;ZI)I"
	)
	static int method1215(int var0, Script var1, boolean var2) {
		int var6;
		if (var0 == ScriptOpcodes.OC_NAME) {
			var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class281.ItemDefinition_get(var6).name;
			return 1;
		} else {
			int var4;
			ItemComposition var5;
			if (var0 == ScriptOpcodes.OC_OP) {
				Interpreter.Interpreter_intStackSize -= 2;
				var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				var5 = class281.ItemDefinition_get(var6);
				if (var4 >= 1 && var4 <= 5 && var5.groundActions[var4 - 1] != null) {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.groundActions[var4 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.OC_IOP) {
				Interpreter.Interpreter_intStackSize -= 2;
				var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				var5 = class281.ItemDefinition_get(var6);
				if (var4 >= 1 && var4 <= 5 && var5.inventoryActions[var4 - 1] != null) {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.inventoryActions[var4 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.OC_COST) {
				var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class281.ItemDefinition_get(var6).price;
				return 1;
			} else if (var0 == ScriptOpcodes.OC_STACKABLE) {
				var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class281.ItemDefinition_get(var6).isStackable == 1 ? 1 : 0;
				return 1;
			} else {
				ItemComposition var7;
				if (var0 == ScriptOpcodes.OC_CERT) {
					var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					var7 = class281.ItemDefinition_get(var6);
					if (var7.noteTemplate == -1 && var7.note >= 0) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.note;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_UNCERT) {
					var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					var7 = class281.ItemDefinition_get(var6);
					if (var7.noteTemplate >= 0 && var7.note >= 0) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.note;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_MEMBERS) {
					var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class281.ItemDefinition_get(var6).isMembersOnly ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) {
					var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					var7 = class281.ItemDefinition_get(var6);
					if (var7.placeholderTemplate == -1 && var7.placeholder >= 0) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) {
					var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					var7 = class281.ItemDefinition_get(var6);
					if (var7.placeholderTemplate >= 0 && var7.placeholder >= 0) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_FIND) {
					String var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					PendingSpawn.findItemDefinitions(var3, var4 == 1);
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = NPC.foundItemIdCount;
					return 1;
				} else if (var0 != ScriptOpcodes.OC_FINDNEXT) {
					if (var0 == ScriptOpcodes.OC_FINDRESET) {
						WorldMapLabelSize.foundItemIndex = 0;
						return 1;
					} else {
						return 2;
					}
				} else {
					if (class52.foundItemIds != null && WorldMapLabelSize.foundItemIndex < NPC.foundItemIdCount) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class52.foundItemIds[++WorldMapLabelSize.foundItemIndex - 1] & '\uffff';
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		garbageValue = "739507935",
		signature = "(ZI)V"
	)
	@Export("setTapToDrop")
	static void setTapToDrop(boolean var0) {
		Client.tapToDrop = var0;
	}
}
