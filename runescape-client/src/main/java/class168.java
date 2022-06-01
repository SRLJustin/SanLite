import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fn")
public class class168 {
	@ObfuscatedName("l")
	public short[] field1847;
	@ObfuscatedName("k")
	public short[] field1844;

	class168(int var1) {
		ItemComposition var2 = FileSystem.ItemDefinition_get(var1);
		if (var2.method3636()) {
			this.field1847 = new short[var2.recolorTo.length];
			System.arraycopy(var2.recolorTo, 0, this.field1847, 0, this.field1847.length);
		}

		if (var2.method3637()) {
			this.field1844 = new short[var2.retextureTo.length];
			System.arraycopy(var2.retextureTo, 0, this.field1844, 0, this.field1844.length);
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1006940319"
	)
	static String method3253() {
		String var0;
		if (class12.clientPreferences.method2257()) {
			String var2 = Login.Login_username;
			int var4 = var2.length();
			char[] var5 = new char[var4];

			for (int var6 = 0; var6 < var4; ++var6) {
				var5[var6] = '*';
			}

			String var3 = new String(var5);
			var0 = var3;
		} else {
			var0 = Login.Login_username;
		}

		return var0;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "24"
	)
	@Export("ByteArrayPool_release")
	public static synchronized void ByteArrayPool_release(byte[] var0) {
		if (var0.length == 100 && ByteArrayPool.ByteArrayPool_smallCount < ByteArrayPool.field4210) {
			ByteArrayPool.ByteArrayPool_small[++ByteArrayPool.ByteArrayPool_smallCount - 1] = var0;
		} else if (var0.length == 5000 && ByteArrayPool.ByteArrayPool_mediumCount < ByteArrayPool.field4219) {
			ByteArrayPool.ByteArrayPool_medium[++ByteArrayPool.ByteArrayPool_mediumCount - 1] = var0;
		} else if (var0.length == 10000 && ByteArrayPool.ByteArrayPool_largeCount < ByteArrayPool.field4220) {
			ByteArrayPool.ByteArrayPool_large[++ByteArrayPool.ByteArrayPool_largeCount - 1] = var0;
		} else if (var0.length == 30000 && ByteArrayPool.field4217 < ByteArrayPool.field4221) {
			ByteArrayPool.field4225[++ByteArrayPool.field4217 - 1] = var0;
		} else {
			if (class131.ByteArrayPool_arrays != null) {
				for (int var1 = 0; var1 < FileSystem.ByteArrayPool_alternativeSizes.length; ++var1) {
					if (var0.length == FileSystem.ByteArrayPool_alternativeSizes[var1] && GrandExchangeEvents.ByteArrayPool_altSizeArrayCounts[var1] < class131.ByteArrayPool_arrays[var1].length) {
						class131.ByteArrayPool_arrays[var1][GrandExchangeEvents.ByteArrayPool_altSizeArrayCounts[var1]++] = var0;
						return;
					}
				}
			}

		}
	}

	@ObfuscatedName("lp")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "-1667178418"
	)
	static final void method3251(int var0, int var1, boolean var2) {
		if (Client.currentClanChannels[var0] != null) {
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3005()) {
				ClanChannelMember var3 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1);
				PacketBufferNode var4 = DecorativeObject.getPacketBufferNode(ClientPacket.field2993, Client.packetWriter.isaacCipher);
				var4.packetBuffer.writeByte(4 + class392.stringCp1252NullTerminatedByteSize(var3.username.getName()));
				var4.packetBuffer.writeByte(var0);
				var4.packetBuffer.writeShort(var1);
				var4.packetBuffer.writeBoolean(var2);
				var4.packetBuffer.writeStringCp1252NullTerminated(var3.username.getName());
				Client.packetWriter.addNode(var4);
			}
		}
	}
}
