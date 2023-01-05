import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ct")
@Implements("Actor")
public abstract class Actor extends Renderable {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -389894911
	)
	@Export("x")
	int x;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 65440413
	)
	@Export("y")
	int y;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1214343763
	)
	@Export("rotation")
	int rotation;
	@ObfuscatedName("at")
	@Export("isWalking")
	boolean isWalking;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 670600495
	)
	int field1181;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 627237213
	)
	@Export("playerCycle")
	int playerCycle;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -345007929
	)
	@Export("idleSequence")
	int idleSequence;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 285862749
	)
	@Export("turnLeftSequence")
	int turnLeftSequence;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1599221413
	)
	@Export("turnRightSequence")
	int turnRightSequence;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 498947341
	)
	@Export("walkSequence")
	int walkSequence;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1244346649
	)
	@Export("walkBackSequence")
	int walkBackSequence;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1074551991
	)
	@Export("walkLeftSequence")
	int walkLeftSequence;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 635132903
	)
	@Export("walkRightSequence")
	int walkRightSequence;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 942099641
	)
	@Export("runSequence")
	int runSequence;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1991306379
	)
	int field1191;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1794639095
	)
	int field1201;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -780518925
	)
	int field1193;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1001233629
	)
	int field1194;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1165960723
	)
	int field1195;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1684483195
	)
	int field1226;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 496030663
	)
	int field1197;
	@ObfuscatedName("ac")
	@Export("overheadText")
	String overheadText;
	@ObfuscatedName("bh")
	@Export("isAutoChatting")
	boolean isAutoChatting;
	@ObfuscatedName("be")
	boolean field1187;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 1917412835
	)
	int field1248;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -1708374603
	)
	int field1202;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -1814648137
	)
	int field1229;
	@ObfuscatedName("bp")
	@Export("hitSplatCount")
	byte hitSplatCount;
	@ObfuscatedName("bc")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("bl")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("bv")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("bx")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("bg")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 254868797
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("br")
	@Export("false0")
	boolean false0;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -1743725497
	)
	int field1190;
	@ObfuscatedName("bn")
	boolean field1228;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -23593053
	)
	@Export("movementSequence")
	int movementSequence;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 1618805973
	)
	@Export("movementFrame")
	int movementFrame;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 81322447
	)
	@Export("movementFrameCycle")
	int movementFrameCycle;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 623693747
	)
	int field1218;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 94737613
	)
	@Export("sequence")
	int sequence;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 1723796857
	)
	@Export("sequenceFrame")
	int sequenceFrame;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -1043036109
	)
	@Export("sequenceFrameCycle")
	int sequenceFrameCycle;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -1398805233
	)
	@Export("sequenceDelay")
	int sequenceDelay;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 203372551
	)
	int field1223;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = 385930223
	)
	@Export("spotAnimation")
	int spotAnimation;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 1092439411
	)
	@Export("spotAnimationFrame")
	int spotAnimationFrame;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = -4845983
	)
	int field1214;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = 1151499147
	)
	int field1227;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = 1672871789
	)
	int field1246;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = 1740141433
	)
	int field1196;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 17282343
	)
	int field1230;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 1947883815
	)
	int field1185;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = -749405229
	)
	int field1213;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = -526209475
	)
	int field1233;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = -140925909
	)
	int field1234;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 244421825
	)
	int field1235;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = -5311601
	)
	@Export("npcCycle")
	int npcCycle;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 1571258463
	)
	@Export("defaultHeight")
	int defaultHeight;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = -1291773733
	)
	int field1238;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = -1011438041
	)
	int field1200;
	@ObfuscatedName("ch")
	byte field1240;
	@ObfuscatedName("ce")
	byte field1220;
	@ObfuscatedName("cg")
	byte field1232;
	@ObfuscatedName("ca")
	byte field1243;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = -947520985
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = -306091521
	)
	int field1245;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = -1951063541
	)
	int field1249;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = 472227045
	)
	@Export("pathLength")
	int pathLength;
	@ObfuscatedName("ck")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("ci")
	@Export("pathY")
	int[] pathY;
	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "[Lgs;"
	)
	@Export("pathTraversed")
	class204[] pathTraversed;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		intValue = -346153835
	)
	int field1239;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = 2136239977
	)
	int field1252;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		intValue = 1485827703
	)
	int field1253;

	Actor() {
		this.isWalking = false;
		this.field1181 = 1;
		this.idleSequence = -1;
		this.turnLeftSequence = -1;
		this.turnRightSequence = -1;
		this.walkSequence = -1;
		this.walkBackSequence = -1;
		this.walkLeftSequence = -1;
		this.walkRightSequence = -1;
		this.runSequence = -1;
		this.field1191 = -1;
		this.field1201 = -1;
		this.field1193 = -1;
		this.field1194 = -1;
		this.field1195 = -1;
		this.field1226 = -1;
		this.field1197 = -1;
		this.overheadText = null;
		this.field1187 = false;
		this.field1248 = 100;
		this.field1202 = 0;
		this.field1229 = 0;
		this.hitSplatCount = 0;
		this.hitSplatTypes = new int[4];
		this.hitSplatValues = new int[4];
		this.hitSplatCycles = new int[4];
		this.hitSplatTypes2 = new int[4];
		this.hitSplatValues2 = new int[4];
		this.healthBars = new IterableNodeDeque();
		this.targetIndex = -1;
		this.false0 = false;
		this.field1190 = -1;
		this.movementSequence = -1;
		this.movementFrame = 0;
		this.movementFrameCycle = 0;
		this.field1218 = 0;
		this.sequence = -1;
		this.sequenceFrame = 0;
		this.sequenceFrameCycle = 0;
		this.sequenceDelay = 0;
		this.field1223 = 0;
		this.spotAnimation = -1;
		this.spotAnimationFrame = 0;
		this.field1214 = 0;
		this.npcCycle = 0;
		this.defaultHeight = 200;
		this.field1238 = -1;
		this.field1200 = -1;
		this.field1245 = 0;
		this.field1249 = 32;
		this.pathLength = 0;
		this.pathX = new int[10];
		this.pathY = new int[10];
		this.pathTraversed = new class204[10];
		this.field1239 = 0;
		this.field1252 = 0;
		this.field1253 = -1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-200769249"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "226013540"
	)
	final void method2348() {
		this.pathLength = 0;
		this.field1252 = 0;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-45918745"
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
			HitSplatDefinition var12 = class364.method6987(var1);
			var10 = var12.field2146;
			var11 = var12.field2132;
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "1256732773"
	)
	@Export("addHealthBar")
	final void addHealthBar(int var1, int var2, int var3, int var4, int var5, int var6) {
		HealthBarDefinition var8 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var1);
		HealthBarDefinition var7;
		if (var8 != null) {
			var7 = var8;
		} else {
			byte[] var9 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var1);
			var8 = new HealthBarDefinition();
			if (var9 != null) {
				var8.decode(new Buffer(var9));
			}

			HealthBarDefinition.HealthBarDefinition_cached.put(var8, (long)var1);
			var7 = var8;
		}

		var8 = var7;
		HealthBar var14 = null;
		HealthBar var10 = null;
		int var11 = var7.int2;
		int var12 = 0;

		HealthBar var13;
		for (var13 = (HealthBar)this.healthBars.last(); var13 != null; var13 = (HealthBar)this.healthBars.previous()) {
			++var12;
			if (var13.definition.field1983 == var8.field1983) {
				var13.put(var2 + var4, var5, var6, var3);
				return;
			}

			if (var13.definition.int1 <= var8.int1) {
				var14 = var13;
			}

			if (var13.definition.int2 > var11) {
				var10 = var13;
				var11 = var13.definition.int2;
			}
		}

		if (var10 != null || var12 < 4) {
			var13 = new HealthBar(var8);
			if (var14 == null) {
				this.healthBars.addLast(var13);
			} else {
				IterableNodeDeque.IterableNodeDeque_addBefore(var13, var14);
			}

			var13.put(var2 + var4, var5, var6, var3);
			if (var12 >= 4) {
				var10.remove();
			}

		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	@Export("removeHealthBar")
	final void removeHealthBar(int var1) {
		HealthBarDefinition var3 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var1);
		HealthBarDefinition var2;
		if (var3 != null) {
			var2 = var3;
		} else {
			byte[] var4 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var1);
			var3 = new HealthBarDefinition();
			if (var4 != null) {
				var3.decode(new Buffer(var4));
			}

			HealthBarDefinition.HealthBarDefinition_cached.put(var3, (long)var1);
			var2 = var3;
		}

		var3 = var2;

		for (HealthBar var5 = (HealthBar)this.healthBars.last(); var5 != null; var5 = (HealthBar)this.healthBars.previous()) {
			if (var3 == var5.definition) {
				var5.remove();
				return;
			}
		}

	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1295308947"
	)
	public static int method2362(int var0) {
		return class284.field3329[var0];
	}
}
