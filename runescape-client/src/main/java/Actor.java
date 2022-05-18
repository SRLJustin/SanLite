import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cx")
@Implements("Actor")
public abstract class Actor extends Renderable {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 121889507
	)
	@Export("x")
	int x;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 661010269
	)
	@Export("y")
	int y;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1669699483
	)
	@Export("rotation")
	int rotation;
	@ObfuscatedName("az")
	@Export("isWalking")
	boolean isWalking;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1075193415
	)
	int field1167;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1662995403
	)
	@Export("playerCycle")
	int playerCycle;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 277443883
	)
	@Export("idleSequence")
	int idleSequence;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -828957377
	)
	@Export("turnLeftSequence")
	int turnLeftSequence;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 541405107
	)
	@Export("turnRightSequence")
	int turnRightSequence;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 567570905
	)
	@Export("walkSequence")
	int walkSequence;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 181548217
	)
	@Export("walkBackSequence")
	int walkBackSequence;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -268256549
	)
	@Export("walkLeftSequence")
	int walkLeftSequence;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1210183331
	)
	@Export("walkRightSequence")
	int walkRightSequence;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -2015875653
	)
	@Export("runSequence")
	int runSequence;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 688372339
	)
	int field1150;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1227089691
	)
	int field1183;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 659809895
	)
	int field1152;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 850455971
	)
	int field1160;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1260070347
	)
	int field1154;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1833639881
	)
	int field1155;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -417824403
	)
	int field1156;
	@ObfuscatedName("at")
	@Export("overheadText")
	String overheadText;
	@ObfuscatedName("br")
	@Export("isAutoChatting")
	boolean isAutoChatting;
	@ObfuscatedName("ba")
	boolean field1198;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -1230418907
	)
	@Export("overheadTextCyclesRemaining")
	int overheadTextCyclesRemaining;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -2134963039
	)
	@Export("overheadTextColor")
	int overheadTextColor;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 2079520011
	)
	@Export("overheadTextEffect")
	int overheadTextEffect;
	@ObfuscatedName("bl")
	@Export("hitSplatCount")
	byte hitSplatCount;
	@ObfuscatedName("bs")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("bx")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("bd")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("bj")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("be")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 16666525
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("bv")
	@Export("false0")
	boolean false0;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 1468417251
	)
	int field1172;
	@ObfuscatedName("bu")
	boolean field1173;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -87801333
	)
	@Export("movementSequence")
	int movementSequence;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -1659027519
	)
	@Export("movementFrame")
	int movementFrame;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -1628370693
	)
	@Export("movementFrameCycle")
	int movementFrameCycle;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -419918963
	)
	@Export("sequence")
	int sequence;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 647710587
	)
	@Export("sequenceFrame")
	int sequenceFrame;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -1189789481
	)
	@Export("sequenceFrameCycle")
	int sequenceFrameCycle;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 1226146741
	)
	@Export("sequenceDelay")
	int sequenceDelay;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -1495425719
	)
	int field1186;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 556914221
	)
	@Export("spotAnimation")
	int spotAnimation;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = -861517093
	)
	@Export("spotAnimationFrame")
	int spotAnimationFrame;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = 511018915
	)
	@Export("spotAnimationFrameCycle")
	int spotAnimationFrameCycle;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = -539089199
	)
	int field1185;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = 1282068867
	)
	int field1151;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -598436523
	)
	int field1187;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = -1307371871
	)
	int field1188;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = 1779400399
	)
	int field1189;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = 2006327735
	)
	int field1190;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -192434321
	)
	int field1191;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = -41775789
	)
	int field1192;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = -1780782035
	)
	int field1139;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 986187043
	)
	@Export("npcCycle")
	int npcCycle;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 1812690243
	)
	@Export("defaultHeight")
	int defaultHeight;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = -1016685127
	)
	int field1196;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = -1275836225
	)
	int field1197;
	@ObfuscatedName("cf")
	byte field1143;
	@ObfuscatedName("cq")
	byte field1199;
	@ObfuscatedName("cg")
	byte field1153;
	@ObfuscatedName("cl")
	byte field1140;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 1211095435
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = 1602792415
	)
	int field1203;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = 1818380337
	)
	int field1204;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -1724632665
	)
	@Export("pathLength")
	int pathLength;
	@ObfuscatedName("cj")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("cb")
	@Export("pathY")
	int[] pathY;
	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "[Lgd;"
	)
	@Export("pathTraversed")
	class193[] pathTraversed;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = 753559813
	)
	int field1194;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = 1620196957
	)
	int field1200;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = 731891927
	)
	int field1210;

	Actor() {
		this.isWalking = false;
		this.field1167 = 1;
		this.idleSequence = -1;
		this.turnLeftSequence = -1;
		this.turnRightSequence = -1;
		this.walkSequence = -1;
		this.walkBackSequence = -1;
		this.walkLeftSequence = -1;
		this.walkRightSequence = -1;
		this.runSequence = -1;
		this.field1150 = -1;
		this.field1183 = -1;
		this.field1152 = -1;
		this.field1160 = -1;
		this.field1154 = -1;
		this.field1155 = -1;
		this.field1156 = -1;
		this.overheadText = null;
		this.field1198 = false;
		this.overheadTextCyclesRemaining = 100;
		this.overheadTextColor = 0;
		this.overheadTextEffect = 0;
		this.hitSplatCount = 0;
		this.hitSplatTypes = new int[4];
		this.hitSplatValues = new int[4];
		this.hitSplatCycles = new int[4];
		this.hitSplatTypes2 = new int[4];
		this.hitSplatValues2 = new int[4];
		this.healthBars = new IterableNodeDeque();
		this.targetIndex = -1;
		this.false0 = false;
		this.field1172 = -1;
		this.movementSequence = -1;
		this.movementFrame = 0;
		this.movementFrameCycle = 0;
		this.sequence = -1;
		this.sequenceFrame = 0;
		this.sequenceFrameCycle = 0;
		this.sequenceDelay = 0;
		this.field1186 = 0;
		this.spotAnimation = -1;
		this.spotAnimationFrame = 0;
		this.spotAnimationFrameCycle = 0;
		this.npcCycle = 0;
		this.defaultHeight = 200;
		this.field1196 = -1;
		this.field1197 = -1;
		this.field1203 = 0;
		this.field1204 = 32;
		this.pathLength = 0;
		this.pathX = new int[10];
		this.pathY = new int[10];
		this.pathTraversed = new class193[10];
		this.field1194 = 0;
		this.field1200 = 0;
		this.field1210 = -1;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-4"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	final void method2180() {
		this.pathLength = 0;
		this.field1200 = 0;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "1908161271"
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
			HitSplatDefinition var12 = UserComparator4.method2567(var1);
			var10 = var12.field2070;
			var11 = var12.field2071;
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

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-1476814237"
	)
	@Export("addHealthBar")
	final void addHealthBar(int var1, int var2, int var3, int var4, int var5, int var6) {
		HealthBarDefinition var8 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var1);
		HealthBarDefinition var7;
		if (var8 != null) {
			var7 = var8;
		} else {
			byte[] var9 = World.HealthBarDefinition_archive.takeFile(33, var1);
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
			if (var13.definition.field1908 == var8.field1908) {
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

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-3"
	)
	@Export("removeHealthBar")
	final void removeHealthBar(int var1) {
		HealthBarDefinition var3 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var1);
		HealthBarDefinition var2;
		if (var3 != null) {
			var2 = var3;
		} else {
			byte[] var4 = World.HealthBarDefinition_archive.takeFile(33, var1);
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
}
