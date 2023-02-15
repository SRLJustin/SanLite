import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cs")
@Implements("ItemContainer")
public class ItemContainer extends Node {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lqg;"
	)
	@Export("itemContainers")
	static NodeHashTable itemContainers;
	@ObfuscatedName("w")
	@Export("ids")
	int[] ids;
	@ObfuscatedName("v")
	@Export("quantities")
	int[] quantities;

	static {
		itemContainers = new NodeHashTable(32);
	}

	ItemContainer() {
		this.ids = new int[]{-1};
		this.quantities = new int[]{0};
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IB)Lde;",
		garbageValue = "95"
	)
	static class123 method2292(int var0) {
		class123 var1 = (class123)class4.findEnumerated(UrlRequester.method2852(), var0);
		if (var1 == null) {
			var1 = class123.field1502;
		}

		return var1;
	}
}
