import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cj")
public class class101 extends UrlRequester {
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lqd;"
	)
	static IndexedSprite field1360;
	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("archive14")
	static Archive archive14;

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lcb;I)V",
		garbageValue = "717056983"
	)
	void vmethod2544(UrlRequest var1) throws IOException {
		URLConnection var2 = null;

		try {
			try {
				String var3 = var1.url.getProtocol();
				if (var3.equals("http")) {
					var2 = this.method2542(var1);
				} else {
					if (!var3.equals("https")) {
						var1.isDone0 = true;
						return;
					}

					var2 = this.method2545(var1);
				}

				this.method2518(var2, var1);
			} catch (IOException var7) {
			}

		} finally {
			var1.isDone0 = true;
			if (var2 != null) {
				if (var2 instanceof HttpURLConnection) {
					((HttpURLConnection)var2).disconnect();
				} else if (var2 instanceof HttpsURLConnection) {
					((HttpsURLConnection)var2).disconnect();
				}
			}

		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lcb;B)Ljava/net/URLConnection;",
		garbageValue = "18"
	)
	URLConnection method2542(UrlRequest var1) throws IOException {
		URLConnection var2 = var1.url.openConnection();
		this.method2517(var2);
		return var2;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lcb;I)Ljava/net/URLConnection;",
		garbageValue = "2078171719"
	)
	URLConnection method2545(UrlRequest var1) throws IOException {
		HttpsURLConnection var2 = (HttpsURLConnection)var1.url.openConnection();
		var2.setSSLSocketFactory(new class15());
		this.method2517(var2);
		return var2;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)I",
		garbageValue = "64"
	)
	@Export("hashString")
	public static int hashString(CharSequence var0) {
		int var1 = var0.length();
		int var2 = 0;

		for (int var3 = 0; var3 < var1; ++var3) {
			var2 = (var2 << 5) - var2 + UserComparator5.charToByteCp1252(var0.charAt(var3));
		}

		return var2;
	}

	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "13"
	)
	static final int method2551() {
		if (class12.clientPreferences.method2222()) {
			return class128.Client_plane;
		} else {
			int var0 = class202.getTileHeight(class343.cameraX, FaceNormal.cameraZ, class128.Client_plane);
			return var0 - class295.cameraY < 800 && (Tiles.Tiles_renderFlags[class128.Client_plane][class343.cameraX >> 7][FaceNormal.cameraZ >> 7] & 4) != 0 ? class128.Client_plane : 3;
		}
	}

	@ObfuscatedName("lz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "85689367"
	)
	static void method2552() {
		if (class127.field1570 != null) {
			Client.field767 = Client.cycle;
			class127.field1570.method5851();

			for (int var0 = 0; var0 < Client.players.length; ++var0) {
				if (Client.players[var0] != null) {
					class127.field1570.method5848(SecureRandomCallable.baseX * 64 + (Client.players[var0].x >> 7), GrandExchangeOfferOwnWorldComparator.baseY * 64 + (Client.players[var0].y >> 7));
				}
			}
		}

	}
}
