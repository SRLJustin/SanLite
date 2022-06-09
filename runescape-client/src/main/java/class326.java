import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("lh")
public class class326 {
	@ObfuscatedName("o")
	@Export("spriteMap")
	final HashMap spriteMap;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lne;"
	)
	@Export("bounds")
	Bounds bounds;
	@ObfuscatedName("l")
	int[] field4099;
	@ObfuscatedName("k")
	int[] field4102;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 259027383
	)
	int field4103;

	public class326() {
		this.spriteMap = new HashMap();
		this.bounds = new Bounds(0, 0);
		this.field4099 = new int[2048];
		this.field4102 = new int[2048];
		this.field4103 = 0;
		ScriptEvent.method2074();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1955100783"
	)
	void method5849(int var1) {
		int var2 = var1 * 2 + 1;
		double var4 = (double)((float)var1 / 3.0F);
		int var6 = var1 * 2 + 1;
		double[] var7 = new double[var6];
		int var8 = -var1;

		for (int var9 = 0; var8 <= var1; ++var9) {
			double var20 = WorldMapID.method4811((double)(var8 - 0) / var4) / var4;
			var7[var9] = var20;
			++var8;
		}

		double[] var14 = var7;
		double var15 = var7[var1] * var7[var1];
		int[] var17 = new int[var2 * var2];
		boolean var10 = false;

		for (int var11 = 0; var11 < var2; ++var11) {
			for (int var12 = 0; var12 < var2; ++var12) {
				int var13 = var17[var12 + var2 * var11] = (int)(256.0D * (var14[var12] * var14[var11] / var15));
				if (!var10 && var13 > 0) {
					var10 = true;
				}
			}
		}

		SpritePixels var18 = new SpritePixels(var17, var2, var2);
		this.spriteMap.put(var1, var18);
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IB)Lqr;",
		garbageValue = "125"
	)
	SpritePixels method5866(int var1) {
		if (!this.spriteMap.containsKey(var1)) {
			this.method5849(var1);
		}

		return (SpritePixels)this.spriteMap.get(var1);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2103923209"
	)
	public final void method5848(int var1, int var2) {
		if (this.field4103 < this.field4099.length) {
			this.field4099[this.field4103] = var1;
			this.field4102[this.field4103] = var2;
			++this.field4103;
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1637877740"
	)
	public final void method5851() {
		this.field4103 = 0;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IILqr;FB)V",
		garbageValue = "5"
	)
	public final void method5852(int var1, int var2, SpritePixels var3, float var4) {
		int var5 = (int)(18.0F * var4);
		SpritePixels var6 = this.method5866(var5);
		int var7 = var5 * 2 + 1;
		Bounds var8 = new Bounds(0, 0, var3.subWidth, var3.subHeight);
		Bounds var9 = new Bounds(0, 0);
		this.bounds.setHigh(var7, var7);
		System.nanoTime();

		int var10;
		int var11;
		int var12;
		for (var10 = 0; var10 < this.field4103; ++var10) {
			var11 = this.field4099[var10];
			var12 = this.field4102[var10];
			int var13 = (int)((float)(var11 - var1) * var4) - var5;
			int var14 = (int)((float)var3.subHeight - var4 * (float)(var12 - var2)) - var5;
			this.bounds.setLow(var13, var14);
			this.bounds.method6758(var8, var9);
			this.method5853(var6, var3, var9);
		}

		System.nanoTime();
		System.nanoTime();

		for (var10 = 0; var10 < var3.pixels.length; ++var10) {
			if (var3.pixels[var10] == 0) {
				var3.pixels[var10] = -16777216;
			} else {
				var11 = (var3.pixels[var10] + 64 - 1) / 256;
				if (var11 <= 0) {
					var3.pixels[var10] = -16777216;
				} else {
					if (var11 > class82.field1072.length) {
						var11 = class82.field1072.length;
					}

					var12 = class82.field1072[var11 - 1];
					var3.pixels[var10] = -16777216 | var12;
				}
			}
		}

		System.nanoTime();
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lqr;Lqr;Lne;B)V",
		garbageValue = "-99"
	)
	void method5853(SpritePixels var1, SpritePixels var2, Bounds var3) {
		if (var3.highX != 0 && var3.highY != 0) {
			int var4 = 0;
			int var5 = 0;
			if (var3.lowX == 0) {
				var4 = var1.subWidth - var3.highX;
			}

			if (var3.lowY == 0) {
				var5 = var1.subHeight - var3.highY;
			}

			int var6 = var4 + var5 * var1.subWidth;
			int var7 = var3.lowX + var2.subWidth * var3.lowY;

			for (int var8 = 0; var8 < var3.highY; ++var8) {
				for (int var9 = 0; var9 < var3.highX; ++var9) {
					int[] var10000 = var2.pixels;
					int var10001 = var7++;
					var10000[var10001] += var1.pixels[var6++];
				}

				var6 += var1.subWidth - var3.highX;
				var7 += var2.subWidth - var3.highX;
			}

		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILbb;ZB)I",
		garbageValue = "-63"
	)
	static int method5868(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 6600) {
			var3 = class128.Client_plane;
			int var15 = SecureRandomCallable.baseX * 64 + (ModelData0.localPlayer.x >> 7);
			int var8 = GrandExchangeOfferOwnWorldComparator.baseY * 64 + (ModelData0.localPlayer.y >> 7);
			MilliClock.getWorldMap().method7033(var3, var15, var8, true);
			return 1;
		} else {
			WorldMapArea var9;
			if (var0 == ScriptOpcodes.WORLDMAP_GETMAPNAME) {
				var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
				String var16 = "";
				var9 = MilliClock.getWorldMap().getMapArea(var3);
				if (var9 != null) {
					var16 = var9.getExternalName();
				}

				Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var16;
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETMAP) {
				var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
				MilliClock.getWorldMap().setCurrentMapAreaId(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_GETZOOM) {
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = MilliClock.getWorldMap().getZoomLevel();
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETZOOM) {
				var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
				MilliClock.getWorldMap().setZoomPercentage(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_ISLOADED) {
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = MilliClock.getWorldMap().isCacheLoaded() ? 1 : 0;
				return 1;
			} else {
				Coord var14;
				if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]);
					MilliClock.getWorldMap().setWorldMapPositionTarget(var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD_INSTANT) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]);
					MilliClock.getWorldMap().setWorldMapPositionTargetInstant(var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]);
					MilliClock.getWorldMap().jumpToSourceCoord(var14.plane, var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD_INSTANT) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]);
					MilliClock.getWorldMap().jumpToSourceCoordInstant(var14.plane, var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYPOSITION) {
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = MilliClock.getWorldMap().getDisplayX();
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = MilliClock.getWorldMap().getDisplayY();
					return 1;
				} else {
					WorldMapArea var11;
					if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGORIGIN) {
						var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
						var11 = MilliClock.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var11.getOrigin().packed();
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGSIZE) {
						var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
						var11 = MilliClock.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = (var11.getRegionHighX() - var11.getRegionLowX() + 1) * 64;
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = (var11.getRegionHighY() - var11.getRegionLowY() + 1) * 64;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGBOUNDS) {
						var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
						var11 = MilliClock.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var11.getRegionLowX() * 64;
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var11.getRegionLowY() * 64;
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var11.getRegionHighX() * 64 + 64 - 1;
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var11.getRegionHighY() * 64 + 64 - 1;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGZOOM) {
						var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
						var11 = MilliClock.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var11.getZoom();
						}

						return 1;
					} else if (var0 == 6615) {
						var14 = MilliClock.getWorldMap().getDisplayCoord();
						if (var14 == null) {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var14.x;
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var14.y;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCURRENTMAP) {
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = MilliClock.getWorldMap().currentMapAreaId();
						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYCOORD) {
						var14 = new Coord(Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]);
						var11 = MilliClock.getWorldMap().getCurrentMapArea();
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1;
							return 1;
						} else {
							int[] var12 = var11.position(var14.plane, var14.x, var14.y);
							if (var12 == null) {
								Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1;
								Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1;
							} else {
								Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var12[0];
								Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var12[1];
							}

							return 1;
						}
					} else {
						Coord var5;
						if (var0 == 6618) {
							var14 = new Coord(Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]);
							var11 = MilliClock.getWorldMap().getCurrentMapArea();
							if (var11 == null) {
								Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1;
								Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1;
								return 1;
							} else {
								var5 = var11.coord(var14.x, var14.y);
								if (var5 == null) {
									Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1;
								} else {
									Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var5.packed();
								}

								return 1;
							}
						} else {
							Coord var10;
							if (var0 == 6619) {
								class12.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]);
								FriendsList.method6449(var3, var10, false);
								return 1;
							} else if (var0 == 6620) {
								class12.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]);
								FriendsList.method6449(var3, var10, true);
								return 1;
							} else if (var0 == ScriptOpcodes.WORLDMAP_COORDINMAP) {
								class12.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]);
								var9 = MilliClock.getWorldMap().getMapArea(var3);
								if (var9 == null) {
									Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
									return 1;
								} else {
									Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var9.containsCoord(var10.plane, var10.x, var10.y) ? 1 : 0;
									return 1;
								}
							} else if (var0 == ScriptOpcodes.WORLDMAP_GETSIZE) {
								Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = MilliClock.getWorldMap().getDisplayWith();
								Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = MilliClock.getWorldMap().getDisplayHeight();
								return 1;
							} else if (var0 == 6623) {
								var14 = new Coord(Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]);
								var11 = MilliClock.getWorldMap().mapAreaAtCoord(var14.plane, var14.x, var14.y);
								if (var11 == null) {
									Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1;
								} else {
									Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var11.getId();
								}

								return 1;
							} else if (var0 == 6624) {
								MilliClock.getWorldMap().setMaxFlashCount(Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]);
								return 1;
							} else if (var0 == 6625) {
								MilliClock.getWorldMap().resetMaxFlashCount();
								return 1;
							} else if (var0 == 6626) {
								MilliClock.getWorldMap().setCyclesPerFlash(Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]);
								return 1;
							} else if (var0 == 6627) {
								MilliClock.getWorldMap().resetCyclesPerFlash();
								return 1;
							} else {
								boolean var13;
								if (var0 == ScriptOpcodes.WORLDMAP_PERPETUALFLASH) {
									var13 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1;
									MilliClock.getWorldMap().setPerpetualFlash(var13);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENT) {
									var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
									MilliClock.getWorldMap().flashElement(var3);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENTCATEGORY) {
									var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
									MilliClock.getWorldMap().flashCategory(var3);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_STOPCURRENTFLASHES) {
									MilliClock.getWorldMap().stopCurrentFlashes();
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTS) {
									var13 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1;
									MilliClock.getWorldMap().setElementsDisabled(var13);
									return 1;
								} else {
									boolean var7;
									if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENT) {
										class12.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize];
										var7 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1] == 1;
										MilliClock.getWorldMap().disableElement(var3, var7);
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTCATEGORY) {
										class12.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize];
										var7 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1] == 1;
										MilliClock.getWorldMap().setCategoryDisabled(var3, var7);
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTS) {
										Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = MilliClock.getWorldMap().getElementsDisabled() ? 1 : 0;
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENT) {
										var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
										Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = MilliClock.getWorldMap().isElementDisabled(var3) ? 1 : 0;
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTCATEGORY) {
										var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
										Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = MilliClock.getWorldMap().isCategoryDisabled(var3) ? 1 : 0;
										return 1;
									} else if (var0 == 6638) {
										class12.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize];
										var10 = new Coord(Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]);
										var5 = MilliClock.getWorldMap().method7076(var3, var10);
										if (var5 == null) {
											Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1;
										} else {
											Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var5.packed();
										}

										return 1;
									} else {
										AbstractWorldMapIcon var6;
										if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_START) {
											var6 = MilliClock.getWorldMap().iconStart();
											if (var6 == null) {
												Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1;
												Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var6.getElement();
												Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var6.coord2.packed();
											}

											return 1;
										} else if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_NEXT) {
											var6 = MilliClock.getWorldMap().iconNext();
											if (var6 == null) {
												Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1;
												Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var6.getElement();
												Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var6.coord2.packed();
											}

											return 1;
										} else {
											WorldMapElement var4;
											if (var0 == ScriptOpcodes.MEC_TEXT) {
												var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
												var4 = class120.WorldMapElement_get(var3);
												if (var4.name == null) {
													Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = "";
												} else {
													Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var4.name;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.MEC_TEXTSIZE) {
												var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
												var4 = class120.WorldMapElement_get(var3);
												Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var4.textSize;
												return 1;
											} else if (var0 == ScriptOpcodes.MEC_CATEGORY) {
												var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
												var4 = class120.WorldMapElement_get(var3);
												if (var4 == null) {
													Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var4.category;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.MEC_SPRITE) {
												var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
												var4 = class120.WorldMapElement_get(var3);
												if (var4 == null) {
													Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var4.sprite1;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENT) {
												Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = class9.worldMapEvent.mapElement;
												return 1;
											} else if (var0 == 6698) {
												Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = class9.worldMapEvent.coord1.packed();
												return 1;
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENTCOORD) {
												Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = class9.worldMapEvent.coord2.packed();
												return 1;
											} else {
												return 2;
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
