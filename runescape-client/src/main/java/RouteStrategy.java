import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gw")
@Implements("RouteStrategy")
public abstract class RouteStrategy {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -28865855
	)
	static int field2242;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -716123983
	)
	@Export("approxDestinationX")
	public int approxDestinationX;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1217895239
	)
	@Export("approxDestinationY")
	public int approxDestinationY;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1357888893
	)
	@Export("approxDestinationSizeX")
	public int approxDestinationSizeX;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -546663349
	)
	@Export("approxDestinationSizeY")
	public int approxDestinationSizeY;

	protected RouteStrategy() {
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIILgh;I)Z",
		garbageValue = "-425355466"
	)
	@Export("hasArrived")
	public abstract boolean hasArrived(int var1, int var2, int var3, CollisionMap var4);

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(CI)C",
		garbageValue = "-1536877918"
	)
	static char method3795(char var0) {
		if (var0 == 198) {
			return 'E';
		} else if (var0 == 230) {
			return 'e';
		} else if (var0 == 223) {
			return 's';
		} else if (var0 == 338) {
			return 'E';
		} else {
			return (char)(var0 == 339 ? 'e' : '\u0000');
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "0"
	)
	@Export("SpriteBuffer_decode")
	static void SpriteBuffer_decode(byte[] var0) {
		Buffer var1 = new Buffer(var0);
		var1.offset = var0.length - 2;
		class453.SpriteBuffer_spriteCount = var1.readUnsignedShort();
		class453.SpriteBuffer_xOffsets = new int[class453.SpriteBuffer_spriteCount];
		class453.SpriteBuffer_yOffsets = new int[class453.SpriteBuffer_spriteCount];
		ScriptFrame.SpriteBuffer_spriteWidths = new int[class453.SpriteBuffer_spriteCount];
		class453.SpriteBuffer_spriteHeights = new int[class453.SpriteBuffer_spriteCount];
		class127.SpriteBuffer_pixels = new byte[class453.SpriteBuffer_spriteCount][];
		var1.offset = var0.length - 7 - class453.SpriteBuffer_spriteCount * 8;
		class453.SpriteBuffer_spriteWidth = var1.readUnsignedShort();
		class453.SpriteBuffer_spriteHeight = var1.readUnsignedShort();
		int var2 = (var1.readUnsignedByte() & 255) + 1;

		int var3;
		for (var3 = 0; var3 < class453.SpriteBuffer_spriteCount; ++var3) {
			class453.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class453.SpriteBuffer_spriteCount; ++var3) {
			class453.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class453.SpriteBuffer_spriteCount; ++var3) {
			ScriptFrame.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class453.SpriteBuffer_spriteCount; ++var3) {
			class453.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
		}

		var1.offset = var0.length - 7 - class453.SpriteBuffer_spriteCount * 8 - (var2 - 1) * 3;
		Decimator.SpriteBuffer_spritePalette = new int[var2];

		for (var3 = 1; var3 < var2; ++var3) {
			Decimator.SpriteBuffer_spritePalette[var3] = var1.readMedium();
			if (Decimator.SpriteBuffer_spritePalette[var3] == 0) {
				Decimator.SpriteBuffer_spritePalette[var3] = 1;
			}
		}

		var1.offset = 0;

		for (var3 = 0; var3 < class453.SpriteBuffer_spriteCount; ++var3) {
			int var4 = ScriptFrame.SpriteBuffer_spriteWidths[var3];
			int var5 = class453.SpriteBuffer_spriteHeights[var3];
			int var6 = var4 * var5;
			byte[] var7 = new byte[var6];
			class127.SpriteBuffer_pixels[var3] = var7;
			int var8 = var1.readUnsignedByte();
			int var9;
			if (var8 == 0) {
				for (var9 = 0; var9 < var6; ++var9) {
					var7[var9] = var1.readByte();
				}
			} else if (var8 == 1) {
				for (var9 = 0; var9 < var4; ++var9) {
					for (int var10 = 0; var10 < var5; ++var10) {
						var7[var9 + var10 * var4] = var1.readByte();
					}
				}
			}
		}

	}
}
