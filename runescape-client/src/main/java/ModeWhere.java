import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lz")
@Implements("ModeWhere")
public enum ModeWhere implements MouseWheel {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	field4125("", 0, new class327[]{class327.field4109}),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	field4126("", 1, new class327[]{class327.field4108, class327.field4109}),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	field4127("", 2, new class327[]{class327.field4108, class327.field4110, class327.field4109}),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	field4130("", 3, new class327[]{class327.field4108}),
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	field4129("", 4),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	field4138("", 5, new class327[]{class327.field4108, class327.field4109}),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	field4131("", 6, new class327[]{class327.field4109}),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	field4132("", 8, new class327[]{class327.field4108, class327.field4109}),
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	field4128("", 9, new class327[]{class327.field4108, class327.field4110}),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	field4134("", 10, new class327[]{class327.field4108}),
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	field4135("", 11, new class327[]{class327.field4108}),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	field4136("", 12, new class327[]{class327.field4108, class327.field4109}),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	field4133("", 13, new class327[]{class327.field4108});

	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1167171757
	)
	@Export("id")
	final int id;
	@ObfuscatedName("t")
	final Set field4137;

	static {
		method5894();
	}

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I[Lls;)V"
	)
	ModeWhere(String var3, int var4, class327[] var5) {
		this.field4137 = new HashSet();
		this.id = var4;
		class327[] var6 = var5;

		for (int var7 = 0; var7 < var6.length; ++var7) {
			class327 var8 = var6[var7];
			this.field4137.add(var8);
		}

	}

	ModeWhere(String var3, int var4) {
		this.field4137 = new HashSet();
		this.id = var4;
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
		descriptor = "(I)[Llz;",
		garbageValue = "-298356237"
	)
	static ModeWhere[] method5894() {
		return new ModeWhere[]{field4126, field4138, field4127, field4130, field4129, field4136, field4133, field4132, field4128, field4135, field4134, field4131, field4125};
	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "1808500640"
	)
	@Export("menuAction")
	static final void menuAction(int var0, int var1, int var2, int var3, String var4, String var5, int var6, int var7) {
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		PacketBufferNode var8;
		if (var2 == 1) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = DecorativeObject.getPacketBufferNode(ClientPacket.field2981, Client.packetWriter.isaacCipher);
			var8.packetBuffer.writeInt(class20.selectedItemWidget);
			var8.packetBuffer.method7550(GrandExchangeOfferOwnWorldComparator.baseY * 64 + var1);
			var8.packetBuffer.method7551(SecureRandomCallable.baseX * 64 + var0);
			var8.packetBuffer.method7641(FloorUnderlayDefinition.selectedItemId);
			var8.packetBuffer.method7687(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.method7641(var3);
			var8.packetBuffer.method7550(PcmPlayer.selectedItemSlot);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 2) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = DecorativeObject.getPacketBufferNode(ClientPacket.field3057, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method7551(SecureRandomCallable.baseX * 64 + var0);
			var8.packetBuffer.writeShort(GrandExchangeOfferOwnWorldComparator.baseY * 64 + var1);
			var8.packetBuffer.method7551(Client.field651);
			var8.packetBuffer.method7551(Client.selectedSpellChildIndex);
			var8.packetBuffer.method7641(var3);
			var8.packetBuffer.method7687(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.method7564(ArchiveDiskActionHandler.selectedSpellWidget);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 3) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = DecorativeObject.getPacketBufferNode(ClientPacket.field2990, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method7596(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.method7550(var3);
			var8.packetBuffer.method7641(SecureRandomCallable.baseX * 64 + var0);
			var8.packetBuffer.method7551(GrandExchangeOfferOwnWorldComparator.baseY * 64 + var1);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 4) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = DecorativeObject.getPacketBufferNode(ClientPacket.field3049, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method7641(var3);
			var8.packetBuffer.method7596(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.method7550(GrandExchangeOfferOwnWorldComparator.baseY * 64 + var1);
			var8.packetBuffer.method7550(SecureRandomCallable.baseX * 64 + var0);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 5) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = DecorativeObject.getPacketBufferNode(ClientPacket.field3041, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method7641(GrandExchangeOfferOwnWorldComparator.baseY * 64 + var1);
			var8.packetBuffer.method7687(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.writeShort(SecureRandomCallable.baseX * 64 + var0);
			var8.packetBuffer.method7550(var3);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 6) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = DecorativeObject.getPacketBufferNode(ClientPacket.field2999, Client.packetWriter.isaacCipher);
			var8.packetBuffer.writeShort(var3);
			var8.packetBuffer.writeShort(GrandExchangeOfferOwnWorldComparator.baseY * 64 + var1);
			var8.packetBuffer.writeShort(SecureRandomCallable.baseX * 64 + var0);
			var8.packetBuffer.method7542(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			Client.packetWriter.addNode(var8);
		} else {
			PacketBufferNode var9;
			NPC var13;
			if (var2 == 7) {
				var13 = Client.npcs[var3];
				if (var13 != null) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var9 = DecorativeObject.getPacketBufferNode(ClientPacket.field2985, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method7596(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.writeShort(FloorUnderlayDefinition.selectedItemId);
					var9.packetBuffer.writeInt(class20.selectedItemWidget);
					var9.packetBuffer.writeShort(var3);
					var9.packetBuffer.writeShort(PcmPlayer.selectedItemSlot);
					Client.packetWriter.addNode(var9);
				}
			} else if (var2 == 8) {
				var13 = Client.npcs[var3];
				if (var13 != null) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var9 = DecorativeObject.getPacketBufferNode(ClientPacket.field2984, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method7641(var3);
					var9.packetBuffer.writeShort(Client.field651);
					var9.packetBuffer.method7542(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.method7551(Client.selectedSpellChildIndex);
					var9.packetBuffer.method7563(ArchiveDiskActionHandler.selectedSpellWidget);
					Client.packetWriter.addNode(var9);
				}
			} else if (var2 == 9) {
				var13 = Client.npcs[var3];
				if (var13 != null) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var9 = DecorativeObject.getPacketBufferNode(ClientPacket.field3004, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method7551(var3);
					var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					Client.packetWriter.addNode(var9);
				}
			} else if (var2 == 10) {
				var13 = Client.npcs[var3];
				if (var13 != null) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var9 = DecorativeObject.getPacketBufferNode(ClientPacket.field3030, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method7550(var3);
					var9.packetBuffer.method7542(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					Client.packetWriter.addNode(var9);
				}
			} else if (var2 == 11) {
				var13 = Client.npcs[var3];
				if (var13 != null) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var9 = DecorativeObject.getPacketBufferNode(ClientPacket.field3036, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method7542(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.method7641(var3);
					Client.packetWriter.addNode(var9);
				}
			} else if (var2 == 12) {
				var13 = Client.npcs[var3];
				if (var13 != null) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var9 = DecorativeObject.getPacketBufferNode(ClientPacket.field2977, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method7596(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.method7641(var3);
					Client.packetWriter.addNode(var9);
				}
			} else if (var2 == 13) {
				var13 = Client.npcs[var3];
				if (var13 != null) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var9 = DecorativeObject.getPacketBufferNode(ClientPacket.field3046, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method7550(var3);
					var9.packetBuffer.method7542(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					Client.packetWriter.addNode(var9);
				}
			} else {
				Player var15;
				if (var2 == 14) {
					var15 = Client.players[var3];
					if (var15 != null) {
						Client.mouseCrossX = var6;
						Client.mouseCrossY = var7;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var9 = DecorativeObject.getPacketBufferNode(ClientPacket.field3007, Client.packetWriter.isaacCipher);
						var9.packetBuffer.method7551(PcmPlayer.selectedItemSlot);
						var9.packetBuffer.method7641(var3);
						var9.packetBuffer.writeInt(class20.selectedItemWidget);
						var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
						var9.packetBuffer.method7641(FloorUnderlayDefinition.selectedItemId);
						Client.packetWriter.addNode(var9);
					}
				} else if (var2 == 15) {
					var15 = Client.players[var3];
					if (var15 != null) {
						Client.mouseCrossX = var6;
						Client.mouseCrossY = var7;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var9 = DecorativeObject.getPacketBufferNode(ClientPacket.field3022, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeInt(ArchiveDiskActionHandler.selectedSpellWidget);
						var9.packetBuffer.method7596(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
						var9.packetBuffer.method7550(Client.field651);
						var9.packetBuffer.writeShort(Client.selectedSpellChildIndex);
						var9.packetBuffer.method7641(var3);
						Client.packetWriter.addNode(var9);
					}
				} else if (var2 == 16) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = DecorativeObject.getPacketBufferNode(ClientPacket.field2996, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method7641(SecureRandomCallable.baseX * 64 + var0);
					var8.packetBuffer.method7550(GrandExchangeOfferOwnWorldComparator.baseY * 64 + var1);
					var8.packetBuffer.method7641(FloorUnderlayDefinition.selectedItemId);
					var8.packetBuffer.method7563(class20.selectedItemWidget);
					var8.packetBuffer.method7687(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method7641(PcmPlayer.selectedItemSlot);
					var8.packetBuffer.method7551(var3);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 17) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = DecorativeObject.getPacketBufferNode(ClientPacket.field3010, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method7551(Client.field651);
					var8.packetBuffer.method7641(Client.selectedSpellChildIndex);
					var8.packetBuffer.writeShort(var3);
					var8.packetBuffer.method7641(GrandExchangeOfferOwnWorldComparator.baseY * 64 + var1);
					var8.packetBuffer.writeInt(ArchiveDiskActionHandler.selectedSpellWidget);
					var8.packetBuffer.writeShort(SecureRandomCallable.baseX * 64 + var0);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 18) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = DecorativeObject.getPacketBufferNode(ClientPacket.field3013, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method7550(SecureRandomCallable.baseX * 64 + var0);
					var8.packetBuffer.method7551(var3);
					var8.packetBuffer.method7641(GrandExchangeOfferOwnWorldComparator.baseY * 64 + var1);
					var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 19) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = DecorativeObject.getPacketBufferNode(ClientPacket.field2987, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method7542(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method7550(SecureRandomCallable.baseX * 64 + var0);
					var8.packetBuffer.method7641(GrandExchangeOfferOwnWorldComparator.baseY * 64 + var1);
					var8.packetBuffer.method7551(var3);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 20) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = DecorativeObject.getPacketBufferNode(ClientPacket.field2997, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeShort(GrandExchangeOfferOwnWorldComparator.baseY * 64 + var1);
					var8.packetBuffer.method7596(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method7551(SecureRandomCallable.baseX * 64 + var0);
					var8.packetBuffer.method7641(var3);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 21) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = DecorativeObject.getPacketBufferNode(ClientPacket.field2976, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method7596(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method7550(SecureRandomCallable.baseX * 64 + var0);
					var8.packetBuffer.writeShort(var3);
					var8.packetBuffer.writeShort(GrandExchangeOfferOwnWorldComparator.baseY * 64 + var1);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 22) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = DecorativeObject.getPacketBufferNode(ClientPacket.field2978, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method7687(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method7550(var3);
					var8.packetBuffer.method7551(GrandExchangeOfferOwnWorldComparator.baseY * 64 + var1);
					var8.packetBuffer.method7641(SecureRandomCallable.baseX * 64 + var0);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 23) {
					if (Client.isMenuOpen) {
						class175.scene.setViewportWalking();
					} else {
						class175.scene.menuOpen(class128.Client_plane, var0, var1, true);
					}
				} else {
					PacketBufferNode var11;
					Widget var16;
					if (var2 == 24) {
						var16 = class92.getWidget(var1);
						if (var16 != null) {
							boolean var12 = true;
							if (var16.contentType > 0) {
								var12 = ReflectionCheck.method599(var16);
							}

							if (var12) {
								var11 = DecorativeObject.getPacketBufferNode(ClientPacket.field3014, Client.packetWriter.isaacCipher);
								var11.packetBuffer.writeInt(var1);
								Client.packetWriter.addNode(var11);
							}
						}
					} else {
						if (var2 == 25) {
							var16 = ApproximateRouteStrategy.getWidgetChild(var1, var0);
							if (var16 != null) {
								MusicPatchNode2.Widget_runOnTargetLeave();
								class93.selectSpell(var1, var0, WorldMapSection1.Widget_unpackTargetMask(UrlRequester.getWidgetFlags(var16)), var16.itemId);
								Client.isItemSelected = 0;
								Client.selectedSpellActionName = TriBool.Widget_getSpellActionName(var16);
								if (Client.selectedSpellActionName == null) {
									Client.selectedSpellActionName = "null";
								}

								if (var16.isIf3) {
									Client.selectedSpellName = var16.dataText + class166.colorStartTag(16777215);
								} else {
									Client.selectedSpellName = class166.colorStartTag(65280) + var16.spellName + class166.colorStartTag(16777215);
								}
							}

							return;
						}

						if (var2 == 26) {
							Varps.method5366();
						} else {
							int var10;
							Widget var14;
							if (var2 == 28) {
								var8 = DecorativeObject.getPacketBufferNode(ClientPacket.field3014, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeInt(var1);
								Client.packetWriter.addNode(var8);
								var14 = class92.getWidget(var1);
								if (var14 != null && var14.cs1Instructions != null && var14.cs1Instructions[0][0] == 5) {
									var10 = var14.cs1Instructions[0][1];
									Varps.Varps_main[var10] = 1 - Varps.Varps_main[var10];
									class321.changeGameOptions(var10);
								}
							} else if (var2 == 29) {
								var8 = DecorativeObject.getPacketBufferNode(ClientPacket.field3014, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeInt(var1);
								Client.packetWriter.addNode(var8);
								var14 = class92.getWidget(var1);
								if (var14 != null && var14.cs1Instructions != null && var14.cs1Instructions[0][0] == 5) {
									var10 = var14.cs1Instructions[0][1];
									if (Varps.Varps_main[var10] != var14.cs1ComparisonValues[0]) {
										Varps.Varps_main[var10] = var14.cs1ComparisonValues[0];
										class321.changeGameOptions(var10);
									}
								}
							} else if (var2 == 30) {
								if (Client.meslayerContinueWidget == null) {
									Skills.resumePauseWidget(var1, var0);
									Client.meslayerContinueWidget = ApproximateRouteStrategy.getWidgetChild(var1, var0);
									GrandExchangeOfferTotalQuantityComparator.method5781(Client.meslayerContinueWidget);
								}
							} else if (var2 == 31) {
								var8 = DecorativeObject.getPacketBufferNode(ClientPacket.field2992, Client.packetWriter.isaacCipher);
								var8.packetBuffer.method7563(var1);
								var8.packetBuffer.method7550(var3);
								var8.packetBuffer.method7641(PcmPlayer.selectedItemSlot);
								var8.packetBuffer.method7565(class20.selectedItemWidget);
								var8.packetBuffer.method7550(var0);
								var8.packetBuffer.method7551(FloorUnderlayDefinition.selectedItemId);
								Client.packetWriter.addNode(var8);
								Client.field598 = 0;
								NPCComposition.field1991 = class92.getWidget(var1);
								Client.field599 = var0;
							} else if (var2 == 32) {
								var8 = DecorativeObject.getPacketBufferNode(ClientPacket.field3025, Client.packetWriter.isaacCipher);
								var8.packetBuffer.method7550(var0);
								var8.packetBuffer.writeShort(Client.selectedSpellChildIndex);
								var8.packetBuffer.method7564(var1);
								var8.packetBuffer.method7564(ArchiveDiskActionHandler.selectedSpellWidget);
								var8.packetBuffer.method7550(var3);
								Client.packetWriter.addNode(var8);
								Client.field598 = 0;
								NPCComposition.field1991 = class92.getWidget(var1);
								Client.field599 = var0;
							} else if (var2 == 33) {
								var8 = DecorativeObject.getPacketBufferNode(ClientPacket.field2971, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeShort(var0);
								var8.packetBuffer.writeShort(var3);
								var8.packetBuffer.method7564(var1);
								Client.packetWriter.addNode(var8);
								Client.field598 = 0;
								NPCComposition.field1991 = class92.getWidget(var1);
								Client.field599 = var0;
							} else if (var2 == 34) {
								var8 = DecorativeObject.getPacketBufferNode(ClientPacket.field3045, Client.packetWriter.isaacCipher);
								var8.packetBuffer.method7551(var3);
								var8.packetBuffer.writeInt(var1);
								var8.packetBuffer.method7641(var0);
								Client.packetWriter.addNode(var8);
								Client.field598 = 0;
								NPCComposition.field1991 = class92.getWidget(var1);
								Client.field599 = var0;
							} else if (var2 == 35) {
								var8 = DecorativeObject.getPacketBufferNode(ClientPacket.field3050, Client.packetWriter.isaacCipher);
								var8.packetBuffer.method7564(var1);
								var8.packetBuffer.method7551(var0);
								var8.packetBuffer.method7551(var3);
								Client.packetWriter.addNode(var8);
								Client.field598 = 0;
								NPCComposition.field1991 = class92.getWidget(var1);
								Client.field599 = var0;
							} else if (var2 == 36) {
								var8 = DecorativeObject.getPacketBufferNode(ClientPacket.field3028, Client.packetWriter.isaacCipher);
								var8.packetBuffer.method7641(var3);
								var8.packetBuffer.method7641(var0);
								var8.packetBuffer.writeInt(var1);
								Client.packetWriter.addNode(var8);
								Client.field598 = 0;
								NPCComposition.field1991 = class92.getWidget(var1);
								Client.field599 = var0;
							} else if (var2 == 37) {
								var8 = DecorativeObject.getPacketBufferNode(ClientPacket.field2979, Client.packetWriter.isaacCipher);
								var8.packetBuffer.method7550(var0);
								var8.packetBuffer.writeShort(var3);
								var8.packetBuffer.writeInt(var1);
								Client.packetWriter.addNode(var8);
								Client.field598 = 0;
								NPCComposition.field1991 = class92.getWidget(var1);
								Client.field599 = var0;
							} else {
								if (var2 == 38) {
									MusicPatchNode2.Widget_runOnTargetLeave();
									var16 = class92.getWidget(var1);
									Client.isItemSelected = 1;
									PcmPlayer.selectedItemSlot = var0;
									class20.selectedItemWidget = var1;
									FloorUnderlayDefinition.selectedItemId = var3;
									GrandExchangeOfferTotalQuantityComparator.method5781(var16);
									Client.selectedItemName = class166.colorStartTag(16748608) + FileSystem.ItemDefinition_get(var3).name + class166.colorStartTag(16777215);
									if (Client.selectedItemName == null) {
										Client.selectedItemName = "null";
									}

									return;
								}

								if (var2 == 39) {
									var8 = DecorativeObject.getPacketBufferNode(ClientPacket.field3024, Client.packetWriter.isaacCipher);
									var8.packetBuffer.writeShort(var3);
									var8.packetBuffer.method7551(var0);
									var8.packetBuffer.method7565(var1);
									Client.packetWriter.addNode(var8);
									Client.field598 = 0;
									NPCComposition.field1991 = class92.getWidget(var1);
									Client.field599 = var0;
								} else if (var2 == 40) {
									var8 = DecorativeObject.getPacketBufferNode(ClientPacket.field3008, Client.packetWriter.isaacCipher);
									var8.packetBuffer.method7551(var3);
									var8.packetBuffer.method7551(var0);
									var8.packetBuffer.method7565(var1);
									Client.packetWriter.addNode(var8);
									Client.field598 = 0;
									NPCComposition.field1991 = class92.getWidget(var1);
									Client.field599 = var0;
								} else if (var2 == 41) {
									var8 = DecorativeObject.getPacketBufferNode(ClientPacket.field3018, Client.packetWriter.isaacCipher);
									var8.packetBuffer.method7641(var0);
									var8.packetBuffer.method7551(var3);
									var8.packetBuffer.writeInt(var1);
									Client.packetWriter.addNode(var8);
									Client.field598 = 0;
									NPCComposition.field1991 = class92.getWidget(var1);
									Client.field599 = var0;
								} else if (var2 == 42) {
									var8 = DecorativeObject.getPacketBufferNode(ClientPacket.field2961, Client.packetWriter.isaacCipher);
									var8.packetBuffer.method7641(var0);
									var8.packetBuffer.method7563(var1);
									var8.packetBuffer.method7550(var3);
									Client.packetWriter.addNode(var8);
									Client.field598 = 0;
									NPCComposition.field1991 = class92.getWidget(var1);
									Client.field599 = var0;
								} else if (var2 == 43) {
									var8 = DecorativeObject.getPacketBufferNode(ClientPacket.field2966, Client.packetWriter.isaacCipher);
									var8.packetBuffer.method7641(var0);
									var8.packetBuffer.method7550(var3);
									var8.packetBuffer.writeInt(var1);
									Client.packetWriter.addNode(var8);
									Client.field598 = 0;
									NPCComposition.field1991 = class92.getWidget(var1);
									Client.field599 = var0;
								} else if (var2 == 44) {
									var15 = Client.players[var3];
									if (var15 != null) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var9 = DecorativeObject.getPacketBufferNode(ClientPacket.field2965, Client.packetWriter.isaacCipher);
										var9.packetBuffer.writeShort(var3);
										var9.packetBuffer.method7687(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										Client.packetWriter.addNode(var9);
									}
								} else if (var2 == 45) {
									var15 = Client.players[var3];
									if (var15 != null) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var9 = DecorativeObject.getPacketBufferNode(ClientPacket.field2975, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method7550(var3);
										var9.packetBuffer.method7542(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										Client.packetWriter.addNode(var9);
									}
								} else if (var2 == 46) {
									var15 = Client.players[var3];
									if (var15 != null) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var9 = DecorativeObject.getPacketBufferNode(ClientPacket.field3003, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method7596(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var9.packetBuffer.writeShort(var3);
										Client.packetWriter.addNode(var9);
									}
								} else if (var2 == 47) {
									var15 = Client.players[var3];
									if (var15 != null) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var9 = DecorativeObject.getPacketBufferNode(ClientPacket.field2962, Client.packetWriter.isaacCipher);
										var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var9.packetBuffer.method7641(var3);
										Client.packetWriter.addNode(var9);
									}
								} else if (var2 == 48) {
									var15 = Client.players[var3];
									if (var15 != null) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var9 = DecorativeObject.getPacketBufferNode(ClientPacket.field2995, Client.packetWriter.isaacCipher);
										var9.packetBuffer.writeShort(var3);
										var9.packetBuffer.method7596(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										Client.packetWriter.addNode(var9);
									}
								} else if (var2 == 49) {
									var15 = Client.players[var3];
									if (var15 != null) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var9 = DecorativeObject.getPacketBufferNode(ClientPacket.field2969, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method7641(var3);
										var9.packetBuffer.method7687(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										Client.packetWriter.addNode(var9);
									}
								} else if (var2 == 50) {
									var15 = Client.players[var3];
									if (var15 != null) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var9 = DecorativeObject.getPacketBufferNode(ClientPacket.field2980, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method7596(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var9.packetBuffer.method7641(var3);
										Client.packetWriter.addNode(var9);
									}
								} else if (var2 == 51) {
									var15 = Client.players[var3];
									if (var15 != null) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var9 = DecorativeObject.getPacketBufferNode(ClientPacket.field3019, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method7542(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var9.packetBuffer.method7641(var3);
										Client.packetWriter.addNode(var9);
									}
								} else {
									label655: {
										if (var2 != 57) {
											if (var2 == 58) {
												var16 = ApproximateRouteStrategy.getWidgetChild(var1, var0);
												if (var16 != null) {
													var9 = DecorativeObject.getPacketBufferNode(ClientPacket.field2963, Client.packetWriter.isaacCipher);
													var9.packetBuffer.method7565(ArchiveDiskActionHandler.selectedSpellWidget);
													var9.packetBuffer.method7563(var1);
													var9.packetBuffer.writeShort(var16.itemId);
													var9.packetBuffer.method7551(Client.selectedSpellChildIndex);
													var9.packetBuffer.method7550(var0);
													var9.packetBuffer.method7641(Client.field651);
													Client.packetWriter.addNode(var9);
												}
												break label655;
											}

											if (var2 == 1001) {
												Client.mouseCrossX = var6;
												Client.mouseCrossY = var7;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												Client.destinationX = var0;
												Client.destinationY = var1;
												var8 = DecorativeObject.getPacketBufferNode(ClientPacket.field2994, Client.packetWriter.isaacCipher);
												var8.packetBuffer.writeShort(GrandExchangeOfferOwnWorldComparator.baseY * 64 + var1);
												var8.packetBuffer.writeShort(var3);
												var8.packetBuffer.method7641(SecureRandomCallable.baseX * 64 + var0);
												var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
												Client.packetWriter.addNode(var8);
												break label655;
											}

											if (var2 == 1002) {
												Client.mouseCrossX = var6;
												Client.mouseCrossY = var7;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												var8 = DecorativeObject.getPacketBufferNode(ClientPacket.field2950, Client.packetWriter.isaacCipher);
												var8.packetBuffer.writeShort(var3);
												Client.packetWriter.addNode(var8);
												break label655;
											}

											if (var2 == 1003) {
												Client.mouseCrossX = var6;
												Client.mouseCrossY = var7;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												var13 = Client.npcs[var3];
												if (var13 != null) {
													NPCComposition var17 = var13.definition;
													if (var17.transforms != null) {
														var17 = var17.transform();
													}

													if (var17 != null) {
														var11 = DecorativeObject.getPacketBufferNode(ClientPacket.field3016, Client.packetWriter.isaacCipher);
														var11.packetBuffer.method7550(var17.id);
														Client.packetWriter.addNode(var11);
													}
												}
												break label655;
											}

											if (var2 == 1004) {
												Client.mouseCrossX = var6;
												Client.mouseCrossY = var7;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												var8 = DecorativeObject.getPacketBufferNode(ClientPacket.field2986, Client.packetWriter.isaacCipher);
												var8.packetBuffer.writeShort(var3);
												Client.packetWriter.addNode(var8);
												break label655;
											}

											if (var2 == 1005) {
												var16 = class92.getWidget(var1);
												if (var16 != null && var16.itemQuantities[var0] >= 100000) {
													WorldMapEvent.addGameMessage(27, "", var16.itemQuantities[var0] + " x " + FileSystem.ItemDefinition_get(var3).name);
												} else {
													var9 = DecorativeObject.getPacketBufferNode(ClientPacket.field2986, Client.packetWriter.isaacCipher);
													var9.packetBuffer.writeShort(var3);
													Client.packetWriter.addNode(var9);
												}

												Client.field598 = 0;
												NPCComposition.field1991 = class92.getWidget(var1);
												Client.field599 = var0;
												break label655;
											}

											if (var2 != 1007) {
												if (var2 == 1009 || var2 == 1008 || var2 == 1011 || var2 == 1010 || var2 == 1012) {
													ServerPacket.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1));
												}
												break label655;
											}
										}

										var16 = ApproximateRouteStrategy.getWidgetChild(var1, var0);
										if (var16 != null) {
											TaskHandler.widgetDefaultMenuAction(var3, var1, var0, var16.itemId, var5);
										}
									}
								}
							}
						}
					}
				}
			}
		}

		if (Client.isItemSelected != 0) {
			Client.isItemSelected = 0;
			GrandExchangeOfferTotalQuantityComparator.method5781(class92.getWidget(class20.selectedItemWidget));
		}

		if (Client.isSpellSelected) {
			MusicPatchNode2.Widget_runOnTargetLeave();
		}

		if (NPCComposition.field1991 != null && Client.field598 == 0) {
			GrandExchangeOfferTotalQuantityComparator.method5781(NPCComposition.field1991);
		}

	}
}
