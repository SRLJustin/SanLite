import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bm")
@Implements("ArchiveLoader")
public class ArchiveLoader {
	@ObfuscatedName("pq")
	@ObfuscatedSignature(
		signature = "Lld;"
	)
	@Export("privateChatMode")
	static PrivateChatMode privateChatMode;
	@ObfuscatedName("en")
	@ObfuscatedSignature(
		signature = "Liy;"
	)
	@Export("archive19")
	static Archive archive19;
	@ObfuscatedName("hn")
	@ObfuscatedGetter(
		intValue = -1907995143
	)
	@Export("cameraY")
	static int cameraY;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "Liy;"
	)
	@Export("archive")
	final Archive archive;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 265251349
	)
	@Export("groupCount")
	final int groupCount;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 134465937
	)
	@Export("loadedCount")
	int loadedCount;

	@ObfuscatedSignature(
		signature = "(Liy;Ljava/lang/String;)V"
	)
	ArchiveLoader(Archive var1, String var2) {
		this.loadedCount = 0;
		this.archive = var1;
		this.groupCount = var1.getGroupCount();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		garbageValue = "979008130",
		signature = "(I)Z"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		this.loadedCount = 0;

		for (int var1 = 0; var1 < this.groupCount; ++var1) {
			if (!this.archive.method4471(var1) || this.archive.method4470(var1)) {
				++this.loadedCount;
			}
		}

		return this.loadedCount >= this.groupCount;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		garbageValue = "-326621995",
		signature = "(III)Lhz;"
	)
	@Export("getWidgetChild")
	public static Widget getWidgetChild(int var0, int var1) {
		Widget var2 = class237.getWidget(var0);
		if (var1 == -1) {
			return var2;
		} else {
			return var2 != null && var2.children != null && var1 < var2.children.length ? var2.children[var1] : null;
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		garbageValue = "2065603382",
		signature = "(III)I"
	)
	static final int method1237(int var0, int var1) {
		int var2 = class60.method972(var0 + 45365, 91923 + var1, 4) - 128 + (class60.method972(10294 + var0, var1 + 37821, 2) - 128 >> 1) + (class60.method972(var0, var1, 1) - 128 >> 2);
		var2 = (int)(0.3D * (double)var2) + 35;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 60) {
			var2 = 60;
		}

		return var2;
	}
}
