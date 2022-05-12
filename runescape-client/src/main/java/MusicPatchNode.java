import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ji")
@Implements("MusicPatchNode")
public class MusicPatchNode extends Node {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1633027795
	)
	int field3308;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	@Export("patch")
	MusicPatch patch;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lak;"
	)
	@Export("rawSound")
	RawSound rawSound;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	MusicPatchNode2 field3306;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1595060947
	)
	int field3319;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1588715753
	)
	int field3307;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 694428029
	)
	int field3311;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1945733599
	)
	int field3312;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1493240557
	)
	int field3310;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1183801873
	)
	int field3309;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1743024279
	)
	int field3302;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 130760704
	)
	int field3313;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 883462029
	)
	int field3314;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 33079002
	)
	int field3315;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1027674077
	)
	int field3316;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1108202467
	)
	int field3317;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 2110000655
	)
	int field3318;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 121475961
	)
	int field3304;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lah;"
	)
	@Export("stream")
	RawPcmStream stream;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -2111788587
	)
	int field3321;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 378248553
	)
	int field3322;

	MusicPatchNode() {
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-115"
	)
	void method5316() {
		this.patch = null;
		this.rawSound = null;
		this.field3306 = null;
		this.stream = null;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ldz;FB)F",
		garbageValue = "-47"
	)
	static float method5315(class117 var0, float var1) {
		if (var0 != null && var0.method2695() != 0) {
			if (var1 < (float)var0.field1476[0].field1430) {
				return var0.field1472 == class116.field1470 ? var0.field1476[0].field1428 : JagexCache.method3159(var0, var1, true);
			} else if (var1 > (float)var0.field1476[var0.method2695() - 1].field1430) {
				return var0.field1475 == class116.field1470 ? var0.field1476[var0.method2695() - 1].field1428 : JagexCache.method3159(var0, var1, false);
			} else if (var0.field1487) {
				return var0.field1476[0].field1428;
			} else {
				class113 var2 = var0.method2707(var1);
				boolean var3 = false;
				boolean var4 = false;
				if (var2 == null) {
					return 0.0F;
				} else {
					float var7;
					if ((double)var2.field1425 == 0.0D && 0.0D == (double)var2.field1426) {
						var3 = true;
					} else if (var2.field1425 == Float.MAX_VALUE && Float.MAX_VALUE == var2.field1426) {
						var4 = true;
					} else if (var2.field1427 != null) {
						if (var0.field1482) {
							float[] var5 = new float[4];
							float[] var6 = new float[4];
							var5[0] = (float)var2.field1430;
							var6[0] = var2.field1428;
							var5[1] = var2.field1425 * 0.33333334F + var5[0];
							var6[1] = var6[0] + 0.33333334F * var2.field1426;
							var5[3] = (float)var2.field1427.field1430;
							var6[3] = var2.field1427.field1428;
							var5[2] = var5[3] - var2.field1427.field1423 * 0.33333334F;
							var6[2] = var6[3] - var2.field1427.field1424 * 0.33333334F;
							if (var0.field1477) {
								if (var0 != null) {
									var7 = var5[3] - var5[0];
									if ((double)var7 != 0.0D) {
										float var8 = var5[1] - var5[0];
										float var9 = var5[2] - var5[0];
										Float var10 = var8 / var7;
										Float var11 = var9 / var7;
										var0.field1480 = var10 == 0.33333334F && var11 == 0.6666667F;
										float var12 = var10;
										float var13 = var11;
										if ((double)var10 < 0.0D) {
											var10 = 0.0F;
										}

										if ((double)var11 > 1.0D) {
											var11 = 1.0F;
										}

										if ((double)var10 > 1.0D || var11 < -1.0F) {
											Float var14 = var10;
											Float var15 = 1.0F - var11;
											if (var10 < 0.0F) {
												var14 = 0.0F;
											}

											if (var15 < 0.0F) {
												var15 = 0.0F;
											}

											if (var14 > 1.0F || var15 > 1.0F) {
												float var16 = (float)((double)(var14 * (var14 - 2.0F + var15)) + (double)var15 * ((double)var15 - 2.0D) + 1.0D);
												if (var16 + class114.field1435 > 0.0F) {
													Float var18;
													if (var14 + class114.field1435 < 1.3333334F) {
														float var19 = var14 - 2.0F;
														float var20 = var14 - 1.0F;
														float var21 = (float)Math.sqrt((double)(var19 * var19 - 4.0F * var20 * var20));
														float var22 = 0.5F * (var21 + -var19);
														if (var15 + class114.field1435 > var22) {
															var18 = var22 - class114.field1435;
														} else {
															var22 = 0.5F * (-var19 - var21);
															if (var15 < var22 + class114.field1435) {
																var18 = var22 + class114.field1435;
															}
														}
													} else {
														Float var17 = 1.3333334F - class114.field1435;
														var18 = 0.33333334F - class114.field1435;
													}
												}
											}

											var15 = 1.0F - var15;
										}

										if (var10 != var12) {
											var5[1] = var5[0] + var10 * var7;
											if (0.0D != (double)var12) {
												var6[1] = var6[0] + (var6[1] - var6[0]) * var10 / var12;
											}
										}

										if (var11 != var13) {
											var5[2] = var5[0] + var11 * var7;
											if ((double)var13 != 1.0D) {
												var6[2] = (float)((double)var6[3] - (double)(var6[3] - var6[2]) * (1.0D - (double)var11) / (1.0D - (double)var13));
											}
										}

										var0.field1478 = var5[0];
										var0.field1479 = var5[3];
										class341.method6090(0.0F, var10, var11, 1.0F, var0.field1473);
										class341.method6090(var6[0], var6[1], var6[2], var6[3], var0.field1481);
									}
								}
							} else {
								class113.method2623(var0, var5, var6);
							}

							var0.field1482 = false;
						}
					} else {
						var3 = true;
					}

					if (var3) {
						return var2.field1428;
					} else if (var4) {
						return (float)var2.field1430 != var1 && var2.field1427 != null ? var2.field1427.field1428 : var2.field1428;
					} else {
						float var23;
						float var24;
						if (var0.field1477) {
							if (var0 == null) {
								var24 = 0.0F;
							} else {
								if (var1 == var0.field1478) {
									var23 = 0.0F;
								} else if (var0.field1479 == var1) {
									var23 = 1.0F;
								} else {
									var23 = (var1 - var0.field1478) / (var0.field1479 - var0.field1478);
								}

								if (var0.field1480) {
									var7 = var23;
								} else {
									float[] var25 = new float[]{var0.field1473[0] - var23, var0.field1473[1], var0.field1473[2], var0.field1473[3]};
									float[] var26 = new float[5];
									int var27 = GrandExchangeOfferAgeComparator.method5798(var25, 3, 0.0F, true, 1.0F, true, var26);
									if (var27 == 1) {
										var7 = var26[0];
									} else {
										var7 = 0.0F;
									}
								}

								var24 = var0.field1481[0] + var7 * (var0.field1481[1] + (var7 * var0.field1481[3] + var0.field1481[2]) * var7);
							}

							return var24;
						} else {
							if (var0 == null) {
								var24 = 0.0F;
							} else {
								var23 = var1 - var0.field1478;
								var24 = (var0.field1473[2] + var23 * (var0.field1473[0] * var23 + var0.field1473[1])) * var23 + var0.field1473[3];
							}

							return var24;
						}
					}
				}
			}
		} else {
			return 0.0F;
		}
	}
}
