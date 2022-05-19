import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ox")
public class class403 {
	@ObfuscatedName("sg")
	@ObfuscatedSignature(
		descriptor = "Lbr;"
	)
	static Decimator field4455;
	@ObfuscatedName("v")
	static final int[] field4453;
	@ObfuscatedName("y")
	static final int[] field4450;

	static {
		field4453 = new int[2048];
		field4450 = new int[2048];
		double var0 = 0.0030679615757712823D;

		for (int var2 = 0; var2 < 2048; ++var2) {
			field4453[var2] = (int)(65536.0D * Math.sin(var0 * (double)var2));
			field4450[var2] = (int)(65536.0D * Math.cos(var0 * (double)var2));
		}

	}
}
