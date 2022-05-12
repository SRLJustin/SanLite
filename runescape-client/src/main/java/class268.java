import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.TimeZone;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@js
@ObfuscatedName("ju")
public final class class268 {
	@ObfuscatedName("l")
	static final HashMap field3208;
	@ObfuscatedName("a")
	@Export("Interpreter_stringLocals")
	static String[] Interpreter_stringLocals;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 685628771
	)
	static int field3212;

	static {
		field3208 = new HashMap();
		TimeZone var0;
		synchronized(field3208) {
			TimeZone var2 = (TimeZone)field3208.get("Europe/London");
			if (var2 == null) {
				var2 = TimeZone.getTimeZone("Europe/London");
				field3208.put("Europe/London", var2);
			}

			var0 = var2;
		}

		java.util.Calendar.getInstance(var0);
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;Ljava/io/File;I)V",
		garbageValue = "-1479426402"
	)
	static void method5030(File var0, File var1) {
		try {
			AccessFile var2 = new AccessFile(JagexCache.JagexCache_locationFile, "rw", 10000L);
			Buffer var3 = new Buffer(500);
			var3.writeByte(3);
			var3.writeByte(var1 != null ? 1 : 0);
			var3.writeCESU8(var0.getPath());
			if (var1 != null) {
				var3.writeCESU8("");
			}

			var2.write(var3.array, 0, var3.offset);
			var2.close();
		} catch (IOException var4) {
			var4.printStackTrace();
		}

	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Date;I)Z",
		garbageValue = "1429154223"
	)
	static boolean method5028(Date var0) {
		java.util.Calendar var1 = java.util.Calendar.getInstance();
		var1.set(1, var1.get(1) - 13);
		var1.set(5, var1.get(5) + 1);
		var1.set(11, 0);
		var1.set(12, 0);
		var1.set(13, 0);
		var1.set(14, 0);
		Date var2 = var1.getTime();
		return var0.before(var2);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lgm;[Lgh;B)V",
		garbageValue = "61"
	)
	static final void method5029(Scene var0, CollisionMap[] var1) {
		int var2;
		int var3;
		int var4;
		int var5;
		for (var2 = 0; var2 < 4; ++var2) {
			for (var3 = 0; var3 < 104; ++var3) {
				for (var4 = 0; var4 < 104; ++var4) {
					if ((Tiles.Tiles_renderFlags[var2][var3][var4] & 1) == 1) {
						var5 = var2;
						if ((Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) {
							var5 = var2 - 1;
						}

						if (var5 >= 0) {
							var1[var5].method3753(var3, var4);
						}
					}
				}
			}
		}

		Tiles.rndHue += (int)(Math.random() * 5.0D) - 2;
		if (Tiles.rndHue < -8) {
			Tiles.rndHue = -8;
		}

		if (Tiles.rndHue > 8) {
			Tiles.rndHue = 8;
		}

		Tiles.rndLightness += (int)(Math.random() * 5.0D) - 2;
		if (Tiles.rndLightness < -16) {
			Tiles.rndLightness = -16;
		}

		if (Tiles.rndLightness > 16) {
			Tiles.rndLightness = 16;
		}

		int var9;
		int var10;
		int var11;
		int var12;
		int var13;
		int var14;
		int var15;
		int var16;
		int[] var10000;
		int var17;
		int var18;
		for (var2 = 0; var2 < 4; ++var2) {
			byte[][] var42 = NPC.field1259[var2];
			boolean var45 = true;
			boolean var46 = true;
			boolean var6 = true;
			boolean var7 = true;
			boolean var8 = true;
			var9 = (int)Math.sqrt(5100.0D);
			var10 = var9 * 768 >> 8;

			int var19;
			int var20;
			for (var11 = 1; var11 < 103; ++var11) {
				for (var12 = 1; var12 < 103; ++var12) {
					var13 = Tiles.Tiles_heights[var2][var12 + 1][var11] - Tiles.Tiles_heights[var2][var12 - 1][var11];
					var14 = Tiles.Tiles_heights[var2][var12][var11 + 1] - Tiles.Tiles_heights[var2][var12][var11 - 1];
					var15 = (int)Math.sqrt((double)(var14 * var14 + var13 * var13 + 65536));
					var16 = (var13 << 8) / var15;
					var17 = 65536 / var15;
					var18 = (var14 << 8) / var15;
					var19 = (var18 * -50 + var16 * -50 + var17 * -10) / var10 + 96;
					var20 = (var42[var12][var11 + 1] >> 3) + (var42[var12 - 1][var11] >> 2) + (var42[var12][var11 - 1] >> 2) + (var42[var12 + 1][var11] >> 3) + (var42[var12][var11] >> 1);
					Interpreter.field839[var12][var11] = var19 - var20;
				}
			}

			for (var11 = 0; var11 < 104; ++var11) {
				class154.Tiles_hue[var11] = 0;
				MusicPatch.Tiles_saturation[var11] = 0;
				DecorativeObject.Tiles_lightness[var11] = 0;
				Tiles.Tiles_hueMultiplier[var11] = 0;
				MenuAction.field866[var11] = 0;
			}

			for (var11 = -5; var11 < 109; ++var11) {
				for (var12 = 0; var12 < 104; ++var12) {
					var13 = var11 + 5;
					int var10002;
					if (var13 >= 0 && var13 < 104) {
						var14 = Tiles.Tiles_underlays[var2][var13][var12] & 255;
						if (var14 > 0) {
							FloorUnderlayDefinition var43 = class160.method3171(var14 - 1);
							var10000 = class154.Tiles_hue;
							var10000[var12] += var43.hue;
							var10000 = MusicPatch.Tiles_saturation;
							var10000[var12] += var43.saturation;
							var10000 = DecorativeObject.Tiles_lightness;
							var10000[var12] += var43.lightness;
							var10000 = Tiles.Tiles_hueMultiplier;
							var10000[var12] += var43.hueMultiplier;
							var10002 = MenuAction.field866[var12]++;
						}
					}

					var14 = var11 - 5;
					if (var14 >= 0 && var14 < 104) {
						var15 = Tiles.Tiles_underlays[var2][var14][var12] & 255;
						if (var15 > 0) {
							FloorUnderlayDefinition var44 = class160.method3171(var15 - 1);
							var10000 = class154.Tiles_hue;
							var10000[var12] -= var44.hue;
							var10000 = MusicPatch.Tiles_saturation;
							var10000[var12] -= var44.saturation;
							var10000 = DecorativeObject.Tiles_lightness;
							var10000[var12] -= var44.lightness;
							var10000 = Tiles.Tiles_hueMultiplier;
							var10000[var12] -= var44.hueMultiplier;
							var10002 = MenuAction.field866[var12]--;
						}
					}
				}

				if (var11 >= 1 && var11 < 103) {
					var12 = 0;
					var13 = 0;
					var14 = 0;
					var15 = 0;
					var16 = 0;

					for (var17 = -5; var17 < 109; ++var17) {
						var18 = var17 + 5;
						if (var18 >= 0 && var18 < 104) {
							var12 += class154.Tiles_hue[var18];
							var13 += MusicPatch.Tiles_saturation[var18];
							var14 += DecorativeObject.Tiles_lightness[var18];
							var15 += Tiles.Tiles_hueMultiplier[var18];
							var16 += MenuAction.field866[var18];
						}

						var19 = var17 - 5;
						if (var19 >= 0 && var19 < 104) {
							var12 -= class154.Tiles_hue[var19];
							var13 -= MusicPatch.Tiles_saturation[var19];
							var14 -= DecorativeObject.Tiles_lightness[var19];
							var15 -= Tiles.Tiles_hueMultiplier[var19];
							var16 -= MenuAction.field866[var19];
						}

						if (var17 >= 1 && var17 < 103 && (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var11][var17] & 2) != 0 || (Tiles.Tiles_renderFlags[var2][var11][var17] & 16) == 0)) {
							if (var2 < Tiles.Tiles_minPlane) {
								Tiles.Tiles_minPlane = var2;
							}

							var20 = Tiles.Tiles_underlays[var2][var11][var17] & 255;
							int var21 = Tiles.Tiles_overlays[var2][var11][var17] & 255;
							if (var20 > 0 || var21 > 0) {
								int var22 = Tiles.Tiles_heights[var2][var11][var17];
								int var23 = Tiles.Tiles_heights[var2][var11 + 1][var17];
								int var24 = Tiles.Tiles_heights[var2][var11 + 1][var17 + 1];
								int var25 = Tiles.Tiles_heights[var2][var11][var17 + 1];
								int var26 = Interpreter.field839[var11][var17];
								int var27 = Interpreter.field839[var11 + 1][var17];
								int var28 = Interpreter.field839[var11 + 1][var17 + 1];
								int var29 = Interpreter.field839[var11][var17 + 1];
								int var30 = -1;
								int var31 = -1;
								int var32;
								int var33;
								if (var20 > 0) {
									var32 = var12 * 256 / var15;
									var33 = var13 / var16;
									int var34 = var14 / var16;
									var30 = ArchiveLoader.hslToRgb(var32, var33, var34);
									var32 = var32 + Tiles.rndHue & 255;
									var34 += Tiles.rndLightness;
									if (var34 < 0) {
										var34 = 0;
									} else if (var34 > 255) {
										var34 = 255;
									}

									var31 = ArchiveLoader.hslToRgb(var32, var33, var34);
								}

								if (var2 > 0) {
									boolean var51 = true;
									if (var20 == 0 && Tiles.Tiles_shapes[var2][var11][var17] != 0) {
										var51 = false;
									}

									if (var21 > 0 && !Message.method1098(var21 - 1).hideUnderlay) {
										var51 = false;
									}

									if (var51 && var23 == var22 && var24 == var22 && var25 == var22) {
										var10000 = VerticalAlignment.field1993[var2][var11];
										var10000[var17] |= 2340;
									}
								}

								var32 = 0;
								if (var31 != -1) {
									var32 = Rasterizer3D.Rasterizer3D_colorPalette[DevicePcmPlayerProvider.method340(var31, 96)];
								}

								if (var21 == 0) {
									var0.addTile(var2, var11, var17, 0, 0, -1, var22, var23, var24, var25, DevicePcmPlayerProvider.method340(var30, var26), DevicePcmPlayerProvider.method340(var30, var27), DevicePcmPlayerProvider.method340(var30, var28), DevicePcmPlayerProvider.method340(var30, var29), 0, 0, 0, 0, var32, 0);
								} else {
									var33 = Tiles.Tiles_shapes[var2][var11][var17] + 1;
									byte var52 = RunException.field4812[var2][var11][var17];
									FloorOverlayDefinition var35 = Message.method1098(var21 - 1);
									int var36 = var35.texture;
									int var37;
									int var38;
									int var39;
									int var40;
									if (var36 >= 0) {
										var38 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var36);
										var37 = -1;
									} else if (var35.primaryRgb == 16711935) {
										var37 = -2;
										var36 = -1;
										var38 = -2;
									} else {
										var37 = ArchiveLoader.hslToRgb(var35.hue, var35.saturation, var35.lightness);
										var39 = var35.hue + Tiles.rndHue & 255;
										var40 = var35.lightness + Tiles.rndLightness;
										if (var40 < 0) {
											var40 = 0;
										} else if (var40 > 255) {
											var40 = 255;
										}

										var38 = ArchiveLoader.hslToRgb(var39, var35.saturation, var40);
									}

									var39 = 0;
									if (var38 != -2) {
										var39 = Rasterizer3D.Rasterizer3D_colorPalette[ParamComposition.method3505(var38, 96)];
									}

									if (var35.secondaryRgb != -1) {
										var40 = var35.secondaryHue + Tiles.rndHue & 255;
										int var41 = var35.secondaryLightness + Tiles.rndLightness;
										if (var41 < 0) {
											var41 = 0;
										} else if (var41 > 255) {
											var41 = 255;
										}

										var38 = ArchiveLoader.hslToRgb(var40, var35.secondarySaturation, var41);
										var39 = Rasterizer3D.Rasterizer3D_colorPalette[ParamComposition.method3505(var38, 96)];
									}

									var0.addTile(var2, var11, var17, var33, var52, var36, var22, var23, var24, var25, DevicePcmPlayerProvider.method340(var30, var26), DevicePcmPlayerProvider.method340(var30, var27), DevicePcmPlayerProvider.method340(var30, var28), DevicePcmPlayerProvider.method340(var30, var29), ParamComposition.method3505(var37, var26), ParamComposition.method3505(var37, var27), ParamComposition.method3505(var37, var28), ParamComposition.method3505(var37, var29), var32, var39);
								}
							}
						}
					}
				}
			}

			for (var11 = 1; var11 < 103; ++var11) {
				for (var12 = 1; var12 < 103; ++var12) {
					var0.setTileMinPlane(var2, var12, var11, VarbitComposition.method3489(var2, var12, var11));
				}
			}

			Tiles.Tiles_underlays[var2] = null;
			Tiles.Tiles_overlays[var2] = null;
			Tiles.Tiles_shapes[var2] = null;
			RunException.field4812[var2] = null;
			NPC.field1259[var2] = null;
		}

		var0.method4057(-50, -10, -50);

		for (var2 = 0; var2 < 104; ++var2) {
			for (var3 = 0; var3 < 104; ++var3) {
				if ((Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) {
					var0.setLinkBelow(var2, var3);
				}
			}
		}

		var2 = 1;
		var3 = 2;
		var4 = 4;

		for (var5 = 0; var5 < 4; ++var5) {
			if (var5 > 0) {
				var2 <<= 3;
				var3 <<= 3;
				var4 <<= 3;
			}

			for (int var47 = 0; var47 <= var5; ++var47) {
				for (int var48 = 0; var48 <= 104; ++var48) {
					for (int var49 = 0; var49 <= 104; ++var49) {
						short var50;
						if ((VerticalAlignment.field1993[var47][var49][var48] & var2) != 0) {
							var9 = var48;
							var10 = var48;
							var11 = var47;

							for (var12 = var47; var9 > 0 && (VerticalAlignment.field1993[var47][var49][var9 - 1] & var2) != 0; --var9) {
							}

							while (var10 < 104 && (VerticalAlignment.field1993[var47][var49][var10 + 1] & var2) != 0) {
								++var10;
							}

							label422:
							while (var11 > 0) {
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((VerticalAlignment.field1993[var11 - 1][var49][var13] & var2) == 0) {
										break label422;
									}
								}

								--var11;
							}

							label411:
							while (var12 < var5) {
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((VerticalAlignment.field1993[var12 + 1][var49][var13] & var2) == 0) {
										break label411;
									}
								}

								++var12;
							}

							var13 = (var10 - var9 + 1) * (var12 + 1 - var11);
							if (var13 >= 8) {
								var50 = 240;
								var15 = Tiles.Tiles_heights[var12][var49][var9] - var50;
								var16 = Tiles.Tiles_heights[var11][var49][var9];
								Scene.Scene_addOccluder(var5, 1, var49 * 128, var49 * 128, var9 * 128, var10 * 128 + 128, var15, var16);

								for (var17 = var11; var17 <= var12; ++var17) {
									for (var18 = var9; var18 <= var10; ++var18) {
										var10000 = VerticalAlignment.field1993[var17][var49];
										var10000[var18] &= ~var2;
									}
								}
							}
						}

						if ((VerticalAlignment.field1993[var47][var49][var48] & var3) != 0) {
							var9 = var49;
							var10 = var49;
							var11 = var47;

							for (var12 = var47; var9 > 0 && (VerticalAlignment.field1993[var47][var9 - 1][var48] & var3) != 0; --var9) {
							}

							while (var10 < 104 && (VerticalAlignment.field1993[var47][var10 + 1][var48] & var3) != 0) {
								++var10;
							}

							label475:
							while (var11 > 0) {
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((VerticalAlignment.field1993[var11 - 1][var13][var48] & var3) == 0) {
										break label475;
									}
								}

								--var11;
							}

							label464:
							while (var12 < var5) {
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((VerticalAlignment.field1993[var12 + 1][var13][var48] & var3) == 0) {
										break label464;
									}
								}

								++var12;
							}

							var13 = (var10 - var9 + 1) * (var12 + 1 - var11);
							if (var13 >= 8) {
								var50 = 240;
								var15 = Tiles.Tiles_heights[var12][var9][var48] - var50;
								var16 = Tiles.Tiles_heights[var11][var9][var48];
								Scene.Scene_addOccluder(var5, 2, var9 * 128, var10 * 128 + 128, var48 * 128, var48 * 128, var15, var16);

								for (var17 = var11; var17 <= var12; ++var17) {
									for (var18 = var9; var18 <= var10; ++var18) {
										var10000 = VerticalAlignment.field1993[var17][var18];
										var10000[var48] &= ~var3;
									}
								}
							}
						}

						if ((VerticalAlignment.field1993[var47][var49][var48] & var4) != 0) {
							var9 = var49;
							var10 = var49;
							var11 = var48;

							for (var12 = var48; var11 > 0 && (VerticalAlignment.field1993[var47][var49][var11 - 1] & var4) != 0; --var11) {
							}

							while (var12 < 104 && (VerticalAlignment.field1993[var47][var49][var12 + 1] & var4) != 0) {
								++var12;
							}

							label528:
							while (var9 > 0) {
								for (var13 = var11; var13 <= var12; ++var13) {
									if ((VerticalAlignment.field1993[var47][var9 - 1][var13] & var4) == 0) {
										break label528;
									}
								}

								--var9;
							}

							label517:
							while (var10 < 104) {
								for (var13 = var11; var13 <= var12; ++var13) {
									if ((VerticalAlignment.field1993[var47][var10 + 1][var13] & var4) == 0) {
										break label517;
									}
								}

								++var10;
							}

							if ((var12 - var11 + 1) * (var10 - var9 + 1) >= 4) {
								var13 = Tiles.Tiles_heights[var47][var9][var11];
								Scene.Scene_addOccluder(var5, 4, var9 * 128, var10 * 128 + 128, var11 * 128, var12 * 128 + 128, var13, var13);

								for (var14 = var9; var14 <= var10; ++var14) {
									for (var15 = var11; var15 <= var12; ++var15) {
										var10000 = VerticalAlignment.field1993[var47][var14];
										var10000[var15] &= ~var4;
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
