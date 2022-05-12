import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("ci")
@Implements("PendingSpawn")
public final class PendingSpawn extends Node {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1548569011
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1470200335
	)
	@Export("type")
	int type;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 706964479
	)
	@Export("x")
	int x;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 307238289
	)
	@Export("y")
	int y;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -360543025
	)
	@Export("objectId")
	int objectId;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 265612905
	)
	int field1131;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -539992975
	)
	int field1129;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -420912825
	)
	@Export("id")
	int id;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1623947917
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1200611791
	)
	int field1126;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -997627389
	)
	@Export("delay")
	int delay;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1963124653
	)
	@Export("hitpoints")
	int hitpoints;

	PendingSpawn() {
		this.delay = 0;
		this.hitpoints = -1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Llp;Llp;IZI)Lds;",
		garbageValue = "1523171392"
	)
	public static class122 method2161(AbstractArchive var0, AbstractArchive var1, int var2, boolean var3) {
		boolean var4 = true;
		byte[] var5 = var0.takeFile(var2 >> 16 & 65535, var2 & 65535);
		if (var5 == null) {
			var4 = false;
			return null;
		} else {
			int var6 = (var5[1] & 255) << 8 | var5[2] & 255;
			byte[] var7;
			if (var3) {
				var7 = var1.getFile(0, var6);
			} else {
				var7 = var1.getFile(var6, 0);
			}

			if (var7 == null) {
				var4 = false;
			}

			if (!var4) {
				return null;
			} else {
				try {
					return new class122(var0, var1, var2, var3);
				} catch (Exception var9) {
					return null;
				}
			}
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "373101383"
	)
	public static void method2160(String var0, String var1, int var2, int var3) throws IOException {
		UserComparator6.idxCount = var3;
		class11.cacheGamebuild = var2;

		try {
			JagexCache.operatingSystemName = System.getProperty("os.name");
		} catch (Exception var18) {
			JagexCache.operatingSystemName = "Unknown";
		}

		WorldMapArea.formattedOperatingSystemName = JagexCache.operatingSystemName.toLowerCase();

		try {
			BufferedSource.userHomeDirectory = System.getProperty("user.home");
			if (BufferedSource.userHomeDirectory != null) {
				BufferedSource.userHomeDirectory = BufferedSource.userHomeDirectory + "/";
			}
		} catch (Exception var17) {
		}

		try {
			if (WorldMapArea.formattedOperatingSystemName.startsWith("win")) {
				if (BufferedSource.userHomeDirectory == null) {
					BufferedSource.userHomeDirectory = System.getenv("USERPROFILE");
				}
			} else if (BufferedSource.userHomeDirectory == null) {
				BufferedSource.userHomeDirectory = System.getenv("HOME");
			}

			if (BufferedSource.userHomeDirectory != null) {
				BufferedSource.userHomeDirectory = BufferedSource.userHomeDirectory + "/";
			}
		} catch (Exception var16) {
		}

		if (BufferedSource.userHomeDirectory == null) {
			BufferedSource.userHomeDirectory = "~/";
		}

		SecureRandomCallable.cacheParentPaths = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", BufferedSource.userHomeDirectory, "/tmp/", ""};
		class83.cacheSubPaths = new String[]{".jagex_cache_" + class11.cacheGamebuild, ".file_store_" + class11.cacheGamebuild};
		int var12 = 0;

		int var7;
		File var8;
		label141:
		while (var12 < 4) {
			JagexCache.cacheDir = SequenceDefinition.method3717(var0, var1, var12);
			if (!JagexCache.cacheDir.exists()) {
				JagexCache.cacheDir.mkdirs();
			}

			File[] var5 = JagexCache.cacheDir.listFiles();
			if (var5 == null) {
				break;
			}

			File[] var6 = var5;
			var7 = 0;

			while (true) {
				if (var7 >= var6.length) {
					break label141;
				}

				var8 = var6[var7];

				boolean var9;
				try {
					RandomAccessFile var10 = new RandomAccessFile(var8, "rw");
					int var11 = var10.read();
					var10.seek(0L);
					var10.write(var11);
					var10.seek(0L);
					var10.close();
					var9 = true;
				} catch (Exception var15) {
					var9 = false;
				}

				if (!var9) {
					++var12;
					break;
				}

				++var7;
			}
		}

		File var4 = JagexCache.cacheDir;
		FileSystem.FileSystem_cacheDir = var4;
		if (!FileSystem.FileSystem_cacheDir.exists()) {
			throw new RuntimeException("");
		} else {
			FileSystem.FileSystem_hasPermissions = true;

			try {
				File var20 = new File(BufferedSource.userHomeDirectory, "random.dat");
				if (var20.exists()) {
					JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var20, "rw", 25L), 24, 0);
				} else {
					label120:
					for (int var13 = 0; var13 < class83.cacheSubPaths.length; ++var13) {
						for (var7 = 0; var7 < SecureRandomCallable.cacheParentPaths.length; ++var7) {
							var8 = new File(SecureRandomCallable.cacheParentPaths[var7] + class83.cacheSubPaths[var13] + File.separatorChar + "random.dat");
							if (var8.exists()) {
								JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var8, "rw", 25L), 24, 0);
								break label120;
							}
						}
					}
				}

				if (JagexCache.JagexCache_randomDat == null) {
					RandomAccessFile var21 = new RandomAccessFile(var20, "rw");
					var7 = var21.read();
					var21.seek(0L);
					var21.write(var7);
					var21.seek(0L);
					var21.close();
					JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var20, "rw", 25L), 24, 0);
				}
			} catch (IOException var19) {
			}

			JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(VarpDefinition.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
			JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(VarpDefinition.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
			JagexCache.JagexCache_idxFiles = new BufferedFile[UserComparator6.idxCount];

			for (int var14 = 0; var14 < UserComparator6.idxCount; ++var14) {
				JagexCache.JagexCache_idxFiles[var14] = new BufferedFile(new AccessFile(VarpDefinition.getFile("main_file_cache.idx" + var14), "rw", 1048576L), 6000, 0);
			}

		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lpx;II)V",
		garbageValue = "-1995968561"
	)
	@Export("readReflectionCheck")
	public static void readReflectionCheck(Buffer var0, int var1) {
		ReflectionCheck var2 = new ReflectionCheck();
		var2.size = var0.readUnsignedByte();
		var2.id = var0.readInt();
		var2.operations = new int[var2.size];
		var2.creationErrors = new int[var2.size];
		var2.fields = new Field[var2.size];
		var2.intReplaceValues = new int[var2.size];
		var2.methods = new Method[var2.size];
		var2.arguments = new byte[var2.size][][];

		for (int var3 = 0; var3 < var2.size; ++var3) {
			try {
				int var4 = var0.readUnsignedByte();
				String var5;
				String var6;
				int var7;
				if (var4 != 0 && var4 != 1 && var4 != 2) {
					if (var4 == 3 || var4 == 4) {
						var5 = var0.readStringCp1252NullTerminated();
						var6 = var0.readStringCp1252NullTerminated();
						var7 = var0.readUnsignedByte();
						String[] var8 = new String[var7];

						for (int var9 = 0; var9 < var7; ++var9) {
							var8[var9] = var0.readStringCp1252NullTerminated();
						}

						String var20 = var0.readStringCp1252NullTerminated();
						byte[][] var10 = new byte[var7][];
						int var12;
						if (var4 == 3) {
							for (int var11 = 0; var11 < var7; ++var11) {
								var12 = var0.readInt();
								var10[var11] = new byte[var12];
								var0.readBytes(var10[var11], 0, var12);
							}
						}

						var2.operations[var3] = var4;
						Class[] var21 = new Class[var7];

						for (var12 = 0; var12 < var7; ++var12) {
							var21[var12] = WorldMapSection1.loadClassFromDescriptor(var8[var12]);
						}

						Class var22 = WorldMapSection1.loadClassFromDescriptor(var20);
						if (WorldMapSection1.loadClassFromDescriptor(var5).getClassLoader() == null) {
							throw new SecurityException();
						}

						Method[] var13 = WorldMapSection1.loadClassFromDescriptor(var5).getDeclaredMethods();
						Method[] var14 = var13;

						for (int var15 = 0; var15 < var14.length; ++var15) {
							Method var16 = var14[var15];
							if (Reflection.getMethodName(var16).equals(var6)) {
								Class[] var17 = Reflection.getParameterTypes(var16);
								if (var21.length == var17.length) {
									boolean var18 = true;

									for (int var19 = 0; var19 < var21.length; ++var19) {
										if (var17[var19] != var21[var19]) {
											var18 = false;
											break;
										}
									}

									if (var18 && var22 == var16.getReturnType()) {
										var2.methods[var3] = var16;
									}
								}
							}
						}

						var2.arguments[var3] = var10;
					}
				} else {
					var5 = var0.readStringCp1252NullTerminated();
					var6 = var0.readStringCp1252NullTerminated();
					var7 = 0;
					if (var4 == 1) {
						var7 = var0.readInt();
					}

					var2.operations[var3] = var4;
					var2.intReplaceValues[var3] = var7;
					if (WorldMapSection1.loadClassFromDescriptor(var5).getClassLoader() == null) {
						throw new SecurityException();
					}

					var2.fields[var3] = Reflection.findField(WorldMapSection1.loadClassFromDescriptor(var5), var6);
				}
			} catch (ClassNotFoundException var24) {
				var2.creationErrors[var3] = -1;
			} catch (SecurityException var25) {
				var2.creationErrors[var3] = -2;
			} catch (NullPointerException var26) {
				var2.creationErrors[var3] = -3;
			} catch (Exception var27) {
				var2.creationErrors[var3] = -4;
			} catch (Throwable var28) {
				var2.creationErrors[var3] = -5;
			}
		}

		class33.reflectionChecks.addFirst(var2);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-1"
	)
	public static boolean method2164(int var0) {
		return var0 >= WorldMapDecorationType.field3571.id && var0 <= WorldMapDecorationType.field3559.id || var0 == WorldMapDecorationType.field3560.id;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "191115673"
	)
	static int method2163(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0);
		if (var1 == null) {
			return -1;
		} else {
			return var1.nextDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.nextDual).count;
		}
	}

	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1563631744"
	)
	@Export("updateGameState")
	static void updateGameState(int var0) {
		if (var0 != Client.gameState) {
			if (Client.gameState == 0) {
				class82.client.method438();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) {
				Canvas.method347(0);
				Client.field626 = 0;
				Client.field514 = 0;
				Client.timer.method6369(var0);
				if (var0 != 20) {
					ObjectSound.method1730(false);
				}
			}

			if (var0 != 20 && var0 != 40 && DirectByteArrayCopier.field3337 != null) {
				DirectByteArrayCopier.field3337.close();
				DirectByteArrayCopier.field3337 = null;
			}

			if (Client.gameState == 25) {
				Client.field597 = 0;
				Client.field545 = 0;
				Client.field546 = 1;
				Client.field570 = 0;
				Client.field548 = 1;
			}

			int var1;
			if (var0 != 5 && var0 != 10) {
				if (var0 == 20) {
					var1 = Client.gameState == 11 ? 4 : 0;
					AbstractWorldMapData.method4800(ObjectSound.archive10, class305.archive8, false, var1);
				} else if (var0 == 11) {
					AbstractWorldMapData.method4800(ObjectSound.archive10, class305.archive8, false, 4);
				} else if (var0 == 50) {
					class345.setLoginResponseString("", "Updating date of birth...", "");
					AbstractWorldMapData.method4800(ObjectSound.archive10, class305.archive8, false, 7);
				} else if (Login.clearLoginScreen) {
					Login.titleboxSprite = null;
					Login.titlebuttonSprite = null;
					Login.runesSprite = null;
					UserComparator6.leftTitleSprite = null;
					SecureRandomCallable.rightTitleSprite = null;
					Clock.logoSprite = null;
					class358.field4260 = null;
					class67.field872 = null;
					class101.field1360 = null;
					GameEngine.worldSelectBackSprites = null;
					class260.worldSelectFlagSprites = null;
					class114.worldSelectArrows = null;
					class267.worldSelectStars = null;
					ArchiveDiskAction.field3997 = null;
					class193.loginScreenRunesAnimation.method2214();
					UrlRequester.method2538(2);
					MouseRecorder.method2088(true);
					Login.clearLoginScreen = false;
				}
			} else {
				var1 = class118.method2721() ? 0 : 12;
				AbstractWorldMapData.method4800(ObjectSound.archive10, class305.archive8, true, var1);
			}

			Client.gameState = var0;
		}
	}
}
