import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pw")
public class class431 {
	@ObfuscatedName("z")
	static final int[] field4688;
	@ObfuscatedName("j")
	static final int[] field4690;
	@ObfuscatedName("aa")
	@Export("Widget_loadedInterfaces")
	public static boolean[] Widget_loadedInterfaces;

	static {
		field4688 = new int[16384];
		field4690 = new int[16384];
		double var0 = 3.834951969714103E-4D;

		for (int var2 = 0; var2 < 16384; ++var2) {
			field4688[var2] = (int)(16384.0D * Math.sin(var0 * (double)var2));
			field4690[var2] = (int)(16384.0D * Math.cos(var0 * (double)var2));
		}

	}

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1749639462"
	)
	static void method8067() {
		if (Client.renderSelf) {
			Decimator.addPlayerToScene(class387.localPlayer, false);
		}

	}
}
