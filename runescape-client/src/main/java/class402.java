import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("oc")
public class class402 {
	@ObfuscatedName("c")
	static final int[] field4457;
	@ObfuscatedName("w")
	static final int[] field4458;
	@ObfuscatedName("fr")
	static String field4461;
	@ObfuscatedName("mm")
	@ObfuscatedGetter(
		intValue = -552578051
	)
	@Export("menuWidth")
	static int menuWidth;

	static {
		field4457 = new int[16384];
		field4458 = new int[16384];
		double var0 = 3.834951969714103E-4D;

		for (int var2 = 0; var2 < 16384; ++var2) {
			field4457[var2] = (int)(16384.0D * Math.sin((double)var2 * var0));
			field4458[var2] = (int)(16384.0D * Math.cos(var0 * (double)var2));
		}

	}
}
