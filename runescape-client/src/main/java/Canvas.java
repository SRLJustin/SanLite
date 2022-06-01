import java.awt.Component;
import java.awt.Graphics;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("u")
@Implements("Canvas")
public final class Canvas extends java.awt.Canvas {
	@ObfuscatedName("lf")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	@Export("dragInventoryWidget")
	static Widget dragInventoryWidget;
	@ObfuscatedName("o")
	@Export("component")
	Component component;

	Canvas(Component var1) {
		this.component = var1;
	}

	public final void update(Graphics var1) {
		this.component.update(var1);
	}

	public final void paint(Graphics var1) {
		this.component.paint(var1);
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;II)I",
		garbageValue = "-989845700"
	)
	public static int method344(CharSequence var0, int var1) {
		return class202.method4016(var0, var1, true);
	}

	@ObfuscatedName("lr")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-35"
	)
	static void method347(int var0) {
		if (var0 != Client.loginState) {
			Client.loginState = var0;
		}
	}
}
