import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mw")
public final class class363 implements Comparable {
	@ObfuscatedName("o")
	Object field4289;
	@ObfuscatedName("q")
	Object field4288;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		longValue = 8122509668442582777L
	)
	long field4290;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		longValue = -2881932506811436755L
	)
	long field4291;

	class363(Object var1, Object var2) {
		this.field4289 = var1;
		this.field4288 = var2;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lmw;I)I",
		garbageValue = "-1341616281"
	)
	int method6415(class363 var1) {
		if (this.field4291 < var1.field4291) {
			return -1;
		} else {
			return this.field4291 > var1.field4291 ? 1 : 0;
		}
	}

	public boolean equals(Object var1) {
		if (var1 instanceof class363) {
			return this.field4288.equals(((class363)var1).field4288);
		} else {
			throw new IllegalArgumentException();
		}
	}

	public int compareTo(Object var1) {
		return this.method6415((class363)var1);
	}

	public int hashCode() {
		return this.field4288.hashCode();
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lki;I[B[BI)V",
		garbageValue = "-1210183331"
	)
	@Export("Widget_setKey")
	static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3) {
		if (var0.field3474 == null) {
			if (var2 == null) {
				return;
			}

			var0.field3474 = new byte[11][];
			var0.field3419 = new byte[11][];
			var0.field3476 = new int[11];
			var0.field3481 = new int[11];
		}

		var0.field3474[var1] = var2;
		if (var2 != null) {
			var0.field3473 = true;
		} else {
			var0.field3473 = false;

			for (int var4 = 0; var4 < var0.field3474.length; ++var4) {
				if (var0.field3474[var4] != null) {
					var0.field3473 = true;
					break;
				}
			}
		}

		var0.field3419[var1] = var3;
	}
}
