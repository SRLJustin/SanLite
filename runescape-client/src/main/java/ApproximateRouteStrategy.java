import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bl")
@Implements("ApproximateRouteStrategy")
public class ApproximateRouteStrategy extends RouteStrategy {
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Lke;"
	)
	static StudioGame field473;
	@ObfuscatedName("fw")
	static String field471;

	ApproximateRouteStrategy() {
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIILgh;I)Z",
		garbageValue = "-425355466"
	)
	@Export("hasArrived")
	public boolean hasArrived(int var1, int var2, int var3, CollisionMap var4) {
		return var2 == super.approxDestinationX && var3 == super.approxDestinationY;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lki;",
		garbageValue = "-103"
	)
	@Export("getWidgetChild")
	public static Widget getWidgetChild(int var0, int var1) {
		Widget var2 = class92.getWidget(var0);
		if (var1 == -1) {
			return var2;
		} else {
			return var2 != null && var2.children != null && var1 < var2.children.length ? var2.children[var1] : null;
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-630623402"
	)
	public static void method1110() {
		class273.midiPcmStream.clear();
		class273.musicPlayerStatus = 1;
		ClanChannelMember.musicTrackArchive = null;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)[Lcq;",
		garbageValue = "768338863"
	)
	static AttackOption[] method1108() {
		return new AttackOption[]{AttackOption.AttackOption_hidden, AttackOption.field1285, AttackOption.AttackOption_alwaysRightClick, AttackOption.field1283, AttackOption.AttackOption_dependsOnCombatLevels};
	}

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "(Lca;IIII)V",
		garbageValue = "611280226"
	)
	@Export("addPlayerToMenu")
	static final void addPlayerToMenu(Player var0, int var1, int var2, int var3) {
		if (ModelData0.localPlayer != var0) {
			if (Client.menuOptionsCount < 400) {
				String var4;
				if (var0.skillLevel == 0) {
					var4 = var0.actions[0] + var0.username + var0.actions[1] + IgnoreList.method6430(var0.combatLevel, ModelData0.localPlayer.combatLevel) + " " + " (" + "level-" + var0.combatLevel + ")" + var0.actions[2];
				} else {
					var4 = var0.actions[0] + var0.username + var0.actions[1] + " " + " (" + "skill-" + var0.skillLevel + ")" + var0.actions[2];
				}

				int var5;
				if (Client.isItemSelected == 1) {
					Projectile.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + class166.colorStartTag(16777215) + var4, 14, var1, var2, var3);
				} else if (Client.isSpellSelected) {
					if ((class113.selectedSpellFlags & 8) == 8) {
						Projectile.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class166.colorStartTag(16777215) + var4, 15, var1, var2, var3);
					}
				} else {
					for (var5 = 7; var5 >= 0; --var5) {
						if (Client.playerMenuActions[var5] != null) {
							short var6 = 0;
							if (Client.playerMenuActions[var5].equalsIgnoreCase("Attack")) {
								if (Client.playerAttackOption == AttackOption.AttackOption_hidden) {
									continue;
								}

								if (AttackOption.AttackOption_alwaysRightClick == Client.playerAttackOption || Client.playerAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var0.combatLevel > ModelData0.localPlayer.combatLevel) {
									var6 = 2000;
								}

								if (ModelData0.localPlayer.team != 0 && var0.team != 0) {
									if (var0.team == ModelData0.localPlayer.team) {
										var6 = 2000;
									} else {
										var6 = 0;
									}
								} else if (AttackOption.field1283 == Client.playerAttackOption && var0.isClanMember()) {
									var6 = 2000;
								}
							} else if (Client.playerOptionsPriorities[var5]) {
								var6 = 2000;
							}

							boolean var7 = false;
							int var8 = Client.playerMenuOpcodes[var5] + var6;
							Projectile.insertMenuItemNoShift(Client.playerMenuActions[var5], class166.colorStartTag(16777215) + var4, var8, var1, var2, var3);
						}
					}
				}

				for (var5 = 0; var5 < Client.menuOptionsCount; ++var5) {
					if (Client.menuOpcodes[var5] == 23) {
						Client.menuTargets[var5] = class166.colorStartTag(16777215) + var4;
						break;
					}
				}

			}
		}
	}
}
