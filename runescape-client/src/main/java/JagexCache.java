import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fp")
@Implements("JagexCache")
public class JagexCache {
	@ObfuscatedName("k")
	@Export("JagexCache_locationFile")
	static File JagexCache_locationFile;
	@ObfuscatedName("a")
	@Export("cacheDir")
	static File cacheDir;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lpz;"
	)
	@Export("JagexCache_randomDat")
	public static BufferedFile JagexCache_randomDat;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lpz;"
	)
	@Export("JagexCache_dat2File")
	public static BufferedFile JagexCache_dat2File;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lpz;"
	)
	@Export("JagexCache_idx255File")
	public static BufferedFile JagexCache_idx255File;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "[Lpz;"
	)
	@Export("JagexCache_idxFiles")
	public static BufferedFile[] JagexCache_idxFiles;
	@ObfuscatedName("d")
	@Export("operatingSystemName")
	static String operatingSystemName;

	static {
		JagexCache_randomDat = null;
		JagexCache_dat2File = null;
		JagexCache_idx255File = null;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lpx;Lpt;I)Lpt;",
		garbageValue = "-1071419975"
	)
	@Export("readStringIntParameters")
	static final IterableNodeHashTable readStringIntParameters(Buffer var0, IterableNodeHashTable var1) {
		int var2 = var0.readUnsignedByte();
		int var3;
		if (var1 == null) {
			var3 = FontName.method7228(var2);
			var1 = new IterableNodeHashTable(var3);
		}

		for (var3 = 0; var3 < var2; ++var3) {
			boolean var4 = var0.readUnsignedByte() == 1;
			int var5 = var0.readMedium();
			Object var6;
			if (var4) {
				var6 = new ObjectNode(var0.readStringCp1252NullTerminated());
			} else {
				var6 = new IntegerNode(var0.readInt());
			}

			var1.put((Node)var6, (long)var5);
		}

		return var1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Llp;Llp;B)V",
		garbageValue = "35"
	)
	public static void method3154(AbstractArchive var0, AbstractArchive var1) {
		class18.KitDefinition_archive = var0;
		class361.KitDefinition_modelsArchive = var1;
		class147.KitDefinition_fileCount = class18.KitDefinition_archive.getGroupFileCount(3);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ldz;FZB)F",
		garbageValue = "-1"
	)
	static float method3159(class117 var0, float var1, boolean var2) {
		float var3 = 0.0F;
		if (var0 != null && var0.method2695() != 0) {
			float var4 = (float)var0.field1476[0].field1430;
			float var5 = (float)var0.field1476[var0.method2695() - 1].field1430;
			float var6 = var5 - var4;
			if ((double)var6 == 0.0D) {
				return var0.field1476[0].field1428;
			} else {
				float var7 = 0.0F;
				if (var1 > var5) {
					var7 = (var1 - var5) / var6;
				} else {
					var7 = (var1 - var4) / var6;
				}

				double var8 = (double)((int)var7);
				float var10 = Math.abs((float)((double)var7 - var8));
				float var11 = var10 * var6;
				var8 = Math.abs(var8 + 1.0D);
				double var12 = var8 / 2.0D;
				double var14 = (double)((int)var12);
				var10 = (float)(var12 - var14);
				float var16;
				float var17;
				if (var2) {
					if (var0.field1472 == class116.field1468) {
						if ((double)var10 != 0.0D) {
							var11 += var4;
						} else {
							var11 = var5 - var11;
						}
					} else if (var0.field1472 != class116.field1464 && var0.field1472 != class116.field1466) {
						if (var0.field1472 == class116.field1465) {
							var11 = var4 - var1;
							var16 = var0.field1476[0].field1423;
							var17 = var0.field1476[0].field1424;
							var3 = var0.field1476[0].field1428;
							if (0.0D != (double)var16) {
								var3 -= var17 * var11 / var16;
							}

							return var3;
						}
					} else {
						var11 = var5 - var11;
					}
				} else if (var0.field1475 == class116.field1468) {
					if ((double)var10 != 0.0D) {
						var11 = var5 - var11;
					} else {
						var11 += var4;
					}
				} else if (var0.field1475 != class116.field1464 && var0.field1475 != class116.field1466) {
					if (var0.field1475 == class116.field1465) {
						var11 = var1 - var5;
						var16 = var0.field1476[var0.method2695() - 1].field1425;
						var17 = var0.field1476[var0.method2695() - 1].field1426;
						var3 = var0.field1476[var0.method2695() - 1].field1428;
						if (0.0D != (double)var16) {
							var3 += var17 * var11 / var16;
						}

						return var3;
					}
				} else {
					var11 += var4;
				}

				var3 = MusicPatchNode.method5315(var0, var11);
				float var18;
				if (var2 && var0.field1472 == class116.field1466) {
					var18 = var0.field1476[var0.method2695() - 1].field1428 - var0.field1476[0].field1428;
					var3 = (float)((double)var3 - var8 * (double)var18);
				} else if (!var2 && var0.field1475 == class116.field1466) {
					var18 = var0.field1476[var0.method2695() - 1].field1428 - var0.field1476[0].field1428;
					var3 = (float)((double)var3 + (double)var18 * var8);
				}

				return var3;
			}
		} else {
			return var3;
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Llp;Ljava/lang/String;Ljava/lang/String;B)Lqd;",
		garbageValue = "-119"
	)
	@Export("SpriteBuffer_getIndexedSpriteByName")
	public static IndexedSprite SpriteBuffer_getIndexedSpriteByName(AbstractArchive var0, String var1, String var2) {
		int var3 = var0.getGroupId(var1);
		int var4 = var0.getFileId(var3, var2);
		return ViewportMouse.method4372(var0, var3, var4);
	}

	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1667871503"
	)
	static final void method3155() {
		Scene.Scene_isLowDetail = false;
		Client.isLowDetail = false;
	}

	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "(Lca;III)V",
		garbageValue = "-1086335003"
	)
	@Export("performPlayerAnimation")
	static void performPlayerAnimation(Player var0, int var1, int var2) {
		if (var0.sequence == var1 && var1 != -1) {
			int var3 = class114.SequenceDefinition_get(var1).field2208;
			if (var3 == 1) {
				var0.sequenceFrame = 0;
				var0.sequenceFrameCycle = 0;
				var0.sequenceDelay = var2;
				var0.field1186 = 0;
			}

			if (var3 == 2) {
				var0.field1186 = 0;
			}
		} else if (var1 == -1 || var0.sequence == -1 || class114.SequenceDefinition_get(var1).field2220 >= class114.SequenceDefinition_get(var0.sequence).field2220) {
			var0.sequence = var1;
			var0.sequenceFrame = 0;
			var0.sequenceFrameCycle = 0;
			var0.sequenceDelay = var2;
			var0.field1186 = 0;
			var0.field1200 = var0.pathLength;
		}

	}

	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "(Lpc;I)V",
		garbageValue = "-1313288236"
	)
	static final void method3158(PacketBuffer var0) {
		for (int var1 = 0; var1 < Client.field565; ++var1) {
			int var2 = Client.field601[var1];
			NPC var3 = Client.npcs[var2];
			int var4 = var0.readUnsignedByte();
			int var5;
			if (class393.field4428 && (var4 & 8) != 0) {
				var5 = var0.readUnsignedByte();
				var4 += var5 << 8;
			}

			int var6;
			int var7;
			int var8;
			if ((var4 & 16) != 0) {
				var5 = var0.readUnsignedShort();
				var6 = var0.method7716();
				if (class393.field4428) {
					var3.field1173 = var0.method7546() == 1;
				}

				var7 = var3.x - (var5 - SecureRandomCallable.baseX * 64 - SecureRandomCallable.baseX * 64) * 64;
				var8 = var3.y - (var6 - GrandExchangeOfferOwnWorldComparator.baseY * 64 - GrandExchangeOfferOwnWorldComparator.baseY * 64) * 64;
				if (var7 != 0 || var8 != 0) {
					var3.field1172 = (int)(Math.atan2((double)var7, (double)var8) * 325.949D) & 2047;
				}
			}

			if ((var4 & 1024) != 0) {
				var3.field1210 = var0.method7568();
			}

			if ((var4 & 2) != 0) {
				var3.targetIndex = var0.method7554();
				if (var3.targetIndex == 65535) {
					var3.targetIndex = -1;
				}
			}

			if ((var4 & 32) != 0) {
				var5 = var0.method7716();
				if (var5 == 65535) {
					var5 = -1;
				}

				var6 = var0.readUnsignedByte();
				if (var5 == var3.sequence && var5 != -1) {
					var7 = class114.SequenceDefinition_get(var5).field2208;
					if (var7 == 1) {
						var3.sequenceFrame = 0;
						var3.sequenceFrameCycle = 0;
						var3.sequenceDelay = var6;
						var3.field1186 = 0;
					}

					if (var7 == 2) {
						var3.field1186 = 0;
					}
				} else if (var5 == -1 || var3.sequence == -1 || class114.SequenceDefinition_get(var5).field2220 >= class114.SequenceDefinition_get(var3.sequence).field2220) {
					var3.sequence = var5;
					var3.sequenceFrame = 0;
					var3.sequenceFrameCycle = 0;
					var3.sequenceDelay = var6;
					var3.field1186 = 0;
					var3.field1200 = var3.pathLength;
				}
			}

			if ((var4 & 512) != 0) {
				var3.field1196 = Client.cycle + var0.method7576();
				var3.field1197 = Client.cycle + var0.method7576();
				var3.field1143 = var0.readByte();
				var3.field1199 = var0.method7548();
				var3.field1153 = var0.method7548();
				var3.field1140 = (byte)var0.readUnsignedByte();
			}

			if (class393.field4428 && (var4 & 256) != 0 || !class393.field4428 && (var4 & 8) != 0) {
				var3.field1187 = var0.method7548();
				var3.field1189 = var0.method7549();
				var3.field1188 = var0.method7548();
				var3.field1190 = var0.method7547();
				var3.field1191 = var0.method7716() + Client.cycle;
				var3.field1192 = var0.method7716() + Client.cycle;
				var3.field1139 = var0.readUnsignedShort();
				var3.pathLength = 1;
				var3.field1200 = 0;
				var3.field1187 += var3.pathX[0];
				var3.field1189 += var3.pathY[0];
				var3.field1188 += var3.pathX[0];
				var3.field1190 += var3.pathY[0];
			}

			if ((var4 & 64) != 0) {
				var3.overheadText = var0.readStringCp1252NullTerminated();
				var3.overheadTextCyclesRemaining = 100;
			}

			if ((var4 & 1) != 0) {
				var3.spotAnimation = var0.method7576();
				var5 = var0.method7701();
				var3.field1151 = var5 >> 16;
				var3.field1185 = (var5 & 65535) + Client.cycle;
				var3.spotAnimationFrame = 0;
				var3.spotAnimationFrameCycle = 0;
				if (var3.field1185 > Client.cycle) {
					var3.spotAnimationFrame = -1;
				}

				if (var3.spotAnimation == 65535) {
					var3.spotAnimation = -1;
				}
			}

			if ((var4 & 4) != 0) {
				var5 = var0.readUnsignedByte();
				int var9;
				int var10;
				int var11;
				if (var5 > 0) {
					for (var6 = 0; var6 < var5; ++var6) {
						var8 = -1;
						var9 = -1;
						var10 = -1;
						var7 = var0.readUShortSmart();
						if (var7 == 32767) {
							var7 = var0.readUShortSmart();
							var9 = var0.readUShortSmart();
							var8 = var0.readUShortSmart();
							var10 = var0.readUShortSmart();
						} else if (var7 != 32766) {
							var9 = var0.readUShortSmart();
						} else {
							var7 = -1;
						}

						var11 = var0.readUShortSmart();
						var3.addHitSplat(var7, var9, var8, var10, Client.cycle, var11);
					}
				}

				var6 = var0.method7546();
				if (var6 > 0) {
					for (var7 = 0; var7 < var6; ++var7) {
						var8 = var0.readUShortSmart();
						var9 = var0.readUShortSmart();
						if (var9 != 32767) {
							var10 = var0.readUShortSmart();
							var11 = var0.readUnsignedByte();
							int var12 = var9 > 0 ? var0.method7546() : var11;
							var3.addHealthBar(var8, Client.cycle, var9, var10, var11, var12);
						} else {
							var3.removeHealthBar(var8);
						}
					}
				}
			}

			if ((var4 & 2048) != 0) {
				var3.method2338(var0.readStringCp1252NullTerminated());
			}

			if ((var4 & 128) != 0) {
				var3.definition = WorldMapSectionType.getNpcDefinition(var0.method7554());
				var3.field1167 = var3.definition.size;
				var3.field1204 = var3.definition.rotation;
				var3.walkSequence = var3.definition.walkSequence;
				var3.walkBackSequence = var3.definition.walkBackSequence;
				var3.walkLeftSequence = var3.definition.walkLeftSequence;
				var3.walkRightSequence = var3.definition.walkRightSequence;
				var3.idleSequence = var3.definition.idleSequence;
				var3.turnLeftSequence = var3.definition.turnLeftSequence;
				var3.turnRightSequence = var3.definition.turnRightSequence;
			}
		}

	}

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-1222597684"
	)
	@Export("drawScrollBar")
	static final void drawScrollBar(int var0, int var1, int var2, int var3, int var4) {
		class127.scrollBarSprites[0].drawAt(var0, var1);
		class127.scrollBarSprites[1].drawAt(var0, var3 + var1 - 16);
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1 + 16, 16, var3 - 32, Client.field555);
		int var5 = var3 * (var3 - 32) / var4;
		if (var5 < 8) {
			var5 = 8;
		}

		int var6 = (var3 - 32 - var5) * var2 / (var4 - var3);
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var6 + var1 + 16, 16, var5, Client.field556);
		Rasterizer2D.method7840(var0, var6 + var1 + 16, var5, Client.field483);
		Rasterizer2D.method7840(var0 + 1, var6 + var1 + 16, var5, Client.field483);
		Rasterizer2D.method7838(var0, var6 + var1 + 16, 16, Client.field483);
		Rasterizer2D.method7838(var0, var6 + var1 + 17, 16, Client.field483);
		Rasterizer2D.method7840(var0 + 15, var6 + var1 + 16, var5, Client.field640);
		Rasterizer2D.method7840(var0 + 14, var6 + var1 + 17, var5 - 1, Client.field640);
		Rasterizer2D.method7838(var0, var5 + var6 + var1 + 15, 16, Client.field640);
		Rasterizer2D.method7838(var0 + 1, var6 + var5 + var1 + 14, 15, Client.field640);
	}
}
