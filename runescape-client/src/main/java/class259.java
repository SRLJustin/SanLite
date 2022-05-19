import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("io")
public class class259 {
	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	@Export("js5SocketTask")
	static Task js5SocketTask;

	@ObfuscatedName("gu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "-2064241274"
	)
	@Export("drawLoadingMessage")
	static final void drawLoadingMessage(String var0, boolean var1) {
		if (Client.showLoadingMessages) {
			byte var2 = 4;
			int var3 = var2 + 6;
			int var4 = var2 + 6;
			int var5 = class149.fontPlain12.lineWidth(var0, 250);
			int var6 = class149.fontPlain12.lineCount(var0, 250) * 13;
			Rasterizer2D.Rasterizer2D_fillRectangle(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
			Rasterizer2D.Rasterizer2D_drawRectangle(var3 - var2, var4 - var2, var5 + var2 + var2, var2 + var2 + var6, 16777215);
			class149.fontPlain12.drawLines(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
			class132.method2836(var3 - var2, var4 - var2, var2 + var2 + var5, var2 + var6 + var2);
			if (var1) {
				DevicePcmPlayerProvider.rasterProvider.drawFull(0, 0);
			} else {
				ItemContainer.method2061(var3, var4, var5, var6);
			}

		}
	}
}
