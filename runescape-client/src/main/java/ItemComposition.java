import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jj")
@Implements("ItemComposition")
public class ItemComposition extends DualNode {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "Lex;"
	)
	@Export("ItemDefinition_cached")
	public static EvictingDualNodeHashTable ItemDefinition_cached;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "Lex;"
	)
	@Export("ItemDefinition_cachedModels")
	public static EvictingDualNodeHashTable ItemDefinition_cachedModels;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Lex;"
	)
	@Export("ItemDefinition_cachedSprites")
	public static EvictingDualNodeHashTable ItemDefinition_cachedSprites;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "Lkl;"
	)
	@Export("ItemDefinition_fontPlain11")
	public static Font ItemDefinition_fontPlain11;
	@ObfuscatedName("es")
	@ObfuscatedSignature(
		signature = "Liy;"
	)
	@Export("archive17")
	static Archive archive17;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1001964101
	)
	@Export("id")
	public int id;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1799325523
	)
	@Export("model")
	int model;
	@ObfuscatedName("i")
	@Export("name")
	public String name;
	@ObfuscatedName("x")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("f")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("g")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("u")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 6879929
	)
	@Export("zoom2d")
	public int zoom2d;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1688105217
	)
	@Export("xan2d")
	public int xan2d;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1543947313
	)
	@Export("yan2d")
	public int yan2d;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1306292043
	)
	@Export("zan2d")
	public int zan2d;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1516282991
	)
	@Export("offsetX2d")
	public int offsetX2d;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1944648005
	)
	@Export("offsetY2d")
	public int offsetY2d;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1833299999
	)
	@Export("isStackable")
	public int isStackable;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 753728935
	)
	@Export("price")
	public int price;
	@ObfuscatedName("ag")
	@Export("isMembersOnly")
	public boolean isMembersOnly;
	@ObfuscatedName("ae")
	@Export("groundActions")
	public String[] groundActions;
	@ObfuscatedName("ac")
	@Export("inventoryActions")
	public String[] inventoryActions;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1719700473
	)
	@Export("shiftClickIndex")
	int shiftClickIndex;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1669101649
	)
	@Export("maleModel")
	int maleModel;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -2060581313
	)
	@Export("maleModel1")
	int maleModel1;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -924111705
	)
	@Export("maleOffset")
	int maleOffset;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -933159689
	)
	@Export("femaleModel")
	int femaleModel;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -706743113
	)
	@Export("femaleModel1")
	int femaleModel1;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -224060053
	)
	@Export("femaleOffset")
	int femaleOffset;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -156140513
	)
	@Export("maleModel2")
	int maleModel2;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1489011567
	)
	@Export("femaleModel2")
	int femaleModel2;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1126073689
	)
	@Export("maleHeadModel")
	int maleHeadModel;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -579174705
	)
	@Export("maleHeadModel2")
	int maleHeadModel2;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1575362213
	)
	@Export("femaleHeadModel")
	int femaleHeadModel;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 580683253
	)
	@Export("femaleHeadModel2")
	int femaleHeadModel2;
	@ObfuscatedName("ai")
	@Export("countobj")
	int[] countobj;
	@ObfuscatedName("ab")
	@Export("countco")
	int[] countco;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1429029547
	)
	@Export("note")
	public int note;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1169335275
	)
	@Export("noteTemplate")
	public int noteTemplate;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1218520383
	)
	@Export("resizeX")
	int resizeX;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1237330743
	)
	@Export("resizeY")
	int resizeY;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -52672675
	)
	@Export("resizeZ")
	int resizeZ;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -1894951113
	)
	@Export("ambient")
	public int ambient;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 350905955
	)
	@Export("contrast")
	public int contrast;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -358340883
	)
	@Export("team")
	public int team;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		signature = "Llg;"
	)
	@Export("params")
	IterableNodeHashTable params;
	@ObfuscatedName("br")
	@Export("isTradable")
	public boolean isTradable;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 1240574229
	)
	@Export("unnotedId")
	int unnotedId;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 1151278327
	)
	@Export("notedId")
	int notedId;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 1976795321
	)
	@Export("placeholder")
	public int placeholder;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 1745623911
	)
	@Export("placeholderTemplate")
	public int placeholderTemplate;

	static {
		ItemDefinition_cached = new EvictingDualNodeHashTable(64);
		ItemDefinition_cachedModels = new EvictingDualNodeHashTable(50);
		ItemDefinition_cachedSprites = new EvictingDualNodeHashTable(200);
	}

	ItemComposition() {
		this.name = "null";
		this.zoom2d = 2000;
		this.xan2d = 0;
		this.yan2d = 0;
		this.zan2d = 0;
		this.offsetX2d = 0;
		this.offsetY2d = 0;
		this.isStackable = 0;
		this.price = 1;
		this.isMembersOnly = false;
		this.groundActions = new String[]{null, null, "Take", null, null};
		this.inventoryActions = new String[]{null, null, null, null, "Drop"};
		this.shiftClickIndex = -2;
		this.maleModel = -1;
		this.maleModel1 = -1;
		this.maleOffset = 0;
		this.femaleModel = -1;
		this.femaleModel1 = -1;
		this.femaleOffset = 0;
		this.maleModel2 = -1;
		this.femaleModel2 = -1;
		this.maleHeadModel = -1;
		this.maleHeadModel2 = -1;
		this.femaleHeadModel = -1;
		this.femaleHeadModel2 = -1;
		this.note = -1;
		this.noteTemplate = -1;
		this.resizeX = 128;
		this.resizeY = 128;
		this.resizeZ = 128;
		this.ambient = 0;
		this.contrast = 0;
		this.team = 0;
		this.isTradable = false;
		this.unnotedId = -1;
		this.notedId = -1;
		this.placeholder = -1;
		this.placeholderTemplate = -1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		garbageValue = "988700298",
		signature = "(I)V"
	)
	@Export("post")
	void post() {
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		garbageValue = "-2119006987",
		signature = "(Lkx;I)V"
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

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		garbageValue = "42",
		signature = "(Lkx;IB)V"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.model = var1.readUnsignedShort();
		} else if (var2 == 2) {
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) {
			this.zoom2d = var1.readUnsignedShort();
		} else if (var2 == 5) {
			this.xan2d = var1.readUnsignedShort();
		} else if (var2 == 6) {
			this.yan2d = var1.readUnsignedShort();
		} else if (var2 == 7) {
			this.offsetX2d = var1.readUnsignedShort();
			if (this.offsetX2d > 32767) {
				this.offsetX2d -= 65536;
			}
		} else if (var2 == 8) {
			this.offsetY2d = var1.readUnsignedShort();
			if (this.offsetY2d > 32767) {
				this.offsetY2d -= 65536;
			}
		} else if (var2 == 11) {
			this.isStackable = 1;
		} else if (var2 == 12) {
			this.price = var1.readInt();
		} else if (var2 == 16) {
			this.isMembersOnly = true;
		} else if (var2 == 23) {
			this.maleModel = var1.readUnsignedShort();
			this.maleOffset = var1.readUnsignedByte();
		} else if (var2 == 24) {
			this.maleModel1 = var1.readUnsignedShort();
		} else if (var2 == 25) {
			this.femaleModel = var1.readUnsignedShort();
			this.femaleOffset = var1.readUnsignedByte();
		} else if (var2 == 26) {
			this.femaleModel1 = var1.readUnsignedShort();
		} else if (var2 >= 30 && var2 < 35) {
			this.groundActions[var2 - 30] = var1.readStringCp1252NullTerminated();
			if (this.groundActions[var2 - 30].equalsIgnoreCase("Hidden")) {
				this.groundActions[var2 - 30] = null;
			}
		} else if (var2 >= 35 && var2 < 40) {
			this.inventoryActions[var2 - 35] = var1.readStringCp1252NullTerminated();
		} else {
			int var3;
			int var4;
			if (var2 == 40) {
				var3 = var1.readUnsignedByte();
				this.recolorFrom = new short[var3];
				this.recolorTo = new short[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					this.recolorFrom[var4] = (short)var1.readUnsignedShort();
					this.recolorTo[var4] = (short)var1.readUnsignedShort();
				}
			} else if (var2 == 41) {
				var3 = var1.readUnsignedByte();
				this.retextureFrom = new short[var3];
				this.retextureTo = new short[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					this.retextureFrom[var4] = (short)var1.readUnsignedShort();
					this.retextureTo[var4] = (short)var1.readUnsignedShort();
				}
			} else if (var2 == 42) {
				this.shiftClickIndex = var1.readByte();
			} else if (var2 == 65) {
				this.isTradable = true;
			} else if (var2 == 78) {
				this.maleModel2 = var1.readUnsignedShort();
			} else if (var2 == 79) {
				this.femaleModel2 = var1.readUnsignedShort();
			} else if (var2 == 90) {
				this.maleHeadModel = var1.readUnsignedShort();
			} else if (var2 == 91) {
				this.femaleHeadModel = var1.readUnsignedShort();
			} else if (var2 == 92) {
				this.maleHeadModel2 = var1.readUnsignedShort();
			} else if (var2 == 93) {
				this.femaleHeadModel2 = var1.readUnsignedShort();
			} else if (var2 == 95) {
				this.zan2d = var1.readUnsignedShort();
			} else if (var2 == 97) {
				this.note = var1.readUnsignedShort();
			} else if (var2 == 98) {
				this.noteTemplate = var1.readUnsignedShort();
			} else if (var2 >= 100 && var2 < 110) {
				if (this.countobj == null) {
					this.countobj = new int[10];
					this.countco = new int[10];
				}

				this.countobj[var2 - 100] = var1.readUnsignedShort();
				this.countco[var2 - 100] = var1.readUnsignedShort();
			} else if (var2 == 110) {
				this.resizeX = var1.readUnsignedShort();
			} else if (var2 == 111) {
				this.resizeY = var1.readUnsignedShort();
			} else if (var2 == 112) {
				this.resizeZ = var1.readUnsignedShort();
			} else if (var2 == 113) {
				this.ambient = var1.readByte();
			} else if (var2 == 114) {
				this.contrast = var1.readByte() * 5;
			} else if (var2 == 115) {
				this.team = var1.readUnsignedByte();
			} else if (var2 == 139) {
				this.unnotedId = var1.readUnsignedShort();
			} else if (var2 == 140) {
				this.notedId = var1.readUnsignedShort();
			} else if (var2 == 148) {
				this.placeholder = var1.readUnsignedShort();
			} else if (var2 == 149) {
				this.placeholderTemplate = var1.readUnsignedShort();
			} else if (var2 == 249) {
				this.params = TextureProvider.readStringIntParameters(var1, this.params);
			}
		}

	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		garbageValue = "1798328013",
		signature = "(Ljj;Ljj;I)V"
	)
	@Export("genCert")
	void genCert(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model;
		this.zoom2d = var1.zoom2d;
		this.xan2d = var1.xan2d;
		this.yan2d = var1.yan2d;
		this.zan2d = var1.zan2d;
		this.offsetX2d = var1.offsetX2d;
		this.offsetY2d = var1.offsetY2d;
		this.recolorFrom = var1.recolorFrom;
		this.recolorTo = var1.recolorTo;
		this.retextureFrom = var1.retextureFrom;
		this.retextureTo = var1.retextureTo;
		this.name = var2.name;
		this.isMembersOnly = var2.isMembersOnly;
		this.price = var2.price;
		this.isStackable = 1;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "962521022",
		signature = "(Ljj;Ljj;I)V"
	)
	@Export("genBought")
	void genBought(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model;
		this.zoom2d = var1.zoom2d;
		this.xan2d = var1.xan2d;
		this.yan2d = var1.yan2d;
		this.zan2d = var1.zan2d;
		this.offsetX2d = var1.offsetX2d;
		this.offsetY2d = var1.offsetY2d;
		this.recolorFrom = var2.recolorFrom;
		this.recolorTo = var2.recolorTo;
		this.retextureFrom = var2.retextureFrom;
		this.retextureTo = var2.retextureTo;
		this.name = var2.name;
		this.isMembersOnly = var2.isMembersOnly;
		this.isStackable = var2.isStackable;
		this.maleModel = var2.maleModel;
		this.maleModel1 = var2.maleModel1;
		this.maleModel2 = var2.maleModel2;
		this.femaleModel = var2.femaleModel;
		this.femaleModel1 = var2.femaleModel1;
		this.femaleModel2 = var2.femaleModel2;
		this.maleHeadModel = var2.maleHeadModel;
		this.maleHeadModel2 = var2.maleHeadModel2;
		this.femaleHeadModel = var2.femaleHeadModel;
		this.femaleHeadModel2 = var2.femaleHeadModel2;
		this.team = var2.team;
		this.groundActions = var2.groundActions;
		this.inventoryActions = new String[5];
		if (var2.inventoryActions != null) {
			for (int var3 = 0; var3 < 4; ++var3) {
				this.inventoryActions[var3] = var2.inventoryActions[var3];
			}
		}

		this.inventoryActions[4] = "Discard";
		this.price = 0;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		garbageValue = "-1559307147",
		signature = "(Ljj;Ljj;I)V"
	)
	@Export("genPlaceholder")
	void genPlaceholder(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model;
		this.zoom2d = var1.zoom2d;
		this.xan2d = var1.xan2d;
		this.yan2d = var1.yan2d;
		this.zan2d = var1.zan2d;
		this.offsetX2d = var1.offsetX2d;
		this.offsetY2d = var1.offsetY2d;
		this.recolorFrom = var1.recolorFrom;
		this.recolorTo = var1.recolorTo;
		this.retextureFrom = var1.retextureFrom;
		this.retextureTo = var1.retextureTo;
		this.isStackable = var1.isStackable;
		this.name = var2.name;
		this.price = 0;
		this.isMembersOnly = false;
		this.isTradable = false;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		garbageValue = "-1144241920",
		signature = "(II)Lek;"
	)
	@Export("getModelData")
	public final ModelData getModelData(int var1) {
		int var3;
		if (this.countobj != null && var1 > 1) {
			int var2 = -1;

			for (var3 = 0; var3 < 10; ++var3) {
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) {
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) {
				return class281.ItemDefinition_get(var2).getModelData(1);
			}
		}

		ModelData var4 = ModelData.ModelData_get(class8.ItemDefinition_modelArchive, this.model, 0);
		if (var4 == null) {
			return null;
		} else {
			if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) {
				var4.resize(this.resizeX, this.resizeY, this.resizeZ);
			}

			if (this.recolorFrom != null) {
				for (var3 = 0; var3 < this.recolorFrom.length; ++var3) {
					var4.recolor(this.recolorFrom[var3], this.recolorTo[var3]);
				}
			}

			if (this.retextureFrom != null) {
				for (var3 = 0; var3 < this.retextureFrom.length; ++var3) {
					var4.retexture(this.retextureFrom[var3], this.retextureTo[var3]);
				}
			}

			return var4;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		garbageValue = "-2139436436",
		signature = "(II)Lef;"
	)
	@Export("getModel")
	public final Model getModel(int var1) {
		if (this.countobj != null && var1 > 1) {
			int var2 = -1;

			for (int var3 = 0; var3 < 10; ++var3) {
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) {
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) {
				return class281.ItemDefinition_get(var2).getModel(1);
			}
		}

		Model var5 = (Model)ItemDefinition_cachedModels.get((long)this.id);
		if (var5 != null) {
			return var5;
		} else {
			ModelData var6 = ModelData.ModelData_get(class8.ItemDefinition_modelArchive, this.model, 0);
			if (var6 == null) {
				return null;
			} else {
				if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) {
					var6.resize(this.resizeX, this.resizeY, this.resizeZ);
				}

				int var4;
				if (this.recolorFrom != null) {
					for (var4 = 0; var4 < this.recolorFrom.length; ++var4) {
						var6.recolor(this.recolorFrom[var4], this.recolorTo[var4]);
					}
				}

				if (this.retextureFrom != null) {
					for (var4 = 0; var4 < this.retextureFrom.length; ++var4) {
						var6.retexture(this.retextureFrom[var4], this.retextureTo[var4]);
					}
				}

				var5 = var6.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50);
				var5.isSingleTile = true;
				ItemDefinition_cachedModels.put(var5, (long)this.id);
				return var5;
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		garbageValue = "-309156519",
		signature = "(II)Ljj;"
	)
	@Export("getCountObj")
	public ItemComposition getCountObj(int var1) {
		if (this.countobj != null && var1 > 1) {
			int var2 = -1;

			for (int var3 = 0; var3 < 10; ++var3) {
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) {
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) {
				return class281.ItemDefinition_get(var2);
			}
		}

		return this;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		garbageValue = "-240048838",
		signature = "(ZI)Z"
	)
	@Export("hasNoValidModel")
	public final boolean hasNoValidModel(boolean var1) {
		int var2 = this.maleModel;
		int var3 = this.maleModel1;
		int var4 = this.maleModel2;
		if (var1) {
			var2 = this.femaleModel;
			var3 = this.femaleModel1;
			var4 = this.femaleModel2;
		}

		if (var2 == -1) {
			return true;
		} else {
			boolean var5 = true;
			if (!class8.ItemDefinition_modelArchive.tryLoadFile(var2, 0)) {
				var5 = false;
			}

			if (var3 != -1 && !class8.ItemDefinition_modelArchive.tryLoadFile(var3, 0)) {
				var5 = false;
			}

			if (var4 != -1 && !class8.ItemDefinition_modelArchive.tryLoadFile(var4, 0)) {
				var5 = false;
			}

			return var5;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		garbageValue = "-324147139",
		signature = "(ZI)Lek;"
	)
	public final ModelData method4866(boolean var1) {
		int var2 = this.maleModel;
		int var3 = this.maleModel1;
		int var4 = this.maleModel2;
		if (var1) {
			var2 = this.femaleModel;
			var3 = this.femaleModel1;
			var4 = this.femaleModel2;
		}

		if (var2 == -1) {
			return null;
		} else {
			ModelData var5 = ModelData.ModelData_get(class8.ItemDefinition_modelArchive, var2, 0);
			if (var3 != -1) {
				ModelData var6 = ModelData.ModelData_get(class8.ItemDefinition_modelArchive, var3, 0);
				if (var4 != -1) {
					ModelData var7 = ModelData.ModelData_get(class8.ItemDefinition_modelArchive, var4, 0);
					ModelData[] var8 = new ModelData[]{var5, var6, var7};
					var5 = new ModelData(var8, 3);
				} else {
					ModelData[] var10 = new ModelData[]{var5, var6};
					var5 = new ModelData(var10, 2);
				}
			}

			if (!var1 && this.maleOffset != 0) {
				var5.changeOffset(0, this.maleOffset, 0);
			}

			if (var1 && this.femaleOffset != 0) {
				var5.changeOffset(0, this.femaleOffset, 0);
			}

			int var9;
			if (this.recolorFrom != null) {
				for (var9 = 0; var9 < this.recolorFrom.length; ++var9) {
					var5.recolor(this.recolorFrom[var9], this.recolorTo[var9]);
				}
			}

			if (this.retextureFrom != null) {
				for (var9 = 0; var9 < this.retextureFrom.length; ++var9) {
					var5.retexture(this.retextureFrom[var9], this.retextureTo[var9]);
				}
			}

			return var5;
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		garbageValue = "-1270984011",
		signature = "(ZI)Z"
	)
	public final boolean method4879(boolean var1) {
		int var2 = this.maleHeadModel;
		int var3 = this.maleHeadModel2;
		if (var1) {
			var2 = this.femaleHeadModel;
			var3 = this.femaleHeadModel2;
		}

		if (var2 == -1) {
			return true;
		} else {
			boolean var4 = true;
			if (!class8.ItemDefinition_modelArchive.tryLoadFile(var2, 0)) {
				var4 = false;
			}

			if (var3 != -1 && !class8.ItemDefinition_modelArchive.tryLoadFile(var3, 0)) {
				var4 = false;
			}

			return var4;
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		garbageValue = "51",
		signature = "(ZB)Lek;"
	)
	public final ModelData method4880(boolean var1) {
		int var2 = this.maleHeadModel;
		int var3 = this.maleHeadModel2;
		if (var1) {
			var2 = this.femaleHeadModel;
			var3 = this.femaleHeadModel2;
		}

		if (var2 == -1) {
			return null;
		} else {
			ModelData var4 = ModelData.ModelData_get(class8.ItemDefinition_modelArchive, var2, 0);
			if (var3 != -1) {
				ModelData var5 = ModelData.ModelData_get(class8.ItemDefinition_modelArchive, var3, 0);
				ModelData[] var6 = new ModelData[]{var4, var5};
				var4 = new ModelData(var6, 2);
			}

			int var7;
			if (this.recolorFrom != null) {
				for (var7 = 0; var7 < this.recolorFrom.length; ++var7) {
					var4.recolor(this.recolorFrom[var7], this.recolorTo[var7]);
				}
			}

			if (this.retextureFrom != null) {
				for (var7 = 0; var7 < this.retextureFrom.length; ++var7) {
					var4.retexture(this.retextureFrom[var7], this.retextureTo[var7]);
				}
			}

			return var4;
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		garbageValue = "-45",
		signature = "(IIB)I"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		IterableNodeHashTable var4 = this.params;
		int var3;
		if (var4 == null) {
			var3 = var2;
		} else {
			IntegerNode var5 = (IntegerNode)var4.get((long)var1);
			if (var5 == null) {
				var3 = var2;
			} else {
				var3 = var5.integer;
			}
		}

		return var3;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		garbageValue = "1156032782",
		signature = "(ILjava/lang/String;I)Ljava/lang/String;"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return class69.method1258(this.params, var1, var2);
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		garbageValue = "47",
		signature = "(B)I"
	)
	@Export("getShiftClickIndex")
	public int getShiftClickIndex() {
		if (this.shiftClickIndex != -1 && this.inventoryActions != null) {
			if (this.shiftClickIndex >= 0) {
				return this.inventoryActions[this.shiftClickIndex] != null ? this.shiftClickIndex : -1;
			} else {
				return "Drop".equalsIgnoreCase(this.inventoryActions[4]) ? 4 : -1;
			}
		} else {
			return -1;
		}
	}
}
