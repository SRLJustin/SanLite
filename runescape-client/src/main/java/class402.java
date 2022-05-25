import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("or")
public class class402 {
	@ObfuscatedName("a")
	static final int[] field4444;
	@ObfuscatedName("m")
	static final int[] field4445;

	static {
		field4444 = new int[16384];
		field4445 = new int[16384];
		double var0 = 3.834951969714103E-4D;

		for (int var2 = 0; var2 < 16384; ++var2) {
			field4444[var2] = (int)(16384.0D * Math.sin((double)var2 * var0));
			field4445[var2] = (int)(16384.0D * Math.cos(var0 * (double)var2));
		}

	}
}
