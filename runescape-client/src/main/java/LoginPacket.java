import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hk")
@Implements("LoginPacket")
public class LoginPacket implements class223 {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lhk;"
	)
	public static final LoginPacket field2803;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lhk;"
	)
	static final LoginPacket field2804;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lhk;"
	)
	public static final LoginPacket field2798;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lhk;"
	)
	public static final LoginPacket field2799;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lhk;"
	)
	public static final LoginPacket field2800;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lhk;"
	)
	static final LoginPacket field2801;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "[Lhk;"
	)
	@Export("LoginPacket_indexedValues")
	static final LoginPacket[] LoginPacket_indexedValues;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 295659423
	)
	@Export("musicTrackVolume")
	static int musicTrackVolume;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1672297033
	)
	@Export("id")
	public final int id;

	static {
		field2803 = new LoginPacket(14, 0);
		field2804 = new LoginPacket(15, 4);
		field2798 = new LoginPacket(16, -2);
		field2799 = new LoginPacket(18, -2);
		field2800 = new LoginPacket(19, -2);
		field2801 = new LoginPacket(27, 0);
		LoginPacket_indexedValues = new LoginPacket[32];
		LoginPacket[] var0 = NPC.method2253();

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

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Liv;IIIS)V",
		garbageValue = "-15678"
	)
	@Export("Widget_setKeyRate")
	static final void Widget_setKeyRate(Widget var0, int var1, int var2, int var3) {
		if (var0.field3070 == null) {
			throw new RuntimeException();
		} else {
			var0.field3070[var1] = var2;
			var0.field3090[var1] = var3;
		}
	}

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1188700312"
	)
	static final boolean method4319(int var0) {
		if (var0 < 0) {
			return false;
		} else {
			int var1 = Client.menuOpcodes[var0];
			if (var1 >= 2000) {
				var1 -= 2000;
			}

			return var1 == 1007;
		}
	}
}
