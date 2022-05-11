import java.awt.Component;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ft")
@Implements("InvDefinition")
public class InvDefinition extends DualNode {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("InvDefinition_archive")
	public static AbstractArchive InvDefinition_archive;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("InvDefinition_cached")
	static EvictingDualNodeHashTable InvDefinition_cached;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1275234055
	)
	static int field1853;
	@ObfuscatedName("ct")
	public static char field1850;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1439045239
	)
	@Export("size")
	public int size;

	static {
		InvDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	InvDefinition() {
		this.size = 0;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lpx;B)V",
		garbageValue = "-22"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lpx;II)V",
		garbageValue = "39742539"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 2) {
			this.size = var1.readUnsignedShort();
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "497001629"
	)
	static void method3264(Component var0) {
		var0.addMouseListener(MouseHandler.MouseHandler_instance);
		var0.addMouseMotionListener(MouseHandler.MouseHandler_instance);
		var0.addFocusListener(MouseHandler.MouseHandler_instance);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1661883390"
	)
	@Export("itemContainerSetItem")
	static void itemContainerSetItem(int var0, int var1, int var2, int var3) {
		ItemContainer var4 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var4 == null) {
			var4 = new ItemContainer();
			ItemContainer.itemContainers.put(var4, (long)var0);
		}

		if (var4.ids.length <= var1) {
			int[] var5 = new int[var1 + 1];
			int[] var6 = new int[var1 + 1];

			int var7;
			for (var7 = 0; var7 < var4.ids.length; ++var7) {
				var5[var7] = var4.ids[var7];
				var6[var7] = var4.quantities[var7];
			}

			for (var7 = var4.ids.length; var7 < var1; ++var7) {
				var5[var7] = -1;
				var6[var7] = 0;
			}

			var4.ids = var5;
			var4.quantities = var6;
		}

		var4.ids[var1] = var2;
		var4.quantities[var1] = var3;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lbx;I)V",
		garbageValue = "-420431954"
	)
	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) {
			Client.isMembersWorld = var0.isMembersOnly();
			boolean var1 = var0.isMembersOnly();
			if (var1 != class82.ItemDefinition_inMembersWorld) {
				class92.method2370();
				class82.ItemDefinition_inMembersWorld = var1;
			}
		}

		if (var0.properties != Client.worldProperties) {
			Archive var3 = class305.archive8;
			int var2 = var0.properties;
			if ((var2 & 536870912) != 0) {
				Clock.logoSprite = JagexCache.SpriteBuffer_getIndexedSpriteByName(var3, "logo_deadman_mode", "");
			} else if ((var2 & 1073741824) != 0) {
				Clock.logoSprite = JagexCache.SpriteBuffer_getIndexedSpriteByName(var3, "logo_seasonal_mode", "");
			} else {
				Clock.logoSprite = JagexCache.SpriteBuffer_getIndexedSpriteByName(var3, "logo", "");
			}
		}

		Timer.worldHost = var0.host;
		Client.worldId = var0.id;
		Client.worldProperties = var0.properties;
		Tiles.worldPort = Client.gameBuild == 0 ? 43594 : var0.id + 40000;
		GrandExchangeEvent.js5Port = Client.gameBuild == 0 ? 443 : var0.id + 50000;
		WorldMapRegion.currentPort = Tiles.worldPort;
	}

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "4"
	)
	static final void method3268(boolean var0) {
		ArchiveLoader.playPcmPlayers();
		++Client.packetWriter.pendingWrites;
		if (Client.packetWriter.pendingWrites >= 50 || var0) {
			Client.packetWriter.pendingWrites = 0;
			if (!Client.hadNetworkError && Client.packetWriter.getSocket() != null) {
				PacketBufferNode var1 = DecorativeObject.getPacketBufferNode(ClientPacket.field2982, Client.packetWriter.isaacCipher);
				Client.packetWriter.addNode(var1);

				try {
					Client.packetWriter.flush();
				} catch (IOException var3) {
					Client.hadNetworkError = true;
				}
			}

		}
	}
}
