import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fj")
@Implements("HorizontalAlignment")
public enum HorizontalAlignment implements MouseWheel {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	field1938(2, 0),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	@Export("HorizontalAlignment_centered")
	HorizontalAlignment_centered(0, 1),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	field1937(1, 2);

	@ObfuscatedName("jt")
	@ObfuscatedGetter(
		intValue = -88443571
	)
	@Export("oculusOrbFocalPointX")
	static int oculusOrbFocalPointX;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -150444483
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -47587237
	)
	@Export("id")
	final int id;

	HorizontalAlignment(int var3, int var4) {
		this.value = var3;
		this.id = var4;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "30"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(ZLpc;B)V",
		garbageValue = "-31"
	)
	@Export("updateNpcs")
	static final void updateNpcs(boolean var0, PacketBuffer var1) {
		Client.field621 = 0;
		Client.field565 = 0;
		PacketBuffer var2 = Client.packetWriter.packetBuffer;
		var2.importIndex();
		int var3 = var2.readBits(8);
		int var4;
		if (var3 < Client.npcCount) {
			for (var4 = var3; var4 < Client.npcCount; ++var4) {
				Client.field616[++Client.field621 - 1] = Client.npcIndices[var4];
			}
		}

		if (var3 > Client.npcCount) {
			throw new RuntimeException("");
		} else {
			Client.npcCount = 0;

			for (var4 = 0; var4 < var3; ++var4) {
				int var5 = Client.npcIndices[var4];
				NPC var6 = Client.npcs[var5];
				int var7 = var2.readBits(1);
				if (var7 == 0) {
					Client.npcIndices[++Client.npcCount - 1] = var5;
					var6.npcCycle = Client.cycle;
				} else {
					int var8 = var2.readBits(2);
					if (var8 == 0) {
						Client.npcIndices[++Client.npcCount - 1] = var5;
						var6.npcCycle = Client.cycle;
						Client.field601[++Client.field565 - 1] = var5;
					} else {
						int var9;
						int var10;
						if (var8 == 1) {
							Client.npcIndices[++Client.npcCount - 1] = var5;
							var6.npcCycle = Client.cycle;
							var9 = var2.readBits(3);
							var6.method2340(var9, class193.field2251);
							var10 = var2.readBits(1);
							if (var10 == 1) {
								Client.field601[++Client.field565 - 1] = var5;
							}
						} else if (var8 == 2) {
							Client.npcIndices[++Client.npcCount - 1] = var5;
							var6.npcCycle = Client.cycle;
							if (var2.readBits(1) == 1) {
								var9 = var2.readBits(3);
								var6.method2340(var9, class193.field2248);
								var10 = var2.readBits(3);
								var6.method2340(var10, class193.field2248);
							} else {
								var9 = var2.readBits(3);
								var6.method2340(var9, class193.field2249);
							}

							var9 = var2.readBits(1);
							if (var9 == 1) {
								Client.field601[++Client.field565 - 1] = var5;
							}
						} else if (var8 == 3) {
							Client.field616[++Client.field621 - 1] = var5;
						}
					}
				}
			}

			class82.method2098(var0, var1);
			JagexCache.method3158(var1);

			int var11;
			for (var11 = 0; var11 < Client.field621; ++var11) {
				var3 = Client.field616[var11];
				if (Client.npcs[var3].npcCycle != Client.cycle) {
					Client.npcs[var3].definition = null;
					Client.npcs[var3] = null;
				}
			}

			if (var1.offset != Client.packetWriter.serverPacketLength) {
				throw new RuntimeException(var1.offset + "," + Client.packetWriter.serverPacketLength);
			} else {
				for (var11 = 0; var11 < Client.npcCount; ++var11) {
					if (Client.npcs[Client.npcIndices[var11]] == null) {
						throw new RuntimeException(var11 + "," + Client.npcCount);
					}
				}

			}
		}
	}
}
