import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ln")
public enum class323 implements Enumerated {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "Lln;"
	)
	field3852(1, 0),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "Lln;"
	)
	field3851(0, 2),
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "Lln;"
	)
	field3849(2, 5),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "Lln;"
	)
	field3856(3, 6),
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		signature = "Lln;"
	)
	field3853(4, 7),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "Lln;"
	)
	field3854(5, 8);

	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 397636239
	)
	final int field3855;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 961427767
	)
	final int field3850;

	class323(int var3, int var4) {
		this.field3855 = var3;
		this.field3850 = var4;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		garbageValue = "63",
		signature = "(B)I"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3850;
	}
}
