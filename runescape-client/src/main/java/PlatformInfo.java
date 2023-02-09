import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pu")
@Implements("PlatformInfo")
public class PlatformInfo extends Node {
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 157418053
	)
	int field4717;
	@ObfuscatedName("at")
	boolean field4726;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -49893931
	)
	int field4724;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 735467929
	)
	int field4728;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1390513459
	)
	int field4735;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1777154845
	)
	int field4731;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1791776075
	)
	int field4720;
	@ObfuscatedName("ac")
	boolean field4732;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1233820199
	)
	int field4730;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1281215561
	)
	int field4734;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 701970541
	)
	int field4748;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 365972939
	)
	int field4736;
	@ObfuscatedName("ah")
	String field4737;
	@ObfuscatedName("ad")
	String field4738;
	@ObfuscatedName("ab")
	String field4739;
	@ObfuscatedName("an")
	String field4740;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -618051943
	)
	int field4741;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1518623831
	)
	int field4727;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -554434077
	)
	int field4743;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1007178449
	)
	int field4744;
	@ObfuscatedName("bf")
	String field4719;
	@ObfuscatedName("bz")
	String field4746;
	@ObfuscatedName("br")
	int[] field4747;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 1466787915
	)
	int field4742;
	@ObfuscatedName("be")
	String field4749;
	@ObfuscatedName("bo")
	String field4750;

	PlatformInfo(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25, String var26) {
		this.field4747 = new int[3];
		this.field4717 = var1;
		this.field4726 = var2;
		this.field4724 = var3;
		this.field4728 = var4;
		this.field4735 = var5;
		this.field4731 = var6;
		this.field4720 = var7;
		this.field4732 = var8;
		this.field4730 = var9;
		this.field4734 = var10;
		this.field4748 = var11;
		this.field4736 = var12;
		this.field4737 = var13;
		this.field4738 = var14;
		this.field4739 = var15;
		this.field4740 = var16;
		this.field4741 = var17;
		this.field4727 = var18;
		this.field4743 = var19;
		this.field4744 = var20;
		this.field4719 = var21;
		this.field4746 = var22;
		this.field4747 = var23;
		this.field4742 = var24;
		this.field4749 = var25;
		this.field4750 = var26;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lrd;I)V",
		garbageValue = "1532139983"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(9);
		var1.writeByte(this.field4717);
		var1.writeByte(this.field4726 ? 1 : 0);
		var1.writeShort(this.field4724);
		var1.writeByte(this.field4728);
		var1.writeByte(this.field4735);
		var1.writeByte(this.field4731);
		var1.writeByte(this.field4720);
		var1.writeByte(this.field4732 ? 1 : 0);
		var1.writeShort(this.field4730);
		var1.writeByte(this.field4734);
		var1.writeMedium(this.field4748);
		var1.writeShort(this.field4736);
		var1.writeStringCp1252NullCircumfixed(this.field4737);
		var1.writeStringCp1252NullCircumfixed(this.field4738);
		var1.writeStringCp1252NullCircumfixed(this.field4739);
		var1.writeStringCp1252NullCircumfixed(this.field4740);
		var1.writeByte(this.field4727);
		var1.writeShort(this.field4741);
		var1.writeStringCp1252NullCircumfixed(this.field4719);
		var1.writeStringCp1252NullCircumfixed(this.field4746);
		var1.writeByte(this.field4743);
		var1.writeByte(this.field4744);

		for (int var2 = 0; var2 < this.field4747.length; ++var2) {
			var1.writeInt(this.field4747[var2]);
		}

		var1.writeInt(this.field4742);
		var1.writeStringCp1252NullCircumfixed(this.field4749);
		var1.writeStringCp1252NullCircumfixed(this.field4750);
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1699578121"
	)
	@Export("size")
	public int size() {
		byte var1 = 39;
		String var4 = this.field4737;
		int var3 = var4.length() + 2;
		int var26 = var1 + var3;
		String var7 = this.field4738;
		int var6 = var7.length() + 2;
		var26 += var6;
		String var10 = this.field4739;
		int var9 = var10.length() + 2;
		var26 += var9;
		String var13 = this.field4740;
		int var12 = var13.length() + 2;
		var26 += var12;
		String var16 = this.field4719;
		int var15 = var16.length() + 2;
		var26 += var15;
		String var19 = this.field4746;
		int var18 = var19.length() + 2;
		var26 += var18;
		String var22 = this.field4749;
		int var21 = var22.length() + 2;
		var26 += var21;
		String var25 = this.field4750;
		int var24 = var25.length() + 2;
		var26 += var24;
		return var26;
	}
}
