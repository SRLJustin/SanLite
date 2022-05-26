import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("q")
public class class1 implements Callable {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("HitSplatDefinition_fontsArchive")
	static AbstractArchive HitSplatDefinition_fontsArchive;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Let;"
	)
	static ClanChannel field2;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	final Buffer field1;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lk;"
	)
	final class3 field3;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ls;"
	)
	final class7 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ls;Lpx;Lk;)V"
	)
	class1(class7 var1, Buffer var2, class3 var3) {
		this.this$0 = var1;
		this.field1 = var2;
		this.field3 = var3;
	}

	public Object call() {
		return this.field3.vmethod19(this.field1);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Lge;",
		garbageValue = "1539440730"
	)
	public static VarbitComposition method9(int var0) {
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

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lpc;II)V",
		garbageValue = "-285491852"
	)
	@Export("updatePlayers")
	static final void updatePlayers(PacketBuffer var0, int var1) {
		int var2 = var0.offset;
		Players.Players_pendingUpdateCount = 0;
		int var3 = 0;
		var0.importIndex();

		byte[] var10000;
		int var4;
		int var6;
		int var7;
		for (var4 = 0; var4 < Players.Players_count; ++var4) {
			var7 = Players.Players_indices[var4];
			if ((Players.field1301[var7] & 1) == 0) {
				if (var3 > 0) {
					--var3;
					var10000 = Players.field1301;
					var10000[var7] = (byte)(var10000[var7] | 2);
				} else {
					var6 = var0.readBits(1);
					if (var6 == 0) {
						var3 = class18.method249(var0);
						var10000 = Players.field1301;
						var10000[var7] = (byte)(var10000[var7] | 2);
					} else {
						class230.readPlayerUpdate(var0, var7);
					}
				}
			}
		}

		var0.exportIndex();
		if (var3 != 0) {
			throw new RuntimeException();
		} else {
			var0.importIndex();

			for (var4 = 0; var4 < Players.Players_count; ++var4) {
				var7 = Players.Players_indices[var4];
				if ((Players.field1301[var7] & 1) != 0) {
					if (var3 > 0) {
						--var3;
						var10000 = Players.field1301;
						var10000[var7] = (byte)(var10000[var7] | 2);
					} else {
						var6 = var0.readBits(1);
						if (var6 == 0) {
							var3 = class18.method249(var0);
							var10000 = Players.field1301;
							var10000[var7] = (byte)(var10000[var7] | 2);
						} else {
							class230.readPlayerUpdate(var0, var7);
						}
					}
				}
			}

			var0.exportIndex();
			if (var3 != 0) {
				throw new RuntimeException();
			} else {
				var0.importIndex();

				for (var4 = 0; var4 < Players.Players_emptyIdxCount; ++var4) {
					var7 = Players.Players_emptyIndices[var4];
					if ((Players.field1301[var7] & 1) != 0) {
						if (var3 > 0) {
							--var3;
							var10000 = Players.field1301;
							var10000[var7] = (byte)(var10000[var7] | 2);
						} else {
							var6 = var0.readBits(1);
							if (var6 == 0) {
								var3 = class18.method249(var0);
								var10000 = Players.field1301;
								var10000[var7] = (byte)(var10000[var7] | 2);
							} else if (FloorUnderlayDefinition.updateExternalPlayer(var0, var7)) {
								var10000 = Players.field1301;
								var10000[var7] = (byte)(var10000[var7] | 2);
							}
						}
					}
				}

				var0.exportIndex();
				if (var3 != 0) {
					throw new RuntimeException();
				} else {
					var0.importIndex();

					for (var4 = 0; var4 < Players.Players_emptyIdxCount; ++var4) {
						var7 = Players.Players_emptyIndices[var4];
						if ((Players.field1301[var7] & 1) == 0) {
							if (var3 > 0) {
								--var3;
								var10000 = Players.field1301;
								var10000[var7] = (byte)(var10000[var7] | 2);
							} else {
								var6 = var0.readBits(1);
								if (var6 == 0) {
									var3 = class18.method249(var0);
									var10000 = Players.field1301;
									var10000[var7] = (byte)(var10000[var7] | 2);
								} else if (FloorUnderlayDefinition.updateExternalPlayer(var0, var7)) {
									var10000 = Players.field1301;
									var10000[var7] = (byte)(var10000[var7] | 2);
								}
							}
						}
					}

					var0.exportIndex();
					if (var3 != 0) {
						throw new RuntimeException();
					} else {
						Players.Players_count = 0;
						Players.Players_emptyIdxCount = 0;

						Player var5;
						for (var4 = 1; var4 < 2048; ++var4) {
							var10000 = Players.field1301;
							var10000[var4] = (byte)(var10000[var4] >> 1);
							var5 = Client.players[var4];
							if (var5 != null) {
								Players.Players_indices[++Players.Players_count - 1] = var4;
							} else {
								Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var4;
							}
						}

						for (var3 = 0; var3 < Players.Players_pendingUpdateCount; ++var3) {
							var4 = Players.Players_pendingUpdateIndices[var3];
							var5 = Client.players[var4];
							var6 = var0.readUnsignedByte();
							if ((var6 & 2) != 0) {
								var6 += var0.readUnsignedByte() << 8;
							}

							GrandExchangeOfferNameComparator.method5786(var0, var4, var5, var6);
						}

						if (var0.offset - var2 != var1) {
							throw new RuntimeException(var0.offset - var2 + " " + var1);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "0"
	)
	public static int method12(int var0, int var1) {
		return (int)Math.round(Math.atan2((double)var0, (double)var1) * 2607.5945876176133D) & 16383;
	}

	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1026103514"
	)
	static final void method11() {
		int var0 = Players.field1317 * 16384 + 64;
		int var1 = TileItem.field1292 * 128 + 64;
		int var2 = class202.getTileHeight(var0, var1, class128.Client_plane) - WorldMapSection1.field2898;
		class422.method7303(var0, var2, var1);
		var0 = class267.field3206 * 128 + 64;
		var1 = AbstractWorldMapData.field2851 * 16384 + 64;
		var2 = class202.getTileHeight(var0, var1, class128.Client_plane) - ScriptFrame.field457;
		int var3 = var0 - class343.cameraX;
		int var4 = var2 - class295.cameraY;
		int var5 = var1 - FaceNormal.cameraZ;
		int var6 = (int)Math.sqrt((double)(var3 * var3 + var5 * var5));
		int var7 = (int)(Math.atan2((double)var4, (double)var6) * 325.9490051269531D) & 2047;
		int var8 = (int)(Math.atan2((double)var3, (double)var5) * -325.9490051269531D) & 2047;
		class241.method4813(var7, var8);
	}
}
