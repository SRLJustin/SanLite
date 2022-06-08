import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ld")
@Implements("GrandExchangeOfferTotalQuantityComparator")
final class GrandExchangeOfferTotalQuantityComparator implements Comparator {
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1165862303
	)
	static int field4069;

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lln;Lln;B)I",
		garbageValue = "127"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.grandExchangeOffer.totalQuantity < var2.grandExchangeOffer.totalQuantity ? -1 : (var2.grandExchangeOffer.totalQuantity == var1.grandExchangeOffer.totalQuantity ? 0 : 1);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "(Lki;I)V",
		garbageValue = "-842316290"
	)
	static void method5781(Widget var0) {
		if (var0 != null && var0.cycle == Client.field694) {
			Client.field652[var0.rootIndex] = true;
		}

	}
}
