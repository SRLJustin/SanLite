import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("do")
public class class105 {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "Ljv;"
	)
	@Export("reflectionChecks")
	static IterableNodeDeque reflectionChecks;
	@ObfuscatedName("c")
	@Export("SpriteBuffer_xOffsets")
	public static int[] SpriteBuffer_xOffsets;
	@ObfuscatedName("e")
	public static short[][] field1339;

	static {
		reflectionChecks = new IterableNodeDeque();
	}

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		garbageValue = "1935543269",
		signature = "(ZLkd;I)V"
	)
	@Export("loadRegions")
	static final void loadRegions(boolean var0, PacketBuffer var1) {
		Client.isInInstance = var0;
		int var2;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		if (!Client.isInInstance) {
			var2 = var1.method5728();
			int var3 = var1.method5727();
			var4 = var1.readUnsignedShort();
			Bounds.xteaKeys = new int[var4][4];

			for (var5 = 0; var5 < var4; ++var5) {
				for (var6 = 0; var6 < 4; ++var6) {
					Bounds.xteaKeys[var5][var6] = var1.readInt();
				}
			}

			class238.regions = new int[var4];
			class92.regionMapArchiveIds = new int[var4];
			MusicPatchNode2.regionLandArchiveIds = new int[var4];
			class2.regionLandArchives = new byte[var4][];
			Interpreter.regionMapArchives = new byte[var4][];
			boolean var16 = false;
			if ((var3 / 8 == 48 || var3 / 8 == 49) && var2 / 8 == 48) {
				var16 = true;
			}

			if (var3 / 8 == 48 && var2 / 8 == 148) {
				var16 = true;
			}

			var4 = 0;

			for (var6 = (var3 - 6) / 8; var6 <= (var3 + 6) / 8; ++var6) {
				for (var7 = (var2 - 6) / 8; var7 <= (var2 + 6) / 8; ++var7) {
					var8 = var7 + (var6 << 8);
					if (!var16 || var7 != 49 && var7 != 149 && var7 != 147 && var6 != 50 && (var6 != 49 || var7 != 47)) {
						class238.regions[var4] = var8;
						class92.regionMapArchiveIds[var4] = class8.archive5.getGroupId("m" + var6 + "_" + var7);
						MusicPatchNode2.regionLandArchiveIds[var4] = class8.archive5.getGroupId("l" + var6 + "_" + var7);
						++var4;
					}
				}
			}

			PcmPlayer.method2661(var3, var2, true);
		} else {
			var2 = var1.method5729();
			boolean var15 = var1.method5776() == 1;
			var4 = var1.method5727();
			var5 = var1.readUnsignedShort();
			var1.importIndex();

			int var9;
			for (var6 = 0; var6 < 4; ++var6) {
				for (var7 = 0; var7 < 13; ++var7) {
					for (var8 = 0; var8 < 13; ++var8) {
						var9 = var1.readBits(1);
						if (var9 == 1) {
							Client.instanceChunkTemplates[var6][var7][var8] = var1.readBits(26);
						} else {
							Client.instanceChunkTemplates[var6][var7][var8] = -1;
						}
					}
				}
			}

			var1.exportIndex();
			Bounds.xteaKeys = new int[var5][4];

			for (var6 = 0; var6 < var5; ++var6) {
				for (var7 = 0; var7 < 4; ++var7) {
					Bounds.xteaKeys[var6][var7] = var1.readInt();
				}
			}

			class238.regions = new int[var5];
			class92.regionMapArchiveIds = new int[var5];
			MusicPatchNode2.regionLandArchiveIds = new int[var5];
			class2.regionLandArchives = new byte[var5][];
			Interpreter.regionMapArchives = new byte[var5][];
			var5 = 0;

			for (var6 = 0; var6 < 4; ++var6) {
				for (var7 = 0; var7 < 13; ++var7) {
					for (var8 = 0; var8 < 13; ++var8) {
						var9 = Client.instanceChunkTemplates[var6][var7][var8];
						if (var9 != -1) {
							int var10 = var9 >> 14 & 1023;
							int var11 = var9 >> 3 & 2047;
							int var12 = (var10 / 8 << 8) + var11 / 8;

							int var13;
							for (var13 = 0; var13 < var5; ++var13) {
								if (class238.regions[var13] == var12) {
									var12 = -1;
									break;
								}
							}

							if (var12 != -1) {
								class238.regions[var5] = var12;
								var13 = var12 >> 8 & 255;
								int var14 = var12 & 255;
								class92.regionMapArchiveIds[var5] = class8.archive5.getGroupId("m" + var13 + "_" + var14);
								MusicPatchNode2.regionLandArchiveIds[var5] = class8.archive5.getGroupId("l" + var13 + "_" + var14);
								++var5;
							}
						}
					}
				}
			}

			PcmPlayer.method2661(var4, var2, !var15);
		}

	}

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		garbageValue = "1205267134",
		signature = "(I)V"
	)
	@Export("FriendSystem_invalidateFriends")
	static final void FriendSystem_invalidateFriends() {
		for (int var0 = 0; var0 < Players.Players_count; ++var0) {
			Player var1 = Client.players[Players.Players_indices[var0]];
			var1.clearIsFriend();
		}

		RouteStrategy.method3795();
		if (WorldMapID.clanChat != null) {
			WorldMapID.clanChat.clearFriends();
		}

	}
}
