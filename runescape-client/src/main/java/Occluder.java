import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hy")
@Implements("Occluder")
public final class Occluder {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1667496443
	)
	@Export("minTileX")
	int minTileX;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1607339701
	)
	@Export("maxTileX")
	int maxTileX;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1327290645
	)
	@Export("minTileY")
	int minTileY;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1032573123
	)
	@Export("maxTileY")
	int maxTileY;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1960990691
	)
	@Export("type")
	int type;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1746160959
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1167261617
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1218503837
	)
	@Export("minZ")
	int minZ;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1421337339
	)
	@Export("maxZ")
	int maxZ;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 2056353609
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 621909479
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 880103251
	)
	int field2510;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1489264085
	)
	int field2507;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -2075749697
	)
	int field2508;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1502323289
	)
	int field2509;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1403810903
	)
	int field2495;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -340736711
	)
	int field2506;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1370877385
	)
	int field2511;

	Occluder() {
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[SIIB)V",
		garbageValue = "0"
	)
	@Export("sortItemsByName")
	public static void sortItemsByName(String[] var0, short[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			String var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			short var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var8 = var2; var8 < var3; ++var8) {
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
					String var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					short var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			sortItemsByName(var0, var1, var2, var5 - 1);
			sortItemsByName(var0, var1, var5 + 1, var3);
		}

	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2100168808"
	)
	public static void method4221() {
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
			if (ArchiveDiskActionHandler.field3998 != 0) {
				ArchiveDiskActionHandler.field3998 = 1;

				try {
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock.wait();
				} catch (InterruptedException var3) {
				}
			}

		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1785001872"
	)
	public static int method4220(int var0) {
		return class402.field4445[var0 & 16383];
	}

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "(Lja;I)V",
		garbageValue = "791986228"
	)
	static final void method4222(class263 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer;
		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		if (class263.field3064 == var0) {
			var2 = var1.readUnsignedShort();
			var3 = var1.readUnsignedByte();
			var4 = (var3 >> 4 & 7) + class145.field1690;
			var5 = (var3 & 7) + class321.field4076;
			var6 = var1.method7545();
			var7 = var6 >> 4 & 15;
			var8 = var6 & 7;
			var9 = var1.method7593();
			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
				var10 = var7 + 1;
				if (ModelData0.localPlayer.pathX[0] >= var4 - var10 && ModelData0.localPlayer.pathX[0] <= var10 + var4 && ModelData0.localPlayer.pathY[0] >= var5 - var10 && ModelData0.localPlayer.pathY[0] <= var10 + var5 && class12.clientPreferences.method2239() != 0 && var8 > 0 && Client.soundEffectCount < 50) {
					Client.soundEffectIds[Client.soundEffectCount] = var2;
					Client.queuedSoundEffectLoops[Client.soundEffectCount] = var8;
					Client.queuedSoundEffectDelays[Client.soundEffectCount] = var9;
					Client.soundEffects[Client.soundEffectCount] = null;
					Client.soundLocations[Client.soundEffectCount] = var7 + (var5 << 8) + (var4 << 16);
					++Client.soundEffectCount;
				}
			}
		}

		TileItem var35;
		if (class263.field3066 == var0) {
			var2 = var1.method7593();
			var3 = (var2 >> 4 & 7) + class145.field1690;
			var4 = (var2 & 7) + class321.field4076;
			var5 = var1.method7554();
			var6 = var1.method7716();
			if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
				var35 = new TileItem();
				var35.id = var6;
				var35.quantity = var5;
				if (Client.groundItems[class128.Client_plane][var3][var4] == null) {
					Client.groundItems[class128.Client_plane][var3][var4] = new NodeDeque();
				}

				Client.groundItems[class128.Client_plane][var3][var4].addFirst(var35);
				Frames.updateItemPile(var3, var4);
			}

		} else if (class263.field3068 == var0) {
			var2 = var1.readUnsignedShort();
			var3 = var1.method7593();
			var4 = var3 >> 2;
			var5 = var3 & 3;
			var6 = Client.field553[var4];
			var7 = var1.readUnsignedByte();
			var8 = (var7 >> 4 & 7) + class145.field1690;
			var9 = (var7 & 7) + class321.field4076;
			if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) {
				class221.updatePendingSpawn(class128.Client_plane, var8, var9, var6, var2, var4, var5, 0, -1);
			}

		} else if (class263.field3058 == var0) {
			var2 = var1.method7545();
			var3 = (var2 >> 4 & 7) + class145.field1690;
			var4 = (var2 & 7) + class321.field4076;
			var5 = var1.readUnsignedShort();
			var6 = var1.method7576();
			var7 = var1.method7576();
			if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
				NodeDeque var43 = Client.groundItems[class128.Client_plane][var3][var4];
				if (var43 != null) {
					for (TileItem var36 = (TileItem)var43.last(); var36 != null; var36 = (TileItem)var43.previous()) {
						if ((var7 & 32767) == var36.id && var6 == var36.quantity) {
							var36.quantity = var5;
							break;
						}
					}

					Frames.updateItemPile(var3, var4);
				}
			}

		} else if (class263.field3063 == var0) {
			var2 = var1.method7716();
			var3 = var1.method7545();
			var4 = (var3 >> 4 & 7) + class145.field1690;
			var5 = (var3 & 7) + class321.field4076;
			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
				NodeDeque var34 = Client.groundItems[class128.Client_plane][var4][var5];
				if (var34 != null) {
					for (var35 = (TileItem)var34.last(); var35 != null; var35 = (TileItem)var34.previous()) {
						if ((var2 & 32767) == var35.id) {
							var35.remove();
							break;
						}
					}

					if (var34.last() == null) {
						Client.groundItems[class128.Client_plane][var4][var5] = null;
					}

					Frames.updateItemPile(var4, var5);
				}
			}

		} else if (class263.field3059 == var0) {
			var2 = var1.method7545();
			var3 = (var2 >> 4 & 7) + class145.field1690;
			var4 = (var2 & 7) + class321.field4076;
			var5 = var1.method7593();
			var6 = var5 >> 2;
			var7 = var5 & 3;
			var8 = Client.field553[var6];
			if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
				class221.updatePendingSpawn(class128.Client_plane, var3, var4, var8, -1, var6, var7, 0, -1);
			}

		} else if (class263.field3071 == var0) {
			var2 = var1.method7546();
			var3 = (var2 >> 4 & 7) + class145.field1690;
			var4 = (var2 & 7) + class321.field4076;
			var5 = var1.method7545();
			var6 = var1.method7716();
			var7 = var1.method7716();
			if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
				var3 = var3 * 128 + 64;
				var4 = var4 * 128 + 64;
				GraphicsObject var33 = new GraphicsObject(var7, class128.Client_plane, var3, var4, class202.getTileHeight(var3, var4, class128.Client_plane) - var5, var6, Client.cycle);
				Client.graphicsObjects.addFirst(var33);
			}

		} else {
			int var11;
			int var12;
			int var13;
			int var14;
			byte var37;
			if (class263.field3060 == var0) {
				var2 = var1.method7556();
				var3 = var1.method7716();
				var37 = var1.method7549();
				var5 = var1.method7545();
				var6 = (var5 >> 4 & 7) + class145.field1690;
				var7 = (var5 & 7) + class321.field4076;
				var8 = var1.method7576();
				var9 = var1.readUnsignedShort();
				var10 = var1.readUnsignedByte() * 4;
				var11 = var1.method7546();
				var12 = var1.method7545() * 4;
				var13 = var1.method7546();
				byte var39 = var1.method7549();
				var14 = var39 + var6;
				var4 = var37 + var7;
				if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104 && var14 >= 0 && var4 >= 0 && var14 < 104 && var4 < 104 && var3 != 65535) {
					var6 = var6 * 128 + 64;
					var7 = var7 * 128 + 64;
					var14 = var14 * 128 + 64;
					var4 = var4 * 128 + 64;
					Projectile var32 = new Projectile(var3, class128.Client_plane, var6, var7, class202.getTileHeight(var6, var7, class128.Client_plane) - var12, var8 + Client.cycle, var9 + Client.cycle, var13, var11, var2, var10);
					var32.setDestination(var14, var4, class202.getTileHeight(var14, var4, class128.Client_plane) - var10, var8 + Client.cycle);
					Client.projectiles.addFirst(var32);
				}

			} else {
				if (class263.field3062 == var0) {
					var2 = var1.method7554();
					var3 = var1.method7716();
					var37 = var1.method7547();
					var5 = var1.method7546();
					var6 = (var5 >> 4 & 7) + class145.field1690;
					var7 = (var5 & 7) + class321.field4076;
					var8 = var1.method7554();
					var9 = var1.readUnsignedShort();
					byte var38 = var1.method7547();
					var11 = var1.readUnsignedByte();
					var12 = var11 >> 2;
					var13 = var11 & 3;
					var14 = Client.field553[var12];
					byte var15 = var1.method7547();
					byte var16 = var1.method7547();
					Player var17;
					if (var2 == Client.localPlayerIndex) {
						var17 = ModelData0.localPlayer;
					} else {
						var17 = Client.players[var2];
					}

					if (var17 != null) {
						ObjectComposition var18 = class82.getObjectDefinition(var3);
						int var19;
						int var20;
						if (var13 != 1 && var13 != 3) {
							var19 = var18.sizeX;
							var20 = var18.sizeY;
						} else {
							var19 = var18.sizeY;
							var20 = var18.sizeX;
						}

						int var21 = var6 + (var19 >> 1);
						int var22 = var6 + (var19 + 1 >> 1);
						int var23 = var7 + (var20 >> 1);
						int var24 = var7 + (var20 + 1 >> 1);
						int[][] var25 = Tiles.Tiles_heights[class128.Client_plane];
						int var26 = var25[var22][var24] + var25[var21][var23] + var25[var22][var23] + var25[var21][var24] >> 2;
						int var27 = (var6 << 7) + (var19 << 6);
						int var28 = (var7 << 7) + (var20 << 6);
						Model var29 = var18.getModel(var12, var13, var25, var27, var26, var28);
						if (var29 != null) {
							class221.updatePendingSpawn(class128.Client_plane, var6, var7, var14, -1, 0, 0, var9 + 1, var8 + 1);
							var17.animationCycleStart = var9 + Client.cycle;
							var17.animationCycleEnd = var8 + Client.cycle;
							var17.model0 = var29;
							var17.field1104 = var6 * 128 + var19 * 64;
							var17.field1106 = var7 * 128 + var20 * 64;
							var17.tileHeight2 = var26;
							byte var30;
							if (var38 > var16) {
								var30 = var38;
								var38 = var16;
								var16 = var30;
							}

							if (var37 > var15) {
								var30 = var37;
								var37 = var15;
								var15 = var30;
							}

							var17.minX = var6 + var38;
							var17.maxX = var16 + var6;
							var17.minY = var37 + var7;
							var17.maxY = var7 + var15;
						}
					}
				}

				if (class263.field3067 == var0) {
					var2 = var1.method7593();
					var3 = var2 >> 2;
					var4 = var2 & 3;
					var5 = Client.field553[var3];
					var6 = var1.method7546();
					var7 = (var6 >> 4 & 7) + class145.field1690;
					var8 = (var6 & 7) + class321.field4076;
					var9 = var1.method7554();
					if (var7 >= 0 && var8 >= 0 && var7 < 103 && var8 < 103) {
						if (var5 == 0) {
							WallObject var31 = class175.scene.method4147(class128.Client_plane, var7, var8);
							if (var31 != null) {
								var11 = NetSocket.Entity_unpackID(var31.tag);
								if (var3 == 2) {
									var31.renderable1 = new DynamicObject(var11, 2, var4 + 4, class128.Client_plane, var7, var8, var9, false, var31.renderable1);
									var31.renderable2 = new DynamicObject(var11, 2, var4 + 1 & 3, class128.Client_plane, var7, var8, var9, false, var31.renderable2);
								} else {
									var31.renderable1 = new DynamicObject(var11, var3, var4, class128.Client_plane, var7, var8, var9, false, var31.renderable1);
								}
							}
						}

						if (var5 == 1) {
							DecorativeObject var40 = class175.scene.method4049(class128.Client_plane, var7, var8);
							if (var40 != null) {
								var11 = NetSocket.Entity_unpackID(var40.tag);
								if (var3 != 4 && var3 != 5) {
									if (var3 == 6) {
										var40.renderable1 = new DynamicObject(var11, 4, var4 + 4, class128.Client_plane, var7, var8, var9, false, var40.renderable1);
									} else if (var3 == 7) {
										var40.renderable1 = new DynamicObject(var11, 4, (var4 + 2 & 3) + 4, class128.Client_plane, var7, var8, var9, false, var40.renderable1);
									} else if (var3 == 8) {
										var40.renderable1 = new DynamicObject(var11, 4, var4 + 4, class128.Client_plane, var7, var8, var9, false, var40.renderable1);
										var40.renderable2 = new DynamicObject(var11, 4, (var4 + 2 & 3) + 4, class128.Client_plane, var7, var8, var9, false, var40.renderable2);
									}
								} else {
									var40.renderable1 = new DynamicObject(var11, 4, var4, class128.Client_plane, var7, var8, var9, false, var40.renderable1);
								}
							}
						}

						if (var5 == 2) {
							GameObject var41 = class175.scene.getGameObject(class128.Client_plane, var7, var8);
							if (var3 == 11) {
								var3 = 10;
							}

							if (var41 != null) {
								var41.renderable = new DynamicObject(NetSocket.Entity_unpackID(var41.tag), var3, var4, class128.Client_plane, var7, var8, var9, false, var41.renderable);
							}
						}

						if (var5 == 3) {
							GroundObject var42 = class175.scene.getGroundObject(class128.Client_plane, var7, var8);
							if (var42 != null) {
								var42.renderable = new DynamicObject(NetSocket.Entity_unpackID(var42.tag), 22, var4, class128.Client_plane, var7, var8, var9, false, var42.renderable);
							}
						}
					}

				}
			}
		}
	}
}
