import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("hr")
@Implements("SceneTilePaint")
public final class SceneTilePaint {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1947995877
	)
	@Export("swColor")
	int swColor;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1030656937
	)
	@Export("seColor")
	int seColor;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -126920151
	)
	@Export("neColor")
	int neColor;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1841043153
	)
	@Export("nwColor")
	int nwColor;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1012887619
	)
	@Export("texture")
	int texture;
	@ObfuscatedName("m")
	@Export("isFlat")
	boolean isFlat;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 402871861
	)
	@Export("rgb")
	int rgb;

	SceneTilePaint(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		this.isFlat = true;
		this.swColor = var1;
		this.seColor = var2;
		this.neColor = var3;
		this.nwColor = var4;
		this.texture = var5;
		this.rgb = var6;
		this.isFlat = var7;
	}
}
