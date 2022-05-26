import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dr")
public class class121 {
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1242696181
	)
	static int field1529;

	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2071231531"
	)
	static boolean method2748() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
			while (Client.archiveLoadersDone < Client.archiveLoaders.size()) {
				ArchiveLoader var0 = (ArchiveLoader)Client.archiveLoaders.get(Client.archiveLoadersDone);
				if (!var0.isLoaded()) {
					return false;
				}

				++Client.archiveLoadersDone;
			}

			return true;
		} else {
			return true;
		}
	}

	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "55"
	)
	@Export("FriendSystem_invalidateIgnoreds")
	static final void FriendSystem_invalidateIgnoreds() {
		Iterator var0 = Messages.Messages_hashTable.iterator();

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next();
			var1.clearIsFromIgnored();
		}

		if (PcmPlayer.friendsChatManager != null) {
			PcmPlayer.friendsChatManager.invalidateIgnoreds();
		}

	}
}
