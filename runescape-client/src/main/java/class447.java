import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("qx")
public class class447 {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1868107489
	)
	public final int field4741;
	@ObfuscatedName("q")
	public Object field4742;

	public class447(int var1) {
		this.field4741 = var1;
	}

	public class447(int var1, Object var2) {
		this.field4741 = var1;
		this.field4742 = var2;
	}

	public int hashCode() {
		return super.hashCode();
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class447)) {
			return false;
		} else {
			class447 var2 = (class447)var1;
			if (var2.field4742 == null && this.field4742 != null) {
				return false;
			} else if (this.field4742 == null && var2.field4742 != null) {
				return false;
			} else {
				return this.field4741 == var2.field4741 && var2.field4742.equals(this.field4742);
			}
		}
	}
}
