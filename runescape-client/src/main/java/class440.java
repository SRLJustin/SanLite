import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pp")
public class class440 {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 89156271
	)
	static final int field4720;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1721586977
	)
	static final int field4721;

	static {
		field4720 = (int)(Math.pow(2.0D, 4.0D) - 1.0D);
		field4721 = (int)(Math.pow(2.0D, 8.0D) - 1.0D);
	}

	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "(IZZZZI)Llb;",
		garbageValue = "-2107378172"
	)
	static Archive method7848(int var0, boolean var1, boolean var2, boolean var3, boolean var4) {
		ArchiveDisk var5 = null;
		if (JagexCache.JagexCache_dat2File != null) {
			var5 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idxFiles[var0], 1000000);
		}

		return new Archive(var5, ChatChannel.field992, var0, var1, var2, var3, var4);
	}
}
