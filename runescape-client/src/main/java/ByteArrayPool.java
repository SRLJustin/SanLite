import java.util.ArrayList;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mt")
@Implements("ByteArrayPool")
public class ByteArrayPool {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 494845385
	)
	@Export("ByteArrayPool_smallCount")
	static int ByteArrayPool_smallCount;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1288349497
	)
	@Export("ByteArrayPool_mediumCount")
	static int ByteArrayPool_mediumCount;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -836620159
	)
	@Export("ByteArrayPool_largeCount")
	static int ByteArrayPool_largeCount;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 966661933
	)
	static int field4233;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1176993689
	)
	static int field4231;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1879717291
	)
	static int field4232;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1833460655
	)
	static int field4234;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1259234581
	)
	static int field4238;
	@ObfuscatedName("x")
	@Export("ByteArrayPool_small")
	static byte[][] ByteArrayPool_small;
	@ObfuscatedName("g")
	@Export("ByteArrayPool_medium")
	static byte[][] ByteArrayPool_medium;
	@ObfuscatedName("p")
	@Export("ByteArrayPool_large")
	static byte[][] ByteArrayPool_large;
	@ObfuscatedName("b")
	static byte[][] field4224;
	@ObfuscatedName("v")
	static ArrayList field4239;

	static {
		ByteArrayPool_smallCount = 0;
		ByteArrayPool_mediumCount = 0;
		ByteArrayPool_largeCount = 0;
		field4233 = 0;
		field4231 = 1000;
		field4232 = 250;
		field4234 = 100;
		field4238 = 50;
		ByteArrayPool_small = new byte[1000][];
		ByteArrayPool_medium = new byte[250][];
		ByteArrayPool_large = new byte[100][];
		field4224 = new byte[50][];
		field4239 = new ArrayList();
		field4239.clear();
		field4239.add(100);
		field4239.add(5000);
		field4239.add(10000);
		field4239.add(30000);
		new HashMap();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IZB)[B",
		garbageValue = "37"
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
		} else if (field4233 > 0) {
			var4 = field4224[--field4233];
			field4224[field4233] = null;
			return var4;
		}

		if (ModeWhere.ByteArrayPool_arrays != null) {
			for (int var2 = 0; var2 < WorldMapSectionType.ByteArrayPool_alternativeSizes.length; ++var2) {
				if (WorldMapSectionType.ByteArrayPool_alternativeSizes[var2] != var0) {
					if (var0 < WorldMapSectionType.ByteArrayPool_alternativeSizes[var2]) {
					}
				} else if (Frames.ByteArrayPool_altSizeArrayCounts[var2] > 0) {
					byte[] var3 = ModeWhere.ByteArrayPool_arrays[var2][--Frames.ByteArrayPool_altSizeArrayCounts[var2]];
					ModeWhere.ByteArrayPool_arrays[var2][Frames.ByteArrayPool_altSizeArrayCounts[var2]] = null;
					return var3;
				}
			}
		}

		return new byte[var0];
	}
}
