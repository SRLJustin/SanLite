import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mh")
public final class class362 {
	@ObfuscatedName("o")
	final Comparator field4283;
	@ObfuscatedName("q")
	final Map field4287;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	final class348 field4282;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	final class348 field4281;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		longValue = -5862348301303990459L
	)
	final long field4280;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	final class360 field4285;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 410246549
	)
	final int field4286;

	@ObfuscatedSignature(
		descriptor = "(JILmc;)V"
	)
	class362(long var1, int var3, class360 var4) {
		this.field4283 = new class361(this);
		this.field4280 = var1;
		this.field4286 = var3;
		this.field4285 = var4;
		if (this.field4286 == -1) {
			this.field4287 = new HashMap(64);
			this.field4282 = new class348(64, this.field4283);
			this.field4281 = null;
		} else {
			if (this.field4285 == null) {
				throw new IllegalArgumentException("");
			}

			this.field4287 = new HashMap(this.field4286);
			this.field4282 = new class348(this.field4286, this.field4283);
			this.field4281 = new class348(this.field4286);
		}

	}

	@ObfuscatedSignature(
		descriptor = "(ILmc;)V"
	)
	public class362(int var1, class360 var2) {
		this(-1L, var1, var2);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1327719952"
	)
	boolean method6401() {
		return this.field4286 != -1;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;B)Ljava/lang/Object;",
		garbageValue = "23"
	)
	public Object method6413(Object var1) {
		synchronized(this) {
			if (this.field4280 != -1L) {
				this.method6404();
			}

			class363 var3 = (class363)this.field4287.get(var1);
			if (var3 == null) {
				return null;
			} else {
				this.method6403(var3, false);
				return var3.field4289;
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "735656301"
	)
	public Object method6402(Object var1, Object var2) {
		synchronized(this) {
			if (this.field4280 != -1L) {
				this.method6404();
			}

			class363 var4 = (class363)this.field4287.get(var1);
			if (var4 != null) {
				Object var8 = var4.field4289;
				var4.field4289 = var2;
				this.method6403(var4, false);
				return var8;
			} else {
				class363 var5;
				if (this.method6401() && this.field4287.size() == this.field4286) {
					var5 = (class363)this.field4281.remove();
					this.field4287.remove(var5.field4288);
					this.field4282.remove(var5);
				}

				var5 = new class363(var2, var1);
				this.field4287.put(var1, var5);
				this.method6403(var5, true);
				return null;
			}
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lmw;ZI)V",
		garbageValue = "1467205859"
	)
	void method6403(class363 var1, boolean var2) {
		if (!var2) {
			this.field4282.remove(var1);
			if (this.method6401() && !this.field4281.remove(var1)) {
				throw new IllegalStateException("");
			}
		}

		var1.field4290 = System.currentTimeMillis();
		if (this.method6401()) {
			switch(this.field4285.field4273) {
			case 0:
				var1.field4291 = var1.field4290;
				break;
			case 1:
				++var1.field4291;
			}

			this.field4281.add(var1);
		}

		this.field4282.add(var1);
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "23"
	)
	void method6404() {
		if (-1L == this.field4280) {
			throw new IllegalStateException("");
		} else {
			long var1 = System.currentTimeMillis() - this.field4280;

			while (!this.field4282.isEmpty()) {
				class363 var3 = (class363)this.field4282.peek();
				if (var3.field4290 >= var1) {
					return;
				}

				this.field4287.remove(var3.field4288);
				this.field4282.remove(var3);
				if (this.method6401()) {
					this.field4281.remove(var3);
				}
			}

		}
	}
}
