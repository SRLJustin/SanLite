import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pg")
public enum class429 implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	@Export("SOLID")
	SOLID(0, 0),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	field4552(1, 1),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	field4553(2, 2);

	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1360847973
	)
	public final int field4554;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -54692009
	)
	final int field4551;

	class429(int var3, int var4) {
		this.field4554 = var3;
		this.field4551 = var4;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "48"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4551;
	}
}
