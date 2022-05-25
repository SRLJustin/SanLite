import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gk")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("tb")
	@ObfuscatedGetter(
		intValue = 2130203017
	)
	static int field2077;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("HitSplatDefinition_archive")
	static AbstractArchive HitSplatDefinition_archive;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("HitSplatDefinition_cached")
	static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("HitSplatDefinition_cachedFonts")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1395317347
	)
	@Export("fontId")
	int fontId;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1417482049
	)
	@Export("textColor")
	public int textColor;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1131373797
	)
	public int field2071;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1501343813
	)
	int field2062;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -63093085
	)
	int field2067;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -580949191
	)
	int field2064;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 269659311
	)
	int field2054;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 254386385
	)
	public int field2055;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -825953789
	)
	public int field2074;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -801066855
	)
	public int field2072;
	@ObfuscatedName("d")
	String field2069;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1961631307
	)
	public int field2070;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -474593523
	)
	public int field2068;
	@ObfuscatedName("i")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -901285467
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -895793349
	)
	@Export("transformVarp")
	int transformVarp;

	static {
		HitSplatDefinition_cached = new EvictingDualNodeHashTable(64);
		HitSplatDefinition_cachedSprites = new EvictingDualNodeHashTable(64);
		HitSplatDefinition_cachedFonts = new EvictingDualNodeHashTable(20);
	}

	HitSplatDefinition() {
		this.fontId = -1;
		this.textColor = 16777215;
		this.field2071 = 70;
		this.field2062 = -1;
		this.field2067 = -1;
		this.field2064 = -1;
		this.field2054 = -1;
		this.field2055 = 0;
		this.field2074 = 0;
		this.field2072 = -1;
		this.field2069 = "";
		this.field2070 = -1;
		this.field2068 = 0;
		this.transformVarbit = -1;
		this.transformVarp = -1;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)V",
		garbageValue = "507933572"
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

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lpx;II)V",
		garbageValue = "1744488048"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.fontId = var1.method7532();
		} else if (var2 == 2) {
			this.textColor = var1.readMedium();
		} else if (var2 == 3) {
			this.field2062 = var1.method7532();
		} else if (var2 == 4) {
			this.field2064 = var1.method7532();
		} else if (var2 == 5) {
			this.field2067 = var1.method7532();
		} else if (var2 == 6) {
			this.field2054 = var1.method7532();
		} else if (var2 == 7) {
			this.field2055 = var1.readShort();
		} else if (var2 == 8) {
			this.field2069 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) {
			this.field2071 = var1.readUnsignedShort();
		} else if (var2 == 10) {
			this.field2074 = var1.readShort();
		} else if (var2 == 11) {
			this.field2072 = 0;
		} else if (var2 == 12) {
			this.field2070 = var1.readUnsignedByte();
		} else if (var2 == 13) {
			this.field2068 = var1.readShort();
		} else if (var2 == 14) {
			this.field2072 = var1.readUnsignedShort();
		} else if (var2 == 17 || var2 == 18) {
			this.transformVarbit = var1.readUnsignedShort();
			if (this.transformVarbit == 65535) {
				this.transformVarbit = -1;
			}

			this.transformVarp = var1.readUnsignedShort();
			if (this.transformVarp == 65535) {
				this.transformVarp = -1;
			}

			int var3 = -1;
			if (var2 == 18) {
				var3 = var1.readUnsignedShort();
				if (var3 == 65535) {
					var3 = -1;
				}
			}

			int var4 = var1.readUnsignedByte();
			this.transforms = new int[var4 + 2];

			for (int var5 = 0; var5 <= var4; ++var5) {
				this.transforms[var5] = var1.readUnsignedShort();
				if (this.transforms[var5] == 65535) {
					this.transforms[var5] = -1;
				}
			}

			this.transforms[var4 + 1] = var3;
		}

	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)Lgk;",
		garbageValue = "1570100163"
	)
	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1;
		if (this.transformVarbit != -1) {
			var1 = class18.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) {
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? UserComparator4.method2567(var2) : null;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1649280427"
	)
	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field2069;

		while (true) {
			int var3 = var2.indexOf("%1");
			if (var3 < 0) {
				return var2;
			}

			var2 = var2.substring(0, var3) + Message.intToString(var1, false) + var2.substring(var3 + 2);
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)Lqr;",
		garbageValue = "-97"
	)
	public SpritePixels method3531() {
		if (this.field2062 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2062);
			if (var1 != null) {
				return var1;
			} else {
				var1 = StructComposition.SpriteBuffer_getSprite(ModelData0.field2654, this.field2062, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2062);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Lqr;",
		garbageValue = "-1422876623"
	)
	public SpritePixels method3534() {
		if (this.field2067 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2067);
			if (var1 != null) {
				return var1;
			} else {
				var1 = StructComposition.SpriteBuffer_getSprite(ModelData0.field2654, this.field2067, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2067);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(B)Lqr;",
		garbageValue = "23"
	)
	public SpritePixels method3533() {
		if (this.field2064 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2064);
			if (var1 != null) {
				return var1;
			} else {
				var1 = StructComposition.SpriteBuffer_getSprite(ModelData0.field2654, this.field2064, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2064);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Lqr;",
		garbageValue = "-554047425"
	)
	public SpritePixels method3559() {
		if (this.field2054 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2054);
			if (var1 != null) {
				return var1;
			} else {
				var1 = StructComposition.SpriteBuffer_getSprite(ModelData0.field2654, this.field2054, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2054);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)Lmx;",
		garbageValue = "287302031"
	)
	@Export("getFont")
	public Font getFont() {
		if (this.fontId == -1) {
			return null;
		} else {
			Font var1 = (Font)HitSplatDefinition_cachedFonts.get((long)this.fontId);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class387.method6781(ModelData0.field2654, class1.HitSplatDefinition_fontsArchive, this.fontId, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedFonts.put(var1, (long)this.fontId);
				}

				return var1;
			}
		}
	}
}
