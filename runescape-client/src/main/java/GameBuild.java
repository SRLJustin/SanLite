import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lz")
@Implements("GameBuild")
public class GameBuild {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	@Export("LIVE")
	static final GameBuild LIVE;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	@Export("BUILDLIVE")
	static final GameBuild BUILDLIVE;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	@Export("RC")
	static final GameBuild RC;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	@Export("WIP")
	static final GameBuild WIP;
	@ObfuscatedName("m")
	@Export("name")
	public final String name;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1115217905
	)
	@Export("buildId")
	final int buildId;

	static {
		LIVE = new GameBuild("LIVE", 0);
		BUILDLIVE = new GameBuild("BUILDLIVE", 3);
		RC = new GameBuild("RC", 1);
		WIP = new GameBuild("WIP", 2);
	}

	GameBuild(String var1, int var2) {
		this.name = var1;
		this.buildId = var2;
	}
}
