import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ef")
public abstract class class144 extends Node {
	@ObfuscatedName("nz")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	@Export("mousedOverWidgetIf1")
	static Widget mousedOverWidgetIf1;

	class144() {
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)V",
		garbageValue = "1212008489"
	)
	abstract void vmethod3037(Buffer var1);

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Let;I)V",
		garbageValue = "1640110130"
	)
	abstract void vmethod3032(ClanChannel var1);

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lcr;B)V",
		garbageValue = "64"
	)
	@Export("runScriptEvent")
	public static void runScriptEvent(ScriptEvent var0) {
		class10.runScript(var0, 500000, 475000);
	}

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "(ZLpc;I)V",
		garbageValue = "1354871323"
	)
	@Export("loadRegions")
	static final void loadRegions(boolean var0, PacketBuffer var1) {
		Client.isInInstance = var0;
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		if (!Client.isInInstance) {
			int var2 = var1.method7576();
			var3 = var1.readUnsignedShort();
			var4 = var1.readUnsignedShort();
			class138.xteaKeys = new int[var4][4];

			for (var5 = 0; var5 < var4; ++var5) {
				for (var6 = 0; var6 < 4; ++var6) {
					class138.xteaKeys[var5][var6] = var1.readInt();
				}
			}

			class241.regions = new int[var4];
			class83.regionMapArchiveIds = new int[var4];
			class17.regionLandArchiveIds = new int[var4];
			InterfaceParent.regionLandArchives = new byte[var4][];
			FloorUnderlayDefinition.regionMapArchives = new byte[var4][];
			boolean var16 = false;
			if (Client.field493) {
				if ((var3 / 8 == 48 || var3 / 8 == 49) && var2 / 8 == 48) {
					var16 = true;
				}

				if (var3 / 8 == 48 && var2 / 8 == 148) {
					var16 = true;
				}
			}

			var4 = 0;

			for (var6 = (var3 - 6) / 8; var6 <= (var3 + 6) / 8; ++var6) {
				for (var7 = (var2 - 6) / 8; var7 <= (var2 + 6) / 8; ++var7) {
					var8 = var7 + (var6 << 8);
					if (!var16 || var7 != 49 && var7 != 149 && var7 != 147 && var6 != 50 && (var6 != 49 || var7 != 47)) {
						class241.regions[var4] = var8;
						class83.regionMapArchiveIds[var4] = Message.archive5.getGroupId("m" + var6 + "_" + var7);
						class17.regionLandArchiveIds[var4] = Message.archive5.getGroupId("l" + var6 + "_" + var7);
						++var4;
					}
				}
			}

			class329.method5875(var3, var2, true);
		} else {
			boolean var15 = var1.method7546() == 1;
			var3 = var1.method7554();
			var4 = var1.method7554();
			var5 = var1.readUnsignedShort();
			var1.importIndex();

			int var9;
			for (var6 = 0; var6 < 4; ++var6) {
				for (var7 = 0; var7 < 13; ++var7) {
					for (var8 = 0; var8 < 13; ++var8) {
						var9 = var1.readBits(1);
						if (var9 == 1) {
							Client.instanceChunkTemplates[var6][var7][var8] = var1.readBits(26);
						} else {
							Client.instanceChunkTemplates[var6][var7][var8] = -1;
						}
					}
				}
			}

			var1.exportIndex();
			class138.xteaKeys = new int[var5][4];

			for (var6 = 0; var6 < var5; ++var6) {
				for (var7 = 0; var7 < 4; ++var7) {
					class138.xteaKeys[var6][var7] = var1.readInt();
				}
			}

			class241.regions = new int[var5];
			class83.regionMapArchiveIds = new int[var5];
			class17.regionLandArchiveIds = new int[var5];
			InterfaceParent.regionLandArchives = new byte[var5][];
			FloorUnderlayDefinition.regionMapArchives = new byte[var5][];
			var5 = 0;

			for (var6 = 0; var6 < 4; ++var6) {
				for (var7 = 0; var7 < 13; ++var7) {
					for (var8 = 0; var8 < 13; ++var8) {
						var9 = Client.instanceChunkTemplates[var6][var7][var8];
						if (var9 != -1) {
							int var10 = var9 >> 14 & 1023;
							int var11 = var9 >> 3 & 2047;
							int var12 = (var10 / 8 << 8) + var11 / 8;

							int var13;
							for (var13 = 0; var13 < var5; ++var13) {
								if (class241.regions[var13] == var12) {
									var12 = -1;
									break;
								}
							}

							if (var12 != -1) {
								class241.regions[var5] = var12;
								var13 = var12 >> 8 & 255;
								int var14 = var12 & 255;
								class83.regionMapArchiveIds[var5] = Message.archive5.getGroupId("m" + var13 + "_" + var14);
								class17.regionLandArchiveIds[var5] = Message.archive5.getGroupId("l" + var13 + "_" + var14);
								++var5;
							}
						}
					}
				}
			}

			class329.method5875(var3, var4, !var15);
		}

	}
}
