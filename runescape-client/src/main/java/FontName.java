import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("pi")
@Implements("FontName")
public class FontName {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("FontName_plain11")
	public static final FontName FontName_plain11;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("FontName_plain12")
	public static final FontName FontName_plain12;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("FontName_bold12")
	public static final FontName FontName_bold12;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("FontName_verdana11")
	public static final FontName FontName_verdana11;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("FontName_verdana13")
	public static final FontName FontName_verdana13;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("FontName_verdana15")
	public static final FontName FontName_verdana15;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lek;"
	)
	static ClanSettings field4583;
	@ObfuscatedName("mm")
	@ObfuscatedGetter(
		intValue = 957028551
	)
	@Export("menuY")
	static int menuY;
	@ObfuscatedName("p")
	@Export("name")
	String name;

	static {
		FontName_plain11 = new FontName("p11_full");
		FontName_plain12 = new FontName("p12_full");
		FontName_bold12 = new FontName("b12_full");
		FontName_verdana11 = new FontName("verdana_11pt_regular");
		FontName_verdana13 = new FontName("verdana_13pt_regular");
		FontName_verdana15 = new FontName("verdana_15pt_regular");
	}

	FontName(String var1) {
		this.name = var1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2051101893"
	)
	static void method7230(int var0) {
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)[Lpi;",
		garbageValue = "-1328353728"
	)
	public static FontName[] method7232() {
		return new FontName[]{FontName_plain11, FontName_verdana13, FontName_bold12, FontName_verdana15, FontName_verdana11, FontName_plain12};
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "25"
	)
	public static int method7228(int var0) {
		--var0;
		var0 |= var0 >>> 1;
		var0 |= var0 >>> 2;
		var0 |= var0 >>> 4;
		var0 |= var0 >>> 8;
		var0 |= var0 >>> 16;
		return var0 + 1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILbb;ZI)I",
		garbageValue = "2124893336"
	)
	static int method7231(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) {
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = Client.publicChatMode;
			return 1;
		} else if (var0 == ScriptOpcodes.CHAT_SETFILTER) {
			class12.Interpreter_intStackSize -= 3;
			Client.publicChatMode = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize];
			class21.privateChatMode = class116.method2686(Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]);
			if (class21.privateChatMode == null) {
				class21.privateChatMode = PrivateChatMode.field4794;
			}

			Client.tradeChatMode = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 2];
			PacketBufferNode var13 = DecorativeObject.getPacketBufferNode(ClientPacket.field3052, Client.packetWriter.isaacCipher);
			var13.packetBuffer.writeByte(Client.publicChatMode);
			var13.packetBuffer.writeByte(class21.privateChatMode.field4796);
			var13.packetBuffer.writeByte(Client.tradeChatMode);
			Client.packetWriter.addNode(var13);
			return 1;
		} else {
			PacketBufferNode var6;
			int var7;
			String var8;
			int var9;
			if (var0 == ScriptOpcodes.CHAT_SENDABUSEREPORT) {
				var8 = Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize];
				class12.Interpreter_intStackSize -= 2;
				var7 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize];
				var9 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1];
				var6 = DecorativeObject.getPacketBufferNode(ClientPacket.field3039, Client.packetWriter.isaacCipher);
				var6.packetBuffer.writeByte(class392.stringCp1252NullTerminatedByteSize(var8) + 2);
				var6.packetBuffer.writeStringCp1252NullTerminated(var8);
				var6.packetBuffer.writeByte(var7 - 1);
				var6.packetBuffer.writeByte(var9);
				Client.packetWriter.addNode(var6);
				return 1;
			} else {
				int var3;
				Message var5;
				if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE) {
					class12.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize];
					var7 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1];
					var5 = class175.Messages_getByChannelAndID(var3, var7);
					if (var5 != null) {
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var5.count;
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var5.cycle;
						Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : "";
						Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : "";
						Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : "";
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0);
					} else {
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else {
					Message var4;
					if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID) {
						var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
						var4 = class12.Messages_getMessage(var3);
						if (var4 != null) {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var4.type;
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var4.cycle;
							Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : "";
							Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : "";
							Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : "";
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0);
						} else {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) {
						if (class21.privateChatMode == null) {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = class21.privateChatMode.field4796;
						}

						return 1;
					} else {
						PacketBufferNode var12;
						if (var0 == ScriptOpcodes.CHAT_SENDPUBLIC) {
							var8 = Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize];
							var7 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
							var12 = GrandExchangeOfferNameComparator.method5784(var7, var8, class263.clientLanguage, -1);
							Client.packetWriter.addNode(var12);
							return 1;
						} else if (var0 == ScriptOpcodes.CHAT_SENDPRIVATE) {
							class9.Interpreter_stringStackSize -= 2;
							var8 = Interpreter.Interpreter_stringStack[class9.Interpreter_stringStackSize];
							String var11 = Interpreter.Interpreter_stringStack[class9.Interpreter_stringStackSize + 1];
							var12 = DecorativeObject.getPacketBufferNode(ClientPacket.field2953, Client.packetWriter.isaacCipher);
							var12.packetBuffer.writeShort(0);
							int var10 = var12.packetBuffer.offset;
							var12.packetBuffer.writeStringCp1252NullTerminated(var8);
							Nameable.method6525(var12.packetBuffer, var11);
							var12.packetBuffer.writeLengthShort(var12.packetBuffer.offset - var10);
							Client.packetWriter.addNode(var12);
							return 1;
						} else if (var0 == ScriptOpcodes.CHAT_SENDCLAN) {
							var8 = Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize];
							class12.Interpreter_intStackSize -= 2;
							var7 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize];
							var9 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1];
							var6 = GrandExchangeOfferNameComparator.method5784(var7, var8, class263.clientLanguage, var9);
							Client.packetWriter.addNode(var6);
							return 1;
						} else if (var0 != ScriptOpcodes.CHAT_PLAYERNAME) {
							if (var0 == ScriptOpcodes.CHAT_GETFILTER_TRADE) {
								Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = Client.tradeChatMode;
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYLENGTH) {
								var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = class92.Messages_getHistorySize(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETNEXTUID) {
								var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = class4.Messages_getLastChatID(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETPREVUID) {
								var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = PendingSpawn.method2163(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.DOCHEAT) {
								var8 = Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize];
								UrlRequester.doCheat(var8);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_SETMESSAGEFILTER) {
								Client.field549 = Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize].toLowerCase().trim();
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETMESSAGEFILTER) {
								Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = Client.field549;
								return 1;
							} else if (var0 == ScriptOpcodes.WRITECONSOLE) {
								var8 = Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize];
								System.out.println(var8);
								return 1;
							} else if (var0 == 5024) {
								--class12.Interpreter_intStackSize;
								return 1;
							} else if (var0 == 5025) {
								++class12.Interpreter_intStackSize;
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYTYPEANDLINE) {
								class12.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize];
								var7 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1];
								var5 = class175.Messages_getByChannelAndID(var3, var7);
								if (var5 != null) {
									Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var5.count;
									Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var5.cycle;
									Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : "";
									Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : "";
									Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : "";
									Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0);
									Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
								} else {
									Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1;
									Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
								}

								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYUID) {
								var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
								var4 = class12.Messages_getMessage(var3);
								if (var4 != null) {
									Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var4.type;
									Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var4.cycle;
									Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : "";
									Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : "";
									Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : "";
									Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0);
									Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
								} else {
									Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1;
									Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
								}

								return 1;
							} else {
								return 2;
							}
						} else {
							if (ModelData0.localPlayer != null && ModelData0.localPlayer.username != null) {
								var8 = ModelData0.localPlayer.username.getName();
							} else {
								var8 = "";
							}

							Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var8;
							return 1;
						}
					}
				}
			}
		}
	}
}
