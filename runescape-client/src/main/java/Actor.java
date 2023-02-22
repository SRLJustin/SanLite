import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cb")
@Implements("Actor")
public abstract class Actor extends Renderable {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 447826103
	)
	@Export("x")
	int x;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 577677539
	)
	@Export("y")
	int y;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1112494515
	)
	@Export("rotation")
	int rotation;
	@ObfuscatedName("at")
	@Export("isWalking")
	boolean isWalking;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 964602217
	)
	int field1163;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1177407539
	)
	@Export("playerCycle")
	int playerCycle;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -684272439
	)
	@Export("idleSequence")
	int idleSequence;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 364693837
	)
	@Export("turnLeftSequence")
	int turnLeftSequence;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -2121418653
	)
	@Export("turnRightSequence")
	int turnRightSequence;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -821590745
	)
	@Export("walkSequence")
	int walkSequence;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -2055230049
	)
	@Export("walkBackSequence")
	int walkBackSequence;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 322703555
	)
	@Export("walkLeftSequence")
	int walkLeftSequence;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1845507611
	)
	@Export("walkRightSequence")
	int walkRightSequence;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1210399593
	)
	@Export("runSequence")
	int runSequence;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1980220607
	)
	int field1173;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1031937609
	)
	int field1174;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -353043483
	)
	int field1168;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1601746545
	)
	int field1187;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1142020731
	)
	int field1172;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1733044813
	)
	int field1178;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1475862297
	)
	int field1179;
	@ObfuscatedName("ao")
	@Export("overheadText")
	String overheadText;
	@ObfuscatedName("bj")
	boolean field1181;
	@ObfuscatedName("bf")
	boolean field1166;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 243955711
	)
	@Export("overheadTextCyclesRemaining")
	int overheadTextCyclesRemaining;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -1702079151
	)
	int field1161;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -891902263
	)
	int field1185;
	@ObfuscatedName("bo")
	@Export("hitSplatCount")
	byte hitSplatCount;
	@ObfuscatedName("bl")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("bq")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("bn")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("bi")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("bw")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 114853969
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("bg")
	@Export("false0")
	boolean false0;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -1500523149
	)
	int field1195;
	@ObfuscatedName("bk")
	boolean field1196;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 1289012151
	)
	@Export("movementSequence")
	int movementSequence;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 257231537
	)
	@Export("movementFrame")
	int movementFrame;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -1561816145
	)
	@Export("movementFrameCycle")
	int movementFrameCycle;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 1894422995
	)
	int field1200;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -1519553247
	)
	@Export("sequence")
	int sequence;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -1643445407
	)
	@Export("sequenceFrame")
	int sequenceFrame;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 1407146837
	)
	@Export("sequenceFrameCycle")
	int sequenceFrameCycle;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -210661437
	)
	@Export("sequenceDelay")
	int sequenceDelay;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 1455637611
	)
	int field1205;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 600195653
	)
	@Export("spotAnimation")
	int spotAnimation;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = -1565000231
	)
	@Export("spotAnimationFrame")
	int spotAnimationFrame;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -537658505
	)
	int field1208;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = -1617063017
	)
	int field1207;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = 1928204207
	)
	int field1210;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = 1803600605
	)
	int field1211;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = -1850142185
	)
	int field1212;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -1115543865
	)
	int field1213;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = 1800308381
	)
	int field1214;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 1754022919
	)
	int field1215;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = 61832475
	)
	int field1189;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 1651711399
	)
	int field1217;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = -1125793951
	)
	@Export("npcCycle")
	int npcCycle;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = -2113487019
	)
	@Export("defaultHeight")
	int defaultHeight;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = 675501089
	)
	int field1176;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 1767722343
	)
	int field1221;
	@ObfuscatedName("cv")
	byte field1180;
	@ObfuscatedName("cf")
	byte field1227;
	@ObfuscatedName("cm")
	byte field1224;
	@ObfuscatedName("ce")
	byte field1225;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = 914646583
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = 920630507
	)
	int field1191;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = 1730223223
	)
	int field1228;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -1498527701
	)
	@Export("pathLength")
	int pathLength;
	@ObfuscatedName("cn")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("cw")
	@Export("pathY")
	int[] pathY;
	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "[Lhz;"
	)
	@Export("pathTraversed")
	class208[] pathTraversed;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = -1163077103
	)
	int field1175;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = 343833459
	)
	int field1230;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = -1605021683
	)
	int field1220;

	Actor() {
		this.isWalking = false;
		this.field1163 = 1;
		this.idleSequence = -1;
		this.turnLeftSequence = -1;
		this.turnRightSequence = -1;
		this.walkSequence = -1;
		this.walkBackSequence = -1;
		this.walkLeftSequence = -1;
		this.walkRightSequence = -1;
		this.runSequence = -1;
		this.field1173 = -1;
		this.field1174 = -1;
		this.field1168 = -1;
		this.field1187 = -1;
		this.field1172 = -1;
		this.field1178 = -1;
		this.field1179 = -1;
		this.overheadText = null;
		this.field1166 = false;
		this.overheadTextCyclesRemaining = 100;
		this.field1161 = 0;
		this.field1185 = 0;
		this.hitSplatCount = 0;
		this.hitSplatTypes = new int[4];
		this.hitSplatValues = new int[4];
		this.hitSplatCycles = new int[4];
		this.hitSplatTypes2 = new int[4];
		this.hitSplatValues2 = new int[4];
		this.healthBars = new IterableNodeDeque();
		this.targetIndex = -1;
		this.false0 = false;
		this.field1195 = -1;
		this.movementSequence = -1;
		this.movementFrame = 0;
		this.movementFrameCycle = 0;
		this.field1200 = 0;
		this.sequence = -1;
		this.sequenceFrame = 0;
		this.sequenceFrameCycle = 0;
		this.sequenceDelay = 0;
		this.field1205 = 0;
		this.spotAnimation = -1;
		this.spotAnimationFrame = 0;
		this.field1208 = 0;
		this.npcCycle = 0;
		this.defaultHeight = 200;
		this.field1176 = -1;
		this.field1221 = -1;
		this.field1191 = 0;
		this.field1228 = 32;
		this.pathLength = 0;
		this.pathX = new int[10];
		this.pathY = new int[10];
		this.pathTraversed = new class208[10];
		this.field1175 = 0;
		this.field1230 = 0;
		this.field1220 = -1;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1591490422"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1512245406"
	)
	final void method2423() {
		this.pathLength = 0;
		this.field1230 = 0;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "1738027073"
	)
	@Export("addHitSplat")
	final void addHitSplat(int var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var7 = true;
		boolean var8 = true;

		int var9;
		for (var9 = 0; var9 < 4; ++var9) {
			if (this.hitSplatCycles[var9] > var5) {
				var7 = false;
			} else {
				var8 = false;
			}
		}

		var9 = -1;
		int var10 = -1;
		int var11 = 0;
		if (var1 >= 0) {
			HitSplatDefinition var12 = ChatChannel.method2224(var1);
			var10 = var12.field2145;
			var11 = var12.field2142;
		}

		int var14;
		if (var8) {
			if (var10 == -1) {
				return;
			}

			var9 = 0;
			var14 = 0;
			if (var10 == 0) {
				var14 = this.hitSplatCycles[0];
			} else if (var10 == 1) {
				var14 = this.hitSplatValues[0];
			}

			for (int var13 = 1; var13 < 4; ++var13) {
				if (var10 == 0) {
					if (this.hitSplatCycles[var13] < var14) {
						var9 = var13;
						var14 = this.hitSplatCycles[var13];
					}
				} else if (var10 == 1 && this.hitSplatValues[var13] < var14) {
					var9 = var13;
					var14 = this.hitSplatValues[var13];
				}
			}

			if (var10 == 1 && var14 >= var2) {
				return;
			}
		} else {
			if (var7) {
				this.hitSplatCount = 0;
			}

			for (var14 = 0; var14 < 4; ++var14) {
				byte var15 = this.hitSplatCount;
				this.hitSplatCount = (byte)((this.hitSplatCount + 1) % 4);
				if (this.hitSplatCycles[var15] <= var5) {
					var9 = var15;
					break;
				}
			}
		}

		if (var9 >= 0) {
			this.hitSplatTypes[var9] = var1;
			this.hitSplatValues[var9] = var2;
			this.hitSplatTypes2[var9] = var3;
			this.hitSplatValues2[var9] = var4;
			this.hitSplatCycles[var9] = var5 + var11 + var6;
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "73"
	)
	@Export("addHealthBar")
	final void addHealthBar(int var1, int var2, int var3, int var4, int var5, int var6) {
		HealthBarDefinition var7 = class122.method3028(var1);
		HealthBar var8 = null;
		HealthBar var9 = null;
		int var10 = var7.int2;
		int var11 = 0;

		HealthBar var12;
		for (var12 = (HealthBar)this.healthBars.last(); var12 != null; var12 = (HealthBar)this.healthBars.previous()) {
			++var11;
			if (var12.definition.field1982 == var7.field1982) {
				var12.put(var2 + var4, var5, var6, var3);
				return;
			}

			if (var12.definition.int1 <= var7.int1) {
				var8 = var12;
			}

			if (var12.definition.int2 > var10) {
				var9 = var12;
				var10 = var12.definition.int2;
			}
		}

		if (var9 != null || var11 < 4) {
			var12 = new HealthBar(var7);
			if (var8 == null) {
				this.healthBars.addLast(var12);
			} else {
				IterableNodeDeque.IterableNodeDeque_addBefore(var12, var8);
			}

			var12.put(var2 + var4, var5, var6, var3);
			if (var11 >= 4) {
				var9.remove();
			}

		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-46712861"
	)
	@Export("removeHealthBar")
	final void removeHealthBar(int var1) {
		HealthBarDefinition var2 = class122.method3028(var1);

		for (HealthBar var3 = (HealthBar)this.healthBars.last(); var3 != null; var3 = (HealthBar)this.healthBars.previous()) {
			if (var2 == var3.definition) {
				var3.remove();
				return;
			}
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Lgn;",
		garbageValue = "-712256700"
	)
	@Export("StructDefinition_getStructDefinition")
	public static StructComposition StructDefinition_getStructDefinition(int var0) {
		StructComposition var1 = (StructComposition)StructComposition.StructDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = StructComposition.StructDefinition_archive.takeFile(34, var0);
			var1 = new StructComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			StructComposition.StructDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("kp")
	static final void method2440(double var0) {
		Rasterizer3D.method4414(var0);
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).setBrightness(var0);
		ItemComposition.ItemDefinition_cachedSprites.clear();
		PacketWriter.clientPreferences.method2583(var0);
	}
}
