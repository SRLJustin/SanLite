import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ku")
public class class306 {
	static {
		int var0 = 0;
		int var1 = 0;
		class302[] var2 = new class302[]{class302.field3612, class302.field3611};
		class302[] var3 = var2;

		for (int var4 = 0; var4 < var3.length; ++var4) {
			class302 var5 = var3[var4];
			if (var5.field3613 > var0) {
				var0 = var5.field3613;
			}

			if (var5.field3610 > var1) {
				var1 = var5.field3610;
			}
		}

	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1403614530"
	)
	@Export("changeWorldSelectSorting")
	static void changeWorldSelectSorting(int var0, int var1) {
		int[] var2 = new int[4];
		int[] var3 = new int[4];
		var2[0] = var0;
		var3[0] = var1;
		int var4 = 1;

		for (int var5 = 0; var5 < 4; ++var5) {
			if (World.World_sortOption1[var5] != var0) {
				var2[var4] = World.World_sortOption1[var5];
				var3[var4] = World.World_sortOption2[var5];
				++var4;
			}
		}

		World.World_sortOption1 = var2;
		World.World_sortOption2 = var3;
		UserComparator8.sortWorlds(World.World_worlds, 0, World.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1939050344"
	)
	static void method5595() {
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
			if (ArchiveDiskActionHandler.field3998 == 0) {
				class131.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
				class131.ArchiveDiskActionHandler_thread.setDaemon(true);
				class131.ArchiveDiskActionHandler_thread.start();
				class131.ArchiveDiskActionHandler_thread.setPriority(5);
			}

			ArchiveDiskActionHandler.field3998 = 600;
		}
	}

	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-341201892"
	)
	static void method5593(int var0, int var1) {
		if (class12.clientPreferences.method2248() != 0 && var0 != -1) {
			UserComparator8.method2574(UrlRequest.archive11, var0, 0, class12.clientPreferences.method2248(), false);
			Client.field734 = true;
		}

	}
}
