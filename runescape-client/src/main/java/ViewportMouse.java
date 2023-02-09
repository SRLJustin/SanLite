import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hu")
@Implements("ViewportMouse")
public class ViewportMouse {
	@ObfuscatedName("f")
	@Export("ViewportMouse_isInViewport")
	static boolean ViewportMouse_isInViewport;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -2103357105
	)
	@Export("ViewportMouse_x")
	static int ViewportMouse_x;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1057785079
	)
	@Export("ViewportMouse_y")
	static int ViewportMouse_y;
	@ObfuscatedName("s")
	@Export("ViewportMouse_false0")
	static boolean ViewportMouse_false0;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 108829011
	)
	static int field2744;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1104628383
	)
	@Export("ViewportMouse_entityCount")
	public static int ViewportMouse_entityCount;
	@ObfuscatedName("t")
	@Export("ViewportMouse_entityTags")
	public static long[] ViewportMouse_entityTags;

	static {
		ViewportMouse_isInViewport = false;
		ViewportMouse_x = 0;
		ViewportMouse_y = 0;
		ViewportMouse_false0 = false;
		ViewportMouse_entityCount = 0;
		ViewportMouse_entityTags = new long[1000];
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1193422924"
	)
	public static boolean method4813(int var0) {
		return (var0 >> 28 & 1) != 0;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lkz;IIII)V",
		garbageValue = "498385779"
	)
	@Export("Widget_setKeyRate")
	static final void Widget_setKeyRate(Widget var0, int var1, int var2, int var3) {
		if (var0.field3634 == null) {
			throw new RuntimeException();
		} else {
			var0.field3634[var1] = var2;
			var0.field3635[var1] = var3;
		}
	}
}
