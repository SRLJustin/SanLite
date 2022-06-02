import java.security.SecureRandom;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bg")
@Implements("SecureRandomCallable")
public class SecureRandomCallable implements Callable {
	@ObfuscatedName("ss")
	@ObfuscatedSignature(
		descriptor = "Lal;"
	)
	@Export("pcmPlayer0")
	static PcmPlayer pcmPlayer0;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lqr;"
	)
	@Export("rightTitleSprite")
	static SpritePixels rightTitleSprite;
	@ObfuscatedName("x")
	@Export("cacheParentPaths")
	static String[] cacheParentPaths;
	@ObfuscatedName("hx")
	@ObfuscatedGetter(
		intValue = -1451292815
	)
	@Export("baseX")
	static int baseX;

	SecureRandomCallable() {
	}

	public Object call() {
		SecureRandom var2 = new SecureRandom();
		var2.nextInt();
		return var2;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)[B",
		garbageValue = "1836628976"
	)
	public static byte[] method2035(CharSequence var0) {
		int var1 = var0.length();
		byte[] var2 = new byte[var1];

		for (int var3 = 0; var3 < var1; ++var3) {
			char var4 = var0.charAt(var3);
			if (var4 > 127) {
				var2[var3] = 63;
			} else {
				var2[var3] = (byte)var4;
			}
		}

		return var2;
	}

	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "342853228"
	)
	@Export("logOut")
	static final void logOut() {
		Client.packetWriter.close();
		EnumComposition.method3400();
		VarcInt.method3321();
		PcmPlayer.method757();
		ObjectComposition.ObjectDefinition_cached.clear();
		ObjectComposition.ObjectDefinition_cachedModelData.clear();
		ObjectComposition.ObjectDefinition_cachedEntities.clear();
		ObjectComposition.ObjectDefinition_cachedModels.clear();
		NPCComposition.NpcDefinition_cached.clear();
		NPCComposition.NpcDefinition_cachedModels.clear();
		class92.method2370();
		SequenceDefinition.SequenceDefinition_cached.clear();
		SequenceDefinition.SequenceDefinition_cachedFrames.clear();
		SequenceDefinition.SequenceDefinition_cachedModel.clear();
		SpotAnimationDefinition.SpotAnimationDefinition_cached.clear();
		SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.clear();
		VarbitComposition.VarbitDefinition_cached.clear();
		VarpDefinition.VarpDefinition_cached.clear();
		Login.HitSplatDefinition_cachedSprites.method7382();
		class221.Ignored_cached.method7382();
		SoundSystem.method780();
		class175.method3379();
		class250.method4933();
		ParamComposition.ParamComposition_cached.clear();
		WorldMapElement.WorldMapElement_cachedSprites.clear();
		PlayerComposition.PlayerComposition_cachedModels.clear();
		Widget.Widget_cachedSprites.clear();
		Widget.Widget_cachedModels.clear();
		Widget.Widget_cachedFonts.clear();
		Widget.Widget_cachedSpriteMasks.clear();
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).clear();
		Script.Script_cached.clear();
		NetSocket.archive0.clearFiles();
		Clock.archive1.clearFiles();
		class194.archive3.clearFiles();
		MouseHandler.archive4.clearFiles();
		Message.archive5.clearFiles();
		AbstractUserComparator.archive6.clearFiles();
		InterfaceParent.archive7.clearFiles();
		class305.archive8.clearFiles();
		TileItem.archive9.clearFiles();
		ObjectSound.archive10.clearFiles();
		UrlRequest.archive11.clearFiles();
		class115.archive12.clearFiles();
		class175.scene.clear();

		for (int var0 = 0; var0 < 4; ++var0) {
			Client.collisionMaps[var0].clear();
		}

		System.gc();
		UrlRequester.method2538(2);
		Client.currentTrackGroupId = -1;
		Client.field734 = false;
		Varcs.method2466();
		PendingSpawn.updateGameState(10);
	}
}
