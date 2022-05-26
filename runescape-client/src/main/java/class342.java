import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ml")
public class class342 {
	@ObfuscatedName("o")
	static char[] field4158;
	@ObfuscatedName("q")
	static char[] field4161;
	@ObfuscatedName("l")
	static char[] field4160;
	@ObfuscatedName("k")
	static int[] field4159;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1886529381
	)
	static int field4162;

	static {
		field4158 = new char[64];

		int var0;
		for (var0 = 0; var0 < 26; ++var0) {
			field4158[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4158[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4158[var0] = (char)(var0 + 48 - 52);
		}

		field4158[62] = '+';
		field4158[63] = '/';
		field4161 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field4161[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4161[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4161[var0] = (char)(var0 + 48 - 52);
		}

		field4161[62] = '*';
		field4161[63] = '-';
		field4160 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field4160[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4160[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4160[var0] = (char)(var0 + 48 - 52);
		}

		field4160[62] = '-';
		field4160[63] = '_';
		field4159 = new int[128];

		for (var0 = 0; var0 < field4159.length; ++var0) {
			field4159[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) {
			field4159[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) {
			field4159[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) {
			field4159[var0] = var0 - 48 + 52;
		}

		int[] var2 = field4159;
		field4159[43] = 62;
		var2[42] = 62;
		int[] var1 = field4159;
		field4159[47] = 63;
		var1[45] = 63;
	}

	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "([Lki;II)V",
		garbageValue = "-1118405651"
	)
	@Export("drawModelComponents")
	static final void drawModelComponents(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) {
			Widget var3 = var0[var2];
			if (var3 != null && var3.parentId == var1 && (!var3.isIf3 || !class434.isComponentHidden(var3))) {
				int var5;
				if (var3.type == 0) {
					if (!var3.isIf3 && class434.isComponentHidden(var3) && var3 != class144.mousedOverWidgetIf1) {
						continue;
					}

					drawModelComponents(var0, var3.id);
					if (var3.children != null) {
						drawModelComponents(var3.children, var3.id);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id);
					if (var4 != null) {
						var5 = var4.group;
						if (WorldMapDecoration.loadInterface(var5)) {
							drawModelComponents(NetSocket.Widget_interfaceComponents[var5], -1);
						}
					}
				}

				if (var3.type == 6) {
					if (var3.sequenceId != -1 || var3.sequenceId2 != -1) {
						boolean var7 = class401.runCs1(var3);
						if (var7) {
							var5 = var3.sequenceId2;
						} else {
							var5 = var3.sequenceId;
						}

						if (var5 != -1) {
							SequenceDefinition var6 = class114.SequenceDefinition_get(var5);

							for (var3.modelFrameCycle += Client.field727; var3.modelFrameCycle > var6.frameLengths[var3.modelFrame]; GrandExchangeOfferTotalQuantityComparator.method5781(var3)) {
								var3.modelFrameCycle -= var6.frameLengths[var3.modelFrame];
								++var3.modelFrame;
								if (var3.modelFrame >= var6.frameIds.length) {
									var3.modelFrame -= var6.frameCount;
									if (var3.modelFrame < 0 || var3.modelFrame >= var6.frameIds.length) {
										var3.modelFrame = 0;
									}
								}
							}
						}
					}

					if (var3.field3451 != 0 && !var3.isIf3) {
						int var8 = var3.field3451 >> 16;
						var5 = var3.field3451 << 16 >> 16;
						var8 *= Client.field727;
						var5 *= Client.field727;
						var3.modelAngleX = var8 + var3.modelAngleX & 2047;
						var3.modelAngleY = var5 + var3.modelAngleY & 2047;
						GrandExchangeOfferTotalQuantityComparator.method5781(var3);
					}
				}
			}
		}

	}
}
