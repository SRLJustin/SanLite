import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("an")
@Implements("SoundCache")
public class SoundCache {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("soundEffectIndex")
	AbstractArchive soundEffectIndex;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("musicSampleIndex")
	AbstractArchive musicSampleIndex;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lpv;"
	)
	@Export("musicSamples")
	NodeHashTable musicSamples;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lpv;"
	)
	@Export("rawSounds")
	NodeHashTable rawSounds;

	@ObfuscatedSignature(
		descriptor = "(Llp;Llp;)V"
	)
	public SoundCache(AbstractArchive var1, AbstractArchive var2) {
		this.musicSamples = new NodeHashTable(256);
		this.rawSounds = new NodeHashTable(256);
		this.soundEffectIndex = var1;
		this.musicSampleIndex = var2;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II[II)Lak;",
		garbageValue = "-317198731"
	)
	@Export("getSoundEffect0")
	RawSound getSoundEffect0(int var1, int var2, int[] var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >>> 12);
		var4 |= var1 << 16;
		long var5 = (long)var4;
		RawSound var7 = (RawSound)this.rawSounds.get(var5);
		if (var7 != null) {
			return var7;
		} else if (var3 != null && var3[0] <= 0) {
			return null;
		} else {
			SoundEffect var8 = SoundEffect.readSoundEffect(this.soundEffectIndex, var1, var2);
			if (var8 == null) {
				return null;
			} else {
				var7 = var8.toRawSound();
				this.rawSounds.put(var7, var5);
				if (var3 != null) {
					var3[0] -= var7.samples.length;
				}

				return var7;
			}
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II[II)Lak;",
		garbageValue = "830371012"
	)
	@Export("getMusicSample0")
	RawSound getMusicSample0(int var1, int var2, int[] var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >>> 12);
		var4 |= var1 << 16;
		long var5 = (long)var4 ^ 4294967296L;
		RawSound var7 = (RawSound)this.rawSounds.get(var5);
		if (var7 != null) {
			return var7;
		} else if (var3 != null && var3[0] <= 0) {
			return null;
		} else {
			VorbisSample var8 = (VorbisSample)this.musicSamples.get(var5);
			if (var8 == null) {
				var8 = VorbisSample.readMusicSample(this.musicSampleIndex, var1, var2);
				if (var8 == null) {
					return null;
				}

				this.musicSamples.put(var8, var5);
			}

			var7 = var8.toRawSound(var3);
			if (var7 == null) {
				return null;
			} else {
				var8.remove();
				this.rawSounds.put(var7, var5);
				return var7;
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I[II)Lak;",
		garbageValue = "-1527876593"
	)
	@Export("getSoundEffect")
	public RawSound getSoundEffect(int var1, int[] var2) {
		if (this.soundEffectIndex.getGroupCount() == 1) {
			return this.getSoundEffect0(0, var1, var2);
		} else if (this.soundEffectIndex.getGroupFileCount(var1) == 1) {
			return this.getSoundEffect0(var1, 0, var2);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I[II)Lak;",
		garbageValue = "243303881"
	)
	@Export("getMusicSample")
	public RawSound getMusicSample(int var1, int[] var2) {
		if (this.musicSampleIndex.getGroupCount() == 1) {
			return this.getMusicSample0(0, var1, var2);
		} else if (this.musicSampleIndex.getGroupFileCount(var1) == 1) {
			return this.getMusicSample0(var1, 0, var2);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lmx;Lmx;Lmx;I)V",
		garbageValue = "-417556486"
	)
	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		Login.xPadding = (GraphicsObject.canvasWidth - 765) / 2;
		Login.loginBoxX = Login.xPadding + 202;
		Decimator.loginBoxCenter = Login.loginBoxX + 180;
		if (Login.worldSelectOpen) {
			Language.method5885(var0, var1);
		} else {
			UserComparator6.leftTitleSprite.drawAt(Login.xPadding, 0);
			SecureRandomCallable.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			Clock.logoSprite.drawAt(Login.xPadding + 382 - Clock.logoSprite.subWidth / 2, 18);
			int var4;
			if (Client.gameState == 0 || Client.gameState == 5) {
				byte var3 = 20;
				var0.drawCentered("RuneScape is loading - please wait...", Login.loginBoxX + 180, 245 - var3, 16777215, -1);
				var4 = 253 - var3;
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 152, var4, 304, 34, 9179409);
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 151, var4 + 1, 302, 32, 0);
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150, var4 + 2, Login.Login_loadingPercent * 3, 30, 9179409);
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.Login_loadingPercent * 3 + (Login.loginBoxX + 180 - 150), var4 + 2, 300 - Login.Login_loadingPercent * 3, 30, 0);
				var0.drawCentered(Login.Login_loadingText, Login.loginBoxX + 180, 276 - var3, 16777215, -1);
			}

			String var5;
			String var7;
			String var8;
			int var9;
			char[] var10;
			int var11;
			short var25;
			int var26;
			short var27;
			if (Client.gameState == 20) {
				Login.titleboxSprite.drawAt(Login.loginBoxX + 180 - Login.titleboxSprite.subWidth / 2, 271 - Login.titleboxSprite.subHeight / 2);
				var25 = 201;
				var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var25, 16776960, 0);
				var26 = var25 + 15;
				var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var26, 16776960, 0);
				var26 += 15;
				var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var26, 16776960, 0);
				var26 += 15;
				var26 += 7;
				if (Login.loginIndex != 4 && Login.loginIndex != 10) {
					var0.draw("Login: ", Login.loginBoxX + 180 - 110, var26, 16777215, 0);
					var27 = 200;

					for (var5 = class168.method3253(); var0.stringWidth(var5) > var27; var5 = var5.substring(0, var5.length() - 1)) {
					}

					var0.draw(AbstractFont.escapeBrackets(var5), Login.loginBoxX + 180 - 70, var26, 16777215, 0);
					var26 += 15;
					var7 = Login.Login_password;
					var9 = var7.length();
					var10 = new char[var9];

					for (var11 = 0; var11 < var9; ++var11) {
						var10[var11] = '*';
					}

					var8 = new String(var10);

					for (var8 = var8; var0.stringWidth(var8) > var27; var8 = var8.substring(1)) {
					}

					var0.draw("Password: " + var8, Login.loginBoxX + 180 - 108, var26, 16777215, 0);
					var26 += 15;
				}
			}

			if (Client.gameState == 10 || Client.gameState == 11 || Client.gameState == 50) {
				Login.titleboxSprite.drawAt(Login.loginBoxX, 171);
				short var19;
				if (Login.loginIndex == 0) {
					var25 = 251;
					var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var25, 16776960, 0);
					var26 = var25 + 30;
					var4 = Login.loginBoxX + 180 - 80;
					var19 = 291;
					Login.titlebuttonSprite.drawAt(var4 - 73, var19 - 20);
					var0.drawLines("New User", var4 - 73, var19 - 20, 144, 40, 16777215, 0, 1, 1, 0);
					var4 = Login.loginBoxX + 180 + 80;
					Login.titlebuttonSprite.drawAt(var4 - 73, var19 - 20);
					var0.drawLines("Existing User", var4 - 73, var19 - 20, 144, 40, 16777215, 0, 1, 1, 0);
				} else if (Login.loginIndex == 1) {
					var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0);
					var25 = 236;
					var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var25, 16777215, 0);
					var26 = var25 + 15;
					var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var26, 16777215, 0);
					var26 += 15;
					var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var26, 16777215, 0);
					var26 += 15;
					var4 = Login.loginBoxX + 180 - 80;
					var19 = 321;
					Login.titlebuttonSprite.drawAt(var4 - 73, var19 - 20);
					var0.drawCentered("Continue", var4, var19 + 5, 16777215, 0);
					var4 = Login.loginBoxX + 180 + 80;
					Login.titlebuttonSprite.drawAt(var4 - 73, var19 - 20);
					var0.drawCentered("Cancel", var4, var19 + 5, 16777215, 0);
				} else {
					IndexedSprite var28;
					if (Login.loginIndex == 2) {
						var25 = 201;
						var0.drawCentered(Login.Login_response1, Decimator.loginBoxCenter, var25, 16776960, 0);
						var26 = var25 + 15;
						var0.drawCentered(Login.Login_response2, Decimator.loginBoxCenter, var26, 16776960, 0);
						var26 += 15;
						var0.drawCentered(Login.Login_response3, Decimator.loginBoxCenter, var26, 16776960, 0);
						var26 += 15;
						var26 += 7;
						var0.draw("Login: ", Decimator.loginBoxCenter - 110, var26, 16777215, 0);
						var27 = 200;

						for (var5 = class168.method3253(); var0.stringWidth(var5) > var27; var5 = var5.substring(1)) {
						}

						var0.draw(AbstractFont.escapeBrackets(var5) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? class166.colorStartTag(16776960) + "|" : ""), Decimator.loginBoxCenter - 70, var26, 16777215, 0);
						var26 += 15;
						var7 = Login.Login_password;
						var9 = var7.length();
						var10 = new char[var9];

						for (var11 = 0; var11 < var9; ++var11) {
							var10[var11] = '*';
						}

						var8 = new String(var10);

						for (var8 = var8; var0.stringWidth(var8) > var27; var8 = var8.substring(1)) {
						}

						var0.draw("Password: " + var8 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? class166.colorStartTag(16776960) + "|" : ""), Decimator.loginBoxCenter - 108, var26, 16777215, 0);
						var26 += 15;
						var25 = 277;
						var9 = Decimator.loginBoxCenter + -117;
						boolean var29 = Client.Login_isUsernameRemembered;
						boolean var12 = Login.field879;
						var28 = var29 ? (var12 ? UrlRequester.field1354 : class101.field1360) : (var12 ? Login.field888 : class67.field872);
						var28.drawAt(var9, var25);
						var9 = var9 + var28.subWidth + 5;
						var1.draw("Remember username", var9, var25 + 13, 16776960, 0);
						var9 = Decimator.loginBoxCenter + 24;
						boolean var15 = class12.clientPreferences.method2257();
						boolean var16 = Login.field881;
						IndexedSprite var14 = var15 ? (var16 ? UrlRequester.field1354 : class101.field1360) : (var16 ? Login.field888 : class67.field872);
						var14.drawAt(var9, var25);
						var9 = var9 + var14.subWidth + 5;
						var1.draw("Hide username", var9, var25 + 13, 16776960, 0);
						var26 = var25 + 15;
						int var17 = Decimator.loginBoxCenter - 80;
						short var18 = 321;
						Login.titlebuttonSprite.drawAt(var17 - 73, var18 - 20);
						var0.drawCentered("Login", var17, var18 + 5, 16777215, 0);
						var17 = Decimator.loginBoxCenter + 80;
						Login.titlebuttonSprite.drawAt(var17 - 73, var18 - 20);
						var0.drawCentered("Cancel", var17, var18 + 5, 16777215, 0);
						var25 = 357;
						switch(Login.field907) {
						case 2:
							class17.field89 = "Having trouble logging in?";
							break;
						default:
							class17.field89 = "Can't login? Click here.";
						}

						ChatChannel.field976 = new Bounds(Decimator.loginBoxCenter, var25, var1.stringWidth(class17.field89), 11);
						ChatChannel.field977 = new Bounds(Decimator.loginBoxCenter, var25, var1.stringWidth("Still having trouble logging in?"), 11);
						var1.drawCentered(class17.field89, Decimator.loginBoxCenter, var25, 16777215, 0);
					} else if (Login.loginIndex == 3) {
						var25 = 201;
						var0.drawCentered("Invalid credentials.", Login.loginBoxX + 180, var25, 16776960, 0);
						var26 = var25 + 20;
						var1.drawCentered("For accounts created after 24th November 2010, please use your", Login.loginBoxX + 180, var26, 16776960, 0);
						var26 += 15;
						var1.drawCentered("email address to login. Otherwise please login with your username.", Login.loginBoxX + 180, var26, 16776960, 0);
						var26 += 15;
						var4 = Login.loginBoxX + 180;
						var19 = 276;
						Login.titlebuttonSprite.drawAt(var4 - 73, var19 - 20);
						var2.drawCentered("Try again", var4, var19 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180;
						var19 = 326;
						Login.titlebuttonSprite.drawAt(var4 - 73, var19 - 20);
						var2.drawCentered("Forgotten password?", var4, var19 + 5, 16777215, 0);
					} else if (Login.loginIndex == 4) {
						var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0);
						var25 = 236;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var25, 16777215, 0);
						var26 = var25 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var26, 16777215, 0);
						var26 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var26, 16777215, 0);
						var26 += 15;
						var5 = "PIN: ";
						var7 = class92.otp;
						var9 = var7.length();
						var10 = new char[var9];

						for (var11 = 0; var11 < var9; ++var11) {
							var10[var11] = '*';
						}

						var8 = new String(var10);
						var0.draw(var5 + var8 + (Client.cycle % 40 < 20 ? class166.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var26, 16777215, 0);
						var26 -= 8;
						var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var26, 16776960, 0);
						var26 += 15;
						var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var26, 16776960, 0);
						int var22 = Login.loginBoxX + 180 - 9 + var0.stringWidth("for 30 days: ") + 15;
						var9 = var26 - var0.ascent;
						if (Login.field900) {
							var28 = class101.field1360;
						} else {
							var28 = class67.field872;
						}

						var28.drawAt(var22, var9);
						var26 += 15;
						var11 = Login.loginBoxX + 180 - 80;
						short var30 = 321;
						Login.titlebuttonSprite.drawAt(var11 - 73, var30 - 20);
						var0.drawCentered("Continue", var11, var30 + 5, 16777215, 0);
						var11 = Login.loginBoxX + 180 + 80;
						Login.titlebuttonSprite.drawAt(var11 - 73, var30 - 20);
						var0.drawCentered("Cancel", var11, var30 + 5, 16777215, 0);
						var1.drawCentered("<u=ff>Can't Log In?</u>", Login.loginBoxX + 180, var30 + 36, 255, 0);
					} else if (Login.loginIndex == 5) {
						var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0);
						var25 = 221;
						var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var25, 16776960, 0);
						var26 = var25 + 15;
						var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var26, 16776960, 0);
						var26 += 15;
						var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var26, 16776960, 0);
						var26 += 15;
						var26 += 14;
						var0.draw("Username/email: ", Login.loginBoxX + 180 - 145, var26, 16777215, 0);
						var27 = 174;

						for (var5 = class168.method3253(); var0.stringWidth(var5) > var27; var5 = var5.substring(1)) {
						}

						var0.draw(AbstractFont.escapeBrackets(var5) + (Client.cycle % 40 < 20 ? class166.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var26, 16777215, 0);
						var26 += 15;
						int var23 = Login.loginBoxX + 180 - 80;
						short var21 = 321;
						Login.titlebuttonSprite.drawAt(var23 - 73, var21 - 20);
						var0.drawCentered("Recover", var23, var21 + 5, 16777215, 0);
						var23 = Login.loginBoxX + 180 + 80;
						Login.titlebuttonSprite.drawAt(var23 - 73, var21 - 20);
						var0.drawCentered("Back", var23, var21 + 5, 16777215, 0);
						var21 = 356;
						var1.drawCentered("Still having trouble logging in?", Decimator.loginBoxCenter, var21, 268435455, 0);
					} else if (Login.loginIndex == 6) {
						var25 = 201;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var25, 16776960, 0);
						var26 = var25 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var26, 16776960, 0);
						var26 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var26, 16776960, 0);
						var26 += 15;
						var4 = Login.loginBoxX + 180;
						var19 = 321;
						Login.titlebuttonSprite.drawAt(var4 - 73, var19 - 20);
						var0.drawCentered("Back", var4, var19 + 5, 16777215, 0);
					} else if (Login.loginIndex == 7) {
						if (class92.field1273 && !Client.onMobile) {
							var25 = 201;
							var0.drawCentered(Login.Login_response1, Decimator.loginBoxCenter, var25, 16776960, 0);
							var26 = var25 + 15;
							var0.drawCentered(Login.Login_response2, Decimator.loginBoxCenter, var26, 16776960, 0);
							var26 += 15;
							var0.drawCentered(Login.Login_response3, Decimator.loginBoxCenter, var26, 16776960, 0);
							var4 = Decimator.loginBoxCenter - 150;
							var26 += 10;

							int var31;
							for (var31 = 0; var31 < 8; ++var31) {
								Login.titlebuttonSprite.method7927(var4, var26, 30, 40);
								boolean var35 = var31 == Login.field896 & Client.cycle % 40 < 20;
								var0.draw((Login.field876[var31] == null ? "" : Login.field876[var31]) + (var35 ? class166.colorStartTag(16776960) + "|" : ""), var4 + 10, var26 + 27, 16777215, 0);
								if (var31 != 1 && var31 != 3) {
									var4 += 35;
								} else {
									var4 += 50;
									var0.draw(AbstractFont.escapeBrackets("/"), var4 - 13, var26 + 27, 16777215, 0);
								}
							}

							var31 = Decimator.loginBoxCenter - 80;
							short var36 = 321;
							Login.titlebuttonSprite.drawAt(var31 - 73, var36 - 20);
							var0.drawCentered("Submit", var31, var36 + 5, 16777215, 0);
							var31 = Decimator.loginBoxCenter + 80;
							Login.titlebuttonSprite.drawAt(var31 - 73, var36 - 20);
							var0.drawCentered("Cancel", var31, var36 + 5, 16777215, 0);
						} else {
							var25 = 216;
							var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var25, 16776960, 0);
							var26 = var25 + 15;
							var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var26, 16776960, 0);
							var26 += 15;
							var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var26, 16776960, 0);
							var26 += 15;
							var4 = Login.loginBoxX + 180 - 80;
							var19 = 321;
							Login.titlebuttonSprite.drawAt(var4 - 73, var19 - 20);
							var0.drawCentered("Set Date of Birth", var4, var19 + 5, 16777215, 0);
							var4 = Login.loginBoxX + 180 + 80;
							Login.titlebuttonSprite.drawAt(var4 - 73, var19 - 20);
							var0.drawCentered("Back", var4, var19 + 5, 16777215, 0);
						}
					} else if (Login.loginIndex == 8) {
						var25 = 216;
						var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var25, 16776960, 0);
						var26 = var25 + 15;
						var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var26, 16776960, 0);
						var26 += 15;
						var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var26, 16776960, 0);
						var26 += 15;
						var4 = Login.loginBoxX + 180 - 80;
						var19 = 321;
						Login.titlebuttonSprite.drawAt(var4 - 73, var19 - 20);
						var0.drawCentered("Privacy Policy", var4, var19 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180 + 80;
						Login.titlebuttonSprite.drawAt(var4 - 73, var19 - 20);
						var0.drawCentered("Back", var4, var19 + 5, 16777215, 0);
					} else if (Login.loginIndex == 9) {
						var25 = 221;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var25, 16776960, 0);
						var26 = var25 + 25;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var26, 16776960, 0);
						var26 += 25;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var26, 16776960, 0);
						var4 = Login.loginBoxX + 180;
						var19 = 311;
						Login.titlebuttonSprite.drawAt(var4 - 73, var19 - 20);
						var0.drawCentered("Try again", var4, var19 + 5, 16777215, 0);
					} else if (Login.loginIndex == 10) {
						var26 = Login.loginBoxX + 180;
						var27 = 209;
						var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var27, 16776960, 0);
						var4 = var27 + 20;
						Clock.field1839.drawAt(var26 - 109, var4);
						Login.field882.drawAt(var26 - 48, var4 + 18);
					} else if (Login.loginIndex == 12) {
						var26 = Decimator.loginBoxCenter;
						var27 = 216;
						var2.drawCentered("Before using this app, please read and accept our", var26, var27, 16777215, 0);
						var4 = var27 + 17;
						var2.drawCentered("<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var26, var4, 16777215, 0);
						var4 += 17;
						var2.drawCentered("<col=ffd200>agreement (EULA)</col>.", var26, var4, 16777215, 0);
						var4 += 17;
						var2.drawCentered("By accepting, you agree to these documents.", var26, var4, 16777215, 0);
						var26 = Decimator.loginBoxCenter - 80;
						var27 = 311;
						Login.titlebuttonSprite.drawAt(var26 - 73, var27 - 20);
						var0.drawCentered("Accept", var26, var27 + 5, 16777215, 0);
						var26 = Decimator.loginBoxCenter + 80;
						Login.titlebuttonSprite.drawAt(var26 - 73, var27 - 20);
						var0.drawCentered("Decline", var26, var27 + 5, 16777215, 0);
					} else if (Login.loginIndex == 13) {
						var25 = 231;
						var2.drawCentered("You must accept our terms of use, privacy policy,", Login.loginBoxX + 180, var25, 16777215, 0);
						var26 = var25 + 20;
						var2.drawCentered("and end user licence agreement to continue.", Login.loginBoxX + 180, var26, 16777215, 0);
						var4 = Login.loginBoxX + 180;
						var25 = 311;
						Login.titlebuttonSprite.drawAt(var4 - 73, var25 - 20);
						var0.drawCentered("Back", var4, var25 + 5, 16777215, 0);
					} else if (Login.loginIndex == 14) {
						var25 = 201;
						String var20 = "";
						var5 = "";
						String var6 = "";
						switch(Login.field887) {
						case 0:
							var20 = "Your account has been disabled.";
							var5 = Strings.field3689;
							var6 = "";
							break;
						case 1:
							var20 = "Account locked as we suspect it has been stolen.";
							var5 = Strings.field3743;
							var6 = "";
							break;
						default:
							PcmPlayer.method755(false);
						}

						var0.drawCentered(var20, Login.loginBoxX + 180, var25, 16776960, 0);
						var26 = var25 + 15;
						var2.drawCentered(var5, Login.loginBoxX + 180, var26, 16776960, 0);
						var26 += 15;
						var2.drawCentered(var6, Login.loginBoxX + 180, var26, 16776960, 0);
						var26 += 15;
						int var32 = Login.loginBoxX + 180;
						short var33 = 276;
						Login.titlebuttonSprite.drawAt(var32 - 73, var33 - 20);
						var0.drawCentered("Support Page", var32, var33 + 5, 16777215, 0);
						var32 = Login.loginBoxX + 180;
						var33 = 326;
						Login.titlebuttonSprite.drawAt(var32 - 73, var33 - 20);
						var0.drawCentered("Back", var32, var33 + 5, 16777215, 0);
					} else if (Login.loginIndex == 24) {
						var25 = 221;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var25, 16777215, 0);
						var26 = var25 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var26, 16777215, 0);
						var26 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var26, 16777215, 0);
						var26 += 15;
						var4 = Login.loginBoxX + 180;
						var19 = 301;
						Login.titlebuttonSprite.drawAt(var4 - 73, var19 - 20);
						var0.drawCentered("Ok", var4, var19 + 5, 16777215, 0);
					} else if (Login.loginIndex == 26) {
						var25 = 216;
						var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var25, 16776960, 0);
						var26 = var25 + 15;
						var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var26, 16776960, 0);
						var26 += 15;
						var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var26, 16776960, 0);
						var26 += 15;
						var4 = Login.loginBoxX + 180 - 80;
						var19 = 321;
						Login.titlebuttonSprite.drawAt(var4 - 73, var19 - 20);
						var0.drawCentered("Set Date of Birth", var4, var19 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180 + 80;
						Login.titlebuttonSprite.drawAt(var4 - 73, var19 - 20);
						var0.drawCentered("Back", var4, var19 + 5, 16777215, 0);
					}
				}
			}

			if (Client.gameState >= 10) {
				int[] var24 = new int[4];
				Rasterizer2D.Rasterizer2D_getClipArray(var24);
				Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, class433.canvasHeight);
				class193.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle);
				class193.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle);
				Rasterizer2D.Rasterizer2D_setClipArray(var24);
			}

			class358.field4260[class12.clientPreferences.method2226() ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463);
			if (Client.gameState > 5 && class263.clientLanguage == Language.Language_EN) {
				if (ArchiveDiskAction.field3997 != null) {
					var26 = Login.xPadding + 5;
					var27 = 463;
					byte var34 = 100;
					byte var37 = 35;
					ArchiveDiskAction.field3997.drawAt(var26, var27);
					var0.drawCentered("World" + " " + Client.worldId, var34 / 2 + var26, var37 / 2 + var27 - 2, 16777215, 0);
					if (NPC.World_request != null) {
						var1.drawCentered("Loading...", var34 / 2 + var26, var37 / 2 + var27 + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", var34 / 2 + var26, var37 / 2 + var27 + 12, 16777215, 0);
					}
				} else {
					ArchiveDiskAction.field3997 = JagexCache.SpriteBuffer_getIndexedSpriteByName(class305.archive8, "sl_button", "");
				}
			}

		}
	}
}
