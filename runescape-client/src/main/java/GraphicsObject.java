import java.text.ParseException;
import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bf")
@Implements("GraphicsObject")
public class GraphicsObject extends Renderable {
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 772916355
	)
	@Export("canvasWidth")
	public static int canvasWidth;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1248002899
	)
	@Export("id")
	int id;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1478722299
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 118002909
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 800105373
	)
	@Export("x")
	int x;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -738623243
	)
	@Export("y")
	int y;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1237979949
	)
	@Export("height")
	int height;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lgq;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 657870691
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1465530257
	)
	@Export("frameCycle")
	int frameCycle;
	@ObfuscatedName("v")
	@Export("isFinished")
	boolean isFinished;

	GraphicsObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		this.frame = 0;
		this.frameCycle = 0;
		this.isFinished = false;
		this.id = var1;
		this.plane = var2;
		this.x = var3;
		this.y = var4;
		this.height = var5;
		this.cycleStart = var7 + var6;
		int var8 = class136.SpotAnimationDefinition_get(this.id).sequence;
		if (var8 != -1) {
			this.isFinished = false;
			this.sequenceDefinition = class114.SequenceDefinition_get(var8);
		} else {
			this.isFinished = true;
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "115"
	)
	@Export("advance")
	final void advance(int var1) {
		if (!this.isFinished) {
			this.frameCycle += var1;
			if (!this.sequenceDefinition.method3712()) {
				while (this.frameCycle > this.sequenceDefinition.frameLengths[this.frame]) {
					this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame];
					++this.frame;
					if (this.frame >= this.sequenceDefinition.frameIds.length) {
						this.isFinished = true;
						break;
					}
				}
			} else {
				this.frame += var1;
				if (this.frame >= this.sequenceDefinition.method3729()) {
					this.isFinished = true;
				}
			}

		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Lhv;",
		garbageValue = "-238822980"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = class136.SpotAnimationDefinition_get(this.id);
		Model var2;
		if (!this.isFinished) {
			var2 = var1.getModel(this.frame);
		} else {
			var2 = var1.getModel(-1);
		}

		return var2 == null ? null : var2;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljx;B)V",
		garbageValue = "-3"
	)
	public static void method1870(Huffman var0) {
		class282.huffman = var0;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2116498850"
	)
	static boolean method1867() {
		Date var0;
		try {
			var0 = class115.method2679();
		} catch (ParseException var7) {
			class126.method2799(7);
			class345.setLoginResponseString("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
			return false;
		}

		if (var0 == null) {
			return false;
		} else {
			boolean var5 = class268.method5028(var0);
			java.util.Calendar var4 = java.util.Calendar.getInstance();
			var4.set(2, 0);
			var4.set(5, 1);
			var4.set(1, 1900);
			Date var3 = var4.getTime();
			boolean var2 = var0.after(var3);
			if (!var2) {
				class126.method2799(7);
				class345.setLoginResponseString("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
				return false;
			} else {
				if (!var5) {
					class7.field26 = 8388607;
				} else {
					class7.field26 = (int)(var0.getTime() / 86400000L - 11745L);
				}

				return true;
			}
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "19136992"
	)
	public static boolean method1868(int var0) {
		return var0 == WorldMapDecorationType.field3578.id;
	}

	public GraphicsObject() {
	}
}
