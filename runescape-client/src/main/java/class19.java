import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("h")
public class class19 {
	@ObfuscatedName("o")
	Future field102;
	@ObfuscatedName("q")
	String field99;

	class19(Future var1) {
		this.field102 = var1;
	}

	class19(String var1) {
		this.method266(var1);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1815687689"
	)
	void method266(String var1) {
		if (var1 == null) {
			var1 = "";
		}

		this.field99 = var1;
		if (this.field102 != null) {
			this.field102.cancel(true);
			this.field102 = null;
		}

	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "124"
	)
	public final String method251() {
		return this.field99;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "945569393"
	)
	public boolean method250() {
		return this.field99 != null || this.field102 == null;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2011901158"
	)
	public final boolean method253() {
		return this.method250() ? true : this.field102.isDone();
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)Ld;",
		garbageValue = "-37"
	)
	public final class21 method254() {
		if (this.method250()) {
			return new class21(this.field99);
		} else if (!this.method253()) {
			return null;
		} else {
			try {
				return (class21)this.field102.get();
			} catch (Exception var3) {
				String var2 = "Error retrieving REST request reply";
				System.err.println(var2 + "\r\n" + var3);
				this.method266(var2);
				return new class21(var2);
			}
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "20278847"
	)
	public static boolean method257(int var0) {
		return var0 >= 0 && var0 < 112 ? KeyHandler.field132[var0] : false;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILgm;Lgh;B)V",
		garbageValue = "14"
	)
	static final void method262(int var0, int var1, int var2, int var3, int var4, int var5, Scene var6, CollisionMap var7) {
		if (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var1][var2] & 2) != 0 || (Tiles.Tiles_renderFlags[var0][var1][var2] & 16) == 0) {
			if (var0 < Tiles.Tiles_minPlane) {
				Tiles.Tiles_minPlane = var0;
			}

			ObjectComposition var8 = class82.getObjectDefinition(var3);
			int var9;
			int var10;
			if (var4 != 1 && var4 != 3) {
				var9 = var8.sizeX;
				var10 = var8.sizeY;
			} else {
				var9 = var8.sizeY;
				var10 = var8.sizeX;
			}

			int var11;
			int var12;
			if (var9 + var1 <= 104) {
				var11 = (var9 >> 1) + var1;
				var12 = (var9 + 1 >> 1) + var1;
			} else {
				var11 = var1;
				var12 = var1 + 1;
			}

			int var13;
			int var14;
			if (var10 + var2 <= 104) {
				var13 = (var10 >> 1) + var2;
				var14 = var2 + (var10 + 1 >> 1);
			} else {
				var13 = var2;
				var14 = var2 + 1;
			}

			int[][] var15 = Tiles.Tiles_heights[var0];
			int var16 = var15[var12][var14] + var15[var11][var14] + var15[var12][var13] + var15[var11][var13] >> 2;
			int var17 = (var1 << 7) + (var9 << 6);
			int var18 = (var2 << 7) + (var10 << 6);
			long var19 = VarbitComposition.calculateTag(var1, var2, 2, var8.int1 == 0, var3);
			int var21 = var5 + (var4 << 6);
			if (var8.int3 == 1) {
				var21 += 256;
			}

			int var23;
			int var24;
			if (var8.hasSound()) {
				ObjectSound var22 = new ObjectSound();
				var22.plane = var0;
				var22.x = var1 * 16384;
				var22.y = var2 * 128;
				var23 = var8.sizeX;
				var24 = var8.sizeY;
				if (var4 == 1 || var4 == 3) {
					var23 = var8.sizeY;
					var24 = var8.sizeX;
				}

				var22.maxX = (var23 + var1) * 128;
				var22.maxY = (var24 + var2) * 128;
				var22.soundEffectId = var8.ambientSoundId;
				var22.field817 = var8.int7 * 128;
				var22.field813 = var8.int5;
				var22.field808 = var8.int6;
				var22.soundEffectIds = var8.soundEffectIds;
				if (var8.transforms != null) {
					var22.obj = var8;
					var22.set();
				}

				ObjectSound.objectSounds.addFirst(var22);
				if (var22.soundEffectIds != null) {
					var22.field810 = var22.field813 + (int)(Math.random() * (double)(var22.field808 - var22.field813));
				}
			}

			Object var34;
			if (var5 == 22) {
				if (!Client.isLowDetail || var8.int1 != 0 || var8.interactType == 1 || var8.boolean2) {
					if (var8.animationId == -1 && var8.transforms == null) {
						var34 = var8.getEntity(22, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, 22, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
					}

					var6.newGroundObject(var0, var1, var2, var16, (Renderable)var34, var19, var21);
					if (var8.interactType == 1 && var7 != null) {
						var7.setBlockedByFloorDec(var1, var2);
					}

				}
			} else if (var5 != 10 && var5 != 11) {
				int[] var10000;
				if (var5 >= 12) {
					if (var8.animationId == -1 && var8.transforms == null) {
						var34 = var8.getEntity(var5, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
					}

					var6.method4176(var0, var1, var2, var16, 1, 1, (Renderable)var34, 0, var19, var21);
					if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) {
						var10000 = VerticalAlignment.field1993[var0][var1];
						var10000[var2] |= 2340;
					}

					if (var8.interactType != 0 && var7 != null) {
						var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
					}

				} else if (var5 == 0) {
					if (var8.animationId == -1 && var8.transforms == null) {
						var34 = var8.getEntity(0, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, 0, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
					}

					var6.newWallObject(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field988[var4], 0, var19, var21);
					if (var4 == 0) {
						if (var8.clipped) {
							NPC.field1259[var0][var1][var2] = 50;
							NPC.field1259[var0][var1][var2 + 1] = 50;
						}

						if (var8.modelClipped) {
							var10000 = VerticalAlignment.field1993[var0][var1];
							var10000[var2] |= 585;
						}
					} else if (var4 == 1) {
						if (var8.clipped) {
							NPC.field1259[var0][var1][var2 + 1] = 50;
							NPC.field1259[var0][var1 + 1][var2 + 1] = 50;
						}

						if (var8.modelClipped) {
							var10000 = VerticalAlignment.field1993[var0][var1];
							var10000[var2 + 1] |= 1170;
						}
					} else if (var4 == 2) {
						if (var8.clipped) {
							NPC.field1259[var0][var1 + 1][var2] = 50;
							NPC.field1259[var0][var1 + 1][var2 + 1] = 50;
						}

						if (var8.modelClipped) {
							var10000 = VerticalAlignment.field1993[var0][var1 + 1];
							var10000[var2] |= 585;
						}
					} else if (var4 == 3) {
						if (var8.clipped) {
							NPC.field1259[var0][var1][var2] = 50;
							NPC.field1259[var0][var1 + 1][var2] = 50;
						}

						if (var8.modelClipped) {
							var10000 = VerticalAlignment.field1993[var0][var1];
							var10000[var2] |= 1170;
						}
					}

					if (var8.interactType != 0 && var7 != null) {
						var7.method3749(var1, var2, var5, var4, var8.boolean1);
					}

					if (var8.int2 != 16) {
						var6.method4180(var0, var1, var2, var8.int2);
					}

				} else if (var5 == 1) {
					if (var8.animationId == -1 && var8.transforms == null) {
						var34 = var8.getEntity(1, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, 1, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
					}

					var6.newWallObject(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field989[var4], 0, var19, var21);
					if (var8.clipped) {
						if (var4 == 0) {
							NPC.field1259[var0][var1][var2 + 1] = 50;
						} else if (var4 == 1) {
							NPC.field1259[var0][var1 + 1][var2 + 1] = 50;
						} else if (var4 == 2) {
							NPC.field1259[var0][var1 + 1][var2] = 50;
						} else if (var4 == 3) {
							NPC.field1259[var0][var1][var2] = 50;
						}
					}

					if (var8.interactType != 0 && var7 != null) {
						var7.method3749(var1, var2, var5, var4, var8.boolean1);
					}

				} else {
					int var28;
					if (var5 == 2) {
						var28 = var4 + 1 & 3;
						Object var31;
						Object var32;
						if (var8.animationId == -1 && var8.transforms == null) {
							var31 = var8.getEntity(2, var4 + 4, var15, var17, var16, var18);
							var32 = var8.getEntity(2, var28, var15, var17, var16, var18);
						} else {
							var31 = new DynamicObject(var3, 2, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
							var32 = new DynamicObject(var3, 2, var28, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
						}

						var6.newWallObject(var0, var1, var2, var16, (Renderable)var31, (Renderable)var32, Tiles.field988[var4], Tiles.field988[var28], var19, var21);
						if (var8.modelClipped) {
							if (var4 == 0) {
								var10000 = VerticalAlignment.field1993[var0][var1];
								var10000[var2] |= 585;
								var10000 = VerticalAlignment.field1993[var0][var1];
								var10000[1 + var2] |= 1170;
							} else if (var4 == 1) {
								var10000 = VerticalAlignment.field1993[var0][var1];
								var10000[var2 + 1] |= 1170;
								var10000 = VerticalAlignment.field1993[var0][var1 + 1];
								var10000[var2] |= 585;
							} else if (var4 == 2) {
								var10000 = VerticalAlignment.field1993[var0][var1 + 1];
								var10000[var2] |= 585;
								var10000 = VerticalAlignment.field1993[var0][var1];
								var10000[var2] |= 1170;
							} else if (var4 == 3) {
								var10000 = VerticalAlignment.field1993[var0][var1];
								var10000[var2] |= 1170;
								var10000 = VerticalAlignment.field1993[var0][var1];
								var10000[var2] |= 585;
							}
						}

						if (var8.interactType != 0 && var7 != null) {
							var7.method3749(var1, var2, var5, var4, var8.boolean1);
						}

						if (var8.int2 != 16) {
							var6.method4180(var0, var1, var2, var8.int2);
						}

					} else if (var5 == 3) {
						if (var8.animationId == -1 && var8.transforms == null) {
							var34 = var8.getEntity(3, var4, var15, var17, var16, var18);
						} else {
							var34 = new DynamicObject(var3, 3, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
						}

						var6.newWallObject(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field989[var4], 0, var19, var21);
						if (var8.clipped) {
							if (var4 == 0) {
								NPC.field1259[var0][var1][var2 + 1] = 50;
							} else if (var4 == 1) {
								NPC.field1259[var0][var1 + 1][var2 + 1] = 50;
							} else if (var4 == 2) {
								NPC.field1259[var0][var1 + 1][var2] = 50;
							} else if (var4 == 3) {
								NPC.field1259[var0][var1][var2] = 50;
							}
						}

						if (var8.interactType != 0 && var7 != null) {
							var7.method3749(var1, var2, var5, var4, var8.boolean1);
						}

					} else if (var5 == 9) {
						if (var8.animationId == -1 && var8.transforms == null) {
							var34 = var8.getEntity(var5, var4, var15, var17, var16, var18);
						} else {
							var34 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
						}

						var6.method4176(var0, var1, var2, var16, 1, 1, (Renderable)var34, 0, var19, var21);
						if (var8.interactType != 0 && var7 != null) {
							var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
						}

						if (var8.int2 != 16) {
							var6.method4180(var0, var1, var2, var8.int2);
						}

					} else if (var5 == 4) {
						if (var8.animationId == -1 && var8.transforms == null) {
							var34 = var8.getEntity(4, var4, var15, var17, var16, var18);
						} else {
							var34 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
						}

						var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field988[var4], 0, 0, 0, var19, var21);
					} else {
						Object var25;
						long var29;
						if (var5 == 5) {
							var28 = 16;
							var29 = var6.getWallObjectTag(var0, var1, var2);
							if (0L != var29) {
								var28 = class82.getObjectDefinition(NetSocket.Entity_unpackID(var29)).int2;
							}

							if (var8.animationId == -1 && var8.transforms == null) {
								var25 = var8.getEntity(4, var4, var15, var17, var16, var18);
							} else {
								var25 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
							}

							var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, Tiles.field988[var4], 0, var28 * Tiles.field990[var4], var28 * Tiles.field991[var4], var19, var21);
						} else if (var5 == 6) {
							var28 = 8;
							var29 = var6.getWallObjectTag(var0, var1, var2);
							if (var29 != 0L) {
								var28 = class82.getObjectDefinition(NetSocket.Entity_unpackID(var29)).int2 / 2;
							}

							if (var8.animationId == -1 && var8.transforms == null) {
								var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
							} else {
								var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
							}

							var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, 256, var4, var28 * Tiles.field995[var4], var28 * Tiles.field993[var4], var19, var21);
						} else if (var5 == 7) {
							var23 = var4 + 2 & 3;
							if (var8.animationId == -1 && var8.transforms == null) {
								var34 = var8.getEntity(4, var23 + 4, var15, var17, var16, var18);
							} else {
								var34 = new DynamicObject(var3, 4, var23 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
							}

							var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, 256, var23, 0, 0, var19, var21);
						} else if (var5 == 8) {
							var28 = 8;
							var29 = var6.getWallObjectTag(var0, var1, var2);
							if (0L != var29) {
								var28 = class82.getObjectDefinition(NetSocket.Entity_unpackID(var29)).int2 / 2;
							}

							int var27 = var4 + 2 & 3;
							Object var26;
							if (var8.animationId == -1 && var8.transforms == null) {
								var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
								var26 = var8.getEntity(4, var27 + 4, var15, var17, var16, var18);
							} else {
								var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
								var26 = new DynamicObject(var3, 4, var27 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
							}

							var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var25, (Renderable)var26, 256, var4, var28 * Tiles.field995[var4], var28 * Tiles.field993[var4], var19, var21);
						}
					}
				}
			} else {
				if (var8.animationId == -1 && var8.transforms == null) {
					var34 = var8.getEntity(10, var4, var15, var17, var16, var18);
				} else {
					var34 = new DynamicObject(var3, 10, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
				}

				if (var34 != null && var6.method4176(var0, var1, var2, var16, var9, var10, (Renderable)var34, var5 == 11 ? 256 : 0, var19, var21) && var8.clipped) {
					var23 = 15;
					if (var34 instanceof Model) {
						var23 = ((Model)var34).method4277() / 4;
						if (var23 > 30) {
							var23 = 30;
						}
					}

					for (var24 = 0; var24 <= var9; ++var24) {
						for (int var33 = 0; var33 <= var10; ++var33) {
							if (var23 > NPC.field1259[var0][var24 + var1][var33 + var2]) {
								NPC.field1259[var0][var24 + var1][var33 + var2] = (byte)var23;
							}
						}
					}
				}

				if (var8.interactType != 0 && var7 != null) {
					var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
				}

			}
		}
	}

	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "(Lki;IIIB)V",
		garbageValue = "-23"
	)
	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		ArchiveLoader.playPcmPlayers();
		SpriteMask var4 = var0.getSpriteMask(false);
		if (var4 != null) {
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height);
			if (Client.minimapState != 2 && Client.minimapState != 5) {
				int var5 = Client.camAngleY & 2047;
				int var6 = ModelData0.localPlayer.x / 32 + 48;
				int var7 = 464 - ModelData0.localPlayer.y / 32;
				InterfaceParent.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths);

				int var8;
				int var10;
				int var16;
				for (var8 = 0; var8 < Client.mapIconCount; ++var8) {
					var16 = Client.mapIconXs[var8] * 4 + 2 - ModelData0.localPlayer.x / 32;
					var10 = Client.mapIconYs[var8] * 4 + 2 - ModelData0.localPlayer.y / 32;
					PcmPlayer.drawSpriteOnMinimap(var1, var2, var16, var10, Client.mapIcons[var8], var4);
				}

				int var11;
				int var12;
				for (var8 = 0; var8 < 104; ++var8) {
					for (var16 = 0; var16 < 104; ++var16) {
						NodeDeque var14 = Client.groundItems[class128.Client_plane][var8][var16];
						if (var14 != null) {
							var11 = var8 * 4 + 2 - ModelData0.localPlayer.x / 32;
							var12 = var16 * 4 + 2 - ModelData0.localPlayer.y / 32;
							PcmPlayer.drawSpriteOnMinimap(var1, var2, var11, var12, DecorativeObject.mapDotSprites[0], var4);
						}
					}
				}

				for (var8 = 0; var8 < Client.npcCount; ++var8) {
					NPC var9 = Client.npcs[Client.npcIndices[var8]];
					if (var9 != null && var9.isVisible()) {
						NPCComposition var18 = var9.definition;
						if (var18 != null && var18.transforms != null) {
							var18 = var18.transform();
						}

						if (var18 != null && var18.drawMapDot && var18.isInteractable) {
							var11 = var9.x / 32 - ModelData0.localPlayer.x / 32;
							var12 = var9.y / 32 - ModelData0.localPlayer.y / 32;
							PcmPlayer.drawSpriteOnMinimap(var1, var2, var11, var12, DecorativeObject.mapDotSprites[1], var4);
						}
					}
				}

				var8 = Players.Players_count;
				int[] var17 = Players.Players_indices;

				for (var10 = 0; var10 < var8; ++var10) {
					Player var15 = Client.players[var17[var10]];
					if (var15 != null && var15.isVisible() && !var15.isHidden && var15 != ModelData0.localPlayer) {
						var12 = var15.x / 32 - ModelData0.localPlayer.x / 32;
						int var13 = var15.y / 32 - ModelData0.localPlayer.y / 32;
						if (var15.isFriend()) {
							PcmPlayer.drawSpriteOnMinimap(var1, var2, var12, var13, DecorativeObject.mapDotSprites[3], var4);
						} else if (ModelData0.localPlayer.team != 0 && var15.team != 0 && var15.team == ModelData0.localPlayer.team) {
							PcmPlayer.drawSpriteOnMinimap(var1, var2, var12, var13, DecorativeObject.mapDotSprites[4], var4);
						} else if (var15.isFriendsChatMember()) {
							PcmPlayer.drawSpriteOnMinimap(var1, var2, var12, var13, DecorativeObject.mapDotSprites[5], var4);
						} else if (var15.isClanMember()) {
							PcmPlayer.drawSpriteOnMinimap(var1, var2, var12, var13, DecorativeObject.mapDotSprites[6], var4);
						} else {
							PcmPlayer.drawSpriteOnMinimap(var1, var2, var12, var13, DecorativeObject.mapDotSprites[2], var4);
						}
					}
				}

				if (Client.hintArrowType != 0 && Client.cycle % 20 < 10) {
					if (Client.hintArrowType == 1 && Client.hintArrowNpcIndex >= 0 && Client.hintArrowNpcIndex < Client.npcs.length) {
						NPC var19 = Client.npcs[Client.hintArrowNpcIndex];
						if (var19 != null) {
							var11 = var19.x / 32 - ModelData0.localPlayer.x / 32;
							var12 = var19.y / 32 - ModelData0.localPlayer.y / 32;
							VarcInt.worldToMinimap(var1, var2, var11, var12, class146.mapMarkerSprites[1], var4);
						}
					}

					if (Client.hintArrowType == 2) {
						var10 = Client.field500 * 4 - SecureRandomCallable.baseX * 256 + 2 - ModelData0.localPlayer.x / 32;
						var11 = Client.field501 * 4 - GrandExchangeOfferOwnWorldComparator.baseY * 256 + 2 - ModelData0.localPlayer.y / 32;
						VarcInt.worldToMinimap(var1, var2, var10, var11, class146.mapMarkerSprites[1], var4);
					}

					if (Client.hintArrowType == 10 && Client.hintArrowPlayerIndex >= 0 && Client.hintArrowPlayerIndex < Client.players.length) {
						Player var20 = Client.players[Client.hintArrowPlayerIndex];
						if (var20 != null) {
							var11 = var20.x / 32 - ModelData0.localPlayer.x / 32;
							var12 = var20.y / 32 - ModelData0.localPlayer.y / 32;
							VarcInt.worldToMinimap(var1, var2, var11, var12, class146.mapMarkerSprites[1], var4);
						}
					}
				}

				if (Client.destinationX != 0) {
					var10 = Client.destinationX * 4 + 2 - ModelData0.localPlayer.x / 32;
					var11 = Client.destinationY * 4 + 2 - ModelData0.localPlayer.y / 32;
					PcmPlayer.drawSpriteOnMinimap(var1, var2, var10, var11, class146.mapMarkerSprites[0], var4);
				}

				if (!ModelData0.localPlayer.isHidden) {
					Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
			}

			Client.field704[var3] = true;
		}
	}

	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1927350228"
	)
	@Export("clanKickUser")
	static final void clanKickUser(String var0) {
		if (PcmPlayer.friendsChatManager != null) {
			PacketBufferNode var1 = DecorativeObject.getPacketBufferNode(ClientPacket.field2983, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(class392.stringCp1252NullTerminatedByteSize(var0));
			var1.packetBuffer.writeStringCp1252NullTerminated(var0);
			Client.packetWriter.addNode(var1);
		}
	}
}
