import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ge")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
	@ObfuscatedName("f")
	static boolean field2306;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("SequenceDefinition_archive")
	static AbstractArchive SequenceDefinition_archive;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("SequenceDefinition_animationsArchive")
	static AbstractArchive SequenceDefinition_animationsArchive;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	@Export("SequenceDefinition_cached")
	static EvictingDualNodeHashTable SequenceDefinition_cached;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	@Export("SequenceDefinition_cachedFrames")
	static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	@Export("SequenceDefinition_cachedModel")
	static EvictingDualNodeHashTable SequenceDefinition_cachedModel;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -267802227
	)
	public int field2289;
	@ObfuscatedName("r")
	public Map field2290;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 494645969
	)
	int field2305;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 120591319
	)
	int field2300;
	@ObfuscatedName("t")
	@Export("frameIds")
	public int[] frameIds;
	@ObfuscatedName("h")
	@Export("chatFrameIds")
	int[] chatFrameIds;
	@ObfuscatedName("p")
	@Export("frameLengths")
	public int[] frameLengths;
	@ObfuscatedName("o")
	@Export("soundEffects")
	public int[] soundEffects;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 984617043
	)
	@Export("frameCount")
	public int frameCount;
	@ObfuscatedName("x")
	int[] field2298;
	@ObfuscatedName("a")
	boolean[] field2299;
	@ObfuscatedName("q")
	public boolean field2293;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1032909961
	)
	public int field2292;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 2123963467
	)
	@Export("shield")
	public int shield;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1840198861
	)
	@Export("weapon")
	public int weapon;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 2027973353
	)
	public int field2304;
	@ObfuscatedName("af")
	public boolean field2297;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 998246135
	)
	public int field2307;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 864092839
	)
	public int field2301;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 527050943
	)
	public int field2308;

	static {
		field2306 = false;
		SequenceDefinition_cached = new EvictingDualNodeHashTable(64);
		SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100);
		SequenceDefinition_cachedModel = new EvictingDualNodeHashTable(100);
	}

	SequenceDefinition() {
		this.field2289 = -1;
		this.field2305 = 0;
		this.field2300 = 0;
		this.frameCount = -1;
		this.field2293 = false;
		this.field2292 = 5;
		this.shield = -1;
		this.weapon = -1;
		this.field2304 = 99;
		this.field2297 = false;
		this.field2307 = -1;
		this.field2301 = -1;
		this.field2308 = 2;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lrd;I)V",
		garbageValue = "1334689844"
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

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lrd;II)V",
		garbageValue = "2142217777"
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
			this.field2298 = new int[var3 + 1];

			for (var4 = 0; var4 < var3; ++var4) {
				this.field2298[var4] = var1.readUnsignedByte();
			}

			this.field2298[var3] = 9999999;
		} else if (var2 == 4) {
			this.field2293 = true;
		} else if (var2 == 5) {
			this.field2292 = var1.readUnsignedByte();
		} else if (var2 == 6) {
			this.shield = var1.readUnsignedShort();
		} else if (var2 == 7) {
			this.weapon = var1.readUnsignedShort();
		} else if (var2 == 8) {
			this.field2304 = var1.readUnsignedByte();
			this.field2297 = true;
		} else if (var2 == 9) {
			this.field2307 = var1.readUnsignedByte();
		} else if (var2 == 10) {
			this.field2301 = var1.readUnsignedByte();
		} else if (var2 == 11) {
			this.field2308 = var1.readUnsignedByte();
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
			this.field2289 = var1.readInt();
		} else if (var2 == 15) {
			var3 = var1.readUnsignedShort();
			this.field2290 = new HashMap();

			for (var4 = 0; var4 < var3; ++var4) {
				int var5 = var1.readUnsignedShort();
				int var6 = var1.readMedium();
				this.field2290.put(var5, var6);
			}
		} else if (var2 == 16) {
			this.field2305 = var1.readUnsignedShort();
			this.field2300 = var1.readUnsignedShort();
		} else if (var2 == 17) {
			this.field2299 = new boolean[256];

			for (var3 = 0; var3 < this.field2299.length; ++var3) {
				this.field2299[var3] = false;
			}

			var3 = var1.readUnsignedByte();

			for (var4 = 0; var4 < var3; ++var4) {
				this.field2299[var1.readUnsignedByte()] = true;
			}
		}

	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1438810920"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.field2307 == -1) {
			if (this.field2298 == null && this.field2299 == null) {
				this.field2307 = 0;
			} else {
				this.field2307 = 2;
			}
		}

		if (this.field2301 == -1) {
			if (this.field2298 == null && this.field2299 == null) {
				this.field2301 = 0;
			} else {
				this.field2301 = 2;
			}
		}

	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lhs;IB)Lhs;",
		garbageValue = "80"
	)
	@Export("transformActorModel")
	public Model transformActorModel(Model var1, int var2) {
		if (!this.method4070()) {
			var2 = this.frameIds[var2];
			Frames var8 = class131.getFrames(var2 >> 16);
			var2 &= 65535;
			if (var8 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Model var7 = var1.toSharedSequenceModel(!var8.hasAlphaTransform(var2));
				var7.animate(var8, var2);
				return var7;
			}
		} else {
			int var4 = this.field2289;
			class133 var3;
			if (class70.method2087(var4) != 0) {
				var3 = null;
			} else {
				class133 var6 = (class133)SequenceDefinition_cachedModel.get((long)var4);
				class133 var5;
				if (var6 != null) {
					var5 = var6;
				} else {
					var6 = Login.method2165(SequenceDefinition_animationsArchive, class16.SequenceDefinition_skeletonsArchive, var4, false);
					if (var6 != null) {
						SequenceDefinition_cachedModel.put(var6, (long)var4);
					}

					var5 = var6;
				}

				var3 = var5;
			}

			if (var3 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Model var9 = var1.toSharedSequenceModel(!var3.method3096());
				var9.method4727(var3, var2);
				return var9;
			}
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lhs;IIB)Lhs;",
		garbageValue = "-110"
	)
	@Export("transformObjectModel")
	Model transformObjectModel(Model var1, int var2, int var3) {
		if (!this.method4070()) {
			var2 = this.frameIds[var2];
			Frames var9 = class131.getFrames(var2 >> 16);
			var2 &= 65535;
			if (var9 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Model var8 = var1.toSharedSequenceModel(!var9.hasAlphaTransform(var2));
				var3 &= 3;
				if (var3 == 1) {
					var8.rotateY270Ccw();
				} else if (var3 == 2) {
					var8.rotateY180();
				} else if (var3 == 3) {
					var8.rotateY90Ccw();
				}

				var8.animate(var9, var2);
				if (var3 == 1) {
					var8.rotateY90Ccw();
				} else if (var3 == 2) {
					var8.rotateY180();
				} else if (var3 == 3) {
					var8.rotateY270Ccw();
				}

				return var8;
			}
		} else {
			int var5 = this.field2289;
			class133 var4;
			if (class70.method2087(var5) != 0) {
				var4 = null;
			} else {
				class133 var7 = (class133)SequenceDefinition_cachedModel.get((long)var5);
				class133 var6;
				if (var7 != null) {
					var6 = var7;
				} else {
					var7 = Login.method2165(SequenceDefinition_animationsArchive, class16.SequenceDefinition_skeletonsArchive, var5, false);
					if (var7 != null) {
						SequenceDefinition_cachedModel.put(var7, (long)var5);
					}

					var6 = var7;
				}

				var4 = var6;
			}

			if (var4 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Model var10 = var1.toSharedSequenceModel(!var4.method3096());
				var3 &= 3;
				if (var3 == 1) {
					var10.rotateY270Ccw();
				} else if (var3 == 2) {
					var10.rotateY180();
				} else if (var3 == 3) {
					var10.rotateY90Ccw();
				}

				var10.method4727(var4, var2);
				if (var3 == 1) {
					var10.rotateY90Ccw();
				} else if (var3 == 2) {
					var10.rotateY180();
				} else if (var3 == 3) {
					var10.rotateY270Ccw();
				}

				return var10;
			}
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lhs;IB)Lhs;",
		garbageValue = "1"
	)
	@Export("transformSpotAnimationModel")
	Model transformSpotAnimationModel(Model var1, int var2) {
		if (!this.method4070()) {
			var2 = this.frameIds[var2];
			Frames var8 = class131.getFrames(var2 >> 16);
			var2 &= 65535;
			if (var8 == null) {
				return var1.toSharedSpotAnimationModel(true);
			} else {
				Model var7 = var1.toSharedSpotAnimationModel(!var8.hasAlphaTransform(var2));
				var7.animate(var8, var2);
				return var7;
			}
		} else {
			int var4 = this.field2289;
			class133 var3;
			if (class70.method2087(var4) != 0) {
				var3 = null;
			} else {
				class133 var6 = (class133)SequenceDefinition_cachedModel.get((long)var4);
				class133 var5;
				if (var6 != null) {
					var5 = var6;
				} else {
					var6 = Login.method2165(SequenceDefinition_animationsArchive, class16.SequenceDefinition_skeletonsArchive, var4, false);
					if (var6 != null) {
						SequenceDefinition_cachedModel.put(var6, (long)var4);
					}

					var5 = var6;
				}

				var3 = var5;
			}

			if (var3 == null) {
				return var1.toSharedSpotAnimationModel(true);
			} else {
				Model var9 = var1.toSharedSpotAnimationModel(!var3.method3096());
				var9.method4727(var3, var2);
				return var9;
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lhs;ILge;II)Lhs;",
		garbageValue = "-202244152"
	)
	@Export("applyTransformations")
	public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
		if (field2306 && !this.method4070() && !var3.method4070()) {
			return this.method4056(var1, var2, var3, var4);
		} else {
			Model var5 = var1.toSharedSequenceModel(false);
			boolean var6 = false;
			Frames var7 = null;
			Skeleton var8 = null;
			class133 var9;
			if (this.method4070()) {
				var9 = this.method4052();
				if (var9 == null) {
					return var5;
				}

				if (var3.method4070() && this.field2299 == null) {
					var5.method4727(var9, var2);
					return var5;
				}

				var8 = var9.field1600;
				var5.method4697(var8, var9, var2, this.field2299, false, !var3.method4070());
			} else {
				var2 = this.frameIds[var2];
				var7 = class131.getFrames(var2 >> 16);
				var2 &= 65535;
				if (var7 == null) {
					return var3.transformActorModel(var1, var4);
				}

				if (!var3.method4070() && (this.field2298 == null || var4 == -1)) {
					var5.animate(var7, var2);
					return var5;
				}

				if (this.field2298 == null || var4 == -1) {
					var5.animate(var7, var2);
					return var5;
				}

				var6 = var3.method4070();
				if (!var6) {
					var5.method4801(var7, var2, this.field2298, false);
				}
			}

			if (var3.method4070()) {
				var9 = var3.method4052();
				if (var9 == null) {
					return var5;
				}

				if (var8 == null) {
					var8 = var9.field1600;
				}

				var5.method4697(var8, var9, var4, this.field2299, true, true);
			} else {
				var4 = var3.frameIds[var4];
				Frames var10 = class131.getFrames(var4 >> 16);
				var4 &= 65535;
				if (var10 == null) {
					return this.transformActorModel(var1, var2);
				}

				var5.method4801(var10, var4, this.field2298, true);
			}

			if (var6 && var7 != null) {
				var5.method4801(var7, var2, this.field2298, false);
			}

			var5.resetBounds();
			return var5;
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lhs;ILge;II)Lhs;",
		garbageValue = "-2099671514"
	)
	Model method4056(Model var1, int var2, SequenceDefinition var3, int var4) {
		var2 = this.frameIds[var2];
		Frames var5 = class131.getFrames(var2 >> 16);
		var2 &= 65535;
		if (var5 == null) {
			return var3.transformActorModel(var1, var4);
		} else {
			var4 = var3.frameIds[var4];
			Frames var6 = class131.getFrames(var4 >> 16);
			var4 &= 65535;
			Model var7;
			if (var6 == null) {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2));
				var7.animate(var5, var2);
				return var7;
			} else {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2) & !var6.hasAlphaTransform(var4));
				var7.animate2(var5, var2, var6, var4, this.field2298);
				return var7;
			}
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lhs;II)Lhs;",
		garbageValue = "164179866"
	)
	@Export("transformWidgetModel")
	public Model transformWidgetModel(Model var1, int var2) {
		if (!this.method4070()) {
			int var3 = this.frameIds[var2];
			Frames var4 = class131.getFrames(var3 >> 16);
			var3 &= 65535;
			if (var4 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Frames var5 = null;
				int var6 = 0;
				if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) {
					var6 = this.chatFrameIds[var2];
					var5 = class131.getFrames(var6 >> 16);
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

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1029590355"
	)
	public boolean method4070() {
		return this.field2289 >= 0;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2032080348"
	)
	public int method4055() {
		return this.field2300 - this.field2305;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Lei;",
		garbageValue = "894053899"
	)
	class133 method4052() {
		if (this.method4070()) {
			int var2 = this.field2289;
			class133 var1;
			if (class70.method2087(var2) != 0) {
				var1 = null;
			} else {
				class133 var4 = (class133)SequenceDefinition_cachedModel.get((long)var2);
				class133 var3;
				if (var4 != null) {
					var3 = var4;
				} else {
					var4 = Login.method2165(SequenceDefinition_animationsArchive, class16.SequenceDefinition_skeletonsArchive, var2, false);
					if (var4 != null) {
						SequenceDefinition_cachedModel.put(var4, (long)var2);
					}

					var3 = var4;
				}

				var1 = var3;
			}

			return var1;
		} else {
			return null;
		}
	}
}
