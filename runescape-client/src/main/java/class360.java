import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mc")
public class class360 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final class360 field4274;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	static final class360 field4272;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1759688503
	)
	final int field4273;

	static {
		field4274 = new class360(0);
		field4272 = new class360(1);
	}

	class360(int var1) {
		this.field4273 = var1;
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "732758346"
	)
	static final void method6393() {
		Client.field606 = 0;
		int var0 = SecureRandomCallable.baseX * 64 + (ModelData0.localPlayer.x >> 7);
		int var1 = GrandExchangeOfferOwnWorldComparator.baseY * 64 + (ModelData0.localPlayer.y >> 7);
		if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
			Client.field606 = 1;
		}

		if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
			Client.field606 = 1;
		}

		if (Client.field606 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
			Client.field606 = 0;
		}

	}
}
