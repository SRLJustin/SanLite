import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("al")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("rg")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	@Export("friendsChatManager")
	static FriendsChatManager friendsChatManager;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1724087219
	)
	public static int field300;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lai;"
	)
	@Export("pcmPlayerProvider")
	public static class47 pcmPlayerProvider;
	@ObfuscatedName("lg")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("textureProvider")
	static TextureProvider textureProvider;
	@ObfuscatedName("np")
	@ObfuscatedGetter(
		intValue = 2000163897
	)
	@Export("selectedItemSlot")
	static int selectedItemSlot;
	@ObfuscatedName("b")
	@Export("samples")
	protected int[] samples;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lao;"
	)
	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -340177369
	)
	int field284;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		longValue = 5049222240699791159L
	)
	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 579110347
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1078400585
	)
	int field287;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1185294269
	)
	int field288;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		longValue = 6299016637519592913L
	)
	long field289;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1779244015
	)
	int field294;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 757484531
	)
	int field282;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 15281057
	)
	int field292;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		longValue = -315826732775221247L
	)
	long field293;
	@ObfuscatedName("u")
	boolean field281;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1579013191
	)
	int field295;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Lao;"
	)
	PcmStream[] field296;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[Lao;"
	)
	PcmStream[] field297;

	protected PcmPlayer() {
		this.field284 = 32;
		this.timeMs = class113.method2624();
		this.field289 = 0L;
		this.field294 = 0;
		this.field282 = 0;
		this.field292 = 0;
		this.field293 = 0L;
		this.field281 = true;
		this.field295 = 0;
		this.field296 = new PcmStream[8];
		this.field297 = new PcmStream[8];
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-125708948"
	)
	@Export("init")
	protected void init() throws Exception {
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-30840"
	)
	@Export("open")
	protected void open(int var1) throws Exception {
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "181"
	)
	@Export("position")
	protected int position() throws Exception {
		return this.capacity;
	}

	@ObfuscatedName("k")
	@Export("write")
	protected void write() throws Exception {
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "25"
	)
	@Export("close")
	protected void close() {
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "207475579"
	)
	@Export("discard")
	protected void discard() throws Exception {
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lao;I)V",
		garbageValue = "1991751814"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "631128625"
	)
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) {
			long var1 = class113.method2624();

			try {
				if (this.field289 != 0L) {
					if (var1 < this.field289) {
						return;
					}

					this.open(this.capacity);
					this.field289 = 0L;
					this.field281 = true;
				}

				int var3 = this.position();
				if (this.field292 - var3 > this.field294) {
					this.field294 = this.field292 - var3;
				}

				int var4 = this.field287 + this.field288;
				if (var4 + 256 > 16384) {
					var4 = 16128;
				}

				if (var4 + 256 > this.capacity) {
					this.capacity += 1024;
					if (this.capacity > 16384) {
						this.capacity = 16384;
					}

					this.close();
					this.open(this.capacity);
					var3 = 0;
					this.field281 = true;
					if (var4 + 256 > this.capacity) {
						var4 = this.capacity - 256;
						this.field288 = var4 - this.field287;
					}
				}

				while (var3 < var4) {
					this.fill(this.samples, 256);
					this.write();
					var3 += 256;
				}

				if (var1 > this.field293) {
					if (!this.field281) {
						if (this.field294 == 0 && this.field282 == 0) {
							this.close();
							this.field289 = 2000L + var1;
							return;
						}

						this.field288 = Math.min(this.field282, this.field294);
						this.field282 = this.field294;
					} else {
						this.field281 = false;
					}

					this.field294 = 0;
					this.field293 = var1 + 2000L;
				}

				this.field292 = var3;
			} catch (Exception var7) {
				this.close();
				this.field289 = 2000L + var1;
			}

			try {
				if (var1 > this.timeMs + 500000L) {
					var1 = this.timeMs;
				}

				while (var1 > 5000L + this.timeMs) {
					this.skip(256);
					this.timeMs += (long)(256000 / field300);
				}
			} catch (Exception var6) {
				this.timeMs = var1;
			}

		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2012802257"
	)
	public final void method739() {
		this.field281 = true;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1905716699"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field281 = true;

		try {
			this.discard();
		} catch (Exception var2) {
			this.close();
			this.field289 = class113.method2624() + 2000L;
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "26"
	)
	@Export("shutdown")
	public final synchronized void shutdown() {
		if (MusicPatchPcmStream.soundSystem != null) {
			boolean var1 = true;

			for (int var2 = 0; var2 < 2; ++var2) {
				if (this == MusicPatchPcmStream.soundSystem.players[var2]) {
					MusicPatchPcmStream.soundSystem.players[var2] = null;
				}

				if (MusicPatchPcmStream.soundSystem.players[var2] != null) {
					var1 = false;
				}
			}

			if (var1) {
				InterfaceParent.soundSystemExecutor.shutdownNow();
				InterfaceParent.soundSystemExecutor = null;
				MusicPatchPcmStream.soundSystem = null;
			}
		}

		this.close();
		this.samples = null;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1357307630"
	)
	@Export("skip")
	final void skip(int var1) {
		this.field295 -= var1;
		if (this.field295 < 0) {
			this.field295 = 0;
		}

		if (this.stream != null) {
			this.stream.skip(var1);
		}

	}

	@ObfuscatedName("ac")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2;
		if (ArchiveDiskAction.PcmPlayer_stereo) {
			var3 = var2 << 1;
		}

		class351.clearIntArray(var1, 0, var3);
		this.field295 -= var2;
		if (this.stream != null && this.field295 <= 0) {
			this.field295 += field300 >> 4;
			World.PcmStream_disable(this.stream);
			this.method700(this.stream, this.stream.vmethod951());
			int var4 = 0;
			int var5 = 255;

			int var6;
			PcmStream var10;
			label108:
			for (var6 = 7; var5 != 0; --var6) {
				int var7;
				int var8;
				if (var6 < 0) {
					var7 = var6 & 3;
					var8 = -(var6 >> 2);
				} else {
					var7 = var6;
					var8 = 0;
				}

				for (int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) {
					if ((var9 & 1) != 0) {
						var5 &= ~(1 << var7);
						var10 = null;
						PcmStream var11 = this.field296[var7];

						label102:
						while (true) {
							while (true) {
								if (var11 == null) {
									break label102;
								}

								AbstractSound var12 = var11.sound;
								if (var12 != null && var12.position > var8) {
									var5 |= 1 << var7;
									var10 = var11;
									var11 = var11.after;
								} else {
									var11.active = true;
									int var13 = var11.vmethod5295();
									var4 += var13;
									if (var12 != null) {
										var12.position += var13;
									}

									if (var4 >= this.field284) {
										break label108;
									}

									PcmStream var14 = var11.firstSubStream();
									if (var14 != null) {
										for (int var15 = var11.field348; var14 != null; var14 = var11.nextSubStream()) {
											this.method700(var14, var15 * var14.vmethod951() >> 8);
										}
									}

									PcmStream var18 = var11.after;
									var11.after = null;
									if (var10 == null) {
										this.field296[var7] = var18;
									} else {
										var10.after = var18;
									}

									if (var18 == null) {
										this.field297[var7] = var10;
									}

									var11 = var18;
								}
							}
						}
					}

					var7 += 4;
					++var8;
				}
			}

			for (var6 = 0; var6 < 8; ++var6) {
				PcmStream var16 = this.field296[var6];
				PcmStream[] var17 = this.field296;
				this.field297[var6] = null;

				for (var17[var6] = null; var16 != null; var16 = var10) {
					var10 = var16.after;
					var16.after = null;
				}
			}
		}

		if (this.field295 < 0) {
			this.field295 = 0;
		}

		if (this.stream != null) {
			this.stream.fill(var1, 0, var2);
		}

		this.timeMs = class113.method2624();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lao;IB)V",
		garbageValue = "52"
	)
	final void method700(PcmStream var1, int var2) {
		int var3 = var2 >> 5;
		PcmStream var4 = this.field297[var3];
		if (var4 == null) {
			this.field296[var3] = var1;
		} else {
			var4.after = var1;
		}

		this.field297[var3] = var1;
		var1.field348 = var2;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-706080799"
	)
	public static int method744(int var0, int var1) {
		return (var0 << 8) + var1;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1739109574"
	)
	static void method753() {
		Tiles.Tiles_underlays = null;
		Tiles.Tiles_overlays = null;
		Tiles.Tiles_shapes = null;
		RunException.field4812 = null;
		VerticalAlignment.field1993 = null;
		NPC.field1259 = null;
		Interpreter.field839 = null;
		class154.Tiles_hue = null;
		MusicPatch.Tiles_saturation = null;
		DecorativeObject.Tiles_lightness = null;
		Tiles.Tiles_hueMultiplier = null;
		MenuAction.field866 = null;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "([BI)Lbb;",
		garbageValue = "1083812736"
	)
	@Export("newScript")
	static Script newScript(byte[] var0) {
		Script var1 = new Script();
		Buffer var2 = new Buffer(var0);
		var2.offset = var2.array.length - 2;
		int var3 = var2.readUnsignedShort();
		int var4 = var2.array.length - 2 - var3 - 12;
		var2.offset = var4;
		int var5 = var2.readInt();
		var1.localIntCount = var2.readUnsignedShort();
		var1.localStringCount = var2.readUnsignedShort();
		var1.intArgumentCount = var2.readUnsignedShort();
		var1.stringArgumentCount = var2.readUnsignedShort();
		int var6 = var2.readUnsignedByte();
		int var7;
		int var8;
		if (var6 > 0) {
			var1.switches = var1.newIterableNodeHashTable(var6);

			for (var7 = 0; var7 < var6; ++var7) {
				var8 = var2.readUnsignedShort();
				IterableNodeHashTable var9 = new IterableNodeHashTable(var8 > 0 ? FontName.method7228(var8) : 1);
				var1.switches[var7] = var9;

				while (var8-- > 0) {
					int var10 = var2.readInt();
					int var11 = var2.readInt();
					var9.put(new IntegerNode(var11), (long)var10);
				}
			}
		}

		var2.offset = 0;
		var1.field949 = var2.readStringCp1252NullTerminatedOrNull();
		var1.opcodes = new int[var5];
		var1.intOperands = new int[var5];
		var1.stringOperands = new String[var5];

		for (var7 = 0; var2.offset < var4; var1.opcodes[var7++] = var8) {
			var8 = var2.readUnsignedShort();
			if (var8 == 3) {
				var1.stringOperands[var7] = var2.readStringCp1252NullTerminated();
			} else if (var8 < 100 && var8 != 21 && var8 != 38 && var8 != 39) {
				var1.intOperands[var7] = var2.readInt();
			} else {
				var1.intOperands[var7] = var2.readUnsignedByte();
			}
		}

		return var1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIS)I",
		garbageValue = "12333"
	)
	static int method693(int var0, int var1) {
		for (int var2 = 0; var2 < 8; ++var2) {
			if (var1 <= var0 + 30) {
				return var2;
			}

			var0 += 30;
			var0 += var2 != 1 && var2 != 3 ? 5 : 20;
		}

		return 0;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1845671157"
	)
	public static void method757() {
		KitDefinition.KitDefinition_cached.clear();
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1912643787"
	)
	static void method755(boolean var0) {
		if (!class82.client.method1128() && !class82.client.method1520()) {
			Login.Login_response1 = "";
			Login.Login_response2 = "Enter your username/email & password.";
			Login.Login_response3 = "";
			class126.method2799(2);
			if (var0) {
				Login.Login_password = "";
			}

			if (Login.Login_username == null || Login.Login_username.length() <= 0) {
				if (class12.clientPreferences.method2241() != null) {
					Login.Login_username = class12.clientPreferences.method2241();
					Client.Login_isUsernameRemembered = true;
				} else {
					Client.Login_isUsernameRemembered = false;
				}
			}

			if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) {
				Login.currentLoginField = 1;
			} else {
				Login.currentLoginField = 0;
			}

		} else {
			class126.method2799(10);
		}
	}

	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "24"
	)
	@Export("getLoginError")
	static void getLoginError(int var0) {
		int var1 = Login.loginIndex;
		if (var0 == -3) {
			class345.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) {
			class345.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == -1) {
			class345.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) {
			class126.method2799(3);
			Login.field907 = 1;
		} else if (var0 == 4) {
			class400.method6957(0);
		} else if (var0 == 5) {
			Login.field907 = 2;
			class345.setLoginResponseString("Your account has not logged out from its last", "session or the server is too busy right now.", "Please try again in a few minutes.");
		} else if (var0 == 68 || !Client.onMobile && var0 == 6) {
			class345.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", "");
		} else if (var0 == 7) {
			class345.setLoginResponseString("This world is full.", "Please use a different world.", "");
		} else if (var0 == 8) {
			class345.setLoginResponseString("Unable to connect.", "Login server offline.", "");
		} else if (var0 == 9) {
			class345.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
		} else if (var0 == 10) {
			class345.setLoginResponseString("Unable to connect.", "Bad session id.", "");
		} else if (var0 == 11) {
			class345.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
		} else if (var0 == 12) {
			class345.setLoginResponseString("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
		} else if (var0 == 13) {
			class345.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
		} else if (var0 == 14) {
			class345.setLoginResponseString("The server is being updated.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 16) {
			class345.setLoginResponseString("Too many login attempts.", "Please wait a few minutes before trying again.", "");
		} else if (var0 == 17) {
			class345.setLoginResponseString("You are standing in a members-only area.", "To play on this world move to a free area first", "");
		} else if (var0 == 18) {
			class400.method6957(1);
		} else if (var0 == 19) {
			class345.setLoginResponseString("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
		} else if (var0 == 20) {
			class345.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
		} else if (var0 == 22) {
			class345.setLoginResponseString("Malformed login packet.", "Please try again.", "");
		} else if (var0 == 23) {
			class345.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 24) {
			class345.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
		} else if (var0 == 25) {
			class345.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
		} else if (var0 == 26) {
			class345.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
		} else if (var0 == 27) {
			class345.setLoginResponseString("", "Service unavailable.", "");
		} else if (var0 == 31) {
			class345.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
		} else if (var0 == 32) {
			class345.setLoginResponseString("Your attempt to log into your account was", "unsuccessful.  Don't worry, you can sort", "this out by visiting the billing system.");
		} else if (var0 == 37) {
			class345.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
		} else if (var0 == 38) {
			class345.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
		} else if (var0 == 55) {
			class126.method2799(8);
		} else {
			if (var0 == 56) {
				class345.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", "");
				PendingSpawn.updateGameState(11);
				return;
			}

			if (var0 == 57) {
				class345.setLoginResponseString("The code you entered was incorrect.", "Please try again.", "");
				PendingSpawn.updateGameState(11);
				return;
			}

			if (var0 == 61) {
				class345.setLoginResponseString("", "Please enter your date of birth (DD/MM/YYYY)", "");
				class126.method2799(7);
			} else {
				if (var0 == 62) {
					PendingSpawn.updateGameState(10);
					class126.method2799(9);
					class345.setLoginResponseString("Login attempt timed out.", "Please try again.", "");
					return;
				}

				if (var0 == 63) {
					PendingSpawn.updateGameState(10);
					class126.method2799(9);
					class345.setLoginResponseString("You were signed out.", "Please sign in again.", "");
					return;
				}

				if (var0 == 65 || var0 == 67) {
					PendingSpawn.updateGameState(10);
					class126.method2799(9);
					class345.setLoginResponseString("Failed to login.", "Please try again.", "");
					return;
				}

				if (var0 == 71) {
					PendingSpawn.updateGameState(10);
					class126.method2799(7);
					class345.setLoginResponseString("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
				} else if (var0 == 73) {
					PendingSpawn.updateGameState(10);
					class126.method2799(6);
					class345.setLoginResponseString("Your date of birth information is waiting", "to be reviewed by our staff.", "It will be processed shortly.");
				} else if (var0 == 72) {
					PendingSpawn.updateGameState(10);
					class126.method2799(26);
				} else {
					class345.setLoginResponseString("Unexpected server response", "Please try using a different world.", "");
				}
			}
		}

		PendingSpawn.updateGameState(10);
		int var4 = Login.loginIndex;
		boolean var5 = var4 != var1;
		if (!var5 && Client.field517.method7790()) {
			class126.method2799(9);
		}

	}

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(IIIILqr;Lka;I)V",
		garbageValue = "-1306286729"
	)
	@Export("drawSpriteOnMinimap")
	static final void drawSpriteOnMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		if (var4 != null) {
			int var6 = Client.camAngleY & 2047;
			int var7 = var3 * var3 + var2 * var2;
			if (var7 <= 6400) {
				int var8 = Rasterizer3D.Rasterizer3D_sine[var6];
				int var9 = Rasterizer3D.Rasterizer3D_cosine[var6];
				int var10 = var9 * var2 + var3 * var8 >> 16;
				int var11 = var3 * var9 - var8 * var2 >> 16;
				if (var7 > 2500) {
					var4.method7947(var10 + var5.width / 2 - var4.width / 2, var5.height / 2 - var11 - var4.height / 2, var0, var1, var5.width, var5.height, var5.xStarts, var5.xWidths);
				} else {
					var4.drawTransBgAt(var0 + var10 + var5.width / 2 - var4.width / 2, var5.height / 2 + var1 - var11 - var4.height / 2);
				}

			}
		}
	}
}
