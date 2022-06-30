import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lq")
@Implements("GrandExchangeOfferAgeComparator")
final class GrandExchangeOfferAgeComparator implements Comparator {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Llj;Llj;B)I",
		garbageValue = "-38"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.age < var2.age ? -1 : (var1.age == var2.age ? 0 : 1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("v")
	static final void method5989(long var0) {
		try {
			Thread.sleep(var0);
		} catch (InterruptedException var3) {
		}

	}

	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "(I)Loe;",
		garbageValue = "439042509"
	)
	@Export("getWorldMap")
	static WorldMap getWorldMap() {
		return class121.worldMap;
	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "47"
	)
	@Export("selectSpell")
	static void selectSpell(int var0, int var1, int var2, int var3) {
		Widget var4 = ScriptFrame.getWidgetChild(var0, var1);
		if (var4 != null && var4.onTargetEnter != null) {
			ScriptEvent var5 = new ScriptEvent();
			var5.widget = var4;
			var5.args = var4.onTargetEnter;
			WallObject.runScriptEvent(var5);
		}

		Client.field651 = var3;
		Client.isSpellSelected = true;
		NetCache.selectedSpellWidget = var0;
		Client.selectedSpellChildIndex = var1;
		HealthBar.selectedSpellFlags = var2;
		ChatChannel.method1994(var4);
	}
}
