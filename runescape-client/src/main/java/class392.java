import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oa")
public class class392 implements class397 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	public final class421 field4427;

	@ObfuscatedSignature(
		descriptor = "(Lpw;)V"
	)
	class392(class422 var1) {
		this.field4427 = var1;
	}

	@ObfuscatedSignature(
		descriptor = "(Lod;)V"
	)
	public class392(class393 var1) {
		this(new class422(var1));
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-1"
	)
	public int method6905(int var1) {
		return this.field4427.vmethod7293(var1);
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "666324052"
	)
	@Export("stringCp1252NullTerminatedByteSize")
	public static int stringCp1252NullTerminatedByteSize(String var0) {
		return var0.length() + 1;
	}
}
