import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mr")
public class class348 extends AbstractQueue {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "[Lmf;"
	)
	class346[] field4179;
	@ObfuscatedName("q")
	Map field4180;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1908884105
	)
	int field4181;
	@ObfuscatedName("k")
	final Comparator field4178;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -633680661
	)
	int field4182;

	public class348(int var1, Comparator var2) {
		this.field4182 = 0;
		this.field4179 = new class346[var1];
		this.field4180 = new HashMap();
		this.field4178 = var2;
	}

	public class348(int var1) {
		this(var1, (Comparator)null);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2064028908"
	)
	void method6192() {
		int var1 = (this.field4179.length << 1) + 1;
		this.field4179 = (class346[])((class346[])Arrays.copyOf(this.field4179, var1));
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-79126724"
	)
	void method6173(int var1) {
		class346 var2;
		int var3;
		for (var2 = this.field4179[var1]; var1 > 0; var1 = var3) {
			var3 = var1 - 1 >>> 1;
			class346 var4 = this.field4179[var3];
			if (this.field4178 != null) {
				if (this.field4178.compare(var2.field4171, var4.field4171) >= 0) {
					break;
				}
			} else if (((Comparable)var2.field4171).compareTo(var4.field4171) >= 0) {
				break;
			}

			this.field4179[var1] = var4;
			this.field4179[var1].field4170 = var1;
		}

		this.field4179[var1] = var2;
		this.field4179[var1].field4170 = var1;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1826932902"
	)
	void method6181(int var1) {
		class346 var2 = this.field4179[var1];

		int var8;
		for (int var3 = this.field4181 >>> 1; var1 < var3; var1 = var8) {
			int var4 = (var1 << 1) + 1;
			class346 var5 = this.field4179[var4];
			int var6 = (var1 << 1) + 2;
			class346 var7 = this.field4179[var6];
			if (this.field4178 != null) {
				if (var6 < this.field4181 && this.field4178.compare(var5.field4171, var7.field4171) > 0) {
					var8 = var6;
				} else {
					var8 = var4;
				}
			} else if (var6 < this.field4181 && ((Comparable)var5.field4171).compareTo(var7.field4171) > 0) {
				var8 = var6;
			} else {
				var8 = var4;
			}

			if (this.field4178 != null) {
				if (this.field4178.compare(var2.field4171, this.field4179[var8].field4171) <= 0) {
					break;
				}
			} else if (((Comparable)var2.field4171).compareTo(this.field4179[var8].field4171) <= 0) {
				break;
			}

			this.field4179[var1] = this.field4179[var8];
			this.field4179[var1].field4170 = var1;
		}

		this.field4179[var1] = var2;
		this.field4179[var1].field4170 = var1;
	}

	public boolean remove(Object var1) {
		class346 var2 = (class346)this.field4180.remove(var1);
		if (var2 == null) {
			return false;
		} else {
			++this.field4182;
			--this.field4181;
			if (var2.field4170 == this.field4181) {
				this.field4179[this.field4181] = null;
				return true;
			} else {
				class346 var3 = this.field4179[this.field4181];
				this.field4179[this.field4181] = null;
				this.field4179[var2.field4170] = var3;
				this.field4179[var2.field4170].field4170 = var2.field4170;
				this.method6181(var2.field4170);
				if (var3 == this.field4179[var2.field4170]) {
					this.method6173(var2.field4170);
				}

				return true;
			}
		}
	}

	public Object peek() {
		return this.field4181 == 0 ? null : this.field4179[0].field4171;
	}

	public Iterator iterator() {
		return new class347(this);
	}

	public boolean offer(Object var1) {
		if (this.field4180.containsKey(var1)) {
			throw new IllegalArgumentException("");
		} else {
			++this.field4182;
			int var2 = this.field4181;
			if (var2 >= this.field4179.length) {
				this.method6192();
			}

			++this.field4181;
			if (var2 == 0) {
				this.field4179[0] = new class346(var1, 0);
				this.field4180.put(var1, this.field4179[0]);
			} else {
				this.field4179[var2] = new class346(var1, var2);
				this.field4180.put(var1, this.field4179[var2]);
				this.method6173(var2);
			}

			return true;
		}
	}

	public boolean contains(Object var1) {
		return this.field4180.containsKey(var1);
	}

	public Object[] toArray() {
		Object[] var1 = super.toArray();
		if (this.field4178 != null) {
			Arrays.sort(var1, this.field4178);
		} else {
			Arrays.sort(var1);
		}

		return var1;
	}

	public Object poll() {
		if (this.field4181 == 0) {
			return null;
		} else {
			++this.field4182;
			Object var1 = this.field4179[0].field4171;
			this.field4180.remove(var1);
			--this.field4181;
			if (this.field4181 == 0) {
				this.field4179[this.field4181] = null;
			} else {
				this.field4179[0] = this.field4179[this.field4181];
				this.field4179[0].field4170 = 0;
				this.field4179[this.field4181] = null;
				this.method6181(0);
			}

			return var1;
		}
	}

	public int size() {
		return this.field4181;
	}
}
