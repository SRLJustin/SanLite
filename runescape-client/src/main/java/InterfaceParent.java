import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ck")
@Implements("InterfaceParent")
public class InterfaceParent extends Node {
	@ObfuscatedName("sx")
	@ObfuscatedSignature(
		descriptor = "Lqr;"
	)
	@Export("sceneMinimapSprite")
	static SpritePixels sceneMinimapSprite;
	@ObfuscatedName("s")
	@Export("soundSystemExecutor")
	static ScheduledExecutorService soundSystemExecutor;
	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("archive7")
	static Archive archive7;
	@ObfuscatedName("ha")
	@Export("regionLandArchives")
	static byte[][] regionLandArchives;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1909605869
	)
	@Export("group")
	int group;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -116763185
	)
	@Export("type")
	int type;
	@ObfuscatedName("l")
	boolean field1034;

	InterfaceParent() {
		this.field1034 = false;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[IIII)V",
		garbageValue = "1544258939"
	)
	static void method2072(String[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			String var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			int var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var8 = var2; var8 < var3; ++var8) {
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
					String var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					int var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			method2072(var0, var1, var2, var5 - 1);
			method2072(var0, var1, var5 + 1, var3);
		}

	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "1735508491"
	)
	public static int[] method2071() {
		int[] var0 = new int[KeyHandler.field139];

		for (int var1 = 0; var1 < KeyHandler.field139; ++var1) {
			var0[var1] = KeyHandler.field138[var1];
		}

		return var0;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "46"
	)
	static final void method2067(String var0) {
		WorldMapEvent.addGameMessage(30, "", var0);
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "104"
	)
	static final int method2070(int var0, int var1, int var2) {
		int var3 = var0 / var2;
		int var4 = var0 & var2 - 1;
		int var5 = var1 / var2;
		int var6 = var1 & var2 - 1;
		int var7 = method2068(var3, var5);
		int var8 = method2068(var3 + 1, var5);
		int var9 = method2068(var3, var5 + 1);
		int var10 = method2068(var3 + 1, var5 + 1);
		int var12 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var4 * 1024 / var2] >> 1;
		int var11 = ((65536 - var12) * var7 >> 16) + (var8 * var12 >> 16);
		int var14 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var4 * 1024 / var2] >> 1;
		int var13 = ((65536 - var14) * var9 >> 16) + (var14 * var10 >> 16);
		int var16 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var6 * 1024 / var2] >> 1;
		int var15 = ((65536 - var16) * var11 >> 16) + (var16 * var13 >> 16);
		return var15;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IIS)I",
		garbageValue = "28815"
	)
	static final int method2068(int var0, int var1) {
		int var2 = class327.method5869(var0 - 1, var1 - 1) + class327.method5869(1 + var0, var1 - 1) + class327.method5869(var0 - 1, var1 + 1) + class327.method5869(1 + var0, 1 + var1);
		int var3 = class327.method5869(var0 - 1, var1) + class327.method5869(1 + var0, var1) + class327.method5869(var0, var1 - 1) + class327.method5869(var0, var1 + 1);
		int var4 = class327.method5869(var0, var1);
		return var2 / 16 + var3 / 8 + var4 / 4;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "55"
	)
	static int method2066(int var0) {
		return (int)Math.pow(2.0D, (double)(7.0F + (float)var0 / 256.0F));
	}

	@ObfuscatedName("le")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1929019996"
	)
	static final void method2069(int var0, int var1) {
		ClanChannel var2 = var0 >= 0 ? Client.currentClanChannels[var0] : UserComparator10.guestClanChannel;
		if (var2 != null && var1 >= 0 && var1 < var2.method3005()) {
			ClanChannelMember var3 = (ClanChannelMember)var2.members.get(var1);
			if (var3.rank == -1) {
				String var4 = var3.username.getName();
				PacketBufferNode var5 = DecorativeObject.getPacketBufferNode(ClientPacket.field3040, Client.packetWriter.isaacCipher);
				var5.packetBuffer.writeByte(3 + class392.stringCp1252NullTerminatedByteSize(var4));
				var5.packetBuffer.writeByte(var0);
				var5.packetBuffer.writeShort(var1);
				var5.packetBuffer.writeStringCp1252NullTerminated(var4);
				Client.packetWriter.addNode(var5);
			}
		}
	}
}
