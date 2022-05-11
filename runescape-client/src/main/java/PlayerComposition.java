import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kp")
@Implements("PlayerComposition")
public class PlayerComposition {
	@ObfuscatedName("c")
	public static short[][] field3366;
	@ObfuscatedName("w")
	@Export("equipmentIndices")
	static final int[] equipmentIndices;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("PlayerComposition_cachedModels")
	public static EvictingDualNodeHashTable PlayerComposition_cachedModels;
	@ObfuscatedName("o")
	@Export("equipment")
	int[] equipment;
	@ObfuscatedName("q")
	@Export("bodyColors")
	int[] bodyColors;
	@ObfuscatedName("l")
	@Export("isFemale")
	public boolean isFemale;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 92752325
	)
	@Export("npcTransformId")
	public int npcTransformId;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		longValue = -7782152714703146163L
	)
	@Export("hash")
	long hash;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		longValue = -9099438919226183133L
	)
	long field3368;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "[Lfn;"
	)
	class168[] field3364;
	@ObfuscatedName("s")
	boolean field3365;

	static {
		equipmentIndices = new int[]{8, 11, 4, 6, 9, 7, 10};
		PlayerComposition_cachedModels = new EvictingDualNodeHashTable(260);
	}

	public PlayerComposition() {
		this.field3365 = false;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "([I[Lfn;Z[IZII)V",
		garbageValue = "2036477706"
	)
	public void method5395(int[] var1, class168[] var2, boolean var3, int[] var4, boolean var5, int var6) {
		this.field3364 = var2;
		this.field3365 = var3;
		this.update(var1, var4, var5, var6);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "([I[IZII)V",
		garbageValue = "-1891855467"
	)
	@Export("update")
	public void update(int[] var1, int[] var2, boolean var3, int var4) {
		if (var1 == null) {
			var1 = new int[12];

			for (int var5 = 0; var5 < 7; ++var5) {
				for (int var6 = 0; var6 < class147.KitDefinition_fileCount; ++var6) {
					KitDefinition var7 = Script.KitDefinition_get(var6);
					if (var7 != null && !var7.nonSelectable && var7.bodypartID == var5 + (var3 ? 7 : 0)) {
						var1[equipmentIndices[var5]] = var6 + 256;
						break;
					}
				}
			}
		}

		this.equipment = var1;
		this.bodyColors = var2;
		this.isFemale = var3;
		this.npcTransformId = var4;
		this.setHash();
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "983810736"
	)
	@Export("changeAppearance")
	public void changeAppearance(int var1, boolean var2) {
		if (var1 != 1 || !this.isFemale) {
			int var3 = this.equipment[equipmentIndices[var1]];
			if (var3 != 0) {
				var3 -= 256;

				KitDefinition var4;
				do {
					if (!var2) {
						--var3;
						if (var3 < 0) {
							var3 = class147.KitDefinition_fileCount - 1;
						}
					} else {
						++var3;
						if (var3 >= class147.KitDefinition_fileCount) {
							var3 = 0;
						}
					}

					var4 = Script.KitDefinition_get(var3);
				} while(var4 == null || var4.nonSelectable || (this.isFemale ? 7 : 0) + var1 != var4.bodypartID);

				this.equipment[equipmentIndices[var1]] = var3 + 256;
				this.setHash();
			}
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-2104748199"
	)
	public void method5394(int var1, boolean var2) {
		int var3 = this.bodyColors[var1];
		boolean var4;
		if (!var2) {
			do {
				--var3;
				if (var3 < 0) {
					var3 = DesktopPlatformInfoProvider.field4469[var1].length - 1;
				}

				if (var1 == 4 && var3 >= 8) {
					var4 = false;
				} else {
					var4 = true;
				}
			} while(!var4);
		} else {
			do {
				++var3;
				if (var3 >= DesktopPlatformInfoProvider.field4469[var1].length) {
					var3 = 0;
				}

				if (var1 == 4 && var3 >= 8) {
					var4 = false;
				} else {
					var4 = true;
				}
			} while(!var4);
		}

		this.bodyColors[var1] = var3;
		this.setHash();
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "108"
	)
	@Export("changeSex")
	public void changeSex(boolean var1) {
		if (this.isFemale != var1) {
			this.update((int[])null, this.bodyColors, var1, -1);
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)V",
		garbageValue = "1160486905"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(this.isFemale ? 1 : 0);

		int var2;
		for (var2 = 0; var2 < 7; ++var2) {
			int var3 = this.equipment[equipmentIndices[var2]];
			if (var3 == 0) {
				var1.writeByte(-1);
			} else {
				var1.writeByte(var3 - 256);
			}
		}

		for (var2 = 0; var2 < 5; ++var2) {
			var1.writeByte(this.bodyColors[var2]);
		}

	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "28"
	)
	@Export("setHash")
	void setHash() {
		long var1 = this.hash;
		int var3 = this.equipment[5];
		int var4 = this.equipment[9];
		this.equipment[5] = var4;
		this.equipment[9] = var3;
		this.hash = 0L;

		int var5;
		for (var5 = 0; var5 < 12; ++var5) {
			this.hash <<= 4;
			if (this.equipment[var5] >= 256) {
				this.hash += (long)(this.equipment[var5] - 256);
			}
		}

		if (this.equipment[0] >= 256) {
			this.hash += (long)(this.equipment[0] - 256 >> 4);
		}

		if (this.equipment[1] >= 256) {
			this.hash += (long)(this.equipment[1] - 256 >> 8);
		}

		for (var5 = 0; var5 < 5; ++var5) {
			this.hash <<= 3;
			this.hash += (long)this.bodyColors[var5];
		}

		this.hash <<= 1;
		this.hash += (long)(this.isFemale ? 1 : 0);
		this.equipment[5] = var3;
		this.equipment[9] = var4;
		if (var1 != 0L && var1 != this.hash || this.field3365) {
			PlayerComposition_cachedModels.remove(var1);
		}

	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lgq;ILgq;IB)Lhv;",
		garbageValue = "-45"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
		if (this.npcTransformId != -1) {
			return WorldMapSectionType.getNpcDefinition(this.npcTransformId).getModel(var1, var2, var3, var4);
		} else {
			long var5 = this.hash;
			int[] var7 = this.equipment;
			if (var1 != null && (var1.shield >= 0 || var1.weapon >= 0)) {
				var7 = new int[12];

				for (int var8 = 0; var8 < 12; ++var8) {
					var7[var8] = this.equipment[var8];
				}

				if (var1.shield >= 0) {
					var5 += (long)(var1.shield - this.equipment[5] << 40);
					var7[5] = var1.shield;
				}

				if (var1.weapon >= 0) {
					var5 += (long)(var1.weapon - this.equipment[3] << 48);
					var7[3] = var1.weapon;
				}
			}

			Model var18 = (Model)PlayerComposition_cachedModels.get(var5);
			if (var18 == null) {
				boolean var9 = false;

				int var11;
				for (int var10 = 0; var10 < 12; ++var10) {
					var11 = var7[var10];
					if (var11 >= 256 && var11 < 512 && !Script.KitDefinition_get(var11 - 256).ready()) {
						var9 = true;
					}

					if (var11 >= 512 && !FileSystem.ItemDefinition_get(var11 - 512).hasNoValidModel(this.isFemale)) {
						var9 = true;
					}
				}

				if (var9) {
					if (this.field3368 != -1L) {
						var18 = (Model)PlayerComposition_cachedModels.get(this.field3368);
					}

					if (var18 == null) {
						return null;
					}
				}

				if (var18 == null) {
					ModelData[] var19 = new ModelData[12];
					var11 = 0;

					int var13;
					for (int var12 = 0; var12 < 12; ++var12) {
						var13 = var7[var12];
						if (var13 >= 256 && var13 < 512) {
							ModelData var14 = Script.KitDefinition_get(var13 - 256).getModelData();
							if (var14 != null) {
								var19[var11++] = var14;
							}
						}

						if (var13 >= 512) {
							ItemComposition var22 = FileSystem.ItemDefinition_get(var13 - 512);
							ModelData var15 = var22.method3630(this.isFemale);
							if (var15 != null) {
								if (this.field3364 != null) {
									class168 var16 = this.field3364[var12];
									if (var16 != null) {
										int var17;
										if (var16.field1847 != null && var22.recolorFrom != null && var22.recolorTo.length == var16.field1847.length) {
											for (var17 = 0; var17 < var22.recolorFrom.length; ++var17) {
												var15.recolor(var22.recolorTo[var17], var16.field1847[var17]);
											}
										}

										if (var16.field1844 != null && var22.retextureFrom != null && var16.field1844.length == var22.retextureTo.length) {
											for (var17 = 0; var17 < var22.retextureFrom.length; ++var17) {
												var15.retexture(var22.retextureTo[var17], var16.field1844[var17]);
											}
										}
									}
								}

								var19[var11++] = var15;
							}
						}
					}

					ModelData var20 = new ModelData(var19, var11);

					for (var13 = 0; var13 < 5; ++var13) {
						if (this.bodyColors[var13] < DesktopPlatformInfoProvider.field4469[var13].length) {
							var20.recolor(Coord.field3352[var13], DesktopPlatformInfoProvider.field4469[var13][this.bodyColors[var13]]);
						}

						if (this.bodyColors[var13] < field3366[var13].length) {
							var20.recolor(class340.field4156[var13], field3366[var13][this.bodyColors[var13]]);
						}
					}

					var18 = var20.toModel(64, 850, -30, -50, -30);
					PlayerComposition_cachedModels.put(var18, var5);
					this.field3368 = var5;
				}
			}

			if (var1 == null && var3 == null) {
				return var18;
			} else {
				Model var21;
				if (var1 != null && var3 != null) {
					var21 = var1.applyTransformations(var18, var2, var3, var4);
				} else if (var1 != null) {
					var21 = var1.transformActorModel(var18, var2);
				} else {
					var21 = var3.transformActorModel(var18, var4);
				}

				return var21;
			}
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(B)Lgs;",
		garbageValue = "-25"
	)
	@Export("getModelData")
	ModelData getModelData() {
		if (this.npcTransformId != -1) {
			return WorldMapSectionType.getNpcDefinition(this.npcTransformId).getModelData();
		} else {
			boolean var1 = false;

			int var3;
			for (int var2 = 0; var2 < 12; ++var2) {
				var3 = this.equipment[var2];
				if (var3 >= 256 && var3 < 512 && !Script.KitDefinition_get(var3 - 256).method3335()) {
					var1 = true;
				}

				if (var3 >= 512 && !FileSystem.ItemDefinition_get(var3 - 512).method3631(this.isFemale)) {
					var1 = true;
				}
			}

			if (var1) {
				return null;
			} else {
				ModelData[] var7 = new ModelData[12];
				var3 = 0;

				int var5;
				for (int var4 = 0; var4 < 12; ++var4) {
					var5 = this.equipment[var4];
					ModelData var6;
					if (var5 >= 256 && var5 < 512) {
						var6 = Script.KitDefinition_get(var5 - 256).getKitDefinitionModels();
						if (var6 != null) {
							var7[var3++] = var6;
						}
					}

					if (var5 >= 512) {
						var6 = FileSystem.ItemDefinition_get(var5 - 512).method3632(this.isFemale);
						if (var6 != null) {
							var7[var3++] = var6;
						}
					}
				}

				ModelData var8 = new ModelData(var7, var3);

				for (var5 = 0; var5 < 5; ++var5) {
					if (this.bodyColors[var5] < DesktopPlatformInfoProvider.field4469[var5].length) {
						var8.recolor(Coord.field3352[var5], DesktopPlatformInfoProvider.field4469[var5][this.bodyColors[var5]]);
					}

					if (this.bodyColors[var5] < field3366[var5].length) {
						var8.recolor(class340.field4156[var5], field3366[var5][this.bodyColors[var5]]);
					}
				}

				return var8;
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "695614719"
	)
	@Export("getChatHeadId")
	public int getChatHeadId() {
		return this.npcTransformId == -1 ? (this.equipment[0] << 15) + this.equipment[1] + (this.equipment[11] << 5) + (this.equipment[8] << 10) + (this.bodyColors[0] << 25) + (this.bodyColors[4] << 20) : 305419896 + WorldMapSectionType.getNpcDefinition(this.npcTransformId).id;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-10"
	)
	static final void method5408(int var0, int var1, int var2, int var3) {
		for (int var4 = var1; var4 <= var3 + var1; ++var4) {
			for (int var5 = var0; var5 <= var0 + var2; ++var5) {
				if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
					NPC.field1259[0][var5][var4] = 127;
					if (var0 == var5 && var5 > 0) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 - 1][var4];
					}

					if (var5 == var0 + var2 && var5 < 103) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 + 1][var4];
					}

					if (var4 == var1 && var4 > 0) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 - 1];
					}

					if (var3 + var1 == var4 && var4 < 103) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 + 1];
					}
				}
			}
		}

	}
}
