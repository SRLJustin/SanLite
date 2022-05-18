import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bp")
@Implements("ArchiveLoader")
public class ArchiveLoader {
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("archive")
	final Archive archive;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -404162061
	)
	@Export("groupCount")
	final int groupCount;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1950157047
	)
	@Export("loadedCount")
	int loadedCount;

	@ObfuscatedSignature(
		descriptor = "(Lle;Ljava/lang/String;)V"
	)
	ArchiveLoader(Archive var1, String var2) {
		this.loadedCount = 0;
		this.archive = var1;
		this.groupCount = var1.getGroupCount();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1365376212"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		this.loadedCount = 0;

		for (int var1 = 0; var1 < this.groupCount; ++var1) {
			if (!this.archive.method5634(var1) || this.archive.method5633(var1)) {
				++this.loadedCount;
			}
		}

		return this.loadedCount >= this.groupCount;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(ILbb;ZB)I",
		garbageValue = "-59"
	)
	static int method2041(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? Interpreter.scriptDotWidget : KeyHandler.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETTARGETMASK) {
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = WorldMapSection1.Widget_unpackTargetMask(UrlRequester.getWidgetFlags(var3));
			return 1;
		} else if (var0 != ScriptOpcodes.CC_GETOP) {
			if (var0 == ScriptOpcodes.CC_GETOPBASE) {
				if (var3.dataText == null) {
					Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var3.dataText;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
			--var4;
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) {
				Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var3.actions[var4];
			} else {
				Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = "";
			}

			return 1;
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "664108386"
	)
	@Export("hslToRgb")
	static final int hslToRgb(int var0, int var1, int var2) {
		if (var2 > 179) {
			var1 /= 2;
		}

		if (var2 > 192) {
			var1 /= 2;
		}

		if (var2 > 217) {
			var1 /= 2;
		}

		if (var2 > 243) {
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
		return var3;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILbb;ZB)I",
		garbageValue = "-74"
	)
	static int method2045(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 3500) {
			var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = UserComparator8.method2581(var3) ? 1 : 0;
			return 1;
		} else if (var0 == 3501) {
			var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = WorldMapAreaData.method4880(var3) ? 1 : 0;
			return 1;
		} else if (var0 == 3502) {
			var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = class19.method257(var3) ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1781905177"
	)
	@Export("playPcmPlayers")
	static final void playPcmPlayers() {
		if (Fonts.pcmPlayer1 != null) {
			Fonts.pcmPlayer1.run();
		}

		if (SecureRandomCallable.pcmPlayer0 != null) {
			SecureRandomCallable.pcmPlayer0.run();
		}

	}

	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-440186297"
	)
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount;
		if (ModelData0.localPlayer.x >> 7 == Client.destinationX && ModelData0.localPlayer.y >> 7 == Client.destinationY) {
			Client.destinationX = 0;
		}

		CollisionMap.method3778();
		if (Client.combatTargetPlayerIndex >= 0 && Client.players[Client.combatTargetPlayerIndex] != null) {
			class263.addPlayerToScene(Client.players[Client.combatTargetPlayerIndex], false);
		}

		class137.addNpcsToScene(true);
		int var4 = Players.Players_count;
		int[] var5 = Players.Players_indices;

		int var6;
		for (var6 = 0; var6 < var4; ++var6) {
			if (var5[var6] != Client.combatTargetPlayerIndex && var5[var6] != Client.localPlayerIndex) {
				class263.addPlayerToScene(Client.players[var5[var6]], true);
			}
		}

		class137.addNpcsToScene(false);

		for (Projectile var30 = (Projectile)Client.projectiles.last(); var30 != null; var30 = (Projectile)Client.projectiles.previous()) {
			if (var30.plane == class128.Client_plane && Client.cycle <= var30.cycleEnd) {
				if (Client.cycle >= var30.cycleStart) {
					if (var30.targetIndex > 0) {
						NPC var34 = Client.npcs[var30.targetIndex - 1];
						if (var34 != null && var34.x >= 0 && var34.x < 13312 && var34.y >= 0 && var34.y < 13312) {
							var30.setDestination(var34.x, var34.y, class202.getTileHeight(var34.x, var34.y, var30.plane) - var30.endHeight, Client.cycle);
						}
					}

					if (var30.targetIndex < 0) {
						var6 = -var30.targetIndex - 1;
						Player var35;
						if (var6 == Client.localPlayerIndex) {
							var35 = ModelData0.localPlayer;
						} else {
							var35 = Client.players[var6];
						}

						if (var35 != null && var35.x >= 0 && var35.x < 13312 && var35.y >= 0 && var35.y < 13312) {
							var30.setDestination(var35.x, var35.y, class202.getTileHeight(var35.x, var35.y, var30.plane) - var30.endHeight, Client.cycle);
						}
					}

					var30.advance(Client.field727);
					class175.scene.drawEntity(class128.Client_plane, (int)var30.x, (int)var30.y, (int)var30.z, 60, var30, var30.yaw, -1L, false);
				}
			} else {
				var30.remove();
			}
		}

		for (GraphicsObject var37 = (GraphicsObject)Client.graphicsObjects.last(); var37 != null; var37 = (GraphicsObject)Client.graphicsObjects.previous()) {
			if (var37.plane == class128.Client_plane && !var37.isFinished) {
				if (Client.cycle >= var37.cycleStart) {
					var37.advance(Client.field727);
					if (var37.isFinished) {
						var37.remove();
					} else {
						class175.scene.drawEntity(var37.plane, var37.x, var37.y, var37.height, 60, var37, 0, -1L, false);
					}
				}
			} else {
				var37.remove();
			}
		}

		GrandExchangeOfferOwnWorldComparator.setViewportShape(var0, var1, var2, var3, true);
		var0 = Client.viewportOffsetX;
		var1 = Client.viewportOffsetY;
		var2 = Client.viewportWidth;
		var3 = Client.viewportHeight;
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
		var4 = Client.camAngleX;
		if (Client.field578 / 256 > var4) {
			var4 = Client.field578 / 256;
		}

		if (Client.field743[4] && Client.field745[4] + 128 > var4) {
			var4 = Client.field745[4] + 128;
		}

		int var31 = Client.camAngleY & 2047;
		Nameable.method6523(HorizontalAlignment.oculusOrbFocalPointX, class140.field1666, class28.oculusOrbFocalPointY, var4, var31, class10.method94(var4), var3);
		int var7;
		int var8;
		int var9;
		int var10;
		int var11;
		int var12;
		int var13;
		int var14;
		int var16;
		if (!Client.isCameraLocked) {
			if (class12.clientPreferences.method2222()) {
				var7 = class128.Client_plane;
			} else {
				label630: {
					var8 = 3;
					if (GameEngine.cameraPitch < 310) {
						label622: {
							if (Client.oculusOrbState == 1) {
								var9 = HorizontalAlignment.oculusOrbFocalPointX >> 7;
								var10 = class28.oculusOrbFocalPointY >> 7;
							} else {
								var9 = ModelData0.localPlayer.x >> 7;
								var10 = ModelData0.localPlayer.y >> 7;
							}

							var11 = class343.cameraX >> 7;
							var12 = FaceNormal.cameraZ >> 7;
							if (var11 >= 0 && var12 >= 0 && var11 < 104 && var12 < 104) {
								if (var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104) {
									if ((Tiles.Tiles_renderFlags[class128.Client_plane][var11][var12] & 4) != 0) {
										var8 = class128.Client_plane;
									}

									if (var9 > var11) {
										var13 = var9 - var11;
									} else {
										var13 = var11 - var9;
									}

									if (var10 > var12) {
										var14 = var10 - var12;
									} else {
										var14 = var12 - var10;
									}

									int var15;
									if (var13 > var14) {
										var15 = var14 * 65536 / var13;
										var16 = 32768;

										while (true) {
											if (var9 == var11) {
												break label622;
											}

											if (var11 < var9) {
												++var11;
											} else if (var11 > var9) {
												--var11;
											}

											if ((Tiles.Tiles_renderFlags[class128.Client_plane][var11][var12] & 4) != 0) {
												var8 = class128.Client_plane;
											}

											var16 += var15;
											if (var16 >= 65536) {
												var16 -= 65536;
												if (var12 < var10) {
													++var12;
												} else if (var12 > var10) {
													--var12;
												}

												if ((Tiles.Tiles_renderFlags[class128.Client_plane][var11][var12] & 4) != 0) {
													var8 = class128.Client_plane;
												}
											}
										}
									} else {
										if (var14 > 0) {
											var15 = var13 * 65536 / var14;
											var16 = 32768;

											while (var12 != var10) {
												if (var12 < var10) {
													++var12;
												} else if (var12 > var10) {
													--var12;
												}

												if ((Tiles.Tiles_renderFlags[class128.Client_plane][var11][var12] & 4) != 0) {
													var8 = class128.Client_plane;
												}

												var16 += var15;
												if (var16 >= 65536) {
													var16 -= 65536;
													if (var11 < var9) {
														++var11;
													} else if (var11 > var9) {
														--var11;
													}

													if ((Tiles.Tiles_renderFlags[class128.Client_plane][var11][var12] & 4) != 0) {
														var8 = class128.Client_plane;
													}
												}
											}
										}
										break label622;
									}
								}

								var7 = class128.Client_plane;
								break label630;
							}

							var7 = class128.Client_plane;
							break label630;
						}
					}

					if (ModelData0.localPlayer.x >= 0 && ModelData0.localPlayer.y >= 0 && ModelData0.localPlayer.x < 13312 && ModelData0.localPlayer.y < 13312) {
						if ((Tiles.Tiles_renderFlags[class128.Client_plane][ModelData0.localPlayer.x >> 7][ModelData0.localPlayer.y >> 7] & 4) != 0) {
							var8 = class128.Client_plane;
						}

						var7 = var8;
					} else {
						var7 = class128.Client_plane;
					}
				}
			}

			var6 = var7;
		} else {
			var6 = class101.method2551();
		}

		var7 = class343.cameraX;
		var8 = class295.cameraY;
		var9 = FaceNormal.cameraZ;
		var10 = GameEngine.cameraPitch;
		var11 = StudioGame.cameraYaw;

		for (var12 = 0; var12 < 5; ++var12) {
			if (Client.field743[var12]) {
				var13 = (int)(Math.random() * (double)(Client.field744[var12] * 2 + 1) - (double)Client.field744[var12] + Math.sin((double)Client.field714[var12] / 100.0D * (double)Client.field677[var12]) * (double)Client.field745[var12]);
				if (var12 == 0) {
					class343.cameraX += var13;
				}

				if (var12 == 1) {
					class295.cameraY += var13;
				}

				if (var12 == 2) {
					FaceNormal.cameraZ += var13;
				}

				if (var12 == 3) {
					StudioGame.cameraYaw = var13 + StudioGame.cameraYaw & 2047;
				}

				if (var12 == 4) {
					GameEngine.cameraPitch += var13;
					if (GameEngine.cameraPitch < 128) {
						GameEngine.cameraPitch = 128;
					}

					if (GameEngine.cameraPitch > 383) {
						GameEngine.cameraPitch = 383;
					}
				}
			}
		}

		var12 = MouseHandler.MouseHandler_x;
		var13 = MouseHandler.MouseHandler_y;
		if (MouseHandler.MouseHandler_lastButton != 0) {
			var12 = MouseHandler.MouseHandler_lastPressedX;
			var13 = MouseHandler.MouseHandler_lastPressedY;
		}

		if (var12 >= var0 && var12 < var0 + var2 && var13 >= var1 && var13 < var3 + var1) {
			class136.method2865(var12 - var0, var13 - var1);
		} else {
			ViewportMouse.ViewportMouse_isInViewport = false;
			ViewportMouse.ViewportMouse_entityCount = 0;
		}

		playPcmPlayers();
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
		playPcmPlayers();
		var14 = Rasterizer3D.Rasterizer3D_zoom;
		Rasterizer3D.Rasterizer3D_zoom = Client.viewportZoom;
		class175.scene.draw(class343.cameraX, class295.cameraY, FaceNormal.cameraZ, GameEngine.cameraPitch, StudioGame.cameraYaw, var6);
		Rasterizer3D.Rasterizer3D_zoom = var14;
		playPcmPlayers();
		class175.scene.clearTempGameObjects();
		Client.overheadTextCount = 0;
		boolean var36 = false;
		var16 = -1;
		int var17 = -1;
		int var18 = Players.Players_count;
		int[] var19 = Players.Players_indices;

		int var20;
		for (var20 = 0; var20 < var18 + Client.npcCount; ++var20) {
			Object var33;
			if (var20 < var18) {
				var33 = Client.players[var19[var20]];
				if (var19[var20] == Client.combatTargetPlayerIndex) {
					var36 = true;
					var16 = var20;
					continue;
				}

				if (var33 == ModelData0.localPlayer) {
					var17 = var20;
					continue;
				}
			} else {
				var33 = Client.npcs[Client.npcIndices[var20 - var18]];
			}

			Client.drawActor2d((Actor)var33, var20, var0, var1, var2, var3);
		}

		if (Client.renderSelf && var17 != -1) {
			Client.drawActor2d(ModelData0.localPlayer, var17, var0, var1, var2, var3);
		}

		if (var36) {
			Client.drawActor2d(Client.players[Client.combatTargetPlayerIndex], var16, var0, var1, var2, var3);
		}

		for (var20 = 0; var20 < Client.overheadTextCount; ++var20) {
			int var21 = Client.overheadTextXs[var20];
			int var22 = Client.overheadTextYs[var20];
			int var23 = Client.overheadTextXOffsets[var20];
			int var24 = Client.overheadTextAscents[var20];
			boolean var25 = true;

			while (var25) {
				var25 = false;

				for (int var32 = 0; var32 < var20; ++var32) {
					if (var22 + 2 > Client.overheadTextYs[var32] - Client.overheadTextAscents[var32] && var22 - var24 < Client.overheadTextYs[var32] + 2 && var21 - var23 < Client.overheadTextXOffsets[var32] + Client.overheadTextXs[var32] && var21 + var23 > Client.overheadTextXs[var32] - Client.overheadTextXOffsets[var32] && Client.overheadTextYs[var32] - Client.overheadTextAscents[var32] < var22) {
						var22 = Client.overheadTextYs[var32] - Client.overheadTextAscents[var32];
						var25 = true;
					}
				}
			}

			Client.viewportTempX = Client.overheadTextXs[var20];
			Client.viewportTempY = Client.overheadTextYs[var20] = var22;
			String var26 = Client.overheadText[var20];
			if (Client.chatEffects == 0) {
				int var27 = 16776960;
				if (Client.overheadTextColors[var20] < 6) {
					var27 = Client.field769[Client.overheadTextColors[var20]];
				}

				if (Client.overheadTextColors[var20] == 6) {
					var27 = Client.viewportDrawCount % 20 < 10 ? 16711680 : 16776960;
				}

				if (Client.overheadTextColors[var20] == 7) {
					var27 = Client.viewportDrawCount % 20 < 10 ? 255 : '\uffff';
				}

				if (Client.overheadTextColors[var20] == 8) {
					var27 = Client.viewportDrawCount % 20 < 10 ? '뀀' : 8454016;
				}

				int var28;
				if (Client.overheadTextColors[var20] == 9) {
					var28 = 150 - Client.overheadTextCyclesRemaining[var20];
					if (var28 < 50) {
						var27 = var28 * 1280 + 16711680;
					} else if (var28 < 100) {
						var27 = 16776960 - (var28 - 50) * 327680;
					} else if (var28 < 150) {
						var27 = (var28 - 100) * 5 + 65280;
					}
				}

				if (Client.overheadTextColors[var20] == 10) {
					var28 = 150 - Client.overheadTextCyclesRemaining[var20];
					if (var28 < 50) {
						var27 = var28 * 5 + 16711680;
					} else if (var28 < 100) {
						var27 = 16711935 - (var28 - 50) * 327680;
					} else if (var28 < 150) {
						var27 = (var28 - 100) * 327680 + 255 - (var28 - 100) * 5;
					}
				}

				if (Client.overheadTextColors[var20] == 11) {
					var28 = 150 - Client.overheadTextCyclesRemaining[var20];
					if (var28 < 50) {
						var27 = 16777215 - var28 * 327685;
					} else if (var28 < 100) {
						var27 = (var28 - 50) * 327685 + 65280;
					} else if (var28 < 150) {
						var27 = 16777215 - (var28 - 100) * 327680;
					}
				}

				if (Client.overheadTextEffects[var20] == 0) {
					ChatChannel.fontBold12.drawCentered(var26, var0 + Client.viewportTempX, Client.viewportTempY + var1, var27, 0);
				}

				if (Client.overheadTextEffects[var20] == 1) {
					ChatChannel.fontBold12.drawCenteredWave(var26, var0 + Client.viewportTempX, Client.viewportTempY + var1, var27, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var20] == 2) {
					ChatChannel.fontBold12.drawCenteredWave2(var26, var0 + Client.viewportTempX, Client.viewportTempY + var1, var27, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var20] == 3) {
					ChatChannel.fontBold12.drawCenteredShake(var26, var0 + Client.viewportTempX, Client.viewportTempY + var1, var27, 0, Client.viewportDrawCount, 150 - Client.overheadTextCyclesRemaining[var20]);
				}

				if (Client.overheadTextEffects[var20] == 4) {
					var28 = (150 - Client.overheadTextCyclesRemaining[var20]) * (ChatChannel.fontBold12.stringWidth(var26) + 100) / 150;
					Rasterizer2D.Rasterizer2D_expandClip(var0 + Client.viewportTempX - 50, var1, var0 + Client.viewportTempX + 50, var3 + var1);
					ChatChannel.fontBold12.draw(var26, var0 + Client.viewportTempX + 50 - var28, Client.viewportTempY + var1, var27, 0);
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
				}

				if (Client.overheadTextEffects[var20] == 5) {
					var28 = 150 - Client.overheadTextCyclesRemaining[var20];
					int var29 = 0;
					if (var28 < 25) {
						var29 = var28 - 25;
					} else if (var28 > 125) {
						var29 = var28 - 125;
					}

					Rasterizer2D.Rasterizer2D_expandClip(var0, Client.viewportTempY + var1 - ChatChannel.fontBold12.ascent - 1, var0 + var2, Client.viewportTempY + var1 + 5);
					ChatChannel.fontBold12.drawCentered(var26, var0 + Client.viewportTempX, var29 + Client.viewportTempY + var1, var27, 0);
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
				}
			} else {
				ChatChannel.fontBold12.drawCentered(var26, var0 + Client.viewportTempX, Client.viewportTempY + var1, 16776960, 0);
			}
		}

		if (Client.hintArrowType == 2) {
			AbstractWorldMapIcon.worldToScreen(Client.field503 * 64 + (Client.field500 - SecureRandomCallable.baseX * 64 << 7), Client.field554 * 64 + (Client.field501 - GrandExchangeOfferOwnWorldComparator.baseY * 64 << 7), Client.field563 * 2);
			if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) {
				class21.headIconHintSprites[0].drawTransBgAt(var0 + Client.viewportTempX - 12, Client.viewportTempY + var1 - 28);
			}
		}

		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).animate(Client.field727);
		class360.method6393();
		class343.cameraX = var7;
		class295.cameraY = var8;
		FaceNormal.cameraZ = var9;
		GameEngine.cameraPitch = var10;
		StudioGame.cameraYaw = var11;
		if (Client.isLoading && HealthBarUpdate.method2181(true, false) == 0) {
			Client.isLoading = false;
		}

		if (Client.isLoading) {
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
			class259.drawLoadingMessage("Loading - please wait.", false);
		}

	}
}
