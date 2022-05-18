import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jk")
public class class273 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("musicPatchesArchive")
	public static AbstractArchive musicPatchesArchive;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("soundEffectsArchive")
	public static AbstractArchive soundEffectsArchive;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Ljw;"
	)
	@Export("midiPcmStream")
	public static MidiPcmStream midiPcmStream;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1844825549
	)
	@Export("musicPlayerStatus")
	public static int musicPlayerStatus;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	@Export("musicTrack")
	public static MusicTrack musicTrack;

	static {
		musicPlayerStatus = 0;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ILki;IIIII[FB)Lki;",
		garbageValue = "-124"
	)
	static Widget method5077(int var0, Widget var1, int var2, int var3, int var4, int var5, int var6, float[] var7) {
		Widget var8 = new Widget();
		var8.type = var0;
		var8.parentId = var1.id;
		var8.childIndex = var2;
		var8.isIf3 = true;
		var8.xAlignment = var3;
		var8.yAlignment = var4;
		var8.widthAlignment = var5;
		var8.heightAlignment = var6;
		var8.rawX = (int)(var7[0] * (float)var1.width);
		var8.rawY = (int)(var7[1] * (float)var1.height);
		var8.rawWidth = (int)((float)var1.width * var7[2]);
		var8.rawHeight = (int)(var7[3] * (float)var1.height);
		return var8;
	}
}
