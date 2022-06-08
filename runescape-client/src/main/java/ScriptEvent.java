import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cr")
@Implements("ScriptEvent")
public class ScriptEvent extends Node {
	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "[Lqd;"
	)
	@Export("modIconSprites")
	static IndexedSprite[] modIconSprites;
	@ObfuscatedName("o")
	@Export("args")
	Object[] args;
	@ObfuscatedName("q")
	boolean field1052;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	@Export("widget")
	Widget widget;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1486957431
	)
	@Export("mouseX")
	int mouseX;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -2142202081
	)
	@Export("mouseY")
	int mouseY;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 19118051
	)
	@Export("opIndex")
	int opIndex;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	@Export("dragTarget")
	Widget dragTarget;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -337661445
	)
	@Export("keyTyped")
	int keyTyped;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -2123703635
	)
	@Export("keyPressed")
	int keyPressed;
	@ObfuscatedName("v")
	@Export("targetName")
	String targetName;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 702616363
	)
	int field1054;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -394904135
	)
	@Export("type")
	int type;

	public ScriptEvent() {
		this.type = 76;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;B)V",
		garbageValue = "3"
	)
	@Export("setArgs")
	public void setArgs(Object[] var1) {
		this.args = var1;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1156737002"
	)
	@Export("setType")
	public void setType(int var1) {
		this.type = var1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "520194545"
	)
	static void method2074() {
		class82.field1072 = new int[2000];
		int var0 = 0;
		int var1 = 240;

		int var3;
		for (byte var2 = 12; var0 < 16; var1 -= var2) {
			var3 = class127.method2805((double)((float)var1 / 360.0F), 0.9998999834060669D, (double)(0.075F + (float)var0 * 0.425F / 16.0F));
			class82.field1072[var0] = var3;
			++var0;
		}

		var1 = 48;

		for (int var5 = var1 / 6; var0 < class82.field1072.length; var1 -= var5) {
			var3 = var0 * 2;

			for (int var4 = class127.method2805((double)((float)var1 / 360.0F), 0.9998999834060669D, 0.5D); var0 < var3 && var0 < class82.field1072.length; ++var0) {
				class82.field1072[var0] = var4;
			}
		}

	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZZI)V",
		garbageValue = "-1817866678"
	)
	@Export("openURL")
	public static void openURL(String var0, boolean var1, boolean var2) {
		World.method1663(var0, var1, "openjs", var2);
	}

	@ObfuscatedName("p")
	public static int method2085(long var0) {
		return (int)(var0 >>> 7 & 127L);
	}
}
