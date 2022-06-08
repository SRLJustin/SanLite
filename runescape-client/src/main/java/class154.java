import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ez")
public class class154 extends class166 {
	@ObfuscatedName("v")
	@Export("Tiles_hue")
	static int[] Tiles_hue;
	@ObfuscatedName("o")
	String field1738;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	final class155 this$0;

	@ObfuscatedSignature(
		descriptor = "(Leq;Ljava/lang/String;Ljava/lang/String;)V"
	)
	class154(class155 var1, String var2, String var3) {
		super(var1, var2);
		this.this$0 = var1;
		this.field1738 = var3;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1005057629"
	)
	public int vmethod3227() {
		return 1;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "59"
	)
	public String vmethod3238() {
		return this.field1738;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Llp;Llp;I)Z",
		garbageValue = "169526997"
	)
	public static boolean method3059(AbstractArchive var0, AbstractArchive var1) {
		GrandExchangeOfferWorldComparator.WorldMapElement_archive = var1;
		if (!var0.isFullyLoaded()) {
			return false;
		} else {
			WorldMapElement.WorldMapElement_count = var0.getGroupFileCount(35);
			class344.WorldMapElement_cached = new WorldMapElement[WorldMapElement.WorldMapElement_count];

			for (int var2 = 0; var2 < WorldMapElement.WorldMapElement_count; ++var2) {
				byte[] var3 = var0.takeFile(35, var2);
				class344.WorldMapElement_cached[var2] = new WorldMapElement(var2);
				if (var3 != null) {
					class344.WorldMapElement_cached[var2].decode(new Buffer(var3));
					class344.WorldMapElement_cached[var2].method3291();
				}
			}

			return true;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lpt;IIB)I",
		garbageValue = "52"
	)
	static int method3061(IterableNodeHashTable var0, int var1, int var2) {
		if (var0 == null) {
			return var2;
		} else {
			IntegerNode var3 = (IntegerNode)var0.get((long)var1);
			return var3 == null ? var2 : var3.integer;
		}
	}
}
