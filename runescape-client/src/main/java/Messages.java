import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cd")
@Implements("Messages")
public class Messages {
	@ObfuscatedName("s")
	@Export("Messages_channels")
	static final Map Messages_channels;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	@Export("Messages_hashTable")
	static final IterableNodeHashTable Messages_hashTable;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	@Export("Messages_queue")
	static final IterableDualNodeQueue Messages_queue;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -2125602271
	)
	@Export("Messages_count")
	static int Messages_count;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Leh;"
	)
	static ClanSettings field1326;

	static {
		Messages_channels = new HashMap();
		Messages_hashTable = new IterableNodeHashTable(1024);
		Messages_queue = new IterableDualNodeQueue();
		Messages_count = 0;
	}

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	static void method2451() {
		if (Client.oculusOrbState == 1) {
			Client.field484 = true;
		}

	}
}
