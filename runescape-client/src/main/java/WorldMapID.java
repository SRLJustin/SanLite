import java.lang.management.GarbageCollectorMXBean;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ig")
@Implements("WorldMapID")
public class WorldMapID {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	static final WorldMapID field2849;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	static final WorldMapID field2846;
	@ObfuscatedName("aa")
	@Export("garbageCollector")
	static GarbageCollectorMXBean garbageCollector;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1483153309
	)
	@Export("value")
	final int value;

	static {
		field2849 = new WorldMapID(0);
		field2846 = new WorldMapID(1);
	}

	WorldMapID(int var1) {
		this.value = var1;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lbd;I)V",
		garbageValue = "1423196275"
	)
	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) {
			Client.isMembersWorld = var0.isMembersOnly();
			boolean var1 = var0.isMembersOnly();
			if (var1 != InterfaceParent.ItemDefinition_inMembersWorld) {
				class120.method2734();
				InterfaceParent.ItemDefinition_inMembersWorld = var1;
			}
		}

		if (var0.properties != Client.worldProperties) {
			Archive var3 = class299.archive8;
			int var2 = var0.properties;
			if ((var2 & 536870912) != 0) {
				MusicPatchPcmStream.logoSprite = class150.SpriteBuffer_getIndexedSpriteByName(var3, "logo_deadman_mode", "");
			} else if ((var2 & 1073741824) != 0) {
				MusicPatchPcmStream.logoSprite = class150.SpriteBuffer_getIndexedSpriteByName(var3, "logo_seasonal_mode", "");
			} else {
				MusicPatchPcmStream.logoSprite = class150.SpriteBuffer_getIndexedSpriteByName(var3, "logo", "");
			}
		}

		class12.worldHost = var0.host;
		Client.worldId = var0.id;
		Client.worldProperties = var0.properties;
		GroundObject.worldPort = Client.gameBuild == 0 ? 43594 : var0.id + 40000;
		FileSystem.js5Port = Client.gameBuild == 0 ? 443 : var0.id + 50000;
		WorldMapLabelSize.currentPort = GroundObject.worldPort;
	}

	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1910466699"
	)
	static final void method4919() {
		PacketBufferNode var0 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2975, Client.packetWriter.isaacCipher);
		Client.packetWriter.addNode(var0);
		Interpreter.field816 = true;

		for (InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) {
			if (var1.type == 0 || var1.type == 3) {
				class29.closeInterface(var1, true);
			}
		}

		if (Client.meslayerContinueWidget != null) {
			class125.method2770(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}

		Interpreter.field816 = false;
	}
}
