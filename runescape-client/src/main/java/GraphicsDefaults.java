import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nu")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1168914555
	)
	@Export("compass")
	public int compass;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -153891603
	)
	public int field4373;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 889630627
	)
	@Export("mapScenes")
	public int mapScenes;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -214563943
	)
	@Export("headIconsPk")
	public int headIconsPk;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 2847389
	)
	public int field4376;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1531771617
	)
	public int field4377;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 822510473
	)
	public int field4378;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1018736855
	)
	public int field4374;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1369265667
	)
	public int field4375;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -2053526401
	)
	public int field4381;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1936619473
	)
	public int field4372;

	public GraphicsDefaults() {
		this.compass = -1;
		this.field4373 = -1;
		this.mapScenes = -1;
		this.headIconsPk = -1;
		this.field4376 = -1;
		this.field4377 = -1;
		this.field4378 = -1;
		this.field4374 = -1;
		this.field4375 = -1;
		this.field4381 = -1;
		this.field4372 = -1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Llp;I)V",
		garbageValue = "-901187341"
	)
	@Export("decode")
	public void decode(AbstractArchive var1) {
		byte[] var2 = var1.takeFileFlat(DefaultsGroup.field4370.group);
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
				this.compass = var3.method7532();
				this.field4373 = var3.method7532();
				this.mapScenes = var3.method7532();
				this.headIconsPk = var3.method7532();
				this.field4376 = var3.method7532();
				this.field4377 = var3.method7532();
				this.field4378 = var3.method7532();
				this.field4374 = var3.method7532();
				this.field4375 = var3.method7532();
				this.field4381 = var3.method7532();
				this.field4372 = var3.method7532();
			}
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IZIZB)V",
		garbageValue = "-62"
	)
	@Export("sortWorldList")
	static void sortWorldList(int var0, boolean var1, int var2, boolean var3) {
		if (World.World_worlds != null) {
			VarcInt.doWorldSorting(0, World.World_worlds.length - 1, var0, var1, var2, var3);
		}

	}

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-128"
	)
	static final void method6732(int var0) {
		int[] var1 = InterfaceParent.sceneMinimapSprite.pixels;
		int var2 = var1.length;

		int var3;
		for (var3 = 0; var3 < var2; ++var3) {
			var1[var3] = 0;
		}

		int var4;
		int var5;
		for (var3 = 1; var3 < 103; ++var3) {
			var4 = (103 - var3) * 2048 + 24628;

			for (var5 = 1; var5 < 103; ++var5) {
				if ((Tiles.Tiles_renderFlags[var0][var5][var3] & 24) == 0) {
					class175.scene.drawTileMinimap(var1, var4, 512, var0, var5, var3);
				}

				if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var5][var3] & 8) != 0) {
					class175.scene.drawTileMinimap(var1, var4, 512, var0 + 1, var5, var3);
				}

				var4 += 4;
			}
		}

		var3 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10);
		var4 = 238 + (int)(Math.random() * 20.0D) - 10 << 16;
		InterfaceParent.sceneMinimapSprite.setRaster();

		int var6;
		for (var5 = 1; var5 < 103; ++var5) {
			for (var6 = 1; var6 < 103; ++var6) {
				if ((Tiles.Tiles_renderFlags[var0][var6][var5] & 24) == 0) {
					WorldMapEvent.drawObject(var0, var6, var5, var3, var4);
				}

				if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var6][var5] & 8) != 0) {
					WorldMapEvent.drawObject(var0 + 1, var6, var5, var3, var4);
				}
			}
		}

		Client.mapIconCount = 0;

		for (var5 = 0; var5 < 104; ++var5) {
			for (var6 = 0; var6 < 104; ++var6) {
				long var7 = class175.scene.getGroundObjectTag(class128.Client_plane, var5, var6);
				if (var7 != 0L) {
					int var9 = NetSocket.Entity_unpackID(var7);
					int var10 = class82.getObjectDefinition(var9).mapIconId;
					if (var10 >= 0 && class120.WorldMapElement_get(var10).field1874) {
						Client.mapIcons[Client.mapIconCount] = class120.WorldMapElement_get(var10).getSpriteBool(false);
						Client.mapIconXs[Client.mapIconCount] = var5;
						Client.mapIconYs[Client.mapIconCount] = var6;
						++Client.mapIconCount;
					}
				}
			}
		}

		DevicePcmPlayerProvider.rasterProvider.apply();
	}

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1911416331"
	)
	@Export("Widget_resetModelFrames")
	static final void Widget_resetModelFrames(int var0) {
		if (WorldMapDecoration.loadInterface(var0)) {
			Widget[] var1 = NetSocket.Widget_interfaceComponents[var0];

			for (int var2 = 0; var2 < var1.length; ++var2) {
				Widget var3 = var1[var2];
				if (var3 != null) {
					var3.modelFrame = 0;
					var3.modelFrameCycle = 0;
				}
			}

		}
	}
}
