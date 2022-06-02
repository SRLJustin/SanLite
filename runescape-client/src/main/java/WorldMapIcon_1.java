import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hb")
@Implements("WorldMapIcon_1")
public class WorldMapIcon_1 extends AbstractWorldMapIcon {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 51181617
	)
	@Export("objectDefId")
	final int objectDefId;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lhd;"
	)
	@Export("region")
	final WorldMapRegion region;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -351714887
	)
	@Export("element")
	int element;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lip;"
	)
	@Export("label")
	WorldMapLabel label;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1557282329
	)
	@Export("subWidth")
	int subWidth;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1198695651
	)
	@Export("subHeight")
	int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lkd;Lkd;ILhd;)V"
	)
	WorldMapIcon_1(Coord var1, Coord var2, int var3, WorldMapRegion var4) {
		super(var1, var2);
		this.objectDefId = var3;
		this.region = var4;
		this.init();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-760266737"
	)
	@Export("init")
	void init() {
		this.element = class82.getObjectDefinition(this.objectDefId).transform().mapIconId;
		this.label = this.region.createMapLabel(class120.WorldMapElement_get(this.element));
		WorldMapElement var1 = class120.WorldMapElement_get(this.getElement());
		SpritePixels var2 = var1.getSpriteBool(false);
		if (var2 != null) {
			this.subWidth = var2.subWidth;
			this.subHeight = var2.subHeight;
		} else {
			this.subWidth = 0;
			this.subHeight = 0;
		}

	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "16"
	)
	@Export("getElement")
	public int getElement() {
		return this.element;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Lip;",
		garbageValue = "1420245554"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "102"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1663406998"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight;
	}
}
