import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fi")
@Implements("VarpDefinition")
public class VarpDefinition extends DualNode {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("VarpDefinition_archive")
	public static AbstractArchive VarpDefinition_archive;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -230043691
	)
	@Export("VarpDefinition_fileCount")
	public static int VarpDefinition_fileCount;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("VarpDefinition_cached")
	public static EvictingDualNodeHashTable VarpDefinition_cached;
	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("archive19")
	static Archive archive19;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1780230935
	)
	@Export("type")
	public int type;

	static {
		VarpDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	VarpDefinition() {
		this.type = 0;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lpx;B)V",
		garbageValue = "-125"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lpx;IB)V",
		garbageValue = "29"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 5) {
			this.type = var1.readUnsignedShort();
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/io/File;",
		garbageValue = "1012009903"
	)
	@Export("getFile")
	static File getFile(String var0) {
		if (!FileSystem.FileSystem_hasPermissions) {
			throw new RuntimeException("");
		} else {
			File var1 = (File)FileSystem.FileSystem_cacheFiles.get(var0);
			if (var1 != null) {
				return var1;
			} else {
				File var2 = new File(FileSystem.FileSystem_cacheDir, var0);
				RandomAccessFile var3 = null;

				try {
					File var4 = new File(var2.getParent());
					if (!var4.exists()) {
						throw new RuntimeException("");
					} else {
						var3 = new RandomAccessFile(var2, "rw");
						int var5 = var3.read();
						var3.seek(0L);
						var3.write(var5);
						var3.seek(0L);
						var3.close();
						FileSystem.FileSystem_cacheFiles.put(var0, var2);
						return var2;
					}
				} catch (Exception var8) {
					try {
						if (var3 != null) {
							var3.close();
							var3 = null;
						}
					} catch (Exception var7) {
					}

					throw new RuntimeException();
				}
			}
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-1753178254"
	)
	public static int method3273(int var0, int var1, int var2) {
		var2 &= 3;
		if (var2 == 0) {
			return var1;
		} else if (var2 == 1) {
			return 7 - var0;
		} else {
			return var2 == 2 ? 7 - var1 : var0;
		}
	}
}
