import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kw")
@Implements("WorldMapDecorationType")
public enum WorldMapDecorationType implements MouseWheel {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3571(0, 0),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3570(1, 0),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3558(2, 0),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3559(3, 0),
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3560(9, 2),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3556(4, 1),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3564(5, 1),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3563(6, 1),
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3572(7, 1),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3565(8, 1),
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3566(12, 2),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3567(13, 2),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3557(14, 2),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3569(15, 2),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3576(16, 2),
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3561(17, 2),
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3568(18, 2),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3573(19, 2),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3574(20, 2),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3575(21, 2),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3562(10, 2),
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3577(11, 2),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3578(22, 3);

	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1442497389
	)
	@Export("id")
	public final int id;

	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "0"
	)
	WorldMapDecorationType(int var3, int var4) {
		this.id = var3;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "30"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "(Lki;I)V",
		garbageValue = "1049661564"
	)
	static final void method5575(Widget var0) {
		int var1 = var0.contentType;
		if (var1 == 324) {
			if (Client.field602 == -1) {
				Client.field602 = var0.spriteId2;
				Client.field763 = var0.spriteId;
			}

			if (Client.playerAppearance.isFemale) {
				var0.spriteId2 = Client.field602;
			} else {
				var0.spriteId2 = Client.field763;
			}

		} else if (var1 == 325) {
			if (Client.field602 == -1) {
				Client.field602 = var0.spriteId2;
				Client.field763 = var0.spriteId;
			}

			if (Client.playerAppearance.isFemale) {
				var0.spriteId2 = Client.field763;
			} else {
				var0.spriteId2 = Client.field602;
			}

		} else if (var1 == 327) {
			var0.modelAngleX = 150;
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047;
			var0.modelType = 5;
			var0.modelId = 0;
		} else if (var1 == 328) {
			var0.modelAngleX = 150;
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047;
			var0.modelType = 5;
			var0.modelId = 1;
		}
	}
}
