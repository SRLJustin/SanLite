import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gi")
@Implements("HealthBarDefinition")
public class HealthBarDefinition extends DualNode {
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	static AbstractArchive field1985;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	@Export("HealthBarDefinition_cached")
	static EvictingDualNodeHashTable HealthBarDefinition_cached;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	@Export("HealthBarDefinition_cachedSprites")
	static EvictingDualNodeHashTable HealthBarDefinition_cachedSprites;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 340088571
	)
	public int field1982;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 610863041
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 485061889
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1538861117
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1759495171
	)
	public int field1984;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -496661429
	)
	@Export("int5")
	public int int5;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -515352613
	)
	@Export("frontSpriteID")
	int frontSpriteID;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -697159111
	)
	@Export("backSpriteID")
	int backSpriteID;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 742840403
	)
	@Export("width")
	public int width;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 2118917585
	)
	@Export("widthPadding")
	public int widthPadding;

	static {
		HealthBarDefinition_cached = new EvictingDualNodeHashTable(64);
		HealthBarDefinition_cachedSprites = new EvictingDualNodeHashTable(64);
	}

	HealthBarDefinition() {
		this.int1 = 255;
		this.int2 = 255;
		this.int3 = -1;
		this.field1984 = 1;
		this.int5 = 70;
		this.frontSpriteID = -1;
		this.backSpriteID = -1;
		this.width = 30;
		this.widthPadding = 0;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lrd;I)V",
		garbageValue = "-2019372676"
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

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lrd;II)V",
		garbageValue = "655885225"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			var1.readUnsignedShort();
		} else if (var2 == 2) {
			this.int1 = var1.readUnsignedByte();
		} else if (var2 == 3) {
			this.int2 = var1.readUnsignedByte();
		} else if (var2 == 4) {
			this.int3 = 0;
		} else if (var2 == 5) {
			this.int5 = var1.readUnsignedShort();
		} else if (var2 == 6) {
			var1.readUnsignedByte();
		} else if (var2 == 7) {
			this.frontSpriteID = var1.method8709();
		} else if (var2 == 8) {
			this.backSpriteID = var1.method8709();
		} else if (var2 == 11) {
			this.int3 = var1.readUnsignedShort();
		} else if (var2 == 14) {
			this.width = var1.readUnsignedByte();
		} else if (var2 == 15) {
			this.widthPadding = var1.readUnsignedByte();
		}

	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)Lrs;",
		garbageValue = "-350000117"
	)
	public SpritePixels method3675() {
		if (this.frontSpriteID < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.frontSpriteID);
			if (var1 != null) {
				return var1;
			} else {
				var1 = BZip2State.SpriteBuffer_getSprite(field1985, this.frontSpriteID, 0);
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long)this.frontSpriteID);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)Lrs;",
		garbageValue = "-1607255134"
	)
	public SpritePixels method3666() {
		if (this.backSpriteID < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.backSpriteID);
			if (var1 != null) {
				return var1;
			} else {
				var1 = BZip2State.SpriteBuffer_getSprite(field1985, this.backSpriteID, 0);
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long)this.backSpriteID);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "75"
	)
	@Export("logOut")
	static final void logOut() {
		Client.packetWriter.close();
		WorldMapElement.method3612();
		FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear();
		class134.method3124();
		ObjectComposition.ObjectDefinition_cached.clear();
		ObjectComposition.ObjectDefinition_cachedModelData.clear();
		ObjectComposition.ObjectDefinition_cachedEntities.clear();
		ObjectComposition.ObjectDefinition_cachedModels.clear();
		class168.method3488();
		TaskHandler.method3475();
		ObjectSound.method1920();
		SpotAnimationDefinition.SpotAnimationDefinition_cached.clear();
		SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.clear();
		WorldMapDecorationType.method6425();
		FaceNormal.method4641();
		class491.HitSplatDefinition_cachedSprites.method8463();
		class208.Ignored_cached.method8463();
		HitSplatDefinition.HitSplatDefinition_cached.clear();
		HitSplatDefinition.HitSplatDefinition_cachedSprites.clear();
		HitSplatDefinition.HitSplatDefinition_cachedFonts.clear();
		class31.method460();
		UrlRequest.method2891();
		ParamComposition.ParamComposition_cached.clear();
		class85.method2339();
		class466.PlayerComposition_cachedModels.clear();
		class468.Widget_cachedSprites.clear();
		Client.Widget_cachedModels.clear();
		Client.Widget_cachedFonts.clear();
		VertexNormal.method4843();
		Widget.field3543.clear();
		Widget.field3575.clear();
		Widget.archive0.clear();
		Widget.archive1.clear();
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).clear();
		Script.Script_cached.clear();
		Client.archive5.method7487();
		class13.archive6.clearFiles();
		FriendsChatManager.archive7.clearFiles();
		class144.archive3.clearFiles();
		DynamicObject.archive9.clearFiles();
		NetCache.archive10.clearFiles();
		class153.archive11.clearFiles();
		class151.field1750.clearFiles();
		WorldMapEvent.archive8.clearFiles();
		class148.field1704.clearFiles();
		ApproximateRouteStrategy.field490.clearFiles();
		MusicPatchNode.field3448.clearFiles();
		class12.archive12.clearFiles();
		Canvas.field132.clearFiles();
		WorldMapAreaData.scene.clear();

		for (int var0 = 0; var0 < 4; ++var0) {
			Client.collisionMaps[var0].clear();
		}

		Client.field752.method4097();
		System.gc();
		KeyHandler.method430(2);
		Client.currentTrackGroupId = -1;
		Client.field671 = false;
		UserComparator4.method2902();
		class246.method5251(10);
	}
}
