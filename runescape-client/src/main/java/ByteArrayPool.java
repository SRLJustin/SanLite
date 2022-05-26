import java.util.ArrayList;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mk")
@Implements("ByteArrayPool")
public class ByteArrayPool {
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -88837057
	)
	@Export("ByteArrayPool_smallCount")
	static int ByteArrayPool_smallCount;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1039424223
	)
	@Export("ByteArrayPool_mediumCount")
	static int ByteArrayPool_mediumCount;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1336676741
	)
	@Export("ByteArrayPool_largeCount")
	static int ByteArrayPool_largeCount;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1169134273
	)
	static int field4217;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -957559945
	)
	static int field4210;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1701731071
	)
	static int field4219;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1660116295
	)
	static int field4220;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1383703933
	)
	static int field4221;
	@ObfuscatedName("w")
	@Export("ByteArrayPool_small")
	static byte[][] ByteArrayPool_small;
	@ObfuscatedName("b")
	@Export("ByteArrayPool_medium")
	static byte[][] ByteArrayPool_medium;
	@ObfuscatedName("t")
	@Export("ByteArrayPool_large")
	static byte[][] ByteArrayPool_large;
	@ObfuscatedName("g")
	static byte[][] field4225;
	@ObfuscatedName("h")
	static ArrayList field4212;

	static {
		ByteArrayPool_smallCount = 0;
		ByteArrayPool_mediumCount = 0;
		ByteArrayPool_largeCount = 0;
		field4217 = 0;
		field4210 = 1000;
		field4219 = 250;
		field4220 = 100;
		field4221 = 50;
		ByteArrayPool_small = new byte[1000][];
		ByteArrayPool_medium = new byte[250][];
		ByteArrayPool_large = new byte[100][];
		field4225 = new byte[50][];
		field4212 = new ArrayList();
		LoginScreenAnimation.method2217();
		new HashMap();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IB)F",
		garbageValue = "1"
	)
	public static float method6364(int var0) {
		var0 &= 16383;
		return (float)(6.283185307179586D * (double)((float)var0 / 16384.0F));
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IZI)[B",
		garbageValue = "957663499"
	)
	@Export("ByteArrayPool_getArrayBool")
	static synchronized byte[] ByteArrayPool_getArrayBool(int var0, boolean var1) {
		byte[] var4;
		if (var0 != 100) {
			if (var0 < 100) {
			}
		} else if (ByteArrayPool_smallCount > 0) {
			var4 = ByteArrayPool_small[--ByteArrayPool_smallCount];
			ByteArrayPool_small[ByteArrayPool_smallCount] = null;
			return var4;
		}

		if (var0 != 5000) {
			if (var0 < 5000) {
			}
		} else if (ByteArrayPool_mediumCount > 0) {
			var4 = ByteArrayPool_medium[--ByteArrayPool_mediumCount];
			ByteArrayPool_medium[ByteArrayPool_mediumCount] = null;
			return var4;
		}

		if (var0 != 10000) {
			if (var0 < 10000) {
			}
		} else if (ByteArrayPool_largeCount > 0) {
			var4 = ByteArrayPool_large[--ByteArrayPool_largeCount];
			ByteArrayPool_large[ByteArrayPool_largeCount] = null;
			return var4;
		}

		if (var0 != 30000) {
			if (var0 < 30000) {
			}
		} else if (field4217 > 0) {
			var4 = field4225[--field4217];
			field4225[field4217] = null;
			return var4;
		}

		if (class131.ByteArrayPool_arrays != null) {
			for (int var2 = 0; var2 < FileSystem.ByteArrayPool_alternativeSizes.length; ++var2) {
				if (FileSystem.ByteArrayPool_alternativeSizes[var2] != var0) {
					if (var0 < FileSystem.ByteArrayPool_alternativeSizes[var2]) {
					}
				} else if (GrandExchangeEvents.ByteArrayPool_altSizeArrayCounts[var2] > 0) {
					byte[] var3 = class131.ByteArrayPool_arrays[var2][--GrandExchangeEvents.ByteArrayPool_altSizeArrayCounts[var2]];
					class131.ByteArrayPool_arrays[var2][GrandExchangeEvents.ByteArrayPool_altSizeArrayCounts[var2]] = null;
					return var3;
				}
			}
		}

		return new byte[var0];
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)Lqr;",
		garbageValue = "1594784812"
	)
	static SpritePixels method6365() {
		SpritePixels var0 = new SpritePixels();
		var0.width = class453.SpriteBuffer_spriteWidth;
		var0.height = class453.SpriteBuffer_spriteHeight;
		var0.xOffset = class453.SpriteBuffer_xOffsets[0];
		var0.yOffset = class453.SpriteBuffer_yOffsets[0];
		var0.subWidth = ScriptFrame.SpriteBuffer_spriteWidths[0];
		var0.subHeight = class453.SpriteBuffer_spriteHeights[0];
		int var1 = var0.subHeight * var0.subWidth;
		byte[] var2 = class127.SpriteBuffer_pixels[0];
		var0.pixels = new int[var1];

		for (int var3 = 0; var3 < var1; ++var3) {
			var0.pixels[var3] = Decimator.SpriteBuffer_spritePalette[var2[var3] & 255];
		}

		VarcInt.method3325();
		return var0;
	}

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(Lcx;II)V",
		garbageValue = "-376973471"
	)
	static final void method6357(Actor var0, int var1) {
		AbstractWorldMapIcon.worldToScreen(var0.x, var0.y, var1);
	}
}
