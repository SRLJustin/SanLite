import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kk")
public class class291 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lcb;"
	)
	UrlRequest field3356;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lqr;"
	)
	SpritePixels field3357;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lce;)V"
	)
	class291(String var1, UrlRequester var2) {
		try {
			this.field3356 = var2.request(new URL(var1));
		} catch (MalformedURLException var4) {
			this.field3356 = null;
		}

	}

	@ObfuscatedSignature(
		descriptor = "(Lcb;)V"
	)
	class291(UrlRequest var1) {
		this.field3356 = var1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Lqr;",
		garbageValue = "1905006321"
	)
	SpritePixels method5391() {
		if (this.field3357 == null && this.field3356 != null && this.field3356.isDone()) {
			if (this.field3356.getResponse() != null) {
				this.field3357 = Frames.method4217(this.field3356.getResponse());
			}

			this.field3356 = null;
		}

		return this.field3357;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "([Llk;II)Llk;",
		garbageValue = "-1552191752"
	)
	@Export("findEnumerated")
	public static MouseWheel findEnumerated(MouseWheel[] var0, int var1) {
		MouseWheel[] var2 = var0;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			MouseWheel var4 = var2[var3];
			if (var1 == var4.rsOrdinal()) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "16"
	)
	static final void method5390(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255);
		if (var0 != class12.clientPreferences.method2248()) {
			if (class12.clientPreferences.method2248() == 0 && Client.currentTrackGroupId != -1) {
				UserComparator8.method2574(AbstractUserComparator.archive6, Client.currentTrackGroupId, 0, var0, false);
				Client.field734 = false;
			} else if (var0 == 0) {
				ApproximateRouteStrategy.method1110();
				Client.field734 = false;
			} else if (class273.musicPlayerStatus != 0) {
				Clock.musicTrackVolume = var0;
			} else {
				class273.midiPcmStream.setPcmStreamVolume(var0);
			}

			class12.clientPreferences.method2234(var0);
		}

	}
}
