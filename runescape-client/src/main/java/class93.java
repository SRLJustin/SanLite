import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cx")
public class class93 {
	@ObfuscatedName("ts")
	@ObfuscatedGetter(
		intValue = 887878939
	)
	static int field1270;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1111556729
	)
	int field1273;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 152044667
	)
	int field1268;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 271727395
	)
	int field1269;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1314299657
	)
	int field1271;

	class93(int var1, int var2, int var3, int var4) {
		this.field1273 = var1;
		this.field1268 = var2;
		this.field1269 = var3;
		this.field1271 = var4;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-96"
	)
	int method2553() {
		return this.field1273;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1312743182"
	)
	int method2554() {
		return this.field1268;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1616401962"
	)
	int method2546() {
		return this.field1269;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1484358147"
	)
	int method2542() {
		return this.field1271;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Llv;Llv;IZI)Ldy;",
		garbageValue = "-1765717330"
	)
	public static class123 method2541(AbstractArchive var0, AbstractArchive var1, int var2, boolean var3) {
		boolean var4 = true;
		byte[] var5 = var0.getFile(var2 >> 16 & 65535, var2 & 65535);
		if (var5 == null) {
			var4 = false;
			return null;
		} else {
			int var6 = (var5[1] & 255) << 8 | var5[2] & 255;
			byte[] var7;
			if (var3) {
				var7 = var1.getFile(0, var6);
			} else {
				var7 = var1.getFile(var6, 0);
			}

			if (var7 == null) {
				var4 = false;
			}

			if (!var4) {
				return null;
			} else {
				try {
					return new class123(var0, var1, var2, var3);
				} catch (Exception var9) {
					return null;
				}
			}
		}
	}

	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "(Lkw;IIZI)V",
		garbageValue = "-1967883854"
	)
	@Export("alignWidgetSize")
	static void alignWidgetSize(Widget var0, int var1, int var2, boolean var3) {
		int var4 = var0.width;
		int var5 = var0.height;
		if (var0.widthAlignment == 0) {
			var0.width = var0.rawWidth;
		} else if (var0.widthAlignment == 1) {
			var0.width = var1 - var0.rawWidth;
		} else if (var0.widthAlignment == 2) {
			var0.width = var0.rawWidth * var1 >> 14;
		}

		if (var0.heightAlignment == 0) {
			var0.height = var0.rawHeight;
		} else if (var0.heightAlignment == 1) {
			var0.height = var2 - var0.rawHeight;
		} else if (var0.heightAlignment == 2) {
			var0.height = var2 * var0.rawHeight >> 14;
		}

		if (var0.widthAlignment == 4) {
			var0.width = var0.height * var0.field3411 / var0.field3412;
		}

		if (var0.heightAlignment == 4) {
			var0.height = var0.width * var0.field3412 / var0.field3411;
		}

		if (var0.contentType == 1337) {
			Client.viewportWidget = var0;
		}

		if (var3 && var0.onResize != null && (var4 != var0.width || var5 != var0.height)) {
			ScriptEvent var6 = new ScriptEvent();
			var6.widget = var0;
			var6.args = var0.onResize;
			Client.scriptEvents.addFirst(var6);
		}

	}
}
