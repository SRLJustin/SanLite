import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cs")
public enum class82 implements MouseWheel {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lcs;"
	)
	field1073(0, -1),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lcs;"
	)
	field1079(1, 1),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lcs;"
	)
	field1078(2, 7),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lcs;"
	)
	field1075(3, 8),
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lcs;"
	)
	field1076(4, 9);

	@ObfuscatedName("s")
	@Export("ItemDefinition_inMembersWorld")
	public static boolean ItemDefinition_inMembersWorld;
	@ObfuscatedName("r")
	static int[] field1072;
	@ObfuscatedName("ax")
	@Export("client")
	@ObfuscatedSignature(
		descriptor = "Lclient;"
	)
	static Client client;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 2093138331
	)
	final int field1077;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 612324331
	)
	final int field1081;

	class82(int var3, int var4) {
		this.field1077 = var3;
		this.field1081 = var4;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "30"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1081;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IB)Lgy;",
		garbageValue = "1"
	)
	@Export("getObjectDefinition")
	public static ObjectComposition getObjectDefinition(int var0) {
		ObjectComposition var1 = (ObjectComposition)ObjectComposition.ObjectDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = ObjectComposition.ObjectDefinition_archive.takeFile(6, var0);
			var1 = new ObjectComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			if (var1.isSolid) {
				var1.interactType = 0;
				var1.boolean1 = false;
			}

			ObjectComposition.ObjectDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "(ZLpc;B)V",
		garbageValue = "-25"
	)
	static final void method2098(boolean var0, PacketBuffer var1) {
		while (true) {
			if (var1.bitsRemaining(Client.packetWriter.serverPacketLength) >= 27) {
				int var2 = var1.readBits(15);
				if (var2 != 32767) {
					boolean var3 = false;
					if (Client.npcs[var2] == null) {
						Client.npcs[var2] = new NPC();
						var3 = true;
					}

					NPC var4 = Client.npcs[var2];
					Client.npcIndices[++Client.npcCount - 1] = var2;
					var4.npcCycle = Client.cycle;
					int var5;
					int var6;
					int var7;
					int var10;
					if (class393.field4428) {
						int var8 = Client.field620[var1.readBits(3)];
						if (var3) {
							var4.orientation = var4.rotation = var8;
						}

						if (var0) {
							var7 = var1.readBits(8);
							if (var7 > 127) {
								var7 -= 256;
							}
						} else {
							var7 = var1.readBits(5);
							if (var7 > 15) {
								var7 -= 32;
							}
						}

						var4.definition = WorldMapSectionType.getNpcDefinition(var1.readBits(14));
						boolean var9 = var1.readBits(1) == 1;
						if (var9) {
							var1.readBits(32);
						}

						var5 = var1.readBits(1);
						var10 = var1.readBits(1);
						if (var10 == 1) {
							Client.field601[++Client.field565 - 1] = var2;
						}

						if (var0) {
							var6 = var1.readBits(8);
							if (var6 > 127) {
								var6 -= 256;
							}
						} else {
							var6 = var1.readBits(5);
							if (var6 > 15) {
								var6 -= 32;
							}
						}
					} else {
						boolean var11 = var1.readBits(1) == 1;
						if (var11) {
							var1.readBits(32);
						}

						if (var0) {
							var7 = var1.readBits(8);
							if (var7 > 127) {
								var7 -= 256;
							}
						} else {
							var7 = var1.readBits(5);
							if (var7 > 15) {
								var7 -= 32;
							}
						}

						var5 = var1.readBits(1);
						if (var0) {
							var6 = var1.readBits(8);
							if (var6 > 127) {
								var6 -= 256;
							}
						} else {
							var6 = var1.readBits(5);
							if (var6 > 15) {
								var6 -= 32;
							}
						}

						var4.definition = WorldMapSectionType.getNpcDefinition(var1.readBits(14));
						int var12 = Client.field620[var1.readBits(3)];
						if (var3) {
							var4.orientation = var4.rotation = var12;
						}

						var10 = var1.readBits(1);
						if (var10 == 1) {
							Client.field601[++Client.field565 - 1] = var2;
						}
					}

					var4.field1167 = var4.definition.size;
					var4.field1204 = var4.definition.rotation;
					if (var4.field1204 == 0) {
						var4.rotation = 0;
					}

					var4.walkSequence = var4.definition.walkSequence;
					var4.walkBackSequence = var4.definition.walkBackSequence;
					var4.walkLeftSequence = var4.definition.walkLeftSequence;
					var4.walkRightSequence = var4.definition.walkRightSequence;
					var4.idleSequence = var4.definition.idleSequence;
					var4.turnLeftSequence = var4.definition.turnLeftSequence;
					var4.turnRightSequence = var4.definition.turnRightSequence;
					var4.runSequence = var4.definition.field1959;
					var4.field1150 = var4.definition.field1960;
					var4.field1183 = var4.definition.field1961;
					var4.field1152 = var4.definition.field1946;
					var4.field1160 = var4.definition.field1985;
					var4.field1154 = var4.definition.field1964;
					var4.field1155 = var4.definition.field1956;
					var4.field1156 = var4.definition.field1966;
					var4.method2341(ModelData0.localPlayer.pathX[0] + var6, ModelData0.localPlayer.pathY[0] + var7, var5 == 1);
					continue;
				}
			}

			var1.exportIndex();
			return;
		}
	}
}
