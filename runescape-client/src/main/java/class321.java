import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lg")
public class class321 {
	@ObfuscatedName("ih")
	@ObfuscatedGetter(
		intValue = 1257274213
	)
	static int field4076;

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "(Lki;Lgl;IIZB)V",
		garbageValue = "1"
	)
	@Export("addWidgetItemMenuItem")
	static final void addWidgetItemMenuItem(Widget var0, ItemComposition var1, int var2, int var3, boolean var4) {
		String[] var5 = var1.inventoryActions;
		byte var6 = -1;
		String var7 = null;
		if (var5 != null && var5[var3] != null) {
			if (var3 == 0) {
				var6 = 33;
			} else if (var3 == 1) {
				var6 = 34;
			} else if (var3 == 2) {
				var6 = 35;
			} else if (var3 == 3) {
				var6 = 36;
			} else {
				var6 = 37;
			}

			var7 = var5[var3];
		} else if (var3 == 4) {
			var6 = 37;
			var7 = "Drop";
		}

		if (var6 != -1 && var7 != null) {
			class175.insertMenuItem(var7, class166.colorStartTag(16748608) + var1.name, var6, var1.id, var2, var0.id, var4);
		}

	}

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1133585766"
	)
	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		class119.method2737();

		for (ObjectSound var1 = (ObjectSound)ObjectSound.objectSounds.last(); var1 != null; var1 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var1.obj != null) {
				var1.set();
			}
		}

		int var3 = class21.VarpDefinition_get(var0).type;
		if (var3 != 0) {
			int var2 = Varps.Varps_main[var0];
			if (var3 == 1) {
				if (var2 == 1) {
					Rasterizer3D.Rasterizer3D_setBrightness(0.9D);
					((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).setBrightness(0.9D);
					VerticalAlignment.method3446();
					class12.clientPreferences.method2232(0.9D);
				}

				if (var2 == 2) {
					Rasterizer3D.Rasterizer3D_setBrightness(0.8D);
					((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).setBrightness(0.8D);
					VerticalAlignment.method3446();
					class12.clientPreferences.method2232(0.8D);
				}

				if (var2 == 3) {
					Rasterizer3D.Rasterizer3D_setBrightness(0.7D);
					((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).setBrightness(0.7D);
					VerticalAlignment.method3446();
					class12.clientPreferences.method2232(0.7D);
				}

				if (var2 == 4) {
					Rasterizer3D.Rasterizer3D_setBrightness(0.6D);
					((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).setBrightness(0.6D);
					VerticalAlignment.method3446();
					class12.clientPreferences.method2232(0.6D);
				}
			}

			if (var3 == 3) {
				if (var2 == 0) {
					class291.method5390(255);
				}

				if (var2 == 1) {
					class291.method5390(192);
				}

				if (var2 == 2) {
					class291.method5390(128);
				}

				if (var2 == 3) {
					class291.method5390(64);
				}

				if (var2 == 4) {
					class291.method5390(0);
				}
			}

			if (var3 == 4) {
				if (var2 == 0) {
					class67.method1881(127);
				}

				if (var2 == 1) {
					class67.method1881(96);
				}

				if (var2 == 2) {
					class67.method1881(64);
				}

				if (var2 == 3) {
					class67.method1881(32);
				}

				if (var2 == 4) {
					class67.method1881(0);
				}
			}

			if (var3 == 5) {
				Client.leftClickOpensMenu = var2;
			}

			if (var3 == 6) {
				Client.chatEffects = var2;
			}

			if (var3 == 9) {
				Client.field480 = var2;
			}

			if (var3 == 10) {
				if (var2 == 0) {
					MouseHandler.method591(127);
				}

				if (var2 == 1) {
					MouseHandler.method591(96);
				}

				if (var2 == 2) {
					MouseHandler.method591(64);
				}

				if (var2 == 3) {
					MouseHandler.method591(32);
				}

				if (var2 == 4) {
					MouseHandler.method591(0);
				}
			}

			if (var3 == 17) {
				Client.followerIndex = var2 & 65535;
			}

			if (var3 == 18) {
				Client.playerAttackOption = (AttackOption)class291.findEnumerated(ApproximateRouteStrategy.method1108(), var2);
				if (Client.playerAttackOption == null) {
					Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

			if (var3 == 19) {
				if (var2 == -1) {
					Client.combatTargetPlayerIndex = -1;
				} else {
					Client.combatTargetPlayerIndex = var2 & 2047;
				}
			}

			if (var3 == 22) {
				Client.npcAttackOption = (AttackOption)class291.findEnumerated(ApproximateRouteStrategy.method1108(), var2);
				if (Client.npcAttackOption == null) {
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

		}
	}
}
