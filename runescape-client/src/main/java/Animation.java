import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("he")
@Implements("Animation")
public class Animation {
	@ObfuscatedName("i")
	static int[] field2317;
	@ObfuscatedName("w")
	static int[] field2309;
	@ObfuscatedName("s")
	static int[] field2314;
	@ObfuscatedName("a")
	static int[] field2312;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	@Export("skeleton")
	Skeleton skeleton;
	@ObfuscatedName("g")
	@Export("transformCount")
	int transformCount;
	@ObfuscatedName("e")
	@Export("transformSkeletonLabels")
	int[] transformSkeletonLabels;
	@ObfuscatedName("p")
	@Export("transformXs")
	int[] transformXs;
	@ObfuscatedName("j")
	@Export("transformYs")
	int[] transformYs;
	@ObfuscatedName("b")
	@Export("transformZs")
	int[] transformZs;
	@ObfuscatedName("x")
	@Export("hasAlphaTransform")
	boolean hasAlphaTransform;

	static {
		field2317 = new int[500];
		field2309 = new int[500];
		field2314 = new int[500];
		field2312 = new int[500];
	}

	@ObfuscatedSignature(
		descriptor = "([BLha;)V"
	)
	Animation(byte[] var1, Skeleton var2) {
		this.skeleton = null;
		this.transformCount = -1;
		this.hasAlphaTransform = false;
		this.skeleton = var2;
		Buffer var3 = new Buffer(var1);
		Buffer var4 = new Buffer(var1);
		var3.offset = 2;
		int var5 = var3.readUnsignedByte();
		int var6 = -1;
		int var7 = 0;
		var4.offset = var5 + var3.offset;

		int var8;
		for (var8 = 0; var8 < var5; ++var8) {
			int var9 = var3.readUnsignedByte();
			if (var9 > 0) {
				if (this.skeleton.transformTypes[var8] != 0) {
					for (int var10 = var8 - 1; var10 > var6; --var10) {
						if (this.skeleton.transformTypes[var10] == 0) {
							field2317[var7] = var10;
							field2309[var7] = 0;
							field2314[var7] = 0;
							field2312[var7] = 0;
							++var7;
							break;
						}
					}
				}

				field2317[var7] = var8;
				short var11 = 0;
				if (this.skeleton.transformTypes[var8] == 3) {
					var11 = 128;
				}

				if ((var9 & 1) != 0) {
					field2309[var7] = var4.readShortSmart();
				} else {
					field2309[var7] = var11;
				}

				if ((var9 & 2) != 0) {
					field2314[var7] = var4.readShortSmart();
				} else {
					field2314[var7] = var11;
				}

				if ((var9 & 4) != 0) {
					field2312[var7] = var4.readShortSmart();
				} else {
					field2312[var7] = var11;
				}

				var6 = var8;
				++var7;
				if (this.skeleton.transformTypes[var8] == 5) {
					this.hasAlphaTransform = true;
				}
			}
		}

		if (var1.length != var4.offset) {
			throw new RuntimeException();
		} else {
			this.transformCount = var7;
			this.transformSkeletonLabels = new int[var7];
			this.transformXs = new int[var7];
			this.transformYs = new int[var7];
			this.transformZs = new int[var7];

			for (var8 = 0; var8 < var7; ++var8) {
				this.transformSkeletonLabels[var8] = field2317[var8];
				this.transformXs[var8] = field2309[var8];
				this.transformYs[var8] = field2314[var8];
				this.transformZs[var8] = field2312[var8];
			}

		}
	}
}
