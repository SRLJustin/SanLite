import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dm")
public class class125 extends class128 {
	@ObfuscatedName("px")
	@ObfuscatedSignature(
		descriptor = "Lcu;"
	)
	@Export("varcs")
	static Varcs varcs;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -887084095
	)
	int field1561;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1121955905
	)
	int field1559;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -263123509
	)
	int field1560;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1343023729
	)
	int field1562;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Leh;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Leh;)V"
	)
	class125(class131 var1) {
		this.this$0 = var1;
		this.field1561 = -1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)V",
		garbageValue = "-611912046"
	)
	void vmethod3040(Buffer var1) {
		this.field1561 = var1.readUnsignedShort();
		this.field1559 = var1.readInt();
		this.field1560 = var1.readUnsignedByte();
		this.field1562 = var1.readUnsignedByte();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lek;B)V",
		garbageValue = "-73"
	)
	void vmethod3041(ClanSettings var1) {
		var1.method2896(this.field1561, this.field1559, this.field1560, this.field1562);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;ZI)[B",
		garbageValue = "1216365156"
	)
	public static byte[] method2791(Object var0, boolean var1) {
		if (var0 == null) {
			return null;
		} else if (var0 instanceof byte[]) {
			byte[] var3 = (byte[])((byte[])var0);
			return var1 ? UrlRequester.method2537(var3) : var3;
		} else if (var0 instanceof AbstractByteArrayCopier) {
			AbstractByteArrayCopier var2 = (AbstractByteArrayCopier)var0;
			return var2.get();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lle;IB)V",
		garbageValue = "1"
	)
	static void method2796(Archive var0, int var1) {
		if (class300.NetCache_reference != null) {
			class300.NetCache_reference.offset = var1 * 8 + 5;
			int var2 = class300.NetCache_reference.readInt();
			int var3 = class300.NetCache_reference.readInt();
			var0.loadIndex(var2, var3);
		} else {
			class250.requestNetFile((Archive)null, 255, 255, 0, (byte)0, true);
			NetCache.NetCache_archives[var1] = var0;
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "([BIIIIIII[Lgh;I)V",
		garbageValue = "810433263"
	)
	static final void method2794(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, CollisionMap[] var8) {
		int var10;
		for (int var9 = 0; var9 < 8; ++var9) {
			for (var10 = 0; var10 < 8; ++var10) {
				if (var9 + var2 > 0 && var9 + var2 < 103 && var3 + var10 > 0 && var3 + var10 < 103) {
					int[] var10000 = var8[var1].flags[var9 + var2];
					var10000[var10 + var3] &= -16777217;
				}
			}
		}

		Buffer var20 = new Buffer(var0);

		for (var10 = 0; var10 < 4; ++var10) {
			for (int var11 = 0; var11 < 64; ++var11) {
				for (int var12 = 0; var12 < 64; ++var12) {
					if (var10 == var4 && var11 >= var5 && var11 < var5 + 8 && var12 >= var6 && var12 < var6 + 8) {
						int var17 = var11 & 7;
						int var18 = var12 & 7;
						int var19 = var7 & 3;
						int var16;
						if (var19 == 0) {
							var16 = var17;
						} else if (var19 == 1) {
							var16 = var18;
						} else if (var19 == 2) {
							var16 = 7 - var17;
						} else {
							var16 = 7 - var18;
						}

						class67.loadTerrain(var20, var1, var2 + var16, var3 + VarpDefinition.method3273(var11 & 7, var12 & 7, var7), 0, 0, var7);
					} else {
						class67.loadTerrain(var20, 0, -1, -1, 0, 0, 0);
					}
				}
			}
		}

	}
}
