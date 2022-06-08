import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ds")
public class class122 extends DualNode {
	@ObfuscatedName("sd")
	@ObfuscatedSignature(
		descriptor = "Las;"
	)
	@Export("pcmStreamMixer")
	static PcmStreamMixer pcmStreamMixer;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -676167361
	)
	int field1531;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "[[Ldz;"
	)
	public class117[][] field1530;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "[[Ldz;"
	)
	class117[][] field1532;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1182736645
	)
	int field1533;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 195847897
	)
	int field1534;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lgf;"
	)
	public Skeleton field1535;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 2017030435
	)
	int field1536;
	@ObfuscatedName("s")
	boolean field1537;

	@ObfuscatedSignature(
		descriptor = "(Llp;Llp;IZ)V"
	)
	class122(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		this.field1530 = null;
		this.field1532 = null;
		this.field1536 = 0;
		this.field1531 = var3;
		byte[] var5 = var1.takeFile(this.field1531 >> 16 & 65535, this.field1531 & 65535);
		Buffer var6 = new Buffer(var5);
		int var7 = var6.readUnsignedByte();
		int var8 = var6.readUnsignedShort();
		byte[] var9;
		if (var4) {
			var9 = var2.getFile(0, var8);
		} else {
			var9 = var2.getFile(var8, 0);
		}

		this.field1535 = new Skeleton(var8, var9);
		this.method2750(var6, var7);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lpx;II)V",
		garbageValue = "-1451589844"
	)
	void method2750(Buffer var1, int var2) {
		this.field1533 = var1.readUnsignedShort();
		this.field1534 = var1.readUnsignedShort();
		this.field1536 = var1.readUnsignedByte();
		int var3 = var1.readUnsignedShort();
		this.field1532 = new class117[this.field1535.method4023().method4003()][];
		this.field1530 = new class117[this.field1535.method4018()][];

		for (int var4 = 0; var4 < var3; ++var4) {
			class118 var5 = class160.method3169(var1.readUnsignedByte());
			int var6 = var1.readShortSmart();
			int var8 = var1.readUnsignedByte();
			class119 var9 = (class119)class291.findEnumerated(ItemContainer.method2060(), var8);
			if (var9 == null) {
				var9 = class119.field1508;
			}

			class117 var10 = new class117();
			var10.method2688(var1, var2);
			int var11 = var5.method2732();
			class117[][] var12;
			if (var5 == class118.field1491) {
				var12 = this.field1532;
			} else {
				var12 = this.field1530;
			}

			if (var12[var6] == null) {
				var12[var6] = new class117[var11];
			}

			var12[var6][var9.method2738()] = var10;
			if (var5 == class118.field1490) {
				this.field1537 = true;
			}
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "64"
	)
	int method2779() {
		return this.field1533;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1081367730"
	)
	int method2752() {
		return this.field1534;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-47"
	)
	public int method2753() {
		return this.field1536;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-98"
	)
	public int method2754() {
		return this.method2752() - this.method2779();
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-65"
	)
	public boolean method2755() {
		return this.field1537;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(ILdb;IIB)V",
		garbageValue = "-94"
	)
	public void method2756(int var1, class115 var2, int var3, int var4) {
		class388 var5 = Tile.method3904();
		this.method2757(var5, var3, var2, var1);
		this.method2758(var5, var3, var2, var1);
		this.method2774(var5, var3, var2, var1);
		var2.method2645(var5);
		var5.method6865();
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lnw;ILdb;II)V",
		garbageValue = "-565216546"
	)
	void method2757(class388 var1, int var2, class115 var3, int var4) {
		float[] var5 = var3.method2647(this.field1536);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1532[var2] != null) {
			class117 var9 = this.field1532[var2][0];
			class117 var10 = this.field1532[var2][1];
			class117 var11 = this.field1532[var2][2];
			if (var9 != null) {
				var6 = var9.method2689(var4);
			}

			if (var10 != null) {
				var7 = var10.method2689(var4);
			}

			if (var11 != null) {
				var8 = var11.method2689(var4);
			}
		}

		class387 var22;
		synchronized(class387.field4395) {
			if (Frames.field2492 == 0) {
				var22 = new class387();
			} else {
				class387.field4395[--Frames.field2492].method6782();
				var22 = class387.field4395[Frames.field2492];
			}
		}

		var22.method6784(1.0F, 0.0F, 0.0F, var6);
		class387 var23;
		synchronized(class387.field4395) {
			if (Frames.field2492 == 0) {
				var23 = new class387();
			} else {
				class387.field4395[--Frames.field2492].method6782();
				var23 = class387.field4395[Frames.field2492];
			}
		}

		var23.method6784(0.0F, 1.0F, 0.0F, var7);
		class387 var13;
		synchronized(class387.field4395) {
			if (Frames.field2492 == 0) {
				var13 = new class387();
			} else {
				class387.field4395[--Frames.field2492].method6782();
				var13 = class387.field4395[Frames.field2492];
			}
		}

		var13.method6784(0.0F, 0.0F, 1.0F, var8);
		class387 var15;
		synchronized(class387.field4395) {
			if (Frames.field2492 == 0) {
				var15 = new class387();
			} else {
				class387.field4395[--Frames.field2492].method6782();
				var15 = class387.field4395[Frames.field2492];
			}
		}

		var15.method6783(var13);
		var15.method6783(var22);
		var15.method6783(var23);
		class388 var17 = Tile.method3904();
		var17.method6817(var15);
		var1.method6816(var17);
		var22.method6779();
		var23.method6779();
		var13.method6779();
		var15.method6779();
		var17.method6865();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnw;ILdb;IB)V",
		garbageValue = "-29"
	)
	void method2774(class388 var1, int var2, class115 var3, int var4) {
		float[] var5 = var3.method2655(this.field1536);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1532[var2] != null) {
			class117 var9 = this.field1532[var2][3];
			class117 var10 = this.field1532[var2][4];
			class117 var11 = this.field1532[var2][5];
			if (var9 != null) {
				var6 = var9.method2689(var4);
			}

			if (var10 != null) {
				var7 = var10.method2689(var4);
			}

			if (var11 != null) {
				var8 = var11.method2689(var4);
			}
		}

		var1.field4400[12] = var6;
		var1.field4400[13] = var7;
		var1.field4400[14] = var8;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lnw;ILdb;IB)V",
		garbageValue = "-6"
	)
	void method2758(class388 var1, int var2, class115 var3, int var4) {
		float[] var5 = var3.method2649(this.field1536);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1532[var2] != null) {
			class117 var9 = this.field1532[var2][6];
			class117 var10 = this.field1532[var2][7];
			class117 var11 = this.field1532[var2][8];
			if (var9 != null) {
				var6 = var9.method2689(var4);
			}

			if (var10 != null) {
				var7 = var10.method2689(var4);
			}

			if (var11 != null) {
				var8 = var11.method2689(var4);
			}
		}

		class388 var12 = Tile.method3904();
		var12.method6814(var6, var7, var8);
		var1.method6816(var12);
		var12.method6865();
	}
}
