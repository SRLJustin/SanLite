import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fu")
public class class175 {
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("SpotAnimationDefinition_modelArchive")
	public static AbstractArchive SpotAnimationDefinition_modelArchive;
	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "Lgm;"
	)
	@Export("scene")
	static Scene scene;

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2044568477"
	)
	public static void method3380() {
		WorldMapRegion.WorldMapRegion_cachedSprites.demote(5);
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(III)Lbo;",
		garbageValue = "-586854513"
	)
	@Export("Messages_getByChannelAndID")
	static Message Messages_getByChannelAndID(int var0, int var1) {
		ChatChannel var2 = (ChatChannel)Messages.Messages_channels.get(var0);
		return var2.getMessage(var1);
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-482569171"
	)
	public static void method3379() {
		HealthBarDefinition.HealthBarDefinition_cached.clear();
		HealthBarDefinition.HealthBarDefinition_cachedSprites.clear();
	}

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIZI)V",
		garbageValue = "1857595187"
	)
	@Export("insertMenuItem")
	static final void insertMenuItem(String var0, String var1, int var2, int var3, int var4, int var5, boolean var6) {
		if (!Client.isMenuOpen) {
			if (Client.menuOptionsCount < 500) {
				Client.menuActions[Client.menuOptionsCount] = var0;
				Client.menuTargets[Client.menuOptionsCount] = var1;
				Client.menuOpcodes[Client.menuOptionsCount] = var2;
				Client.menuIdentifiers[Client.menuOptionsCount] = var3;
				Client.menuArguments1[Client.menuOptionsCount] = var4;
				Client.menuArguments2[Client.menuOptionsCount] = var5;
				Client.menuShiftClick[Client.menuOptionsCount] = var6;
				++Client.menuOptionsCount;
			}

		}
	}

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIB)V",
		garbageValue = "0"
	)
	@Export("drawWidgets")
	static final void drawWidgets(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (WorldMapDecoration.loadInterface(var0)) {
			BuddyRankComparator.field1408 = null;
			ViewportMouse.drawInterface(NetSocket.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6, var7);
			if (BuddyRankComparator.field1408 != null) {
				ViewportMouse.drawInterface(BuddyRankComparator.field1408, -1412584499, var1, var2, var3, var4, class151.field1729, class162.field1810, var7);
				BuddyRankComparator.field1408 = null;
			}

		} else {
			if (var7 != -1) {
				Client.field652[var7] = true;
			} else {
				for (int var8 = 0; var8 < 100; ++var8) {
					Client.field652[var8] = true;
				}
			}

		}
	}

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1703551260"
	)
	static final void method3373() {
		Client.field691 = Client.cycleCntr;
		Tiles.field997 = true;
	}
}
