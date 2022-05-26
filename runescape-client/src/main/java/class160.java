import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fd")
public class class160 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lcb;"
	)
	public UrlRequest field1783;
	@ObfuscatedName("q")
	public float[] field1782;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	final class155 this$0;

	@ObfuscatedSignature(
		descriptor = "(Leq;)V"
	)
	class160(class155 var1) {
		this.this$0 = var1;
		this.field1782 = new float[4];
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IB)Lfa;",
		garbageValue = "31"
	)
	public static FloorUnderlayDefinition method3171(int var0) {
		FloorUnderlayDefinition var1 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var0);
			var1 = new FloorUnderlayDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2), var0);
			}

			var1.postDecode();
			FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(II)Ldl;",
		garbageValue = "-638516469"
	)
	static class118 method3169(int var0) {
		class118 var1 = (class118)class291.findEnumerated(HealthBar.method2333(), var0);
		if (var1 == null) {
			var1 = class118.field1498;
		}

		return var1;
	}

	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "(Lki;IIB)V",
		garbageValue = "43"
	)
	@Export("Widget_addToMenu")
	static final void Widget_addToMenu(Widget var0, int var1, int var2) {
		if (var0.buttonType == 1) {
			Projectile.insertMenuItemNoShift(var0.buttonText, "", 24, 0, 0, var0.id);
		}

		String var3;
		if (var0.buttonType == 2 && !Client.isSpellSelected) {
			var3 = TriBool.Widget_getSpellActionName(var0);
			if (var3 != null) {
				Projectile.insertMenuItemNoShift(var3, class166.colorStartTag(65280) + var0.spellName, 25, 0, -1, var0.id);
			}
		}

		if (var0.buttonType == 3) {
			Projectile.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id);
		}

		if (var0.buttonType == 4) {
			Projectile.insertMenuItemNoShift(var0.buttonText, "", 28, 0, 0, var0.id);
		}

		if (var0.buttonType == 5) {
			Projectile.insertMenuItemNoShift(var0.buttonText, "", 29, 0, 0, var0.id);
		}

		if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) {
			Projectile.insertMenuItemNoShift(var0.buttonText, "", 30, 0, -1, var0.id);
		}

		int var4;
		int var5;
		int var19;
		if (var0.type == 2) {
			var19 = 0;

			for (var4 = 0; var4 < var0.height; ++var4) {
				for (var5 = 0; var5 < var0.width; ++var5) {
					int var6 = (var0.paddingX + 32) * var5;
					int var7 = (var0.paddingY + 32) * var4;
					if (var19 < 20) {
						var6 += var0.inventoryXOffsets[var19];
						var7 += var0.inventoryYOffsets[var19];
					}

					if (var1 >= var6 && var2 >= var7 && var1 < var6 + 32 && var2 < var7 + 32) {
						Client.dragItemSlotDestination = var19;
						class155.hoveredItemContainer = var0;
						if (var0.itemIds[var19] > 0) {
							label328: {
								ItemComposition var8 = FileSystem.ItemDefinition_get(var0.itemIds[var19] - 1);
								boolean var9;
								int var10;
								if (Client.isItemSelected == 1) {
									var10 = UrlRequester.getWidgetFlags(var0);
									var9 = (var10 >> 30 & 1) != 0;
									if (var9) {
										if (var0.id != class20.selectedItemWidget || var19 != PcmPlayer.selectedItemSlot) {
											Projectile.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + class166.colorStartTag(16748608) + var8.name, 31, var8.id, var19, var0.id);
										}
										break label328;
									}
								}

								if (Client.isSpellSelected) {
									var10 = UrlRequester.getWidgetFlags(var0);
									var9 = (var10 >> 30 & 1) != 0;
									if (var9) {
										if ((class113.selectedSpellFlags & 16) == 16) {
											Projectile.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class166.colorStartTag(16748608) + var8.name, 32, var8.id, var19, var0.id);
										}
										break label328;
									}
								}

								String[] var22 = var8.inventoryActions;
								var10 = -1;
								boolean var11;
								if (Client.shiftClickDrop) {
									var11 = Client.tapToDrop || KeyHandler.KeyHandler_pressedKeys[81];
									if (var11) {
										var10 = var8.getShiftClickIndex();
									}
								}

								int var12 = UrlRequester.getWidgetFlags(var0);
								var11 = (var12 >> 30 & 1) != 0;
								if (var11) {
									for (int var13 = 4; var13 >= 3; --var13) {
										if (var10 != var13) {
											class321.addWidgetItemMenuItem(var0, var8, var19, var13, false);
										}
									}
								}

								int var14 = UrlRequester.getWidgetFlags(var0);
								boolean var24 = (var14 >> 31 & 1) != 0;
								if (var24) {
									Projectile.insertMenuItemNoShift("Use", class166.colorStartTag(16748608) + var8.name, 38, var8.id, var19, var0.id);
								}

								int var16 = UrlRequester.getWidgetFlags(var0);
								boolean var15 = (var16 >> 30 & 1) != 0;
								int var17;
								if (var15) {
									for (var17 = 2; var17 >= 0; --var17) {
										if (var17 != var10) {
											class321.addWidgetItemMenuItem(var0, var8, var19, var17, false);
										}
									}

									if (var10 >= 0) {
										class321.addWidgetItemMenuItem(var0, var8, var19, var10, true);
									}
								}

								var22 = var0.itemActions;
								if (var22 != null) {
									for (var17 = 4; var17 >= 0; --var17) {
										if (var22[var17] != null) {
											byte var18 = 0;
											if (var17 == 0) {
												var18 = 39;
											}

											if (var17 == 1) {
												var18 = 40;
											}

											if (var17 == 2) {
												var18 = 41;
											}

											if (var17 == 3) {
												var18 = 42;
											}

											if (var17 == 4) {
												var18 = 43;
											}

											Projectile.insertMenuItemNoShift(var22[var17], class166.colorStartTag(16748608) + var8.name, var18, var8.id, var19, var0.id);
										}
									}
								}

								Projectile.insertMenuItemNoShift("Examine", class166.colorStartTag(16748608) + var8.name, 1005, var8.id, var19, var0.id);
							}
						}
					}

					++var19;
				}
			}
		}

		if (var0.isIf3) {
			if (Client.isSpellSelected) {
				var4 = UrlRequester.getWidgetFlags(var0);
				boolean var25 = (var4 >> 21 & 1) != 0;
				if (var25 && (class113.selectedSpellFlags & 32) == 32) {
					Projectile.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + var0.dataText, 58, 0, var0.childIndex, var0.id);
				}
			} else {
				for (var19 = 9; var19 >= 5; --var19) {
					String var21 = class193.method3801(var0, var19);
					if (var21 != null) {
						Projectile.insertMenuItemNoShift(var21, var0.dataText, 1007, var19 + 1, var0.childIndex, var0.id);
					}
				}

				var3 = TriBool.Widget_getSpellActionName(var0);
				if (var3 != null) {
					Projectile.insertMenuItemNoShift(var3, var0.dataText, 25, 0, var0.childIndex, var0.id);
				}

				for (var4 = 4; var4 >= 0; --var4) {
					String var20 = class193.method3801(var0, var4);
					if (var20 != null) {
						class175.insertMenuItem(var20, var0.dataText, 57, var4 + 1, var0.childIndex, var0.id, var0.prioritizeMenuEntry);
					}
				}

				var5 = UrlRequester.getWidgetFlags(var0);
				boolean var23 = (var5 & 1) != 0;
				if (var23) {
					Projectile.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id);
				}
			}
		}

	}
}
