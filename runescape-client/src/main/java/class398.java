import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oz")
public class class398 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	public static final class398 field4432;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	static final class398 field4433;
	@ObfuscatedName("l")
	String field4434;

	static {
		field4432 = new class398("application/json");
		field4433 = new class398("text/plain");
	}

	class398(String var1) {
		this.field4434 = var1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "120"
	)
	public String method6940() {
		return this.field4434;
	}
}
