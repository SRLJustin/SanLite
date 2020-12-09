import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ln")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1044001765
	)
	@Export("compass")
	public int compass;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1859262069
	)
	public int field3845;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1603018569
	)
	@Export("mapScenes")
	public int mapScenes;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1068647141
	)
	@Export("headIconsPk")
	public int headIconsPk;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1862152703
	)
	public int field3844;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1527226929
	)
	public int field3843;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1238390891
	)
	public int field3846;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1222732897
	)
	public int field3847;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1053374165
	)
	public int field3848;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -295744595
	)
	public int field3849;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -406039943
	)
	public int field3850;

	public GraphicsDefaults() {
		this.compass = -1;
		this.field3845 = -1;
		this.mapScenes = -1;
		this.headIconsPk = -1;
		this.field3844 = -1;
		this.field3843 = -1;
		this.field3846 = -1;
		this.field3847 = -1;
		this.field3848 = -1;
		this.field3849 = -1;
		this.field3850 = -1;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "(Lib;B)V",
		garbageValue = "-1"
	)
	@Export("decode")
	public void decode(AbstractArchive var1) {
		byte[] var2 = var1.takeFileFlat(DefaultsGroup.field3839.group);
		Buffer var3 = new Buffer(var2);

		while (true) {
			int var4 = var3.readUnsignedByte();
			if (var4 == 0) {
				return;
			}

			switch(var4) {
			case 1:
				var3.readMedium();
				break;
			case 2:
				this.compass = var3.method5559();
				this.field3845 = var3.method5559();
				this.mapScenes = var3.method5559();
				this.headIconsPk = var3.method5559();
				this.field3844 = var3.method5559();
				this.field3843 = var3.method5559();
				this.field3846 = var3.method5559();
				this.field3847 = var3.method5559();
				this.field3848 = var3.method5559();
				this.field3849 = var3.method5559();
				this.field3850 = var3.method5559();
			}
		}
	}
}
