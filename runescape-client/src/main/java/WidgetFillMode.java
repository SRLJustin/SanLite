import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lj")
public enum WidgetFillMode implements Enumerated {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "Llj;"
	)
	@Export("SOLID")
	SOLID(0, 0),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "Llj;"
	)
	field3897(1, 1),
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "Llj;"
	)
	field3898(2, 2);

	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1992705459
	)
	public final int field3902;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1944525395
	)
	final int field3900;

	WidgetFillMode(int var3, int var4) {
		this.field3902 = var3;
		this.field3900 = var4;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-275768542"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3900;
	}
}
