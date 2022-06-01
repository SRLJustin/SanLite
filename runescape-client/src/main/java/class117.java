import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dz")
public class class117 {
	@ObfuscatedName("o")
	boolean field1477;
	@ObfuscatedName("q")
	boolean field1487;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	class116 field1472;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	class116 field1475;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "[Ldi;"
	)
	class113[] field1476;
	@ObfuscatedName("m")
	boolean field1480;
	@ObfuscatedName("p")
	float field1478;
	@ObfuscatedName("s")
	float field1479;
	@ObfuscatedName("r")
	float[] field1473;
	@ObfuscatedName("v")
	float[] field1481;
	@ObfuscatedName("y")
	boolean field1482;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 2107172617
	)
	int field1483;
	@ObfuscatedName("w")
	float[] field1484;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1297196187
	)
	int field1474;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1886403005
	)
	int field1486;
	@ObfuscatedName("g")
	float field1485;
	@ObfuscatedName("x")
	float field1488;

	class117() {
		this.field1473 = new float[4];
		this.field1481 = new float[4];
		this.field1482 = true;
		this.field1483 = 0;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lpx;II)I",
		garbageValue = "548491592"
	)
	int method2688(Buffer var1, int var2) {
		int var3 = var1.readUnsignedShort();
		class295.method5560(var1.readUnsignedByte());
		int var5 = var1.readUnsignedByte();
		class116[] var6 = new class116[]{class116.field1470, class116.field1465, class116.field1464, class116.field1466, class116.field1468};
		class116 var7 = (class116)class291.findEnumerated(var6, var5);
		if (var7 == null) {
			var7 = class116.field1470;
		}

		this.field1472 = var7;
		int var11 = var1.readUnsignedByte();
		class116[] var8 = new class116[]{class116.field1470, class116.field1465, class116.field1464, class116.field1466, class116.field1468};
		class116 var9 = (class116)class291.findEnumerated(var8, var11);
		if (var9 == null) {
			var9 = class116.field1470;
		}

		this.field1475 = var9;
		this.field1477 = var1.readUnsignedByte() != 0;
		this.field1476 = new class113[var3];
		class113 var13 = null;

		int var12;
		for (var12 = 0; var12 < var3; ++var12) {
			class113 var10 = new class113();
			var10.method2621(var1, var2);
			this.field1476[var12] = var10;
			if (var13 != null) {
				var13.field1427 = var10;
			}

			var13 = var10;
		}

		this.field1474 = this.field1476[0].field1430;
		this.field1486 = this.field1476[this.method2695() - 1].field1430;
		this.field1484 = new float[this.method2692() + 1];

		for (var12 = this.method2690(); var12 <= this.method2691(); ++var12) {
			this.field1484[var12 - this.method2690()] = MusicPatchNode.method5315(this, (float)var12);
		}

		this.field1476 = null;
		this.field1485 = MusicPatchNode.method5315(this, (float)(this.method2690() - 1));
		this.field1488 = MusicPatchNode.method5315(this, (float)(this.method2691() + 1));
		return var3;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "1078920947"
	)
	public float method2689(int var1) {
		if (var1 < this.method2690()) {
			return this.field1485;
		} else {
			return var1 > this.method2691() ? this.field1488 : this.field1484[var1 - this.method2690()];
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "56"
	)
	int method2690() {
		return this.field1474;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-529211546"
	)
	int method2691() {
		return this.field1486;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-2"
	)
	int method2692() {
		return this.method2691() - this.method2690();
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(FS)I",
		garbageValue = "-12024"
	)
	int method2712(float var1) {
		if (this.field1483 < 0 || (float)this.field1476[this.field1483].field1430 > var1 || this.field1476[this.field1483].field1427 != null && (float)this.field1476[this.field1483].field1427.field1430 <= var1) {
			if (var1 >= (float)this.method2690() && var1 <= (float)this.method2691()) {
				int var2 = this.method2695();
				int var3 = this.field1483;
				if (var2 > 0) {
					int var4 = 0;
					int var5 = var2 - 1;

					do {
						int var6 = var5 + var4 >> 1;
						if (var1 < (float)this.field1476[var6].field1430) {
							if (var1 > (float)this.field1476[var6 - 1].field1430) {
								var3 = var6 - 1;
								break;
							}

							var5 = var6 - 1;
						} else {
							if (var1 <= (float)this.field1476[var6].field1430) {
								var3 = var6;
								break;
							}

							if (var1 < (float)this.field1476[var6 + 1].field1430) {
								var3 = var6;
								break;
							}

							var4 = var6 + 1;
						}
					} while(var4 <= var5);
				}

				if (var3 != this.field1483) {
					this.field1483 = var3;
					this.field1482 = true;
				}

				return this.field1483;
			} else {
				return -1;
			}
		} else {
			return this.field1483;
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(FI)Ldi;",
		garbageValue = "-5315501"
	)
	class113 method2707(float var1) {
		int var2 = this.method2712(var1);
		return var2 >= 0 && var2 < this.field1476.length ? this.field1476[var2] : null;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "6186"
	)
	int method2695() {
		return this.field1476 == null ? 0 : this.field1476.length;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)I",
		garbageValue = "1632957867"
	)
	public static int method2717(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) {
			int var6 = var3;
			var3 = var4;
			var4 = var6;
		}

		var2 &= 3;
		if (var2 == 0) {
			return var1;
		} else if (var2 == 1) {
			return 7 - var0 - (var3 - 1);
		} else {
			return var2 == 2 ? 7 - var1 - (var4 - 1) : var0;
		}
	}
}
