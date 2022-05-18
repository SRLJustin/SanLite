import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("y")
public class class10 {
	@ObfuscatedName("o")
	HttpsURLConnection field48;
	@ObfuscatedName("q")
	final Map field47;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	class399 field54;
	@ObfuscatedName("k")
	Map field50;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lv;"
	)
	final class9 field51;
	@ObfuscatedName("m")
	boolean field52;
	@ObfuscatedName("p")
	boolean field53;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -387471539
	)
	int field49;

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Lv;)V"
	)
	public class10(URL var1, class9 var2) throws IOException {
		this.field52 = false;
		this.field53 = false;
		this.field49 = 300000;
		if (!var2.method76()) {
			throw new UnsupportedEncodingException("Unsupported request method used " + var2.method67());
		} else {
			this.field48 = (HttpsURLConnection)var1.openConnection();
			this.field48.setSSLSocketFactory(new class15());
			this.field51 = var2;
			this.field47 = new HashMap();
			this.field50 = new HashMap();
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "94"
	)
	public void method78(String var1, String var2) {
		if (!this.field52) {
			this.field47.put(var1, var2);
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "1"
	)
	String method96() {
		ArrayList var1 = new ArrayList(this.field50.entrySet());
		Collections.sort(var1, new class18(this));
		StringBuilder var2 = new StringBuilder();
		Iterator var3 = var1.iterator();

		while (var3.hasNext()) {
			Entry var4 = (Entry)var3.next();
			if (var2.length() > 0) {
				var2.append(",");
			}

			var2.append(((class398)var4.getKey()).method6940());
			float var5 = (Float)var4.getValue();
			if (var5 < 1.0F) {
				String var6 = Float.toString(var5).substring(0, 4);
				var2.append(";q=" + var6);
			}
		}

		return var2.toString();
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-82433388"
	)
	void method80() throws ProtocolException {
		if (!this.field52) {
			this.field48.setRequestMethod(this.field51.method67());
			if (!this.field50.isEmpty()) {
				this.field47.put("Accept", this.method96());
			}

			Iterator var1 = this.field47.entrySet().iterator();

			while (var1.hasNext()) {
				Entry var2 = (Entry)var1.next();
				this.field48.setRequestProperty((String)var2.getKey(), (String)var2.getValue());
			}

			if (this.field51.method68() && this.field54 != null) {
				this.field48.setDoOutput(true);
				ByteArrayOutputStream var13 = new ByteArrayOutputStream();

				try {
					var13.write(this.field54.vmethod6962());
					var13.writeTo(this.field48.getOutputStream());
				} catch (IOException var11) {
					var11.printStackTrace();
				} finally {
					if (var13 != null) {
						try {
							var13.close();
						} catch (IOException var10) {
							var10.printStackTrace();
						}
					}

				}
			}

			this.field48.setConnectTimeout(this.field49);
			this.field48.setInstanceFollowRedirects(this.field53);
			this.field52 = true;
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1448695521"
	)
	boolean method79() throws IOException, SocketTimeoutException {
		if (!this.field52) {
			this.method80();
		}

		this.field48.connect();
		return this.field48.getResponseCode() == -1;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)Ld;",
		garbageValue = "-1"
	)
	class21 method82() {
		try {
			if (!this.field52 || this.field48.getResponseCode() == -1) {
				return new class21("No REST response has been received yet.");
			}
		} catch (IOException var10) {
			this.field48.disconnect();
			return new class21("Error decoding REST response code: " + var10.getMessage());
		}

		class21 var1 = null;

		class21 var3;
		try {
			var1 = new class21(this.field48);
			return var1;
		} catch (IOException var8) {
			var3 = new class21("Error decoding REST response: " + var8.getMessage());
		} finally {
			this.field48.disconnect();
		}

		return var3;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1726838595"
	)
	static void method87(int var0) {
		GrandExchangeOfferAgeComparator.field4072 = var0;
		class387.field4395 = new class387[var0];
		Frames.field2492 = 0;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lcr;IIB)V",
		garbageValue = "-15"
	)
	@Export("runScript")
	static void runScript(ScriptEvent var0, int var1, int var2) {
		Object[] var3 = var0.args;
		Script var4;
		int var20;
		if (class137.isWorldMapEvent(var0.type)) {
			class9.worldMapEvent = (WorldMapEvent)var3[0];
			WorldMapElement var5 = class120.WorldMapElement_get(class9.worldMapEvent.mapElement);
			var4 = GameObject.getWorldMapScript(var0.type, var5.objectId, var5.category);
		} else {
			var20 = (Integer)var3[0];
			var4 = class301.getScript(var20);
		}

		if (var4 != null) {
			class12.Interpreter_intStackSize = 0;
			class9.Interpreter_stringStackSize = 0;
			var20 = -1;
			int[] var6 = var4.opcodes;
			int[] var7 = var4.intOperands;
			byte var8 = -1;
			Interpreter.Interpreter_frameDepth = 0;
			Interpreter.field835 = false;
			boolean var9 = false;
			int var10 = 0;
			boolean var30 = false;

			label954: {
				label955: {
					try {
						int var13;
						try {
							var30 = true;
							class21.Interpreter_intLocals = new int[var4.localIntCount];
							int var11 = 0;
							class268.Interpreter_stringLocals = new String[var4.localStringCount];
							int var12 = 0;

							int var14;
							String var21;
							for (var13 = 1; var13 < var3.length; ++var13) {
								if (var3[var13] instanceof Integer) {
									var14 = (Integer)var3[var13];
									if (var14 == -2147483647) {
										var14 = var0.mouseX;
									}

									if (var14 == -2147483646) {
										var14 = var0.mouseY;
									}

									if (var14 == -2147483645) {
										var14 = var0.widget != null ? var0.widget.id : -1;
									}

									if (var14 == -2147483644) {
										var14 = var0.opIndex;
									}

									if (var14 == -2147483643) {
										var14 = var0.widget != null ? var0.widget.childIndex : -1;
									}

									if (var14 == -2147483642) {
										var14 = var0.dragTarget != null ? var0.dragTarget.id : -1;
									}

									if (var14 == -2147483641) {
										var14 = var0.dragTarget != null ? var0.dragTarget.childIndex : -1;
									}

									if (var14 == -2147483640) {
										var14 = var0.keyTyped;
									}

									if (var14 == -2147483639) {
										var14 = var0.keyPressed;
									}

									class21.Interpreter_intLocals[var11++] = var14;
								} else if (var3[var13] instanceof String) {
									var21 = (String)var3[var13];
									if (var21.equals("event_opbase")) {
										var21 = var0.targetName;
									}

									class268.Interpreter_stringLocals[var12++] = var21;
								}
							}

							Interpreter.field823 = var0.field1054;

							while (true) {
								++var10;
								if (var10 > var1) {
									throw new RuntimeException();
								}

								++var20;
								int var33 = var6[var20];
								if (var33 >= 100) {
									boolean var35;
									if (var4.intOperands[var20] == 1) {
										var35 = true;
									} else {
										var35 = false;
									}

									var14 = KeyHandler.method329(var33, var4, var35);
									switch(var14) {
									case 0:
										var30 = false;
										break label954;
									case 1:
									default:
										break;
									case 2:
										throw new IllegalStateException();
									}
								} else if (var33 == ScriptOpcodes.ICONST) {
									Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var7[var20];
								} else if (var33 == ScriptOpcodes.GET_VARP) {
									var13 = var7[var20];
									Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = Varps.Varps_main[var13];
								} else if (var33 == ScriptOpcodes.SET_VARP) {
									var13 = var7[var20];
									Varps.Varps_main[var13] = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
									class321.changeGameOptions(var13);
								} else if (var33 == ScriptOpcodes.SCONST) {
									Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var4.stringOperands[var20];
								} else if (var33 == ScriptOpcodes.JUMP) {
									var20 += var7[var20];
								} else if (var33 == ScriptOpcodes.IF_ICMPNE) {
									class12.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPEQ) {
									class12.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPLT) {
									class12.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPGT) {
									class12.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.RETURN) {
									if (Interpreter.Interpreter_frameDepth == 0) {
										var30 = false;
										break;
									}

									ScriptFrame var40 = Interpreter.Interpreter_frames[--Interpreter.Interpreter_frameDepth];
									var4 = var40.script;
									var6 = var4.opcodes;
									var7 = var4.intOperands;
									var20 = var40.pc;
									class21.Interpreter_intLocals = var40.intLocals;
									class268.Interpreter_stringLocals = var40.stringLocals;
								} else if (var33 == ScriptOpcodes.GET_VARBIT) {
									var13 = var7[var20];
									Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = class18.getVarbit(var13);
								} else if (var33 == ScriptOpcodes.SET_VARBIT) {
									var13 = var7[var20];
									class92.method2372(var13, Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]);
								} else if (var33 == ScriptOpcodes.IF_ICMPLE) {
									class12.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPGE) {
									class12.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.ILOAD) {
									Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = class21.Interpreter_intLocals[var7[var20]];
								} else if (var33 == ScriptOpcodes.ISTORE) {
									class21.Interpreter_intLocals[var7[var20]] = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
								} else if (var33 == ScriptOpcodes.SLOAD) {
									Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = class268.Interpreter_stringLocals[var7[var20]];
								} else if (var33 == ScriptOpcodes.SSTORE) {
									class268.Interpreter_stringLocals[var7[var20]] = Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize];
								} else if (var33 == ScriptOpcodes.JOIN_STRING) {
									var13 = var7[var20];
									class9.Interpreter_stringStackSize -= var13;
									var21 = StructComposition.method3524(Interpreter.Interpreter_stringStack, class9.Interpreter_stringStackSize, var13);
									Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var21;
								} else if (var33 == ScriptOpcodes.POP_INT) {
									--class12.Interpreter_intStackSize;
								} else if (var33 == ScriptOpcodes.POP_STRING) {
									--class9.Interpreter_stringStackSize;
								} else {
									int var17;
									if (var33 != ScriptOpcodes.INVOKE) {
										if (var33 == ScriptOpcodes.GET_VARC_INT) {
											Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = class125.varcs.getInt(var7[var20]);
										} else if (var33 == ScriptOpcodes.SET_VARC_INT) {
											class125.varcs.setInt(var7[var20], Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]);
										} else if (var33 == ScriptOpcodes.DEFINE_ARRAY) {
											var13 = var7[var20] >> 16;
											var14 = var7[var20] & 65535;
											int var24 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
											if (var24 < 0 || var24 > 5000) {
												throw new RuntimeException();
											}

											Interpreter.Interpreter_arrayLengths[var13] = var24;
											byte var25 = -1;
											if (var14 == 105) {
												var25 = 0;
											}

											for (var17 = 0; var17 < var24; ++var17) {
												Interpreter.Interpreter_arrays[var13][var17] = var25;
											}
										} else if (var33 == ScriptOpcodes.GET_ARRAY_INT) {
											var13 = var7[var20];
											var14 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
											if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) {
												throw new RuntimeException();
											}

											Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = Interpreter.Interpreter_arrays[var13][var14];
										} else if (var33 == ScriptOpcodes.SET_ARRAY_INT) {
											var13 = var7[var20];
											class12.Interpreter_intStackSize -= 2;
											var14 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize];
											if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) {
												throw new RuntimeException();
											}

											Interpreter.Interpreter_arrays[var13][var14] = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1];
										} else {
											String var22;
											if (var33 == ScriptOpcodes.GET_VARC_STRING_OLD) {
												var22 = class125.varcs.getStringOld(var7[var20]);
												if (var22 == null) {
													var22 = "null";
												}

												Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var22;
											} else if (var33 == ScriptOpcodes.SET_VARC_STRING_OLD) {
												class125.varcs.setStringOld(var7[var20], Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize]);
											} else if (var33 == ScriptOpcodes.GET_VARC_STRING) {
												var22 = class125.varcs.getString(var7[var20]);
												Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var22;
											} else if (var33 == ScriptOpcodes.SET_VARC_STRING) {
												class125.varcs.setString(var7[var20], Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize]);
											} else if (var33 == ScriptOpcodes.SWITCH) {
												IterableNodeHashTable var38 = var4.switches[var7[var20]];
												IntegerNode var37 = (IntegerNode)var38.get((long)Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]);
												if (var37 != null) {
													var20 += var37.integer;
												}
											} else {
												Integer var39;
												if (var33 == ScriptOpcodes.GET_VARCLANSETTING) {
													var39 = FontName.field4583.getTitleGroupValue(var7[var20]);
													if (var39 == null) {
														Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1;
													} else {
														Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var39;
													}
												} else {
													if (var33 != ScriptOpcodes.GET_VARCLAN) {
														throw new IllegalStateException();
													}

													var39 = UserComparator8.field1378.method6905(var7[var20]);
													if (var39 == null) {
														Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1;
													} else {
														Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var39;
													}
												}
											}
										}
									} else {
										var13 = var7[var20];
										Script var36 = class301.getScript(var13);
										int[] var15 = new int[var36.localIntCount];
										String[] var16 = new String[var36.localStringCount];

										for (var17 = 0; var17 < var36.intArgumentCount; ++var17) {
											var15[var17] = Interpreter.Interpreter_intStack[var17 + (class12.Interpreter_intStackSize - var36.intArgumentCount)];
										}

										for (var17 = 0; var17 < var36.stringArgumentCount; ++var17) {
											var16[var17] = Interpreter.Interpreter_stringStack[var17 + (class9.Interpreter_stringStackSize - var36.stringArgumentCount)];
										}

										class12.Interpreter_intStackSize -= var36.intArgumentCount;
										class9.Interpreter_stringStackSize -= var36.stringArgumentCount;
										ScriptFrame var23 = new ScriptFrame();
										var23.script = var4;
										var23.pc = var20;
										var23.intLocals = class21.Interpreter_intLocals;
										var23.stringLocals = class268.Interpreter_stringLocals;
										Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var23;
										var4 = var36;
										var6 = var36.opcodes;
										var7 = var36.intOperands;
										var20 = -1;
										class21.Interpreter_intLocals = var15;
										class268.Interpreter_stringLocals = var16;
									}
								}
							}
						} catch (Exception var31) {
							var9 = true;
							StringBuilder var27 = new StringBuilder(30);
							var27.append("").append(var4.key).append(" ");

							for (var13 = Interpreter.Interpreter_frameDepth - 1; var13 >= 0; --var13) {
								var27.append("").append(Interpreter.Interpreter_frames[var13].script.key).append(" ");
							}

							var27.append("").append(var8);
							ArchiveDiskActionHandler.RunException_sendStackTrace(var27.toString(), var31);
							var30 = false;
							break label955;
						}
					} finally {
						if (var30) {
							while (Interpreter.field821.size() > 0) {
								class93 var19 = (class93)Interpreter.field821.remove(0);
								TaskHandler.widgetDefaultMenuAction(var19.method2379(), var19.method2380(), var19.method2389(), var19.method2382(), "");
							}

							if (Interpreter.field835) {
								Interpreter.field835 = false;
								Varps.method5366();
							}

							if (!var9 && var2 > 0 && var10 >= var2) {
								ArchiveDiskActionHandler.RunException_sendStackTrace("Warning: Script " + var4.field949 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
							}

						}
					}

					while (Interpreter.field821.size() > 0) {
						class93 var41 = (class93)Interpreter.field821.remove(0);
						TaskHandler.widgetDefaultMenuAction(var41.method2379(), var41.method2380(), var41.method2389(), var41.method2382(), "");
					}

					if (Interpreter.field835) {
						Interpreter.field835 = false;
						Varps.method5366();
					}

					if (!var9 && var2 > 0 && var10 >= var2) {
						ArchiveDiskActionHandler.RunException_sendStackTrace("Warning: Script " + var4.field949 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
					}

					return;
				}

				while (Interpreter.field821.size() > 0) {
					class93 var26 = (class93)Interpreter.field821.remove(0);
					TaskHandler.widgetDefaultMenuAction(var26.method2379(), var26.method2380(), var26.method2389(), var26.method2382(), "");
				}

				if (Interpreter.field835) {
					Interpreter.field835 = false;
					Varps.method5366();
				}

				if (!var9 && var2 > 0 && var10 >= var2) {
					ArchiveDiskActionHandler.RunException_sendStackTrace("Warning: Script " + var4.field949 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
				}

				return;
			}

			while (Interpreter.field821.size() > 0) {
				class93 var34 = (class93)Interpreter.field821.remove(0);
				TaskHandler.widgetDefaultMenuAction(var34.method2379(), var34.method2380(), var34.method2389(), var34.method2382(), "");
			}

			if (Interpreter.field835) {
				Interpreter.field835 = false;
				Varps.method5366();
			}

			if (!var9 && var2 > 0 && var10 >= var2) {
				ArchiveDiskActionHandler.RunException_sendStackTrace("Warning: Script " + var4.field949 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
			}

		}
	}

	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1044379624"
	)
	static int method94(int var0) {
		return var0 * 3 + 600;
	}

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "(Lki;IIS)V",
		garbageValue = "138"
	)
	@Export("clickWidget")
	static final void clickWidget(Widget var0, int var1, int var2) {
		if (Client.clickedWidget == null && !Client.isMenuOpen) {
			if (var0 != null && class146.method2992(var0) != null) {
				Client.clickedWidget = var0;
				Client.field668 = class146.method2992(var0);
				Client.widgetClickX = var1;
				Client.widgetClickY = var2;
				SoundSystem.field315 = 0;
				Client.isDraggingWidget = false;
				int var3 = Client.menuOptionsCount - 1;
				if (var3 != -1) {
					Players.method2426(var3);
				}

			}
		}
	}
}
