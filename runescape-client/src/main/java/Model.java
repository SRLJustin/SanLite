import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ha")
@Implements("Model")
public class Model extends Renderable {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	@Export("Model_sharedSequenceModel")
	static Model Model_sharedSequenceModel;
	@ObfuscatedName("p")
	@Export("Model_sharedSequenceModelFaceAlphas")
	static byte[] Model_sharedSequenceModelFaceAlphas;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	@Export("Model_sharedSpotAnimationModel")
	static Model Model_sharedSpotAnimationModel;
	@ObfuscatedName("n")
	@Export("Model_sharedSpotAnimationModelFaceAlphas")
	static byte[] Model_sharedSpotAnimationModelFaceAlphas;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	static class389 field2543;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	static class389 field2544;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	static class389 field2545;
	@ObfuscatedName("ae")
	static boolean[] field2583;
	@ObfuscatedName("ay")
	static boolean[] field2584;
	@ObfuscatedName("ag")
	@Export("modelViewportXs")
	static int[] modelViewportXs;
	@ObfuscatedName("aw")
	@Export("modelViewportYs")
	static int[] modelViewportYs;
	@ObfuscatedName("ah")
	static int[] field2587;
	@ObfuscatedName("at")
	static int[] field2588;
	@ObfuscatedName("al")
	static int[] field2555;
	@ObfuscatedName("au")
	static int[] field2590;
	@ObfuscatedName("bw")
	static char[] field2592;
	@ObfuscatedName("bc")
	static char[][] field2593;
	@ObfuscatedName("bv")
	static int[] field2563;
	@ObfuscatedName("bi")
	static int[][] field2610;
	@ObfuscatedName("bj")
	static int[] field2564;
	@ObfuscatedName("by")
	static int[] field2605;
	@ObfuscatedName("bz")
	static int[] field2598;
	@ObfuscatedName("bo")
	static int[] field2599;
	@ObfuscatedName("br")
	static int[] field2603;
	@ObfuscatedName("bp")
	static int[] field2570;
	@ObfuscatedName("bd")
	@Export("Model_transformTempX")
	static int Model_transformTempX;
	@ObfuscatedName("bl")
	@Export("Model_transformTempY")
	static int Model_transformTempY;
	@ObfuscatedName("bk")
	@Export("Model_transformTempZ")
	static int Model_transformTempZ;
	@ObfuscatedName("bh")
	static boolean field2591;
	@ObfuscatedName("bf")
	static int[] field2608;
	@ObfuscatedName("ba")
	static int[] field2612;
	@ObfuscatedName("bt")
	static int[] field2576;
	@ObfuscatedName("bb")
	static int[] field2611;
	@ObfuscatedName("q")
	@Export("verticesCount")
	int verticesCount;
	@ObfuscatedName("m")
	@Export("verticesX")
	int[] verticesX;
	@ObfuscatedName("x")
	@Export("verticesY")
	int[] verticesY;
	@ObfuscatedName("j")
	@Export("verticesZ")
	int[] verticesZ;
	@ObfuscatedName("v")
	@Export("indicesCount")
	public int indicesCount;
	@ObfuscatedName("h")
	@Export("indices1")
	int[] indices1;
	@ObfuscatedName("t")
	@Export("indices2")
	int[] indices2;
	@ObfuscatedName("u")
	@Export("indices3")
	int[] indices3;
	@ObfuscatedName("d")
	@Export("faceColors1")
	int[] faceColors1;
	@ObfuscatedName("b")
	@Export("faceColors2")
	int[] faceColors2;
	@ObfuscatedName("a")
	@Export("faceColors3")
	int[] faceColors3;
	@ObfuscatedName("l")
	@Export("faceRenderPriorities")
	byte[] faceRenderPriorities;
	@ObfuscatedName("e")
	@Export("faceAlphas")
	byte[] faceAlphas;
	@ObfuscatedName("g")
	byte[] field2559;
	@ObfuscatedName("y")
	@Export("faceTextures")
	short[] faceTextures;
	@ObfuscatedName("i")
	byte field2540;
	@ObfuscatedName("r")
	int field2562;
	@ObfuscatedName("z")
	int[] field2541;
	@ObfuscatedName("o")
	int[] field2595;
	@ObfuscatedName("as")
	int[] field2565;
	@ObfuscatedName("ac")
	@Export("vertexLabels")
	int[][] vertexLabels;
	@ObfuscatedName("ao")
	@Export("faceLabelsAlpha")
	int[][] faceLabelsAlpha;
	@ObfuscatedName("ar")
	int[][] field2568;
	@ObfuscatedName("aq")
	int[][] field2569;
	@ObfuscatedName("ai")
	@Export("isSingleTile")
	public boolean isSingleTile;
	@ObfuscatedName("an")
	@Export("boundsType")
	int boundsType;
	@ObfuscatedName("aa")
	@Export("bottomY")
	int bottomY;
	@ObfuscatedName("ak")
	@Export("xzRadius")
	int xzRadius;
	@ObfuscatedName("am")
	@Export("diameter")
	int diameter;
	@ObfuscatedName("ap")
	@Export("radius")
	int radius;
	@ObfuscatedName("ab")
	@Export("xMid")
	int xMid;
	@ObfuscatedName("az")
	@Export("yMid")
	int yMid;
	@ObfuscatedName("ad")
	@Export("zMid")
	int zMid;
	@ObfuscatedName("af")
	@Export("xMidOffset")
	int xMidOffset;
	@ObfuscatedName("aj")
	@Export("yMidOffset")
	int yMidOffset;
	@ObfuscatedName("ax")
	@Export("zMidOffset")
	int zMidOffset;
	@ObfuscatedName("bq")
	@Export("overrideHue")
	public byte overrideHue;
	@ObfuscatedName("bu")
	@Export("overrideSaturation")
	public byte overrideSaturation;
	@ObfuscatedName("bs")
	@Export("overrideLuminance")
	public byte overrideLuminance;
	@ObfuscatedName("cy")
	@Export("overrideAmount")
	public byte overrideAmount;
	@ObfuscatedName("cv")
	public short field2618;

	static {
		Model_sharedSequenceModel = new Model();
		Model_sharedSequenceModelFaceAlphas = new byte[1];
		Model_sharedSpotAnimationModel = new Model();
		Model_sharedSpotAnimationModelFaceAlphas = new byte[1];
		field2543 = new class389();
		field2544 = new class389();
		field2545 = new class389();
		field2583 = new boolean[6500];
		field2584 = new boolean[6500];
		modelViewportXs = new int[6500];
		modelViewportYs = new int[6500];
		field2587 = new int[6500];
		field2588 = new int[6500];
		field2555 = new int[6500];
		field2590 = new int[6500];
		field2592 = new char[6000];
		field2593 = new char[6000][512];
		field2563 = new int[12];
		field2610 = new int[12][2000];
		field2564 = new int[2000];
		field2605 = new int[2000];
		field2598 = new int[12];
		field2599 = new int[10];
		field2603 = new int[10];
		field2570 = new int[10];
		field2591 = true;
		field2608 = Rasterizer3D.Rasterizer3D_sine;
		field2612 = Rasterizer3D.Rasterizer3D_cosine;
		field2576 = Rasterizer3D.Rasterizer3D_colorPalette;
		field2611 = Rasterizer3D.field2394;
	}

	Model() {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2540 = 0;
		this.field2562 = 0;
		this.isSingleTile = false;
		this.xMidOffset = -1;
		this.yMidOffset = -1;
		this.zMidOffset = -1;
	}

