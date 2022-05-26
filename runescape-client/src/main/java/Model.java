import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hv")
@Implements("Model")
public class Model extends Renderable {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lhv;"
	)
	@Export("Model_sharedSequenceModel")
	static Model Model_sharedSequenceModel;
	@ObfuscatedName("q")
	@Export("Model_sharedSequenceModelFaceAlphas")
	static byte[] Model_sharedSequenceModelFaceAlphas;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lhv;"
	)
	@Export("Model_sharedSpotAnimationModel")
	static Model Model_sharedSpotAnimationModel;
	@ObfuscatedName("k")
	@Export("Model_sharedSpotAnimationModelFaceAlphas")
	static byte[] Model_sharedSpotAnimationModelFaceAlphas;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	static class388 field2550;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	static class388 field2606;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	static class388 field2552;
	@ObfuscatedName("ah")
	static boolean[] field2597;
	@ObfuscatedName("ao")
	static boolean[] field2591;
	@ObfuscatedName("av")
	@Export("modelViewportXs")
	static int[] modelViewportXs;
	@ObfuscatedName("ai")
	@Export("modelViewportYs")
	static int[] modelViewportYs;
	@ObfuscatedName("ay")
	static int[] field2548;
	@ObfuscatedName("aa")
	static int[] field2590;
	@ObfuscatedName("ax")
	static int[] field2596;
	@ObfuscatedName("at")
	static int[] field2602;
	@ObfuscatedName("ba")
	static int[] field2573;
	@ObfuscatedName("bk")
	static int[][] field2561;
	@ObfuscatedName("bi")
	static int[] field2601;
	@ObfuscatedName("bc")
	static int[][] field2547;
	@ObfuscatedName("bo")
	static int[] field2603;
	@ObfuscatedName("bl")
	static int[] field2604;
	@ObfuscatedName("bs")
	static int[] field2605;
	@ObfuscatedName("bx")
	static int[] field2616;
	@ObfuscatedName("bd")
	static int[] field2607;
	@ObfuscatedName("bj")
	static int[] field2608;
	@ObfuscatedName("be")
	@Export("Model_transformTempX")
	static int Model_transformTempX;
	@ObfuscatedName("bf")
	@Export("Model_transformTempY")
	static int Model_transformTempY;
	@ObfuscatedName("bz")
	@Export("Model_transformTempZ")
	static int Model_transformTempZ;
	@ObfuscatedName("bv")
	static boolean field2612;
	@ObfuscatedName("bq")
	@Export("Model_sine")
	static int[] Model_sine;
	@ObfuscatedName("bh")
	@Export("Model_cosine")
	static int[] Model_cosine;
	@ObfuscatedName("bb")
	@Export("Model_colorPalette")
	static int[] Model_colorPalette;
	@ObfuscatedName("bm")
	static int[] field2560;
	@ObfuscatedName("s")
	@Export("verticesCount")
	int verticesCount;
	@ObfuscatedName("r")
	@Export("verticesX")
	int[] verticesX;
	@ObfuscatedName("v")
	@Export("verticesY")
	int[] verticesY;
	@ObfuscatedName("y")
	@Export("verticesZ")
	int[] verticesZ;
	@ObfuscatedName("c")
	@Export("indicesCount")
	int indicesCount;
	@ObfuscatedName("w")
	@Export("indices1")
	int[] indices1;
	@ObfuscatedName("b")
	@Export("indices2")
	int[] indices2;
	@ObfuscatedName("t")
	@Export("indices3")
	int[] indices3;
	@ObfuscatedName("g")
	@Export("faceColors1")
	int[] faceColors1;
	@ObfuscatedName("x")
	@Export("faceColors2")
	int[] faceColors2;
	@ObfuscatedName("n")
	@Export("faceColors3")
	int[] faceColors3;
	@ObfuscatedName("e")
	@Export("faceRenderPriorities")
	byte[] faceRenderPriorities;
	@ObfuscatedName("h")
	@Export("faceAlphas")
	byte[] faceAlphas;
	@ObfuscatedName("f")
	byte[] field2566;
	@ObfuscatedName("d")
	@Export("faceTextures")
	short[] faceTextures;
	@ObfuscatedName("j")
	byte field2568;
	@ObfuscatedName("z")
	int field2569;
	@ObfuscatedName("i")
	int[] field2570;
	@ObfuscatedName("u")
	int[] field2571;
	@ObfuscatedName("ag")
	int[] field2572;
	@ObfuscatedName("ar")
	@Export("vertexLabels")
	int[][] vertexLabels;
	@ObfuscatedName("am")
	@Export("faceLabelsAlpha")
	int[][] faceLabelsAlpha;
	@ObfuscatedName("ac")
	int[][] field2575;
	@ObfuscatedName("ab")
	int[][] field2594;
	@ObfuscatedName("aj")
	@Export("isSingleTile")
	public boolean isSingleTile;
	@ObfuscatedName("ae")
	@Export("boundsType")
	int boundsType;
	@ObfuscatedName("az")
	@Export("bottomY")
	int bottomY;
	@ObfuscatedName("ap")
	@Export("xzRadius")
	int xzRadius;
	@ObfuscatedName("as")
	@Export("diameter")
	int diameter;
	@ObfuscatedName("au")
	@Export("radius")
	int radius;
	@ObfuscatedName("ak")
	@Export("xMid")
	int xMid;
	@ObfuscatedName("af")
	@Export("yMid")
	int yMid;
	@ObfuscatedName("al")
	@Export("zMid")
	int zMid;
	@ObfuscatedName("aq")
	@Export("xMidOffset")
	int xMidOffset;
	@ObfuscatedName("ad")
	@Export("yMidOffset")
	int yMidOffset;
	@ObfuscatedName("an")
	@Export("zMidOffset")
	int zMidOffset;
	@ObfuscatedName("bg")
	@Export("overrideHue")
	public byte overrideHue;
	@ObfuscatedName("bp")
	@Export("overrideSaturation")
	public byte overrideSaturation;
	@ObfuscatedName("bw")
	@Export("overrideLuminance")
	public byte overrideLuminance;
	@ObfuscatedName("co")
	@Export("overrideAmount")
	public byte overrideAmount;

	static {
		Model_sharedSequenceModel = new Model();
		Model_sharedSequenceModelFaceAlphas = new byte[1];
		Model_sharedSpotAnimationModel = new Model();
		Model_sharedSpotAnimationModelFaceAlphas = new byte[1];
		field2550 = new class388();
		field2606 = new class388();
		field2552 = new class388();
		field2597 = new boolean[6500];
		field2591 = new boolean[6500];
		modelViewportXs = new int[6500];
		modelViewportYs = new int[6500];
		field2548 = new int[6500];
		field2590 = new int[6500];
		field2596 = new int[6500];
		field2602 = new int[6500];
		field2573 = new int[1600];
		field2561 = new int[1600][512];
		field2601 = new int[12];
		field2547 = new int[12][2000];
		field2603 = new int[2000];
		field2604 = new int[2000];
		field2605 = new int[12];
		field2616 = new int[10];
		field2607 = new int[10];
		field2608 = new int[10];
		field2612 = true;
		Model_sine = Rasterizer3D.Rasterizer3D_sine;
		Model_cosine = Rasterizer3D.Rasterizer3D_cosine;
		Model_colorPalette = Rasterizer3D.Rasterizer3D_colorPalette;
		field2560 = Rasterizer3D.field2385;
	}

	Model() {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2568 = 0;
		this.field2569 = 0;
		this.isSingleTile = false;
		this.xMidOffset = -1;
		this.yMidOffset = -1;
		this.zMidOffset = -1;
	}

	@ObfuscatedSignature(
		descriptor = "([Lhv;I)V"
	)
	public Model(Model[] var1, int var2) {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2568 = 0;
		this.field2569 = 0;
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
		this.field2569 = 0;
		this.field2568 = -1;

		int var7;
		Model var8;
		for (var7 = 0; var7 < var2; ++var7) {
			var8 = var1[var7];
			if (var8 != null) {
				this.verticesCount += var8.verticesCount;
				this.indicesCount += var8.indicesCount;
				this.field2569 += var8.field2569;
				if (var8.faceRenderPriorities != null) {
					var3 = true;
				} else {
					if (this.field2568 == -1) {
						this.field2568 = var8.field2568;
					}

					if (this.field2568 != var8.field2568) {
						var3 = true;
					}
				}

				var4 |= var8.faceAlphas != null;
				var5 |= var8.faceTextures != null;
				var6 |= var8.field2566 != null;
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
			this.field2566 = new byte[this.indicesCount];
		}

		if (this.field2569 > 0) {
			this.field2570 = new int[this.field2569];
			this.field2571 = new int[this.field2569];
			this.field2572 = new int[this.field2569];
		}

		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2569 = 0;

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
							this.faceRenderPriorities[this.indicesCount] = var8.field2568;
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
						if (var8.field2566 != null && var8.field2566[var9] != -1) {
							this.field2566[this.indicesCount] = (byte)(this.field2569 + var8.field2566[var9]);
						} else {
							this.field2566[this.indicesCount] = -1;
						}
					}

					++this.indicesCount;
				}

				for (var9 = 0; var9 < var8.field2569; ++var9) {
					this.field2570[this.field2569] = this.verticesCount + var8.field2570[var9];
					this.field2571[this.field2569] = this.verticesCount + var8.field2571[var9];
					this.field2572[this.field2569] = this.verticesCount + var8.field2572[var9];
					++this.field2569;
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "([[IIIIZI)Lhv;"
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
					var11.field2569 = this.field2569;
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
					var11.field2566 = this.field2566;
					var11.faceTextures = this.faceTextures;
					var11.field2568 = this.field2568;
					var11.field2570 = this.field2570;
					var11.field2571 = this.field2571;
					var11.field2572 = this.field2572;
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

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Z)Lhv;"
	)
	@Export("toSharedSequenceModel")
	public Model toSharedSequenceModel(boolean var1) {
		if (!var1 && Model_sharedSequenceModelFaceAlphas.length < this.indicesCount) {
			Model_sharedSequenceModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSequenceModel, Model_sharedSequenceModelFaceAlphas);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Z)Lhv;"
	)
	@Export("toSharedSpotAnimationModel")
	public Model toSharedSpotAnimationModel(boolean var1) {
		if (!var1 && Model_sharedSpotAnimationModelFaceAlphas.length < this.indicesCount) {
			Model_sharedSpotAnimationModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSpotAnimationModel, Model_sharedSpotAnimationModelFaceAlphas);
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(ZLhv;[B)Lhv;"
	)
	@Export("buildSharedModel")
	Model buildSharedModel(boolean var1, Model var2, byte[] var3) {
		var2.verticesCount = this.verticesCount;
		var2.indicesCount = this.indicesCount;
		var2.field2569 = this.field2569;
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
		var2.field2566 = this.field2566;
		var2.faceTextures = this.faceTextures;
		var2.field2568 = this.field2568;
		var2.field2570 = this.field2570;
		var2.field2571 = this.field2571;
		var2.field2572 = this.field2572;
		var2.vertexLabels = this.vertexLabels;
		var2.faceLabelsAlpha = this.faceLabelsAlpha;
		var2.field2575 = this.field2575;
		var2.field2594 = this.field2594;
		var2.isSingleTile = this.isSingleTile;
		var2.resetBounds();
		var2.overrideAmount = 0;
		return var2;
	}

	@ObfuscatedName("v")
	@Export("calculateBoundingBox")
	void calculateBoundingBox(int var1) {
		if (this.xMidOffset == -1) {
			int var2 = 0;
			int var3 = 0;
			int var4 = 0;
			int var5 = 0;
			int var6 = 0;
			int var7 = 0;
			int var8 = Model_cosine[var1];
			int var9 = Model_sine[var1];

			for (int var10 = 0; var10 < this.verticesCount; ++var10) {
				int var11 = Rasterizer3D.method3927(this.verticesX[var10], this.verticesZ[var10], var8, var9);
				int var12 = this.verticesY[var10];
				int var13 = Rasterizer3D.method3951(this.verticesX[var10], this.verticesZ[var10], var8, var9);
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

	@ObfuscatedName("y")
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

	@ObfuscatedName("c")
	void method4255() {
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

	@ObfuscatedName("w")
	public int method4277() {
		this.calculateBoundsCylinder();
		return this.xzRadius;
	}

	@ObfuscatedName("b")
	@Export("resetBounds")
	public void resetBounds() {
		this.boundsType = 0;
		this.xMidOffset = -1;
	}

	@ObfuscatedName("t")
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

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lds;I)V"
	)
	public void method4259(class122 var1, int var2) {
		Skeleton var3 = var1.field1535;
		class202 var4 = var3.method4023();
		if (var4 != null) {
			var3.method4023().method4000(var1, var2);
			this.method4313(var3.method4023(), var1.method2753());
		}

		if (var1.method2755()) {
			this.method4260(var1, var2);
		}

		this.resetBounds();
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lds;I)V"
	)
	void method4260(class122 var1, int var2) {
		Skeleton var3 = var1.field1535;

		for (int var4 = 0; var4 < var3.count; ++var4) {
			int var5 = var3.transformTypes[var4];
			if (var5 == 5 && var1.field1530 != null && var1.field1530[var4] != null && var1.field1530[var4][0] != null && this.faceLabelsAlpha != null && this.faceAlphas != null) {
				class117 var6 = var1.field1530[var4][0];
				int[] var7 = var3.labels[var4];
				int var8 = var7.length;

				for (int var9 = 0; var9 < var8; ++var9) {
					int var10 = var7[var9];
					if (var10 < this.faceLabelsAlpha.length) {
						int[] var11 = this.faceLabelsAlpha[var10];

						for (int var12 = 0; var12 < var11.length; ++var12) {
							int var13 = var11[var12];
							int var14 = (int)((float)(this.faceAlphas[var13] & 255) + var6.method2689(var2) * 255.0F);
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

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lgb;I)V"
	)
	void method4313(class202 var1, int var2) {
		this.method4280(var1, var2);
	}

	@ObfuscatedName("e")
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

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lds;I[ZZ)V"
	)
	public void method4263(class122 var1, int var2, boolean[] var3, boolean var4) {
		Skeleton var5 = var1.field1535;
		class202 var6 = var5.method4023();
		if (var6 != null) {
			var6.method4014(var1, var2, var3, var4);
			this.method4313(var6, var1.method2753());
		}

		if (var1.method2755()) {
			this.method4260(var1, var2);
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lgt;I[IZ)V"
	)
	public void method4264(Frames var1, int var2, int[] var3, boolean var4) {
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

	@ObfuscatedName("d")
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
								var15 = Model_sine[var14];
								var16 = Model_cosine[var14];
								var17 = var15 * this.verticesY[var11] + var16 * this.verticesX[var11] >> 16;
								this.verticesY[var11] = var16 * this.verticesY[var11] - var15 * this.verticesX[var11] >> 16;
								this.verticesX[var11] = var17;
							}

							if (var12 != 0) {
								var15 = Model_sine[var12];
								var16 = Model_cosine[var12];
								var17 = var16 * this.verticesY[var11] - var15 * this.verticesZ[var11] >> 16;
								this.verticesZ[var11] = var15 * this.verticesY[var11] + var16 * this.verticesZ[var11] >> 16;
								this.verticesY[var11] = var17;
							}

							if (var13 != 0) {
								var15 = Model_sine[var13];
								var16 = Model_cosine[var13];
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

	@ObfuscatedName("j")
	@Export("rotateY90Ccw")
	public void rotateY90Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) {
			int var2 = this.verticesX[var1];
			this.verticesX[var1] = this.verticesZ[var1];
			this.verticesZ[var1] = -var2;
		}

		this.resetBounds();
	}

	@ObfuscatedName("z")
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

	@ObfuscatedName("u")
	@Export("rotateZ")
	public void rotateZ(int var1) {
		int var2 = Model_sine[var1];
		int var3 = Model_cosine[var1];

		for (int var4 = 0; var4 < this.verticesCount; ++var4) {
			int var5 = var3 * this.verticesY[var4] - var2 * this.verticesZ[var4] >> 16;
			this.verticesZ[var4] = var2 * this.verticesY[var4] + var3 * this.verticesZ[var4] >> 16;
			this.verticesY[var4] = var5;
		}

		this.resetBounds();
	}

	@ObfuscatedName("ag")
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

	@ObfuscatedName("ar")
	@Export("scale")
	public void scale(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.verticesCount; ++var4) {
			this.verticesX[var4] = this.verticesX[var4] * var1 / 128;
			this.verticesY[var4] = var2 * this.verticesY[var4] / 128;
			this.verticesZ[var4] = var3 * this.verticesZ[var4] / 128;
		}

		this.resetBounds();
	}

	@ObfuscatedName("am")
	public final void method4272(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		field2573[0] = -1;
		if (this.boundsType != 2 && this.boundsType != 1) {
			this.method4255();
		}

		int var8 = Rasterizer3D.Rasterizer3D_clipMidX;
		int var9 = Rasterizer3D.Rasterizer3D_clipMidY;
		int var10 = Model_sine[var1];
		int var11 = Model_cosine[var1];
		int var12 = Model_sine[var2];
		int var13 = Model_cosine[var2];
		int var14 = Model_sine[var3];
		int var15 = Model_cosine[var3];
		int var16 = Model_sine[var4];
		int var17 = Model_cosine[var4];
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
			field2548[var19] = var22 - var18;
			modelViewportXs[var19] = var20 * Rasterizer3D.Rasterizer3D_zoom / var22 + var8;
			modelViewportYs[var19] = var23 * Rasterizer3D.Rasterizer3D_zoom / var22 + var9;
			if (this.field2569 > 0) {
				field2590[var19] = var20;
				field2596[var19] = var23;
				field2602[var19] = var22;
			}
		}

		try {
			this.draw0(false, false, false, 0L);
		} catch (Exception var25) {
		}

	}

	@ObfuscatedName("ac")
	public final void method4273(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		field2573[0] = -1;
		if (this.boundsType != 2 && this.boundsType != 1) {
			this.method4255();
		}

		int var9 = Rasterizer3D.Rasterizer3D_clipMidX;
		int var10 = Rasterizer3D.Rasterizer3D_clipMidY;
		int var11 = Model_sine[var1];
		int var12 = Model_cosine[var1];
		int var13 = Model_sine[var2];
		int var14 = Model_cosine[var2];
		int var15 = Model_sine[var3];
		int var16 = Model_cosine[var3];
		int var17 = Model_sine[var4];
		int var18 = Model_cosine[var4];
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
			field2548[var20] = var23 - var19;
			modelViewportXs[var20] = var9 + var21 * Rasterizer3D.Rasterizer3D_zoom / var8;
			modelViewportYs[var20] = var10 + var24 * Rasterizer3D.Rasterizer3D_zoom / var8;
			if (this.field2569 > 0) {
				field2590[var20] = var21;
				field2596[var20] = var24;
				field2602[var20] = var23;
			}
		}

		try {
			this.draw0(false, false, false, 0L);
		} catch (Exception var26) {
		}

	}

	@ObfuscatedName("ab")
	@Export("draw0")
	final void draw0(boolean var1, boolean var2, boolean var3, long var4) {
		if (this.diameter < 1600) {
			int var6;
			for (var6 = 0; var6 < this.diameter; ++var6) {
				field2573[var6] = 0;
			}

			var6 = var3 ? 20 : 5;

			int var7;
			int var8;
			int var9;
			int var10;
			int var11;
			int var12;
			int var15;
			int var16;
			int var18;
			int var28;
			for (var7 = 0; var7 < this.indicesCount; ++var7) {
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
							boolean var34;
							if (var18 < var15 && var18 < var16 && var18 < var30) {
								var34 = false;
							} else {
								var18 = ViewportMouse.ViewportMouse_y - var6;
								if (var18 > var15 && var18 > var16 && var18 > var30) {
									var34 = false;
								} else {
									var18 = var6 + ViewportMouse.ViewportMouse_x;
									if (var18 < var11 && var18 < var12 && var18 < var28) {
										var34 = false;
									} else {
										var18 = ViewportMouse.ViewportMouse_x - var6;
										if (var18 > var11 && var18 > var12 && var18 > var28) {
											var34 = false;
										} else {
											var34 = true;
										}
									}
								}
							}

							if (var34) {
								ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var4;
								var2 = false;
							}
						}

						if ((var11 - var12) * (modelViewportYs[var10] - modelViewportYs[var9]) - (var28 - var12) * (modelViewportYs[var8] - modelViewportYs[var9]) > 0) {
							field2591[var7] = false;
							if (var11 >= 0 && var12 >= 0 && var28 >= 0 && var11 <= Rasterizer3D.Rasterizer3D_clipWidth && var12 <= Rasterizer3D.Rasterizer3D_clipWidth && var28 <= Rasterizer3D.Rasterizer3D_clipWidth) {
								field2597[var7] = false;
							} else {
								field2597[var7] = true;
							}

							var29 = (field2548[var8] + field2548[var9] + field2548[var10]) / 3 + this.radius;
							field2561[var29][field2573[var29]++] = var7;
						}
					} else {
						var29 = field2590[var8];
						var15 = field2590[var9];
						var16 = field2590[var10];
						var30 = field2596[var8];
						var18 = field2596[var9];
						int var19 = field2596[var10];
						int var20 = field2602[var8];
						int var21 = field2602[var9];
						int var22 = field2602[var10];
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
							field2591[var7] = true;
							int var26 = (field2548[var8] + field2548[var9] + field2548[var10]) / 3 + this.radius;
							field2561[var26][field2573[var26]++] = var7;
						}
					}
				}
			}

			int[] var27;
			if (this.faceRenderPriorities == null) {
				for (var7 = this.diameter - 1; var7 >= 0; --var7) {
					var8 = field2573[var7];
					if (var8 > 0) {
						var27 = field2561[var7];

						for (var10 = 0; var10 < var8; ++var10) {
							this.drawFace(var27[var10]);
						}
					}
				}

			} else {
				for (var7 = 0; var7 < 12; ++var7) {
					field2601[var7] = 0;
					field2605[var7] = 0;
				}

				for (var7 = this.diameter - 1; var7 >= 0; --var7) {
					var8 = field2573[var7];
					if (var8 > 0) {
						var27 = field2561[var7];

						for (var10 = 0; var10 < var8; ++var10) {
							var11 = var27[var10];
							byte var33 = this.faceRenderPriorities[var11];
							var28 = field2601[var33]++;
							field2547[var33][var28] = var11;
							if (var33 < 10) {
								int[] var10000 = field2605;
								var10000[var33] += var7;
							} else if (var33 == 10) {
								field2603[var28] = var7;
							} else {
								field2604[var28] = var7;
							}
						}
					}
				}

				var7 = 0;
				if (field2601[1] > 0 || field2601[2] > 0) {
					var7 = (field2605[1] + field2605[2]) / (field2601[1] + field2601[2]);
				}

				var8 = 0;
				if (field2601[3] > 0 || field2601[4] > 0) {
					var8 = (field2605[3] + field2605[4]) / (field2601[3] + field2601[4]);
				}

				var9 = 0;
				if (field2601[6] > 0 || field2601[8] > 0) {
					var9 = (field2605[8] + field2605[6]) / (field2601[8] + field2601[6]);
				}

				var11 = 0;
				var12 = field2601[10];
				int[] var13 = field2547[10];
				int[] var14 = field2603;
				if (var11 == var12) {
					var11 = 0;
					var12 = field2601[11];
					var13 = field2547[11];
					var14 = field2604;
				}

				if (var11 < var12) {
					var10 = var14[var11];
				} else {
					var10 = -1000;
				}

				for (var15 = 0; var15 < 10; ++var15) {
					while (var15 == 0 && var10 > var7) {
						this.drawFace(var13[var11++]);
						if (var11 == var12 && var13 != field2547[11]) {
							var11 = 0;
							var12 = field2601[11];
							var13 = field2547[11];
							var14 = field2604;
						}

						if (var11 < var12) {
							var10 = var14[var11];
						} else {
							var10 = -1000;
						}
					}

					while (var15 == 3 && var10 > var8) {
						this.drawFace(var13[var11++]);
						if (var11 == var12 && var13 != field2547[11]) {
							var11 = 0;
							var12 = field2601[11];
							var13 = field2547[11];
							var14 = field2604;
						}

						if (var11 < var12) {
							var10 = var14[var11];
						} else {
							var10 = -1000;
						}
					}

					while (var15 == 5 && var10 > var9) {
						this.drawFace(var13[var11++]);
						if (var11 == var12 && var13 != field2547[11]) {
							var11 = 0;
							var12 = field2601[11];
							var13 = field2547[11];
							var14 = field2604;
						}

						if (var11 < var12) {
							var10 = var14[var11];
						} else {
							var10 = -1000;
						}
					}

					var16 = field2601[var15];
					int[] var17 = field2547[var15];

					for (var18 = 0; var18 < var16; ++var18) {
						this.drawFace(var17[var18]);
					}
				}

				while (var10 != -1000) {
					this.drawFace(var13[var11++]);
					if (var11 == var12 && var13 != field2547[11]) {
						var11 = 0;
						var13 = field2547[11];
						var12 = field2601[11];
						var14 = field2604;
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

	@ObfuscatedName("aj")
	@Export("drawFace")
	final void drawFace(int var1) {
		if (field2591[var1]) {
			this.method4261(var1);
		} else {
			int var2 = this.indices1[var1];
			int var3 = this.indices2[var1];
			int var4 = this.indices3[var1];
			Rasterizer3D.field2395 = field2597[var1];
			if (this.faceAlphas == null) {
				Rasterizer3D.Rasterizer3D_alpha = 0;
			} else {
				Rasterizer3D.Rasterizer3D_alpha = this.faceAlphas[var1] & 255;
			}

			this.method4278(var1, modelViewportYs[var2], modelViewportYs[var3], modelViewportYs[var4], modelViewportXs[var2], modelViewportXs[var3], modelViewportXs[var4], this.faceColors1[var1], this.faceColors2[var1], this.faceColors3[var1]);
		}
	}

	@ObfuscatedName("ae")
	final void method4278(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		if (this.faceTextures != null && this.faceTextures[var1] != -1) {
			int var11;
			int var12;
			int var13;
			if (this.field2566 != null && this.field2566[var1] != -1) {
				int var14 = this.field2566[var1] & 255;
				var11 = this.field2570[var14];
				var12 = this.field2571[var14];
				var13 = this.field2572[var14];
			} else {
				var11 = this.indices1[var1];
				var12 = this.indices2[var1];
				var13 = this.indices3[var1];
			}

			if (this.faceColors3[var1] == -1) {
				Rasterizer3D.method3922(var2, var3, var4, var5, var6, var7, var8, var8, var8, field2590[var11], field2590[var12], field2590[var13], field2596[var11], field2596[var12], field2596[var13], field2602[var11], field2602[var12], field2602[var13], this.faceTextures[var1]);
			} else {
				Rasterizer3D.method3922(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2590[var11], field2590[var12], field2590[var13], field2596[var11], field2596[var12], field2596[var13], field2602[var11], field2602[var12], field2602[var13], this.faceTextures[var1]);
			}
		} else if (this.faceColors3[var1] == -1 && this.overrideAmount > 0) {
			Rasterizer3D.method3993(var2, var3, var4, var5, var6, var7, Model_colorPalette[this.faceColors1[var1]], this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount);
		} else if (this.faceColors3[var1] == -1) {
			Rasterizer3D.method3919(var2, var3, var4, var5, var6, var7, Model_colorPalette[this.faceColors1[var1]]);
		} else if (this.overrideAmount > 0) {
			Rasterizer3D.method3916(var2, var3, var4, var5, var6, var7, var8, var9, var10, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount);
		} else {
			Rasterizer3D.method3915(var2, var3, var4, var5, var6, var7, var8, var9, var10);
		}

	}

	@ObfuscatedName("az")
	final void method4261(int var1) {
		int var2 = Rasterizer3D.Rasterizer3D_clipMidX;
		int var3 = Rasterizer3D.Rasterizer3D_clipMidY;
		int var4 = 0;
		int var5 = this.indices1[var1];
		int var6 = this.indices2[var1];
		int var7 = this.indices3[var1];
		int var8 = field2602[var5];
		int var9 = field2602[var6];
		int var10 = field2602[var7];
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
			field2616[var4] = modelViewportXs[var5];
			field2607[var4] = modelViewportYs[var5];
			field2608[var4++] = this.faceColors1[var1];
		} else {
			var11 = field2590[var5];
			var12 = field2596[var5];
			var13 = this.faceColors1[var1];
			if (var10 >= 50) {
				var14 = field2560[var10 - var8] * (50 - var8);
				field2616[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2590[var7] - var11) * var14 >> 16)) / 50;
				field2607[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2596[var7] - var12) * var14 >> 16)) / 50;
				field2608[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16);
			}

			if (var9 >= 50) {
				var14 = field2560[var9 - var8] * (50 - var8);
				field2616[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2590[var6] - var11) * var14 >> 16)) / 50;
				field2607[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2596[var6] - var12) * var14 >> 16)) / 50;
				field2608[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16);
			}
		}

		if (var9 >= 50) {
			field2616[var4] = modelViewportXs[var6];
			field2607[var4] = modelViewportYs[var6];
			field2608[var4++] = this.faceColors2[var1];
		} else {
			var11 = field2590[var6];
			var12 = field2596[var6];
			var13 = this.faceColors2[var1];
			if (var8 >= 50) {
				var14 = field2560[var8 - var9] * (50 - var9);
				field2616[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2590[var5] - var11) * var14 >> 16)) / 50;
				field2607[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2596[var5] - var12) * var14 >> 16)) / 50;
				field2608[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16);
			}

			if (var10 >= 50) {
				var14 = field2560[var10 - var9] * (50 - var9);
				field2616[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2590[var7] - var11) * var14 >> 16)) / 50;
				field2607[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2596[var7] - var12) * var14 >> 16)) / 50;
				field2608[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16);
			}
		}

		if (var10 >= 50) {
			field2616[var4] = modelViewportXs[var7];
			field2607[var4] = modelViewportYs[var7];
			field2608[var4++] = this.faceColors3[var1];
		} else {
			var11 = field2590[var7];
			var12 = field2596[var7];
			var13 = this.faceColors3[var1];
			if (var9 >= 50) {
				var14 = field2560[var9 - var10] * (50 - var10);
				field2616[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2590[var6] - var11) * var14 >> 16)) / 50;
				field2607[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2596[var6] - var12) * var14 >> 16)) / 50;
				field2608[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16);
			}

			if (var8 >= 50) {
				var14 = field2560[var8 - var10] * (50 - var10);
				field2616[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2590[var5] - var11) * var14 >> 16)) / 50;
				field2607[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2596[var5] - var12) * var14 >> 16)) / 50;
				field2608[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16);
			}
		}

		var11 = field2616[0];
		var12 = field2616[1];
		var13 = field2616[2];
		var14 = field2607[0];
		int var15 = field2607[1];
		int var16 = field2607[2];
		Rasterizer3D.field2395 = false;
		if (var4 == 3) {
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > Rasterizer3D.Rasterizer3D_clipWidth || var12 > Rasterizer3D.Rasterizer3D_clipWidth || var13 > Rasterizer3D.Rasterizer3D_clipWidth) {
				Rasterizer3D.field2395 = true;
			}

			this.method4278(var1, var14, var15, var16, var11, var12, var13, field2608[0], field2608[1], field2608[2]);
		}

		if (var4 == 4) {
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > Rasterizer3D.Rasterizer3D_clipWidth || var12 > Rasterizer3D.Rasterizer3D_clipWidth || var13 > Rasterizer3D.Rasterizer3D_clipWidth || field2616[3] < 0 || field2616[3] > Rasterizer3D.Rasterizer3D_clipWidth) {
				Rasterizer3D.field2395 = true;
			}

			int var17;
			if (this.faceTextures != null && this.faceTextures[var1] != -1) {
				int var18;
				int var19;
				if (this.field2566 != null && this.field2566[var1] != -1) {
					int var20 = this.field2566[var1] & 255;
					var17 = this.field2570[var20];
					var18 = this.field2571[var20];
					var19 = this.field2572[var20];
				} else {
					var17 = var5;
					var18 = var6;
					var19 = var7;
				}

				short var21 = this.faceTextures[var1];
				if (this.faceColors3[var1] == -1) {
					Rasterizer3D.method3922(var14, var15, var16, var11, var12, var13, this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2590[var17], field2590[var18], field2590[var19], field2596[var17], field2596[var18], field2596[var19], field2602[var17], field2602[var18], field2602[var19], var21);
					Rasterizer3D.method3922(var14, var16, field2607[3], var11, var13, field2616[3], this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2590[var17], field2590[var18], field2590[var19], field2596[var17], field2596[var18], field2596[var19], field2602[var17], field2602[var18], field2602[var19], var21);
				} else {
					Rasterizer3D.method3922(var14, var15, var16, var11, var12, var13, field2608[0], field2608[1], field2608[2], field2590[var17], field2590[var18], field2590[var19], field2596[var17], field2596[var18], field2596[var19], field2602[var17], field2602[var18], field2602[var19], var21);
					Rasterizer3D.method3922(var14, var16, field2607[3], var11, var13, field2616[3], field2608[0], field2608[2], field2608[3], field2590[var17], field2590[var18], field2590[var19], field2596[var17], field2596[var18], field2596[var19], field2602[var17], field2602[var18], field2602[var19], var21);
				}
			} else if (this.faceColors3[var1] == -1 && this.overrideAmount > 0) {
				var17 = Model_colorPalette[this.faceColors1[var1]];
				Rasterizer3D.method3993(var14, var15, var16, var11, var12, var13, var17, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount);
				Rasterizer3D.method3993(var14, var16, field2607[3], var11, var13, field2616[3], var17, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount);
			} else if (this.faceColors3[var1] == -1) {
				var17 = Model_colorPalette[this.faceColors1[var1]];
				Rasterizer3D.method3919(var14, var15, var16, var11, var12, var13, var17);
				Rasterizer3D.method3919(var14, var16, field2607[3], var11, var13, field2616[3], var17);
			} else if (this.overrideAmount > 0) {
				Rasterizer3D.method3916(var14, var15, var16, var11, var12, var13, field2608[0], field2608[1], field2608[2], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount);
				Rasterizer3D.method3916(var14, var16, field2607[3], var11, var13, field2616[3], field2608[0], field2608[2], field2608[3], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount);
			} else {
				Rasterizer3D.method3915(var14, var15, var16, var11, var12, var13, field2608[0], field2608[1], field2608[2]);
				Rasterizer3D.method3915(var14, var16, field2607[3], var11, var13, field2616[3], field2608[0], field2608[2], field2608[3]);
			}
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILnw;)V"
	)
	void method4302(int var1, class388 var2) {
		float var3 = (float)this.verticesX[var1];
		float var4 = (float)(-this.verticesY[var1]);
		float var5 = (float)(-this.verticesZ[var1]);
		float var6 = 1.0F;
		this.verticesX[var1] = (int)(var2.field4400[0] * var3 + var2.field4400[4] * var4 + var2.field4400[8] * var5 + var2.field4400[12] * var6);
		this.verticesY[var1] = -((int)(var2.field4400[1] * var3 + var2.field4400[5] * var4 + var2.field4400[9] * var5 + var2.field4400[13] * var6));
		this.verticesZ[var1] = -((int)(var2.field4400[2] * var3 + var2.field4400[6] * var4 + var2.field4400[10] * var5 + var2.field4400[14] * var6));
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lgb;I)V"
	)
	void method4280(class202 var1, int var2) {
		if (this.field2575 != null) {
			for (int var3 = 0; var3 < this.verticesCount; ++var3) {
				int[] var4 = this.field2575[var3];
				if (var4 != null && var4.length != 0) {
					int[] var5 = this.field2594[var3];
					field2550.method6829();

					for (int var6 = 0; var6 < var4.length; ++var6) {
						int var7 = var4[var6];
						class115 var8 = var1.method3997(var7);
						if (var8 != null) {
							field2606.method6806((float)var5[var6] / 255.0F);
							field2552.method6868(var8.method2666(var2));
							field2552.method6816(field2606);
							field2550.method6815(field2552);
						}
					}

					this.method4302(var3, field2550);
				}
			}

		}
	}

	@ObfuscatedName("cd")
	@Export("draw")
	void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		field2573[0] = -1;
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

							boolean var27 = var26 || this.field2569 > 0;
							int var28 = class146.method2993();
							int var29 = DecorativeObject.method4391();
							boolean var30 = ViewportMouse.ViewportMouse_isInViewport;
							boolean var32 = LoginPacket.method5022(var9);
							boolean var33 = false;
							int var38;
							int var39;
							int var40;
							int var41;
							int var49;
							int var55;
							int var56;
							int var57;
							if (var32 && var30) {
								boolean var34 = false;
								if (field2612) {
									boolean var37 = ViewportMouse.ViewportMouse_isInViewport;
									boolean var35;
									if (!var37) {
										var35 = false;
									} else {
										int var44;
										int var45;
										int var46;
										int var58;
										if (!ViewportMouse.ViewportMouse_false0) {
											var38 = Scene.Scene_cameraPitchSine;
											var39 = Scene.Scene_cameraPitchCosine;
											var40 = Scene.Scene_cameraYawSine;
											var41 = Scene.Scene_cameraYawCosine;
											byte var42 = 50;
											short var43 = 3500;
											var44 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.Rasterizer3D_clipMidX) * var42 / Rasterizer3D.Rasterizer3D_zoom;
											var45 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.Rasterizer3D_clipMidY) * var42 / Rasterizer3D.Rasterizer3D_zoom;
											var46 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.Rasterizer3D_clipMidX) * var43 / Rasterizer3D.Rasterizer3D_zoom;
											int var47 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.Rasterizer3D_clipMidY) * var43 / Rasterizer3D.Rasterizer3D_zoom;
											int var48 = Rasterizer3D.method3930(var45, var42, var39, var38);
											var57 = Rasterizer3D.method3931(var45, var42, var39, var38);
											var45 = var48;
											var48 = Rasterizer3D.method3930(var47, var43, var39, var38);
											var58 = Rasterizer3D.method3931(var47, var43, var39, var38);
											var47 = var48;
											var48 = Rasterizer3D.method3929(var44, var57, var41, var40);
											var57 = Rasterizer3D.method3980(var44, var57, var41, var40);
											var44 = var48;
											var48 = Rasterizer3D.method3929(var46, var58, var41, var40);
											var58 = Rasterizer3D.method3980(var46, var58, var41, var40);
											ViewportMouse.field2635 = (var44 + var48) / 2;
											ArchiveDisk.field4363 = (var45 + var47) / 2;
											InvDefinition.field1853 = (var58 + var57) / 2;
											ViewportMouse.field2630 = (var48 - var44) / 2;
											class342.field4162 = (var47 - var45) / 2;
											RouteStrategy.field2242 = (var58 - var57) / 2;
											class113.field1421 = Math.abs(ViewportMouse.field2630);
											ChatChannel.field973 = Math.abs(class342.field4162);
											TriBool.field4339 = Math.abs(RouteStrategy.field2242);
										}

										var38 = this.xMid + var6;
										var39 = var7 + this.yMid;
										var40 = var8 + this.zMid;
										var41 = this.xMidOffset;
										var57 = this.yMidOffset;
										var58 = this.zMidOffset;
										var44 = ViewportMouse.field2635 - var38;
										var45 = ArchiveDisk.field4363 - var39;
										var46 = InvDefinition.field1853 - var40;
										if (Math.abs(var44) > var41 + class113.field1421) {
											var35 = false;
										} else if (Math.abs(var45) > var57 + ChatChannel.field973) {
											var35 = false;
										} else if (Math.abs(var46) > var58 + TriBool.field4339) {
											var35 = false;
										} else if (Math.abs(var46 * class342.field4162 - var45 * RouteStrategy.field2242) > var57 * TriBool.field4339 + var58 * ChatChannel.field973) {
											var35 = false;
										} else if (Math.abs(var44 * RouteStrategy.field2242 - var46 * ViewportMouse.field2630) > var41 * TriBool.field4339 + var58 * class113.field1421) {
											var35 = false;
										} else if (Math.abs(var45 * ViewportMouse.field2630 - var44 * class342.field4162) > var57 * class113.field1421 + var41 * ChatChannel.field973) {
											var35 = false;
										} else {
											var35 = true;
										}
									}

									var34 = var35;
								} else {
									var56 = var12 - var13;
									if (var56 <= 50) {
										var56 = 50;
									}

									if (var15 > 0) {
										var16 /= var14;
										var17 /= var56;
									} else {
										var17 /= var14;
										var16 /= var56;
									}

									if (var18 > 0) {
										var23 /= var14;
										var21 /= var56;
									} else {
										var21 /= var14;
										var23 /= var56;
									}

									var49 = var28 - Rasterizer3D.Rasterizer3D_clipMidX;
									var55 = var29 - Rasterizer3D.Rasterizer3D_clipMidY;
									if (var49 > var16 && var49 < var17 && var55 > var23 && var55 < var21) {
										var34 = true;
									}
								}

								if (var34) {
									if (this.isSingleTile) {
										ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var9;
									} else {
										var33 = true;
									}
								}
							}

							int var54 = Rasterizer3D.Rasterizer3D_clipMidX;
							var56 = Rasterizer3D.Rasterizer3D_clipMidY;
							var49 = 0;
							var55 = 0;
							if (var1 != 0) {
								var49 = Model_sine[var1];
								var55 = Model_cosine[var1];
							}

							for (var38 = 0; var38 < this.verticesCount; ++var38) {
								var39 = this.verticesX[var38];
								var40 = this.verticesY[var38];
								var41 = this.verticesZ[var38];
								if (var1 != 0) {
									var57 = var41 * var49 + var39 * var55 >> 16;
									var41 = var41 * var55 - var39 * var49 >> 16;
									var39 = var57;
								}

								var39 += var6;
								var40 += var7;
								var41 += var8;
								var57 = var41 * var4 + var5 * var39 >> 16;
								var41 = var5 * var41 - var39 * var4 >> 16;
								var39 = var57;
								var57 = var3 * var40 - var41 * var2 >> 16;
								var41 = var40 * var2 + var3 * var41 >> 16;
								field2548[var38] = var41 - var12;
								if (var41 >= 50) {
									modelViewportXs[var38] = var39 * Rasterizer3D.Rasterizer3D_zoom / var41 + var54;
									modelViewportYs[var38] = var57 * Rasterizer3D.Rasterizer3D_zoom / var41 + var56;
								} else {
									modelViewportXs[var38] = -5000;
									var25 = true;
								}

								if (var27) {
									field2590[var38] = var39;
									field2596[var38] = var57;
									field2602[var38] = var41;
								}
							}

							try {
								this.draw0(var25, var33, this.isSingleTile, var9);
							} catch (Exception var53) {
							}

						}
					}
				}
			}
		}
	}
}
