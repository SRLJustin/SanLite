import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aj")
public class class29 {
	@ObfuscatedName("td")
	@ObfuscatedGetter(
		intValue = -1512161280
	)
	static int field172;
	@ObfuscatedName("s")
	public static Applet field174;
	@ObfuscatedName("h")
	public static String field167;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	static IndexedSprite field168;

	static {
		field174 = null;
		field167 = "";
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IB)F",
		garbageValue = "-43"
	)
	public static float method388(int var0) {
		var0 &= 16383;
		return (float)((double)((float)var0 / 16384.0F) * 6.283185307179586D);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "31"
	)
	static void method391(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var1 != null) {
			var1.remove();
		}
	}

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "(Lcb;ZB)V",
		garbageValue = "4"
	)
	@Export("closeInterface")
	static final void closeInterface(InterfaceParent var0, boolean var1) {
		int var2 = var0.group;
		int var3 = (int)var0.key;
		var0.remove();
		if (var1 && var2 != -1 && Widget.Widget_loadedInterfaces[var2]) {
			class438.Widget_archive.clearFilesGroup(var2);
			if (class358.Widget_interfaceComponents[var2] != null) {
				boolean var4 = true;

				for (int var5 = 0; var5 < class358.Widget_interfaceComponents[var2].length; ++var5) {
					if (class358.Widget_interfaceComponents[var2][var5] != null) {
						if (class358.Widget_interfaceComponents[var2][var5].type != 2) {
							class358.Widget_interfaceComponents[var2][var5] = null;
						} else {
							var4 = false;
						}
					}
				}

				if (var4) {
					class358.Widget_interfaceComponents[var2] = null;
				}

				Widget.Widget_loadedInterfaces[var2] = false;
			}
		}

		StudioGame.method5676(var2);
		Widget var6 = HitSplatDefinition.getWidget(var3);
		if (var6 != null) {
			class125.method2770(var6);
		}

		if (Client.rootInterface != -1) {
			ModelData0.runIntfCloseListeners(Client.rootInterface, 1);
		}

	}
}
