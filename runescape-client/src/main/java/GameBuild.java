import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("io")
@Implements("GameBuild")
public class GameBuild {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "Lio;"
	)
	@Export("LIVE")
	static final GameBuild LIVE;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "Lio;"
	)
	@Export("BUILDLIVE")
	static final GameBuild BUILDLIVE;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "Lio;"
	)
	@Export("RC")
	static final GameBuild RC;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "Lio;"
	)
	@Export("WIP")
	static final GameBuild WIP;
	@ObfuscatedName("t")
	@Export("name")
	public final String name;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1867624169
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
