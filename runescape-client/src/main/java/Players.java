import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cl")
@Implements("Players")
public class Players {
	@ObfuscatedName("sh")
	@ObfuscatedGetter(
		intValue = -2098953344
	)
	static int field1317;
	@ObfuscatedName("l")
	static byte[] field1301;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "[Lgd;"
	)
	static class193[] field1302;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "[Lpx;"
	)
	static Buffer[] field1307;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -193801041
	)
	@Export("Players_count")
	static int Players_count;
	@ObfuscatedName("p")
	@Export("Players_indices")
	static int[] Players_indices;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1455321023
	)
	@Export("Players_emptyIdxCount")
	static int Players_emptyIdxCount;
	@ObfuscatedName("r")
	@Export("Players_emptyIndices")
	static int[] Players_emptyIndices;
	@ObfuscatedName("v")
	@Export("Players_regions")
	static int[] Players_regions;
	@ObfuscatedName("y")
	@Export("Players_orientations")
	static int[] Players_orientations;
	@ObfuscatedName("c")
	@Export("Players_targetIndices")
	static int[] Players_targetIndices;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1176869757
	)
	@Export("Players_pendingUpdateCount")
	static int Players_pendingUpdateCount;
	@ObfuscatedName("b")
	@Export("Players_pendingUpdateIndices")
	static int[] Players_pendingUpdateIndices;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	static Buffer field1306;

	static {
		field1301 = new byte[2048];
		field1302 = new class193[2048];
		field1307 = new Buffer[2048];
		Players_count = 0;
		Players_indices = new int[2048];
		Players_emptyIdxCount = 0;
		Players_emptyIndices = new int[2048];
		Players_regions = new int[2048];
		Players_orientations = new int[2048];
		Players_targetIndices = new int[2048];
		Players_pendingUpdateCount = 0;
		Players_pendingUpdateIndices = new int[2048];
		field1306 = new Buffer(new byte[5000]);
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-145581238"
	)
	public static boolean method2427() {
		try {
			if (class273.musicPlayerStatus == 2) {
				if (class273.musicTrack == null) {
					class273.musicTrack = MusicTrack.readTrack(ClanChannelMember.musicTrackArchive, StructComposition.musicTrackGroupId, FriendsList.musicTrackFileId);
					if (class273.musicTrack == null) {
						return false;
					}
				}

				if (class152.soundCache == null) {
					class152.soundCache = new SoundCache(class273.soundEffectsArchive, class462.musicSamplesArchive);
				}

				if (class273.midiPcmStream.loadMusicTrack(class273.musicTrack, class273.musicPatchesArchive, class152.soundCache, 22050)) {
					class273.midiPcmStream.clearAll();
					class273.midiPcmStream.setPcmStreamVolume(Clock.musicTrackVolume);
					class273.midiPcmStream.setMusicTrack(class273.musicTrack, VertexNormal.musicTrackBoolean);
					class273.musicPlayerStatus = 0;
					class273.musicTrack = null;
					class152.soundCache = null;
					ClanChannelMember.musicTrackArchive = null;
					return true;
				}
			}
		} catch (Exception var1) {
			var1.printStackTrace();
			class273.midiPcmStream.clear();
			class273.musicPlayerStatus = 0;
			class273.musicTrack = null;
			class152.soundCache = null;
			ClanChannelMember.musicTrackArchive = null;
		}

		return false;
	}

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "(Lki;II)I",
		garbageValue = "-1939093407"
	)
	static final int method2413(Widget var0, int var1) {
		if (var0.cs1Instructions != null && var1 < var0.cs1Instructions.length) {
			try {
				int[] var2 = var0.cs1Instructions[var1];
				int var3 = 0;
				int var4 = 0;
				byte var5 = 0;

				while (true) {
					int var6 = var2[var4++];
					int var7 = 0;
					byte var8 = 0;
					if (var6 == 0) {
						return var3;
					}

					if (var6 == 1) {
						var7 = Client.currentLevels[var2[var4++]];
					}

					if (var6 == 2) {
						var7 = Client.levels[var2[var4++]];
					}

					if (var6 == 3) {
						var7 = Client.experience[var2[var4++]];
					}

					int var9;
					Widget var10;
					int var11;
					int var12;
					if (var6 == 4) {
						var9 = var2[var4++] << 16;
						var9 += var2[var4++];
						var10 = class92.getWidget(var9);
						var11 = var2[var4++];
						if (var11 != -1 && (!FileSystem.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) {
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) {
								if (var11 + 1 == var10.itemIds[var12]) {
									var7 += var10.itemQuantities[var12];
								}
							}
						}
					}

					if (var6 == 5) {
						var7 = Varps.Varps_main[var2[var4++]];
					}

					if (var6 == 6) {
						var7 = Skills.Skills_experienceTable[Client.levels[var2[var4++]] - 1];
					}

					if (var6 == 7) {
						var7 = Varps.Varps_main[var2[var4++]] * 100 / 46875;
					}

					if (var6 == 8) {
						var7 = ModelData0.localPlayer.combatLevel;
					}

					if (var6 == 9) {
						for (var9 = 0; var9 < 25; ++var9) {
							if (Skills.Skills_enabled[var9]) {
								var7 += Client.levels[var9];
							}
						}
					}

					if (var6 == 10) {
						var9 = var2[var4++] << 16;
						var9 += var2[var4++];
						var10 = class92.getWidget(var9);
						var11 = var2[var4++];
						if (var11 != -1 && (!FileSystem.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) {
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) {
								if (var11 + 1 == var10.itemIds[var12]) {
									var7 = 999999999;
									break;
								}
							}
						}
					}

					if (var6 == 11) {
						var7 = Client.runEnergy;
					}

					if (var6 == 12) {
						var7 = Client.weight;
					}

					if (var6 == 13) {
						var9 = Varps.Varps_main[var2[var4++]];
						int var13 = var2[var4++];
						var7 = (var9 & 1 << var13) != 0 ? 1 : 0;
					}

					if (var6 == 14) {
						var9 = var2[var4++];
						var7 = class18.getVarbit(var9);
					}

					if (var6 == 15) {
						var8 = 1;
					}

					if (var6 == 16) {
						var8 = 2;
					}

					if (var6 == 17) {
						var8 = 3;
					}

					if (var6 == 18) {
						var7 = SecureRandomCallable.baseX * 64 + (ModelData0.localPlayer.x >> 7);
					}

					if (var6 == 19) {
						var7 = GrandExchangeOfferOwnWorldComparator.baseY * 64 + (ModelData0.localPlayer.y >> 7);
					}

					if (var6 == 20) {
						var7 = var2[var4++];
					}

					if (var8 == 0) {
						if (var5 == 0) {
							var3 += var7;
						}

						if (var5 == 1) {
							var3 -= var7;
						}

						if (var5 == 2 && var7 != 0) {
							var3 /= var7;
						}

						if (var5 == 3) {
							var3 *= var7;
						}

						var5 = 0;
					} else {
						var5 = var8;
					}
				}
			} catch (Exception var14) {
				return -1;
			}
		} else {
			return -2;
		}
	}

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "4"
	)
	static void method2426(int var0) {
		class116.tempMenuAction = new MenuAction();
		class116.tempMenuAction.param0 = Client.menuArguments1[var0];
		class116.tempMenuAction.param1 = Client.menuArguments2[var0];
		class116.tempMenuAction.opcode = Client.menuOpcodes[var0];
		class116.tempMenuAction.identifier = Client.menuIdentifiers[var0];
		class116.tempMenuAction.action = Client.menuActions[var0];
	}
}
