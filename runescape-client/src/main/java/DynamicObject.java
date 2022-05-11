import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bm")
@Implements("DynamicObject")
public class DynamicObject extends Renderable {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 393913769
	)
	@Export("id")
	int id;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 992153197
	)
	@Export("type")
	int type;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 849198695
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 2111003401
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1849101915
	)
	@Export("x")
	int x;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1844772961
	)
	@Export("y")
	int y;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lgq;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1649346091
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1098148309
	)
	@Export("cycleStart")
	int cycleStart;

	@ObfuscatedSignature(
		descriptor = "(IIIIIIIZLgx;)V"
	)
	DynamicObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, Renderable var9) {
		this.id = var1;
		this.type = var2;
		this.orientation = var3;
		this.plane = var4;
		this.x = var5;
		this.y = var6;
		if (var7 != -1) {
			this.sequenceDefinition = class114.SequenceDefinition_get(var7);
			this.frame = 0;
			this.cycleStart = Client.cycle - 1;
			if (this.sequenceDefinition.field2208 == 0 && var9 != null && var9 instanceof DynamicObject) {
				DynamicObject var10 = (DynamicObject)var9;
				if (this.sequenceDefinition == var10.sequenceDefinition) {
					this.frame = var10.frame;
					this.cycleStart = var10.cycleStart;
					return;
				}
			}

			if (var8 && this.sequenceDefinition.frameCount != -1) {
				if (!this.sequenceDefinition.method3712()) {
					this.frame = (int)(Math.random() * (double)this.sequenceDefinition.frameIds.length);
					this.cycleStart -= (int)(Math.random() * (double)this.sequenceDefinition.frameLengths[this.frame]);
				} else {
					this.frame = (int)(Math.random() * (double)this.sequenceDefinition.method3729());
				}
			}
		}

	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Lhv;",
		garbageValue = "-238822980"
	)
	@Export("getModel")
	protected final Model getModel() {
		int var2;
		if (this.sequenceDefinition != null) {
			int var1 = Client.cycle - this.cycleStart;
			if (var1 > 100 && this.sequenceDefinition.frameCount > 0) {
				var1 = 100;
			}

			if (this.sequenceDefinition.method3712()) {
				var2 = this.sequenceDefinition.method3729();
				this.frame += var1;
				var1 = 0;
				if (this.frame >= var2) {
					this.frame = var2 - this.sequenceDefinition.frameCount;
					if (this.frame < 0 || this.frame > var2) {
						this.sequenceDefinition = null;
					}
				}
			} else {
				label81: {
					do {
						do {
							if (var1 <= this.sequenceDefinition.frameLengths[this.frame]) {
								break label81;
							}

							var1 -= this.sequenceDefinition.frameLengths[this.frame];
							++this.frame;
						} while(this.frame < this.sequenceDefinition.frameIds.length);

						this.frame -= this.sequenceDefinition.frameCount;
					} while(this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length);

					this.sequenceDefinition = null;
				}
			}

			this.cycleStart = Client.cycle - var1;
		}

		ObjectComposition var12 = class82.getObjectDefinition(this.id);
		if (var12.transforms != null) {
			var12 = var12.transform();
		}

		if (var12 == null) {
			return null;
		} else {
			int var3;
			if (this.orientation != 1 && this.orientation != 3) {
				var2 = var12.sizeX;
				var3 = var12.sizeY;
			} else {
				var2 = var12.sizeY;
				var3 = var12.sizeX;
			}

			int var4 = (var2 >> 1) + this.x;
			int var5 = (var2 + 1 >> 1) + this.x;
			int var6 = (var3 >> 1) + this.y;
			int var7 = (var3 + 1 >> 1) + this.y;
			int[][] var8 = Tiles.Tiles_heights[this.plane];
			int var9 = var8[var5][var7] + var8[var5][var6] + var8[var4][var6] + var8[var4][var7] >> 2;
			int var10 = (this.x << 7) + (var2 << 6);
			int var11 = (this.y << 7) + (var3 << 6);
			return var12.getModelDynamic(this.type, this.orientation, var8, var10, var9, var11, this.sequenceDefinition, this.frame);
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-1327477180"
	)
	public static int method1957(int var0, int var1, int var2) {
		int var3 = class147.method3000(var2 - var1 + 1);
		var3 <<= var1;
		return var0 & ~var3;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(ILbb;ZI)I",
		garbageValue = "2018004509"
	)
	static int method1963(int var0, Script var1, boolean var2) {
		String var7;
		if (var0 == ScriptOpcodes.MES) {
			var7 = Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize];
			WorldMapEvent.addGameMessage(0, "", var7);
			return 1;
		} else if (var0 == ScriptOpcodes.ANIM) {
			class12.Interpreter_intStackSize -= 2;
			JagexCache.performPlayerAnimation(ModelData0.localPlayer, Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]);
			return 1;
		} else if (var0 == ScriptOpcodes.IF_CLOSE) {
			if (!Interpreter.field833) {
				Interpreter.field835 = true;
			}

			return 1;
		} else {
			int var15;
			if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
				var7 = Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize];
				var15 = 0;
				if (NetFileRequest.isNumber(var7)) {
					var15 = class92.method2373(var7);
				}

				PacketBufferNode var13 = DecorativeObject.getPacketBufferNode(ClientPacket.field2972, Client.packetWriter.isaacCipher);
				var13.packetBuffer.writeInt(var15);
				Client.packetWriter.addNode(var13);
				return 1;
			} else {
				PacketBufferNode var11;
				if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize];
					var11 = DecorativeObject.getPacketBufferNode(ClientPacket.field3048, Client.packetWriter.isaacCipher);
					var11.packetBuffer.writeByte(var7.length() + 1);
					var11.packetBuffer.writeStringCp1252NullTerminated(var7);
					Client.packetWriter.addNode(var11);
					return 1;
				} else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize];
					var11 = DecorativeObject.getPacketBufferNode(ClientPacket.field3033, Client.packetWriter.isaacCipher);
					var11.packetBuffer.writeByte(var7.length() + 1);
					var11.packetBuffer.writeStringCp1252NullTerminated(var7);
					Client.packetWriter.addNode(var11);
					return 1;
				} else {
					String var4;
					int var10;
					if (var0 == ScriptOpcodes.OPPLAYER) {
						var10 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
						var4 = Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize];
						method1964(var10, var4);
						return 1;
					} else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
						class12.Interpreter_intStackSize -= 3;
						var10 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize];
						var15 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1];
						int var9 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 2];
						Widget var14 = class92.getWidget(var9);
						class10.clickWidget(var14, var10, var15);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
						class12.Interpreter_intStackSize -= 2;
						var10 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize];
						var15 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1];
						Widget var12 = var2 ? Interpreter.scriptDotWidget : KeyHandler.scriptActiveWidget;
						class10.clickWidget(var12, var10, var15);
						return 1;
					} else if (var0 == ScriptOpcodes.MOUSECAM) {
						Login.mouseCam = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = class12.clientPreferences.method2222() ? 1 : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
						class12.clientPreferences.method2219(Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1);
						return 1;
					} else if (var0 == ScriptOpcodes.OPENURL) {
						var7 = Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize];
						boolean var8 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1;
						ScriptEvent.openURL(var7, var8, false);
						return 1;
					} else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
						var10 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
						var11 = DecorativeObject.getPacketBufferNode(ClientPacket.field3017, Client.packetWriter.isaacCipher);
						var11.packetBuffer.writeShort(var10);
						Client.packetWriter.addNode(var11);
						return 1;
					} else if (var0 == ScriptOpcodes.BUG_REPORT) {
						var10 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
						class9.Interpreter_stringStackSize -= 2;
						var4 = Interpreter.Interpreter_stringStack[class9.Interpreter_stringStackSize];
						String var5 = Interpreter.Interpreter_stringStack[class9.Interpreter_stringStackSize + 1];
						if (var4.length() > 500) {
							return 1;
						} else if (var5.length() > 500) {
							return 1;
						} else {
							PacketBufferNode var6 = DecorativeObject.getPacketBufferNode(ClientPacket.field3044, Client.packetWriter.isaacCipher);
							var6.packetBuffer.writeShort(1 + class392.stringCp1252NullTerminatedByteSize(var4) + class392.stringCp1252NullTerminatedByteSize(var5));
							var6.packetBuffer.writeStringCp1252NullTerminated(var4);
							var6.packetBuffer.method7687(var10);
							var6.packetBuffer.writeStringCp1252NullTerminated(var5);
							Client.packetWriter.addNode(var6);
							return 1;
						}
					} else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
						Client.shiftClickDrop = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
						Client.showMouseOverText = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.RENDERSELF) {
						Client.renderSelf = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == 3120) {
						if (Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 1;
						} else {
							Client.drawPlayerNames &= -2;
						}

						return 1;
					} else if (var0 == 3121) {
						if (Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 2;
						} else {
							Client.drawPlayerNames &= -3;
						}

						return 1;
					} else if (var0 == 3122) {
						if (Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 4;
						} else {
							Client.drawPlayerNames &= -5;
						}

						return 1;
					} else if (var0 == 3123) {
						if (Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 8;
						} else {
							Client.drawPlayerNames &= -9;
						}

						return 1;
					} else if (var0 == 3124) {
						Client.drawPlayerNames = 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
						Client.showMouseCross = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
						Client.showLoadingMessages = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETTAPTODROP) {
						class33.setTapToDrop(Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1);
						return 1;
					} else if (var0 == ScriptOpcodes.GETTAPTODROP) {
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = DecorativeObject.getTapToDrop() ? 1 : 0;
						return 1;
					} else if (var0 == 3129) {
						class12.Interpreter_intStackSize -= 2;
						Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize];
						Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1];
						return 1;
					} else if (var0 == 3130) {
						class12.Interpreter_intStackSize -= 2;
						return 1;
					} else if (var0 == 3131) {
						--class12.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = GraphicsObject.canvasWidth;
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = class433.canvasHeight;
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
						--class12.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
						class12.Interpreter_intStackSize -= 2;
						return 1;
					} else if (var0 == 3136) {
						Client.field487 = 3;
						Client.field657 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
						return 1;
					} else if (var0 == 3137) {
						Client.field487 = 2;
						Client.field657 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
						return 1;
					} else if (var0 == 3138) {
						Client.field487 = 0;
						return 1;
					} else if (var0 == 3139) {
						Client.field487 = 1;
						return 1;
					} else if (var0 == 3140) {
						Client.field487 = 3;
						Client.field657 = var2 ? Interpreter.scriptDotWidget.id : KeyHandler.scriptActiveWidget.id;
						return 1;
					} else {
						boolean var3;
						if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
							var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1;
							class12.clientPreferences.method2223(var3);
							return 1;
						} else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = class12.clientPreferences.method2257() ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
							var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1;
							Client.Login_isUsernameRemembered = var3;
							if (!var3) {
								class12.clientPreferences.method2297("");
							}

							return 1;
						} else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.SHOW_IOS_REVIEW) {
							return 1;
						} else if (var0 == 3146) {
							var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1;
							class12.clientPreferences.method2305(!var3);
							return 1;
						} else if (var0 == 3147) {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = class12.clientPreferences.method2226() ? 0 : 1;
							return 1;
						} else if (var0 == 3148) {
							return 1;
						} else if (var0 == 3149) {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3150) {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3151) {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3152) {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3153) {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = Login.Login_loadingPercent;
							return 1;
						} else if (var0 == 3154) {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = class136.method2868();
							return 1;
						} else if (var0 == 3155) {
							--class9.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3156) {
							return 1;
						} else if (var0 == 3157) {
							class12.Interpreter_intStackSize -= 2;
							return 1;
						} else if (var0 == 3158) {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3159) {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3160) {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3161) {
							--class12.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3162) {
							--class12.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3163) {
							--class9.Interpreter_stringStackSize;
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3164) {
							--class12.Interpreter_intStackSize;
							Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = "";
							return 1;
						} else if (var0 == 3165) {
							--class12.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3166) {
							class12.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3167) {
							class12.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3168) {
							class12.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = "";
							return 1;
						} else if (var0 == 3169) {
							return 1;
						} else if (var0 == 3170) {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3171) {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3172) {
							--class12.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 3173) {
							--class12.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3174) {
							--class12.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 3175) {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3176) {
							return 1;
						} else if (var0 == 3177) {
							return 1;
						} else if (var0 == 3178) {
							--class9.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3179) {
							return 1;
						} else if (var0 == 3180) {
							--class9.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3181) {
							World.method1664(Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]);
							return 1;
						} else if (var0 == 3182) {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = GameBuild.method5586();
							return 1;
						} else if (var0 != 3183 && var0 != 3184) {
							if (var0 == 3187) {
								class9.Interpreter_stringStackSize -= 2;
								return 1;
							} else {
								return var0 == 3188 ? 1 : 2;
							}
						} else {
							--class12.Interpreter_intStackSize;
							return 1;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "424896925"
	)
	static void method1964(int var0, String var1) {
		int var2 = Players.Players_count;
		int[] var3 = Players.Players_indices;
		boolean var4 = false;
		Username var5 = new Username(var1, class391.loginType);

		for (int var6 = 0; var6 < var2; ++var6) {
			Player var7 = Client.players[var3[var6]];
			if (var7 != null && var7 != ModelData0.localPlayer && var7.username != null && var7.username.equals(var5)) {
				PacketBufferNode var8;
				if (var0 == 1) {
					var8 = DecorativeObject.getPacketBufferNode(ClientPacket.field2965, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeShort(var3[var6]);
					var8.packetBuffer.method7687(0);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 4) {
					var8 = DecorativeObject.getPacketBufferNode(ClientPacket.field2962, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeByte(0);
					var8.packetBuffer.method7641(var3[var6]);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 6) {
					var8 = DecorativeObject.getPacketBufferNode(ClientPacket.field2969, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method7641(var3[var6]);
					var8.packetBuffer.method7687(0);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 7) {
					var8 = DecorativeObject.getPacketBufferNode(ClientPacket.field2980, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method7596(0);
					var8.packetBuffer.method7641(var3[var6]);
					Client.packetWriter.addNode(var8);
				}

				var4 = true;
				break;
			}
		}

		if (!var4) {
			WorldMapEvent.addGameMessage(4, "", "Unable to find " + var1);
		}

	}
}
