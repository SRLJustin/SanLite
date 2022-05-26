import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pm")
public class class433 implements MouseWheel {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	public static final class433 field4664;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	public static final class433 field4655;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	public static final class433 field4656;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 511130033
	)
	@Export("canvasHeight")
	public static int canvasHeight;
	@ObfuscatedName("hw")
	@ObfuscatedGetter(
		intValue = -2114897749
	)
	static int field4657;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -822067139
	)
	final int field4654;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1795458283
	)
	public final int field4658;
	@ObfuscatedName("m")
	public final Class field4667;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lpb;"
	)
	final class429 field4660;

	static {
		field4664 = new class433(0, 0, Integer.class, new class430());
		field4655 = new class433(2, 1, Long.class, new class432());
		field4656 = new class433(1, 2, String.class, new class434());
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/Class;Lpb;)V"
	)
	class433(int var1, int var2, Class var3, class429 var4) {
		this.field4654 = var1;
		this.field4658 = var2;
		this.field4667 = var3;
		this.field4660 = var4;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "30"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4658;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lpx;B)Ljava/lang/Object;",
		garbageValue = "-88"
	)
	public Object method7423(Buffer var1) {
		return this.field4660.vmethod7436(var1);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lpx;I)V",
		garbageValue = "2054774363"
	)
	public static void method7420(Object var0, Buffer var1) {
		class429 var2 = method7424(var0.getClass());
		var2.vmethod7440(var0, var1);
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Class;B)Lpb;",
		garbageValue = "95"
	)
	static class429 method7424(Class var0) {
		class433[] var2 = new class433[]{field4655, field4656, field4664};
		class433[] var3 = var2;
		int var4 = 0;

		class433 var1;
		while (true) {
			if (var4 >= var3.length) {
				var1 = null;
				break;
			}

			class433 var5 = var3[var4];
			if (var5.field4667 == var0) {
				var1 = var5;
				break;
			}

			++var4;
		}

		if (var1 == null) {
			throw new IllegalArgumentException();
		} else {
			return var1.field4660;
		}
	}

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "687799312"
	)
	static final void method7433(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var2 - var0;
		int var7 = var3 - var1;
		int var8 = var6 >= 0 ? var6 : -var6;
		int var9 = var7 >= 0 ? var7 : -var7;
		int var10 = var8;
		if (var8 < var9) {
			var10 = var9;
		}

		if (var10 != 0) {
			int var11 = (var6 << 16) / var10;
			int var12 = (var7 << 16) / var10;
			if (var12 <= var11) {
				var11 = -var11;
			} else {
				var12 = -var12;
			}

			int var13 = var5 * var12 >> 17;
			int var14 = var5 * var12 + 1 >> 17;
			int var15 = var5 * var11 >> 17;
			int var16 = var5 * var11 + 1 >> 17;
			var0 -= Rasterizer2D.Rasterizer2D_xClipStart;
			var1 -= Rasterizer2D.Rasterizer2D_yClipStart;
			int var17 = var0 + var13;
			int var18 = var0 - var14;
			int var19 = var0 + var6 - var14;
			int var20 = var0 + var6 + var13;
			int var21 = var15 + var1;
			int var22 = var1 - var16;
			int var23 = var7 + var1 - var16;
			int var24 = var15 + var7 + var1;
			Rasterizer3D.method3976(var17, var18, var19);
			Rasterizer3D.method3919(var21, var22, var23, var17, var18, var19, var4);
			Rasterizer3D.method3976(var17, var19, var20);
			Rasterizer3D.method3919(var21, var23, var24, var17, var19, var20, var4);
		}
	}
}
