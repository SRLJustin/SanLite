import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ly")
@Implements("GrandExchangeOffer")
public class GrandExchangeOffer {
	@ObfuscatedName("o")
	@Export("state")
	byte state;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1429288873
	)
	@Export("id")
	public int id;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 708150215
	)
	@Export("unitPrice")
	public int unitPrice;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1969215889
	)
	@Export("totalQuantity")
	public int totalQuantity;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1702065649
	)
	@Export("currentQuantity")
	public int currentQuantity;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 2023629729
	)
	@Export("currentPrice")
	public int currentPrice;

	public GrandExchangeOffer() {
	}

	@ObfuscatedSignature(
		descriptor = "(Lpx;Z)V",
		garbageValue = "0"
	)
	public GrandExchangeOffer(Buffer var1, boolean var2) {
		this.state = var1.readByte();
		this.id = var1.readUnsignedShort();
		this.unitPrice = var1.readInt();
		this.totalQuantity = var1.readInt();
		this.currentQuantity = var1.readInt();
		this.currentPrice = var1.readInt();
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "284680094"
	)
	@Export("status")
	public int status() {
		return this.state & 7;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "17"
	)
	@Export("type")
	public int type() {
		return (this.state & 8) == 8 ? 1 : 0;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "585573305"
	)
	void method5823(int var1) {
		this.state &= -8;
		this.state = (byte)(this.state | var1 & 7);
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1891202738"
	)
	void method5826(int var1) {
		this.state &= -9;
		if (var1 == 1) {
			this.state = (byte)(this.state | 8);
		}

	}
}
