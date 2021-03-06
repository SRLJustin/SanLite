import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gv")
@Implements("LoginPacket")
public class LoginPacket implements class190 {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "Lgv;"
	)
	public static final LoginPacket field2342;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "Lgv;"
	)
	static final LoginPacket field2339;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "Lgv;"
	)
	public static final LoginPacket field2336;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "Lgv;"
	)
	public static final LoginPacket field2338;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		signature = "Lgv;"
	)
	public static final LoginPacket field2337;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "Lgv;"
	)
	static final LoginPacket field2340;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "[Lgv;"
	)
	@Export("LoginPacket_indexedValues")
	static final LoginPacket[] LoginPacket_indexedValues;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -2092030193
	)
	@Export("id")
	public final int id;

	static {
		field2342 = new LoginPacket(14, 0);
		field2339 = new LoginPacket(15, 4);
		field2336 = new LoginPacket(16, -2);
		field2338 = new LoginPacket(18, -2);
		field2337 = new LoginPacket(19, -2);
		field2340 = new LoginPacket(27, 0);
		LoginPacket_indexedValues = new LoginPacket[32];
		LoginPacket[] var0 = Tiles.method1217();

		for (int var1 = 0; var1 < var0.length; ++var1) {
			LoginPacket_indexedValues[var0[var1].id] = var0[var1];
		}

	}

	@ObfuscatedSignature(
		garbageValue = "0",
		signature = "(II)V"
	)
	LoginPacket(int var1, int var2) {
		this.id = var1;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		garbageValue = "1633316338",
		signature = "(CI)B"
	)
	@Export("charToByteCp1252")
	public static byte charToByteCp1252(char var0) {
		byte var1;
		if (var0 > 0 && var0 < 128 || var0 >= 160 && var0 <= 255) {
			var1 = (byte)var0;
		} else if (var0 == 8364) {
			var1 = -128;
		} else if (var0 == 8218) {
			var1 = -126;
		} else if (var0 == 402) {
			var1 = -125;
		} else if (var0 == 8222) {
			var1 = -124;
		} else if (var0 == 8230) {
			var1 = -123;
		} else if (var0 == 8224) {
			var1 = -122;
		} else if (var0 == 8225) {
			var1 = -121;
		} else if (var0 == 710) {
			var1 = -120;
		} else if (var0 == 8240) {
			var1 = -119;
		} else if (var0 == 352) {
			var1 = -118;
		} else if (var0 == 8249) {
			var1 = -117;
		} else if (var0 == 338) {
			var1 = -116;
		} else if (var0 == 381) {
			var1 = -114;
		} else if (var0 == 8216) {
			var1 = -111;
		} else if (var0 == 8217) {
			var1 = -110;
		} else if (var0 == 8220) {
			var1 = -109;
		} else if (var0 == 8221) {
			var1 = -108;
		} else if (var0 == 8226) {
			var1 = -107;
		} else if (var0 == 8211) {
			var1 = -106;
		} else if (var0 == 8212) {
			var1 = -105;
		} else if (var0 == 732) {
			var1 = -104;
		} else if (var0 == 8482) {
			var1 = -103;
		} else if (var0 == 353) {
			var1 = -102;
		} else if (var0 == 8250) {
			var1 = -101;
		} else if (var0 == 339) {
			var1 = -100;
		} else if (var0 == 382) {
			var1 = -98;
		} else if (var0 == 376) {
			var1 = -97;
		} else {
			var1 = 63;
		}

		return var1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		garbageValue = "-560730174",
		signature = "(IIII)Llm;"
	)
	static SpritePixels method3816(int var0, int var1, int var2) {
		return (SpritePixels)WorldMapRegion.WorldMapRegion_cachedSprites.get(AttackOption.method2203(var0, var1, var2));
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "818544201",
		signature = "(I)V"
	)
	public static void method3815() {
		try {
			if (class206.musicPlayerStatus == 1) {
				int var0 = VertexNormal.midiPcmStream.method3912();
				if (var0 > 0 && VertexNormal.midiPcmStream.isReady()) {
					var0 -= class7.pcmSampleLength;
					if (var0 < 0) {
						var0 = 0;
					}

					VertexNormal.midiPcmStream.setPcmStreamVolume(var0);
					return;
				}

				VertexNormal.midiPcmStream.clear();
				VertexNormal.midiPcmStream.removeAll();
				if (class206.musicTrackArchive != null) {
					class206.musicPlayerStatus = 2;
				} else {
					class206.musicPlayerStatus = 0;
				}

				class204.musicTrack = null;
				class182.soundCache = null;
			}
		} catch (Exception var2) {
			var2.printStackTrace();
			VertexNormal.midiPcmStream.clear();
			class206.musicPlayerStatus = 0;
			class204.musicTrack = null;
			class182.soundCache = null;
			class206.musicTrackArchive = null;
		}

	}

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		garbageValue = "-73",
		signature = "(IIB)V"
	)
	static void method3812(int var0, int var1) {
		MenuAction var2 = class195.tempMenuAction;
		AbstractWorldMapIcon.menuAction(var2.param0, var2.param1, var2.opcode, var2.identifier, var2.action, var2.action, var0, var1);
		class195.tempMenuAction = null;
	}
}
