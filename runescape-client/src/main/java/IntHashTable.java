import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qz")
@Implements("IntHashTable")
public class IntHashTable {
	@ObfuscatedName("o")
	@Export("array")
	int[] array;

	public IntHashTable(int[] var1) {
		int var2;
		for (var2 = 1; var2 <= (var1.length >> 1) + var1.length; var2 <<= 1) {
		}

		this.array = new int[var2 + var2];

		int var3;
		for (var3 = 0; var3 < var2 + var2; ++var3) {
			this.array[var3] = -1;
		}

		int var4;
		for (var3 = 0; var3 < var1.length; this.array[var4 + var4 + 1] = var3++) {
			for (var4 = var1[var3] & var2 - 1; this.array[var4 + var4 + 1] != -1; var4 = var4 + 1 & var2 - 1) {
			}

			this.array[var4 + var4] = var1[var3];
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IS)I",
		garbageValue = "-5470"
	)
	@Export("get")
	public int get(int var1) {
		int var2 = (this.array.length >> 1) - 1;
		int var3 = var1 & var2;

		while (true) {
			int var4 = this.array[var3 + var3 + 1];
			if (var4 == -1) {
				return -1;
			}

			if (this.array[var3 + var3] == var1) {
				return var4;
			}

			var3 = var3 + 1 & var2;
		}
	}

	@ObfuscatedName("ly")
	@ObfuscatedSignature(
		descriptor = "(Lpx;B)V",
		garbageValue = "20"
	)
	static void method8124(Buffer var0) {
		if (Client.randomDatData != null) {
			var0.writeBytes(Client.randomDatData, 0, Client.randomDatData.length);
		} else {
			byte[] var2 = new byte[24];

			try {
				JagexCache.JagexCache_randomDat.seek(0L);
				JagexCache.JagexCache_randomDat.readFully(var2);

				int var3;
				for (var3 = 0; var3 < 24 && var2[var3] == 0; ++var3) {
				}

				if (var3 >= 24) {
					throw new IOException();
				}
			} catch (Exception var6) {
				for (int var4 = 0; var4 < 24; ++var4) {
					var2[var4] = -1;
				}
			}

			var0.writeBytes(var2, 0, var2.length);
		}
	}
}
