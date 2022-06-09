import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cd")
@Implements("NPC")
public final class NPC extends Actor {
	@ObfuscatedName("tu")
	@ObfuscatedGetter(
		intValue = -558114619
	)
	static int field1262;
	@ObfuscatedName("s")
	static byte[][][] field1259;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lcb;"
	)
	@Export("World_request")
	static UrlRequest World_request;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	@Export("definition")
	NPCComposition definition;
	@ObfuscatedName("q")
	String field1258;

	NPC() {
		this.field1258 = "";
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "0"
	)
	void method2338(String var1) {
		this.field1258 = var1 == null ? "" : var1;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Lhv;",
		garbageValue = "-238822980"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.definition == null) {
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? class114.SequenceDefinition_get(super.sequence) : null;
			SequenceDefinition var2 = super.movementSequence != -1 && (super.idleSequence != super.movementSequence || var1 == null) ? class114.SequenceDefinition_get(super.movementSequence) : null;
			Model var3 = this.definition.getModel(var1, super.sequenceFrame, var2, super.movementFrame);
			if (var3 == null) {
				return null;
			} else {
				var3.calculateBoundsCylinder();
				super.defaultHeight = var3.height;
				if (super.spotAnimation != -1 && super.spotAnimationFrame != -1) {
					Model var4 = class136.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame);
					if (var4 != null) {
						var4.offsetBy(0, -super.field1151, 0);
						Model[] var5 = new Model[]{var3, var4};
						var3 = new Model(var5, 2);
					}
				}

				if (this.definition.size == 1) {
					var3.isSingleTile = true;
				}

				if (super.field1140 != 0 && Client.cycle >= super.field1196 && Client.cycle < super.field1197) {
					var3.overrideHue = super.field1143;
					var3.overrideSaturation = super.field1199;
					var3.overrideLuminance = super.field1153;
					var3.overrideAmount = super.field1140;
				} else {
					var3.overrideAmount = 0;
				}

				return var3;
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "922322997"
	)
	final String method2342() {
		if (!this.field1258.isEmpty()) {
			return this.field1258;
		} else {
			NPCComposition var1 = this.definition;
			if (var1.transforms != null) {
				var1 = var1.transform();
				if (var1 == null) {
					var1 = this.definition;
				}
			}

			return var1.name;
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(ILgd;B)V",
		garbageValue = "1"
	)
	final void method2340(int var1, class193 var2) {
		int var3 = super.pathX[0];
		int var4 = super.pathY[0];
		if (var1 == 0) {
			--var3;
			++var4;
		}

		if (var1 == 1) {
			++var4;
		}

		if (var1 == 2) {
			++var3;
			++var4;
		}

		if (var1 == 3) {
			--var3;
		}

		if (var1 == 4) {
			++var3;
		}

		if (var1 == 5) {
			--var3;
			--var4;
		}

		if (var1 == 6) {
			--var4;
		}

		if (var1 == 7) {
			++var3;
			--var4;
		}

		if (super.sequence != -1 && class114.SequenceDefinition_get(super.sequence).field2206 == 1) {
			super.sequence = -1;
		}

		if (super.pathLength < 9) {
			++super.pathLength;
		}

		for (int var5 = super.pathLength; var5 > 0; --var5) {
			super.pathX[var5] = super.pathX[var5 - 1];
			super.pathY[var5] = super.pathY[var5 - 1];
			super.pathTraversed[var5] = super.pathTraversed[var5 - 1];
		}

		super.pathX[0] = var3;
		super.pathY[0] = var4;
		super.pathTraversed[0] = var2;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "83074574"
	)
	final void method2341(int var1, int var2, boolean var3) {
		if (super.sequence != -1 && class114.SequenceDefinition_get(super.sequence).field2206 == 1) {
			super.sequence = -1;
		}

		if (!var3) {
			int var4 = var1 - super.pathX[0];
			int var5 = var2 - super.pathY[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (super.pathLength < 9) {
					++super.pathLength;
				}

				for (int var6 = super.pathLength; var6 > 0; --var6) {
					super.pathX[var6] = super.pathX[var6 - 1];
					super.pathY[var6] = super.pathY[var6 - 1];
					super.pathTraversed[var6] = super.pathTraversed[var6 - 1];
				}

				super.pathX[0] = var1;
				super.pathY[0] = var2;
				super.pathTraversed[0] = class193.field2251;
				return;
			}
		}

		super.pathLength = 0;
		super.field1200 = 0;
		super.field1194 = 0;
		super.pathX[0] = var1;
		super.pathY[0] = var2;
		super.x = super.field1167 * 64 + super.pathX[0] * 128;
		super.y = super.field1167 * 64 + super.pathY[0] * 128;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-4"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.definition != null;
	}
}
