import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ha")
@Implements("WorldMapSection0")
public class WorldMapSection0 implements WorldMapSection {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1921370827
	)
	@Export("oldZ")
	int oldZ;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1948863841
	)
	@Export("newZ")
	int newZ;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1923971
	)
	@Export("oldX")
	int oldX;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -834083351
	)
	@Export("oldY")
	int oldY;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -151067067
	)
	@Export("newX")
	int newX;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -993548849
	)
	@Export("newY")
	int newY;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1130243685
	)
	@Export("oldChunkXLow")
	int oldChunkXLow;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1666808285
	)
	@Export("oldChunkYLow")
	int oldChunkYLow;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -912507685
	)
	@Export("oldChunkXHigh")
	int oldChunkXHigh;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1336425609
	)
	@Export("oldChunkYHigh")
	int oldChunkYHigh;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -834426157
	)
	@Export("newChunkXLow")
	int newChunkXLow;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1730040283
	)
	@Export("newChunkYLow")
	int newChunkYLow;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1327937655
	)
	@Export("newChunkXHigh")
	int newChunkXHigh;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1666490665
	)
	@Export("newChunkYHigh")
	int newChunkYHigh;

	WorldMapSection0() {
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lhm;I)V",
		garbageValue = "-1792723155"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.newX) {
			var1.regionLowX = this.newX;
		}

		if (var1.regionHighX < this.newX) {
			var1.regionHighX = this.newX;
		}

		if (var1.regionLowY > this.newY) {
			var1.regionLowY = this.newY;
		}

		if (var1.regionHighY < this.newY) {
			var1.regionHighY = this.newY;
		}

	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "1"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.oldZ && var1 < this.oldZ + this.newZ) {
			return var2 >= (this.oldX << 6) + (this.oldChunkXLow << 3) && var2 <= (this.oldX << 6) + (this.oldChunkXHigh << 3) + 7 && var3 >= (this.oldY << 6) + (this.oldChunkYLow << 3) && var3 <= (this.oldY << 6) + (this.oldChunkYHigh << 3) + 7;
		} else {
			return false;
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "2"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.newX << 6) + (this.newChunkXLow << 3) && var1 <= (this.newX << 6) + (this.newChunkXHigh << 3) + 7 && var2 >= (this.newY << 6) + (this.newChunkYLow << 3) && var2 <= (this.newY << 6) + (this.newChunkYHigh << 3) + 7;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "-41287528"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{this.newX * 64 - this.oldX * 64 + var2 + (this.newChunkXLow * 8 - this.oldChunkXLow * 8), var3 + (this.newY * 64 - this.oldY * 64) + (this.newChunkYLow * 8 - this.oldChunkYLow * 8)};
			return var4;
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(III)Lkd;",
		garbageValue = "289851355"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.oldX * 64 - this.newX * 64 + (this.oldChunkXLow * 8 - this.newChunkXLow * 8) + var1;
			int var4 = this.oldY * 64 - this.newY * 64 + var2 + (this.oldChunkYLow * 8 - this.newChunkYLow * 8);
			return new Coord(this.oldZ, var3, var4);
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)V",
		garbageValue = "-113194936"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.oldZ = var1.readUnsignedByte();
		this.newZ = var1.readUnsignedByte();
		this.oldX = var1.readUnsignedShort();
		this.oldChunkXLow = var1.readUnsignedByte();
		this.oldChunkXHigh = var1.readUnsignedByte();
		this.oldY = var1.readUnsignedShort();
		this.oldChunkYLow = var1.readUnsignedByte();
		this.oldChunkYHigh = var1.readUnsignedByte();
		this.newX = var1.readUnsignedShort();
		this.newChunkXLow = var1.readUnsignedByte();
		this.newChunkXHigh = var1.readUnsignedByte();
		this.newY = var1.readUnsignedShort();
		this.newChunkYLow = var1.readUnsignedByte();
		this.newChunkYHigh = var1.readUnsignedByte();
		this.postRead();
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-6373"
	)
	@Export("postRead")
	void postRead() {
	}
}
