import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ed")
public class class140 extends class144 {
	@ObfuscatedName("jv")
	@ObfuscatedGetter(
		intValue = 2112481743
	)
	static int field1666;
	@ObfuscatedName("o")
	String field1664;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 185909857
	)
	int field1661;
	@ObfuscatedName("l")
	byte field1662;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lee;"
	)
	final class145 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lee;)V"
	)
	class140(class145 var1) {
		this.this$0 = var1;
		this.field1664 = null;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)V",
		garbageValue = "1212008489"
	)
	void vmethod3037(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			var1.readLong();
		}

		this.field1664 = var1.readStringCp1252NullTerminatedOrNull();
		this.field1661 = var1.readUnsignedShort();
		this.field1662 = var1.readByte();
		var1.readLong();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Let;I)V",
		garbageValue = "1640110130"
	)
	void vmethod3032(ClanChannel var1) {
		ClanChannelMember var2 = new ClanChannelMember();
		var2.username = new Username(this.field1664);
		var2.world = this.field1661;
		var2.rank = this.field1662;
		var1.addMember(var2);
	}

	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1349623910"
	)
	static void method2951() {
		PacketBufferNode var0 = DecorativeObject.getPacketBufferNode(ClientPacket.field3054, Client.packetWriter.isaacCipher);
		var0.packetBuffer.writeByte(ClanChannelMember.getWindowedMode());
		var0.packetBuffer.writeShort(GraphicsObject.canvasWidth);
		var0.packetBuffer.writeShort(class433.canvasHeight);
		Client.packetWriter.addNode(var0);
	}
}
