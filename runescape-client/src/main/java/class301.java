import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kr")
public class class301 {
	static {
		Math.sqrt(8192.0D);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IB)Lbb;",
		garbageValue = "1"
	)
	@Export("getScript")
	static Script getScript(int var0) {
		Script var1 = (Script)Script.Script_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = class115.archive12.takeFile(var0, 0);
			if (var2 == null) {
				return null;
			} else {
				var1 = PcmPlayer.newScript(var2);
				Script.Script_cached.put(var1, (long)var0);
				return var1;
			}
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "2143337015"
	)
	static final String method5583(int var0) {
		if (var0 < 100000) {
			return "<col=ffff00>" + var0 + "</col>";
		} else {
			return var0 < 10000000 ? "<col=ffffff>" + var0 / 1000 + "K" + "</col>" : "<col=00ff80>" + var0 / 1000000 + "M" + "</col>";
		}
	}

	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "(Lcx;II)V",
		garbageValue = "-1751178883"
	)
	@Export("updateActorSequence")
	static final void updateActorSequence(Actor var0, int var1) {
		int var2;
		int var3;
		int var4;
		if (var0.field1191 >= Client.cycle) {
			var2 = Math.max(1, var0.field1191 - Client.cycle);
			var3 = var0.field1187 * 128 + var0.field1167 * 64;
			var4 = var0.field1189 * 128 + var0.field1167 * 64;
			var0.x += (var3 - var0.x) / var2;
			var0.y += (var4 - var0.y) / var2;
			var0.field1194 = 0;
			var0.orientation = var0.field1139;
		} else if (var0.field1192 >= Client.cycle) {
			if (var0.field1192 == Client.cycle || var0.sequence == -1 || var0.sequenceDelay != 0 || var0.sequenceFrameCycle + 1 > class114.SequenceDefinition_get(var0.sequence).frameLengths[var0.sequenceFrame]) {
				var2 = var0.field1192 - var0.field1191;
				var3 = Client.cycle - var0.field1191;
				var4 = var0.field1187 * 128 + var0.field1167 * 64;
				int var5 = var0.field1189 * 128 + var0.field1167 * 64;
				int var6 = var0.field1188 * 128 + var0.field1167 * 64;
				int var7 = var0.field1190 * 128 + var0.field1167 * 64;
				var0.x = (var6 * var3 + var4 * (var2 - var3)) / var2;
				var0.y = (var7 * var3 + var5 * (var2 - var3)) / var2;
			}

			var0.field1194 = 0;
			var0.orientation = var0.field1139;
			var0.rotation = var0.orientation;
		} else {
			class115.method2680(var0);
		}

		if (var0.x < 128 || var0.y < 128 || var0.x >= 13184 || var0.y >= 13184) {
			var0.sequence = -1;
			var0.spotAnimation = -1;
			var0.field1191 = 0;
			var0.field1192 = 0;
			var0.x = var0.pathX[0] * 128 + var0.field1167 * 64;
			var0.y = var0.pathY[0] * 128 + var0.field1167 * 64;
			var0.method2180();
		}

		if (ModelData0.localPlayer == var0 && (var0.x < 1536 || var0.y < 1536 || var0.x >= 11776 || var0.y >= 11776)) {
			var0.sequence = -1;
			var0.spotAnimation = -1;
			var0.field1191 = 0;
			var0.field1192 = 0;
			var0.x = var0.pathX[0] * 128 + var0.field1167 * 64;
			var0.y = var0.pathY[0] * 128 + var0.field1167 * 64;
			var0.method2180();
		}

		if (var0.field1204 != 0) {
			if (var0.targetIndex != -1) {
				Object var8 = null;
				if (var0.targetIndex < 32768) {
					var8 = Client.npcs[var0.targetIndex];
				} else if (var0.targetIndex >= 32768) {
					var8 = Client.players[var0.targetIndex - 32768];
				}

				if (var8 != null) {
					var3 = var0.x - ((Actor)var8).x;
					var4 = var0.y - ((Actor)var8).y;
					if (var3 != 0 || var4 != 0) {
						var0.orientation = (int)(Math.atan2((double)var3, (double)var4) * 325.949D) & 2047;
					}
				} else if (var0.false0) {
					var0.targetIndex = -1;
					var0.false0 = false;
				}
			}

			if (var0.field1172 != -1 && (var0.pathLength == 0 || var0.field1194 > 0)) {
				var0.orientation = var0.field1172;
				var0.field1172 = -1;
			}

			var2 = var0.orientation - var0.rotation & 2047;
			if (var2 == 0 && var0.false0) {
				var0.targetIndex = -1;
				var0.false0 = false;
			}

			if (var2 != 0) {
				++var0.field1203;
				boolean var10;
				if (var2 > 1024) {
					var0.rotation -= var0.field1173 ? var2 : var0.field1204;
					var10 = true;
					if (var2 < var0.field1204 || var2 > 2048 - var0.field1204) {
						var0.rotation = var0.orientation;
						var10 = false;
					}

					if (!var0.field1173 && var0.movementSequence == var0.idleSequence && (var0.field1203 > 25 || var10)) {
						if (var0.turnLeftSequence != -1) {
							var0.movementSequence = var0.turnLeftSequence;
						} else {
							var0.movementSequence = var0.walkSequence;
						}
					}
				} else {
					var0.rotation += var0.field1173 ? var2 : var0.field1204;
					var10 = true;
					if (var2 < var0.field1204 || var2 > 2048 - var0.field1204) {
						var0.rotation = var0.orientation;
						var10 = false;
					}

					if (!var0.field1173 && var0.idleSequence == var0.movementSequence && (var0.field1203 > 25 || var10)) {
						if (var0.turnRightSequence != -1) {
							var0.movementSequence = var0.turnRightSequence;
						} else {
							var0.movementSequence = var0.walkSequence;
						}
					}
				}

				var0.rotation &= 2047;
				var0.field1173 = false;
			} else {
				var0.field1203 = 0;
			}
		}

		var0.isWalking = false;
		SequenceDefinition var11;
		if (var0.movementSequence != -1) {
			var11 = class114.SequenceDefinition_get(var0.movementSequence);
			if (var11 != null) {
				if (!var11.method3712() && var11.frameIds != null) {
					++var0.movementFrameCycle;
					if (var0.movementFrame < var11.frameIds.length && var0.movementFrameCycle > var11.frameLengths[var0.movementFrame]) {
						var0.movementFrameCycle = 1;
						++var0.movementFrame;
						class16.method182(var11, var0.movementFrame, var0.x, var0.y);
					}

					if (var0.movementFrame >= var11.frameIds.length) {
						var0.movementFrameCycle = 0;
						var0.movementFrame = 0;
						class16.method182(var11, var0.movementFrame, var0.x, var0.y);
					}
				} else if (var11.method3712()) {
					++var0.movementFrame;
					var3 = var11.method3729();
					if (var0.movementFrame < var3) {
						TileItem.method2407(var11, var0.movementFrame, var0.x, var0.y);
					} else {
						var0.movementFrameCycle = 0;
						var0.movementFrame = 0;
						TileItem.method2407(var11, var0.movementFrame, var0.x, var0.y);
					}
				} else {
					var0.movementSequence = -1;
				}
			} else {
				var0.movementSequence = -1;
			}
		}

		if (var0.spotAnimation != -1 && Client.cycle >= var0.field1185) {
			if (var0.spotAnimationFrame < 0) {
				var0.spotAnimationFrame = 0;
			}

			var2 = class136.SpotAnimationDefinition_get(var0.spotAnimation).sequence;
			if (var2 != -1) {
				SequenceDefinition var9 = class114.SequenceDefinition_get(var2);
				if (var9 != null && var9.frameIds != null) {
					++var0.spotAnimationFrameCycle;
					if (var0.spotAnimationFrame < var9.frameIds.length && var0.spotAnimationFrameCycle > var9.frameLengths[var0.spotAnimationFrame]) {
						var0.spotAnimationFrameCycle = 1;
						++var0.spotAnimationFrame;
						class16.method182(var9, var0.spotAnimationFrame, var0.x, var0.y);
					}

					if (var0.spotAnimationFrame >= var9.frameIds.length && (var0.spotAnimationFrame < 0 || var0.spotAnimationFrame >= var9.frameIds.length)) {
						var0.spotAnimation = -1;
					}
				} else if (var9.method3712()) {
					++var0.spotAnimationFrame;
					var4 = var9.method3729();
					if (var0.spotAnimationFrame < var4) {
						TileItem.method2407(var9, var0.spotAnimationFrame, var0.x, var0.y);
					} else if (var0.spotAnimationFrame < 0 || var0.spotAnimationFrame >= var4) {
						var0.spotAnimation = -1;
					}
				} else {
					var0.spotAnimation = -1;
				}
			} else {
				var0.spotAnimation = -1;
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay <= 1) {
			var11 = class114.SequenceDefinition_get(var0.sequence);
			if (var11.field2224 == 1 && var0.field1200 > 0 && var0.field1191 <= Client.cycle && var0.field1192 < Client.cycle) {
				var0.sequenceDelay = 1;
				return;
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay == 0) {
			var11 = class114.SequenceDefinition_get(var0.sequence);
			if (var11 == null) {
				var0.sequence = -1;
			} else if (!var11.method3712() && var11.frameIds != null) {
				++var0.sequenceFrameCycle;
				if (var0.sequenceFrame < var11.frameIds.length && var0.sequenceFrameCycle > var11.frameLengths[var0.sequenceFrame]) {
					var0.sequenceFrameCycle = 1;
					++var0.sequenceFrame;
					class16.method182(var11, var0.sequenceFrame, var0.x, var0.y);
				}

				if (var0.sequenceFrame >= var11.frameIds.length) {
					var0.sequenceFrame -= var11.frameCount;
					++var0.field1186;
					if (var0.field1186 >= var11.field2223) {
						var0.sequence = -1;
					} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var11.frameIds.length) {
						class16.method182(var11, var0.sequenceFrame, var0.x, var0.y);
					} else {
						var0.sequence = -1;
					}
				}

				var0.isWalking = var11.field2201;
			} else if (var11.method3712()) {
				++var0.sequenceFrame;
				var3 = var11.method3735().method2754();
				if (var0.sequenceFrame < var3) {
					TileItem.method2407(var11, var0.sequenceFrame, var0.x, var0.y);
				} else {
					var0.sequenceFrame -= var11.frameCount;
					++var0.field1186;
					if (var0.field1186 >= var11.field2223) {
						var0.sequence = -1;
					} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var3) {
						TileItem.method2407(var11, var0.sequenceFrame, var0.x, var0.y);
					} else {
						var0.sequence = -1;
					}
				}
			} else {
				var0.sequence = -1;
			}
		}

		if (var0.sequenceDelay > 0) {
			--var0.sequenceDelay;
		}

	}

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1223845461"
	)
	static final void method5580() {
		InvDefinition.method3268(false);
		Client.field545 = 0;
		boolean var0 = true;

		int var1;
		for (var1 = 0; var1 < InterfaceParent.regionLandArchives.length; ++var1) {
			if (class83.regionMapArchiveIds[var1] != -1 && InterfaceParent.regionLandArchives[var1] == null) {
				InterfaceParent.regionLandArchives[var1] = Message.archive5.takeFile(class83.regionMapArchiveIds[var1], 0);
				if (InterfaceParent.regionLandArchives[var1] == null) {
					var0 = false;
					++Client.field545;
				}
			}

			if (class17.regionLandArchiveIds[var1] != -1 && FloorUnderlayDefinition.regionMapArchives[var1] == null) {
				FloorUnderlayDefinition.regionMapArchives[var1] = Message.archive5.takeFileEncrypted(class17.regionLandArchiveIds[var1], 0, class138.xteaKeys[var1]);
				if (FloorUnderlayDefinition.regionMapArchives[var1] == null) {
					var0 = false;
					++Client.field545;
				}
			}
		}

		if (!var0) {
			Client.field597 = 1;
		} else {
			Client.field570 = 0;
			var0 = true;

			int var3;
			int var4;
			for (var1 = 0; var1 < InterfaceParent.regionLandArchives.length; ++var1) {
				byte[] var15 = FloorUnderlayDefinition.regionMapArchives[var1];
				if (var15 != null) {
					var3 = (class241.regions[var1] >> 8) * 64 - SecureRandomCallable.baseX * 64;
					var4 = (class241.regions[var1] & 255) * 64 - GrandExchangeOfferOwnWorldComparator.baseY * 64;
					if (Client.isInInstance) {
						var3 = 10;
						var4 = 10;
					}

					var0 &= class132.method2834(var15, var3, var4);
				}
			}

			if (!var0) {
				Client.field597 = 2;
			} else {
				if (Client.field597 != 0) {
					class259.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
				}

				ArchiveLoader.playPcmPlayers();
				class175.scene.clear();

				for (var1 = 0; var1 < 4; ++var1) {
					Client.collisionMaps[var1].clear();
				}

				int var2;
				for (var1 = 0; var1 < 4; ++var1) {
					for (var2 = 0; var2 < 104; ++var2) {
						for (var3 = 0; var3 < 104; ++var3) {
							Tiles.Tiles_renderFlags[var1][var2][var3] = 0;
						}
					}
				}

				ArchiveLoader.playPcmPlayers();
				class149.method3024();
				var1 = InterfaceParent.regionLandArchives.length;
				Varcs.method2466();
				InvDefinition.method3268(true);
				int var5;
				if (!Client.isInInstance) {
					byte[] var14;
					for (var2 = 0; var2 < var1; ++var2) {
						var3 = (class241.regions[var2] >> 8) * 64 - SecureRandomCallable.baseX * 64;
						var4 = (class241.regions[var2] & 255) * 64 - GrandExchangeOfferOwnWorldComparator.baseY * 64;
						var14 = InterfaceParent.regionLandArchives[var2];
						if (var14 != null) {
							ArchiveLoader.playPcmPlayers();
							PacketBufferNode.method5009(var14, var3, var4, WorldMapSectionType.field2828 * 8 - 48, class433.field4657 * 8 - 48, Client.collisionMaps);
						}
					}

					for (var2 = 0; var2 < var1; ++var2) {
						var3 = (class241.regions[var2] >> 8) * 64 - SecureRandomCallable.baseX * 64;
						var4 = (class241.regions[var2] & 255) * 64 - GrandExchangeOfferOwnWorldComparator.baseY * 64;
						var14 = InterfaceParent.regionLandArchives[var2];
						if (var14 == null && class433.field4657 < 800) {
							ArchiveLoader.playPcmPlayers();
							PlayerComposition.method5408(var3, var4, 64, 64);
						}
					}

					InvDefinition.method3268(true);

					for (var2 = 0; var2 < var1; ++var2) {
						byte[] var13 = FloorUnderlayDefinition.regionMapArchives[var2];
						if (var13 != null) {
							var4 = (class241.regions[var2] >> 8) * 64 - SecureRandomCallable.baseX * 64;
							var5 = (class241.regions[var2] & 255) * 64 - GrandExchangeOfferOwnWorldComparator.baseY * 64;
							ArchiveLoader.playPcmPlayers();
							VertexNormal.method4376(var13, var4, var5, class175.scene, Client.collisionMaps);
						}
					}
				}

				int var6;
				int var7;
				int var8;
				if (Client.isInInstance) {
					int var9;
					int var10;
					int var11;
					for (var2 = 0; var2 < 4; ++var2) {
						ArchiveLoader.playPcmPlayers();

						for (var3 = 0; var3 < 13; ++var3) {
							for (var4 = 0; var4 < 13; ++var4) {
								boolean var16 = false;
								var6 = Client.instanceChunkTemplates[var2][var3][var4];
								if (var6 != -1) {
									var7 = var6 >> 24 & 3;
									var8 = var6 >> 1 & 3;
									var9 = var6 >> 14 & 1023;
									var10 = var6 >> 3 & 2047;
									var11 = (var9 / 8 << 8) + var10 / 8;

									for (int var12 = 0; var12 < class241.regions.length; ++var12) {
										if (class241.regions[var12] == var11 && InterfaceParent.regionLandArchives[var12] != null) {
											class125.method2794(InterfaceParent.regionLandArchives[var12], var2, var3 * 8, var4 * 8, var7, (var9 & 7) * 8, (var10 & 7) * 8, var8, Client.collisionMaps);
											var16 = true;
											break;
										}
									}
								}

								if (!var16) {
									World.method1661(var2, var3 * 8, var4 * 8);
								}
							}
						}
					}

					for (var2 = 0; var2 < 13; ++var2) {
						for (var3 = 0; var3 < 13; ++var3) {
							var4 = Client.instanceChunkTemplates[0][var2][var3];
							if (var4 == -1) {
								PlayerComposition.method5408(var2 * 8, var3 * 8, 8, 8);
							}
						}
					}

					InvDefinition.method3268(true);

					for (var2 = 0; var2 < 4; ++var2) {
						ArchiveLoader.playPcmPlayers();

						for (var3 = 0; var3 < 13; ++var3) {
							for (var4 = 0; var4 < 13; ++var4) {
								var5 = Client.instanceChunkTemplates[var2][var3][var4];
								if (var5 != -1) {
									var6 = var5 >> 24 & 3;
									var7 = var5 >> 1 & 3;
									var8 = var5 >> 14 & 1023;
									var9 = var5 >> 3 & 2047;
									var10 = (var8 / 8 << 8) + var9 / 8;

									for (var11 = 0; var11 < class241.regions.length; ++var11) {
										if (class241.regions[var11] == var10 && FloorUnderlayDefinition.regionMapArchives[var11] != null) {
											Tiles.method2033(FloorUnderlayDefinition.regionMapArchives[var11], var2, var3 * 8, var4 * 8, var6, (var8 & 7) * 8, (var9 & 7) * 8, var7, class175.scene, Client.collisionMaps);
											break;
										}
									}
								}
							}
						}
					}
				}

				InvDefinition.method3268(true);
				ArchiveLoader.playPcmPlayers();
				class268.method5029(class175.scene, Client.collisionMaps);
				InvDefinition.method3268(true);
				var2 = Tiles.Tiles_minPlane;
				if (var2 > class128.Client_plane) {
					var2 = class128.Client_plane;
				}

				if (var2 < class128.Client_plane - 1) {
					var2 = class128.Client_plane - 1;
				}

				if (Client.isLowDetail) {
					class175.scene.init(Tiles.Tiles_minPlane);
				} else {
					class175.scene.init(0);
				}

				for (var3 = 0; var3 < 104; ++var3) {
					for (var4 = 0; var4 < 104; ++var4) {
						Frames.updateItemPile(var3, var4);
					}
				}

				ArchiveLoader.playPcmPlayers();
				ReflectionCheck.method600();
				ObjectComposition.ObjectDefinition_cachedModelData.clear();
				PacketBufferNode var17;
				if (class82.client.hasFrame()) {
					var17 = DecorativeObject.getPacketBufferNode(ClientPacket.field2948, Client.packetWriter.isaacCipher);
					var17.packetBuffer.writeInt(1057001181);
					Client.packetWriter.addNode(var17);
				}

				if (!Client.isInInstance) {
					var3 = (WorldMapSectionType.field2828 - 6) / 8;
					var4 = (WorldMapSectionType.field2828 + 6) / 8;
					var5 = (class433.field4657 - 6) / 8;
					var6 = (class433.field4657 + 6) / 8;

					for (var7 = var3 - 1; var7 <= var4 + 1; ++var7) {
						for (var8 = var5 - 1; var8 <= var6 + 1; ++var8) {
							if (var7 < var3 || var7 > var4 || var8 < var5 || var8 > var6) {
								Message.archive5.loadRegionFromName("m" + var7 + "_" + var8);
								Message.archive5.loadRegionFromName("l" + var7 + "_" + var8);
							}
						}
					}
				}

				PendingSpawn.updateGameState(30);
				ArchiveLoader.playPcmPlayers();
				PcmPlayer.method753();
				var17 = DecorativeObject.getPacketBufferNode(ClientPacket.field3031, Client.packetWriter.isaacCipher);
				Client.packetWriter.addNode(var17);
				WorldMap.method7222();
			}
		}
	}
}
