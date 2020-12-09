import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kr")
@Implements("FontName")
public class FontName {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "Lkr;"
	)
	@Export("FontName_plain11")
	public static final FontName FontName_plain11;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "Lkr;"
	)
	@Export("FontName_plain12")
	public static final FontName FontName_plain12;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "Lkr;"
	)
	@Export("FontName_bold12")
	public static final FontName FontName_bold12;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "Lkr;"
	)
	@Export("FontName_verdana11")
	public static final FontName FontName_verdana11;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "Lkr;"
	)
	@Export("FontName_verdana13")
	public static final FontName FontName_verdana13;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "Lkr;"
	)
	@Export("FontName_verdana15")
	public static final FontName FontName_verdana15;
	@ObfuscatedName("es")
	@ObfuscatedSignature(
		signature = "Lil;"
	)
	@Export("archive14")
	static Archive archive14;
	@ObfuscatedName("n")
	@Export("name")
	String name;

	static {
		FontName_plain11 = new FontName("p11_full");
		FontName_plain12 = new FontName("p12_full");
		FontName_bold12 = new FontName("b12_full");
		FontName_verdana11 = new FontName("verdana_11pt_regular");
		FontName_verdana13 = new FontName("verdana_13pt_regular");
		FontName_verdana15 = new FontName("verdana_15pt_regular");
	}

	FontName(String var1) {
		this.name = var1;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "(B)[Lkr;",
		garbageValue = "1"
	)
	public static FontName[] method5353() {
		return new FontName[]{FontName_plain11, FontName_bold12, FontName_verdana11, FontName_verdana13, FontName_verdana15, FontName_plain12};
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "1883982153"
	)
	static final boolean method5355() {
		return ViewportMouse.ViewportMouse_isInViewport;
	}

	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "8"
	)
	@Export("playPcmPlayers")
	static final void playPcmPlayers() {
		if (FriendLoginUpdate.pcmPlayer1 != null) {
			FriendLoginUpdate.pcmPlayer1.run();
		}

		if (AbstractWorldMapData.pcmPlayer0 != null) {
			AbstractWorldMapData.pcmPlayer0.run();
		}

	}

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		signature = "(IB)V",
		garbageValue = "43"
	)
	static final void method5356(int var0) {
		if (var0 >= 0) {
			int var1 = Client.menuArguments1[var0];
			int var2 = Client.menuArguments2[var0];
			int var3 = Client.menuOpcodes[var0];
			int var4 = Client.menuIdentifiers[var0];
			String var5 = Client.menuActions[var0];
			String var6 = Client.menuTargets[var0];
			RouteStrategy.menuAction(var1, var2, var3, var4, var5, var6, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
		}
	}

	@ObfuscatedName("je")
	@ObfuscatedSignature(
		signature = "([Lhe;IIIIIIIIB)V",
		garbageValue = "105"
	)
	@Export("drawInterface")
	static final void drawInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();

		for (int var9 = 0; var9 < var0.length; ++var9) {
			Widget var10 = var0[var9];
			if (var10 != null && (var10.parentId == var1 || var1 == -1412584499 && var10 == Client.clickedWidget)) {
				int var11;
				if (var8 == -1) {
					Client.rootWidgetXs[Client.rootWidgetCount] = var10.x + var6;
					Client.rootWidgetYs[Client.rootWidgetCount] = var7 + var10.y;
					Client.rootWidgetWidths[Client.rootWidgetCount] = var10.width;
					Client.rootWidgetHeights[Client.rootWidgetCount] = var10.height;
					var11 = ++Client.rootWidgetCount - 1;
				} else {
					var11 = var8;
				}

				var10.rootIndex = var11;
				var10.cycle = Client.cycle;
				if (!var10.isIf3 || !DevicePcmPlayerProvider.isComponentHidden(var10)) {
					if (var10.contentType > 0) {
						class279.method5006(var10);
					}

					int var12 = var10.x + var6;
					int var13 = var7 + var10.y;
					int var14 = var10.transparencyTop;
					int var15;
					int var16;
					if (var10 == Client.clickedWidget) {
						if (var1 != -1412584499 && !var10.isScrollBar) {
							class200.field2390 = var0;
							Client.field923 = var6;
							Renderable.field1893 = var7;
							continue;
						}

						if (Client.isDraggingWidget && Client.field859) {
							var15 = MouseHandler.MouseHandler_x;
							var16 = MouseHandler.MouseHandler_y;
							var15 -= Client.widgetClickX;
							var16 -= Client.widgetClickY;
							if (var15 < Client.field827) {
								var15 = Client.field827;
							}

							if (var15 + var10.width > Client.field827 + Client.clickedWidgetParent.width) {
								var15 = Client.field827 + Client.clickedWidgetParent.width - var10.width;
							}

							if (var16 < Client.field716) {
								var16 = Client.field716;
							}

							if (var16 + var10.height > Client.field716 + Client.clickedWidgetParent.height) {
								var16 = Client.field716 + Client.clickedWidgetParent.height - var10.height;
							}

							var12 = var15;
							var13 = var16;
						}

						if (!var10.isScrollBar) {
							var14 = 128;
						}
					}

					int var17;
					int var18;
					int var20;
					int var21;
					int var22;
					int var30;
					if (var10.type == 2) {
						var15 = var2;
						var16 = var3;
						var17 = var4;
						var18 = var5;
					} else if (var10.type == 9) {
						var30 = var12;
						var20 = var13;
						var21 = var12 + var10.width;
						var22 = var13 + var10.height;
						if (var21 < var12) {
							var30 = var21;
							var21 = var12;
						}

						if (var22 < var13) {
							var20 = var22;
							var22 = var13;
						}

						++var21;
						++var22;
						var15 = var30 > var2 ? var30 : var2;
						var16 = var20 > var3 ? var20 : var3;
						var17 = var21 < var4 ? var21 : var4;
						var18 = var22 < var5 ? var22 : var5;
					} else {
						var30 = var12 + var10.width;
						var20 = var13 + var10.height;
						var15 = var12 > var2 ? var12 : var2;
						var16 = var13 > var3 ? var13 : var3;
						var17 = var30 < var4 ? var30 : var4;
						var18 = var20 < var5 ? var20 : var5;
					}

					if (!var10.isIf3 || var15 < var17 && var16 < var18) {
						if (var10.contentType != 0) {
							if (var10.contentType == 1336) {
								if (Client.displayFps) {
									var13 += 15;
									WorldMapLabelSize.fontPlain12.drawRightAligned("Fps:" + GameEngine.fps, var12 + var10.width, var13, 16776960, -1);
									var13 += 15;
									Runtime var38 = Runtime.getRuntime();
									var20 = (int)((var38.totalMemory() - var38.freeMemory()) / 1024L);
									var21 = 16776960;
									if (var20 > 327680 && !Client.isLowDetail) {
										var21 = 16711680;
									}

									WorldMapLabelSize.fontPlain12.drawRightAligned("Mem:" + var20 + "k", var12 + var10.width, var13, var21, -1);
									var13 += 15;
								}
								continue;
							}

							if (var10.contentType == 1337) {
								Client.viewportX = var12;
								Client.viewportY = var13;
								SecureRandomFuture.drawEntities(var12, var13, var10.width, var10.height);
								Client.field901[var10.rootIndex] = true;
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
								continue;
							}

							if (var10.contentType == 1338) {
								DirectByteArrayCopier.drawMinimap(var10, var12, var13, var11);
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
								continue;
							}

							if (var10.contentType == 1339) {
								Varcs.drawCompass(var10, var12, var13, var11);
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
								continue;
							}

							if (var10.contentType == 1400) {
								WorldMapRectangle.worldMap.draw(var12, var13, var10.width, var10.height, Client.cycle);
							}

							if (var10.contentType == 1401) {
								WorldMapRectangle.worldMap.drawOverview(var12, var13, var10.width, var10.height);
							}

							if (var10.contentType == 1402) {
								class1.loginScreenRunesAnimation.draw(var12, Client.cycle);
							}
						}

						if (var10.type == 0) {
							if (!var10.isIf3 && DevicePcmPlayerProvider.isComponentHidden(var10) && var10 != EnumComposition.mousedOverWidgetIf1) {
								continue;
							}

							if (!var10.isIf3) {
								if (var10.scrollY > var10.scrollHeight - var10.height) {
									var10.scrollY = var10.scrollHeight - var10.height;
								}

								if (var10.scrollY < 0) {
									var10.scrollY = 0;
								}
							}

							drawInterface(var0, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							if (var10.children != null) {
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							InterfaceParent var19 = (InterfaceParent)Client.interfaceParents.get((long)var10.id);
							if (var19 != null) {
								KeyHandler.drawWidgets(var19.group, var15, var16, var17, var18, var12, var13, var11);
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
							Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
						}

						if (Client.isResizable || Client.field855[var11] || Client.gameDrawingMode > 1) {
							if (var10.type == 0 && !var10.isIf3 && var10.scrollHeight > var10.height) {
								class89.drawScrollBar(var12 + var10.width, var13, var10.scrollY, var10.height, var10.scrollHeight);
							}

							if (var10.type != 1) {
								int var23;
								int var25;
								int var26;
								int var33;
								if (var10.type == 2) {
									var30 = 0;

									for (var20 = 0; var20 < var10.rawHeight; ++var20) {
										for (var21 = 0; var21 < var10.rawWidth; ++var21) {
											var22 = var12 + var21 * (var10.paddingX + 32);
											var23 = var13 + var20 * (var10.paddingY + 32);
											if (var30 < 20) {
												var22 += var10.inventoryXOffsets[var30];
												var23 += var10.inventoryYOffsets[var30];
											}

											if (var10.itemIds[var30] <= 0) {
												if (var10.inventorySprites != null && var30 < 20) {
													SpritePixels var39 = var10.getInventorySprite(var30);
													if (var39 != null) {
														var39.drawTransBgAt(var22, var23);
													} else if (Widget.field2603) {
														CollisionMap.invalidateWidget(var10);
													}
												}
											} else {
												boolean var46 = false;
												boolean var40 = false;
												var26 = var10.itemIds[var30] - 1;
												if (var22 + 32 > var2 && var22 < var4 && var23 + 32 > var3 && var23 < var5 || var10 == class171.dragInventoryWidget && var30 == Client.dragItemSlotSource) {
													SpritePixels var35;
													if (Client.isItemSelected == 1 && var30 == ChatChannel.selectedItemSlot && var10.id == WorldMapLabelSize.selectedItemWidget) {
														var35 = WorldMapManager.getItemSprite(var26, var10.itemQuantities[var30], 2, 0, 2, false);
													} else {
														var35 = WorldMapManager.getItemSprite(var26, var10.itemQuantities[var30], 1, 3153952, 2, false);
													}

													if (var35 != null) {
														if (var10 == class171.dragInventoryWidget && var30 == Client.dragItemSlotSource) {
															var33 = MouseHandler.MouseHandler_x - Client.draggedWidgetX;
															var25 = MouseHandler.MouseHandler_y - Client.draggedWidgetY;
															if (var33 < 5 && var33 > -5) {
																var33 = 0;
															}

															if (var25 < 5 && var25 > -5) {
																var25 = 0;
															}

															if (Client.itemDragDuration < 5) {
																var33 = 0;
																var25 = 0;
															}

															var35.drawTransAt(var22 + var33, var23 + var25, 128);
															if (var1 != -1) {
																Widget var28 = var0[var1 & 65535];
																int var29;
																if (var23 + var25 < Rasterizer2D.Rasterizer2D_yClipStart && var28.scrollY > 0) {
																	var29 = (Rasterizer2D.Rasterizer2D_yClipStart - var23 - var25) * Client.field850 / 3;
																	if (var29 > Client.field850 * 10) {
																		var29 = Client.field850 * 10;
																	}

																	if (var29 > var28.scrollY) {
																		var29 = var28.scrollY;
																	}

																	var28.scrollY -= var29;
																	Client.draggedWidgetY += var29;
																	CollisionMap.invalidateWidget(var28);
																}

																if (var23 + var25 + 32 > Rasterizer2D.Rasterizer2D_yClipEnd && var28.scrollY < var28.scrollHeight - var28.height) {
																	var29 = (var25 + var23 + 32 - Rasterizer2D.Rasterizer2D_yClipEnd) * Client.field850 / 3;
																	if (var29 > Client.field850 * 10) {
																		var29 = Client.field850 * 10;
																	}

																	if (var29 > var28.scrollHeight - var28.height - var28.scrollY) {
																		var29 = var28.scrollHeight - var28.height - var28.scrollY;
																	}

																	var28.scrollY += var29;
																	Client.draggedWidgetY -= var29;
																	CollisionMap.invalidateWidget(var28);
																}
															}
														} else if (var10 == NPC.field1131 && var30 == Client.field881) {
															var35.drawTransAt(var22, var23, 128);
														} else {
															var35.drawTransBgAt(var22, var23);
														}
													} else {
														CollisionMap.invalidateWidget(var10);
													}
												}
											}

											++var30;
										}
									}
								} else if (var10.type == 3) {
									if (class8.runCs1(var10)) {
										var30 = var10.color2;
										if (var10 == EnumComposition.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) {
											var30 = var10.mouseOverColor2;
										}
									} else {
										var30 = var10.color;
										if (var10 == EnumComposition.mousedOverWidgetIf1 && var10.mouseOverColor != 0) {
											var30 = var10.mouseOverColor;
										}
									}

									if (var10.fill) {
										switch(var10.fillMode.field3902) {
										case 1:
											Rasterizer2D.Rasterizer2D_fillRectangleGradient(var12, var13, var10.width, var10.height, var10.color, var10.color2);
											break;
										case 2:
											Rasterizer2D.Rasterizer2D_fillRectangleGradientAlpha(var12, var13, var10.width, var10.height, var10.color, var10.color2, 255 - (var10.transparencyTop & 255), 255 - (var10.transparencyBot & 255));
											break;
										default:
											if (var14 == 0) {
												Rasterizer2D.Rasterizer2D_fillRectangle(var12, var13, var10.width, var10.height, var30);
											} else {
												Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var12, var13, var10.width, var10.height, var30, 256 - (var14 & 255));
											}
										}
									} else if (var14 == 0) {
										Rasterizer2D.Rasterizer2D_drawRectangle(var12, var13, var10.width, var10.height, var30);
									} else {
										Rasterizer2D.Rasterizer2D_drawRectangleAlpha(var12, var13, var10.width, var10.height, var30, 256 - (var14 & 255));
									}
								} else {
									Font var36;
									if (var10.type == 4) {
										var36 = var10.getFont();
										if (var36 == null) {
											if (Widget.field2603) {
												CollisionMap.invalidateWidget(var10);
											}
										} else {
											String var42 = var10.text;
											if (class8.runCs1(var10)) {
												var20 = var10.color2;
												if (var10 == EnumComposition.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) {
													var20 = var10.mouseOverColor2;
												}

												if (var10.text2.length() > 0) {
													var42 = var10.text2;
												}
											} else {
												var20 = var10.color;
												if (var10 == EnumComposition.mousedOverWidgetIf1 && var10.mouseOverColor != 0) {
													var20 = var10.mouseOverColor;
												}
											}

											if (var10.isIf3 && var10.itemId != -1) {
												ItemComposition var45 = SecureRandomCallable.ItemDefinition_get(var10.itemId);
												var42 = var45.name;
												if (var42 == null) {
													var42 = "null";
												}

												if ((var45.isStackable == 1 || var10.itemQuantity != 1) && var10.itemQuantity != -1) {
													var42 = class23.colorStartTag(16748608) + var42 + "</col>" + " " + 'x' + DevicePcmPlayerProvider.formatItemStacks(var10.itemQuantity);
												}
											}

											if (var10 == Client.meslayerContinueWidget) {
												var42 = "Please wait...";
												var20 = var10.color;
											}

											if (!var10.isIf3) {
												var42 = class234.method4160(var42, var10);
											}

											var36.drawLines(var42, var12, var13, var10.width, var10.height, var20, var10.textShadowed ? 0 : -1, var10.textXAlignment, var10.textYAlignment, var10.textLineHeight);
										}
									} else if (var10.type == 5) {
										SpritePixels var37;
										if (!var10.isIf3) {
											var37 = var10.getSprite(class8.runCs1(var10));
											if (var37 != null) {
												var37.drawTransBgAt(var12, var13);
											} else if (Widget.field2603) {
												CollisionMap.invalidateWidget(var10);
											}
										} else {
											if (var10.itemId != -1) {
												var37 = WorldMapManager.getItemSprite(var10.itemId, var10.itemQuantity, var10.outline, var10.spriteShadow, var10.itemQuantityMode, false);
											} else {
												var37 = var10.getSprite(false);
											}

											if (var37 == null) {
												if (Widget.field2603) {
													CollisionMap.invalidateWidget(var10);
												}
											} else {
												var20 = var37.width;
												var21 = var37.height;
												if (!var10.spriteTiling) {
													var22 = var10.width * 4096 / var20;
													if (var10.spriteAngle != 0) {
														var37.method6190(var10.width / 2 + var12, var10.height / 2 + var13, var10.spriteAngle, var22);
													} else if (var14 != 0) {
														var37.drawTransScaledAt(var12, var13, var10.width, var10.height, 256 - (var14 & 255));
													} else if (var20 == var10.width && var21 == var10.height) {
														var37.drawTransBgAt(var12, var13);
													} else {
														var37.drawScaledAt(var12, var13, var10.width, var10.height);
													}
												} else {
													Rasterizer2D.Rasterizer2D_expandClip(var12, var13, var12 + var10.width, var13 + var10.height);
													var22 = (var20 - 1 + var10.width) / var20;
													var23 = (var21 - 1 + var10.height) / var21;

													for (var33 = 0; var33 < var22; ++var33) {
														for (var25 = 0; var25 < var23; ++var25) {
															if (var10.spriteAngle != 0) {
																var37.method6190(var20 / 2 + var12 + var20 * var33, var21 / 2 + var13 + var21 * var25, var10.spriteAngle, 4096);
															} else if (var14 != 0) {
																var37.drawTransAt(var12 + var33 * var20, var13 + var25 * var21, 256 - (var14 & 255));
															} else {
																var37.drawTransBgAt(var12 + var20 * var33, var13 + var25 * var21);
															}
														}
													}

													Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
												}
											}
										}
									} else {
										ItemComposition var34;
										if (var10.type == 6) {
											boolean var43 = class8.runCs1(var10);
											if (var43) {
												var20 = var10.sequenceId2;
											} else {
												var20 = var10.sequenceId;
											}

											Model var41 = null;
											var22 = 0;
											if (var10.itemId != -1) {
												var34 = SecureRandomCallable.ItemDefinition_get(var10.itemId);
												if (var34 != null) {
													var34 = var34.getCountObj(var10.itemQuantity);
													var41 = var34.getModel(1);
													if (var41 != null) {
														var41.calculateBoundsCylinder();
														var22 = var41.height / 2;
													} else {
														CollisionMap.invalidateWidget(var10);
													}
												}
											} else if (var10.modelType == 5) {
												if (var10.modelId == 0) {
													var41 = Client.playerAppearance.getModel((SequenceDefinition)null, -1, (SequenceDefinition)null, -1);
												} else {
													var41 = PlayerComposition.localPlayer.getModel();
												}
											} else if (var20 == -1) {
												var41 = var10.getModel((SequenceDefinition)null, -1, var43, PlayerComposition.localPlayer.appearance);
												if (var41 == null && Widget.field2603) {
													CollisionMap.invalidateWidget(var10);
												}
											} else {
												SequenceDefinition var47 = ParamDefinition.SequenceDefinition_get(var20);
												var41 = var10.getModel(var47, var10.modelFrame, var43, PlayerComposition.localPlayer.appearance);
												if (var41 == null && Widget.field2603) {
													CollisionMap.invalidateWidget(var10);
												}
											}

											Rasterizer3D.method3138(var10.width / 2 + var12, var10.height / 2 + var13);
											var23 = Rasterizer3D.Rasterizer3D_sine[var10.modelAngleX] * var10.modelZoom >> 16;
											var33 = Rasterizer3D.Rasterizer3D_cosine[var10.modelAngleX] * var10.modelZoom >> 16;
											if (var41 != null) {
												if (!var10.isIf3) {
													var41.method2966(0, var10.modelAngleY, 0, var10.modelAngleX, 0, var23, var33);
												} else {
													var41.calculateBoundsCylinder();
													if (var10.modelOrthog) {
														var41.method2967(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var22 + var23 + var10.modelOffsetY, var33 + var10.modelOffsetY, var10.modelZoom);
													} else {
														var41.method2966(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var22 + var23 + var10.modelOffsetY, var33 + var10.modelOffsetY);
													}
												}
											}

											Rasterizer3D.Rasterizer3D_method3();
										} else {
											if (var10.type == 7) {
												var36 = var10.getFont();
												if (var36 == null) {
													if (Widget.field2603) {
														CollisionMap.invalidateWidget(var10);
													}
													continue;
												}

												var20 = 0;

												for (var21 = 0; var21 < var10.rawHeight; ++var21) {
													for (var22 = 0; var22 < var10.rawWidth; ++var22) {
														if (var10.itemIds[var20] > 0) {
															var34 = SecureRandomCallable.ItemDefinition_get(var10.itemIds[var20] - 1);
															String var24;
															if (var34.isStackable != 1 && var10.itemQuantities[var20] == 1) {
																var24 = class23.colorStartTag(16748608) + var34.name + "</col>";
															} else {
																var24 = class23.colorStartTag(16748608) + var34.name + "</col>" + " " + 'x' + DevicePcmPlayerProvider.formatItemStacks(var10.itemQuantities[var20]);
															}

															var25 = var12 + var22 * (var10.paddingX + 115);
															var26 = var21 * (var10.paddingY + 12) + var13;
															if (var10.textXAlignment == 0) {
																var36.draw(var24, var25, var26, var10.color, var10.textShadowed ? 0 : -1);
															} else if (var10.textXAlignment == 1) {
																var36.drawCentered(var24, var10.width / 2 + var25, var26, var10.color, var10.textShadowed ? 0 : -1);
															} else {
																var36.drawRightAligned(var24, var25 + var10.width - 1, var26, var10.color, var10.textShadowed ? 0 : -1);
															}
														}

														++var20;
													}
												}
											}

											if (var10.type == 8 && var10 == CollisionMap.field2092 && Client.field799 == Client.field751) {
												var30 = 0;
												var20 = 0;
												Font var31 = WorldMapLabelSize.fontPlain12;
												String var32 = var10.text;

												String var44;
												for (var32 = class234.method4160(var32, var10); var32.length() > 0; var20 = var20 + var31.ascent + 1) {
													var33 = var32.indexOf("<br>");
													if (var33 != -1) {
														var44 = var32.substring(0, var33);
														var32 = var32.substring(var33 + 4);
													} else {
														var44 = var32;
														var32 = "";
													}

													var25 = var31.stringWidth(var44);
													if (var25 > var30) {
														var30 = var25;
													}
												}

												var30 += 6;
												var20 += 7;
												var33 = var12 + var10.width - 5 - var30;
												var25 = var13 + var10.height + 5;
												if (var33 < var12 + 5) {
													var33 = var12 + 5;
												}

												if (var30 + var33 > var4) {
													var33 = var4 - var30;
												}

												if (var20 + var25 > var5) {
													var25 = var5 - var20;
												}

												Rasterizer2D.Rasterizer2D_fillRectangle(var33, var25, var30, var20, 16777120);
												Rasterizer2D.Rasterizer2D_drawRectangle(var33, var25, var30, var20, 0);
												var32 = var10.text;
												var26 = var25 + var31.ascent + 2;

												for (var32 = class234.method4160(var32, var10); var32.length() > 0; var26 = var26 + var31.ascent + 1) {
													int var27 = var32.indexOf("<br>");
													if (var27 != -1) {
														var44 = var32.substring(0, var27);
														var32 = var32.substring(var27 + 4);
													} else {
														var44 = var32;
														var32 = "";
													}

													var31.draw(var44, var33 + 3, var26, 0, -1);
												}
											}

											if (var10.type == 9) {
												if (var10.field2620) {
													var30 = var12;
													var20 = var13 + var10.height;
													var21 = var12 + var10.width;
													var22 = var13;
												} else {
													var30 = var12;
													var20 = var13;
													var21 = var12 + var10.width;
													var22 = var13 + var10.height;
												}

												if (var10.lineWid == 1) {
													Rasterizer2D.Rasterizer2D_drawLine(var30, var20, var21, var22, var10.color);
												} else {
													class7.method87(var30, var20, var21, var22, var10.color, var10.lineWid);
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("ls")
	@ObfuscatedSignature(
		signature = "(IS)V",
		garbageValue = "17801"
	)
	static void method5354(int var0) {
		Client.oculusOrbState = var0;
	}
}
