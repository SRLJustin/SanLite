import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gq")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
	@ObfuscatedName("o")
	static boolean field2221;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("SequenceDefinition_archive")
	public static AbstractArchive SequenceDefinition_archive;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("SequenceDefinition_animationsArchive")
	public static AbstractArchive SequenceDefinition_animationsArchive;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("SequenceDefinition_skeletonsArchive")
	public static AbstractArchive SequenceDefinition_skeletonsArchive;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("SequenceDefinition_cached")
	public static EvictingDualNodeHashTable SequenceDefinition_cached;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("SequenceDefinition_cachedFrames")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("SequenceDefinition_cachedModel")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedModel;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -451535761
	)
	int field2226;
	@ObfuscatedName("r")
	public Map field2209;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1088599689
	)
	int field2207;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 828887833
	)
	int field2202;
	@ObfuscatedName("c")
	@Export("frameIds")
	public int[] frameIds;
	@ObfuscatedName("w")
	@Export("chatFrameIds")
	int[] chatFrameIds;
	@ObfuscatedName("b")
	@Export("frameLengths")
	public int[] frameLengths;
	@ObfuscatedName("t")
	@Export("soundEffects")
	public int[] soundEffects;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -242259733
	)
	@Export("frameCount")
	public int frameCount;
	@ObfuscatedName("x")
	int[] field2217;
	@ObfuscatedName("n")
	boolean[] field2218;
	@ObfuscatedName("e")
	public boolean field2201;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1404138407
	)
	public int field2220;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -681508511
	)
	@Export("shield")
	public int shield;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1106803533
	)
	@Export("weapon")
	public int weapon;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -256717621
	)
	public int field2223;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1918601831
	)
	public int field2224;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1593140013
	)
	public int field2206;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1948704665
	)
	public int field2208;

	static {
		field2221 = false;
		SequenceDefinition_cached = new EvictingDualNodeHashTable(64);
		SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100);
		SequenceDefinition_cachedModel = new EvictingDualNodeHashTable(100);
	}

	SequenceDefinition() {
		this.field2226 = -1;
		this.field2207 = 0;
		this.field2202 = 0;
		this.frameCount = -1;
		this.field2201 = false;
		this.field2220 = 5;
		this.shield = -1;
		this.weapon = -1;
		this.field2223 = 99;
		this.field2224 = -1;
		this.field2206 = -1;
		this.field2208 = 2;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lpx;B)V",
		garbageValue = "106"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lpx;II)V",
		garbageValue = "696368219"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) {
			var3 = var1.readUnsignedShort();
			this.frameLengths = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.frameLengths[var4] = var1.readUnsignedShort();
			}

			this.frameIds = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.frameIds[var4] = var1.readUnsignedShort();
			}

			for (var4 = 0; var4 < var3; ++var4) {
				this.frameIds[var4] += var1.readUnsignedShort() << 16;
			}
		} else if (var2 == 2) {
			this.frameCount = var1.readUnsignedShort();
		} else if (var2 == 3) {
			var3 = var1.readUnsignedByte();
			this.field2217 = new int[var3 + 1];

			for (var4 = 0; var4 < var3; ++var4) {
				this.field2217[var4] = var1.readUnsignedByte();
			}

			this.field2217[var3] = 9999999;
		} else if (var2 == 4) {
			this.field2201 = true;
		} else if (var2 == 5) {
			this.field2220 = var1.readUnsignedByte();
		} else if (var2 == 6) {
			this.shield = var1.readUnsignedShort();
		} else if (var2 == 7) {
			this.weapon = var1.readUnsignedShort();
		} else if (var2 == 8) {
			this.field2223 = var1.readUnsignedByte();
		} else if (var2 == 9) {
			this.field2224 = var1.readUnsignedByte();
		} else if (var2 == 10) {
			this.field2206 = var1.readUnsignedByte();
		} else if (var2 == 11) {
			this.field2208 = var1.readUnsignedByte();
		} else if (var2 == 12) {
			var3 = var1.readUnsignedByte();
			this.chatFrameIds = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.chatFrameIds[var4] = var1.readUnsignedShort();
			}

			for (var4 = 0; var4 < var3; ++var4) {
				this.chatFrameIds[var4] += var1.readUnsignedShort() << 16;
			}
		} else if (var2 == 13) {
			var3 = var1.readUnsignedByte();
			this.soundEffects = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.soundEffects[var4] = var1.readMedium();
			}
		} else if (var2 == 14) {
			this.field2226 = var1.readInt();
		} else if (var2 == 15) {
			var3 = var1.readUnsignedShort();
			this.field2209 = new HashMap();

			for (var4 = 0; var4 < var3; ++var4) {
				int var5 = var1.readUnsignedShort();
				int var6 = var1.readMedium();
				this.field2209.put(var5, var6);
			}
		} else if (var2 == 16) {
			this.field2207 = var1.readUnsignedShort();
			this.field2202 = var1.readUnsignedShort();
		} else if (var2 == 17) {
			this.field2218 = new boolean[256];

			for (var3 = 0; var3 < this.field2218.length; ++var3) {
				this.field2218[var3] = false;
			}

			var3 = var1.readUnsignedByte();

			for (var4 = 0; var4 < var3; ++var4) {
				this.field2218[var1.readUnsignedByte()] = true;
			}
		}

	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1790392441"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.field2224 == -1) {
			if (this.field2217 == null && this.field2218 == null) {
				this.field2224 = 0;
			} else {
				this.field2224 = -1918601831 * 7506;
			}
		}

		if (this.field2206 == -1) {
			if (this.field2217 == null && this.field2218 == null) {
				this.field2206 = 0;
			} else {
				this.field2206 = 2;
			}
		}

	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lhv;II)Lhv;",
		garbageValue = "-1686484197"
	)
	@Export("transformActorModel")
	public Model transformActorModel(Model var1, int var2) {
		Model var4;
		if (!this.method3712()) {
			var2 = this.frameIds[var2];
			Frames var5 = class141.getFrames(var2 >> 16);
			var2 &= 65535;
			if (var5 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				var4 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2));
				var4.animate(var5, var2);
				return var4;
			}
		} else {
			class122 var3 = class146.method2997(this.field2226);
			if (var3 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				var4 = var1.toSharedSequenceModel(!var3.method2755());
				var4.method4259(var3, var2);
				return var4;
			}
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lhv;III)Lhv;",
		garbageValue = "-680992651"
	)
	@Export("transformObjectModel")
	Model transformObjectModel(Model var1, int var2, int var3) {
		Model var5;
		if (!this.method3712()) {
			var2 = this.frameIds[var2];
			Frames var6 = class141.getFrames(var2 >> 16);
			var2 &= 65535;
			if (var6 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				var5 = var1.toSharedSequenceModel(!var6.hasAlphaTransform(var2));
				var3 &= 3;
				if (var3 == 1) {
					var5.rotateY270Ccw();
				} else if (var3 == 2) {
					var5.rotateY180();
				} else if (var3 == 3) {
					var5.rotateY90Ccw();
				}

				var5.animate(var6, var2);
				if (var3 == 1) {
					var5.rotateY90Ccw();
				} else if (var3 == 2) {
					var5.rotateY180();
				} else if (var3 == 3) {
					var5.rotateY270Ccw();
				}

				return var5;
			}
		} else {
			class122 var4 = class146.method2997(this.field2226);
			if (var4 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				var5 = var1.toSharedSequenceModel(!var4.method2755());
				var3 &= 3;
				if (var3 == 1) {
					var5.rotateY270Ccw();
				} else if (var3 == 2) {
					var5.rotateY180();
				} else if (var3 == 3) {
					var5.rotateY90Ccw();
				}

				var5.method4259(var4, var2);
				if (var3 == 1) {
					var5.rotateY90Ccw();
				} else if (var3 == 2) {
					var5.rotateY180();
				} else if (var3 == 3) {
					var5.rotateY270Ccw();
				}

				return var5;
			}
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lhv;II)Lhv;",
		garbageValue = "-1909373486"
	)
	@Export("transformSpotAnimationModel")
	Model transformSpotAnimationModel(Model var1, int var2) {
		Model var4;
		if (!this.method3712()) {
			var2 = this.frameIds[var2];
			Frames var5 = class141.getFrames(var2 >> 16);
			var2 &= 65535;
			if (var5 == null) {
				return var1.toSharedSpotAnimationModel(true);
			} else {
				var4 = var1.toSharedSpotAnimationModel(!var5.hasAlphaTransform(var2));
				var4.animate(var5, var2);
				return var4;
			}
		} else {
			class122 var3 = class146.method2997(this.field2226);
			if (var3 == null) {
				return var1.toSharedSpotAnimationModel(true);
			} else {
				var4 = var1.toSharedSpotAnimationModel(!var3.method2755());
				var4.method4259(var3, var2);
				return var4;
			}
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lhv;ILgq;IB)Lhv;",
		garbageValue = "70"
	)
	@Export("applyTransformations")
	public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
		if (field2221 && !this.method3712() && !var3.method3712()) {
			return this.method3710(var1, var2, var3, var4);
		} else {
			Model var5 = var1.toSharedSequenceModel(false);
			boolean var6 = false;
			Frames var7 = null;
			class122 var8;
			if (this.method3712()) {
				var8 = this.method3735();
				if (var3.method3712() && this.field2218 == null) {
					var5.method4259(var8, var2);
					return var5;
				}

				var5.method4263(var8, var2, this.field2218, false);
			} else {
				var2 = this.frameIds[var2];
				var7 = class141.getFrames(var2 >> 16);
				var2 &= 65535;
				if (var7 == null) {
					return var3.transformActorModel(var1, var4);
				}

				if (!var3.method3712() && (this.field2217 == null || var4 == -1)) {
					var5.animate(var7, var2);
					return var5;
				}

				if (this.field2217 == null || var4 == -1) {
					var5.animate(var7, var2);
					return var5;
				}

				var6 = var3.method3712();
				if (!var6) {
					var5.method4264(var7, var2, this.field2217, false);
				}
			}

			if (var3.method3712()) {
				var8 = var3.method3735();
				var5.method4263(var8, var4, this.field2218, true);
			} else {
				var4 = var3.frameIds[var4];
				Frames var9 = class141.getFrames(var4 >> 16);
				var4 &= 65535;
				if (var9 == null) {
					return this.transformActorModel(var1, var2);
				}

				var5.method4264(var9, var4, this.field2217, true);
			}

			if (var6 && var7 != null) {
				var5.method4264(var7, var2, this.field2217, false);
			}

			var5.resetBounds();
			return var5;
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lhv;ILgq;IB)Lhv;",
		garbageValue = "-110"
	)
	Model method3710(Model var1, int var2, SequenceDefinition var3, int var4) {
		var2 = this.frameIds[var2];
		Frames var5 = class141.getFrames(var2 >> 16);
		var2 &= 65535;
		if (var5 == null) {
			return var3.transformActorModel(var1, var4);
		} else {
			var4 = var3.frameIds[var4];
			Frames var6 = class141.getFrames(var4 >> 16);
			var4 &= 65535;
			Model var7;
			if (var6 == null) {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2));
				var7.animate(var5, var2);
				return var7;
			} else {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2) & !var6.hasAlphaTransform(var4));
				var7.animate2(var5, var2, var6, var4, this.field2217);
				return var7;
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lhv;II)Lhv;",
		garbageValue = "771999182"
	)
	@Export("transformWidgetModel")
	public Model transformWidgetModel(Model var1, int var2) {
		if (!this.method3712()) {
			int var3 = this.frameIds[var2];
			Frames var4 = class141.getFrames(var3 >> 16);
			var3 &= 65535;
			if (var4 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Frames var5 = null;
				int var6 = 0;
				if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) {
					var6 = this.chatFrameIds[var2];
					var5 = class141.getFrames(var6 >> 16);
					var6 &= 65535;
				}

				Model var7;
				if (var5 != null && var6 != 65535) {
					var7 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3) & !var5.hasAlphaTransform(var6));
					var7.animate(var4, var3);
					var7.animate(var5, var6);
					return var7;
				} else {
					var7 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3));
					var7.animate(var4, var3);
					return var7;
				}
			}
		} else {
			return this.transformActorModel(var1, var2);
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1132270109"
	)
	public boolean method3712() {
		return this.field2226 >= 0;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	public int method3729() {
		return this.field2202 - this.field2207;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Lds;",
		garbageValue = "2065274183"
	)
	public class122 method3735() {
		return this.method3712() ? class146.method2997(this.field2226) : null;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;",
		garbageValue = "-1646829162"
	)
	static File method3717(String var0, String var1, int var2) {
		String var3 = var2 == 0 ? "" : "" + var2;
		JagexCache.JagexCache_locationFile = new File(BufferedSource.userHomeDirectory, "jagex_cl_" + var0 + "_" + var1 + var3 + ".dat");
		String var4 = null;
		String var5 = null;
		boolean var6 = false;
		int var11;
		File var26;
		if (JagexCache.JagexCache_locationFile.exists()) {
			try {
				AccessFile var7 = new AccessFile(JagexCache.JagexCache_locationFile, "rw", 10000L);

				Buffer var8;
				int var9;
				for (var8 = new Buffer((int)var7.length()); var8.offset < var8.array.length; var8.offset += var9) {
					var9 = var7.read(var8.array, var8.offset, var8.array.length - var8.offset);
					if (var9 == -1) {
						throw new IOException();
					}
				}

				var8.offset = 0;
				var9 = var8.readUnsignedByte();
				if (var9 < 1 || var9 > 3) {
					throw new IOException("" + var9);
				}

				int var10 = 0;
				if (var9 > 1) {
					var10 = var8.readUnsignedByte();
				}

				if (var9 <= 2) {
					var4 = var8.readStringCp1252NullCircumfixed();
					if (var10 == 1) {
						var5 = var8.readStringCp1252NullCircumfixed();
					}
				} else {
					var4 = var8.readCESU8();
					if (var10 == 1) {
						var5 = var8.readCESU8();
					}
				}

				var7.close();
			} catch (IOException var24) {
				var24.printStackTrace();
			}

			if (var4 != null) {
				var26 = new File(var4);
				if (!var26.exists()) {
					var4 = null;
				}
			}

			if (var4 != null) {
				var26 = new File(var4, "test.dat");

				boolean var27;
				try {
					RandomAccessFile var15 = new RandomAccessFile(var26, "rw");
					var11 = var15.read();
					var15.seek(0L);
					var15.write(var11);
					var15.seek(0L);
					var15.close();
					var26.delete();
					var27 = true;
				} catch (Exception var22) {
					var27 = false;
				}

				if (!var27) {
					var4 = null;
				}
			}
		}

		if (var4 == null && var2 == 0) {
			label137:
			for (int var16 = 0; var16 < class83.cacheSubPaths.length; ++var16) {
				for (int var17 = 0; var17 < SecureRandomCallable.cacheParentPaths.length; ++var17) {
					File var18 = new File(SecureRandomCallable.cacheParentPaths[var17] + class83.cacheSubPaths[var16] + File.separatorChar + var0 + File.separatorChar);
					if (var18.exists()) {
						File var19 = new File(var18, "test.dat");

						boolean var28;
						try {
							RandomAccessFile var12 = new RandomAccessFile(var19, "rw");
							int var13 = var12.read();
							var12.seek(0L);
							var12.write(var13);
							var12.seek(0L);
							var12.close();
							var19.delete();
							var28 = true;
						} catch (Exception var21) {
							var28 = false;
						}

						if (var28) {
							var4 = var18.toString();
							var6 = true;
							break label137;
						}
					}
				}
			}
		}

		if (var4 == null) {
			var4 = BufferedSource.userHomeDirectory + File.separatorChar + "jagexcache" + var3 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar;
			var6 = true;
		}

		if (var5 != null) {
			File var25 = new File(var5);
			var26 = new File(var4);

			try {
				File[] var31 = var25.listFiles();
				File[] var30 = var31;

				for (var11 = 0; var11 < var30.length; ++var11) {
					File var29 = var30[var11];
					File var20 = new File(var26, var29.getName());
					boolean var14 = var29.renameTo(var20);
					if (!var14) {
						throw new IOException();
					}
				}
			} catch (Exception var23) {
				var23.printStackTrace();
			}

			var6 = true;
		}

		if (var6) {
			class268.method5030(new File(var4), (File)null);
		}

		return new File(var4);
	}
}
