import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kn")
@Implements("Varps")
public class Varps {
	@ObfuscatedName("o")
	@Export("Varps_masks")
	static int[] Varps_masks;
	@ObfuscatedName("q")
	@Export("Varps_temp")
	public static int[] Varps_temp;
	@ObfuscatedName("l")
	@Export("Varps_main")
	public static int[] Varps_main;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -995653473
	)
	public static int field3348;

	static {
		Varps_masks = new int[32];
		int var0 = 2;

		for (int var1 = 0; var1 < 32; ++var1) {
			Varps_masks[var1] = var0 - 1;
			var0 += var0;
		}

		Varps_temp = new int[4000];
		Varps_main = new int[4000];
	}

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-20299938"
	)
	static final void method5366() {
		PacketBufferNode var0 = DecorativeObject.getPacketBufferNode(ClientPacket.field3001, Client.packetWriter.isaacCipher);
		Client.packetWriter.addNode(var0);
		Interpreter.field833 = true;

		for (InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) {
			if (var1.type == 0 || var1.type == 3) {
				NetSocket.closeInterface(var1, true);
			}
		}

		if (Client.meslayerContinueWidget != null) {
			GrandExchangeOfferTotalQuantityComparator.method5781(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}

		Interpreter.field833 = false;
	}
}
