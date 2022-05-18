import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hl")
@Implements("ModelData0")
public class ModelData0 {
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	static AbstractArchive field2654;
	@ObfuscatedName("fi")
	static String field2661;
	@ObfuscatedName("gb")
	@ObfuscatedGetter(
		longValue = 2783986170892939363L
	)
	static long field2658;
	@ObfuscatedName("lu")
	@ObfuscatedSignature(
		descriptor = "Lca;"
	)
	@Export("localPlayer")
	static Player localPlayer;

	ModelData0() {
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I[BLnc;I)V",
		garbageValue = "709536384"
	)
	static void method4378(int var0, byte[] var1, ArchiveDisk var2) {
		ArchiveDiskAction var3 = new ArchiveDiskAction();
		var3.type = 0;
		var3.key = (long)var0;
		var3.data = var1;
		var3.archiveDisk = var2;
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3);
		}

		class306.method5595();
	}
}
