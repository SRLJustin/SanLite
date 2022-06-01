import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("la")
@Implements("GrandExchangeOfferNameComparator")
final class GrandExchangeOfferNameComparator implements Comparator {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lln;Lln;I)I",
		garbageValue = "-271291039"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.getOfferName().compareTo(var2.getOfferName());
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Llq;II)Ljm;",
		garbageValue = "-1715525516"
	)
	public static PacketBufferNode method5784(int var0, String var1, Language var2, int var3) {
		PacketBufferNode var4 = DecorativeObject.getPacketBufferNode(ClientPacket.field2973, Client.packetWriter.isaacCipher);
		var4.packetBuffer.writeByte(0);
		int var5 = var4.packetBuffer.offset;
		var4.packetBuffer.writeByte(var0);
		String var6 = var1.toLowerCase();
		byte var7 = 0;
		if (var6.startsWith("yellow:")) {
			var7 = 0;
			var1 = var1.substring("yellow:".length());
		} else if (var6.startsWith("red:")) {
			var7 = 1;
			var1 = var1.substring("red:".length());
		} else if (var6.startsWith("green:")) {
			var7 = 2;
			var1 = var1.substring("green:".length());
		} else if (var6.startsWith("cyan:")) {
			var7 = 3;
			var1 = var1.substring("cyan:".length());
		} else if (var6.startsWith("purple:")) {
			var7 = 4;
			var1 = var1.substring("purple:".length());
		} else if (var6.startsWith("white:")) {
			var7 = 5;
			var1 = var1.substring("white:".length());
		} else if (var6.startsWith("flash1:")) {
			var7 = 6;
			var1 = var1.substring("flash1:".length());
		} else if (var6.startsWith("flash2:")) {
			var7 = 7;
			var1 = var1.substring("flash2:".length());
		} else if (var6.startsWith("flash3:")) {
			var7 = 8;
			var1 = var1.substring("flash3:".length());
		} else if (var6.startsWith("glow1:")) {
			var7 = 9;
			var1 = var1.substring("glow1:".length());
		} else if (var6.startsWith("glow2:")) {
			var7 = 10;
			var1 = var1.substring("glow2:".length());
		} else if (var6.startsWith("glow3:")) {
			var7 = 11;
			var1 = var1.substring("glow3:".length());
		} else if (var2 != Language.Language_EN) {
			if (var6.startsWith("yellow:")) {
				var7 = 0;
				var1 = var1.substring("yellow:".length());
			} else if (var6.startsWith("red:")) {
				var7 = 1;
				var1 = var1.substring("red:".length());
			} else if (var6.startsWith("green:")) {
				var7 = 2;
				var1 = var1.substring("green:".length());
			} else if (var6.startsWith("cyan:")) {
				var7 = 3;
				var1 = var1.substring("cyan:".length());
			} else if (var6.startsWith("purple:")) {
				var7 = 4;
				var1 = var1.substring("purple:".length());
			} else if (var6.startsWith("white:")) {
				var7 = 5;
				var1 = var1.substring("white:".length());
			} else if (var6.startsWith("flash1:")) {
				var7 = 6;
				var1 = var1.substring("flash1:".length());
			} else if (var6.startsWith("flash2:")) {
				var7 = 7;
				var1 = var1.substring("flash2:".length());
			} else if (var6.startsWith("flash3:")) {
				var7 = 8;
				var1 = var1.substring("flash3:".length());
			} else if (var6.startsWith("glow1:")) {
				var7 = 9;
				var1 = var1.substring("glow1:".length());
			} else if (var6.startsWith("glow2:")) {
				var7 = 10;
				var1 = var1.substring("glow2:".length());
			} else if (var6.startsWith("glow3:")) {
				var7 = 11;
				var1 = var1.substring("glow3:".length());
			}
		}

		var6 = var1.toLowerCase();
		byte var8 = 0;
		if (var6.startsWith("wave:")) {
			var8 = 1;
			var1 = var1.substring("wave:".length());
		} else if (var6.startsWith("wave2:")) {
			var8 = 2;
			var1 = var1.substring("wave2:".length());
		} else if (var6.startsWith("shake:")) {
			var8 = 3;
			var1 = var1.substring("shake:".length());
		} else if (var6.startsWith("scroll:")) {
			var8 = 4;
			var1 = var1.substring("scroll:".length());
		} else if (var6.startsWith("slide:")) {
			var8 = 5;
			var1 = var1.substring("slide:".length());
		} else if (var2 != Language.Language_EN) {
			if (var6.startsWith("wave:")) {
				var8 = 1;
				var1 = var1.substring("wave:".length());
			} else if (var6.startsWith("wave2:")) {
				var8 = 2;
				var1 = var1.substring("wave2:".length());
			} else if (var6.startsWith("shake:")) {
				var8 = 3;
				var1 = var1.substring("shake:".length());
			} else if (var6.startsWith("scroll:")) {
				var8 = 4;
				var1 = var1.substring("scroll:".length());
			} else if (var6.startsWith("slide:")) {
				var8 = 5;
				var1 = var1.substring("slide:".length());
			}
		}

		var4.packetBuffer.writeByte(var7);
		var4.packetBuffer.writeByte(var8);
		Nameable.method6525(var4.packetBuffer, var1);
		if (var0 == class296.field3552.rsOrdinal()) {
			var4.packetBuffer.writeByte(var3);
		}

		var4.packetBuffer.method7740(var4.packetBuffer.offset - var5);
		return var4;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(ILbb;ZI)I",
		garbageValue = "2032747937"
	)
	static int method5782(int var0, Script var1, boolean var2) {
		int var3 = -1;
		Widget var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
			var4 = class92.getWidget(var3);
		} else {
			var4 = var2 ? Interpreter.scriptDotWidget : KeyHandler.scriptActiveWidget;
		}

		if (var0 == ScriptOpcodes.CC_SETPOSITION) {
			class12.Interpreter_intStackSize -= 4;
			var4.rawX = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize];
			var4.rawY = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1];
			var4.xAlignment = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 2];
			var4.yAlignment = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 3];
			GrandExchangeOfferTotalQuantityComparator.method5781(var4);
			class82.client.alignWidget(var4);
			if (var3 != -1 && var4.type == 0) {
				UserComparator8.revalidateWidgetScroll(NetSocket.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETSIZE) {
			class12.Interpreter_intStackSize -= 4;
			var4.rawWidth = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize];
			var4.rawHeight = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1];
			var4.widthAlignment = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 2];
			var4.heightAlignment = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 3];
			GrandExchangeOfferTotalQuantityComparator.method5781(var4);
			class82.client.alignWidget(var4);
			if (var3 != -1 && var4.type == 0) {
				UserComparator8.revalidateWidgetScroll(NetSocket.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETHIDE) {
			boolean var5 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1;
			if (var5 != var4.isHidden) {
				var4.isHidden = var5;
				GrandExchangeOfferTotalQuantityComparator.method5781(var4);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOCLICKTHROUGH) {
			var4.noClickThrough = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) {
			var4.noScrollThrough = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lpc;ILca;IB)V",
		garbageValue = "98"
	)
	static final void method5786(PacketBuffer var0, int var1, Player var2, int var3) {
		byte var4 = class193.field2250.field2252;
		int var5;
		int var8;
		int var9;
		int var12;
		if ((var3 & 1) != 0) {
			var5 = var0.method7576();
			PlayerType var6 = (PlayerType)class291.findEnumerated(class118.PlayerType_values(), var0.readUnsignedByte());
			boolean var7 = var0.method7593() == 1;
			var8 = var0.method7545();
			var9 = var0.offset;
			if (var2.username != null && var2.appearance != null) {
				boolean var10 = false;
				if (var6.isUser && BufferedSource.friendSystem.isIgnored(var2.username)) {
					var10 = true;
				}

				if (!var10 && Client.field606 == 0 && !var2.isHidden) {
					Players.field1306.offset = 0;
					var0.method7569(Players.field1306.array, 0, var8);
					Players.field1306.offset = 0;
					String var11 = AbstractFont.escapeBrackets(WorldMapManager.method4679(LoginPacket.method5025(Players.field1306)));
					var2.overheadText = var11.trim();
					var2.overheadTextColor = var5 >> 8;
					var2.overheadTextEffect = var5 & 255;
					var2.overheadTextCyclesRemaining = 150;
					var2.isAutoChatting = var7;
					var2.field1198 = var2 != ModelData0.localPlayer && var6.isUser && "" != Client.field549 && var11.toLowerCase().indexOf(Client.field549) == -1;
					if (var6.isPrivileged) {
						var12 = var7 ? 91 : 1;
					} else {
						var12 = var7 ? 90 : 2;
					}

					if (var6.modIcon != -1) {
						WorldMapEvent.addGameMessage(var12, StudioGame.method5590(var6.modIcon) + var2.username.getName(), var11);
					} else {
						WorldMapEvent.addGameMessage(var12, var2.username.getName(), var11);
					}
				}
			}

			var0.offset = var9 + var8;
		}

		if ((var3 & 4) != 0) {
			var2.field1172 = var0.method7576();
			if (var2.pathLength == 0) {
				var2.orientation = var2.field1172;
				var2.field1172 = -1;
			}
		}

		if ((var3 & 16) != 0) {
			var5 = var0.method7593();
			byte[] var17 = new byte[var5];
			Buffer var13 = new Buffer(var17);
			var0.method7569(var17, 0, var5);
			Players.field1307[var1] = var13;
			var2.read(var13);
		}

		if ((var3 & 4096) != 0) {
			var2.spotAnimation = var0.method7576();
			var5 = var0.method7567();
			var2.field1151 = var5 >> 16;
			var2.field1185 = (var5 & 65535) + Client.cycle;
			var2.spotAnimationFrame = 0;
			var2.spotAnimationFrameCycle = 0;
			if (var2.field1185 > Client.cycle) {
				var2.spotAnimationFrame = -1;
			}

			if (var2.spotAnimation == 65535) {
				var2.spotAnimation = -1;
			}
		}

		if ((var3 & 2048) != 0) {
			class193[] var14 = Players.field1302;
			class193[] var21 = new class193[]{class193.field2248, class193.field2250, class193.field2249, class193.field2251};
			var14[var1] = (class193)class291.findEnumerated(var21, var0.method7549());
		}

		if ((var3 & 16384) != 0) {
			var2.field1187 = var0.method7547();
			var2.field1189 = var0.method7548();
			var2.field1188 = var0.method7548();
			var2.field1190 = var0.method7549();
			var2.field1191 = var0.readUnsignedShort() + Client.cycle;
			var2.field1192 = var0.method7554() + Client.cycle;
			var2.field1139 = var0.readUnsignedShort();
			if (var2.field1095) {
				var2.field1187 += var2.tileX;
				var2.field1189 += var2.tileY;
				var2.field1188 += var2.tileX;
				var2.field1190 += var2.tileY;
				var2.pathLength = 0;
			} else {
				var2.field1187 += var2.pathX[0];
				var2.field1189 += var2.pathY[0];
				var2.field1188 += var2.pathX[0];
				var2.field1190 += var2.pathY[0];
				var2.pathLength = 1;
			}

			var2.field1200 = 0;
		}

		if ((var3 & 1024) != 0) {
			var2.field1196 = Client.cycle + var0.method7576();
			var2.field1197 = Client.cycle + var0.readUnsignedShort();
			var2.field1143 = var0.method7547();
			var2.field1199 = var0.method7549();
			var2.field1153 = var0.method7548();
			var2.field1140 = (byte)var0.readUnsignedByte();
		}

		int var15;
		if ((var3 & 32) != 0) {
			var5 = var0.method7554();
			if (var5 == 65535) {
				var5 = -1;
			}

			var15 = var0.method7593();
			JagexCache.performPlayerAnimation(var2, var5, var15);
		}

		if ((var3 & 256) != 0) {
			var4 = var0.method7549();
		}

		if ((var3 & 128) != 0) {
			var2.targetIndex = var0.method7554();
			if (var2.targetIndex == 65535) {
				var2.targetIndex = -1;
			}
		}

		if ((var3 & 64) != 0) {
			var5 = var0.readUnsignedByte();
			int var16;
			int var19;
			int var20;
			if (var5 > 0) {
				for (var15 = 0; var15 < var5; ++var15) {
					var8 = -1;
					var9 = -1;
					var20 = -1;
					var19 = var0.readUShortSmart();
					if (var19 == 32767) {
						var19 = var0.readUShortSmart();
						var9 = var0.readUShortSmart();
						var8 = var0.readUShortSmart();
						var20 = var0.readUShortSmart();
					} else if (var19 != 32766) {
						var9 = var0.readUShortSmart();
					} else {
						var19 = -1;
					}

					var16 = var0.readUShortSmart();
					var2.addHitSplat(var19, var9, var8, var20, Client.cycle, var16);
				}
			}

			var15 = var0.method7546();
			if (var15 > 0) {
				for (var19 = 0; var19 < var15; ++var19) {
					var8 = var0.readUShortSmart();
					var9 = var0.readUShortSmart();
					if (var9 != 32767) {
						var20 = var0.readUShortSmart();
						var16 = var0.readUnsignedByte();
						var12 = var9 > 0 ? var0.method7593() : var16;
						var2.addHealthBar(var8, Client.cycle, var9, var20, var16, var12);
					} else {
						var2.removeHealthBar(var8);
					}
				}
			}
		}

		if ((var3 & 8192) != 0) {
			for (var5 = 0; var5 < 3; ++var5) {
				var2.actions[var5] = var0.readStringCp1252NullTerminated();
			}
		}

		if ((var3 & 8) != 0) {
			var2.overheadText = var0.readStringCp1252NullTerminated();
			if (var2.overheadText.charAt(0) == '~') {
				var2.overheadText = var2.overheadText.substring(1);
				WorldMapEvent.addGameMessage(2, var2.username.getName(), var2.overheadText);
			} else if (var2 == ModelData0.localPlayer) {
				WorldMapEvent.addGameMessage(2, var2.username.getName(), var2.overheadText);
			}

			var2.isAutoChatting = false;
			var2.overheadTextColor = 0;
			var2.overheadTextEffect = 0;
			var2.overheadTextCyclesRemaining = 150;
		}

		if (var2.field1095) {
			if (var4 == 127) {
				var2.resetPath(var2.tileX, var2.tileY);
			} else {
				class193 var22;
				if (var4 != class193.field2250.field2252) {
					class193[] var18 = new class193[]{class193.field2248, class193.field2250, class193.field2249, class193.field2251};
					var22 = (class193)class291.findEnumerated(var18, var4);
				} else {
					var22 = Players.field1302[var1];
				}

				var2.method2117(var2.tileX, var2.tileY, var22);
			}
		}

	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1233324510"
	)
	public static int method5790(int var0) {
		return class357.method6392(ViewportMouse.ViewportMouse_entityTags[var0]);
	}
}
