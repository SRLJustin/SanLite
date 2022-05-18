import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hf")
@Implements("DecorativeObject")
public final class DecorativeObject {
	@ObfuscatedName("c")
	@Export("Tiles_lightness")
	static int[] Tiles_lightness;
	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "[Lqr;"
	)
	@Export("mapDotSprites")
	static SpritePixels[] mapDotSprites;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1133434607
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1649410048
	)
	@Export("x")
	int x;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1248756677
	)
	@Export("y")
	int y;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1886236557
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -665264033
	)
	@Export("orientation2")
	int orientation2;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -884502203
	)
	@Export("xOffset")
	int xOffset;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -553687171
	)
	@Export("yOffset")
	int yOffset;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lgx;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lgx;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		longValue = -451444878306106685L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1120239
	)
	@Export("flags")
	int flags;

	DecorativeObject() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljj;Lqh;B)Ljm;",
		garbageValue = "-72"
	)
	@Export("getPacketBufferNode")
	public static PacketBufferNode getPacketBufferNode(ClientPacket var0, IsaacCipher var1) {
		PacketBufferNode var2 = FloorOverlayDefinition.method3700();
		var2.clientPacket = var0;
		var2.clientPacketLength = var0.length;
		if (var2.clientPacketLength == -1) {
			var2.packetBuffer = new PacketBuffer(260);
		} else if (var2.clientPacketLength == -2) {
			var2.packetBuffer = new PacketBuffer(10000);
		} else if (var2.clientPacketLength <= 18) {
			var2.packetBuffer = new PacketBuffer(20);
		} else if (var2.clientPacketLength <= 98) {
			var2.packetBuffer = new PacketBuffer(100);
		} else {
			var2.packetBuffer = new PacketBuffer(260);
		}

		var2.packetBuffer.setIsaacCipher(var1);
		var2.packetBuffer.writeByteIsaac(var2.clientPacket.id);
		var2.index = 0;
		return var2;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-811937066"
	)
	static final int method4391() {
		return ViewportMouse.ViewportMouse_y;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "1555036135"
	)
	static final void method4392(String var0, int var1) {
		PacketBufferNode var2 = getPacketBufferNode(ClientPacket.field3026, Client.packetWriter.isaacCipher);
		var2.packetBuffer.writeByte(class392.stringCp1252NullTerminatedByteSize(var0) + 1);
		var2.packetBuffer.method7542(var1);
		var2.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var2);
	}

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "20695"
	)
	@Export("getTapToDrop")
	static boolean getTapToDrop() {
		return Client.tapToDrop;
	}
}
