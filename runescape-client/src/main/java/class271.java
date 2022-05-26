import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jo")
public class class271 {
	@ObfuscatedName("tr")
	@ObfuscatedGetter(
		intValue = -2079311097
	)
	static int field3221;
	@ObfuscatedName("o")
	static int[] field3220;

	static {
		new Object();
		field3220 = new int[33];
		field3220[0] = 0;
		int var0 = 2;

		for (int var1 = 1; var1 < 33; ++var1) {
			field3220[var1] = var0 - 1;
			var0 += var0;
		}

	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lfs;IIB)Lal;",
		garbageValue = "-29"
	)
	public static final PcmPlayer method5045(TaskHandler var0, int var1, int var2) {
		if (PcmPlayer.field300 == 0) {
			throw new IllegalStateException();
		} else if (var1 >= 0 && var1 < 2) {
			if (var2 < 256) {
				var2 = 256;
			}

			try {
				PcmPlayer var3 = PcmPlayer.pcmPlayerProvider.player();
				var3.samples = new int[(ArchiveDiskAction.PcmPlayer_stereo ? 2 : 1) * 256];
				var3.field287 = var2;
				var3.init();
				var3.capacity = (var2 & -1024) + 1024;
				if (var3.capacity > 16384) {
					var3.capacity = 16384;
				}

				var3.open(var3.capacity);
				if (class29.field172 > 0 && MusicPatchPcmStream.soundSystem == null) {
					MusicPatchPcmStream.soundSystem = new SoundSystem();
					InterfaceParent.soundSystemExecutor = Executors.newScheduledThreadPool(1);
					InterfaceParent.soundSystemExecutor.scheduleAtFixedRate(MusicPatchPcmStream.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS);
				}

				if (MusicPatchPcmStream.soundSystem != null) {
					if (MusicPatchPcmStream.soundSystem.players[var1] != null) {
						throw new IllegalArgumentException();
					}

					MusicPatchPcmStream.soundSystem.players[var1] = var3;
				}

				return var3;
			} catch (Throwable var4) {
				return new PcmPlayer();
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
