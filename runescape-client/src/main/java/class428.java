import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pd")
public class class428 extends class393 implements class252 {
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	final AbstractArchive field4645;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	final DemotingHashTable field4646;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 858241003
	)
	final int field4647;

	@ObfuscatedSignature(
		descriptor = "(Lke;ILlq;Llp;)V"
	)
	public class428(StudioGame var1, int var2, Language var3, AbstractArchive var4) {
		super(var1, var3, var4 != null ? var4.getGroupFileCount(var2) : 0);
		this.field4646 = new DemotingHashTable(64);
		this.field4645 = var4;
		this.field4647 = var2;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Lou;",
		garbageValue = "-318323569"
	)
	protected class395 vmethod7381(int var1) {
		synchronized(this.field4646) {
			class394 var2 = (class394)this.field4646.get((long)var1);
			if (var2 == null) {
				var2 = this.method7380(var1);
				this.field4646.method4942(var2, (long)var1);
			}

			return var2;
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IB)Low;",
		garbageValue = "52"
	)
	class394 method7380(int var1) {
		byte[] var2 = this.field4645.takeFile(this.field4647, var1);
		class394 var3 = new class394(var1);
		if (var2 != null) {
			var3.method6927(new Buffer(var2));
		}

		return var3;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-380169429"
	)
	public void method7382() {
		synchronized(this.field4646) {
			this.field4646.clear();
		}
	}

	public Iterator iterator() {
		return new class427(this);
	}
}
