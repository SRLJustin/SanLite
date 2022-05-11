import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@lx
@js
@ObfuscatedName("lq")
@Implements("Language")
public class Language implements MouseWheel {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("Language_EN")
	public static final Language Language_EN;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("Language_DE")
	static final Language Language_DE;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("Language_FR")
	public static final Language Language_FR;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("Language_PT")
	static final Language Language_PT;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("Language_NL")
	static final Language Language_NL;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("Language_ES")
	public static final Language Language_ES;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("Language_ES_MX")
	static final Language Language_ES_MX;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "[Llq;"
	)
	@Export("Language_valuesOrdered")
	public static final Language[] Language_valuesOrdered;
	@ObfuscatedName("s")
	final String field4120;
	@ObfuscatedName("r")
	@Export("language")
	final String language;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1541903629
	)
	@Export("id")
	final int id;

	static {
		Language_EN = new Language("EN", "en", "English", ModeWhere.field4125, 0, "GB");
		Language_DE = new Language("DE", "de", "German", ModeWhere.field4125, 1, "DE");
		Language_FR = new Language("FR", "fr", "French", ModeWhere.field4125, 2, "FR");
		Language_PT = new Language("PT", "pt", "Portuguese", ModeWhere.field4125, 3, "BR");
		Language_NL = new Language("NL", "nl", "Dutch", ModeWhere.field4130, 4, "NL");
		Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field4130, 5, "ES");
		Language_ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field4125, 6, "MX");
		Language[] var0 = new Language[]{Language_FR, Language_NL, Language_DE, Language_ES, Language_ES_MX, Language_EN, Language_PT};
		Language_valuesOrdered = new Language[var0.length];
		Language[] var2 = var0;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			Language var4 = var2[var3];
			if (Language_valuesOrdered[var4.id] != null) {
				throw new IllegalStateException();
			}

			Language_valuesOrdered[var4.id] = var4;
		}

	}

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llz;ILjava/lang/String;)V"
	)
	Language(String var1, String var2, String var3, ModeWhere var4, int var5, String var6) {
		this.field4120 = var1;
		this.language = var2;
		this.id = var5;
		if (var6 != null) {
			new Locale(var2.substring(0, 2), var6);
		} else {
			new Locale(var2.substring(0, 2));
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "30"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-75"
	)
	@Export("getLanguage")
	String getLanguage() {
		return this.language;
	}

	public String toString() {
		return this.getLanguage().toLowerCase(Locale.ENGLISH);
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(CI)C",
		garbageValue = "-380169429"
	)
	static char method5877(char var0) {
		switch(var0) {
		case ' ':
		case '-':
		case '_':
		case ' ':
			return '_';
		case '#':
		case '[':
		case ']':
			return var0;
		case 'À':
		case 'Á':
		case 'Â':
		case 'Ã':
		case 'Ä':
		case 'à':
		case 'á':
		case 'â':
		case 'ã':
		case 'ä':
			return 'a';
		case 'Ç':
		case 'ç':
			return 'c';
		case 'È':
		case 'É':
		case 'Ê':
		case 'Ë':
		case 'è':
		case 'é':
		case 'ê':
		case 'ë':
			return 'e';
		case 'Í':
		case 'Î':
		case 'Ï':
		case 'í':
		case 'î':
		case 'ï':
			return 'i';
		case 'Ñ':
		case 'ñ':
			return 'n';
		case 'Ò':
		case 'Ó':
		case 'Ô':
		case 'Õ':
		case 'Ö':
		case 'ò':
		case 'ó':
		case 'ô':
		case 'õ':
		case 'ö':
			return 'o';
		case 'Ù':
		case 'Ú':
		case 'Û':
		case 'Ü':
		case 'ù':
		case 'ú':
		case 'û':
		case 'ü':
			return 'u';
		case 'ß':
			return 'b';
		case 'ÿ':
		case 'Ÿ':
			return 'y';
		default:
			return Character.toLowerCase(var0);
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lmx;Lmx;I)V",
		garbageValue = "412458899"
	)
	static void method5885(Font var0, Font var1) {
		if (GameEngine.worldSelectBackSprites == null) {
			GameEngine.worldSelectBackSprites = Frames.method4218(class305.archive8, "sl_back", "");
		}

		IndexedSprite[] var2;
		Archive var3;
		int var4;
		int var5;
		if (class260.worldSelectFlagSprites == null) {
			var3 = class305.archive8;
			var4 = var3.getGroupId("sl_flags");
			var5 = var3.getFileId(var4, "");
			var2 = ItemContainer.method2062(var3, var4, var5);
			class260.worldSelectFlagSprites = var2;
		}

		if (class114.worldSelectArrows == null) {
			var3 = class305.archive8;
			var4 = var3.getGroupId("sl_arrows");
			var5 = var3.getFileId(var4, "");
			var2 = ItemContainer.method2062(var3, var4, var5);
			class114.worldSelectArrows = var2;
		}

		if (class267.worldSelectStars == null) {
			var3 = class305.archive8;
			var4 = var3.getGroupId("sl_stars");
			var5 = var3.getFileId(var4, "");
			var2 = ItemContainer.method2062(var3, var4, var5);
			class267.worldSelectStars = var2;
		}

		if (class126.worldSelectLeftSprite == null) {
			class126.worldSelectLeftSprite = JagexCache.SpriteBuffer_getIndexedSpriteByName(class305.archive8, "leftarrow", "");
		}

		if (class424.worldSelectRightSprite == null) {
			class424.worldSelectRightSprite = JagexCache.SpriteBuffer_getIndexedSpriteByName(class305.archive8, "rightarrow", "");
		}

		Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0);
		Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624);
		Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513);
		var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1);
		if (class267.worldSelectStars != null) {
			class267.worldSelectStars[1].drawAt(Login.xPadding + 140, 1);
			var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1);
			class267.worldSelectStars[0].drawAt(Login.xPadding + 140, 12);
			var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1);
		}

		if (class114.worldSelectArrows != null) {
			int var22 = Login.xPadding + 280;
			if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) {
				class114.worldSelectArrows[2].drawAt(var22, 4);
			} else {
				class114.worldSelectArrows[0].drawAt(var22, 4);
			}

			if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) {
				class114.worldSelectArrows[3].drawAt(var22 + 15, 4);
			} else {
				class114.worldSelectArrows[1].drawAt(var22 + 15, 4);
			}

			var0.draw("World", var22 + 32, 17, 16777215, -1);
			int var23 = Login.xPadding + 390;
			if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) {
				class114.worldSelectArrows[2].drawAt(var23, 4);
			} else {
				class114.worldSelectArrows[0].drawAt(var23, 4);
			}

			if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) {
				class114.worldSelectArrows[3].drawAt(var23 + 15, 4);
			} else {
				class114.worldSelectArrows[1].drawAt(var23 + 15, 4);
			}

			var0.draw("Players", var23 + 32, 17, 16777215, -1);
			var4 = Login.xPadding + 500;
			if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) {
				class114.worldSelectArrows[2].drawAt(var4, 4);
			} else {
				class114.worldSelectArrows[0].drawAt(var4, 4);
			}

			if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) {
				class114.worldSelectArrows[3].drawAt(var4 + 15, 4);
			} else {
				class114.worldSelectArrows[1].drawAt(var4 + 15, 4);
			}

			var0.draw("Location", var4 + 32, 17, 16777215, -1);
			var5 = Login.xPadding + 610;
			if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) {
				class114.worldSelectArrows[2].drawAt(var5, 4);
			} else {
				class114.worldSelectArrows[0].drawAt(var5, 4);
			}

			if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) {
				class114.worldSelectArrows[3].drawAt(var5 + 15, 4);
			} else {
				class114.worldSelectArrows[1].drawAt(var5 + 15, 4);
			}

			var0.draw("Type", var5 + 32, 17, 16777215, -1);
		}

		Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0);
		var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1);
		Login.hoveredWorldIndex = -1;
		if (GameEngine.worldSelectBackSprites != null) {
			byte var26 = 88;
			byte var27 = 19;
			var4 = 765 / (var26 + 1) - 1;
			var5 = 480 / (var27 + 1);

			int var6;
			int var7;
			do {
				var6 = var5;
				var7 = var4;
				if (var5 * (var4 - 1) >= World.World_count) {
					--var4;
				}

				if (var4 * (var5 - 1) >= World.World_count) {
					--var5;
				}

				if (var4 * (var5 - 1) >= World.World_count) {
					--var5;
				}
			} while(var5 != var6 || var4 != var7);

			var6 = (765 - var26 * var4) / (var4 + 1);
			if (var6 > 5) {
				var6 = 5;
			}

			var7 = (480 - var5 * var27) / (var5 + 1);
			if (var7 > 5) {
				var7 = 5;
			}

			int var8 = (765 - var4 * var26 - var6 * (var4 - 1)) / 2;
			int var9 = (480 - var5 * var27 - var7 * (var5 - 1)) / 2;
			int var10 = (var5 + World.World_count - 1) / var5;
			Login.worldSelectPagesCount = var10 - var4;
			if (class126.worldSelectLeftSprite != null && Login.worldSelectPage > 0) {
				class126.worldSelectLeftSprite.drawAt(8, class433.canvasHeight / 2 - class126.worldSelectLeftSprite.subHeight / 2);
			}

			if (class424.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) {
				class424.worldSelectRightSprite.drawAt(GraphicsObject.canvasWidth - class424.worldSelectRightSprite.subWidth - 8, class433.canvasHeight / 2 - class424.worldSelectRightSprite.subHeight / 2);
			}

			int var11 = var9 + 23;
			int var12 = var8 + Login.xPadding;
			int var13 = 0;
			boolean var14 = false;
			int var15 = Login.worldSelectPage;

			int var16;
			for (var16 = var5 * var15; var16 < World.World_count && var15 - Login.worldSelectPage < var4; ++var16) {
				World var17 = World.World_worlds[var16];
				boolean var18 = true;
				String var19 = Integer.toString(var17.population);
				if (var17.population == -1) {
					var19 = "OFF";
					var18 = false;
				} else if (var17.population > 1980) {
					var19 = "FULL";
					var18 = false;
				}

				int var21 = 0;
				byte var20;
				if (var17.isBeta()) {
					if (var17.isMembersOnly()) {
						var20 = 7;
					} else {
						var20 = 6;
					}
				} else if (var17.isDeadman()) {
					var21 = 16711680;
					if (var17.isMembersOnly()) {
						var20 = 5;
					} else {
						var20 = 4;
					}
				} else if (var17.method1619()) {
					if (var17.isMembersOnly()) {
						var20 = 9;
					} else {
						var20 = 8;
					}
				} else if (var17.isPvp()) {
					if (var17.isMembersOnly()) {
						var20 = 3;
					} else {
						var20 = 2;
					}
				} else if (var17.isMembersOnly()) {
					var20 = 1;
				} else {
					var20 = 0;
				}

				if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var11 && MouseHandler.MouseHandler_x < var26 + var12 && MouseHandler.MouseHandler_y < var11 + var27 && var18) {
					Login.hoveredWorldIndex = var16;
					GameEngine.worldSelectBackSprites[var20].drawTransOverlayAt(var12, var11, 128, 16777215);
					var14 = true;
				} else {
					GameEngine.worldSelectBackSprites[var20].drawAt(var12, var11);
				}

				if (class260.worldSelectFlagSprites != null) {
					class260.worldSelectFlagSprites[(var17.isMembersOnly() ? 8 : 0) + var17.location].drawAt(var12 + 29, var11);
				}

				var0.drawCentered(Integer.toString(var17.id), var12 + 15, var27 / 2 + var11 + 5, var21, -1);
				var1.drawCentered(var19, var12 + 60, var27 / 2 + var11 + 5, 268435455, -1);
				var11 = var11 + var7 + var27;
				++var13;
				if (var13 >= var5) {
					var11 = var9 + 23;
					var12 = var12 + var6 + var26;
					var13 = 0;
					++var15;
				}
			}

			if (var14) {
				var16 = var1.stringWidth(World.World_worlds[Login.hoveredWorldIndex].activity) + 6;
				int var24 = var1.ascent + 8;
				int var25 = MouseHandler.MouseHandler_y + 25;
				if (var25 + var24 > 480) {
					var25 = MouseHandler.MouseHandler_y - 25 - var24;
				}

				Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var16 / 2, var25, var16, var24, 16777120);
				Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var16 / 2, var25, var16, var24, 0);
				var1.drawCentered(World.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var25 + var1.ascent + 4, 0, -1);
			}
		}

		DevicePcmPlayerProvider.rasterProvider.drawFull(0, 0);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILbb;ZB)I",
		garbageValue = "-27"
	)
	static int method5884(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_LISTENED) {
			if (class358.guestClanSettings != null) {
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 1;
				FontName.field4583 = class358.guestClanSettings;
			} else {
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_AFFINED) {
				var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
				if (Client.currentClanSettings[var3] != null) {
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 1;
					FontName.field4583 = Client.currentClanSettings[var3];
				} else {
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCLANNAME) {
				Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = FontName.field4583.name;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETALLOWUNAFFINED) {
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = FontName.field4583.allowGuests ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKTALK) {
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = FontName.field4583.field1633;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKKICK) {
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = FontName.field4583.field1641;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKLOOTSHARE) {
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = FontName.field4583.field1642;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCOINSHARE) {
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = FontName.field4583.field1648;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDCOUNT) {
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = FontName.field4583.memberCount;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDDISPLAYNAME) {
				var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = FontName.field4583.memberNames[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDRANK) {
				var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = FontName.field4583.memberRanks[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDCOUNT) {
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = FontName.field4583.bannedMemberCount;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDDISPLAYNAME) {
				var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = FontName.field4583.bannedMemberNames[var3];
				return 1;
			} else {
				int var5;
				int var6;
				if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDEXTRAINFO) {
					class12.Interpreter_intStackSize -= 3;
					var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize];
					var6 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 2];
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = FontName.field4583.method2885(var3, var6, var5);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCURRENTOWNER_SLOT) {
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = FontName.field4583.currentOwner;
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETREPLACEMENTOWNER_SLOT) {
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = FontName.field4583.field1652;
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDSLOT) {
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = FontName.field4583.method2884(Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize]);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETSORTEDAFFINEDSLOT) {
					Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize - 1] = FontName.field4583.getSortedMembers()[Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize - 1]];
					return 1;
				} else if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL) {
					class12.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize];
					var6 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1];
					class142.method2967(var6, var3);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDJOINRUNEDAY) {
					var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = FontName.field4583.field1649[var3];
					return 1;
				} else {
					if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL) {
						class12.Interpreter_intStackSize -= 3;
						var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize];
						boolean var4 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1] == 1;
						var5 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 2];
						class168.method3251(var5, var3, var4);
					}

					if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDMUTED) {
						var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = FontName.field4583.field1650[var3] ? 1 : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_LISTENED) {
						if (UserComparator10.guestClanChannel != null) {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 1;
							class1.field2 = UserComparator10.guestClanChannel;
						} else {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_AFFINED) {
						var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
						if (Client.currentClanChannels[var3] != null) {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 1;
							class1.field2 = Client.currentClanChannels[var3];
							class121.field1529 = var3;
						} else {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETCLANNAME) {
						Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = class1.field2.name;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKKICK) {
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = class1.field2.field1706;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKTALK) {
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = class1.field2.field1711;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERCOUNT) {
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = class1.field2.method3005();
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERDISPLAYNAME) {
						var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
						Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = ((ClanChannelMember)class1.field2.members.get(var3)).username.getName();
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERRANK) {
						var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = ((ClanChannelMember)class1.field2.members.get(var3)).rank;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERWORLD) {
						var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = ((ClanChannelMember)class1.field2.members.get(var3)).world;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_KICKUSER) {
						var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
						InterfaceParent.method2069(class121.field1529, var3);
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERSLOT) {
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = class1.field2.method3023(Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize]);
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETSORTEDUSERSLOT) {
						Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize - 1] = class1.field2.getSortedMembers()[Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize - 1]];
						return 1;
					} else if (var0 == ScriptOpcodes.CLANPROFILE_FIND) {
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = UserComparator8.field1378 != null ? 1 : 0;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}

	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "([Lki;IIIZB)V",
		garbageValue = "74"
	)
	@Export("resizeInterface")
	static void resizeInterface(Widget[] var0, int var1, int var2, int var3, boolean var4) {
		for (int var5 = 0; var5 < var0.length; ++var5) {
			Widget var6 = var0[var5];
			if (var6 != null && var6.parentId == var1) {
				FloorOverlayDefinition.alignWidgetSize(var6, var2, var3, var4);
				ChatChannel.alignWidgetPosition(var6, var2, var3);
				if (var6.scrollX > var6.scrollWidth - var6.width) {
					var6.scrollX = var6.scrollWidth - var6.width;
				}

				if (var6.scrollX < 0) {
					var6.scrollX = 0;
				}

				if (var6.scrollY > var6.scrollHeight - var6.height) {
					var6.scrollY = var6.scrollHeight - var6.height;
				}

				if (var6.scrollY < 0) {
					var6.scrollY = 0;
				}

				if (var6.type == 0) {
					UserComparator8.revalidateWidgetScroll(var0, var6, var4);
				}
			}
		}

	}
}
