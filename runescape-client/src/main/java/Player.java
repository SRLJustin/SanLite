import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ca")
@Implements("Player")
public final class Player extends Actor {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lqv;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lkp;"
	)
	@Export("appearance")
	PlayerComposition appearance;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 207387843
	)
	@Export("headIconPk")
	int headIconPk;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -2136235279
	)
	@Export("headIconPrayer")
	int headIconPrayer;
	@ObfuscatedName("m")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1373676035
	)
	@Export("combatLevel")
	int combatLevel;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 216850049
	)
	@Export("skillLevel")
	int skillLevel;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -982635953
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 583621725
	)
	@Export("animationCycleStart")
	int animationCycleStart;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 171882853
	)
	@Export("animationCycleEnd")
	int animationCycleEnd;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1199422479
	)
	int field1104;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -776738565
	)
	@Export("tileHeight2")
	int tileHeight2;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -934008587
	)
	int field1106;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lhv;"
	)
	@Export("model0")
	Model model0;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1928979701
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1892949157
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 738468853
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -73932831
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("h")
	@Export("isUnanimated")
	boolean isUnanimated;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 98212949
	)
	@Export("team")
	int team;
	@ObfuscatedName("d")
	@Export("isHidden")
	boolean isHidden;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 2123212889
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1295799177
	)
	@Export("index")
	int index;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("isFriendTriBool")
	TriBool isFriendTriBool;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("isInFriendsChat")
	TriBool isInFriendsChat;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("isInClanChat")
	TriBool isInClanChat;
	@ObfuscatedName("ar")
	boolean field1095;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -634902129
	)
	@Export("tileX")
	int tileX;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 375783777
	)
	@Export("tileY")
	int tileY;

	Player() {
		this.headIconPk = -1;
		this.headIconPrayer = -1;
		this.actions = new String[3];

		for (int var1 = 0; var1 < 3; ++var1) {
			this.actions[var1] = "";
		}

		this.combatLevel = 0;
		this.skillLevel = 0;
		this.animationCycleStart = 0;
		this.animationCycleEnd = 0;
		this.isUnanimated = false;
		this.team = 0;
		this.isHidden = false;
		this.isFriendTriBool = TriBool.TriBool_unknown;
		this.isInFriendsChat = TriBool.TriBool_unknown;
		this.isInClanChat = TriBool.TriBool_unknown;
		this.field1095 = false;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)V",
		garbageValue = "261913950"
	)
	@Export("read")
	final void read(Buffer var1) {
		var1.offset = 0;
		int var2 = var1.readUnsignedByte();
		this.headIconPk = var1.readByte();
		this.headIconPrayer = var1.readByte();
		int var3 = -1;
		this.team = 0;
		int[] var4 = new int[12];

		int var6;
		int var7;
		int var8;
		for (int var5 = 0; var5 < 12; ++var5) {
			var6 = var1.readUnsignedByte();
			if (var6 == 0) {
				var4[var5] = 0;
			} else {
				var7 = var1.readUnsignedByte();
				var4[var5] = var7 + (var6 << 8);
				if (var5 == 0 && var4[0] == 65535) {
					var3 = var1.readUnsignedShort();
					break;
				}

				if (var4[var5] >= 512) {
					var8 = FileSystem.ItemDefinition_get(var4[var5] - 512).team;
					if (var8 != 0) {
						this.team = var8;
					}
				}
			}
		}

		int[] var11 = new int[5];

		for (var6 = 0; var6 < 5; ++var6) {
			var7 = var1.readUnsignedByte();
			if (var7 < 0 || var7 >= DesktopPlatformInfoProvider.field4469[var6].length) {
				var7 = 0;
			}

			var11[var6] = var7;
		}

		super.idleSequence = var1.readUnsignedShort();
		if (super.idleSequence == 65535) {
			super.idleSequence = -1;
		}

		super.turnLeftSequence = var1.readUnsignedShort();
		if (super.turnLeftSequence == 65535) {
			super.turnLeftSequence = -1;
		}

		super.turnRightSequence = super.turnLeftSequence;
		super.walkSequence = var1.readUnsignedShort();
		if (super.walkSequence == 65535) {
			super.walkSequence = -1;
		}

		super.walkBackSequence = var1.readUnsignedShort();
		if (super.walkBackSequence == 65535) {
			super.walkBackSequence = -1;
		}

		super.walkLeftSequence = var1.readUnsignedShort();
		if (super.walkLeftSequence == 65535) {
			super.walkLeftSequence = -1;
		}

		super.walkRightSequence = var1.readUnsignedShort();
		if (super.walkRightSequence == 65535) {
			super.walkRightSequence = -1;
		}

		super.runSequence = var1.readUnsignedShort();
		if (super.runSequence == 65535) {
			super.runSequence = -1;
		}

		this.username = new Username(var1.readStringCp1252NullTerminated(), class391.loginType);
		this.clearIsFriend();
		this.clearIsInFriendsChat();
		this.method2114();
		if (this == ModelData0.localPlayer) {
			RunException.localPlayerName = this.username.getName();
		}

		this.combatLevel = var1.readUnsignedByte();
		this.skillLevel = var1.readUnsignedShort();
		this.isHidden = var1.readUnsignedByte() == 1;
		if (Client.gameBuild == 0 && Client.staffModLevel >= 2) {
			this.isHidden = false;
		}

		class168[] var12 = null;
		boolean var13 = false;
		var8 = var1.readUnsignedShort();
		var13 = (var8 >> 15 & 1) == 1;
		int var9;
		if (var8 > 0 && var8 != 32768) {
			var12 = new class168[12];

			for (var9 = 0; var9 < 12; ++var9) {
				int var10 = var8 >> 12 - var9 & 1;
				if (var10 == 1) {
					var12[var9] = class127.method2807(var4[var9] - 512, var1);
				}
			}
		}

		if (var1.offset < var1.array.length) {
			for (var9 = 0; var9 < 3; ++var9) {
				this.actions[var9] = var1.readStringCp1252NullTerminated();
			}
		}

		if (this.appearance == null) {
			this.appearance = new PlayerComposition();
		}

		this.appearance.method5395(var4, var12, var13, var11, var2 == 1, var3);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Lhv;",
		garbageValue = "-238822980"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) {
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? class114.SequenceDefinition_get(super.sequence) : null;
			SequenceDefinition var2 = super.movementSequence != -1 && !this.isUnanimated && (super.idleSequence != super.movementSequence || var1 == null) ? class114.SequenceDefinition_get(super.movementSequence) : null;
			Model var3 = this.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame);
			if (var3 == null) {
				return null;
			} else {
				var3.calculateBoundsCylinder();
				super.defaultHeight = var3.height;
				Model var4;
				Model[] var5;
				if (!this.isUnanimated && super.spotAnimation != -1 && super.spotAnimationFrame != -1) {
					var4 = class136.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame);
					if (var4 != null) {
						var4.offsetBy(0, -super.field1151, 0);
						var5 = new Model[]{var3, var4};
						var3 = new Model(var5, 2);
					}
				}

				if (!this.isUnanimated && this.model0 != null) {
					if (Client.cycle >= this.animationCycleEnd) {
						this.model0 = null;
					}

					if (Client.cycle >= this.animationCycleStart && Client.cycle < this.animationCycleEnd) {
						var4 = this.model0;
						var4.offsetBy(this.field1104 * 4096 - super.x, this.tileHeight2 - this.tileHeight, this.field1106 * 4096 - super.y);
						if (super.orientation == 512) {
							var4.rotateY90Ccw();
							var4.rotateY90Ccw();
							var4.rotateY90Ccw();
						} else if (super.orientation == 1024) {
							var4.rotateY90Ccw();
							var4.rotateY90Ccw();
						} else if (super.orientation == 1536) {
							var4.rotateY90Ccw();
						}

						var5 = new Model[]{var3, var4};
						var3 = new Model(var5, 2);
						if (super.orientation == 512) {
							var4.rotateY90Ccw();
						} else if (super.orientation == 1024) {
							var4.rotateY90Ccw();
							var4.rotateY90Ccw();
						} else if (super.orientation == 1536) {
							var4.rotateY90Ccw();
							var4.rotateY90Ccw();
							var4.rotateY90Ccw();
						}

						var4.offsetBy(super.x - this.field1104 * 4096, this.tileHeight - this.tileHeight2, super.y - this.field1106 * 4096);
					}
				}

				var3.isSingleTile = true;
				if (super.field1140 != 0 && Client.cycle >= super.field1196 && Client.cycle < super.field1197) {
					var3.overrideHue = super.field1143;
					var3.overrideSaturation = super.field1199;
					var3.overrideLuminance = super.field1153;
					var3.overrideAmount = super.field1140;
				} else {
					var3.overrideAmount = 0;
				}

				return var3;
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1628986356"
	)
	@Export("isFriend")
	boolean isFriend() {
		if (this.isFriendTriBool == TriBool.TriBool_unknown) {
			this.checkIsFriend();
		}

		return this.isFriendTriBool == TriBool.TriBool_true;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.isFriendTriBool = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1844788103"
	)
	@Export("checkIsFriend")
	void checkIsFriend() {
		this.isFriendTriBool = BufferedSource.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1086408777"
	)
	@Export("isFriendsChatMember")
	boolean isFriendsChatMember() {
		if (this.isInFriendsChat == TriBool.TriBool_unknown) {
			this.updateIsInFriendsChat();
		}

		return this.isInFriendsChat == TriBool.TriBool_true;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-55"
	)
	@Export("clearIsInFriendsChat")
	void clearIsInFriendsChat() {
		this.isInFriendsChat = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "199387675"
	)
	@Export("updateIsInFriendsChat")
	void updateIsInFriendsChat() {
		this.isInFriendsChat = PcmPlayer.friendsChatManager != null && PcmPlayer.friendsChatManager.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1914658106"
	)
	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		for (int var1 = 0; var1 < 4; ++var1) {
			if (Client.currentClanSettings[var1] != null && Client.currentClanSettings[var1].method2884(this.username.getName()) != -1 && var1 != 2) {
				this.isInClanChat = TriBool.TriBool_true;
				return;
			}
		}

		this.isInClanChat = TriBool.TriBool_false;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1431876622"
	)
	void method2114() {
		this.isInClanChat = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1920996538"
	)
	@Export("isClanMember")
	boolean isClanMember() {
		if (this.isInClanChat == TriBool.TriBool_unknown) {
			this.updateIsInClanChat();
		}

		return this.isInClanChat == TriBool.TriBool_true;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1044591641"
	)
	@Export("transformedSize")
	int transformedSize() {
		return this.appearance != null && this.appearance.npcTransformId != -1 ? WorldMapSectionType.getNpcDefinition(this.appearance.npcTransformId).size : 1;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IILgd;I)V",
		garbageValue = "1708455011"
	)
	final void method2117(int var1, int var2, class193 var3) {
		if (super.sequence != -1 && class114.SequenceDefinition_get(super.sequence).field2206 == 1) {
			super.sequence = -1;
		}

		super.field1172 = -1;
		if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) {
			if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) {
				if (var3 == class193.field2248) {
					UrlRequester.method2540(this, var1, var2, class193.field2248);
				}

				this.method2119(var1, var2, var3);
			} else {
				this.resetPath(var1, var2);
			}
		} else {
			this.resetPath(var1, var2);
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2013717198"
	)
	@Export("resetPath")
	void resetPath(int var1, int var2) {
		super.pathLength = 0;
		super.field1200 = 0;
		super.field1194 = 0;
		super.pathX[0] = var1;
		super.pathY[0] = var2;
		int var3 = this.transformedSize();
		super.x = var3 * 64 + super.pathX[0] * 128;
		super.y = super.pathY[0] * 128 + var3 * 64;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IILgd;I)V",
		garbageValue = "4079166"
	)
	final void method2119(int var1, int var2, class193 var3) {
		if (super.pathLength < 9) {
			++super.pathLength;
		}

		for (int var4 = super.pathLength; var4 > 0; --var4) {
			super.pathX[var4] = super.pathX[var4 - 1];
			super.pathY[var4] = super.pathY[var4 - 1];
			super.pathTraversed[var4] = super.pathTraversed[var4 - 1];
		}

		super.pathX[0] = var1;
		super.pathY[0] = var2;
		super.pathTraversed[0] = var3;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-4"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lpc;B)V",
		garbageValue = "0"
	)
	@Export("updatePlayer")
	static final void updatePlayer(PacketBuffer var0) {
		var0.importIndex();
		int var1 = Client.localPlayerIndex;
		Player var2 = ModelData0.localPlayer = Client.players[var1] = new Player();
		var2.index = var1;
		int var3 = var0.readBits(30);
		byte var4 = (byte)(var3 >> 28);
		int var5 = var3 >> 14 & 16383;
		int var6 = var3 & 16383;
		var2.pathX[0] = var5 - SecureRandomCallable.baseX * 64;
		var2.x = (var2.pathX[0] << 7) + (var2.transformedSize() << 6);
		var2.pathY[0] = var6 - GrandExchangeOfferOwnWorldComparator.baseY * 64;
		var2.y = (var2.pathY[0] << 7) + (var2.transformedSize() << 6);
		class128.Client_plane = var2.plane = var4;
		if (Players.field1307[var1] != null) {
			var2.read(Players.field1307[var1]);
		}

		Players.Players_count = 0;
		Players.Players_indices[++Players.Players_count - 1] = var1;
		Players.field1301[var1] = 0;
		Players.Players_emptyIdxCount = 0;

		for (int var7 = 1; var7 < 2048; ++var7) {
			if (var7 != var1) {
				int var8 = var0.readBits(18);
				int var9 = var8 >> 16;
				int var10 = var8 >> 8 & 597;
				int var11 = var8 & 597;
				Players.Players_regions[var7] = (var10 << 14) + var11 + (var9 << 28);
				Players.Players_orientations[var7] = 0;
				Players.Players_targetIndices[var7] = -1;
				Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var7;
				Players.field1301[var7] = 0;
			}
		}

		var0.exportIndex();
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)[Lcs;",
		garbageValue = "-1603535940"
	)
	static class82[] method2159() {
		return new class82[]{class82.field1078, class82.field1073, class82.field1076, class82.field1075, class82.field1079};
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ILbb;ZB)I",
		garbageValue = "-86"
	)
	static int method2157(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = class92.getWidget(Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]);
		} else {
			var3 = var2 ? Interpreter.scriptDotWidget : KeyHandler.scriptActiveWidget;
		}

		String var4 = Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize];
		int[] var5 = null;
		if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
			int var6 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
			if (var6 > 0) {
				for (var5 = new int[var6]; var6-- > 0; var5[var6] = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]) {
				}
			}

			var4 = var4.substring(0, var4.length() - 1);
		}

		Object[] var8 = new Object[var4.length() + 1];

		int var7;
		for (var7 = var8.length - 1; var7 >= 1; --var7) {
			if (var4.charAt(var7 - 1) == 's') {
				var8[var7] = Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize];
			} else {
				var8[var7] = new Integer(Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]);
			}
		}

		var7 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
		if (var7 != -1) {
			var8[0] = new Integer(var7);
		} else {
			var8 = null;
		}

		if (var0 == ScriptOpcodes.CC_SETONCLICK) {
			var3.onClick = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONHOLD) {
			var3.onHold = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONRELEASE) {
			var3.onRelease = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEOVER) {
			var3.onMouseOver = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSELEAVE) {
			var3.onMouseLeave = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAG) {
			var3.onDrag = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETLEAVE) {
			var3.onTargetLeave = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONVARTRANSMIT) {
			var3.onVarTransmit = var8;
			var3.varTransmitTriggers = var5;
		} else if (var0 == ScriptOpcodes.CC_SETONTIMER) {
			var3.onTimer = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONOP) {
			var3.onOp = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAGCOMPLETE) {
			var3.onDragComplete = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLICKREPEAT) {
			var3.onClickRepeat = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEREPEAT) {
			var3.onMouseRepeat = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONINVTRANSMIT) {
			var3.onInvTransmit = var8;
			var3.invTransmitTriggers = var5;
		} else if (var0 == ScriptOpcodes.CC_SETONSTATTRANSMIT) {
			var3.onStatTransmit = var8;
			var3.statTransmitTriggers = var5;
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETENTER) {
			var3.onTargetEnter = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSCROLLWHEEL) {
			var3.onScroll = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCHATTRANSMIT) {
			var3.onChatTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONKEY) {
			var3.onKey = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONFRIENDTRANSMIT) {
			var3.onFriendTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANTRANSMIT) {
			var3.onClanTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMISCTRANSMIT) {
			var3.onMiscTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDIALOGABORT) {
			var3.onDialogAbort = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSUBCHANGE) {
			var3.onSubChange = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSTOCKTRANSMIT) {
			var3.onStockTransmit = var8;
		} else if (var0 == 1426) {
			var3.field3520 = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONRESIZE) {
			var3.onResize = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANSETTINGSTRANSMIT) {
			var3.field3513 = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANCHANNELTRANSMIT) {
			var3.field3456 = var8;
		} else if (var0 == 1430) {
			var3.field3443 = var8;
		} else if (var0 == 1431) {
			var3.field3510 = var8;
		} else {
			if (var0 != 1434) {
				return 2;
			}

			var3.field3460 = var8;
		}

		var3.hasListener = true;
		return 1;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2538543"
	)
	static void method2135() {
		if (ClientPreferences.loadWorlds()) {
			Login.worldSelectOpen = true;
			Login.worldSelectPage = 0;
			Login.worldSelectPagesCount = 0;
		}

	}
}