	@ObfuscatedSignature(
		descriptor = "([Lha;I)V"
	)
	public Model(Model[] var1, int var2) {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2540 = 0;
		this.field2562 = 0;
		this.isSingleTile = false;
		this.xMidOffset = -1;
		this.yMidOffset = -1;
		this.zMidOffset = -1;
		boolean var3 = false;
		boolean var4 = false;
		boolean var5 = false;
		boolean var6 = false;
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2562 = 0;
		this.field2540 = -1;

		int var7;
		Model var8;
		for (var7 = 0; var7 < var2; ++var7) {
			var8 = var1[var7];
			if (var8 != null) {
				this.verticesCount += var8.verticesCount;
				this.indicesCount += var8.indicesCount;
				this.field2562 += var8.field2562;
				if (var8.faceRenderPriorities != null) {
					var3 = true;
				} else {
					if (this.field2540 == -1) {
						this.field2540 = var8.field2540;
					}

					if (this.field2540 != var8.field2540) {
						var3 = true;
					}
				}

				var4 |= var8.faceAlphas != null;
				var5 |= var8.faceTextures != null;
				var6 |= var8.field2559 != null;
			}
		}

		this.verticesX = new int[this.verticesCount];
		this.verticesY = new int[this.verticesCount];
		this.verticesZ = new int[this.verticesCount];
		this.indices1 = new int[this.indicesCount];
		this.indices2 = new int[this.indicesCount];
		this.indices3 = new int[this.indicesCount];
		this.faceColors1 = new int[this.indicesCount];
		this.faceColors2 = new int[this.indicesCount];
		this.faceColors3 = new int[this.indicesCount];
		if (var3) {
			this.faceRenderPriorities = new byte[this.indicesCount];
		}

		if (var4) {
			this.faceAlphas = new byte[this.indicesCount];
		}

		if (var5) {
			this.faceTextures = new short[this.indicesCount];
		}

		if (var6) {
			this.field2559 = new byte[this.indicesCount];
		}

		if (this.field2562 > 0) {
			this.field2541 = new int[this.field2562];
			this.field2595 = new int[this.field2562];
			this.field2565 = new int[this.field2562];
		}

		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2562 = 0;

		for (var7 = 0; var7 < var2; ++var7) {
			var8 = var1[var7];
			if (var8 != null) {
				int var9;
				for (var9 = 0; var9 < var8.indicesCount; ++var9) {
					this.indices1[this.indicesCount] = this.verticesCount + var8.indices1[var9];
					this.indices2[this.indicesCount] = this.verticesCount + var8.indices2[var9];
					this.indices3[this.indicesCount] = this.verticesCount + var8.indices3[var9];
					this.faceColors1[this.indicesCount] = var8.faceColors1[var9];
					this.faceColors2[this.indicesCount] = var8.faceColors2[var9];
					this.faceColors3[this.indicesCount] = var8.faceColors3[var9];
					if (var3) {
						if (var8.faceRenderPriorities != null) {
							this.faceRenderPriorities[this.indicesCount] = var8.faceRenderPriorities[var9];
						} else {
							this.faceRenderPriorities[this.indicesCount] = var8.field2540;
						}
					}

					if (var4 && var8.faceAlphas != null) {
						this.faceAlphas[this.indicesCount] = var8.faceAlphas[var9];
					}

					if (var5) {
						if (var8.faceTextures != null) {
							this.faceTextures[this.indicesCount] = var8.faceTextures[var9];
						} else {
							this.faceTextures[this.indicesCount] = -1;
						}
					}

					if (var6) {
						if (var8.field2559 != null && var8.field2559[var9] != -1) {
							this.field2559[this.indicesCount] = (byte)(this.field2562 + var8.field2559[var9]);
						} else {
							this.field2559[this.indicesCount] = -1;
						}
					}

					++this.indicesCount;
				}

				for (var9 = 0; var9 < var8.field2562; ++var9) {
					this.field2541[this.field2562] = this.verticesCount + var8.field2541[var9];
					this.field2595[this.field2562] = this.verticesCount + var8.field2595[var9];
					this.field2565[this.field2562] = this.verticesCount + var8.field2565[var9];
					++this.field2562;
				}

				for (var9 = 0; var9 < var8.verticesCount; ++var9) {
					this.verticesX[this.verticesCount] = var8.verticesX[var9];
					this.verticesY[this.verticesCount] = var8.verticesY[var9];
					this.verticesZ[this.verticesCount] = var8.verticesZ[var9];
					++this.verticesCount;
				}
			}
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "([[IIIIZI)Lha;"
	)
	@Export("contourGround")
	public Model contourGround(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
		this.calculateBoundsCylinder();
		int var7 = var2 - this.xzRadius;
		int var8 = var2 + this.xzRadius;
		int var9 = var4 - this.xzRadius;
		int var10 = var4 + this.xzRadius;
		if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
			var7 >>= 7;
			var8 = var8 + 127 >> 7;
			var9 >>= 7;
			var10 = var10 + 127 >> 7;
			if (var3 == var1[var7][var9] && var3 == var1[var8][var9] && var3 == var1[var7][var10] && var3 == var1[var8][var10]) {
				return this;
			} else {
				Model var11;
				if (var5) {
					var11 = new Model();
					var11.verticesCount = this.verticesCount;
					var11.indicesCount = this.indicesCount;
					var11.field2562 = this.field2562;
					var11.verticesX = this.verticesX;
					var11.verticesZ = this.verticesZ;
					var11.indices1 = this.indices1;
					var11.indices2 = this.indices2;
					var11.indices3 = this.indices3;
					var11.faceColors1 = this.faceColors1;
					var11.faceColors2 = this.faceColors2;
					var11.faceColors3 = this.faceColors3;
					var11.faceRenderPriorities = this.faceRenderPriorities;
					var11.faceAlphas = this.faceAlphas;
					var11.field2559 = this.field2559;
					var11.faceTextures = this.faceTextures;
					var11.field2540 = this.field2540;
					var11.field2541 = this.field2541;
					var11.field2595 = this.field2595;
					var11.field2565 = this.field2565;
					var11.vertexLabels = this.vertexLabels;
					var11.faceLabelsAlpha = this.faceLabelsAlpha;
					var11.isSingleTile = this.isSingleTile;
					var11.verticesY = new int[var11.verticesCount];
				} else {
					var11 = this;
				}

				int var12;
				int var13;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				int var19;
				int var20;
				int var21;
				if (var6 == 0) {
					for (var12 = 0; var12 < var11.verticesCount; ++var12) {
						var13 = var2 + this.verticesX[var12];
						var14 = var4 + this.verticesZ[var12];
						var15 = var13 & 127;
						var16 = var14 & 127;
						var17 = var13 >> 7;
						var18 = var14 >> 7;
						var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
						var20 = var1[var17][var18 + 1] * (128 - var15) + var15 * var1[var17 + 1][var18 + 1] >> 7;
						var21 = var19 * (128 - var16) + var20 * var16 >> 7;
						var11.verticesY[var12] = var21 + this.verticesY[var12] - var3;
					}
				} else {
					for (var12 = 0; var12 < var11.verticesCount; ++var12) {
						var13 = (-this.verticesY[var12] << 16) / super.height;
						if (var13 < var6) {
							var14 = var2 + this.verticesX[var12];
							var15 = var4 + this.verticesZ[var12];
							var16 = var14 & 127;
							var17 = var15 & 127;
							var18 = var14 >> 7;
							var19 = var15 >> 7;
							var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
							var21 = var1[var18][var19 + 1] * (128 - var16) + var16 * var1[var18 + 1][var19 + 1] >> 7;
							int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
							var11.verticesY[var12] = (var6 - var13) * (var22 - var3) / var6 + this.verticesY[var12];
						}
					}
				}

				var11.resetBounds();
				return var11;
			}
		} else {
			return this;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Z)Lha;"
	)
	@Export("toSharedSequenceModel")
	public Model toSharedSequenceModel(boolean var1) {
		if (!var1 && Model_sharedSequenceModelFaceAlphas.length < this.indicesCount) {
			Model_sharedSequenceModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSequenceModel, Model_sharedSequenceModelFaceAlphas);
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Z)Lha;"
	)
	@Export("toSharedSpotAnimationModel")
	public Model toSharedSpotAnimationModel(boolean var1) {
		if (!var1 && Model_sharedSpotAnimationModelFaceAlphas.length < this.indicesCount) {
			Model_sharedSpotAnimationModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSpotAnimationModel, Model_sharedSpotAnimationModelFaceAlphas);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(ZLha;[B)Lha;"
	)
	@Export("buildSharedModel")
	Model buildSharedModel(boolean var1, Model var2, byte[] var3) {
		var2.verticesCount = this.verticesCount;
		var2.indicesCount = this.indicesCount;
		var2.field2562 = this.field2562;
		if (var2.verticesX == null || var2.verticesX.length < this.verticesCount) {
			var2.verticesX = new int[this.verticesCount + 100];
			var2.verticesY = new int[this.verticesCount + 100];
			var2.verticesZ = new int[this.verticesCount + 100];
		}

		int var4;
		for (var4 = 0; var4 < this.verticesCount; ++var4) {
			var2.verticesX[var4] = this.verticesX[var4];
			var2.verticesY[var4] = this.verticesY[var4];
			var2.verticesZ[var4] = this.verticesZ[var4];
		}

		if (var1) {
			var2.faceAlphas = this.faceAlphas;
		} else {
			var2.faceAlphas = var3;
			if (this.faceAlphas == null) {
				for (var4 = 0; var4 < this.indicesCount; ++var4) {
					var2.faceAlphas[var4] = 0;
				}
			} else {
				for (var4 = 0; var4 < this.indicesCount; ++var4) {
					var2.faceAlphas[var4] = this.faceAlphas[var4];
				}
			}
		}

		var2.indices1 = this.indices1;
		var2.indices2 = this.indices2;
		var2.indices3 = this.indices3;
		var2.faceColors1 = this.faceColors1;
		var2.faceColors2 = this.faceColors2;
		var2.faceColors3 = this.faceColors3;
		var2.faceRenderPriorities = this.faceRenderPriorities;
		var2.field2559 = this.field2559;
		var2.faceTextures = this.faceTextures;
		var2.field2540 = this.field2540;
		var2.field2541 = this.field2541;
		var2.field2595 = this.field2595;
		var2.field2565 = this.field2565;
		var2.vertexLabels = this.vertexLabels;
		var2.faceLabelsAlpha = this.faceLabelsAlpha;
		var2.field2568 = this.field2568;
		var2.field2569 = this.field2569;
		var2.isSingleTile = this.isSingleTile;
		var2.resetBounds();
		var2.overrideAmount = 0;
		return var2;
	}

	@ObfuscatedName("q")
	@Export("calculateBoundingBox")
	void calculateBoundingBox(int var1) {
		if (this.xMidOffset == -1) {
			int var2 = 0;
			int var3 = 0;
			int var4 = 0;
			int var5 = 0;
			int var6 = 0;
			int var7 = 0;
			int var8 = field2612[var1];
			int var9 = field2608[var1];

			for (int var10 = 0; var10 < this.verticesCount; ++var10) {
				int var11 = Rasterizer3D.method4152(this.verticesX[var10], this.verticesZ[var10], var8, var9);
				int var12 = this.verticesY[var10];
				int var13 = Rasterizer3D.method4153(this.verticesX[var10], this.verticesZ[var10], var8, var9);
				if (var11 < var2) {
					var2 = var11;
				}

				if (var11 > var5) {
					var5 = var11;
				}

				if (var12 < var3) {
					var3 = var12;
				}

				if (var12 > var6) {
					var6 = var12;
				}

				if (var13 < var4) {
					var4 = var13;
				}

				if (var13 > var7) {
					var7 = var13;
				}
			}

			this.xMid = (var5 + var2) / 2;
			this.yMid = (var6 + var3) / 2;
			this.zMid = (var7 + var4) / 2;
			this.xMidOffset = (var5 - var2 + 1) / 2;
			this.yMidOffset = (var6 - var3 + 1) / 2;
			this.zMidOffset = (var7 - var4 + 1) / 2;
			boolean var14 = true;
			if (this.xMidOffset < 32) {
				this.xMidOffset = 32;
			}

			if (this.zMidOffset < 32) {
				this.zMidOffset = 32;
			}

			if (this.isSingleTile) {
				boolean var15 = true;
				this.xMidOffset += 8;
				this.zMidOffset += 8;
			}

		}
	}

	@ObfuscatedName("m")
	@Export("calculateBoundsCylinder")
	public void calculateBoundsCylinder() {
		if (this.boundsType != 1) {
			this.boundsType = 1;
			super.height = 0;
			this.bottomY = 0;
			this.xzRadius = 0;

			for (int var1 = 0; var1 < this.verticesCount; ++var1) {
				int var2 = this.verticesX[var1];
				int var3 = this.verticesY[var1];
				int var4 = this.verticesZ[var1];
				if (-var3 > super.height) {
					super.height = -var3;
				}

				if (var3 > this.bottomY) {
					this.bottomY = var3;
				}

				int var5 = var2 * var2 + var4 * var4;
				if (var5 > this.xzRadius) {
					this.xzRadius = var5;
				}
			}

			this.xzRadius = (int)(Math.sqrt((double)this.xzRadius) + 0.99D);
			this.radius = (int)(Math.sqrt((double)(this.xzRadius * this.xzRadius + super.height * super.height)) + 0.99D);
			this.diameter = this.radius + (int)(Math.sqrt((double)(this.xzRadius * this.xzRadius + this.bottomY * this.bottomY)) + 0.99D);
		}
	}

	@ObfuscatedName("x")
	void method4513() {
		if (this.boundsType != 2) {
			this.boundsType = 2;
			this.xzRadius = 0;

			for (int var1 = 0; var1 < this.verticesCount; ++var1) {
				int var2 = this.verticesX[var1];
				int var3 = this.verticesY[var1];
				int var4 = this.verticesZ[var1];
				int var5 = var2 * var2 + var4 * var4 + var3 * var3;
				if (var5 > this.xzRadius) {
					this.xzRadius = var5;
				}
			}

			this.xzRadius = (int)(Math.sqrt((double)this.xzRadius) + 0.99D);
			this.radius = this.xzRadius;
			this.diameter = this.xzRadius + this.xzRadius;
		}
	}

	@ObfuscatedName("j")
	public int method4514() {
		this.calculateBoundsCylinder();
		return this.xzRadius;
	}

	@ObfuscatedName("v")
	@Export("resetBounds")
	public void resetBounds() {
		this.boundsType = 0;
		this.xMidOffset = -1;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lgt;I)V"
	)
	@Export("animate")
	public void animate(Frames var1, int var2) {
		if (this.vertexLabels != null) {
			if (var2 != -1) {
				Animation var3 = var1.frames[var2];
				Skeleton var4 = var3.skeleton;
				Model_transformTempX = 0;
				Model_transformTempY = 0;
				Model_transformTempZ = 0;

				for (int var5 = 0; var5 < var3.transformCount; ++var5) {
					int var6 = var3.transformSkeletonLabels[var5];
					this.transform(var4.transformTypes[var6], var4.labels[var6], var3.transformXs[var5], var3.transformYs[var5], var3.transformZs[var5]);
				}

				this.resetBounds();
			}
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Ldy;I)V"
	)
	public void method4601(class123 var1, int var2) {
		Skeleton var3 = var1.field1516;
		class202 var4 = var3.method4249();
		if (var4 != null) {
			var3.method4249().method4230(var1, var2);
			this.method4519(var3.method4249(), var1.method2945());
		}

		if (var1.method2931()) {
			this.method4518(var1, var2);
		}

		this.resetBounds();
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Ldy;I)V"
	)
	void method4518(class123 var1, int var2) {
		Skeleton var3 = var1.field1516;

		for (int var4 = 0; var4 < var3.count; ++var4) {
			int var5 = var3.transformTypes[var4];
			if (var5 == 5 && var1.field1514 != null && var1.field1514[var4] != null && var1.field1514[var4][0] != null && this.faceLabelsAlpha != null && this.faceAlphas != null) {
				class118 var6 = var1.field1514[var4][0];
				int[] var7 = var3.labels[var4];
				int var8 = var7.length;

				for (int var9 = 0; var9 < var8; ++var9) {
					int var10 = var7[var9];
					if (var10 < this.faceLabelsAlpha.length) {
						int[] var11 = this.faceLabelsAlpha[var10];

						for (int var12 = 0; var12 < var11.length; ++var12) {
							int var13 = var11[var12];
							int var14 = (int)((float)(this.faceAlphas[var13] & 255) + var6.method2870(var2) * 255.0F);
							if (var14 < 0) {
								var14 = 0;
							} else if (var14 > 255) {
								var14 = 255;
							}

							this.faceAlphas[var13] = (byte)var14;
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lge;I)V"
	)
	void method4519(class202 var1, int var2) {
		this.method4586(var1, var2);
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lgt;ILgt;I[I)V"
	)
	@Export("animate2")
	public void animate2(Frames var1, int var2, Frames var3, int var4, int[] var5) {
		if (var2 != -1) {
			if (var5 != null && var4 != -1) {
				Animation var6 = var1.frames[var2];
				Animation var7 = var3.frames[var4];
				Skeleton var8 = var6.skeleton;
				Model_transformTempX = 0;
				Model_transformTempY = 0;
				Model_transformTempZ = 0;
				byte var9 = 0;
				int var13 = var9 + 1;
				int var10 = var5[var9];

				int var11;
				int var12;
				for (var11 = 0; var11 < var6.transformCount; ++var11) {
					for (var12 = var6.transformSkeletonLabels[var11]; var12 > var10; var10 = var5[var13++]) {
					}

					if (var12 != var10 || var8.transformTypes[var12] == 0) {
						this.transform(var8.transformTypes[var12], var8.labels[var12], var6.transformXs[var11], var6.transformYs[var11], var6.transformZs[var11]);
					}
				}

				Model_transformTempX = 0;
				Model_transformTempY = 0;
				Model_transformTempZ = 0;
				var9 = 0;
				var13 = var9 + 1;
				var10 = var5[var9];

				for (var11 = 0; var11 < var7.transformCount; ++var11) {
					for (var12 = var7.transformSkeletonLabels[var11]; var12 > var10; var10 = var5[var13++]) {
					}

					if (var12 == var10 || var8.transformTypes[var12] == 0) {
						this.transform(var8.transformTypes[var12], var8.labels[var12], var7.transformXs[var11], var7.transformYs[var11], var7.transformZs[var11]);
					}
				}

				this.resetBounds();
			} else {
				this.animate(var1, var2);
			}
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lgm;Ldy;I[ZZZ)V"
	)
	public void method4517(Skeleton var1, class123 var2, int var3, boolean[] var4, boolean var5, boolean var6) {
		class202 var7 = var1.method4249();
		if (var7 != null) {
			var7.method4235(var2, var3, var4, var5);
			if (var6) {
				this.method4519(var7, var2.method2945());
			}
		}

		if (!var5 && var2.method2931()) {
			this.method4518(var2, var3);
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lgt;I[IZ)V"
	)
	public void method4522(Frames var1, int var2, int[] var3, boolean var4) {
		if (var3 == null) {
			this.animate(var1, var2);
		} else {
			Animation var5 = var1.frames[var2];
			Skeleton var6 = var5.skeleton;
			byte var7 = 0;
			int var11 = var7 + 1;
			int var8 = var3[var7];
			Model_transformTempX = 0;
			Model_transformTempY = 0;
			Model_transformTempZ = 0;

			for (int var9 = 0; var9 < var5.transformCount; ++var9) {
				int var10;
				for (var10 = var5.transformSkeletonLabels[var9]; var10 > var8; var8 = var3[var11++]) {
				}

				if (var4) {
					if (var10 == var8 || var6.transformTypes[var10] == 0) {
						this.transform(var6.transformTypes[var10], var6.labels[var10], var5.transformXs[var9], var5.transformYs[var9], var5.transformZs[var9]);
					}
				} else if (var10 != var8 || var6.transformTypes[var10] == 0) {
					this.transform(var6.transformTypes[var10], var6.labels[var10], var5.transformXs[var9], var5.transformYs[var9], var5.transformZs[var9]);
				}
			}

		}
	}

	@ObfuscatedName("e")
	@Export("transform")
	void transform(int var1, int[] var2, int var3, int var4, int var5) {
		int var6 = var2.length;
		int var7;
		int var8;
		int var11;
		int var12;
		if (var1 == 0) {
			var7 = 0;
			Model_transformTempX = 0;
			Model_transformTempY = 0;
			Model_transformTempZ = 0;

			for (var8 = 0; var8 < var6; ++var8) {
				int var18 = var2[var8];
				if (var18 < this.vertexLabels.length) {
					int[] var19 = this.vertexLabels[var18];

					for (var11 = 0; var11 < var19.length; ++var11) {
						var12 = var19[var11];
						Model_transformTempX += this.verticesX[var12];
						Model_transformTempY += this.verticesY[var12];
						Model_transformTempZ += this.verticesZ[var12];
						++var7;
					}
				}
			}

			if (var7 > 0) {
				Model_transformTempX = var3 + Model_transformTempX / var7;
				Model_transformTempY = var4 + Model_transformTempY / var7;
				Model_transformTempZ = var5 + Model_transformTempZ / var7;
			} else {
				Model_transformTempX = var3;
				Model_transformTempY = var4;
				Model_transformTempZ = var5;
			}

		} else {
			int[] var9;
			int var10;
			int[] var10000;
			if (var1 == 1) {
				for (var7 = 0; var7 < var6; ++var7) {
					var8 = var2[var7];
					if (var8 < this.vertexLabels.length) {
						var9 = this.vertexLabels[var8];

						for (var10 = 0; var10 < var9.length; ++var10) {
							var11 = var9[var10];
							var10000 = this.verticesX;
							var10000[var11] += var3;
							var10000 = this.verticesY;
							var10000[var11] += var4;
							var10000 = this.verticesZ;
							var10000[var11] += var5;
						}
					}
				}

			} else if (var1 == 2) {
				for (var7 = 0; var7 < var6; ++var7) {
					var8 = var2[var7];
					if (var8 < this.vertexLabels.length) {
						var9 = this.vertexLabels[var8];

						for (var10 = 0; var10 < var9.length; ++var10) {
							var11 = var9[var10];
							var10000 = this.verticesX;
							var10000[var11] -= Model_transformTempX;
							var10000 = this.verticesY;
							var10000[var11] -= Model_transformTempY;
							var10000 = this.verticesZ;
							var10000[var11] -= Model_transformTempZ;
							var12 = (var3 & 255) * 8;
							int var13 = (var4 & 255) * 8;
							int var14 = (var5 & 255) * 8;
							int var15;
							int var16;
							int var17;
							if (var14 != 0) {
								var15 = field2608[var14];
								var16 = field2612[var14];
								var17 = var15 * this.verticesY[var11] + var16 * this.verticesX[var11] >> 16;
								this.verticesY[var11] = var16 * this.verticesY[var11] - var15 * this.verticesX[var11] >> 16;
								this.verticesX[var11] = var17;
							}

							if (var12 != 0) {
								var15 = field2608[var12];
								var16 = field2612[var12];
								var17 = var16 * this.verticesY[var11] - var15 * this.verticesZ[var11] >> 16;
								this.verticesZ[var11] = var15 * this.verticesY[var11] + var16 * this.verticesZ[var11] >> 16;
								this.verticesY[var11] = var17;
							}

							if (var13 != 0) {
								var15 = field2608[var13];
								var16 = field2612[var13];
								var17 = var15 * this.verticesZ[var11] + var16 * this.verticesX[var11] >> 16;
								this.verticesZ[var11] = var16 * this.verticesZ[var11] - var15 * this.verticesX[var11] >> 16;
								this.verticesX[var11] = var17;
							}

							var10000 = this.verticesX;
							var10000[var11] += Model_transformTempX;
							var10000 = this.verticesY;
							var10000[var11] += Model_transformTempY;
							var10000 = this.verticesZ;
							var10000[var11] += Model_transformTempZ;
						}
					}
				}

			} else if (var1 == 3) {
				for (var7 = 0; var7 < var6; ++var7) {
					var8 = var2[var7];
					if (var8 < this.vertexLabels.length) {
						var9 = this.vertexLabels[var8];

						for (var10 = 0; var10 < var9.length; ++var10) {
							var11 = var9[var10];
							var10000 = this.verticesX;
							var10000[var11] -= Model_transformTempX;
							var10000 = this.verticesY;
							var10000[var11] -= Model_transformTempY;
							var10000 = this.verticesZ;
							var10000[var11] -= Model_transformTempZ;
							this.verticesX[var11] = var3 * this.verticesX[var11] / 128;
							this.verticesY[var11] = var4 * this.verticesY[var11] / 128;
							this.verticesZ[var11] = var5 * this.verticesZ[var11] / 128;
							var10000 = this.verticesX;
							var10000[var11] += Model_transformTempX;
							var10000 = this.verticesY;
							var10000[var11] += Model_transformTempY;
							var10000 = this.verticesZ;
							var10000[var11] += Model_transformTempZ;
						}
					}
				}

			} else if (var1 == 5) {
				if (this.faceLabelsAlpha != null && this.faceAlphas != null) {
					for (var7 = 0; var7 < var6; ++var7) {
						var8 = var2[var7];
						if (var8 < this.faceLabelsAlpha.length) {
							var9 = this.faceLabelsAlpha[var8];

							for (var10 = 0; var10 < var9.length; ++var10) {
								var11 = var9[var10];
								var12 = (this.faceAlphas[var11] & 255) + var3 * 8;
								if (var12 < 0) {
									var12 = 0;
								} else if (var12 > 255) {
									var12 = 255;
								}

								this.faceAlphas[var11] = (byte)var12;
							}
						}
					}
				}

			}
		}
	}

	@ObfuscatedName("g")
	@Export("rotateY90Ccw")
	public void rotateY90Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) {
			int var2 = this.verticesX[var1];
			this.verticesX[var1] = this.verticesZ[var1];
			this.verticesZ[var1] = -var2;
		}

		this.resetBounds();
	}

	@ObfuscatedName("y")
	@Export("rotateY180")
	public void rotateY180() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) {
			this.verticesX[var1] = -this.verticesX[var1];
			this.verticesZ[var1] = -this.verticesZ[var1];
		}

		this.resetBounds();
	}

	@ObfuscatedName("i")
	@Export("rotateY270Ccw")
	public void rotateY270Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) {
			int var2 = this.verticesZ[var1];
			this.verticesZ[var1] = this.verticesX[var1];
			this.verticesX[var1] = -var2;
		}

		this.resetBounds();
	}

	@ObfuscatedName("r")
	@Export("rotateZ")
	public void rotateZ(int var1) {
		int var2 = field2608[var1];
		int var3 = field2612[var1];

		for (int var4 = 0; var4 < this.verticesCount; ++var4) {
			int var5 = var3 * this.verticesY[var4] - var2 * this.verticesZ[var4] >> 16;
			this.verticesZ[var4] = var2 * this.verticesY[var4] + var3 * this.verticesZ[var4] >> 16;
			this.verticesY[var4] = var5;
		}

		this.resetBounds();
	}

	@ObfuscatedName("z")
	@Export("offsetBy")
	public void offsetBy(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.verticesCount; ++var4) {
			int[] var10000 = this.verticesX;
			var10000[var4] += var1;
			var10000 = this.verticesY;
			var10000[var4] += var2;
			var10000 = this.verticesZ;
			var10000[var4] += var3;
		}

		this.resetBounds();
	}

	@ObfuscatedName("o")
	@Export("scale")
	public void scale(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.verticesCount; ++var4) {
			this.verticesX[var4] = this.verticesX[var4] * var1 / 128;
			this.verticesY[var4] = var2 * this.verticesY[var4] / 128;
			this.verticesZ[var4] = var3 * this.verticesZ[var4] / 128;
		}

		this.resetBounds();
	}

	@ObfuscatedName("as")
	public final void method4530(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (this.boundsType != 2 && this.boundsType != 1) {
			this.method4513();
		}

		int var8 = Rasterizer3D.Rasterizer3D_clipMidX;
		int var9 = Rasterizer3D.Rasterizer3D_clipMidY;
		int var10 = field2608[var1];
		int var11 = field2612[var1];
		int var12 = field2608[var2];
		int var13 = field2612[var2];
		int var14 = field2608[var3];
		int var15 = field2612[var3];
		int var16 = field2608[var4];
		int var17 = field2612[var4];
		int var18 = var16 * var6 + var17 * var7 >> 16;

		for (int var19 = 0; var19 < this.verticesCount; ++var19) {
			int var20 = this.verticesX[var19];
			int var21 = this.verticesY[var19];
			int var22 = this.verticesZ[var19];
			int var23;
			if (var3 != 0) {
				var23 = var21 * var14 + var20 * var15 >> 16;
				var21 = var21 * var15 - var20 * var14 >> 16;
				var20 = var23;
			}

			if (var1 != 0) {
				var23 = var21 * var11 - var22 * var10 >> 16;
				var22 = var21 * var10 + var22 * var11 >> 16;
				var21 = var23;
			}

			if (var2 != 0) {
				var23 = var22 * var12 + var20 * var13 >> 16;
				var22 = var22 * var13 - var20 * var12 >> 16;
				var20 = var23;
			}

			var20 += var5;
			var21 += var6;
			var22 += var7;
			var23 = var21 * var17 - var22 * var16 >> 16;
			var22 = var21 * var16 + var22 * var17 >> 16;
			field2587[var19] = var22 - var18;
			modelViewportXs[var19] = var20 * Rasterizer3D.Rasterizer3D_zoom / var22 + var8;
			modelViewportYs[var19] = var23 * Rasterizer3D.Rasterizer3D_zoom / var22 + var9;
			if (this.field2562 > 0) {
				field2588[var19] = var20;
				field2555[var19] = var23;
				field2590[var19] = var22;
			}
		}

		try {
			this.draw0(false, false, false, 0L);
		} catch (Exception var25) {
		}

	}

	@ObfuscatedName("ac")
	public final void method4600(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (this.boundsType != 2 && this.boundsType != 1) {
			this.method4513();
		}

		int var9 = Rasterizer3D.Rasterizer3D_clipMidX;
		int var10 = Rasterizer3D.Rasterizer3D_clipMidY;
		int var11 = field2608[var1];
		int var12 = field2612[var1];
		int var13 = field2608[var2];
		int var14 = field2612[var2];
		int var15 = field2608[var3];
		int var16 = field2612[var3];
		int var17 = field2608[var4];
		int var18 = field2612[var4];
		int var19 = var17 * var6 + var18 * var7 >> 16;

		for (int var20 = 0; var20 < this.verticesCount; ++var20) {
			int var21 = this.verticesX[var20];
			int var22 = this.verticesY[var20];
			int var23 = this.verticesZ[var20];
			int var24;
			if (var3 != 0) {
				var24 = var22 * var15 + var21 * var16 >> 16;
				var22 = var22 * var16 - var21 * var15 >> 16;
				var21 = var24;
			}

			if (var1 != 0) {
				var24 = var22 * var12 - var23 * var11 >> 16;
				var23 = var22 * var11 + var23 * var12 >> 16;
				var22 = var24;
			}

			if (var2 != 0) {
				var24 = var23 * var13 + var21 * var14 >> 16;
				var23 = var23 * var14 - var21 * var13 >> 16;
				var21 = var24;
			}

			var21 += var5;
			var22 += var6;
			var23 += var7;
			var24 = var22 * var18 - var23 * var17 >> 16;
			var23 = var22 * var17 + var23 * var18 >> 16;
			field2587[var20] = var23 - var19;
			modelViewportXs[var20] = var9 + var21 * Rasterizer3D.Rasterizer3D_zoom / var8;
			modelViewportYs[var20] = var10 + var24 * Rasterizer3D.Rasterizer3D_zoom / var8;
			if (this.field2562 > 0) {
				field2588[var20] = var21;
				field2555[var20] = var24;
				field2590[var20] = var23;
			}
		}

		try {
			this.draw0(false, false, false, 0L);
		} catch (Exception var26) {
		}

	}

	@ObfuscatedName("ao")
	@Export("draw0")
	final void draw0(boolean var1, boolean var2, boolean var3, long var4) {
		if (this.diameter < 6000) {
			int var6;
			for (var6 = 0; var6 < this.diameter; ++var6) {
				field2592[var6] = 0;
			}

			var6 = var3 ? 20 : 5;

			int var8;
			int var9;
			int var10;
			int var11;
			int var12;
			int var15;
			int var16;
			int var18;
			int var28;
			for (char var7 = 0; var7 < this.indicesCount; ++var7) {
				if (this.faceColors3[var7] != -2) {
					var8 = this.indices1[var7];
					var9 = this.indices2[var7];
					var10 = this.indices3[var7];
					var11 = modelViewportXs[var8];
					var12 = modelViewportXs[var9];
					var28 = modelViewportXs[var10];
					int var29;
					int var30;
					if (!var1 || var11 != -5000 && var12 != -5000 && var28 != -5000) {
						if (var2) {
							var15 = modelViewportYs[var8];
							var16 = modelViewportYs[var9];
							var30 = modelViewportYs[var10];
							var18 = var6 + ViewportMouse.ViewportMouse_y;
							boolean var37;
							if (var18 < var15 && var18 < var16 && var18 < var30) {
								var37 = false;
							} else {
								var18 = ViewportMouse.ViewportMouse_y - var6;
								if (var18 > var15 && var18 > var16 && var18 > var30) {
									var37 = false;
								} else {
									var18 = var6 + ViewportMouse.ViewportMouse_x;
									if (var18 < var11 && var18 < var12 && var18 < var28) {
										var37 = false;
									} else {
										var18 = ViewportMouse.ViewportMouse_x - var6;
										if (var18 > var11 && var18 > var12 && var18 > var28) {
											var37 = false;
										} else {
											var37 = true;
										}
									}
								}
							}

							if (var37) {
								ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var4;
								var2 = false;
							}
						}

						if ((var11 - var12) * (modelViewportYs[var10] - modelViewportYs[var9]) - (var28 - var12) * (modelViewportYs[var8] - modelViewportYs[var9]) > 0) {
							field2584[var7] = false;
							if (var11 >= 0 && var12 >= 0 && var28 >= 0 && var11 <= Rasterizer3D.Rasterizer3D_clipWidth && var12 <= Rasterizer3D.Rasterizer3D_clipWidth && var28 <= Rasterizer3D.Rasterizer3D_clipWidth) {
								field2583[var7] = false;
							} else {
								field2583[var7] = true;
							}

							var29 = (field2587[var8] + field2587[var9] + field2587[var10]) / 3 + this.radius;
							field2593[var29][field2592[var29]++] = var7;
						}
					} else {
						var29 = field2588[var8];
						var15 = field2588[var9];
						var16 = field2588[var10];
						var30 = field2555[var8];
						var18 = field2555[var9];
						int var19 = field2555[var10];
						int var20 = field2590[var8];
						int var21 = field2590[var9];
						int var22 = field2590[var10];
						var29 -= var15;
						var16 -= var15;
						var30 -= var18;
						var19 -= var18;
						var20 -= var21;
						var22 -= var21;
						int var23 = var30 * var22 - var20 * var19;
						int var24 = var20 * var16 - var29 * var22;
						int var25 = var29 * var19 - var30 * var16;
						if (var15 * var23 + var18 * var24 + var21 * var25 > 0) {
							field2584[var7] = true;
							int var26 = (field2587[var8] + field2587[var9] + field2587[var10]) / 3 + this.radius;
							field2593[var26][field2592[var26]++] = var7;
						}
					}
				}
			}

			char[] var27;
			int var33;
			char var34;
			if (this.faceRenderPriorities == null) {
				for (var33 = this.diameter - 1; var33 >= 0; --var33) {
					var34 = field2592[var33];
					if (var34 > 0) {
						var27 = field2593[var33];

						for (var10 = 0; var10 < var34; ++var10) {
							this.drawFace(var27[var10]);
						}
					}
				}

			} else {
				for (var33 = 0; var33 < 12; ++var33) {
					field2563[var33] = 0;
					field2598[var33] = 0;
				}

				for (var33 = this.diameter - 1; var33 >= 0; --var33) {
					var34 = field2592[var33];
					if (var34 > 0) {
						var27 = field2593[var33];

						for (var10 = 0; var10 < var34; ++var10) {
							char var35 = var27[var10];
							byte var36 = this.faceRenderPriorities[var35];
							var28 = field2563[var36]++;
							field2610[var36][var28] = var35;
							if (var36 < 10) {
								int[] var38 = field2598;
								var38[var36] += var33;
							} else if (var36 == 10) {
								field2564[var28] = var33;
							} else {
								field2605[var28] = var33;
							}
						}
					}
				}

				var33 = 0;
				if (field2563[1] > 0 || field2563[2] > 0) {
					var33 = (field2598[1] + field2598[2]) / (field2563[1] + field2563[2]);
				}

				var8 = 0;
				if (field2563[3] > 0 || field2563[4] > 0) {
					var8 = (field2598[3] + field2598[4]) / (field2563[3] + field2563[4]);
				}

				var9 = 0;
				if (field2563[6] > 0 || field2563[8] > 0) {
					var9 = (field2598[8] + field2598[6]) / (field2563[8] + field2563[6]);
				}

				var11 = 0;
				var12 = field2563[10];
				int[] var13 = field2610[10];
				int[] var14 = field2564;
				if (var11 == var12) {
					var11 = 0;
					var12 = field2563[11];
					var13 = field2610[11];
					var14 = field2605;
				}

				if (var11 < var12) {
					var10 = var14[var11];
				} else {
					var10 = -1000;
				}

				for (var15 = 0; var15 < 10; ++var15) {
					while (var15 == 0 && var10 > var33) {
						this.drawFace(var13[var11++]);
						if (var11 == var12 && var13 != field2610[11]) {
							var11 = 0;
							var12 = field2563[11];
							var13 = field2610[11];
							var14 = field2605;
						}

						if (var11 < var12) {
							var10 = var14[var11];
						} else {
							var10 = -1000;
						}
					}

					while (var15 == 3 && var10 > var8) {
						this.drawFace(var13[var11++]);
						if (var11 == var12 && var13 != field2610[11]) {
							var11 = 0;
							var12 = field2563[11];
							var13 = field2610[11];
							var14 = field2605;
						}

						if (var11 < var12) {
							var10 = var14[var11];
						} else {
							var10 = -1000;
						}
					}

					while (var15 == 5 && var10 > var9) {
						this.drawFace(var13[var11++]);
						if (var11 == var12 && var13 != field2610[11]) {
							var11 = 0;
							var12 = field2563[11];
							var13 = field2610[11];
							var14 = field2605;
						}

						if (var11 < var12) {
							var10 = var14[var11];
						} else {
							var10 = -1000;
						}
					}

					var16 = field2563[var15];
					int[] var17 = field2610[var15];

					for (var18 = 0; var18 < var16; ++var18) {
						this.drawFace(var17[var18]);
					}
				}

				while (var10 != -1000) {
					this.drawFace(var13[var11++]);
					if (var11 == var12 && var13 != field2610[11]) {
						var11 = 0;
						var13 = field2610[11];
						var12 = field2563[11];
						var14 = field2605;
					}

					if (var11 < var12) {
						var10 = var14[var11];
					} else {
						var10 = -1000;
					}
				}

			}
		}
	}

	@ObfuscatedName("ar")
	@Export("drawFace")
	final void drawFace(int var1) {
		if (field2584[var1]) {
			this.method4537(var1);
		} else {
			int var2 = this.indices1[var1];
			int var3 = this.indices2[var1];
			int var4 = this.indices3[var1];
			Rasterizer3D.field2372 = field2583[var1];
			if (this.faceAlphas == null) {
				Rasterizer3D.Rasterizer3D_alpha = 0;
			} else {
				Rasterizer3D.Rasterizer3D_alpha = this.faceAlphas[var1] & 255;
			}

			this.method4535(var1, modelViewportYs[var2], modelViewportYs[var3], modelViewportYs[var4], modelViewportXs[var2], modelViewportXs[var3], modelViewportXs[var4], this.faceColors1[var1], this.faceColors2[var1], this.faceColors3[var1]);
		}
	}

	@ObfuscatedName("aq")
	boolean method4568(int var1) {
		return this.overrideAmount > 0 && var1 < this.field2618;
	}

	@ObfuscatedName("ai")
	final void method4535(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		if (this.faceTextures != null && this.faceTextures[var1] != -1) {
			int var12;
			int var13;
			int var15;
			if (this.field2559 != null && this.field2559[var1] != -1) {
				int var14 = this.field2559[var1] & 255;
				var15 = this.field2541[var14];
				var12 = this.field2595[var14];
				var13 = this.field2565[var14];
			} else {
				var15 = this.indices1[var1];
				var12 = this.indices2[var1];
				var13 = this.indices3[var1];
			}

			if (this.faceColors3[var1] == -1) {
				Rasterizer3D.method4147(var2, var3, var4, var5, var6, var7, var8, var8, var8, field2588[var15], field2588[var12], field2588[var13], field2555[var15], field2555[var12], field2555[var13], field2590[var15], field2590[var12], field2590[var13], this.faceTextures[var1]);
			} else {
				Rasterizer3D.method4147(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2588[var15], field2588[var12], field2588[var13], field2555[var15], field2555[var12], field2555[var13], field2590[var15], field2590[var12], field2590[var13], this.faceTextures[var1]);
			}
		} else {
			boolean var11 = this.method4568(var1);
			if (this.faceColors3[var1] == -1 && var11) {
				Rasterizer3D.method4151(var2, var3, var4, var5, var6, var7, field2576[this.faceColors1[var1]], this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount);
			} else if (this.faceColors3[var1] == -1) {
				Rasterizer3D.method4173(var2, var3, var4, var5, var6, var7, field2576[this.faceColors1[var1]]);
			} else if (var11) {
				Rasterizer3D.method4168(var2, var3, var4, var5, var6, var7, var8, var9, var10, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount);
			} else {
				Rasterizer3D.method4140(var2, var3, var4, var5, var6, var7, var8, var9, var10);
			}
		}

	}

	@ObfuscatedName("an")
	final void method4537(int var1) {
		int var2 = Rasterizer3D.Rasterizer3D_clipMidX;
		int var3 = Rasterizer3D.Rasterizer3D_clipMidY;
		int var4 = 0;
		int var5 = this.indices1[var1];
		int var6 = this.indices2[var1];
		int var7 = this.indices3[var1];
		int var8 = field2590[var5];
		int var9 = field2590[var6];
		int var10 = field2590[var7];
		if (this.faceAlphas == null) {
			Rasterizer3D.Rasterizer3D_alpha = 0;
		} else {
			Rasterizer3D.Rasterizer3D_alpha = this.faceAlphas[var1] & 255;
		}

		int var11;
		int var12;
		int var13;
		int var14;
		if (var8 >= 50) {
			field2599[var4] = modelViewportXs[var5];
			field2603[var4] = modelViewportYs[var5];
			field2570[var4++] = this.faceColors1[var1];
		} else {
			var11 = field2588[var5];
			var12 = field2555[var5];
			var13 = this.faceColors1[var1];
			if (var10 >= 50) {
				var14 = field2611[var10 - var8] * (50 - var8);
				field2599[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2588[var7] - var11) * var14 >> 16)) / 50;
				field2603[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2555[var7] - var12) * var14 >> 16)) / 50;
				field2570[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16);
			}

			if (var9 >= 50) {
				var14 = field2611[var9 - var8] * (50 - var8);
				field2599[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2588[var6] - var11) * var14 >> 16)) / 50;
				field2603[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2555[var6] - var12) * var14 >> 16)) / 50;
				field2570[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16);
			}
		}

		if (var9 >= 50) {
			field2599[var4] = modelViewportXs[var6];
			field2603[var4] = modelViewportYs[var6];
			field2570[var4++] = this.faceColors2[var1];
		} else {
			var11 = field2588[var6];
			var12 = field2555[var6];
			var13 = this.faceColors2[var1];
			if (var8 >= 50) {
				var14 = field2611[var8 - var9] * (50 - var9);
				field2599[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2588[var5] - var11) * var14 >> 16)) / 50;
				field2603[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2555[var5] - var12) * var14 >> 16)) / 50;
				field2570[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16);
			}

			if (var10 >= 50) {
				var14 = field2611[var10 - var9] * (50 - var9);
				field2599[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2588[var7] - var11) * var14 >> 16)) / 50;
				field2603[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2555[var7] - var12) * var14 >> 16)) / 50;
				field2570[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16);
			}
		}

		if (var10 >= 50) {
			field2599[var4] = modelViewportXs[var7];
			field2603[var4] = modelViewportYs[var7];
			field2570[var4++] = this.faceColors3[var1];
		} else {
			var11 = field2588[var7];
			var12 = field2555[var7];
			var13 = this.faceColors3[var1];
			if (var9 >= 50) {
				var14 = field2611[var9 - var10] * (50 - var10);
				field2599[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2588[var6] - var11) * var14 >> 16)) / 50;
				field2603[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2555[var6] - var12) * var14 >> 16)) / 50;
				field2570[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16);
			}

			if (var8 >= 50) {
				var14 = field2611[var8 - var10] * (50 - var10);
				field2599[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2588[var5] - var11) * var14 >> 16)) / 50;
				field2603[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2555[var5] - var12) * var14 >> 16)) / 50;
				field2570[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16);
			}
		}

		var11 = field2599[0];
		var12 = field2599[1];
		var13 = field2599[2];
		var14 = field2603[0];
		int var15 = field2603[1];
		int var16 = field2603[2];
		Rasterizer3D.field2372 = false;
		if (var4 == 3) {
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > Rasterizer3D.Rasterizer3D_clipWidth || var12 > Rasterizer3D.Rasterizer3D_clipWidth || var13 > Rasterizer3D.Rasterizer3D_clipWidth) {
				Rasterizer3D.field2372 = true;
			}

			this.method4535(var1, var14, var15, var16, var11, var12, var13, field2570[0], field2570[1], field2570[2]);
		}

		if (var4 == 4) {
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > Rasterizer3D.Rasterizer3D_clipWidth || var12 > Rasterizer3D.Rasterizer3D_clipWidth || var13 > Rasterizer3D.Rasterizer3D_clipWidth || field2599[3] < 0 || field2599[3] > Rasterizer3D.Rasterizer3D_clipWidth) {
				Rasterizer3D.field2372 = true;
			}

			int var18;
			if (this.faceTextures != null && this.faceTextures[var1] != -1) {
				int var19;
				int var21;
				if (this.field2559 != null && this.field2559[var1] != -1) {
					int var20 = this.field2559[var1] & 255;
					var21 = this.field2541[var20];
					var18 = this.field2595[var20];
					var19 = this.field2565[var20];
				} else {
					var21 = var5;
					var18 = var6;
					var19 = var7;
				}

				short var22 = this.faceTextures[var1];
				if (this.faceColors3[var1] == -1) {
					Rasterizer3D.method4147(var14, var15, var16, var11, var12, var13, this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2588[var21], field2588[var18], field2588[var19], field2555[var21], field2555[var18], field2555[var19], field2590[var21], field2590[var18], field2590[var19], var22);
					Rasterizer3D.method4147(var14, var16, field2603[3], var11, var13, field2599[3], this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2588[var21], field2588[var18], field2588[var19], field2555[var21], field2555[var18], field2555[var19], field2590[var21], field2590[var18], field2590[var19], var22);
				} else {
					Rasterizer3D.method4147(var14, var15, var16, var11, var12, var13, field2570[0], field2570[1], field2570[2], field2588[var21], field2588[var18], field2588[var19], field2555[var21], field2555[var18], field2555[var19], field2590[var21], field2590[var18], field2590[var19], var22);
					Rasterizer3D.method4147(var14, var16, field2603[3], var11, var13, field2599[3], field2570[0], field2570[2], field2570[3], field2588[var21], field2588[var18], field2588[var19], field2555[var21], field2555[var18], field2555[var19], field2590[var21], field2590[var18], field2590[var19], var22);
				}
			} else {
				boolean var17 = this.method4568(var1);
				if (this.faceColors3[var1] == -1 && var17) {
					var18 = field2576[this.faceColors1[var1]];
					Rasterizer3D.method4151(var14, var15, var16, var11, var12, var13, var18, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount);
					Rasterizer3D.method4151(var14, var16, field2603[3], var11, var13, field2599[3], var18, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount);
				} else if (this.faceColors3[var1] == -1) {
					var18 = field2576[this.faceColors1[var1]];
					Rasterizer3D.method4173(var14, var15, var16, var11, var12, var13, var18);
					Rasterizer3D.method4173(var14, var16, field2603[3], var11, var13, field2599[3], var18);
				} else if (var17) {
					Rasterizer3D.method4168(var14, var15, var16, var11, var12, var13, field2570[0], field2570[1], field2570[2], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount);
					Rasterizer3D.method4168(var14, var16, field2603[3], var11, var13, field2599[3], field2570[0], field2570[2], field2570[3], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount);
				} else {
					Rasterizer3D.method4140(var14, var15, var16, var11, var12, var13, field2570[0], field2570[1], field2570[2]);
					Rasterizer3D.method4140(var14, var16, field2603[3], var11, var13, field2599[3], field2570[0], field2570[2], field2570[3]);
				}
			}
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ILnw;)V"
	)
	void method4593(int var1, class389 var2) {
		float var3 = (float)this.verticesX[var1];
		float var4 = (float)(-this.verticesY[var1]);
		float var5 = (float)(-this.verticesZ[var1]);
		float var6 = 1.0F;
		this.verticesX[var1] = (int)(var2.field4440[0] * var3 + var2.field4440[4] * var4 + var2.field4440[8] * var5 + var2.field4440[12] * var6);
		this.verticesY[var1] = -((int)(var2.field4440[1] * var3 + var2.field4440[5] * var4 + var2.field4440[9] * var5 + var2.field4440[13] * var6));
		this.verticesZ[var1] = -((int)(var2.field4440[2] * var3 + var2.field4440[6] * var4 + var2.field4440[10] * var5 + var2.field4440[14] * var6));
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lge;I)V"
	)
	void method4586(class202 var1, int var2) {
		if (this.field2568 != null) {
			for (int var3 = 0; var3 < this.verticesCount; ++var3) {
				int[] var4 = this.field2568[var3];
				if (var4 != null && var4.length != 0) {
					int[] var5 = this.field2569[var3];
					field2543.method7173();

					for (int var6 = 0; var6 < var4.length; ++var6) {
						int var7 = var4[var6];
						class116 var8 = var1.method4232(var7);
						if (var8 != null) {
							field2544.method7201((float)var5[var6] / 255.0F);
							field2545.method7227(var8.method2827(var2));
							field2545.method7178(field2544);
							field2543.method7221(field2545);
						}
					}

					this.method4593(var3, field2543);
				}
			}

		}
	}

	@ObfuscatedName("cw")
	@Export("draw")
	void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		if (this.boundsType != 1) {
			this.calculateBoundsCylinder();
		}

		this.calculateBoundingBox(var1);
		int var11 = var5 * var8 - var4 * var6 >> 16;
		int var12 = var2 * var7 + var3 * var11 >> 16;
		int var13 = var3 * this.xzRadius >> 16;
		int var14 = var12 + var13;
		if (var14 > 50 && var12 < 3500) {
			int var15 = var8 * var4 + var5 * var6 >> 16;
			int var16 = (var15 - this.xzRadius) * Rasterizer3D.Rasterizer3D_zoom;
			if (var16 / var14 < Rasterizer3D.Rasterizer3D_clipMidX2) {
				int var17 = (var15 + this.xzRadius) * Rasterizer3D.Rasterizer3D_zoom;
				if (var17 / var14 > Rasterizer3D.Rasterizer3D_clipNegativeMidX) {
					int var18 = var3 * var7 - var11 * var2 >> 16;
					int var19 = var2 * this.xzRadius >> 16;
					int var20 = (var3 * this.bottomY >> 16) + var19;
					int var21 = (var18 + var20) * Rasterizer3D.Rasterizer3D_zoom;
					if (var21 / var14 > Rasterizer3D.Rasterizer3D_clipNegativeMidY) {
						int var22 = (var3 * super.height >> 16) + var19;
						int var23 = (var18 - var22) * Rasterizer3D.Rasterizer3D_zoom;
						if (var23 / var14 < Rasterizer3D.Rasterizer3D_clipMidY2) {
							int var24 = var13 + (var2 * super.height >> 16);
							boolean var25 = false;
							boolean var26 = false;
							if (var12 - var24 <= 50) {
								var26 = true;
							}

							boolean var27 = var26 || this.field2562 > 0;
							int var28 = ViewportMouse.ViewportMouse_x;
							int var30 = ViewportMouse.ViewportMouse_y;
							boolean var32 = ViewportMouse.ViewportMouse_isInViewport;
							boolean var35 = 0L != var9;
							boolean var36;
							if (var35) {
								var36 = (int)(var9 >>> 16 & 1L) == 1;
								var35 = !var36;
							}

							var36 = false;
							int var38;
							int var39;
							int var40;
							if (var35 && var32) {
								boolean var37 = false;
								if (field2591) {
									var37 = JagexCache.method3439(this, var6, var7, var8);
								} else {
									var38 = var12 - var13;
									if (var38 <= 50) {
										var38 = 50;
									}

									if (var15 > 0) {
										var16 /= var14;
										var17 /= var38;
									} else {
										var17 /= var14;
										var16 /= var38;
									}

									if (var18 > 0) {
										var23 /= var14;
										var21 /= var38;
									} else {
										var21 /= var14;
										var23 /= var38;
									}

									var39 = var28 - Rasterizer3D.Rasterizer3D_clipMidX;
									var40 = var30 - Rasterizer3D.Rasterizer3D_clipMidY;
									if (var39 > var16 && var39 < var17 && var40 > var23 && var40 < var21) {
										var37 = true;
									}
								}

								if (var37) {
									if (this.isSingleTile) {
										ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var9;
									} else {
										var36 = true;
									}
								}
							}

							int var50 = Rasterizer3D.Rasterizer3D_clipMidX;
							var38 = Rasterizer3D.Rasterizer3D_clipMidY;
							var39 = 0;
							var40 = 0;
							if (var1 != 0) {
								var39 = field2608[var1];
								var40 = field2612[var1];
							}

							for (int var41 = 0; var41 < this.verticesCount; ++var41) {
								int var42 = this.verticesX[var41];
								int var43 = this.verticesY[var41];
								int var44 = this.verticesZ[var41];
								int var45;
								if (var1 != 0) {
									var45 = var44 * var39 + var42 * var40 >> 16;
									var44 = var44 * var40 - var42 * var39 >> 16;
									var42 = var45;
								}

								var42 += var6;
								var43 += var7;
								var44 += var8;
								var45 = var44 * var4 + var5 * var42 >> 16;
								var44 = var5 * var44 - var42 * var4 >> 16;
								var42 = var45;
								var45 = var3 * var43 - var44 * var2 >> 16;
								var44 = var43 * var2 + var3 * var44 >> 16;
								field2587[var41] = var44 - var12;
								if (var44 >= 50) {
									modelViewportXs[var41] = var42 * Rasterizer3D.Rasterizer3D_zoom / var44 + var50;
									modelViewportYs[var41] = var45 * Rasterizer3D.Rasterizer3D_zoom / var44 + var38;
								} else {
									modelViewportXs[var41] = -5000;
									var25 = true;
								}

								if (var27) {
									field2588[var41] = var42;
									field2555[var41] = var45;
									field2590[var41] = var44;
								}
							}

							try {
								this.draw0(var25, var36, this.isSingleTile, var9);
							} catch (Exception var49) {
							}

						}
					}
				}
			}
		}
	}
}
