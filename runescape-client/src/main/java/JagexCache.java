import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fu")
@Implements("JagexCache")
public class JagexCache {
	@ObfuscatedName("w")
	@Export("JagexCache_locationFile")
	static File JagexCache_locationFile;
	@ObfuscatedName("t")
	@Export("cacheDir")
	public static File cacheDir;
	@ObfuscatedName("p")
	@Export("ByteArrayPool_altSizeArrayCounts")
	public static int[] ByteArrayPool_altSizeArrayCounts;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "Lmz;"
	)
	@Export("JagexCache_randomDat")
	public static BufferedFile JagexCache_randomDat;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lmz;"
	)
	@Export("JagexCache_dat2File")
	public static BufferedFile JagexCache_dat2File;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "Lmz;"
	)
	@Export("JagexCache_idx255File")
	public static BufferedFile JagexCache_idx255File;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -622132541
	)
	@Export("cacheGamebuild")
	public static int cacheGamebuild;

	static {
		JagexCache_randomDat = null;
		JagexCache_dat2File = null;
		JagexCache_idx255File = null;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/CharSequence;B)I",
		garbageValue = "-6"
	)
	@Export("hashString")
	public static int hashString(CharSequence var0) {
		int var1 = var0.length();
		int var2 = 0;

		for (int var3 = 0; var3 < var1; ++var3) {
			var2 = (var2 << 5) - var2 + Varps.charToByteCp1252(var0.charAt(var3));
		}

		return var2;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "(B)Z",
		garbageValue = "3"
	)
	public static boolean method3566() {
		return class206.field2421 != 0 ? true : class206.midiPcmStream.isReady();
	}
}
