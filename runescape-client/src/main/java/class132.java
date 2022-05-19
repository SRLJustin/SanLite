import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ej")
public class class132 extends class128 {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1443435093
	)
	int field1599;
	@ObfuscatedName("q")
	byte field1597;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Leh;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Leh;)V"
	)
	class132(class131 var1) {
		this.this$0 = var1;
		this.field1599 = -1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)V",
		garbageValue = "-611912046"
	)
	void vmethod3040(Buffer var1) {
		this.field1599 = var1.readUnsignedShort();
		this.field1597 = var1.readByte();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lek;B)V",
		garbageValue = "-73"
	)
	void vmethod3041(ClanSettings var1) {
		var1.method2930(this.field1599, this.field1597);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IS)J",
		garbageValue = "-14369"
	)
	public static long method2833(int var0) {
		return ViewportMouse.ViewportMouse_entityTags[var0];
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "([BIIB)Z",
		garbageValue = "-32"
	)
	static final boolean method2834(byte[] var0, int var1, int var2) {
		boolean var3 = true;
		Buffer var4 = new Buffer(var0);
		int var5 = -1;

		label71:
		while (true) {
			int var6 = var4.method7531();
			if (var6 == 0) {
				return var3;
			}

			var5 += var6;
			int var7 = 0;
			boolean var8 = false;

			while (true) {
				int var9;
				while (!var8) {
					var9 = var4.readUShortSmart();
					if (var9 == 0) {
						continue label71;
					}

					var7 += var9 - 1;
					int var10 = var7 & 63;
					int var11 = var7 >> 6 & 63;
					int var12 = var4.readUnsignedByte() >> 2;
					int var13 = var11 + var1;
					int var14 = var10 + var2;
					if (var13 > 0 && var14 > 0 && var13 < 103 && var14 < 103) {
						ObjectComposition var15 = class82.getObjectDefinition(var5);
						if (var12 != 22 || !Client.isLowDetail || var15.int1 != 0 || var15.interactType == 1 || var15.boolean2) {
							if (!var15.needsModelFiles()) {
								++Client.field570;
								var3 = false;
							}

							var8 = true;
						}
					}
				}

				var9 = var4.readUShortSmart();
				if (var9 == 0) {
					break;
				}

				var4.readUnsignedByte();
			}
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Laj;I)V",
		garbageValue = "-1921096355"
	)
	static void method2829(GameEngine var0) {
		while (TaskHandler.isKeyDown()) {
			if (class12.field61 == 13) {
				WorldMapScaleHandler.method4927();
				return;
			}

			if (class12.field61 == 96) {
				if (Login.worldSelectPage > 0 && class126.worldSelectLeftSprite != null) {
					--Login.worldSelectPage;
				}
			} else if (class12.field61 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && class424.worldSelectRightSprite != null) {
				++Login.worldSelectPage;
			}
		}

		if (MouseHandler.MouseHandler_lastButton == 1 || !Login.mouseCam && MouseHandler.MouseHandler_lastButton == 4) {
			int var1 = Login.xPadding + 280;
			if (MouseHandler.MouseHandler_lastPressedX >= var1 && MouseHandler.MouseHandler_lastPressedX <= var1 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				class306.changeWorldSelectSorting(0, 0);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var1 + 15 && MouseHandler.MouseHandler_lastPressedX <= var1 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				class306.changeWorldSelectSorting(0, 1);
				return;
			}

			int var2 = Login.xPadding + 390;
			if (MouseHandler.MouseHandler_lastPressedX >= var2 && MouseHandler.MouseHandler_lastPressedX <= var2 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				class306.changeWorldSelectSorting(1, 0);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var2 + 15 && MouseHandler.MouseHandler_lastPressedX <= var2 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				class306.changeWorldSelectSorting(1, 1);
				return;
			}

			int var3 = Login.xPadding + 500;
			if (MouseHandler.MouseHandler_lastPressedX >= var3 && MouseHandler.MouseHandler_lastPressedX <= var3 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				class306.changeWorldSelectSorting(2, 0);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var3 + 15 && MouseHandler.MouseHandler_lastPressedX <= var3 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				class306.changeWorldSelectSorting(2, 1);
				return;
			}

			int var4 = Login.xPadding + 610;
			if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var4 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				class306.changeWorldSelectSorting(3, 0);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var4 + 15 && MouseHandler.MouseHandler_lastPressedX <= var4 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				class306.changeWorldSelectSorting(3, 1);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) {
				WorldMapScaleHandler.method4927();
				return;
			}

			if (Login.hoveredWorldIndex != -1) {
				World var5 = World.World_worlds[Login.hoveredWorldIndex];
				InvDefinition.changeWorld(var5);
				WorldMapScaleHandler.method4927();
				return;
			}

			if (Login.worldSelectPage > 0 && class126.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= class126.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= class433.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class433.canvasHeight / 2 + 50) {
				--Login.worldSelectPage;
			}

			if (Login.worldSelectPage < Login.worldSelectPagesCount && class424.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= GraphicsObject.canvasWidth - class424.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= GraphicsObject.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= class433.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class433.canvasHeight / 2 + 50) {
				++Login.worldSelectPage;
			}
		}

	}

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1705854659"
	)
	static final void method2836(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) {
			if (Client.rootWidgetWidths[var4] + Client.rootWidgetXs[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetYs[var4] + Client.rootWidgetHeights[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) {
				Client.field652[var4] = true;
			}
		}

	}
}
