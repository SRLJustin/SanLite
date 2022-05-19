import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fq")
public abstract class class166 {
	@ObfuscatedName("k")
	String field1830;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	final class155 this$0;

	@ObfuscatedSignature(
		descriptor = "(Leq;Ljava/lang/String;)V"
	)
	class166(class155 var1, String var2) {
		this.this$0 = var1;
		this.field1830 = var2;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1005057629"
	)
	public abstract int vmethod3227();

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "59"
	)
	public String vmethod3238() {
		return null;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1932276755"
	)
	public int vmethod3228() {
		return -1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1796730209"
	)
	public String method3226() {
		return this.field1830;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "32"
	)
	@Export("colorStartTag")
	static String colorStartTag(int var0) {
		return "<col=" + Integer.toHexString(var0) + ">";
	}
}
