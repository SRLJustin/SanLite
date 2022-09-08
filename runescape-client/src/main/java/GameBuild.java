import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kg")
@Implements("GameBuild")
public class GameBuild {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	@Export("LIVE")
	static final GameBuild LIVE;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	@Export("BUILDLIVE")
	static final GameBuild BUILDLIVE;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	@Export("RC")
	static final GameBuild RC;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	@Export("WIP")
	static final GameBuild WIP;
	@ObfuscatedName("k")
	@Export("name")
	public final String name;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -739998815
	)
	@Export("buildId")
	public final int buildId;

	static {
		LIVE = new GameBuild("LIVE", 0);
		BUILDLIVE = new GameBuild("BUILDLIVE", 3);
		RC = new GameBuild("RC", 1);
		WIP = new GameBuild("WIP", 2);
	}

	GameBuild(String var1, int var2) {
		this.name = var1;
		this.buildId = var2;
	}

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "([Lkw;II)V",
		garbageValue = "788410132"
	)
	@Export("runComponentCloseListeners")
	static final void runComponentCloseListeners(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) {
			Widget var3 = var0[var2];
			if (var3 != null) {
				if (var3.type == 0) {
					if (var3.children != null) {
						runComponentCloseListeners(var3.children, var1);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id);
					if (var4 != null) {
						class18.runIntfCloseListeners(var4.group, var1);
					}
				}

				ScriptEvent var5;
				if (var1 == 0 && var3.onDialogAbort != null) {
					var5 = new ScriptEvent();
					var5.widget = var3;
					var5.args = var3.onDialogAbort;
					class348.runScriptEvent(var5);
				}

				if (var1 == 1 && var3.onSubChange != null) {
					if (var3.childIndex >= 0) {
						Widget var6 = SpotAnimationDefinition.getWidget(var3.id);
						if (var6 == null || var6.children == null || var3.childIndex >= var6.children.length || var3 != var6.children[var3.childIndex]) {
							continue;
						}
					}

					var5 = new ScriptEvent();
					var5.widget = var3;
					var5.args = var3.onSubChange;
					class348.runScriptEvent(var5);
				}
			}
		}

	}

	@ObfuscatedName("md")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "-1671333815"
	)
	@Export("findItemDefinitions")
	static void findItemDefinitions(String var0, boolean var1) {
		var0 = var0.toLowerCase();
		short[] var2 = new short[16];
		int var3 = 0;

		for (int var4 = 0; var4 < ItemComposition.ItemDefinition_fileCount; ++var4) {
			ItemComposition var9 = UserComparator3.ItemDefinition_get(var4);
			if ((!var1 || var9.isTradable) && var9.noteTemplate == -1 && var9.name.toLowerCase().indexOf(var0) != -1) {
				if (var3 >= 250) {
					UserComparator4.foundItemIdCount = -1;
					class283.foundItemIds = null;
					return;
				}

				if (var3 >= var2.length) {
					short[] var6 = new short[var2.length * 2];

					for (int var7 = 0; var7 < var3; ++var7) {
						var6[var7] = var2[var7];
					}

					var2 = var6;
				}

				var2[var3++] = (short)var4;
			}
		}

		class283.foundItemIds = var2;
		GameEngine.foundItemIndex = 0;
		UserComparator4.foundItemIdCount = var3;
		String[] var8 = new String[UserComparator4.foundItemIdCount];

		for (int var5 = 0; var5 < UserComparator4.foundItemIdCount; ++var5) {
			var8[var5] = UserComparator3.ItemDefinition_get(var2[var5]).name;
		}

		class229.method5022(var8, class283.foundItemIds);
	}
}
