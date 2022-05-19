import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ne")
@Implements("Bounds")
public class Bounds {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -2084018151
	)
	@Export("lowX")
	public int lowX;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1161874723
	)
	@Export("lowY")
	public int lowY;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1792451045
	)
	@Export("highX")
	public int highX;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -347299673
	)
	@Export("highY")
	public int highY;

	public Bounds(int var1, int var2, int var3, int var4) {
		this.setLow(var1, var2);
		this.setHigh(var3, var4);
	}

	public Bounds(int var1, int var2) {
		this(0, 0, var1, var2);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "76"
	)
	@Export("setLow")
	public void setLow(int var1, int var2) {
		this.lowX = var1;
		this.lowY = var2;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2014864213"
	)
	@Export("setHigh")
	public void setHigh(int var1, int var2) {
		this.highX = var1;
		this.highY = var2;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1837557842"
	)
	public boolean method6742(int var1, int var2) {
		return var1 >= this.lowX && var1 < this.highX + this.lowX && var2 >= this.lowY && var2 < this.lowY + this.highY;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lne;Lne;I)V",
		garbageValue = "683766141"
	)
	public void method6758(Bounds var1, Bounds var2) {
		this.method6739(var1, var2);
		this.method6746(var1, var2);
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lne;Lne;B)V",
		garbageValue = "-80"
	)
	void method6739(Bounds var1, Bounds var2) {
		var2.lowX = this.lowX;
		var2.highX = this.highX;
		if (this.lowX < var1.lowX) {
			var2.highX -= var1.lowX - this.lowX;
			var2.lowX = var1.lowX;
		}

		if (var2.method6747() > var1.method6747()) {
			var2.highX -= var2.method6747() - var1.method6747();
		}

		if (var2.highX < 0) {
			var2.highX = 0;
		}

	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lne;Lne;B)V",
		garbageValue = "83"
	)
	void method6746(Bounds var1, Bounds var2) {
		var2.lowY = this.lowY;
		var2.highY = this.highY;
		if (this.lowY < var1.lowY) {
			var2.highY -= var1.lowY - this.lowY;
			var2.lowY = var1.lowY;
		}

		if (var2.method6745() > var1.method6745()) {
			var2.highY -= var2.method6745() - var1.method6745();
		}

		if (var2.highY < 0) {
			var2.highY = 0;
		}

	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1397499342"
	)
	int method6747() {
		return this.lowX + this.highX;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1908652212"
	)
	int method6745() {
		return this.lowY + this.highY;
	}

	public String toString() {
		return null;
	}
}
