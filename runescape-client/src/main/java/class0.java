import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("i")
public class class0 implements class3 {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lop;)Lop;"
	)
	public Buffer vmethod18(Buffer var1) {
		Buffer var2 = new Buffer(100);
		this.method7(var1, var2);
		return var2;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lop;Lop;)V"
	)
	void method7(Buffer var1, Buffer var2) {
		class8 var3 = new class8(var1);
		class5 var4 = new class5(var3);

		long var5;
		for (var5 = 0L; !var4.method22(var3.method64(), var3.method60(), var5); ++var5) {
		}

		var2.writeLong(var5);
	}
}
