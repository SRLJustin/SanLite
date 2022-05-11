import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bb")
@Implements("Script")
public class Script extends DualNode {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("Script_cached")
	static EvictingDualNodeHashTable Script_cached;
	@ObfuscatedName("q")
	String field949;
	@ObfuscatedName("l")
	@Export("opcodes")
	int[] opcodes;
	@ObfuscatedName("k")
	@Export("intOperands")
	int[] intOperands;
	@ObfuscatedName("a")
	@Export("stringOperands")
	String[] stringOperands;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1638738709
	)
	@Export("localIntCount")
	int localIntCount;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 2011225427
	)
	@Export("localStringCount")
	int localStringCount;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1425203371
	)
	@Export("intArgumentCount")
	int intArgumentCount;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 2038288745
	)
	@Export("stringArgumentCount")
	int stringArgumentCount;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "[Lpt;"
	)
	@Export("switches")
	IterableNodeHashTable[] switches;

	static {
		Script_cached = new EvictingDualNodeHashTable(128);
	}

	Script() {
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IB)[Lpt;",
		garbageValue = "0"
	)
	@Export("newIterableNodeHashTable")
	IterableNodeHashTable[] newIterableNodeHashTable(int var1) {
		return new IterableNodeHashTable[var1];
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)Lfb;",
		garbageValue = "16711680"
	)
	@Export("KitDefinition_get")
	public static KitDefinition KitDefinition_get(int var0) {
		KitDefinition var1 = (KitDefinition)KitDefinition.KitDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = class18.KitDefinition_archive.takeFile(3, var0);
			var1 = new KitDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			KitDefinition.KitDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lki;IB)V",
		garbageValue = "11"
	)
	@Export("Widget_setKeyIgnoreHeld")
	static final void Widget_setKeyIgnoreHeld(Widget var0, int var1) {
		if (var0.field3474 == null) {
			throw new RuntimeException();
		} else {
			if (var0.field3527 == null) {
				var0.field3527 = new int[var0.field3474.length];
			}

			var0.field3527[var1] = Integer.MAX_VALUE;
		}
	}
}
