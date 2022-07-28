import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("al")
public class class33 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("reflectionChecks")
	public static IterableNodeDeque reflectionChecks;
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	@Export("worldSelectRightSprite")
	static IndexedSprite worldSelectRightSprite;

	static {
		reflectionChecks = new IterableNodeDeque();
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-54"
	)
	public static void method609() {
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
			if (ArchiveDiskActionHandler.field3991 != 0) {
				ArchiveDiskActionHandler.field3991 = 1;

				try {
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock.wait();
				} catch (InterruptedException var3) {
				}
			}

		}
	}
}
