import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ln")
@Implements("GrandExchangeEvent")
public class GrandExchangeEvent {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1128323951
	)
	@Export("pcmSampleLength")
	public static int pcmSampleLength;
	@ObfuscatedName("ff")
	@ObfuscatedGetter(
		intValue = 1608944815
	)
	@Export("js5Port")
	static int js5Port;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1027306067
	)
	@Export("world")
	public final int world;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		longValue = -6905147980507584697L
	)
	@Export("age")
	public final long age;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	@Export("grandExchangeOffer")
	public final GrandExchangeOffer grandExchangeOffer;
	@ObfuscatedName("k")
	@Export("offerName")
	String offerName;
	@ObfuscatedName("a")
	@Export("previousOfferName")
	String previousOfferName;

	@ObfuscatedSignature(
		descriptor = "(Lpx;BI)V"
	)
	GrandExchangeEvent(Buffer var1, byte var2, int var3) {
		this.offerName = var1.readStringCp1252NullTerminated();
		this.previousOfferName = var1.readStringCp1252NullTerminated();
		this.world = var1.readUnsignedShort();
		this.age = var1.readLong();
		int var4 = var1.readInt();
		int var5 = var1.readInt();
		this.grandExchangeOffer = new GrandExchangeOffer();
		this.grandExchangeOffer.method5823(2);
		this.grandExchangeOffer.method5826(var2);
		this.grandExchangeOffer.unitPrice = var4;
		this.grandExchangeOffer.totalQuantity = var5;
		this.grandExchangeOffer.currentQuantity = 0;
		this.grandExchangeOffer.currentPrice = 0;
		this.grandExchangeOffer.id = var3;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "123"
	)
	@Export("getOfferName")
	public String getOfferName() {
		return this.offerName;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-744625642"
	)
	@Export("getPreviousOfferName")
	public String getPreviousOfferName() {
		return this.previousOfferName;
	}
}
