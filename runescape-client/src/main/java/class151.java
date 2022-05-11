import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ey")
public class class151 extends class144 {
	@ObfuscatedName("pn")
	@ObfuscatedGetter(
		intValue = 692320949
	)
	static int field1729;
	@ObfuscatedName("o")
	String field1728;
	@ObfuscatedName("q")
	byte field1725;
	@ObfuscatedName("l")
	byte field1727;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lee;"
	)
	final class145 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lee;)V"
	)
	class151(class145 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)V",
		garbageValue = "1212008489"
	)
	void vmethod3037(Buffer var1) {
		this.field1728 = var1.readStringCp1252NullTerminatedOrNull();
		if (this.field1728 != null) {
			var1.readUnsignedByte();
			this.field1725 = var1.readByte();
			this.field1727 = var1.readByte();
		}

	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Let;I)V",
		garbageValue = "1640110130"
	)
	void vmethod3032(ClanChannel var1) {
		var1.name = this.field1728;
		if (this.field1728 != null) {
			var1.field1711 = this.field1725;
			var1.field1706 = this.field1727;
		}

	}
}
