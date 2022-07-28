import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pq")
public class class436 extends DualNode {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	public static AbstractArchive field4682;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	@Export("PlayerComposition_cachedModels")
	public static EvictingDualNodeHashTable PlayerComposition_cachedModels;
	@ObfuscatedName("h")
	@Export("SpriteBuffer_pixels")
	static byte[][] SpriteBuffer_pixels;
	@ObfuscatedName("f")
	public int[][] field4678;
	@ObfuscatedName("u")
	public Object[][] field4681;

	static {
		PlayerComposition_cachedModels = new EvictingDualNodeHashTable(64);
	}

	class436() {
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lqw;I)V",
		garbageValue = "2014581097"
	)
	void method7621(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.method7620(var1, var2);
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lqw;IB)V",
		garbageValue = "6"
	)
	void method7620(Buffer var1, int var2) {
		if (var2 == 1) {
			int var3 = var1.readUnsignedByte();
			if (this.field4678 == null) {
				this.field4678 = new int[var3][];
			}

			for (int var4 = var1.readUnsignedByte(); var4 != 255; var4 = var1.readUnsignedByte()) {
				int var5 = var4 & 127;
				boolean var6 = (var4 & 128) != 0;
				int[] var7 = new int[var1.readUnsignedByte()];

				for (int var8 = 0; var8 < var7.length; ++var8) {
					var7[var8] = var1.readUShortSmart();
				}

				this.field4678[var5] = var7;
				if (var6) {
					if (this.field4681 == null) {
						this.field4681 = new Object[this.field4678.length][];
					}

					this.field4681[var5] = Huffman.method5486(var1, var7);
				}
			}
		}

	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1229456655"
	)
	void method7626() {
	}
}
