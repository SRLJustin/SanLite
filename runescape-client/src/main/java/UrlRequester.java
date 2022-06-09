import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ce")
@Implements("UrlRequester")
public abstract class UrlRequester implements Runnable {
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lqd;"
	)
	static IndexedSprite field1354;
	@ObfuscatedName("o")
	@Export("thread")
	final Thread thread;
	@ObfuscatedName("q")
	@Export("isClosed")
	volatile boolean isClosed;
	@ObfuscatedName("l")
	@Export("requests")
	Queue requests;

	UrlRequester() {
		this.requests = new LinkedList();
		this.thread = new Thread(this);
		this.thread.setPriority(1);
		this.thread.start();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lcb;I)V",
		garbageValue = "717056983"
	)
	abstract void vmethod2544(UrlRequest var1) throws IOException;

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;B)V",
		garbageValue = "-70"
	)
	void method2517(URLConnection var1) {
		var1.setConnectTimeout(5000);
		var1.setReadTimeout(5000);
		var1.setUseCaches(false);
		var1.setRequestProperty("Connection", "close");
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;Lcb;B)V",
		garbageValue = "97"
	)
	void method2518(URLConnection var1, UrlRequest var2) {
		DataInputStream var3 = null;

		try {
			int var5 = var1.getContentLength();
			var3 = new DataInputStream(var1.getInputStream());
			byte[] var4;
			if (var5 >= 0) {
				var4 = new byte[var5];
				var3.readFully(var4);
			} else {
				var4 = new byte[0];
				byte[] var6 = class116.ByteArrayPool_getArray(5000);

				byte[] var8;
				for (int var7 = var3.read(var6, 0, var6.length); var7 > -1; var4 = var8) {
					var8 = new byte[var4.length + var7];
					System.arraycopy(var4, 0, var8, 0, var4.length);
					System.arraycopy(var6, 0, var8, var4.length, var7);
				}

				class168.ByteArrayPool_release(var6);
			}

			var2.response0 = var4;
		} catch (IOException var10) {
		}

		if (var3 != null) {
			try {
				var3.close();
			} catch (IOException var9) {
			}
		}

	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;I)Lcb;",
		garbageValue = "-1608503592"
	)
	@Export("request")
	public UrlRequest request(URL var1) {
		UrlRequest var2 = new UrlRequest(var1);
		synchronized(this) {
			this.requests.add(var2);
			this.notify();
			return var2;
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "382803574"
	)
	@Export("close")
	public void close() {
		this.isClosed = true;

		try {
			synchronized(this) {
				this.notify();
			}

			this.thread.join();
		} catch (InterruptedException var4) {
		}

	}

	public void run() {
		while (!this.isClosed) {
			try {
				UrlRequest var1;
				synchronized(this) {
					var1 = (UrlRequest)this.requests.poll();
					if (var1 == null) {
						try {
							this.wait();
						} catch (InterruptedException var5) {
						}
						continue;
					}
				}

				this.vmethod2544(var1);
			} catch (Exception var7) {
				ArchiveDiskActionHandler.RunException_sendStackTrace((String)null, var7);
			}
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "([BB)[B",
		garbageValue = "21"
	)
	static byte[] method2537(byte[] var0) {
		int var1 = var0.length;
		byte[] var2 = new byte[var1];
		System.arraycopy(var0, 0, var2, 0, var1);
		return var2;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "44420485"
	)
	public static void method2538(int var0) {
		class273.musicPlayerStatus = 1;
		ClanChannelMember.musicTrackArchive = null;
		StructComposition.musicTrackGroupId = -1;
		FriendsList.musicTrackFileId = -1;
		Clock.musicTrackVolume = 0;
		VertexNormal.musicTrackBoolean = false;
		GrandExchangeEvent.pcmSampleLength = var0;
	}

	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-127"
	)
	@Export("doCheat")
	static final void doCheat(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) {
			class12.clientPreferences.method2219(!class12.clientPreferences.method2222());
			if (class12.clientPreferences.method2222()) {
				WorldMapEvent.addGameMessage(99, "", "Roofs are now all hidden");
			} else {
				WorldMapEvent.addGameMessage(99, "", "Roofs will only be removed selectively");
			}
		}

		if (var0.equalsIgnoreCase("displayfps")) {
			class12.clientPreferences.method2228();
		}

		if (var0.equalsIgnoreCase("renderself")) {
			Client.renderSelf = !Client.renderSelf;
		}

		if (var0.equalsIgnoreCase("mouseovertext")) {
			Client.showMouseOverText = !Client.showMouseOverText;
		}

		if (Client.staffModLevel >= 2) {
			if (var0.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}

			if (var0.equalsIgnoreCase("showcoord")) {
				ServerPacket.worldMap.showCoord = !ServerPacket.worldMap.showCoord;
			}

			if (var0.equalsIgnoreCase("fpson")) {
				class12.clientPreferences.method2227(true);
			}

			if (var0.equalsIgnoreCase("fpsoff")) {
				class12.clientPreferences.method2227(false);
			}

			if (var0.equalsIgnoreCase("gc")) {
				System.gc();
			}

			if (var0.equalsIgnoreCase("clientdrop")) {
				class129.method2812();
			}
		}

		PacketBufferNode var1 = DecorativeObject.getPacketBufferNode(ClientPacket.field2988, Client.packetWriter.isaacCipher);
		var1.packetBuffer.writeByte(var0.length() + 1);
		var1.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var1);
	}

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "(Lci;B)V",
		garbageValue = "-115"
	)
	static final void method2536(PendingSpawn var0) {
		long var1 = 0L;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;
		if (var0.type == 0) {
			var1 = class175.scene.getWallObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 1) {
			var1 = class175.scene.getDecorativeObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 2) {
			var1 = class175.scene.getGameObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 3) {
			var1 = class175.scene.getGroundObjectTag(var0.plane, var0.x, var0.y);
		}

		if (0L != var1) {
			int var6 = class175.scene.getObjectFlags(var0.plane, var0.x, var0.y, var1);
			var3 = NetSocket.Entity_unpackID(var1);
			var4 = var6 & 31;
			var5 = var6 >> 6 & 3;
		}

		var0.objectId = var3;
		var0.field1129 = var4;
		var0.field1131 = var5;
	}

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "(Lca;IILgd;I)V",
		garbageValue = "-1504276994"
	)
	static final void method2540(Player var0, int var1, int var2, class193 var3) {
		int var4 = var0.pathX[0];
		int var5 = var0.pathY[0];
		int var6 = var0.transformedSize();
		if (var4 >= var6 && var4 < 104 - var6 && var5 >= var6 && var5 < 104 - var6) {
			if (var1 >= var6 && var1 < 104 - var6 && var2 >= var6 && var2 < 104 - var6) {
				int var8 = var0.transformedSize();
				RouteStrategy var9 = class65.method1879(var1, var2);
				CollisionMap var10 = Client.collisionMaps[var0.plane];
				int[] var11 = Client.field772;
				int[] var12 = Client.field773;

				int var13;
				int var14;
				for (var13 = 0; var13 < 128; ++var13) {
					for (var14 = 0; var14 < 128; ++var14) {
						class194.directions[var13][var14] = 0;
						class194.distances[var13][var14] = 99999999;
					}
				}

				int var15;
				int var16;
				byte var18;
				int var19;
				int var20;
				int var22;
				int var24;
				int var25;
				int var26;
				int var27;
				boolean var33;
				int var35;
				int var36;
				int var38;
				if (var8 == 1) {
					var33 = AbstractWorldMapIcon.method4863(var4, var5, var9, var10);
				} else {
					byte var17;
					byte var21;
					int[][] var23;
					boolean var34;
					if (var8 == 2) {
						var15 = var4;
						var16 = var5;
						var17 = 64;
						var18 = 64;
						var19 = var4 - var17;
						var20 = var5 - var18;
						class194.directions[var17][var18] = 99;
						class194.distances[var17][var18] = 0;
						var21 = 0;
						var22 = 0;
						class194.bufferX[var21] = var4;
						var38 = var21 + 1;
						class194.bufferY[var21] = var5;
						var23 = var10.flags;

						while (true) {
							if (var38 == var22) {
								Varps.field3348 = var15;
								class194.field2255 = var16;
								var34 = false;
								break;
							}

							var15 = class194.bufferX[var22];
							var16 = class194.bufferY[var22];
							var22 = var22 + 1 & 4095;
							var35 = var15 - var19;
							var36 = var16 - var20;
							var24 = var15 - var10.xInset;
							var25 = var16 - var10.yInset;
							if (var9.hasArrived(2, var15, var16, var10)) {
								Varps.field3348 = var15;
								class194.field2255 = var16;
								var34 = true;
								break;
							}

							var26 = class194.distances[var35][var36] + 1;
							if (var35 > 0 && class194.directions[var35 - 1][var36] == 0 && (var23[var24 - 1][var25] & 19136782) == 0 && (var23[var24 - 1][var25 + 1] & 19136824) == 0) {
								class194.bufferX[var38] = var15 - 1;
								class194.bufferY[var38] = var16;
								var38 = var38 + 1 & 4095;
								class194.directions[var35 - 1][var36] = 2;
								class194.distances[var35 - 1][var36] = var26;
							}

							if (var35 < 126 && class194.directions[var35 + 1][var36] == 0 && (var23[var24 + 2][var25] & 19136899) == 0 && (var23[var24 + 2][var25 + 1] & 19136992) == 0) {
								class194.bufferX[var38] = var15 + 1;
								class194.bufferY[var38] = var16;
								var38 = var38 + 1 & 4095;
								class194.directions[var35 + 1][var36] = 8;
								class194.distances[var35 + 1][var36] = var26;
							}

							if (var36 > 0 && class194.directions[var35][var36 - 1] == 0 && (var23[var24][var25 - 1] & 19136782) == 0 && (var23[var24 + 1][var25 - 1] & 19136899) == 0) {
								class194.bufferX[var38] = var15;
								class194.bufferY[var38] = var16 - 1;
								var38 = var38 + 1 & 4095;
								class194.directions[var35][var36 - 1] = 1;
								class194.distances[var35][var36 - 1] = var26;
							}

							if (var36 < 126 && class194.directions[var35][var36 + 1] == 0 && (var23[var24][var25 + 2] & 19136824) == 0 && (var23[var24 + 1][var25 + 2] & 19136992) == 0) {
								class194.bufferX[var38] = var15;
								class194.bufferY[var38] = var16 + 1;
								var38 = var38 + 1 & 4095;
								class194.directions[var35][var36 + 1] = 4;
								class194.distances[var35][var36 + 1] = var26;
							}

							if (var35 > 0 && var36 > 0 && class194.directions[var35 - 1][var36 - 1] == 0 && (var23[var24 - 1][var25] & 19136830) == 0 && (var23[var24 - 1][var25 - 1] & 19136782) == 0 && (var23[var24][var25 - 1] & 19136911) == 0) {
								class194.bufferX[var38] = var15 - 1;
								class194.bufferY[var38] = var16 - 1;
								var38 = var38 + 1 & 4095;
								class194.directions[var35 - 1][var36 - 1] = 3;
								class194.distances[var35 - 1][var36 - 1] = var26;
							}

							if (var35 < 126 && var36 > 0 && class194.directions[var35 + 1][var36 - 1] == 0 && (var23[var24 + 1][var25 - 1] & 19136911) == 0 && (var23[var24 + 2][var25 - 1] & 19136899) == 0 && (var23[var24 + 2][var25] & 19136995) == 0) {
								class194.bufferX[var38] = var15 + 1;
								class194.bufferY[var38] = var16 - 1;
								var38 = var38 + 1 & 4095;
								class194.directions[var35 + 1][var36 - 1] = 9;
								class194.distances[var35 + 1][var36 - 1] = var26;
							}

							if (var35 > 0 && var36 < 126 && class194.directions[var35 - 1][var36 + 1] == 0 && (var23[var24 - 1][var25 + 1] & 19136830) == 0 && (var23[var24 - 1][var25 + 2] & 19136824) == 0 && (var23[var24][var25 + 2] & 19137016) == 0) {
								class194.bufferX[var38] = var15 - 1;
								class194.bufferY[var38] = var16 + 1;
								var38 = var38 + 1 & 4095;
								class194.directions[var35 - 1][var36 + 1] = 6;
								class194.distances[var35 - 1][var36 + 1] = var26;
							}

							if (var35 < 126 && var36 < 126 && class194.directions[var35 + 1][var36 + 1] == 0 && (var23[var24 + 1][var25 + 2] & 19137016) == 0 && (var23[var24 + 2][var25 + 2] & 19136992) == 0 && (var23[var24 + 2][var25 + 1] & 19136995) == 0) {
								class194.bufferX[var38] = var15 + 1;
								class194.bufferY[var38] = var16 + 1;
								var38 = var38 + 1 & 4095;
								class194.directions[var35 + 1][var36 + 1] = 12;
								class194.distances[var35 + 1][var36 + 1] = var26;
							}
						}

						var33 = var34;
					} else {
						var15 = var4;
						var16 = var5;
						var17 = 64;
						var18 = 64;
						var19 = var4 - var17;
						var20 = var5 - var18;
						class194.directions[var17][var18] = 99;
						class194.distances[var17][var18] = 0;
						var21 = 0;
						var22 = 0;
						class194.bufferX[var21] = var4;
						var38 = var21 + 1;
						class194.bufferY[var21] = var5;
						var23 = var10.flags;

						label670:
						while (true) {
							label668:
							while (true) {
								do {
									do {
										do {
											label645:
											do {
												if (var38 == var22) {
													Varps.field3348 = var15;
													class194.field2255 = var16;
													var34 = false;
													break label670;
												}

												var15 = class194.bufferX[var22];
												var16 = class194.bufferY[var22];
												var22 = var22 + 1 & 4095;
												var35 = var15 - var19;
												var36 = var16 - var20;
												var24 = var15 - var10.xInset;
												var25 = var16 - var10.yInset;
												if (var9.hasArrived(var8, var15, var16, var10)) {
													Varps.field3348 = var15;
													class194.field2255 = var16;
													var34 = true;
													break label670;
												}

												var26 = class194.distances[var35][var36] + 1;
												if (var35 > 0 && class194.directions[var35 - 1][var36] == 0 && (var23[var24 - 1][var25] & 19136782) == 0 && (var23[var24 - 1][var25 + var8 - 1] & 19136824) == 0) {
													var27 = 1;

													while (true) {
														if (var27 >= var8 - 1) {
															class194.bufferX[var38] = var15 - 1;
															class194.bufferY[var38] = var16;
															var38 = var38 + 1 & 4095;
															class194.directions[var35 - 1][var36] = 2;
															class194.distances[var35 - 1][var36] = var26;
															break;
														}

														if ((var23[var24 - 1][var27 + var25] & 19136830) != 0) {
															break;
														}

														++var27;
													}
												}

												if (var35 < 128 - var8 && class194.directions[var35 + 1][var36] == 0 && (var23[var24 + var8][var25] & 19136899) == 0 && (var23[var8 + var24][var8 + var25 - 1] & 19136992) == 0) {
													var27 = 1;

													while (true) {
														if (var27 >= var8 - 1) {
															class194.bufferX[var38] = var15 + 1;
															class194.bufferY[var38] = var16;
															var38 = var38 + 1 & 4095;
															class194.directions[var35 + 1][var36] = 8;
															class194.distances[var35 + 1][var36] = var26;
															break;
														}

														if ((var23[var24 + var8][var25 + var27] & 19136995) != 0) {
															break;
														}

														++var27;
													}
												}

												if (var36 > 0 && class194.directions[var35][var36 - 1] == 0 && (var23[var24][var25 - 1] & 19136782) == 0 && (var23[var24 + var8 - 1][var25 - 1] & 19136899) == 0) {
													var27 = 1;

													while (true) {
														if (var27 >= var8 - 1) {
															class194.bufferX[var38] = var15;
															class194.bufferY[var38] = var16 - 1;
															var38 = var38 + 1 & 4095;
															class194.directions[var35][var36 - 1] = 1;
															class194.distances[var35][var36 - 1] = var26;
															break;
														}

														if ((var23[var27 + var24][var25 - 1] & 19136911) != 0) {
															break;
														}

														++var27;
													}
												}

												if (var36 < 128 - var8 && class194.directions[var35][var36 + 1] == 0 && (var23[var24][var8 + var25] & 19136824) == 0 && (var23[var24 + var8 - 1][var25 + var8] & 19136992) == 0) {
													var27 = 1;

													while (true) {
														if (var27 >= var8 - 1) {
															class194.bufferX[var38] = var15;
															class194.bufferY[var38] = var16 + 1;
															var38 = var38 + 1 & 4095;
															class194.directions[var35][var36 + 1] = 4;
															class194.distances[var35][var36 + 1] = var26;
															break;
														}

														if ((var23[var27 + var24][var8 + var25] & 19137016) != 0) {
															break;
														}

														++var27;
													}
												}

												if (var35 > 0 && var36 > 0 && class194.directions[var35 - 1][var36 - 1] == 0 && (var23[var24 - 1][var25 - 1] & 19136782) == 0) {
													var27 = 1;

													while (true) {
														if (var27 >= var8) {
															class194.bufferX[var38] = var15 - 1;
															class194.bufferY[var38] = var16 - 1;
															var38 = var38 + 1 & 4095;
															class194.directions[var35 - 1][var36 - 1] = 3;
															class194.distances[var35 - 1][var36 - 1] = var26;
															break;
														}

														if ((var23[var24 - 1][var27 + (var25 - 1)] & 19136830) != 0 || (var23[var27 + (var24 - 1)][var25 - 1] & 19136911) != 0) {
															break;
														}

														++var27;
													}
												}

												if (var35 < 128 - var8 && var36 > 0 && class194.directions[var35 + 1][var36 - 1] == 0 && (var23[var24 + var8][var25 - 1] & 19136899) == 0) {
													var27 = 1;

													while (true) {
														if (var27 >= var8) {
															class194.bufferX[var38] = var15 + 1;
															class194.bufferY[var38] = var16 - 1;
															var38 = var38 + 1 & 4095;
															class194.directions[var35 + 1][var36 - 1] = 9;
															class194.distances[var35 + 1][var36 - 1] = var26;
															break;
														}

														if ((var23[var8 + var24][var27 + (var25 - 1)] & 19136995) != 0 || (var23[var27 + var24][var25 - 1] & 19136911) != 0) {
															break;
														}

														++var27;
													}
												}

												if (var35 > 0 && var36 < 128 - var8 && class194.directions[var35 - 1][var36 + 1] == 0 && (var23[var24 - 1][var25 + var8] & 19136824) == 0) {
													for (var27 = 1; var27 < var8; ++var27) {
														if ((var23[var24 - 1][var25 + var27] & 19136830) != 0 || (var23[var27 + (var24 - 1)][var8 + var25] & 19137016) != 0) {
															continue label645;
														}
													}

													class194.bufferX[var38] = var15 - 1;
													class194.bufferY[var38] = var16 + 1;
													var38 = var38 + 1 & 4095;
													class194.directions[var35 - 1][var36 + 1] = 6;
													class194.distances[var35 - 1][var36 + 1] = var26;
												}
											} while(var35 >= 128 - var8);
										} while(var36 >= 128 - var8);
									} while(class194.directions[var35 + 1][var36 + 1] != 0);
								} while((var23[var24 + var8][var25 + var8] & 19136992) != 0);

								for (var27 = 1; var27 < var8; ++var27) {
									if ((var23[var27 + var24][var8 + var25] & 19137016) != 0 || (var23[var24 + var8][var25 + var27] & 19136995) != 0) {
										continue label668;
									}
								}

								class194.bufferX[var38] = var15 + 1;
								class194.bufferY[var38] = var16 + 1;
								var38 = var38 + 1 & 4095;
								class194.directions[var35 + 1][var36 + 1] = 12;
								class194.distances[var35 + 1][var36 + 1] = var26;
							}
						}

						var33 = var34;
					}
				}

				int var7;
				label718: {
					var14 = var4 - 64;
					var15 = var5 - 64;
					var16 = Varps.field3348;
					var35 = class194.field2255;
					if (!var33) {
						var36 = Integer.MAX_VALUE;
						var19 = Integer.MAX_VALUE;
						byte var37 = 10;
						var38 = var9.approxDestinationX;
						var22 = var9.approxDestinationY;
						int var32 = var9.approxDestinationSizeX;
						var24 = var9.approxDestinationSizeY;

						for (var25 = var38 - var37; var25 <= var38 + var37; ++var25) {
							for (var26 = var22 - var37; var26 <= var22 + var37; ++var26) {
								var27 = var25 - var14;
								int var28 = var26 - var15;
								if (var27 >= 0 && var28 >= 0 && var27 < 128 && var28 < 128 && class194.distances[var27][var28] < 100) {
									int var29 = 0;
									if (var25 < var38) {
										var29 = var38 - var25;
									} else if (var25 > var38 + var32 - 1) {
										var29 = var25 - (var32 + var38 - 1);
									}

									int var30 = 0;
									if (var26 < var22) {
										var30 = var22 - var26;
									} else if (var26 > var22 + var24 - 1) {
										var30 = var26 - (var22 + var24 - 1);
									}

									int var31 = var29 * var29 + var30 * var30;
									if (var31 < var36 || var36 == var31 && class194.distances[var27][var28] < var19) {
										var36 = var31;
										var19 = class194.distances[var27][var28];
										var16 = var25;
										var35 = var26;
									}
								}
							}
						}

						if (var36 == Integer.MAX_VALUE) {
							var7 = -1;
							break label718;
						}
					}

					if (var4 == var16 && var35 == var5) {
						var11[0] = var16;
						var12[0] = var35;
						var7 = 0;
					} else {
						var18 = 0;
						class194.bufferX[var18] = var16;
						var36 = var18 + 1;
						class194.bufferY[var18] = var35;

						for (var19 = var20 = class194.directions[var16 - var14][var35 - var15]; var4 != var16 || var5 != var35; var19 = class194.directions[var16 - var14][var35 - var15]) {
							if (var19 != var20) {
								var20 = var19;
								class194.bufferX[var36] = var16;
								class194.bufferY[var36++] = var35;
							}

							if ((var19 & 2) != 0) {
								++var16;
							} else if ((var19 & 8) != 0) {
								--var16;
							}

							if ((var19 & 1) != 0) {
								++var35;
							} else if ((var19 & 4) != 0) {
								--var35;
							}
						}

						var38 = 0;

						while (var36-- > 0) {
							var11[var38] = class194.bufferX[var36];
							var12[var38++] = class194.bufferY[var36];
							if (var38 >= var11.length) {
								break;
							}
						}

						var7 = var38;
					}
				}

				var13 = var7;
				if (var7 >= 1) {
					for (var14 = 0; var14 < var13 - 1; ++var14) {
						var0.method2119(Client.field772[var14], Client.field773[var14], var3);
					}

				}
			}
		}
	}

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "16711680"
	)
	static final boolean method2539(int var0) {
		if (var0 < 0) {
			return false;
		} else {
			int var1 = Client.menuOpcodes[var0];
			if (var1 >= 2000) {
				var1 -= 2000;
			}

			return var1 == 1007;
		}
	}

	@ObfuscatedName("lc")
	@ObfuscatedSignature(
		descriptor = "(Lki;B)I",
		garbageValue = "58"
	)
	@Export("getWidgetFlags")
	static int getWidgetFlags(Widget var0) {
		IntegerNode var1 = (IntegerNode)Client.widgetFlags.get((long)var0.childIndex + ((long)var0.id << 32));
		return var1 != null ? var1.integer : var0.flags;
	}
}
