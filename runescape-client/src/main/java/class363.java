import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mk")
public class class363 implements class362 {
	@ObfuscatedName("h")
	Map field4092;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	final class389 field4091;

	@ObfuscatedSignature(
		descriptor = "(Lnf;)V"
	)
	public class363(class389 var1) {
		this.field4091 = var1;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-967265307"
	)
	public int vmethod6222(int var1) {
		if (this.field4092 != null) {
			class390 var2 = (class390)this.field4092.get(var1);
			if (var2 != null) {
				return (Integer)var2.field4221;
			}
		}

		return (Integer)this.field4091.vmethod6737(var1);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;S)V",
		garbageValue = "22050"
	)
	public void vmethod6221(int var1, Object var2) {
		if (this.field4092 == null) {
			this.field4092 = new HashMap();
			this.field4092.put(var1, new class390(var1, var2));
		} else {
			class390 var3 = (class390)this.field4092.get(var1);
			if (var3 == null) {
				this.field4092.put(var1, new class390(var1, var2));
			} else {
				var3.field4221 = var2;
			}
		}

	}

	public Iterator iterator() {
		return this.field4092 == null ? Collections.emptyList().iterator() : this.field4092.values().iterator();
	}
}
