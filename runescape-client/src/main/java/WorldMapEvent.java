import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("it")
@Implements("WorldMapEvent")
public class WorldMapEvent {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1384072805
	)
	@Export("mapElement")
	public int mapElement;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("coord1")
	public Coord coord1;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("coord2")
	public Coord coord2;

	@ObfuscatedSignature(
		descriptor = "(ILkd;Lkd;)V"
	)
	public WorldMapEvent(int var1, Coord var2, Coord var3) {
		this.mapElement = var1;
		this.coord1 = var2;
		this.coord2 = var3;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "-2"
	)
	@Export("addGameMessage")
	static void addGameMessage(int var0, String var1, String var2) {
		UserComparator7.addChatMessage(var0, var1, var2, (String)null);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "([BZI)Ljava/lang/Object;",
		garbageValue = "-2126153906"
	)
	public static Object method4929(byte[] var0, boolean var1) {
		if (var0 == null) {
			return null;
		} else if (var0.length > 136) {
			DirectByteArrayCopier var2 = new DirectByteArrayCopier();
			var2.set(var0);
			return var2;
		} else {
			return var0;
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)[Lqw;",
		garbageValue = "-27"
	)
	@Export("FillMode_values")
	public static class450[] FillMode_values() {
		return new class450[]{class450.field4753, class450.field4754, class450.SOLID};
	}

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-1670571059"
	)
	@Export("drawObject")
	static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
		long var5 = class175.scene.getWallObjectTag(var0, var1, var2);
		int var7;
		int var8;
		int var9;
		int var10;
		int var12;
		int var13;
		if (0L != var5) {
			var7 = class175.scene.getObjectFlags(var0, var1, var2, var5);
			var8 = var7 >> 6 & 3;
			var9 = var7 & 31;
			var10 = var3;
			if (LoginPacket.method5022(var5)) {
				var10 = var4;
			}

			int[] var11 = InterfaceParent.sceneMinimapSprite.pixels;
			var12 = var1 * 4 + (103 - var2) * 2048 + 24624;
			var13 = NetSocket.Entity_unpackID(var5);
			ObjectComposition var14 = class82.getObjectDefinition(var13);
			if (var14.mapSceneId != -1) {
				IndexedSprite var15 = class29.mapSceneSprites[var14.mapSceneId];
				if (var15 != null) {
					int var16 = (var14.sizeX * 4 - var15.subWidth) / 2;
					int var17 = (var14.sizeY * 4 - var15.subHeight) / 2;
					var15.drawAt(var1 * 4 + var16 + 48, (104 - var2 - var14.sizeY) * 4 + var17 + 48);
				}
			} else {
				if (var9 == 0 || var9 == 2) {
					if (var8 == 0) {
						var11[var12] = var10;
						var11[var12 + 512] = var10;
						var11[var12 + 1024] = var10;
						var11[var12 + 1536] = var10;
					} else if (var8 == 1) {
						var11[var12] = var10;
						var11[var12 + 1] = var10;
						var11[var12 + 2] = var10;
						var11[var12 + 3] = var10;
					} else if (var8 == 2) {
						var11[var12 + 3] = var10;
						var11[var12 + 512 + 3] = var10;
						var11[var12 + 1024 + 3] = var10;
						var11[var12 + 1536 + 3] = var10;
					} else if (var8 == 3) {
						var11[var12 + 1536] = var10;
						var11[var12 + 1536 + 1] = var10;
						var11[var12 + 1536 + 2] = var10;
						var11[var12 + 1536 + 3] = var10;
					}
				}

				if (var9 == 3) {
					if (var8 == 0) {
						var11[var12] = var10;
					} else if (var8 == 1) {
						var11[var12 + 3] = var10;
					} else if (var8 == 2) {
						var11[var12 + 1536 + 3] = var10;
					} else if (var8 == 3) {
						var11[var12 + 1536] = var10;
					}
				}

				if (var9 == 2) {
					if (var8 == 3) {
						var11[var12] = var10;
						var11[var12 + 512] = var10;
						var11[var12 + 1024] = var10;
						var11[var12 + 1536] = var10;
					} else if (var8 == 0) {
						var11[var12] = var10;
						var11[var12 + 1] = var10;
						var11[var12 + 2] = var10;
						var11[var12 + 3] = var10;
					} else if (var8 == 1) {
						var11[var12 + 3] = var10;
						var11[var12 + 512 + 3] = var10;
						var11[var12 + 1024 + 3] = var10;
						var11[var12 + 1536 + 3] = var10;
					} else if (var8 == 2) {
						var11[var12 + 1536] = var10;
						var11[var12 + 1536 + 1] = var10;
						var11[var12 + 1536 + 2] = var10;
						var11[var12 + 1536 + 3] = var10;
					}
				}
			}
		}

		var5 = class175.scene.getGameObjectTag(var0, var1, var2);
		if (var5 != 0L) {
			var7 = class175.scene.getObjectFlags(var0, var1, var2, var5);
			var8 = var7 >> 6 & 3;
			var9 = var7 & 31;
			var10 = NetSocket.Entity_unpackID(var5);
			ObjectComposition var24 = class82.getObjectDefinition(var10);
			int var19;
			if (var24.mapSceneId != -1) {
				IndexedSprite var20 = class29.mapSceneSprites[var24.mapSceneId];
				if (var20 != null) {
					var13 = (var24.sizeX * 4 - var20.subWidth) / 2;
					var19 = (var24.sizeY * 4 - var20.subHeight) / 2;
					var20.drawAt(var13 + var1 * 4 + 48, var19 + (104 - var2 - var24.sizeY) * 4 + 48);
				}
			} else if (var9 == 9) {
				var12 = 15658734;
				if (LoginPacket.method5022(var5)) {
					var12 = 15597568;
				}

				int[] var18 = InterfaceParent.sceneMinimapSprite.pixels;
				var19 = var1 * 4 + (103 - var2) * 2048 + 24624;
				if (var8 != 0 && var8 != 2) {
					var18[var19] = var12;
					var18[var19 + 1 + 512] = var12;
					var18[var19 + 1024 + 2] = var12;
					var18[var19 + 1536 + 3] = var12;
				} else {
					var18[var19 + 1536] = var12;
					var18[var19 + 1 + 1024] = var12;
					var18[var19 + 512 + 2] = var12;
					var18[var19 + 3] = var12;
				}
			}
		}

		var5 = class175.scene.getGroundObjectTag(var0, var1, var2);
		if (var5 != 0L) {
			var7 = NetSocket.Entity_unpackID(var5);
			ObjectComposition var21 = class82.getObjectDefinition(var7);
			if (var21.mapSceneId != -1) {
				IndexedSprite var22 = class29.mapSceneSprites[var21.mapSceneId];
				if (var22 != null) {
					var10 = (var21.sizeX * 4 - var22.subWidth) / 2;
					int var23 = (var21.sizeY * 4 - var22.subHeight) / 2;
					var22.drawAt(var1 * 4 + var10 + 48, (104 - var2 - var21.sizeY) * 4 + var23 + 48);
				}
			}
		}

	}

	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1650699748"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) {
			Projectile.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3);
		}

		long var4 = -1L;
		long var6 = -1L;

		int var8;
		for (var8 = 0; var8 < class114.method2637(); ++var8) {
			long var23 = class132.method2833(var8);
			if (var6 != var23) {
				var6 = var23;
				int var11 = class17.method236(ViewportMouse.ViewportMouse_entityTags[var8]);
				int var12 = var11;
				int var13 = ClanChannelMember.method2819(var8);
				int var14 = GrandExchangeOfferNameComparator.method5790(var8);
				int var15 = NetSocket.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var8]);
				int var16 = var15;
				if (var14 == 2 && class175.scene.getObjectFlags(class128.Client_plane, var11, var13, var23) >= 0) {
					ObjectComposition var17 = class82.getObjectDefinition(var15);
					if (var17.transforms != null) {
						var17 = var17.transform();
					}

					if (var17 == null) {
						continue;
					}

					if (Client.isItemSelected == 1) {
						Projectile.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + class166.colorStartTag(65535) + var17.name, 1, var15, var11, var13);
					} else if (Client.isSpellSelected) {
						if ((class113.selectedSpellFlags & 4) == 4) {
							Projectile.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class166.colorStartTag(65535) + var17.name, 2, var15, var11, var13);
						}
					} else {
						String[] var18 = var17.actions;
						if (var18 != null) {
							for (int var19 = 4; var19 >= 0; --var19) {
								if (var18[var19] != null) {
									short var20 = 0;
									if (var19 == 0) {
										var20 = 3;
									}

									if (var19 == 1) {
										var20 = 4;
									}

									if (var19 == 2) {
										var20 = 5;
									}

									if (var19 == 3) {
										var20 = 6;
									}

									if (var19 == 4) {
										var20 = 1001;
									}

									Projectile.insertMenuItemNoShift(var18[var19], class166.colorStartTag(65535) + var17.name, var20, var16, var12, var13);
								}
							}
						}

						Projectile.insertMenuItemNoShift("Examine", class166.colorStartTag(65535) + var17.name, 1002, var17.id, var12, var13);
					}
				}

				Player var21;
				int var25;
				NPC var26;
				int var33;
				int[] var34;
				if (var14 == 1) {
					NPC var29 = Client.npcs[var16];
					if (var29 == null) {
						continue;
					}

					if (var29.definition.size == 1 && (var29.x & 127) == 64 && (var29.y & 127) == 64) {
						for (var25 = 0; var25 < Client.npcCount; ++var25) {
							var26 = Client.npcs[Client.npcIndices[var25]];
							if (var26 != null && var26 != var29 && var26.definition.size == 1 && var26.x == var29.x && var26.y == var29.y) {
								WorldMapLabelSize.addNpcToMenu(var26, Client.npcIndices[var25], var12, var13);
							}
						}

						var25 = Players.Players_count;
						var34 = Players.Players_indices;

						for (var33 = 0; var33 < var25; ++var33) {
							var21 = Client.players[var34[var33]];
							if (var21 != null && var29.x == var21.x && var29.y == var21.y) {
								ApproximateRouteStrategy.addPlayerToMenu(var21, var34[var33], var12, var13);
							}
						}
					}

					WorldMapLabelSize.addNpcToMenu(var29, var16, var12, var13);
				}

				if (var14 == 0) {
					Player var30 = Client.players[var16];
					if (var30 == null) {
						continue;
					}

					if ((var30.x & 127) == 64 && (var30.y & 127) == 64) {
						for (var25 = 0; var25 < Client.npcCount; ++var25) {
							var26 = Client.npcs[Client.npcIndices[var25]];
							if (var26 != null && var26.definition.size == 1 && var26.x == var30.x && var30.y == var26.y) {
								WorldMapLabelSize.addNpcToMenu(var26, Client.npcIndices[var25], var12, var13);
							}
						}

						var25 = Players.Players_count;
						var34 = Players.Players_indices;

						for (var33 = 0; var33 < var25; ++var33) {
							var21 = Client.players[var34[var33]];
							if (var21 != null && var21 != var30 && var21.x == var30.x && var30.y == var21.y) {
								ApproximateRouteStrategy.addPlayerToMenu(var21, var34[var33], var12, var13);
							}
						}
					}

					if (var16 != Client.combatTargetPlayerIndex) {
						ApproximateRouteStrategy.addPlayerToMenu(var30, var16, var12, var13);
					} else {
						var4 = var23;
					}
				}

				if (var14 == 3) {
					NodeDeque var32 = Client.groundItems[class128.Client_plane][var12][var13];
					if (var32 != null) {
						for (TileItem var31 = (TileItem)var32.first(); var31 != null; var31 = (TileItem)var32.next()) {
							ItemComposition var35 = FileSystem.ItemDefinition_get(var31.id);
							if (Client.isItemSelected == 1) {
								Projectile.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + class166.colorStartTag(16748608) + var35.name, 16, var31.id, var12, var13);
							} else if (Client.isSpellSelected) {
								if ((class113.selectedSpellFlags & 1) == 1) {
									Projectile.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class166.colorStartTag(16748608) + var35.name, 17, var31.id, var12, var13);
								}
							} else {
								String[] var27 = var35.groundActions;

								for (int var28 = 4; var28 >= 0; --var28) {
									if (var27 != null && var27[var28] != null) {
										byte var22 = 0;
										if (var28 == 0) {
											var22 = 18;
										}

										if (var28 == 1) {
											var22 = 19;
										}

										if (var28 == 2) {
											var22 = 20;
										}

										if (var28 == 3) {
											var22 = 21;
										}

										if (var28 == 4) {
											var22 = 22;
										}

										Projectile.insertMenuItemNoShift(var27[var28], class166.colorStartTag(16748608) + var35.name, var22, var31.id, var12, var13);
									} else if (var28 == 2) {
										Projectile.insertMenuItemNoShift("Take", class166.colorStartTag(16748608) + var35.name, 20, var31.id, var12, var13);
									}
								}

								Projectile.insertMenuItemNoShift("Examine", class166.colorStartTag(16748608) + var35.name, 1004, var31.id, var12, var13);
							}
						}
					}
				}
			}
		}

		if (-1L != var4) {
			var8 = class17.method236(var4);
			int var9 = ScriptEvent.method2085(var4);
			Player var10 = Client.players[Client.combatTargetPlayerIndex];
			ApproximateRouteStrategy.addPlayerToMenu(var10, Client.combatTargetPlayerIndex, var8, var9);
		}

	}
}
