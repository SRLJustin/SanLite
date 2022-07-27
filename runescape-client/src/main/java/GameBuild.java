import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kf")
@Implements("GameBuild")
public class GameBuild {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	@Export("LIVE")
	static final GameBuild LIVE;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	@Export("BUILDLIVE")
	static final GameBuild BUILDLIVE;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	@Export("RC")
	static final GameBuild RC;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	@Export("WIP")
	static final GameBuild WIP;
	@ObfuscatedName("c")
	@Export("name")
	public final String name;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 825558575
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

	@ObfuscatedName("mk")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2142697491"
	)
	static void method5758(int var0) {
		if (var0 != Client.loginState) {
			Client.loginState = var0;
		}
	}
}
