import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("er")
public class class136 extends class144 {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -862261103
	)
	int field1624;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lee;"
	)
	final class145 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lee;)V"
	)
	class136(class145 var1) {
		this.this$0 = var1;
		this.field1624 = -1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)V",
		garbageValue = "1212008489"
	)
	void vmethod3037(Buffer var1) {
		this.field1624 = var1.readUnsignedShort();
		var1.readUnsignedByte();
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			var1.readLong();
		}

	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Let;I)V",
		garbageValue = "1640110130"
	)
	void vmethod3032(ClanChannel var1) {
		var1.removeMember(this.field1624);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Lfw;",
		garbageValue = "-185692115"
	)
	@Export("SpotAnimationDefinition_get")
	public static SpotAnimationDefinition SpotAnimationDefinition_get(int var0) {
		SpotAnimationDefinition var1 = (SpotAnimationDefinition)SpotAnimationDefinition.SpotAnimationDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = SpotAnimationDefinition.SpotAnimationDefinition_archive.takeFile(13, var0);
			var1 = new SpotAnimationDefinition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			SpotAnimationDefinition.SpotAnimationDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Laj;Lmx;I)V",
		garbageValue = "617611550"
	)
	static void method2858(GameEngine var0, Font var1) {
		if (Login.worldSelectOpen) {
			class132.method2829(var0);
		} else {
			if ((MouseHandler.MouseHandler_lastButton == 1 || !Login.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453) {
				class12.clientPreferences.method2305(!class12.clientPreferences.method2226());
				if (!class12.clientPreferences.method2226()) {
					class118.method2733(AbstractUserComparator.archive6, "scape main", "", 255, false);
				} else {
					ApproximateRouteStrategy.method1110();
				}
			}

			if (Client.gameState != 5) {
				if (-1L == Login.field883) {
					Login.field883 = class113.method2624() + 1000L;
				}

				long var2 = class113.method2624();
				if (class121.method2748() && Login.field909 == -1L) {
					Login.field909 = var2;
					if (Login.field909 > Login.field883) {
						Login.field883 = Login.field909;
					}
				}

				if (Client.gameState == 10 || Client.gameState == 11) {
					int var4;
					if (Language.Language_EN == class263.clientLanguage) {
						if (MouseHandler.MouseHandler_lastButton == 1 || !Login.mouseCam && MouseHandler.MouseHandler_lastButton == 4) {
							var4 = Login.xPadding + 5;
							short var5 = 463;
							byte var6 = 100;
							byte var7 = 35;
							if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var4 + var6 && MouseHandler.MouseHandler_lastPressedY >= var5 && MouseHandler.MouseHandler_lastPressedY <= var7 + var5) {
								Player.method2135();
								return;
							}
						}

						if (NPC.World_request != null) {
							Player.method2135();
						}
					}

					var4 = MouseHandler.MouseHandler_lastButton;
					int var30 = MouseHandler.MouseHandler_lastPressedX;
					int var31 = MouseHandler.MouseHandler_lastPressedY;
					if (var4 == 0) {
						var30 = MouseHandler.MouseHandler_x;
						var31 = MouseHandler.MouseHandler_y;
					}

					if (!Login.mouseCam && var4 == 4) {
						var4 = 1;
					}

					int var34;
					short var35;
					if (Login.loginIndex == 0) {
						boolean var44 = false;

						while (TaskHandler.isKeyDown()) {
							if (class12.field61 == 84) {
								var44 = true;
							}
						}

						var34 = Decimator.loginBoxCenter - 80;
						var35 = 291;
						if (var4 == 1 && var30 >= var34 - 75 && var30 <= var34 + 75 && var31 >= var35 - 20 && var31 <= var35 + 20) {
							ScriptEvent.openURL(WorldMapData_1.method4707("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
						}

						var34 = Decimator.loginBoxCenter + 80;
						if (var4 == 1 && var30 >= var34 - 75 && var30 <= var34 + 75 && var31 >= var35 - 20 && var31 <= var35 + 20 || var44) {
							if ((Client.worldProperties & 33554432) != 0) {
								Login.Login_response0 = "";
								Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world.";
								Login.Login_response2 = "Your normal account will not be affected.";
								Login.Login_response3 = "";
								class126.method2799(1);
								if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) {
									Login.currentLoginField = 1;
								} else {
									Login.currentLoginField = 0;
								}
							} else if ((Client.worldProperties & 4) != 0) {
								if ((Client.worldProperties & 1024) != 0) {
									Login.Login_response1 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world.";
									Login.Login_response2 = "Players can attack each other almost everywhere";
									Login.Login_response3 = "and the Protect Item prayer won't work.";
								} else {
									Login.Login_response1 = "This is a <col=ff0000>PvP<col=ffffff> world.";
									Login.Login_response2 = "Players can attack each other";
									Login.Login_response3 = "almost everywhere.";
								}

								Login.Login_response0 = "Warning!";
								class126.method2799(1);
								if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) {
									Login.currentLoginField = 1;
								} else {
									Login.currentLoginField = 0;
								}
							} else if ((Client.worldProperties & 1024) != 0) {
								Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
								Login.Login_response2 = "The Protect Item prayer will";
								Login.Login_response3 = "not work on this world.";
								Login.Login_response0 = "Warning!";
								class126.method2799(1);
								if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) {
									Login.currentLoginField = 1;
								} else {
									Login.currentLoginField = 0;
								}
							} else {
								PcmPlayer.method755(false);
							}
						}
					} else {
						short var8;
						int var32;
						if (Login.loginIndex == 1) {
							while (true) {
								if (!TaskHandler.isKeyDown()) {
									var32 = Decimator.loginBoxCenter - 80;
									var8 = 321;
									if (var4 == 1 && var30 >= var32 - 75 && var30 <= var32 + 75 && var31 >= var8 - 20 && var31 <= var8 + 20) {
										PcmPlayer.method755(false);
									}

									var32 = Decimator.loginBoxCenter + 80;
									if (var4 == 1 && var30 >= var32 - 75 && var30 <= var32 + 75 && var31 >= var8 - 20 && var31 <= var8 + 20) {
										class126.method2799(0);
									}
									break;
								}

								if (class12.field61 == 84) {
									PcmPlayer.method755(false);
								} else if (class12.field61 == 13) {
									class126.method2799(0);
								}
							}
						} else {
							int var11;
							short var33;
							boolean var36;
							if (Login.loginIndex == 2) {
								var33 = 201;
								var32 = var33 + 52;
								if (var4 == 1 && var31 >= var32 - 12 && var31 < var32 + 2) {
									Login.currentLoginField = 0;
								}

								var32 += 15;
								if (var4 == 1 && var31 >= var32 - 12 && var31 < var32 + 2) {
									Login.currentLoginField = 1;
								}

								var32 += 15;
								var33 = 361;
								if (ChatChannel.field976 != null) {
									var34 = ChatChannel.field976.highX / 2;
									if (var4 == 1 && var30 >= ChatChannel.field976.lowX - var34 && var30 <= var34 + ChatChannel.field976.lowX && var31 >= var33 - 15 && var31 < var33) {
										switch(Login.field907) {
										case 1:
											class345.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
											class126.method2799(5);
											return;
										case 2:
											ScriptEvent.openURL("https://support.runescape.com/hc/en-gb", true, false);
										}
									}
								}

								var34 = Decimator.loginBoxCenter - 80;
								var35 = 321;
								if (var4 == 1 && var30 >= var34 - 75 && var30 <= var34 + 75 && var31 >= var35 - 20 && var31 <= var35 + 20) {
									Login.Login_username = Login.Login_username.trim();
									if (Login.Login_username.length() == 0) {
										class345.setLoginResponseString("", "Please enter your username/email address.", "");
										return;
									}

									if (Login.Login_password.length() == 0) {
										class345.setLoginResponseString("", "Please enter your password.", "");
										return;
									}

									class345.setLoginResponseString("", "Connecting to server...", "");
									ObjectSound.method1730(false);
									PendingSpawn.updateGameState(20);
									return;
								}

								var34 = Login.loginBoxX + 180 + 80;
								if (var4 == 1 && var30 >= var34 - 75 && var30 <= var34 + 75 && var31 >= var35 - 20 && var31 <= var35 + 20) {
									class126.method2799(0);
									Login.Login_username = "";
									Login.Login_password = "";
									WorldMapCacheName.field2912 = 0;
									class92.otp = "";
									Login.field900 = true;
								}

								var34 = Decimator.loginBoxCenter + -117;
								var35 = 277;
								Login.field879 = var30 >= var34 && var30 < var34 + class16.field81 && var31 >= var35 && var31 < var35 + class268.field3212;
								if (var4 == 1 && Login.field879) {
									Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered;
									if (!Client.Login_isUsernameRemembered && class12.clientPreferences.method2241() != null) {
										class12.clientPreferences.method2297((String)null);
									}
								}

								var34 = Decimator.loginBoxCenter + 24;
								var35 = 277;
								Login.field881 = var30 >= var34 && var30 < var34 + class16.field81 && var31 >= var35 && var31 < var35 + class268.field3212;
								if (var4 == 1 && Login.field881) {
									class12.clientPreferences.method2223(!class12.clientPreferences.method2257());
									if (!class12.clientPreferences.method2257()) {
										Login.Login_username = "";
										class12.clientPreferences.method2297((String)null);
										if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) {
											Login.currentLoginField = 1;
										} else {
											Login.currentLoginField = 0;
										}
									}
								}

								label1340:
								while (true) {
									int var40;
									Transferable var47;
									do {
										while (true) {
											label1256:
											do {
												while (true) {
													while (TaskHandler.isKeyDown()) {
														if (class12.field61 != 13) {
															if (Login.currentLoginField != 0) {
																continue label1256;
															}

															char var37 = InvDefinition.field1850;

															for (var11 = 0; var11 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length() && var37 != "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var11); ++var11) {
															}

															if (class12.field61 == 85 && Login.Login_username.length() > 0) {
																Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
															}

															if (class12.field61 == 84 || class12.field61 == 80) {
																Login.currentLoginField = 1;
															}

															char var38 = InvDefinition.field1850;
															boolean var41 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var38) != -1;
															if (var41 && Login.Login_username.length() < 320) {
																Login.Login_username = Login.Login_username + InvDefinition.field1850;
															}
														} else {
															class126.method2799(0);
															Login.Login_username = "";
															Login.Login_password = "";
															WorldMapCacheName.field2912 = 0;
															class92.otp = "";
															Login.field900 = true;
														}
													}

													return;
												}
											} while(Login.currentLoginField != 1);

											if (class12.field61 == 85 && Login.Login_password.length() > 0) {
												Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1);
											} else if (class12.field61 == 84 || class12.field61 == 80) {
												Login.currentLoginField = 0;
												if (class12.field61 == 84) {
													Login.Login_username = Login.Login_username.trim();
													if (Login.Login_username.length() == 0) {
														class345.setLoginResponseString("", "Please enter your username/email address.", "");
														return;
													}

													if (Login.Login_password.length() == 0) {
														class345.setLoginResponseString("", "Please enter your password.", "");
														return;
													}

													class345.setLoginResponseString("", "Connecting to server...", "");
													ObjectSound.method1730(false);
													PendingSpawn.updateGameState(20);
													return;
												}
											}

											if ((KeyHandler.KeyHandler_pressedKeys[82] || KeyHandler.KeyHandler_pressedKeys[87]) && class12.field61 == 67) {
												Clipboard var46 = Toolkit.getDefaultToolkit().getSystemClipboard();
												var47 = var46.getContents(class82.client);
												var40 = 20 - Login.Login_password.length();
												break;
											}

											char var42 = InvDefinition.field1850;
											if ((var42 < ' ' || var42 >= 127) && (var42 <= 127 || var42 >= 160) && (var42 <= 160 || var42 > 255)) {
												label1472: {
													if (var42 != 0) {
														char[] var48 = class341.cp1252AsciiExtension;

														for (int var49 = 0; var49 < var48.length; ++var49) {
															char var14 = var48[var49];
															if (var42 == var14) {
																var36 = true;
																break label1472;
															}
														}
													}

													var36 = false;
												}
											} else {
												var36 = true;
											}

											if (var36) {
												char var50 = InvDefinition.field1850;
												boolean var39 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var50) != -1;
												if (var39 && Login.Login_password.length() < 20) {
													Login.Login_password = Login.Login_password + InvDefinition.field1850;
												}
											}
										}
									} while(var40 <= 0);

									try {
										String var13 = (String)var47.getTransferData(DataFlavor.stringFlavor);
										int var43 = Math.min(var40, var13.length());
										int var15 = 0;

										while (true) {
											if (var15 >= var43) {
												Login.Login_password = Login.Login_password + var13.substring(0, var43);
												continue label1340;
											}

											char var17 = var13.charAt(var15);
											boolean var16;
											if (var17 >= ' ' && var17 < 127 || var17 > 127 && var17 < 160 || var17 > 160 && var17 <= 255) {
												var16 = true;
											} else {
												label1486: {
													if (var17 != 0) {
														char[] var18 = class341.cp1252AsciiExtension;

														for (int var19 = 0; var19 < var18.length; ++var19) {
															char var20 = var18[var19];
															if (var17 == var20) {
																var16 = true;
																break label1486;
															}
														}
													}

													var16 = false;
												}
											}

											if (!var16) {
												break;
											}

											char var45 = var13.charAt(var15);
											boolean var23 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var45) != -1;
											if (!var23) {
												break;
											}

											++var15;
										}

										class126.method2799(3);
										return;
									} catch (UnsupportedFlavorException var28) {
									} catch (IOException var29) {
									}
								}
							} else if (Login.loginIndex == 3) {
								var32 = Login.loginBoxX + 180;
								var8 = 276;
								if (var4 == 1 && var30 >= var32 - 75 && var30 <= var32 + 75 && var31 >= var8 - 20 && var31 <= var8 + 20) {
									WorldMapData_1.method4706(false);
								}

								var32 = Login.loginBoxX + 180;
								var8 = 326;
								if (var4 == 1 && var30 >= var32 - 75 && var30 <= var32 + 75 && var31 >= var8 - 20 && var31 <= var8 + 20) {
									class345.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
									class126.method2799(5);
									return;
								}
							} else {
								int var10;
								if (Login.loginIndex == 4) {
									var32 = Login.loginBoxX + 180 - 80;
									var8 = 321;
									if (var4 == 1 && var30 >= var32 - 75 && var30 <= var32 + 75 && var31 >= var8 - 20 && var31 <= var8 + 20) {
										class92.otp.trim();
										if (class92.otp.length() != 6) {
											class345.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
											return;
										}

										WorldMapCacheName.field2912 = Integer.parseInt(class92.otp);
										class92.otp = "";
										ObjectSound.method1730(true);
										class345.setLoginResponseString("", "Connecting to server...", "");
										PendingSpawn.updateGameState(20);
										return;
									}

									if (var4 == 1 && var30 >= Login.loginBoxX + 180 - 9 && var30 <= Login.loginBoxX + 180 + 130 && var31 >= 263 && var31 <= 296) {
										Login.field900 = !Login.field900;
									}

									if (var4 == 1 && var30 >= Login.loginBoxX + 180 - 34 && var30 <= Login.loginBoxX + 34 + 180 && var31 >= 351 && var31 <= 363) {
										ScriptEvent.openURL(WorldMapData_1.method4707("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
									}

									var32 = Login.loginBoxX + 180 + 80;
									if (var4 == 1 && var30 >= var32 - 75 && var30 <= var32 + 75 && var31 >= var8 - 20 && var31 <= var8 + 20) {
										class126.method2799(0);
										Login.Login_username = "";
										Login.Login_password = "";
										WorldMapCacheName.field2912 = 0;
										class92.otp = "";
									}

									while (TaskHandler.isKeyDown()) {
										boolean var9 = false;

										for (var10 = 0; var10 < "1234567890".length(); ++var10) {
											if (InvDefinition.field1850 == "1234567890".charAt(var10)) {
												var9 = true;
												break;
											}
										}

										if (class12.field61 == 13) {
											class126.method2799(0);
											Login.Login_username = "";
											Login.Login_password = "";
											WorldMapCacheName.field2912 = 0;
											class92.otp = "";
										} else {
											if (class12.field61 == 85 && class92.otp.length() > 0) {
												class92.otp = class92.otp.substring(0, class92.otp.length() - 1);
											}

											if (class12.field61 == 84) {
												class92.otp.trim();
												if (class92.otp.length() != 6) {
													class345.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
													return;
												}

												WorldMapCacheName.field2912 = Integer.parseInt(class92.otp);
												class92.otp = "";
												ObjectSound.method1730(true);
												class345.setLoginResponseString("", "Connecting to server...", "");
												PendingSpawn.updateGameState(20);
												return;
											}

											if (var9 && class92.otp.length() < 6) {
												class92.otp = class92.otp + InvDefinition.field1850;
											}
										}
									}
								} else if (Login.loginIndex == 5) {
									var32 = Login.loginBoxX + 180 - 80;
									var8 = 321;
									if (var4 == 1 && var30 >= var32 - 75 && var30 <= var32 + 75 && var31 >= var8 - 20 && var31 <= var8 + 20) {
										class21.method280();
										return;
									}

									var32 = Login.loginBoxX + 180 + 80;
									if (var4 == 1 && var30 >= var32 - 75 && var30 <= var32 + 75 && var31 >= var8 - 20 && var31 <= var8 + 20) {
										PcmPlayer.method755(true);
									}

									var35 = 361;
									if (ChatChannel.field977 != null) {
										var10 = ChatChannel.field977.highX / 2;
										if (var4 == 1 && var30 >= ChatChannel.field977.lowX - var10 && var30 <= var10 + ChatChannel.field977.lowX && var31 >= var35 - 15 && var31 < var35) {
											ScriptEvent.openURL(WorldMapData_1.method4707("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
										}
									}

									while (TaskHandler.isKeyDown()) {
										var36 = false;

										for (var11 = 0; var11 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var11) {
											if (InvDefinition.field1850 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var11)) {
												var36 = true;
												break;
											}
										}

										if (class12.field61 == 13) {
											PcmPlayer.method755(true);
										} else {
											if (class12.field61 == 85 && Login.Login_username.length() > 0) {
												Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
											}

											if (class12.field61 == 84) {
												class21.method280();
												return;
											}

											if (var36 && Login.Login_username.length() < 320) {
												Login.Login_username = Login.Login_username + InvDefinition.field1850;
											}
										}
									}
								} else if (Login.loginIndex != 6) {
									if (Login.loginIndex == 7) {
										if (class92.field1273 && !Client.onMobile) {
											var32 = Decimator.loginBoxCenter - 150;
											var34 = var32 + 40 + 240 + 25;
											var35 = 231;
											var10 = var35 + 40;
											if (var4 == 1 && var30 >= var32 && var30 <= var34 && var31 >= var35 && var31 <= var10) {
												Login.field896 = PcmPlayer.method693(var32, var30);
											}

											var11 = Login.loginBoxX + 180 - 80;
											short var12 = 321;
											boolean var25;
											if (var4 == 1 && var30 >= var11 - 75 && var30 <= var11 + 75 && var31 >= var12 - 20 && var31 <= var12 + 20) {
												var25 = GraphicsObject.method1867();
												if (var25) {
													PendingSpawn.updateGameState(50);
													return;
												}
											}

											var11 = Login.loginBoxX + 180 + 80;
											if (var4 == 1 && var30 >= var11 - 75 && var30 <= var11 + 75 && var31 >= var12 - 20 && var31 <= var12 + 20) {
												Login.field876 = new String[8];
												PcmPlayer.method755(true);
											}

											while (TaskHandler.isKeyDown()) {
												if (class12.field61 == 101) {
													Login.field876[Login.field896] = null;
												}

												if (class12.field61 == 85) {
													if (Login.field876[Login.field896] == null && Login.field896 > 0) {
														--Login.field896;
													}

													Login.field876[Login.field896] = null;
												}

												if (InvDefinition.field1850 >= '0' && InvDefinition.field1850 <= '9') {
													Login.field876[Login.field896] = "" + InvDefinition.field1850;
													if (Login.field896 < 7) {
														++Login.field896;
													}
												}

												if (class12.field61 == 84) {
													var25 = GraphicsObject.method1867();
													if (var25) {
														PendingSpawn.updateGameState(50);
													}

													return;
												}
											}
										} else {
											var32 = Login.loginBoxX + 180 - 80;
											var8 = 321;
											if (var4 == 1 && var30 >= var32 - 75 && var30 <= var32 + 75 && var31 >= var8 - 20 && var31 <= var8 + 20) {
												ScriptEvent.openURL(WorldMapData_1.method4707("secure", true) + "m=dob/set_dob.ws", true, false);
												class345.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
												class126.method2799(6);
												return;
											}

											var32 = Login.loginBoxX + 180 + 80;
											if (var4 == 1 && var30 >= var32 - 75 && var30 <= var32 + 75 && var31 >= var8 - 20 && var31 <= var8 + 20) {
												PcmPlayer.method755(true);
											}
										}
									} else if (Login.loginIndex == 8) {
										var32 = Login.loginBoxX + 180 - 80;
										var8 = 321;
										if (var4 == 1 && var30 >= var32 - 75 && var30 <= var32 + 75 && var31 >= var8 - 20 && var31 <= var8 + 20) {
											ScriptEvent.openURL("https://www.jagex.com/terms/privacy", true, false);
											class345.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
											class126.method2799(6);
											return;
										}

										var32 = Login.loginBoxX + 180 + 80;
										if (var4 == 1 && var30 >= var32 - 75 && var30 <= var32 + 75 && var31 >= var8 - 20 && var31 <= var8 + 20) {
											PcmPlayer.method755(true);
										}
									} else if (Login.loginIndex == 9) {
										var32 = Login.loginBoxX + 180;
										var8 = 311;
										if (class12.field61 == 84 || class12.field61 == 13 || var4 == 1 && var30 >= var32 - 75 && var30 <= var32 + 75 && var31 >= var8 - 20 && var31 <= var8 + 20) {
											WorldMapData_1.method4706(false);
										}
									} else if (Login.loginIndex == 10) {
										var32 = Login.loginBoxX + 180;
										var8 = 209;
										if (class12.field61 == 84 || var4 == 1 && var30 >= var32 - 109 && var30 <= var32 + 109 && var31 >= var8 && var31 <= var8 + 68) {
											class345.setLoginResponseString("", "Connecting to server...", "");
											Client.field517 = class443.field4730;
											ObjectSound.method1730(false);
											PendingSpawn.updateGameState(20);
										}
									} else if (Login.loginIndex == 12) {
										var32 = Decimator.loginBoxCenter;
										var8 = 233;
										Bounds var26 = var1.method6219(0, 30, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var32, var8);
										Bounds var21 = var1.method6219(32, 32, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var32, var8);
										Bounds var22 = var1.method6219(70, 34, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var32, var8);
										var34 = var8 + 17;
										Bounds var24 = var1.method6219(0, 34, "<col=ffd200>agreement (EULA)</col>.", var32, var34);
										if (var4 == 1) {
											if (var26.method6742(var30, var31)) {
												ScriptEvent.openURL("https://www.jagex.com/terms", true, false);
											} else if (var21.method6742(var30, var31)) {
												ScriptEvent.openURL("https://www.jagex.com/terms/privacy", true, false);
											} else if (var22.method6742(var30, var31) || var24.method6742(var30, var31)) {
												ScriptEvent.openURL("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
											}
										}

										var32 = Decimator.loginBoxCenter - 80;
										var8 = 311;
										if (var4 == 1 && var30 >= var32 - 75 && var30 <= var32 + 75 && var31 >= var8 - 20 && var31 <= var8 + 20) {
											class12.clientPreferences.method2306(Client.field484);
											WorldMapData_1.method4706(true);
										}

										var32 = Decimator.loginBoxCenter + 80;
										if (var4 == 1 && var30 >= var32 - 75 && var30 <= var32 + 75 && var31 >= var8 - 20 && var31 <= var8 + 20) {
											Login.loginIndex = 13;
										}
									} else if (Login.loginIndex == 13) {
										var32 = Decimator.loginBoxCenter;
										var8 = 321;
										if (var4 == 1 && var30 >= var32 - 75 && var30 <= var32 + 75 && var31 >= var8 - 20 && var31 <= var8 + 20) {
											WorldMapData_1.method4706(true);
										}
									} else if (Login.loginIndex == 14) {
										String var27 = "";
										switch(Login.field887) {
										case 0:
											var27 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
											break;
										case 1:
											var27 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
											break;
										default:
											PcmPlayer.method755(false);
										}

										var34 = Login.loginBoxX + 180;
										var35 = 276;
										if (var4 == 1 && var30 >= var34 - 75 && var30 <= var34 + 75 && var31 >= var35 - 20 && var31 <= var35 + 20) {
											ScriptEvent.openURL(var27, true, false);
											class345.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
											class126.method2799(6);
											return;
										}

										var34 = Login.loginBoxX + 180;
										var35 = 326;
										if (var4 == 1 && var30 >= var34 - 75 && var30 <= var34 + 75 && var31 >= var35 - 20 && var31 <= var35 + 20) {
											PcmPlayer.method755(false);
										}
									} else if (Login.loginIndex == 24) {
										var32 = Login.loginBoxX + 180;
										var8 = 301;
										if (var4 == 1 && var30 >= var32 - 75 && var30 <= var32 + 75 && var31 >= var8 - 20 && var31 <= var8 + 20) {
											WorldMapData_1.method4706(false);
										}
									} else if (Login.loginIndex == 26) {
										var32 = Login.loginBoxX + 180 - 80;
										var8 = 321;
										if (var4 == 1 && var30 >= var32 - 75 && var30 <= var32 + 75 && var31 >= var8 - 20 && var31 <= var8 + 20) {
											ScriptEvent.openURL(WorldMapData_1.method4707("secure", true) + "m=dob/set_dob.ws", true, false);
											class345.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
											class126.method2799(6);
											return;
										}

										var32 = Login.loginBoxX + 180 + 80;
										if (var4 == 1 && var30 >= var32 - 75 && var30 <= var32 + 75 && var31 >= var8 - 20 && var31 <= var8 + 20) {
											PcmPlayer.method755(true);
										}
									}
								} else {
									while (true) {
										do {
											if (!TaskHandler.isKeyDown()) {
												var33 = 321;
												if (var4 == 1 && var31 >= var33 - 20 && var31 <= var33 + 20) {
													PcmPlayer.method755(true);
												}

												return;
											}
										} while(class12.field61 != 84 && class12.field61 != 13);

										PcmPlayer.method755(true);
									}
								}
							}
						}
					}

				}
			}
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "412461879"
	)
	public static final void method2865(int var0, int var1) {
		ViewportMouse.ViewportMouse_x = var0;
		ViewportMouse.ViewportMouse_y = var1;
		ViewportMouse.ViewportMouse_isInViewport = true;
		ViewportMouse.ViewportMouse_entityCount = 0;
		ViewportMouse.ViewportMouse_false0 = false;
	}

	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "748851559"
	)
	static int method2868() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
			int var0 = 0;

			for (int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) {
				var0 += ((ArchiveLoader)Client.archiveLoaders.get(var1)).loadedCount;
			}

			return var0 * 10000 / Client.field770;
		} else {
			return 10000;
		}
	}
}
