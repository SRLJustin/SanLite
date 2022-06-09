import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nw")
public final class class388 {
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "[Lnw;"
	)
	static class388[] field4402;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -96166557
	)
	static int field4401;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	public static final class388 field4403;
	@ObfuscatedName("a")
	public float[] field4400;

	static {
		field4402 = new class388[0];
		MilliClock.method3219(100);
		field4403 = new class388();
	}

	public class388() {
		this.field4400 = new float[16];
		this.method6861();
	}

	@ObfuscatedSignature(
		descriptor = "(Lnw;)V"
	)
	public class388(class388 var1) {
		this.field4400 = new float[16];
		this.method6868(var1);
	}

	@ObfuscatedSignature(
		descriptor = "(Lpx;Z)V"
	)
	public class388(Buffer var1, boolean var2) {
		this.field4400 = new float[16];
		this.method6808(var1, var2);
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-830138790"
	)
	public void method6865() {
		synchronized(field4402) {
			if (field4401 < GrandExchangeOfferTotalQuantityComparator.field4069 - 1) {
				field4402[++field4401 - 1] = this;
			}

		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lpx;ZI)V",
		garbageValue = "-1065467020"
	)
	void method6808(Buffer var1, boolean var2) {
		if (var2) {
			class389 var4 = new class389();
			var4.method6877(ByteArrayPool.method6364(var1.readShort()));
			var4.method6878(ByteArrayPool.method6364(var1.readShort()));
			var4.method6879(ByteArrayPool.method6364(var1.readShort()));
			var4.method6887((float)var1.readShort(), (float)var1.readShort(), (float)var1.readShort());
			this.method6812(var4);
		} else {
			for (int var3 = 0; var3 < 16; ++var3) {
				this.field4400[var3] = var1.method7570();
			}
		}

	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "817063007"
	)
	float[] method6809() {
		float[] var1 = new float[3];
		if ((double)this.field4400[2] < 0.999D && (double)this.field4400[2] > -0.999D) {
			var1[1] = (float)(-Math.asin((double)this.field4400[2]));
			double var2 = Math.cos((double)var1[1]);
			var1[0] = (float)Math.atan2((double)this.field4400[6] / var2, (double)this.field4400[10] / var2);
			var1[2] = (float)Math.atan2((double)this.field4400[1] / var2, (double)this.field4400[0] / var2);
		} else {
			var1[0] = 0.0F;
			var1[1] = (float)Math.atan2((double)this.field4400[2], 0.0D);
			var1[2] = (float)Math.atan2((double)(-this.field4400[9]), (double)this.field4400[5]);
		}

		return var1;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "796221265"
	)
	public float[] method6810() {
		float[] var1 = new float[]{(float)(-Math.asin((double)this.field4400[6])), 0.0F, 0.0F};
		double var2 = Math.cos((double)var1[0]);
		double var4;
		double var6;
		if (Math.abs(var2) > 0.005D) {
			var4 = (double)this.field4400[2];
			var6 = (double)this.field4400[10];
			double var8 = (double)this.field4400[4];
			double var10 = (double)this.field4400[5];
			var1[1] = (float)Math.atan2(var4, var6);
			var1[2] = (float)Math.atan2(var8, var10);
		} else {
			var4 = (double)this.field4400[1];
			var6 = (double)this.field4400[0];
			if (this.field4400[6] < 0.0F) {
				var1[1] = (float)Math.atan2(var4, var6);
			} else {
				var1[1] = (float)(-Math.atan2(var4, var6));
			}

			var1[2] = 0.0F;
		}

		return var1;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1318194285"
	)
	void method6861() {
		this.field4400[0] = 1.0F;
		this.field4400[1] = 0.0F;
		this.field4400[2] = 0.0F;
		this.field4400[3] = 0.0F;
		this.field4400[4] = 0.0F;
		this.field4400[5] = 1.0F;
		this.field4400[6] = 0.0F;
		this.field4400[7] = 0.0F;
		this.field4400[8] = 0.0F;
		this.field4400[9] = 0.0F;
		this.field4400[10] = 1.0F;
		this.field4400[11] = 0.0F;
		this.field4400[12] = 0.0F;
		this.field4400[13] = 0.0F;
		this.field4400[14] = 0.0F;
		this.field4400[15] = 1.0F;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2033689784"
	)
	public void method6829() {
		this.field4400[0] = 0.0F;
		this.field4400[1] = 0.0F;
		this.field4400[2] = 0.0F;
		this.field4400[3] = 0.0F;
		this.field4400[4] = 0.0F;
		this.field4400[5] = 0.0F;
		this.field4400[6] = 0.0F;
		this.field4400[7] = 0.0F;
		this.field4400[8] = 0.0F;
		this.field4400[9] = 0.0F;
		this.field4400[10] = 0.0F;
		this.field4400[11] = 0.0F;
		this.field4400[12] = 0.0F;
		this.field4400[13] = 0.0F;
		this.field4400[14] = 0.0F;
		this.field4400[15] = 0.0F;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lnw;B)V",
		garbageValue = "37"
	)
	public void method6868(class388 var1) {
		System.arraycopy(var1.field4400, 0, this.field4400, 0, 16);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(FB)V",
		garbageValue = "114"
	)
	public void method6806(float var1) {
		this.method6814(var1, var1, var1);
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "627006193"
	)
	public void method6814(float var1, float var2, float var3) {
		this.method6861();
		this.field4400[0] = var1;
		this.field4400[5] = var2;
		this.field4400[10] = var3;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lnw;I)V",
		garbageValue = "-1672549450"
	)
	public void method6815(class388 var1) {
		for (int var2 = 0; var2 < this.field4400.length; ++var2) {
			float[] var10000 = this.field4400;
			var10000[var2] += var1.field4400[var2];
		}

	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lnw;B)V",
		garbageValue = "0"
	)
	public void method6816(class388 var1) {
		float var2 = var1.field4400[8] * this.field4400[2] + var1.field4400[4] * this.field4400[1] + var1.field4400[0] * this.field4400[0] + this.field4400[3] * var1.field4400[12];
		float var3 = this.field4400[1] * var1.field4400[5] + var1.field4400[1] * this.field4400[0] + var1.field4400[9] * this.field4400[2] + var1.field4400[13] * this.field4400[3];
		float var4 = this.field4400[2] * var1.field4400[10] + this.field4400[1] * var1.field4400[6] + var1.field4400[2] * this.field4400[0] + this.field4400[3] * var1.field4400[14];
		float var5 = this.field4400[3] * var1.field4400[15] + var1.field4400[11] * this.field4400[2] + var1.field4400[3] * this.field4400[0] + this.field4400[1] * var1.field4400[7];
		float var6 = this.field4400[7] * var1.field4400[12] + this.field4400[4] * var1.field4400[0] + var1.field4400[4] * this.field4400[5] + this.field4400[6] * var1.field4400[8];
		float var7 = var1.field4400[1] * this.field4400[4] + var1.field4400[5] * this.field4400[5] + var1.field4400[9] * this.field4400[6] + var1.field4400[13] * this.field4400[7];
		float var8 = this.field4400[6] * var1.field4400[10] + this.field4400[4] * var1.field4400[2] + var1.field4400[6] * this.field4400[5] + this.field4400[7] * var1.field4400[14];
		float var9 = this.field4400[4] * var1.field4400[3] + this.field4400[5] * var1.field4400[7] + this.field4400[6] * var1.field4400[11] + this.field4400[7] * var1.field4400[15];
		float var10 = this.field4400[9] * var1.field4400[4] + var1.field4400[0] * this.field4400[8] + var1.field4400[8] * this.field4400[10] + this.field4400[11] * var1.field4400[12];
		float var11 = var1.field4400[1] * this.field4400[8] + var1.field4400[5] * this.field4400[9] + this.field4400[10] * var1.field4400[9] + var1.field4400[13] * this.field4400[11];
		float var12 = var1.field4400[14] * this.field4400[11] + var1.field4400[6] * this.field4400[9] + var1.field4400[2] * this.field4400[8] + var1.field4400[10] * this.field4400[10];
		float var13 = var1.field4400[15] * this.field4400[11] + var1.field4400[11] * this.field4400[10] + var1.field4400[7] * this.field4400[9] + this.field4400[8] * var1.field4400[3];
		float var14 = var1.field4400[8] * this.field4400[14] + this.field4400[13] * var1.field4400[4] + var1.field4400[0] * this.field4400[12] + var1.field4400[12] * this.field4400[15];
		float var15 = var1.field4400[13] * this.field4400[15] + var1.field4400[9] * this.field4400[14] + this.field4400[13] * var1.field4400[5] + var1.field4400[1] * this.field4400[12];
		float var16 = this.field4400[13] * var1.field4400[6] + this.field4400[12] * var1.field4400[2] + this.field4400[14] * var1.field4400[10] + this.field4400[15] * var1.field4400[14];
		float var17 = this.field4400[12] * var1.field4400[3] + var1.field4400[7] * this.field4400[13] + this.field4400[14] * var1.field4400[11] + var1.field4400[15] * this.field4400[15];
		this.field4400[0] = var2;
		this.field4400[1] = var3;
		this.field4400[2] = var4;
		this.field4400[3] = var5;
		this.field4400[4] = var6;
		this.field4400[5] = var7;
		this.field4400[6] = var8;
		this.field4400[7] = var9;
		this.field4400[8] = var10;
		this.field4400[9] = var11;
		this.field4400[10] = var12;
		this.field4400[11] = var13;
		this.field4400[12] = var14;
		this.field4400[13] = var15;
		this.field4400[14] = var16;
		this.field4400[15] = var17;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lnh;I)V",
		garbageValue = "74712963"
	)
	public void method6817(class387 var1) {
		float var2 = var1.field4397 * var1.field4397;
		float var3 = var1.field4393 * var1.field4397;
		float var4 = var1.field4397 * var1.field4394;
		float var5 = var1.field4396 * var1.field4397;
		float var6 = var1.field4393 * var1.field4393;
		float var7 = var1.field4394 * var1.field4393;
		float var8 = var1.field4396 * var1.field4393;
		float var9 = var1.field4394 * var1.field4394;
		float var10 = var1.field4394 * var1.field4396;
		float var11 = var1.field4396 * var1.field4396;
		this.field4400[0] = var2 + var6 - var11 - var9;
		this.field4400[1] = var7 + var5 + var7 + var5;
		this.field4400[2] = var8 - var4 - var4 + var8;
		this.field4400[4] = var7 + (var7 - var5 - var5);
		this.field4400[5] = var9 + var2 - var6 - var11;
		this.field4400[6] = var10 + var3 + var10 + var3;
		this.field4400[8] = var4 + var8 + var4 + var8;
		this.field4400[9] = var10 + (var10 - var3 - var3);
		this.field4400[10] = var2 + var11 - var9 - var6;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "-51279559"
	)
	void method6812(class389 var1) {
		this.field4400[0] = var1.field4410;
		this.field4400[1] = var1.field4405;
		this.field4400[2] = var1.field4406;
		this.field4400[3] = 0.0F;
		this.field4400[4] = var1.field4407;
		this.field4400[5] = var1.field4409;
		this.field4400[6] = var1.field4412;
		this.field4400[7] = 0.0F;
		this.field4400[8] = var1.field4413;
		this.field4400[9] = var1.field4411;
		this.field4400[10] = var1.field4404;
		this.field4400[11] = 0.0F;
		this.field4400[12] = var1.field4408;
		this.field4400[13] = var1.field4414;
		this.field4400[14] = var1.field4415;
		this.field4400[15] = 1.0F;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)F",
		garbageValue = "1576396889"
	)
	float method6819() {
		return this.field4400[12] * this.field4400[9] * this.field4400[6] * this.field4400[3] + (this.field4400[5] * this.field4400[3] * this.field4400[8] * this.field4400[14] + this.field4400[13] * this.field4400[4] * this.field4400[3] * this.field4400[10] + (this.field4400[13] * this.field4400[8] * this.field4400[7] * this.field4400[2] + this.field4400[4] * this.field4400[2] * this.field4400[9] * this.field4400[15] + this.field4400[7] * this.field4400[1] * this.field4400[10] * this.field4400[12] + (this.field4400[8] * this.field4400[1] * this.field4400[6] * this.field4400[15] + this.field4400[14] * this.field4400[1] * this.field4400[4] * this.field4400[11] + (this.field4400[0] * this.field4400[5] * this.field4400[10] * this.field4400[15] - this.field4400[14] * this.field4400[0] * this.field4400[5] * this.field4400[11] - this.field4400[15] * this.field4400[0] * this.field4400[6] * this.field4400[9] + this.field4400[0] * this.field4400[6] * this.field4400[11] * this.field4400[13] + this.field4400[9] * this.field4400[7] * this.field4400[0] * this.field4400[14] - this.field4400[13] * this.field4400[7] * this.field4400[0] * this.field4400[10] - this.field4400[15] * this.field4400[1] * this.field4400[4] * this.field4400[10]) - this.field4400[12] * this.field4400[6] * this.field4400[1] * this.field4400[11] - this.field4400[7] * this.field4400[1] * this.field4400[8] * this.field4400[14]) - this.field4400[13] * this.field4400[4] * this.field4400[2] * this.field4400[11] - this.field4400[15] * this.field4400[2] * this.field4400[5] * this.field4400[8] + this.field4400[12] * this.field4400[11] * this.field4400[2] * this.field4400[5] - this.field4400[9] * this.field4400[2] * this.field4400[7] * this.field4400[12] - this.field4400[14] * this.field4400[9] * this.field4400[3] * this.field4400[4]) - this.field4400[12] * this.field4400[3] * this.field4400[5] * this.field4400[10] - this.field4400[6] * this.field4400[3] * this.field4400[8] * this.field4400[13]);
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "122973203"
	)
	public void method6820() {
		float var1 = 1.0F / this.method6819();
		float var2 = (this.field4400[15] * this.field4400[10] * this.field4400[5] - this.field4400[11] * this.field4400[5] * this.field4400[14] - this.field4400[15] * this.field4400[6] * this.field4400[9] + this.field4400[13] * this.field4400[6] * this.field4400[11] + this.field4400[14] * this.field4400[7] * this.field4400[9] - this.field4400[7] * this.field4400[10] * this.field4400[13]) * var1;
		float var3 = var1 * (this.field4400[13] * this.field4400[10] * this.field4400[3] + (this.field4400[1] * this.field4400[11] * this.field4400[14] + this.field4400[15] * this.field4400[10] * -this.field4400[1] + this.field4400[2] * this.field4400[9] * this.field4400[15] - this.field4400[11] * this.field4400[2] * this.field4400[13] - this.field4400[9] * this.field4400[3] * this.field4400[14]));
		float var4 = var1 * (this.field4400[14] * this.field4400[5] * this.field4400[3] + this.field4400[2] * this.field4400[7] * this.field4400[13] + (this.field4400[6] * this.field4400[1] * this.field4400[15] - this.field4400[14] * this.field4400[7] * this.field4400[1] - this.field4400[15] * this.field4400[2] * this.field4400[5]) - this.field4400[13] * this.field4400[3] * this.field4400[6]);
		float var5 = var1 * (this.field4400[11] * -this.field4400[1] * this.field4400[6] + this.field4400[10] * this.field4400[7] * this.field4400[1] + this.field4400[11] * this.field4400[5] * this.field4400[2] - this.field4400[7] * this.field4400[2] * this.field4400[9] - this.field4400[10] * this.field4400[3] * this.field4400[5] + this.field4400[6] * this.field4400[3] * this.field4400[9]);
		float var6 = var1 * (this.field4400[15] * this.field4400[8] * this.field4400[6] + this.field4400[14] * this.field4400[11] * this.field4400[4] + this.field4400[10] * -this.field4400[4] * this.field4400[15] - this.field4400[11] * this.field4400[6] * this.field4400[12] - this.field4400[8] * this.field4400[7] * this.field4400[14] + this.field4400[12] * this.field4400[10] * this.field4400[7]);
		float var7 = (this.field4400[8] * this.field4400[3] * this.field4400[14] + this.field4400[11] * this.field4400[2] * this.field4400[12] + (this.field4400[15] * this.field4400[0] * this.field4400[10] - this.field4400[14] * this.field4400[0] * this.field4400[11] - this.field4400[15] * this.field4400[2] * this.field4400[8]) - this.field4400[12] * this.field4400[3] * this.field4400[10]) * var1;
		float var8 = var1 * (this.field4400[6] * this.field4400[3] * this.field4400[12] + (this.field4400[15] * -this.field4400[0] * this.field4400[6] + this.field4400[7] * this.field4400[0] * this.field4400[14] + this.field4400[15] * this.field4400[4] * this.field4400[2] - this.field4400[12] * this.field4400[7] * this.field4400[2] - this.field4400[14] * this.field4400[3] * this.field4400[4]));
		float var9 = var1 * (this.field4400[11] * this.field4400[6] * this.field4400[0] - this.field4400[10] * this.field4400[7] * this.field4400[0] - this.field4400[2] * this.field4400[4] * this.field4400[11] + this.field4400[2] * this.field4400[7] * this.field4400[8] + this.field4400[4] * this.field4400[3] * this.field4400[10] - this.field4400[6] * this.field4400[3] * this.field4400[8]);
		float var10 = (this.field4400[11] * this.field4400[5] * this.field4400[12] + (this.field4400[15] * this.field4400[4] * this.field4400[9] - this.field4400[13] * this.field4400[4] * this.field4400[11] - this.field4400[8] * this.field4400[5] * this.field4400[15]) + this.field4400[8] * this.field4400[7] * this.field4400[13] - this.field4400[12] * this.field4400[9] * this.field4400[7]) * var1;
		float var11 = (this.field4400[9] * this.field4400[3] * this.field4400[12] + (this.field4400[11] * this.field4400[0] * this.field4400[13] + this.field4400[9] * -this.field4400[0] * this.field4400[15] + this.field4400[8] * this.field4400[1] * this.field4400[15] - this.field4400[12] * this.field4400[11] * this.field4400[1] - this.field4400[3] * this.field4400[8] * this.field4400[13])) * var1;
		float var12 = var1 * (this.field4400[15] * this.field4400[5] * this.field4400[0] - this.field4400[0] * this.field4400[7] * this.field4400[13] - this.field4400[1] * this.field4400[4] * this.field4400[15] + this.field4400[7] * this.field4400[1] * this.field4400[12] + this.field4400[13] * this.field4400[3] * this.field4400[4] - this.field4400[12] * this.field4400[3] * this.field4400[5]);
		float var13 = var1 * (this.field4400[3] * this.field4400[5] * this.field4400[8] + (this.field4400[1] * this.field4400[4] * this.field4400[11] + this.field4400[7] * this.field4400[0] * this.field4400[9] + -this.field4400[0] * this.field4400[5] * this.field4400[11] - this.field4400[7] * this.field4400[1] * this.field4400[8] - this.field4400[9] * this.field4400[3] * this.field4400[4]));
		float var14 = (this.field4400[10] * this.field4400[4] * this.field4400[13] + this.field4400[9] * -this.field4400[4] * this.field4400[14] + this.field4400[8] * this.field4400[5] * this.field4400[14] - this.field4400[5] * this.field4400[10] * this.field4400[12] - this.field4400[13] * this.field4400[8] * this.field4400[6] + this.field4400[12] * this.field4400[6] * this.field4400[9]) * var1;
		float var15 = (this.field4400[14] * this.field4400[9] * this.field4400[0] - this.field4400[0] * this.field4400[10] * this.field4400[13] - this.field4400[1] * this.field4400[8] * this.field4400[14] + this.field4400[12] * this.field4400[1] * this.field4400[10] + this.field4400[8] * this.field4400[2] * this.field4400[13] - this.field4400[12] * this.field4400[9] * this.field4400[2]) * var1;
		float var16 = (this.field4400[14] * this.field4400[4] * this.field4400[1] + this.field4400[14] * this.field4400[5] * -this.field4400[0] + this.field4400[13] * this.field4400[6] * this.field4400[0] - this.field4400[12] * this.field4400[1] * this.field4400[6] - this.field4400[13] * this.field4400[4] * this.field4400[2] + this.field4400[5] * this.field4400[2] * this.field4400[12]) * var1;
		float var17 = (this.field4400[9] * this.field4400[2] * this.field4400[4] + this.field4400[5] * this.field4400[0] * this.field4400[10] - this.field4400[9] * this.field4400[0] * this.field4400[6] - this.field4400[1] * this.field4400[4] * this.field4400[10] + this.field4400[1] * this.field4400[6] * this.field4400[8] - this.field4400[8] * this.field4400[5] * this.field4400[2]) * var1;
		this.field4400[0] = var2;
		this.field4400[1] = var3;
		this.field4400[2] = var4;
		this.field4400[3] = var5;
		this.field4400[4] = var6;
		this.field4400[5] = var7;
		this.field4400[6] = var8;
		this.field4400[7] = var9;
		this.field4400[8] = var10;
		this.field4400[9] = var11;
		this.field4400[10] = var12;
		this.field4400[11] = var13;
		this.field4400[12] = var14;
		this.field4400[13] = var15;
		this.field4400[14] = var16;
		this.field4400[15] = var17;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "82"
	)
	public float[] method6821() {
		float[] var1 = new float[3];
		class386 var2 = new class386(this.field4400[0], this.field4400[1], this.field4400[2]);
		class386 var3 = new class386(this.field4400[4], this.field4400[5], this.field4400[6]);
		class386 var4 = new class386(this.field4400[8], this.field4400[9], this.field4400[10]);
		var1[0] = var2.method6771();
		var1[1] = var3.method6771();
		var1[2] = var4.method6771();
		return var1;
	}

	public int hashCode() {
		boolean var1 = true;
		byte var2 = 1;
		int var3 = 31 * var2 + Arrays.hashCode(this.field4400);
		return var3;
	}

	public String toString() {
		StringBuilder var1 = new StringBuilder();
		this.method6810();
		this.method6809();

		for (int var2 = 0; var2 < 4; ++var2) {
			for (int var3 = 0; var3 < 4; ++var3) {
				if (var3 > 0) {
					var1.append("\t");
				}

				float var4 = this.field4400[var3 + var2 * 4];
				if (Math.sqrt((double)(var4 * var4)) < 9.999999747378752E-5D) {
					var4 = 0.0F;
				}

				var1.append(var4);
			}

			var1.append("\n");
		}

		return var1.toString();
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class388)) {
			return false;
		} else {
			class388 var2 = (class388)var1;

			for (int var3 = 0; var3 < 16; ++var3) {
				if (this.field4400[var3] != var2.field4400[var3]) {
					return false;
				}
			}

			return true;
		}
	}
}
