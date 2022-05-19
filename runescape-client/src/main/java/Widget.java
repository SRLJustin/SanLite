import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ki")
@Implements("Widget")
public class Widget extends Node {
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("Widget_cachedSprites")
	public static EvictingDualNodeHashTable Widget_cachedSprites;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("Widget_cachedModels")
	public static EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("Widget_cachedFonts")
	public static EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("Widget_cachedSpriteMasks")
	public static EvictingDualNodeHashTable Widget_cachedSpriteMasks;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	static class362 field3390;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	static class362 field3378;
	@ObfuscatedName("aj")
	public static boolean field3407;
	@ObfuscatedName("ae")
	@Export("isIf3")
	public boolean isIf3;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1115174973
	)
	@Export("id")
	public int id;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -776270713
	)
	@Export("childIndex")
	public int childIndex;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1972844397
	)
	@Export("type")
	public int type;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 235823181
	)
	@Export("buttonType")
	public int buttonType;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -388100275
	)
	@Export("contentType")
	public int contentType;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -396062445
	)
	@Export("xAlignment")
	public int xAlignment;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 678418613
	)
	@Export("yAlignment")
	public int yAlignment;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1351515849
	)
	@Export("widthAlignment")
	public int widthAlignment;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1340623801
	)
	@Export("heightAlignment")
	public int heightAlignment;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1043867923
	)
	@Export("rawX")
	public int rawX;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -2102072707
	)
	@Export("rawY")
	public int rawY;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1127967955
	)
	@Export("rawWidth")
	public int rawWidth;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 232379525
	)
	@Export("rawHeight")
	public int rawHeight;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1835485941
	)
	@Export("x")
	public int x;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -2009390011
	)
	@Export("y")
	public int y;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1172311447
	)
	@Export("width")
	public int width;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -459533989
	)
	@Export("height")
	public int height;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -2136321081
	)
	public int field3411;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1059357481
	)
	public int field3494;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -906080451
	)
	@Export("parentId")
	public int parentId;
	@ObfuscatedName("ba")
	@Export("isHidden")
	public boolean isHidden;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 577252931
	)
	@Export("scrollX")
	public int scrollX;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -1581918007
	)
	@Export("scrollY")
	public int scrollY;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 1123320165
	)
	@Export("scrollWidth")
	public int scrollWidth;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -578131215
	)
	@Export("scrollHeight")
	public int scrollHeight;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -979741419
	)
	@Export("color")
	public int color;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -792649141
	)
	@Export("color2")
	public int color2;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 387100237
	)
	@Export("mouseOverColor")
	public int mouseOverColor;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -554834039
	)
	@Export("mouseOverColor2")
	public int mouseOverColor2;
	@ObfuscatedName("bj")
	@Export("fill")
	public boolean fill;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	@Export("fillMode")
	public class450 fillMode;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -193710345
	)
	@Export("transparencyTop")
	public int transparencyTop;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 992811287
	)
	@Export("transparencyBot")
	public int transparencyBot;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 184656457
	)
	@Export("lineWid")
	public int lineWid;
	@ObfuscatedName("bt")
	public boolean field3428;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -2014760189
	)
	@Export("spriteId2")
	public int spriteId2;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 286536551
	)
	@Export("spriteId")
	public int spriteId;
	@ObfuscatedName("bh")
	public String field3431;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 1597579983
	)
	@Export("spriteAngle")
	public int spriteAngle;
	@ObfuscatedName("bm")
	@Export("spriteTiling")
	public boolean spriteTiling;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 346905275
	)
	@Export("outline")
	public int outline;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -460120439
	)
	@Export("spriteShadow")
	public int spriteShadow;
	@ObfuscatedName("bg")
	@Export("spriteFlipV")
	public boolean spriteFlipV;
	@ObfuscatedName("bp")
	@Export("spriteFlipH")
	public boolean spriteFlipH;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 2112595825
	)
	@Export("modelType")
	public int modelType;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = 288041705
	)
	@Export("modelId")
	public int modelId;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = -1783833135
	)
	@Export("modelType2")
	int modelType2;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = 1672879833
	)
	@Export("modelId2")
	int modelId2;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = 1814404803
	)
	@Export("sequenceId")
	public int sequenceId;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 2098504379
	)
	@Export("sequenceId2")
	public int sequenceId2;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = 509392171
	)
	@Export("modelOffsetX")
	public int modelOffsetX;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = -164846883
	)
	@Export("modelOffsetY")
	public int modelOffsetY;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = 1338987037
	)
	@Export("modelAngleX")
	public int modelAngleX;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -245886579
	)
	@Export("modelAngleY")
	public int modelAngleY;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 1535139247
	)
	@Export("modelAngleZ")
	public int modelAngleZ;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = 1846491567
	)
	@Export("modelZoom")
	public int modelZoom;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 399903033
	)
	public int field3406;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -891150003
	)
	public int field3451;
	@ObfuscatedName("cd")
	@Export("modelOrthog")
	public boolean modelOrthog;
	@ObfuscatedName("cw")
	@Export("modelTransparency")
	public boolean modelTransparency;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = 2138903919
	)
	@Export("itemQuantityMode")
	public int itemQuantityMode;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = -1797182937
	)
	@Export("fontId")
	public int fontId;
	@ObfuscatedName("cg")
	@Export("text")
	public String text;
	@ObfuscatedName("cl")
	@Export("text2")
	public String text2;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 1967727263
	)
	@Export("textLineHeight")
	public int textLineHeight;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = 1185644193
	)
	@Export("textXAlignment")
	public int textXAlignment;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = -1879071397
	)
	@Export("textYAlignment")
	public int textYAlignment;
	@ObfuscatedName("ce")
	@Export("textShadowed")
	public boolean textShadowed;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = 1427227403
	)
	@Export("paddingX")
	public int paddingX;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = -91862955
	)
	@Export("paddingY")
	public int paddingY;
	@ObfuscatedName("cp")
	@Export("inventoryXOffsets")
	public int[] inventoryXOffsets;
	@ObfuscatedName("dc")
	@Export("inventoryYOffsets")
	public int[] inventoryYOffsets;
	@ObfuscatedName("dp")
	@Export("inventorySprites")
	public int[] inventorySprites;
	@ObfuscatedName("dg")
	@Export("itemActions")
	public String[] itemActions;
	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	class155 field3408;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = -1702458807
	)
	int field3391;
	@ObfuscatedName("dj")
	HashMap field3470;
	@ObfuscatedName("dx")
	HashMap field3471;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = 1159870601
	)
	@Export("flags")
	public int flags;
	@ObfuscatedName("di")
	public boolean field3473;
	@ObfuscatedName("de")
	public byte[][] field3474;
	@ObfuscatedName("db")
	public byte[][] field3419;
	@ObfuscatedName("dn")
	public int[] field3476;
	@ObfuscatedName("dz")
	public int[] field3481;
	@ObfuscatedName("ds")
	@Export("dataText")
	public String dataText;
	@ObfuscatedName("dt")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	@Export("parent")
	public Widget parent;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = -899991807
	)
	@Export("dragZoneSize")
	public int dragZoneSize;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = 799594581
	)
	@Export("dragThreshold")
	public int dragThreshold;
	@ObfuscatedName("dw")
	@Export("isScrollBar")
	public boolean isScrollBar;
	@ObfuscatedName("dk")
	@Export("spellActionName")
	public String spellActionName;
	@ObfuscatedName("du")
	@Export("hasListener")
	public boolean hasListener;
	@ObfuscatedName("em")
	@Export("onLoad")
	public Object[] onLoad;
	@ObfuscatedName("eh")
	@Export("onClick")
	public Object[] onClick;
	@ObfuscatedName("ej")
	@Export("onClickRepeat")
	public Object[] onClickRepeat;
	@ObfuscatedName("en")
	@Export("onRelease")
	public Object[] onRelease;
	@ObfuscatedName("eb")
	@Export("onHold")
	public Object[] onHold;
	@ObfuscatedName("ea")
	@Export("onMouseOver")
	public Object[] onMouseOver;
	@ObfuscatedName("er")
	@Export("onMouseRepeat")
	public Object[] onMouseRepeat;
	@ObfuscatedName("eo")
	@Export("onMouseLeave")
	public Object[] onMouseLeave;
	@ObfuscatedName("ec")
	@Export("onDrag")
	public Object[] onDrag;
	@ObfuscatedName("ek")
	@Export("onDragComplete")
	public Object[] onDragComplete;
	@ObfuscatedName("ed")
	@Export("onTargetEnter")
	public Object[] onTargetEnter;
	@ObfuscatedName("ew")
	@Export("onTargetLeave")
	public Object[] onTargetLeave;
	@ObfuscatedName("ev")
	@Export("onVarTransmit")
	public Object[] onVarTransmit;
	@ObfuscatedName("el")
	@Export("varTransmitTriggers")
	public int[] varTransmitTriggers;
	@ObfuscatedName("ef")
	@Export("onInvTransmit")
	public Object[] onInvTransmit;
	@ObfuscatedName("ee")
	@Export("invTransmitTriggers")
	public int[] invTransmitTriggers;
	@ObfuscatedName("es")
	@Export("onStatTransmit")
	public Object[] onStatTransmit;
	@ObfuscatedName("eg")
	@Export("statTransmitTriggers")
	public int[] statTransmitTriggers;
	@ObfuscatedName("et")
	@Export("onTimer")
	public Object[] onTimer;
	@ObfuscatedName("ex")
	@Export("onOp")
	public Object[] onOp;
	@ObfuscatedName("ei")
	@Export("onScroll")
	public Object[] onScroll;
	@ObfuscatedName("ey")
	@Export("onChatTransmit")
	public Object[] onChatTransmit;
	@ObfuscatedName("ep")
	@Export("onKey")
	public Object[] onKey;
	@ObfuscatedName("eu")
	public Object[] field3443;
	@ObfuscatedName("ez")
	public Object[] field3510;
	@ObfuscatedName("eq")
	@Export("onFriendTransmit")
	public Object[] onFriendTransmit;
	@ObfuscatedName("fs")
	@Export("onClanTransmit")
	public Object[] onClanTransmit;
	@ObfuscatedName("fp")
	public Object[] field3513;
	@ObfuscatedName("fy")
	public Object[] field3456;
	@ObfuscatedName("fg")
	@Export("onMiscTransmit")
	public Object[] onMiscTransmit;
	@ObfuscatedName("fd")
	@Export("onDialogAbort")
	public Object[] onDialogAbort;
	@ObfuscatedName("fh")
	@Export("onSubChange")
	public Object[] onSubChange;
	@ObfuscatedName("fv")
	@Export("onResize")
	public Object[] onResize;
	@ObfuscatedName("ff")
	@Export("onStockTransmit")
	public Object[] onStockTransmit;
	@ObfuscatedName("fz")
	public Object[] field3520;
	@ObfuscatedName("fl")
	public Object[] field3460;
	@ObfuscatedName("fq")
	@Export("cs1Instructions")
	public int[][] cs1Instructions;
	@ObfuscatedName("fo")
	@Export("cs1Comparisons")
	public int[] cs1Comparisons;
	@ObfuscatedName("fn")
	@Export("cs1ComparisonValues")
	public int[] cs1ComparisonValues;
	@ObfuscatedName("ft")
	@ObfuscatedGetter(
		intValue = -1959307231
	)
	@Export("mouseOverRedirect")
	public int mouseOverRedirect;
	@ObfuscatedName("fi")
	@Export("spellName")
	public String spellName;
	@ObfuscatedName("fx")
	@Export("buttonText")
	public String buttonText;
	@ObfuscatedName("fe")
	@Export("itemIds")
	public int[] itemIds;
	@ObfuscatedName("fb")
	@Export("itemQuantities")
	public int[] itemQuantities;
	@ObfuscatedName("fr")
	@ObfuscatedGetter(
		intValue = -756375481
	)
	@Export("itemId")
	public int itemId;
	@ObfuscatedName("fu")
	@ObfuscatedGetter(
		intValue = -572001819
	)
	@Export("itemQuantity")
	public int itemQuantity;
	@ObfuscatedName("fc")
	@ObfuscatedGetter(
		intValue = 564625883
	)
	@Export("modelFrame")
	public int modelFrame;
	@ObfuscatedName("fj")
	@ObfuscatedGetter(
		intValue = 1825821707
	)
	@Export("modelFrameCycle")
	public int modelFrameCycle;
	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "[Lki;"
	)
	@Export("children")
	public Widget[] children;
	@ObfuscatedName("fk")
	public boolean field3535;
	@ObfuscatedName("fw")
	public boolean field3497;
	@ObfuscatedName("fa")
	@ObfuscatedGetter(
		intValue = -773430937
	)
	public int field3524;
	@ObfuscatedName("gj")
	@ObfuscatedGetter(
		intValue = 1877978217
	)
	public int field3538;
	@ObfuscatedName("ge")
	@ObfuscatedGetter(
		intValue = -486342891
	)
	public int field3539;
	@ObfuscatedName("gv")
	@ObfuscatedGetter(
		intValue = -1612828663
	)
	public int field3540;
	@ObfuscatedName("gp")
	@ObfuscatedGetter(
		intValue = -1878678007
	)
	@Export("rootIndex")
	public int rootIndex;
	@ObfuscatedName("gk")
	@ObfuscatedGetter(
		intValue = -2036768027
	)
	@Export("cycle")
	public int cycle;
	@ObfuscatedName("gy")
	public int[] field3527;
	@ObfuscatedName("gl")
	@Export("noClickThrough")
	public boolean noClickThrough;
	@ObfuscatedName("gi")
	@Export("noScrollThrough")
	public boolean noScrollThrough;
	@ObfuscatedName("gq")
	@Export("prioritizeMenuEntry")
	public boolean prioritizeMenuEntry;

	static {
		Widget_cachedSprites = new EvictingDualNodeHashTable(200);
		Widget_cachedModels = new EvictingDualNodeHashTable(50);
		Widget_cachedFonts = new EvictingDualNodeHashTable(20);
		Widget_cachedSpriteMasks = new EvictingDualNodeHashTable(8);
		field3390 = new class362(10, class360.field4274);
		field3378 = new class362(10, class360.field4274);
		field3407 = false;
	}

	public Widget() {
		this.isIf3 = false;
		this.id = -1;
		this.childIndex = -1;
		this.buttonType = 0;
		this.contentType = 0;
		this.xAlignment = 0;
		this.yAlignment = 0;
		this.widthAlignment = 0;
		this.heightAlignment = 0;
		this.rawX = 0;
		this.rawY = 0;
		this.rawWidth = 0;
		this.rawHeight = 0;
		this.x = 0;
		this.y = 0;
		this.width = 0;
		this.height = 0;
		this.field3411 = 1;
		this.field3494 = 1;
		this.parentId = -1;
		this.isHidden = false;
		this.scrollX = 0;
		this.scrollY = 0;
		this.scrollWidth = 0;
		this.scrollHeight = 0;
		this.color = 0;
		this.color2 = 0;
		this.mouseOverColor = 0;
		this.mouseOverColor2 = 0;
		this.fill = false;
		this.fillMode = class450.SOLID;
		this.transparencyTop = 0;
		this.transparencyBot = 0;
		this.lineWid = 1;
		this.field3428 = false;
		this.spriteId2 = -1;
		this.spriteId = -1;
		this.spriteAngle = 0;
		this.spriteTiling = false;
		this.outline = 0;
		this.spriteShadow = 0;
		this.modelType = 1;
		this.modelId = -1;
		this.modelType2 = 1;
		this.modelId2 = -1;
		this.sequenceId = -1;
		this.sequenceId2 = -1;
		this.modelOffsetX = 0;
		this.modelOffsetY = 0;
		this.modelAngleX = 0;
		this.modelAngleY = 0;
		this.modelAngleZ = 0;
		this.modelZoom = 100;
		this.field3406 = 0;
		this.field3451 = 0;
		this.modelOrthog = false;
		this.modelTransparency = false;
		this.itemQuantityMode = 2;
		this.fontId = -1;
		this.text = "";
		this.text2 = "";
		this.textLineHeight = 0;
		this.textXAlignment = 0;
		this.textYAlignment = 0;
		this.textShadowed = false;
		this.paddingX = 0;
		this.paddingY = 0;
		this.field3391 = -1;
		this.flags = 0;
		this.field3473 = false;
		this.dataText = "";
		this.parent = null;
		this.dragZoneSize = 0;
		this.dragThreshold = 0;
		this.isScrollBar = false;
		this.spellActionName = "";
		this.hasListener = false;
		this.mouseOverRedirect = -1;
		this.spellName = "";
		this.buttonText = "Ok";
		this.itemId = -1;
		this.itemQuantity = 0;
		this.modelFrame = 0;
		this.modelFrameCycle = 0;
		this.field3535 = false;
		this.field3497 = false;
		this.field3524 = -1;
		this.field3538 = 0;
		this.field3539 = 0;
		this.field3540 = 0;
		this.rootIndex = -1;
		this.cycle = -1;
		this.noClickThrough = false;
		this.noScrollThrough = false;
		this.prioritizeMenuEntry = false;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)V",
		garbageValue = "-1773202641"
	)
	@Export("decodeLegacy")
	void decodeLegacy(Buffer var1) {
		this.isIf3 = false;
		this.type = var1.readUnsignedByte();
		this.buttonType = var1.readUnsignedByte();
		this.contentType = var1.readUnsignedShort();
		this.rawX = var1.readShort();
		this.rawY = var1.readShort();
		this.rawWidth = var1.readUnsignedShort();
		this.rawHeight = var1.readUnsignedShort();
		this.transparencyTop = var1.readUnsignedByte();
		this.parentId = var1.readUnsignedShort();
		if (this.parentId == 65535) {
			this.parentId = -1;
		} else {
			this.parentId += this.id & -65536;
		}

		this.mouseOverRedirect = var1.readUnsignedShort();
		if (this.mouseOverRedirect == 65535) {
			this.mouseOverRedirect = -1;
		}

		int var2 = var1.readUnsignedByte();
		int var3;
		if (var2 > 0) {
			this.cs1Comparisons = new int[var2];
			this.cs1ComparisonValues = new int[var2];

			for (var3 = 0; var3 < var2; ++var3) {
				this.cs1Comparisons[var3] = var1.readUnsignedByte();
				this.cs1ComparisonValues[var3] = var1.readUnsignedShort();
			}
		}

		var3 = var1.readUnsignedByte();
		int var4;
		int var5;
		int var6;
		if (var3 > 0) {
			this.cs1Instructions = new int[var3][];

			for (var4 = 0; var4 < var3; ++var4) {
				var5 = var1.readUnsignedShort();
				this.cs1Instructions[var4] = new int[var5];

				for (var6 = 0; var6 < var5; ++var6) {
					this.cs1Instructions[var4][var6] = var1.readUnsignedShort();
					if (this.cs1Instructions[var4][var6] == 65535) {
						this.cs1Instructions[var4][var6] = -1;
					}
				}
			}
		}

		if (this.type == 0) {
			this.scrollHeight = var1.readUnsignedShort();
			this.isHidden = var1.readUnsignedByte() == 1;
		}

		if (this.type == 1) {
			var1.readUnsignedShort();
			var1.readUnsignedByte();
		}

		if (this.type == 2) {
			this.itemIds = new int[this.rawWidth * this.rawHeight];
			this.itemQuantities = new int[this.rawWidth * this.rawHeight];
			var4 = var1.readUnsignedByte();
			if (var4 == 1) {
				this.flags |= 268435456;
			}

			var5 = var1.readUnsignedByte();
			if (var5 == 1) {
				this.flags |= 1073741824;
			}

			var6 = var1.readUnsignedByte();
			if (var6 == 1) {
				this.flags |= Integer.MIN_VALUE;
			}

			int var7 = var1.readUnsignedByte();
			if (var7 == 1) {
				this.flags |= 536870912;
			}

			this.paddingX = var1.readUnsignedByte();
			this.paddingY = var1.readUnsignedByte();
			this.inventoryXOffsets = new int[20];
			this.inventoryYOffsets = new int[20];
			this.inventorySprites = new int[20];

			int var8;
			for (var8 = 0; var8 < 20; ++var8) {
				int var11 = var1.readUnsignedByte();
				if (var11 == 1) {
					this.inventoryXOffsets[var8] = var1.readShort();
					this.inventoryYOffsets[var8] = var1.readShort();
					this.inventorySprites[var8] = var1.readInt();
				} else {
					this.inventorySprites[var8] = -1;
				}
			}

			this.itemActions = new String[5];

			for (var8 = 0; var8 < 5; ++var8) {
				String var9 = var1.readStringCp1252NullTerminated();
				if (var9.length() > 0) {
					this.itemActions[var8] = var9;
					this.flags |= 1 << var8 + 23;
				}
			}
		}

		if (this.type == 3) {
			this.fill = var1.readUnsignedByte() == 1;
		}

		if (this.type == 4 || this.type == 1) {
			this.textXAlignment = var1.readUnsignedByte();
			this.textYAlignment = var1.readUnsignedByte();
			this.textLineHeight = var1.readUnsignedByte();
			this.fontId = var1.readUnsignedShort();
			if (this.fontId == 65535) {
				this.fontId = -1;
			}

			this.textShadowed = var1.readUnsignedByte() == 1;
		}

		if (this.type == 4) {
			this.text = var1.readStringCp1252NullTerminated();
			this.text2 = var1.readStringCp1252NullTerminated();
		}

		if (this.type == 1 || this.type == 3 || this.type == 4) {
			this.color = var1.readInt();
		}

		if (this.type == 3 || this.type == 4) {
			this.color2 = var1.readInt();
			this.mouseOverColor = var1.readInt();
			this.mouseOverColor2 = var1.readInt();
		}

		if (this.type == 5) {
			this.spriteId2 = var1.readInt();
			this.spriteId = var1.readInt();
		}

		if (this.type == 6) {
			this.modelType = 1;
			this.modelId = var1.readUnsignedShort();
			if (this.modelId == 65535) {
				this.modelId = -1;
			}

			this.modelType2 = 1;
			this.modelId2 = var1.readUnsignedShort();
			if (this.modelId2 == 65535) {
				this.modelId2 = -1;
			}

			this.sequenceId = var1.readUnsignedShort();
			if (this.sequenceId == 65535) {
				this.sequenceId = -1;
			}

			this.sequenceId2 = var1.readUnsignedShort();
			if (this.sequenceId2 == 65535) {
				this.sequenceId2 = -1;
			}

			this.modelZoom = var1.readUnsignedShort();
			this.modelAngleX = var1.readUnsignedShort();
			this.modelAngleY = var1.readUnsignedShort();
		}

		if (this.type == 7) {
			this.itemIds = new int[this.rawHeight * this.rawWidth];
			this.itemQuantities = new int[this.rawWidth * this.rawHeight];
			this.textXAlignment = var1.readUnsignedByte();
			this.fontId = var1.readUnsignedShort();
			if (this.fontId == 65535) {
				this.fontId = -1;
			}

			this.textShadowed = var1.readUnsignedByte() == 1;
			this.color = var1.readInt();
			this.paddingX = var1.readShort();
			this.paddingY = var1.readShort();
			var4 = var1.readUnsignedByte();
			if (var4 == 1) {
				this.flags |= 1073741824;
			}

			this.itemActions = new String[5];

			for (var5 = 0; var5 < 5; ++var5) {
				String var10 = var1.readStringCp1252NullTerminated();
				if (var10.length() > 0) {
					this.itemActions[var5] = var10;
					this.flags |= 1 << var5 + 23;
				}
			}
		}

		if (this.type == 8) {
			this.text = var1.readStringCp1252NullTerminated();
		}

		if (this.buttonType == 2 || this.type == 2) {
			this.spellActionName = var1.readStringCp1252NullTerminated();
			this.spellName = var1.readStringCp1252NullTerminated();
			var4 = var1.readUnsignedShort() & 63;
			this.flags |= var4 << 11;
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5 || this.buttonType == 6) {
			this.buttonText = var1.readStringCp1252NullTerminated();
			if (this.buttonText.length() == 0) {
				if (this.buttonType == 1) {
					this.buttonText = "Ok";
				}

				if (this.buttonType == 4) {
					this.buttonText = "Select";
				}

				if (this.buttonType == 5) {
					this.buttonText = "Select";
				}

				if (this.buttonType == 6) {
					this.buttonText = "Continue";
				}
			}
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5) {
			this.flags |= 4194304;
		}

		if (this.buttonType == 6) {
			this.flags |= 1;
		}

	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)V",
		garbageValue = "-659209979"
	)
	@Export("decode")
	void decode(Buffer var1) {
		var1.readUnsignedByte();
		this.isIf3 = true;
		this.type = var1.readUnsignedByte();
		this.contentType = var1.readUnsignedShort();
		this.rawX = var1.readShort();
		this.rawY = var1.readShort();
		this.rawWidth = var1.readUnsignedShort();
		if (this.type == 9) {
			this.rawHeight = var1.readShort();
		} else {
			this.rawHeight = var1.readUnsignedShort();
		}

		this.widthAlignment = var1.readByte();
		this.heightAlignment = var1.readByte();
		this.xAlignment = var1.readByte();
		this.yAlignment = var1.readByte();
		this.parentId = var1.readUnsignedShort();
		if (this.parentId == 65535) {
			this.parentId = -1;
		} else {
			this.parentId += this.id & -65536;
		}

		this.isHidden = var1.readUnsignedByte() == 1;
		if (this.type == 0) {
			this.scrollWidth = var1.readUnsignedShort();
			this.scrollHeight = var1.readUnsignedShort();
			this.noClickThrough = var1.readUnsignedByte() == 1;
		}

		if (this.type == 5) {
			this.spriteId2 = var1.readInt();
			this.spriteAngle = var1.readUnsignedShort();
			this.spriteTiling = var1.readUnsignedByte() == 1;
			this.transparencyTop = var1.readUnsignedByte();
			this.outline = var1.readUnsignedByte();
			this.spriteShadow = var1.readInt();
			this.spriteFlipV = var1.readUnsignedByte() == 1;
			this.spriteFlipH = var1.readUnsignedByte() == 1;
		}

		if (this.type == 6) {
			this.modelType = 1;
			this.modelId = var1.readUnsignedShort();
			if (this.modelId == 65535) {
				this.modelId = -1;
			}

			this.modelOffsetX = var1.readShort();
			this.modelOffsetY = var1.readShort();
			this.modelAngleX = var1.readUnsignedShort();
			this.modelAngleY = var1.readUnsignedShort();
			this.modelAngleZ = var1.readUnsignedShort();
			this.modelZoom = var1.readUnsignedShort();
			this.sequenceId = var1.readUnsignedShort();
			if (this.sequenceId == 65535) {
				this.sequenceId = -1;
			}

			this.modelOrthog = var1.readUnsignedByte() == 1;
			var1.readUnsignedShort();
			if (this.widthAlignment != 0) {
				this.field3406 = var1.readUnsignedShort();
			}

			if (this.heightAlignment != 0) {
				var1.readUnsignedShort();
			}
		}

		if (this.type == 4) {
			this.fontId = var1.readUnsignedShort();
			if (this.fontId == 65535) {
				this.fontId = -1;
			}

			this.text = var1.readStringCp1252NullTerminated();
			this.textLineHeight = var1.readUnsignedByte();
			this.textXAlignment = var1.readUnsignedByte();
			this.textYAlignment = var1.readUnsignedByte();
			this.textShadowed = var1.readUnsignedByte() == 1;
			this.color = var1.readInt();
		}

		if (this.type == 3) {
			this.color = var1.readInt();
			this.fill = var1.readUnsignedByte() == 1;
			this.transparencyTop = var1.readUnsignedByte();
		}

		if (this.type == 9) {
			this.lineWid = var1.readUnsignedByte();
			this.color = var1.readInt();
			this.field3428 = var1.readUnsignedByte() == 1;
		}

		this.flags = var1.readMedium();
		this.dataText = var1.readStringCp1252NullTerminated();
		int var2 = var1.readUnsignedByte();
		if (var2 > 0) {
			this.actions = new String[var2];

			for (int var3 = 0; var3 < var2; ++var3) {
				this.actions[var3] = var1.readStringCp1252NullTerminated();
			}
		}

		this.dragZoneSize = var1.readUnsignedByte();
		this.dragThreshold = var1.readUnsignedByte();
		this.isScrollBar = var1.readUnsignedByte() == 1;
		this.spellActionName = var1.readStringCp1252NullTerminated();
		this.onLoad = this.readListener(var1);
		this.onMouseOver = this.readListener(var1);
		this.onMouseLeave = this.readListener(var1);
		this.onTargetLeave = this.readListener(var1);
		this.onTargetEnter = this.readListener(var1);
		this.onVarTransmit = this.readListener(var1);
		this.onInvTransmit = this.readListener(var1);
		this.onStatTransmit = this.readListener(var1);
		this.onTimer = this.readListener(var1);
		this.onOp = this.readListener(var1);
		this.onMouseRepeat = this.readListener(var1);
		this.onClick = this.readListener(var1);
		this.onClickRepeat = this.readListener(var1);
		this.onRelease = this.readListener(var1);
		this.onHold = this.readListener(var1);
		this.onDrag = this.readListener(var1);
		this.onDragComplete = this.readListener(var1);
		this.onScroll = this.readListener(var1);
		this.varTransmitTriggers = this.readListenerTriggers(var1);
		this.invTransmitTriggers = this.readListenerTriggers(var1);
		this.statTransmitTriggers = this.readListenerTriggers(var1);
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)[Ljava/lang/Object;",
		garbageValue = "1297123633"
	)
	@Export("readListener")
	Object[] readListener(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if (var2 == 0) {
			return null;
		} else {
			Object[] var3 = new Object[var2];

			for (int var4 = 0; var4 < var2; ++var4) {
				int var5 = var1.readUnsignedByte();
				if (var5 == 0) {
					var3[var4] = new Integer(var1.readInt());
				} else if (var5 == 1) {
					var3[var4] = var1.readStringCp1252NullTerminated();
				}
			}

			this.hasListener = true;
			return var3;
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lpx;S)[I",
		garbageValue = "-14146"
	)
	@Export("readListenerTriggers")
	int[] readListenerTriggers(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if (var2 == 0) {
			return null;
		} else {
			int[] var3 = new int[var2];

			for (int var4 = 0; var4 < var2; ++var4) {
				var3[var4] = var1.readInt();
			}

			return var3;
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "986584305"
	)
	@Export("swapItems")
	public void swapItems(int var1, int var2) {
		int var3 = this.itemIds[var2];
		this.itemIds[var2] = this.itemIds[var1];
		this.itemIds[var1] = var3;
		var3 = this.itemQuantities[var2];
		this.itemQuantities[var2] = this.itemQuantities[var1];
		this.itemQuantities[var1] = var3;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(ZLce;I)Lqr;",
		garbageValue = "1939454695"
	)
	public SpritePixels method5456(boolean var1, UrlRequester var2) {
		field3407 = false;
		if (this.field3431 != null) {
			SpritePixels var3 = this.method5546(var2);
			if (var3 != null) {
				return var3;
			}
		}

		int var7;
		if (var1) {
			var7 = this.spriteId;
		} else {
			var7 = this.spriteId2;
		}

		if (var7 == -1) {
			return null;
		} else {
			long var4 = ((long)this.spriteShadow << 40) + ((this.spriteFlipH ? 1L : 0L) << 39) + (long)var7 + ((long)this.outline << 36) + ((this.spriteFlipV ? 1L : 0L) << 38);
			SpritePixels var6 = (SpritePixels)Widget_cachedSprites.get(var4);
			if (var6 != null) {
				return var6;
			} else {
				var6 = StructComposition.SpriteBuffer_getSprite(WorldMapCacheName.Widget_spritesArchive, var7, 0);
				if (var6 == null) {
					field3407 = true;
					return null;
				} else {
					this.method5442(var6);
					Widget_cachedSprites.put(var6, var4);
					return var6;
				}
			}
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lce;I)Lqr;",
		garbageValue = "-503493635"
	)
	SpritePixels method5546(UrlRequester var1) {
		if (!this.method5499()) {
			return this.method5519(var1);
		} else {
			String var2 = this.field3431 + (this.spriteFlipV ? 1 : 0) + (this.spriteFlipH ? 1 : 0) + this.outline + this.spriteShadow;
			SpritePixels var3 = (SpritePixels)field3378.method6413(var2);
			if (var3 == null) {
				SpritePixels var4 = this.method5519(var1);
				if (var4 != null) {
					var3 = var4.method8001();
					this.method5442(var3);
					field3378.method6402(var2, var3);
				}
			}

			return var3;
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lce;I)Lqr;",
		garbageValue = "1002412597"
	)
	SpritePixels method5519(UrlRequester var1) {
		if (this.field3431 != null && var1 != null) {
			class291 var2 = (class291)field3390.method6413(this.field3431);
			if (var2 == null) {
				var2 = new class291(this.field3431, var1);
				field3390.method6402(this.field3431, var2);
			}

			return var2.method5391();
		} else {
			return null;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "205888634"
	)
	boolean method5499() {
		return this.spriteFlipV || this.spriteFlipH || this.outline != 0 || this.spriteShadow != 0;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lqr;B)V",
		garbageValue = "-110"
	)
	void method5442(SpritePixels var1) {
		if (this.spriteFlipV) {
			var1.flipVertically();
		}

		if (this.spriteFlipH) {
			var1.flipHorizontally();
		}

		if (this.outline > 0) {
			var1.pad(this.outline);
		}

		if (this.outline >= 1) {
			var1.outline(1);
		}

		if (this.outline >= 2) {
			var1.outline(16777215);
		}

		if (this.spriteShadow != 0) {
			var1.shadow(this.spriteShadow);
		}

	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)Lmx;",
		garbageValue = "797268567"
	)
	@Export("getFont")
	public Font getFont() {
		field3407 = false;
		if (this.fontId == -1) {
			return null;
		} else {
			Font var1 = (Font)Widget_cachedFonts.get((long)this.fontId);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class387.method6781(WorldMapCacheName.Widget_spritesArchive, class93.Widget_fontsArchive, this.fontId, 0);
				if (var1 != null) {
					Widget_cachedFonts.put(var1, (long)this.fontId);
				} else {
					field3407 = true;
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)Lqr;",
		garbageValue = "122047479"
	)
	@Export("getInventorySprite")
	public SpritePixels getInventorySprite(int var1) {
		field3407 = false;
		if (var1 >= 0 && var1 < this.inventorySprites.length) {
			int var2 = this.inventorySprites[var1];
			if (var2 == -1) {
				return null;
			} else {
				SpritePixels var3 = (SpritePixels)Widget_cachedSprites.get((long)var2);
				if (var3 != null) {
					return var3;
				} else {
					var3 = StructComposition.SpriteBuffer_getSprite(WorldMapCacheName.Widget_spritesArchive, var2, 0);
					if (var3 != null) {
						Widget_cachedSprites.put(var3, (long)var2);
					} else {
						field3407 = true;
					}

					return var3;
				}
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lgq;IZLkp;I)Lhv;",
		garbageValue = "-1604059191"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, boolean var3, PlayerComposition var4) {
		field3407 = false;
		int var5;
		int var6;
		if (var3) {
			var5 = this.modelType2;
			var6 = this.modelId2;
		} else {
			var5 = this.modelType;
			var6 = this.modelId;
		}

		if (var5 == 0) {
			return null;
		} else if (var5 == 1 && var6 == -1) {
			return null;
		} else {
			Model var7 = (Model)Widget_cachedModels.get((long)(var6 + (var5 << 16)));
			if (var7 == null) {
				ModelData var8;
				if (var5 == 1) {
					var8 = ModelData.ModelData_get(class162.Widget_modelsArchive, var6, 0);
					if (var8 == null) {
						field3407 = true;
						return null;
					}

					var7 = var8.toModel(64, 768, -50, -10, -50);
				}

				if (var5 == 2) {
					var8 = WorldMapSectionType.getNpcDefinition(var6).getModelData();
					if (var8 == null) {
						field3407 = true;
						return null;
					}

					var7 = var8.toModel(64, 768, -50, -10, -50);
				}

				if (var5 == 3) {
					if (var4 == null) {
						return null;
					}

					var8 = var4.getModelData();
					if (var8 == null) {
						field3407 = true;
						return null;
					}

					var7 = var8.toModel(64, 768, -50, -10, -50);
				}

				if (var5 == 4) {
					ItemComposition var9 = FileSystem.ItemDefinition_get(var6);
					var8 = var9.getModelData(10);
					if (var8 == null) {
						field3407 = true;
						return null;
					}

					var7 = var8.toModel(var9.ambient + 64, var9.contrast + 768, -50, -10, -50);
				}

				Widget_cachedModels.put(var7, (long)(var6 + (var5 << 16)));
			}

			if (var1 != null) {
				var7 = var1.transformWidgetModel(var7, var2);
			}

			return var7;
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lka;",
		garbageValue = "1947856981"
	)
	@Export("getSpriteMask")
	public SpriteMask getSpriteMask(boolean var1) {
		if (this.spriteId == -1) {
			var1 = false;
		}

		int var2 = var1 ? this.spriteId : this.spriteId2;
		if (var2 == -1) {
			return null;
		} else {
			long var3 = ((this.spriteFlipH ? 1L : 0L) << 39) + ((long)this.outline << 36) + (long)var2 + ((this.spriteFlipV ? 1L : 0L) << 38) + ((long)this.spriteShadow << 40);
			SpriteMask var5 = (SpriteMask)Widget_cachedSpriteMasks.get(var3);
			if (var5 != null) {
				return var5;
			} else {
				SpritePixels var6 = this.method5456(var1, (UrlRequester)null);
				if (var6 == null) {
					return null;
				} else {
					SpritePixels var7 = var6.copyNormalized();
					int[] var8 = new int[var7.subHeight];
					int[] var9 = new int[var7.subHeight];

					for (int var10 = 0; var10 < var7.subHeight; ++var10) {
						int var11 = 0;
						int var12 = var7.subWidth;

						int var13;
						for (var13 = 0; var13 < var7.subWidth; ++var13) {
							if (var7.pixels[var13 + var10 * var7.subWidth] == 0) {
								var11 = var13;
								break;
							}
						}

						for (var13 = var7.subWidth - 1; var13 >= var11; --var13) {
							if (var7.pixels[var13 + var10 * var7.subWidth] == 0) {
								var12 = var13 + 1;
								break;
							}
						}

						var8[var10] = var11;
						var9[var10] = var12 - var11;
					}

					var5 = new SpriteMask(var7.subWidth, var7.subHeight, var9, var8, var2);
					Widget_cachedSpriteMasks.put(var5, var3);
					return var5;
				}
			}
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "-39"
	)
	@Export("setAction")
	public void setAction(int var1, String var2) {
		if (this.actions == null || this.actions.length <= var1) {
			String[] var3 = new String[var1 + 1];
			if (this.actions != null) {
				for (int var4 = 0; var4 < this.actions.length; ++var4) {
					var3[var4] = this.actions[var4];
				}
			}

			this.actions = var3;
		}

		this.actions[var1] = var2;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1684340581"
	)
	public boolean method5448() {
		return !this.isIf3 || this.type == 0 || this.type == 11 || this.hasListener || this.contentType == 1338;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lce;J)V"
	)
	public void method5449(String var1, UrlRequester var2, long var3) {
		if (this.type == 11 && -1L != var3) {
			var1 = var1.replaceAll("%userid%", Long.toString(var3));
			this.field3408 = new class155();
			if (!this.field3408.method3085(var1, var2)) {
				this.field3408 = null;
			} else {
				if (this.field3470 == null || this.field3471 == null) {
					this.method5450();
				}

			}
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1904926209"
	)
	void method5450() {
		this.field3470 = new HashMap();
		this.field3471 = new HashMap();
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-118212999"
	)
	public void method5451(int var1, int var2) {
		if (this.type == 11) {
			if (this.field3470 == null) {
				this.method5450();
			}

			this.field3470.put(var1, var2);
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "-2090155850"
	)
	public void method5468(String var1, int var2) {
		if (this.type == 11) {
			if (this.field3471 == null) {
				this.method5450();
			}

			this.field3471.put(var1, var2);
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Z",
		garbageValue = "-1974836941"
	)
	public boolean method5474(int var1, int var2, int var3, int var4) {
		if (this.type == 11 && this.field3408 != null && this.method5498()) {
			var1 -= var3;
			var2 -= var4;
			int var5 = (int)(this.field3408.method3071()[0] * (float)this.width);
			int var6 = (int)(this.field3408.method3071()[1] * (float)this.height);
			int var7 = var5 + (int)(this.field3408.method3071()[2] * (float)this.width);
			int var8 = var6 + (int)(this.field3408.method3071()[3] * (float)this.height);
			return var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8;
		} else {
			return false;
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1289380657"
	)
	public boolean method5498() {
		return this.field3391 == 2;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-2103754718"
	)
	public int method5455(String var1) {
		return this.type == 11 && this.field3408 != null && this.method5498() ? this.field3408.method3066(var1) : -1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-386169422"
	)
	public String method5523(String var1) {
		return this.type == 11 && this.field3408 != null && this.method5498() ? this.field3408.method3097(var1) : null;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1984681933"
	)
	public int method5457() {
		return this.field3471 != null && this.field3471.size() > 0 ? 1 : 0;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "126"
	)
	public int method5458() {
		if (this.type == 11 && this.field3408 != null && this.field3471 != null && !this.field3471.isEmpty()) {
			String var1 = this.field3408.method3075();
			return var1 != null && this.field3471.containsKey(this.field3408.method3075()) ? (Integer)this.field3471.get(var1) : -1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-24"
	)
	public String method5480() {
		if (this.type == 11 && this.field3408 != null) {
			String var1 = this.field3408.method3075();
			Iterator var2 = this.field3408.method3072().iterator();

			while (var2.hasNext()) {
				class166 var3 = (class166)var2.next();
				String var4 = String.format("%%%S%%", var3.method3226());
				if (var3.vmethod3227() == 0) {
					var1.replaceAll(var4, Integer.toString(var3.vmethod3228()));
				} else {
					var1.replaceAll(var4, var3.vmethod3238());
				}
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-216583671"
	)
	public int[] method5460() {
		if (this.type == 11 && this.field3408 != null) {
			int[] var1 = new int[3];
			int var2 = 0;
			Iterator var3 = this.field3408.method3072().iterator();

			while (var3.hasNext()) {
				class166 var4 = (class166)var3.next();
				if (!var4.method3226().equals("user_id")) {
					if (var4.vmethod3227() != 0) {
						return null;
					}

					var1[var2++] = var4.vmethod3228();
					if (var2 > 3) {
						return null;
					}
				}
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lce;I)Z",
		garbageValue = "1243855497"
	)
	public boolean method5517(UrlRequester var1) {
		if (this.type == 11 && this.field3408 != null) {
			this.field3408.method3064(var1);
			if (this.field3408.method3067() != this.field3391) {
				this.field3391 = this.field3408.method3067();
				if (this.field3391 >= 100) {
					return true;
				}

				if (this.field3391 == 2) {
					this.method5462();
					return true;
				}
			}

			return false;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "7"
	)
	void method5462() {
		this.noClickThrough = true;
		ArrayList var1 = this.field3408.method3110();
		ArrayList var2 = this.field3408.method3069();
		int var3 = var1.size() + var2.size();
		this.children = new Widget[var3];
		int var4 = 0;

		Iterator var5;
		Widget var7;
		for (var5 = var1.iterator(); var5.hasNext(); this.children[var4++] = var7) {
			class160 var6 = (class160)var5.next();
			var7 = class273.method5077(5, this, var4, 0, 0, 0, 0, var6.field1782);
			var7.field3431 = var6.field1783.method2556();
			class291 var8 = new class291(var6.field1783);
			field3390.method6402(var7.field3431, var8);
		}

		for (var5 = var2.iterator(); var5.hasNext(); this.children[var4++] = var7) {
			class162 var9 = (class162)var5.next();
			var7 = class273.method5077(4, this, var4, 0, 0, 0, 0, var9.field1804);
			var7.text = var9.field1803;
			var7.fontId = (Integer)this.field3470.get(var9.field1807);
			var7.textXAlignment = var9.field1811;
			var7.textYAlignment = var9.field1806;
		}

	}

	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "543446302"
	)
	@Export("setWindowedMode")
	static void setWindowedMode(int var0) {
		Client.field711 = 0L;
		if (var0 >= 2) {
			Client.isResizable = true;
		} else {
			Client.isResizable = false;
		}

		if (ClanChannelMember.getWindowedMode() == 1) {
			class82.client.setMaxCanvasSize(765, 503);
		} else {
			class82.client.setMaxCanvasSize(7680, 2160);
		}

		if (Client.gameState >= 25) {
			PacketBufferNode var1 = DecorativeObject.getPacketBufferNode(ClientPacket.field3054, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(ClanChannelMember.getWindowedMode());
			var1.packetBuffer.writeShort(GraphicsObject.canvasWidth);
			var1.packetBuffer.writeShort(class433.canvasHeight);
			Client.packetWriter.addNode(var1);
		}

	}
}
