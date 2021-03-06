import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ky")
@Implements("Buddy")
public class Buddy extends Nameable {
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1026270323
	)
	@Export("world")
	public int world;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 975938315
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1192937939
	)
	@Export("rank")
	public int rank;

	Buddy() {
		this.world = -1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		garbageValue = "741820969",
		signature = "(III)V"
	)
	@Export("set")
	void set(int var1, int var2) {
		this.world = var1;
		this.int2 = var2;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		garbageValue = "-50",
		signature = "(B)I"
	)
	@Export("getWorld")
	public int getWorld() {
		return this.world;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		garbageValue = "292513341",
		signature = "(I)Z"
	)
	@Export("hasWorld")
	public boolean hasWorld() {
		return this.world > 0;
	}
}
