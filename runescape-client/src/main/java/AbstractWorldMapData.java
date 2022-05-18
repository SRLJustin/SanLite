import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ib")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
	@ObfuscatedName("tk")
	@ObfuscatedGetter(
		intValue = -659186048
	)
	static int field2851;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -158371392
	)
	@Export("regionXLow")
	int regionXLow;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -838455296
	)
	@Export("regionYLow")
	int regionYLow;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1037344187
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1460800009
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 716017053
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1555977189
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1656704067
	)
	@Export("groupId")
	int groupId;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 96165071
	)
	@Export("fileId")
	int fileId;
	@ObfuscatedName("w")
	@Export("floorUnderlayIds")
	short[][][] floorUnderlayIds;
	@ObfuscatedName("b")
	@Export("floorOverlayIds")
	short[][][] floorOverlayIds;
	@ObfuscatedName("t")
	byte[][][] field2845;
	@ObfuscatedName("g")
	byte[][][] field2847;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "[[[[Liy;"
	)
	@Export("decorations")
	WorldMapDecoration[][][][] decorations;
	@ObfuscatedName("n")
	boolean field2848;
	@ObfuscatedName("e")
	boolean field2850;

	AbstractWorldMapData() {
		this.groupId = -1;
		this.fileId = -1;
		new LinkedList();
		this.field2848 = false;
		this.field2850 = false;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)V",
		garbageValue = "933342926"
	)
	@Export("readGeography")
	abstract void readGeography(Buffer var1);

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "39"
	)
	@Export("isFullyLoaded")
	boolean isFullyLoaded() {
		return this.field2848 && this.field2850;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Llp;B)V",
		garbageValue = "1"
	)
	@Export("loadGeography")
	void loadGeography(AbstractArchive var1) {
		if (!this.isFullyLoaded()) {
			byte[] var2 = var1.takeFile(this.groupId, this.fileId);
			if (var2 != null) {
				this.readGeography(new Buffer(var2));
				this.field2848 = true;
				this.field2850 = true;
			}

		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2016462267"
	)
	@Export("reset")
	void reset() {
		this.floorUnderlayIds = null;
		this.floorOverlayIds = null;
		this.field2845 = null;
		this.field2847 = null;
		this.decorations = null;
		this.field2848 = false;
		this.field2850 = false;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IILpx;I)V",
		garbageValue = "1843686575"
	)
	@Export("readTile")
	void readTile(int var1, int var2, Buffer var3) {
		int var4 = var3.readUnsignedByte();
		if (var4 != 0) {
			if ((var4 & 1) != 0) {
				this.method4769(var1, var2, var3, var4);
			} else {
				this.method4770(var1, var2, var3, var4);
			}

		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IILpx;IB)V",
		garbageValue = "18"
	)
	void method4769(int var1, int var2, Buffer var3, int var4) {
		boolean var5 = (var4 & 2) != 0;
		if (var5) {
			this.floorOverlayIds[0][var1][var2] = (short)var3.readUnsignedByte();
		}

		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedByte();
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IILpx;IB)V",
		garbageValue = "44"
	)
	void method4770(int var1, int var2, Buffer var3, int var4) {
		int var5 = ((var4 & 24) >> 3) + 1;
		boolean var6 = (var4 & 2) != 0;
		boolean var7 = (var4 & 4) != 0;
		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedByte();
		int var8;
		int var9;
		int var11;
		if (var6) {
			var8 = var3.readUnsignedByte();

			for (var9 = 0; var9 < var8; ++var9) {
				int var14 = var3.readUnsignedByte();
				if (var14 != 0) {
					this.floorOverlayIds[var9][var1][var2] = (short)var14;
					var11 = var3.readUnsignedByte();
					this.field2845[var9][var1][var2] = (byte)(var11 >> 2);
					this.field2847[var9][var1][var2] = (byte)(var11 & 3);
				}
			}
		}

		if (var7) {
			for (var8 = 0; var8 < var5; ++var8) {
				var9 = var3.readUnsignedByte();
				if (var9 != 0) {
					WorldMapDecoration[] var10 = this.decorations[var8][var1][var2] = new WorldMapDecoration[var9];

					for (var11 = 0; var11 < var9; ++var11) {
						int var12 = var3.method7532();
						int var13 = var3.readUnsignedByte();
						var10[var11] = new WorldMapDecoration(var12, var13 >> 2, var13 & 3);
					}
				}
			}
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "608097340"
	)
	@Export("getRegionX")
	int getRegionX() {
		return this.regionX;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2122627873"
	)
	@Export("getRegionY")
	int getRegionY() {
		return this.regionY;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Lkt;",
		garbageValue = "406038723"
	)
	public static GameBuild method4799(int var0) {
		GameBuild[] var1 = new GameBuild[]{GameBuild.LIVE, GameBuild.BUILDLIVE, GameBuild.WIP, GameBuild.RC};
		GameBuild[] var2 = var1;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			GameBuild var4 = var2[var3];
			if (var0 == var4.buildId) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Llp;Llp;ZII)V",
		garbageValue = "-598382128"
	)
	static void method4800(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
		if (Login.clearLoginScreen) {
			if (var3 == 4) {
				class126.method2799(4);
			}

		} else {
			if (var3 == 0) {
				WorldMapData_1.method4706(var2);
			} else {
				class126.method2799(var3);
			}

			Rasterizer2D.Rasterizer2D_clear();
			byte[] var4 = var0.takeFileByNames("title.jpg", "");
			UserComparator6.leftTitleSprite = Frames.method4217(var4);
			SecureRandomCallable.rightTitleSprite = UserComparator6.leftTitleSprite.mirrorHorizontally();
			int var5 = Client.worldProperties;
			if ((var5 & 536870912) != 0) {
				Clock.logoSprite = JagexCache.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", "");
			} else if ((var5 & 1073741824) != 0) {
				Clock.logoSprite = JagexCache.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", "");
			} else {
				Clock.logoSprite = JagexCache.SpriteBuffer_getIndexedSpriteByName(var1, "logo", "");
			}

			Login.titleboxSprite = JagexCache.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", "");
			Login.titlebuttonSprite = JagexCache.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", "");
			Clock.field1839 = JagexCache.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_large", "");
			Login.field882 = JagexCache.SpriteBuffer_getIndexedSpriteByName(var1, "play_now_text", "");
			JagexCache.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_wide42,1", "");
			int var7 = var1.getGroupId("runes");
			int var8 = var1.getFileId(var7, "");
			IndexedSprite[] var6 = ItemContainer.method2062(var1, var7, var8);
			Login.runesSprite = var6;
			var8 = var1.getGroupId("title_mute");
			int var9 = var1.getFileId(var8, "");
			IndexedSprite[] var11 = ItemContainer.method2062(var1, var8, var9);
			class358.field4260 = var11;
			class67.field872 = JagexCache.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", "");
			Login.field888 = JagexCache.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", "");
			class101.field1360 = JagexCache.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", "");
			UrlRequester.field1354 = JagexCache.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", "");
			class16.field81 = class67.field872.subWidth;
			class268.field3212 = class67.field872.subHeight;
			class193.loginScreenRunesAnimation = new LoginScreenAnimation(Login.runesSprite);
			if (var2) {
				Login.Login_username = "";
				Login.Login_password = "";
				Login.field876 = new String[8];
				Login.field896 = 0;
			}

			WorldMapCacheName.field2912 = 0;
			class92.otp = "";
			Login.field900 = true;
			Login.worldSelectOpen = false;
			if (!class12.clientPreferences.method2226()) {
				Archive var12 = AbstractUserComparator.archive6;
				var9 = var12.getGroupId("scape main");
				int var10 = var12.getFileId(var9, "");
				UserComparator4.method2573(2, var12, var9, var10, 255, false);
			} else {
				UrlRequester.method2538(2);
			}

			MouseRecorder.method2088(false);
			Login.clearLoginScreen = true;
			Login.xPadding = (GraphicsObject.canvasWidth - 765) / 2;
			Login.loginBoxX = Login.xPadding + 202;
			Decimator.loginBoxCenter = Login.loginBoxX + 180;
			UserComparator6.leftTitleSprite.drawAt(Login.xPadding, 0);
			SecureRandomCallable.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			Clock.logoSprite.drawAt(Login.xPadding + 382 - Clock.logoSprite.subWidth / 2, 18);
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-707674670"
	)
	@Export("runWidgetOnLoadListener")
	static void runWidgetOnLoadListener(int var0) {
		if (var0 != -1) {
			if (WorldMapDecoration.loadInterface(var0)) {
				Widget[] var1 = NetSocket.Widget_interfaceComponents[var0];

				for (int var2 = 0; var2 < var1.length; ++var2) {
					Widget var3 = var1[var2];
					if (var3.onLoad != null) {
						ScriptEvent var4 = new ScriptEvent();
						var4.widget = var3;
						var4.args = var3.onLoad;
						class10.runScript(var4, 5000000, 0);
					}
				}

			}
		}
	}
}
