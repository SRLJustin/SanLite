import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("od")
public abstract class class393 extends class250 implements class446 {
	@ObfuscatedName("dt")
	static boolean field4428;

	@ObfuscatedSignature(
		descriptor = "(Lke;Llq;I)V"
	)
	protected class393(StudioGame var1, Language var2, int var3) {
		super(var1, var2, var3);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Lou;",
		garbageValue = "-318323569"
	)
	protected abstract class395 vmethod7381(int var1);

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "970560687"
	)
	public int method6909() {
		return super.field2926;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Object;",
		garbageValue = "-322202585"
	)
	public Object vmethod7814(int var1) {
		class395 var2 = this.vmethod7381(var1);
		return var2 != null && var2.method6929() ? var2.method6930() : null;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)Lqx;",
		garbageValue = "1616655669"
	)
	public class447 method6920(Buffer var1) {
		int var2 = var1.readUnsignedShort();
		class395 var3 = this.vmethod7381(var2);
		class447 var4 = new class447(var2);
		Class var5 = var3.field4430.field4667;
		if (var5 == Integer.class) {
			var4.field4742 = var1.readInt();
		} else if (var5 == Long.class) {
			var4.field4742 = var1.readLong();
		} else if (var5 == String.class) {
			var4.field4742 = var1.readStringCp1252NullCircumfixed();
		} else {
			if (!class442.class.isAssignableFrom(var5)) {
				throw new IllegalStateException();
			}

			try {
				class442 var6 = (class442)var5.newInstance();
				var6.method7783(var1);
				var4.field4742 = var6;
			} catch (InstantiationException var7) {
			} catch (IllegalAccessException var8) {
			}
		}

		return var4;
	}
}
