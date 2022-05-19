import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("da")
public class class119 implements MouseWheel {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static final class119 field1508;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static final class119 field1512;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static final class119 field1502;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static final class119 field1516;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static final class119 field1518;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static final class119 field1521;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static final class119 field1506;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static final class119 field1507;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static final class119 field1500;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static final class119 field1509;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static final class119 field1510;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static final class119 field1511;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static final class119 field1503;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static final class119 field1513;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static final class119 field1514;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static final class119 field1515;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static final class119 field1504;
	@ObfuscatedName("ac")
	@Export("fontHelvetica13")
	static java.awt.Font fontHelvetica13;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1636917821
	)
	final int field1517;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1474083167
	)
	final int field1505;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1038102121
	)
	final int field1519;

	static {
		field1508 = new class119(0, 0, (String)null, -1, -1);
		field1512 = new class119(1, 1, (String)null, 0, 2);
		field1502 = new class119(2, 2, (String)null, 1, 2);
		field1516 = new class119(3, 3, (String)null, 2, 2);
		field1518 = new class119(4, 4, (String)null, 3, 1);
		field1521 = new class119(5, 5, (String)null, 4, 1);
		field1506 = new class119(6, 6, (String)null, 5, 1);
		field1507 = new class119(7, 7, (String)null, 6, 3);
		field1500 = new class119(8, 8, (String)null, 7, 3);
		field1509 = new class119(9, 9, (String)null, 8, 3);
		field1510 = new class119(10, 10, (String)null, 0, 7);
		field1511 = new class119(11, 11, (String)null, 1, 7);
		field1503 = new class119(12, 12, (String)null, 2, 7);
		field1513 = new class119(13, 13, (String)null, 3, 7);
		field1514 = new class119(14, 14, (String)null, 4, 7);
		field1515 = new class119(15, 15, (String)null, 5, 7);
		field1504 = new class119(16, 16, (String)null, 0, 5);
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;II)V",
		garbageValue = "-1"
	)
	class119(int var1, int var2, String var3, int var4, int var5) {
		this.field1517 = var1;
		this.field1505 = var2;
		this.field1519 = var4;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "30"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1505;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	int method2738() {
		return this.field1519;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "([BB)Ljava/lang/String;",
		garbageValue = "-27"
	)
	public static String method2745(byte[] var0) {
		int var2 = var0.length;
		StringBuilder var3 = new StringBuilder();

		for (int var4 = 0; var4 < var2 + 0; var4 += 3) {
			int var5 = var0[var4] & 255;
			var3.append(class342.field4158[var5 >>> 2]);
			if (var4 < var2 - 1) {
				int var6 = var0[var4 + 1] & 255;
				var3.append(class342.field4158[(var5 & 3) << 4 | var6 >>> 4]);
				if (var4 < var2 - 2) {
					int var7 = var0[var4 + 2] & 255;
					var3.append(class342.field4158[(var6 & 15) << 2 | var7 >>> 6]).append(class342.field4158[var7 & 63]);
				} else {
					var3.append(class342.field4158[(var6 & 15) << 2]).append("=");
				}
			} else {
				var3.append(class342.field4158[(var5 & 3) << 4]).append("==");
			}
		}

		String var1 = var3.toString();
		return var1;
	}

	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-197494883"
	)
	static void method2739(int var0, int var1) {
		int var2 = ChatChannel.fontBold12.stringWidth("Choose Option");

		int var3;
		for (var3 = 0; var3 < Client.menuOptionsCount; ++var3) {
			Font var7 = ChatChannel.fontBold12;
			String var8;
			if (var3 < 0) {
				var8 = "";
			} else if (Client.menuTargets[var3].length() > 0) {
				var8 = Client.menuActions[var3] + " " + Client.menuTargets[var3];
			} else {
				var8 = Client.menuActions[var3];
			}

			int var6 = var7.stringWidth(var8);
			if (var6 > var2) {
				var2 = var6;
			}
		}

		var2 += 8;
		var3 = Client.menuOptionsCount * 15 + 22;
		int var4 = var0 - var2 / 2;
		if (var2 + var4 > GraphicsObject.canvasWidth) {
			var4 = GraphicsObject.canvasWidth - var2;
		}

		if (var4 < 0) {
			var4 = 0;
		}

		int var5 = var1;
		if (var1 + var3 > class433.canvasHeight) {
			var5 = class433.canvasHeight - var3;
		}

		if (var5 < 0) {
			var5 = 0;
		}

		BuddyRankComparator.menuX = var4;
		FontName.menuY = var5;
		KeyHandler.menuWidth = var2;
		class7.menuHeight = Client.menuOptionsCount * 15 + 22;
	}

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-58"
	)
	static void method2737() {
		for (InterfaceParent var0 = (InterfaceParent)Client.interfaceParents.first(); var0 != null; var0 = (InterfaceParent)Client.interfaceParents.next()) {
			int var1 = var0.group;
			if (WorldMapDecoration.loadInterface(var1)) {
				boolean var2 = true;
				Widget[] var3 = NetSocket.Widget_interfaceComponents[var1];

				int var4;
				for (var4 = 0; var4 < var3.length; ++var4) {
					if (var3[var4] != null) {
						var2 = var3[var4].isIf3;
						break;
					}
				}

				if (!var2) {
					var4 = (int)var0.key;
					Widget var5 = class92.getWidget(var4);
					if (var5 != null) {
						GrandExchangeOfferTotalQuantityComparator.method5781(var5);
					}
				}
			}
		}

	}
}
