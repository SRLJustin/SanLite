import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nt")
public class class389 {
	@ObfuscatedName("o")
	float field4410;
	@ObfuscatedName("q")
	float field4405;
	@ObfuscatedName("l")
	float field4406;
	@ObfuscatedName("k")
	float field4407;
	@ObfuscatedName("a")
	float field4409;
	@ObfuscatedName("m")
	float field4412;
	@ObfuscatedName("p")
	float field4413;
	@ObfuscatedName("s")
	float field4411;
	@ObfuscatedName("r")
	float field4404;
	@ObfuscatedName("v")
	float field4408;
	@ObfuscatedName("y")
	float field4414;
	@ObfuscatedName("c")
	float field4415;

	static {
		new class389();
	}

	class389() {
		this.method6876();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1906485872"
	)
	void method6876() {
		this.field4415 = 0.0F;
		this.field4414 = 0.0F;
		this.field4408 = 0.0F;
		this.field4411 = 0.0F;
		this.field4413 = 0.0F;
		this.field4412 = 0.0F;
		this.field4407 = 0.0F;
		this.field4406 = 0.0F;
		this.field4405 = 0.0F;
		this.field4404 = 1.0F;
		this.field4409 = 1.0F;
		this.field4410 = 1.0F;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "-1653714241"
	)
	void method6877(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field4405;
		float var5 = this.field4409;
		float var6 = this.field4411;
		float var7 = this.field4414;
		this.field4405 = var4 * var2 - this.field4406 * var3;
		this.field4406 = this.field4406 * var2 + var3 * var4;
		this.field4409 = var5 * var2 - var3 * this.field4412;
		this.field4412 = var3 * var5 + this.field4412 * var2;
		this.field4411 = var6 * var2 - this.field4404 * var3;
		this.field4404 = var3 * var6 + var2 * this.field4404;
		this.field4414 = var2 * var7 - var3 * this.field4415;
		this.field4415 = var2 * this.field4415 + var7 * var3;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "1318784664"
	)
	void method6878(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field4410;
		float var5 = this.field4407;
		float var6 = this.field4413;
		float var7 = this.field4408;
		this.field4410 = var4 * var2 + this.field4406 * var3;
		this.field4406 = this.field4406 * var2 - var4 * var3;
		this.field4407 = var5 * var2 + var3 * this.field4412;
		this.field4412 = var2 * this.field4412 - var5 * var3;
		this.field4413 = var2 * var6 + var3 * this.field4404;
		this.field4404 = var2 * this.field4404 - var6 * var3;
		this.field4408 = this.field4415 * var3 + var7 * var2;
		this.field4415 = this.field4415 * var2 - var3 * var7;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "1867033025"
	)
	void method6879(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field4410;
		float var5 = this.field4407;
		float var6 = this.field4413;
		float var7 = this.field4408;
		this.field4410 = var2 * var4 - var3 * this.field4405;
		this.field4405 = var4 * var3 + var2 * this.field4405;
		this.field4407 = var5 * var2 - this.field4409 * var3;
		this.field4409 = var5 * var3 + this.field4409 * var2;
		this.field4413 = var2 * var6 - var3 * this.field4411;
		this.field4411 = var6 * var3 + this.field4411 * var2;
		this.field4408 = var2 * var7 - var3 * this.field4414;
		this.field4414 = this.field4414 * var2 + var7 * var3;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "-1766831994"
	)
	void method6887(float var1, float var2, float var3) {
		this.field4408 += var1;
		this.field4414 += var2;
		this.field4415 += var3;
	}

	public String toString() {
		return this.field4410 + "," + this.field4407 + "," + this.field4413 + "," + this.field4408 + "\n" + this.field4405 + "," + this.field4409 + "," + this.field4411 + "," + this.field4414 + "\n" + this.field4406 + "," + this.field4412 + "," + this.field4404 + "," + this.field4415;
	}
}
