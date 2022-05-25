import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hs")
@Implements("WorldMapIcon_0")
public class WorldMapIcon_0 extends AbstractWorldMapIcon {
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lli;"
	)
	@Export("NetCache_currentResponse")
	public static NetFileRequest NetCache_currentResponse;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -956371221
	)
	@Export("element")
	final int element;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lip;"
	)
	@Export("label")
	final WorldMapLabel label;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 2031981367
	)
	@Export("subWidth")
	final int subWidth;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1919685021
	)
	@Export("subHeight")
	final int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lkd;Lkd;ILip;)V"
	)
	WorldMapIcon_0(Coord var1, Coord var2, int var3, WorldMapLabel var4) {
		super(var1, var2);
		this.element = var3;
		this.label = var4;
		WorldMapElement var5 = class120.WorldMapElement_get(this.getElement());
		SpritePixels var6 = var5.getSpriteBool(false);
		if (var6 != null) {
			this.subWidth = var6.subWidth;
			this.subHeight = var6.subHeight;
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

	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1424752711"
	)
	@Export("playSong")
	static void playSong(int var0) {
		if (var0 == -1 && !Client.field734) {
			ApproximateRouteStrategy.method1110();
		} else if (var0 != -1 && var0 != Client.currentTrackGroupId && class12.clientPreferences.method2248() != 0 && !Client.field734) {
			Archive var1 = AbstractUserComparator.archive6;
			int var2 = class12.clientPreferences.method2248();
			class273.musicPlayerStatus = 1;
			ClanChannelMember.musicTrackArchive = var1;
			StructComposition.musicTrackGroupId = var0;
			FriendsList.musicTrackFileId = 0;
			Clock.musicTrackVolume = var2;
			VertexNormal.musicTrackBoolean = false;
			GrandExchangeEvent.pcmSampleLength = 2;
		}

		Client.currentTrackGroupId = var0;
	}
}
