import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cg")
@Implements("TileItem")
public final class TileItem extends Renderable {
	@ObfuscatedName("sb")
	@ObfuscatedGetter(
		intValue = -1473167360
	)
	static int field1292;
	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("archive9")
	static Archive archive9;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -2046412949
	)
	@Export("id")
	int id;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 129863863
	)
	@Export("quantity")
	int quantity;

	TileItem() {
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Lhv;",
		garbageValue = "-238822980"
	)
	@Export("getModel")
	protected final Model getModel() {
		return FileSystem.ItemDefinition_get(this.id).getModel(this.quantity);
	}

	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "(Lgq;IIIB)V",
		garbageValue = "11"
	)
	static void method2407(SequenceDefinition var0, int var1, int var2, int var3) {
		if (Client.soundEffectCount < 50 && class12.clientPreferences.method2239() != 0) {
			if (var0.field2209 != null && var0.field2209.containsKey(var1)) {
				MouseHandler.method588((Integer)var0.field2209.get(var1), var2, var3);
			}
		}
	}
}
