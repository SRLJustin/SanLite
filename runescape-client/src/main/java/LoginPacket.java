import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jn")
@Implements("LoginPacket")
public class LoginPacket implements class261 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final LoginPacket field3192;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	static final LoginPacket field3196;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final LoginPacket field3193;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final LoginPacket field3194;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final LoginPacket field3195;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	static final LoginPacket field3191;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "[Ljn;"
	)
	@Export("LoginPacket_indexedValues")
	static final LoginPacket[] LoginPacket_indexedValues;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1526221881
	)
	@Export("id")
	public final int id;

	static {
		field3192 = new LoginPacket(14, 0);
		field3196 = new LoginPacket(15, 4);
		field3193 = new LoginPacket(16, -2);
		field3194 = new LoginPacket(18, -2);
		field3195 = new LoginPacket(19, -2);
		field3191 = new LoginPacket(27, 0);
		LoginPacket_indexedValues = new LoginPacket[32];
		LoginPacket[] var0 = NameableContainer.method6607();

		for (int var1 = 0; var1 < var0.length; ++var1) {
			LoginPacket_indexedValues[var0[var1].id] = var0[var1];
		}

	}

	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "0"
	)
	LoginPacket(int var1, int var2) {
		this.id = var1;
	}

	@ObfuscatedName("l")
	public static boolean method5022(long var0) {
		return 0L != var0 && !class129.method2816(var0);
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lpx;B)Ljava/lang/String;",
		garbageValue = "120"
	)
	public static String method5025(Buffer var0) {
		String var1;
		try {
			int var2 = var0.readUShortSmart();
			if (var2 > 32767) {
				var2 = 32767;
			}

			byte[] var3 = new byte[var2];
			var0.offset += class282.huffman.decompress(var0.array, var0.offset, var3, 0, var2);
			String var4 = EnumComposition.decodeStringCp1252(var3, 0, var2);
			var1 = var4;
		} catch (Exception var6) {
			var1 = "Cabbage";
		}

		return var1;
	}
}
