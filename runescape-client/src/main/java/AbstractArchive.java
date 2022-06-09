import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lp")
@Implements("AbstractArchive")
public abstract class AbstractArchive {
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	@Export("gzipDecompressor")
	static GZipDecompressor gzipDecompressor;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 293139291
	)
	static int field4026;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	static GameBuild field4038;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1312413643
	)
	@Export("groupCount")
	int groupCount;
	@ObfuscatedName("t")
	@Export("groupIds")
	int[] groupIds;
	@ObfuscatedName("g")
	@Export("groupNameHashes")
	int[] groupNameHashes;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lqz;"
	)
	@Export("groupNameHashTable")
	IntHashTable groupNameHashTable;
	@ObfuscatedName("n")
	@Export("groupCrcs")
	int[] groupCrcs;
	@ObfuscatedName("e")
	@Export("groupVersions")
	int[] groupVersions;
	@ObfuscatedName("h")
	@Export("fileCounts")
	int[] fileCounts;
	@ObfuscatedName("f")
	@Export("fileIds")
	int[][] fileIds;
	@ObfuscatedName("d")
	@Export("fileNameHashes")
	int[][] fileNameHashes;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "[Lqz;"
	)
	@Export("fileNameHashTables")
	IntHashTable[] fileNameHashTables;
	@ObfuscatedName("z")
	@Export("groups")
	Object[] groups;
	@ObfuscatedName("i")
	@Export("files")
	Object[][] files;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1395137629
	)
	@Export("hash")
	public int hash;
	@ObfuscatedName("ar")
	@Export("releaseGroups")
	boolean releaseGroups;
	@ObfuscatedName("am")
	@Export("shallowFiles")
	boolean shallowFiles;

	static {
		gzipDecompressor = new GZipDecompressor();
		field4026 = 0;
	}

	AbstractArchive(boolean var1, boolean var2) {
		this.releaseGroups = var1;
		this.shallowFiles = var2;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "738299214"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-250456045"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-41"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		return this.groups[var1] != null ? 100 : 0;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-1642448854"
	)
	@Export("decodeIndex")
	void decodeIndex(byte[] var1) {
		this.hash = WorldMapArchiveLoader.method7020(var1, var1.length);
		Buffer var2 = new Buffer(Skills.decompressBytes(var1));
		int var3 = var2.readUnsignedByte();
		if (var3 >= 5 && var3 <= 7) {
			if (var3 >= 6) {
				var2.readInt();
			}

			int var4 = var2.readUnsignedByte();
			if (var3 >= 7) {
				this.groupCount = var2.method7627();
			} else {
				this.groupCount = var2.readUnsignedShort();
			}

			int var5 = 0;
			int var6 = -1;
			this.groupIds = new int[this.groupCount];
			int var7;
			if (var3 >= 7) {
				for (var7 = 0; var7 < this.groupCount; ++var7) {
					this.groupIds[var7] = var5 += var2.method7627();
					if (this.groupIds[var7] > var6) {
						var6 = this.groupIds[var7];
					}
				}
			} else {
				for (var7 = 0; var7 < this.groupCount; ++var7) {
					this.groupIds[var7] = var5 += var2.readUnsignedShort();
					if (this.groupIds[var7] > var6) {
						var6 = this.groupIds[var7];
					}
				}
			}

			this.groupCrcs = new int[var6 + 1];
			this.groupVersions = new int[var6 + 1];
			this.fileCounts = new int[var6 + 1];
			this.fileIds = new int[var6 + 1][];
			this.groups = new Object[var6 + 1];
			this.files = new Object[var6 + 1][];
			if (var4 != 0) {
				this.groupNameHashes = new int[var6 + 1];

				for (var7 = 0; var7 < this.groupCount; ++var7) {
					this.groupNameHashes[this.groupIds[var7]] = var2.readInt();
				}

				this.groupNameHashTable = new IntHashTable(this.groupNameHashes);
			}

			for (var7 = 0; var7 < this.groupCount; ++var7) {
				this.groupCrcs[this.groupIds[var7]] = var2.readInt();
			}

			for (var7 = 0; var7 < this.groupCount; ++var7) {
				this.groupVersions[this.groupIds[var7]] = var2.readInt();
			}

			for (var7 = 0; var7 < this.groupCount; ++var7) {
				this.fileCounts[this.groupIds[var7]] = var2.readUnsignedShort();
			}

			int var8;
			int var9;
			int var10;
			int var11;
			int var12;
			if (var3 >= 7) {
				for (var7 = 0; var7 < this.groupCount; ++var7) {
					var8 = this.groupIds[var7];
					var9 = this.fileCounts[var8];
					var5 = 0;
					var10 = -1;
					this.fileIds[var8] = new int[var9];

					for (var11 = 0; var11 < var9; ++var11) {
						var12 = this.fileIds[var8][var11] = var5 += var2.method7627();
						if (var12 > var10) {
							var10 = var12;
						}
					}

					this.files[var8] = new Object[var10 + 1];
				}
			} else {
				for (var7 = 0; var7 < this.groupCount; ++var7) {
					var8 = this.groupIds[var7];
					var9 = this.fileCounts[var8];
					var5 = 0;
					var10 = -1;
					this.fileIds[var8] = new int[var9];

					for (var11 = 0; var11 < var9; ++var11) {
						var12 = this.fileIds[var8][var11] = var5 += var2.readUnsignedShort();
						if (var12 > var10) {
							var10 = var12;
						}
					}

					this.files[var8] = new Object[var10 + 1];
				}
			}

			if (var4 != 0) {
				this.fileNameHashes = new int[var6 + 1][];
				this.fileNameHashTables = new IntHashTable[var6 + 1];

				for (var7 = 0; var7 < this.groupCount; ++var7) {
					var8 = this.groupIds[var7];
					var9 = this.fileCounts[var8];
					this.fileNameHashes[var8] = new int[this.files[var8].length];

					for (var10 = 0; var10 < var9; ++var10) {
						this.fileNameHashes[var8][this.fileIds[var8][var10]] = var2.readInt();
					}

					this.fileNameHashTables[var8] = new IntHashTable(this.fileNameHashes[var8]);
				}
			}

		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)[B",
		garbageValue = "9206278"
	)
	@Export("takeFile")
	public byte[] takeFile(int var1, int var2) {
		return this.takeFileEncrypted(var1, var2, (int[])null);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II[II)[B",
		garbageValue = "1321797482"
	)
	@Export("takeFileEncrypted")
	public byte[] takeFileEncrypted(int var1, int var2, int[] var3) {
		if (var1 >= 0 && var1 < this.files.length && this.files[var1] != null && var2 >= 0 && var2 < this.files[var1].length) {
			if (this.files[var1][var2] == null) {
				boolean var4 = this.buildFiles(var1, var3);
				if (!var4) {
					this.loadGroup(var1);
					var4 = this.buildFiles(var1, var3);
					if (!var4) {
						return null;
					}
				}
			}

			byte[] var5 = class125.method2791(this.files[var1][var2], false);
			if (this.shallowFiles) {
				this.files[var1][var2] = null;
			}

			return var5;
		} else {
			return null;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1947570801"
	)
	@Export("tryLoadFile")
	public boolean tryLoadFile(int var1, int var2) {
		if (var1 >= 0 && var1 < this.files.length && this.files[var1] != null && var2 >= 0 && var2 < this.files[var1].length) {
			if (this.files[var1][var2] != null) {
				return true;
			} else if (this.groups[var1] != null) {
				return true;
			} else {
				this.loadGroup(var1);
				return this.groups[var1] != null;
			}
		} else {
			return false;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "39"
	)
	public boolean method5668(int var1) {
		if (this.files.length == 1) {
			return this.tryLoadFile(0, var1);
		} else if (this.files[var1].length == 1) {
			return this.tryLoadFile(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1465759290"
	)
	@Export("tryLoadGroup")
	public boolean tryLoadGroup(int var1) {
		if (this.groups[var1] != null) {
			return true;
		} else {
			this.loadGroup(var1);
			return this.groups[var1] != null;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "903768645"
	)
	@Export("isFullyLoaded")
	public boolean isFullyLoaded() {
		boolean var1 = true;

		for (int var2 = 0; var2 < this.groupIds.length; ++var2) {
			int var3 = this.groupIds[var2];
			if (this.groups[var3] == null) {
				this.loadGroup(var3);
				if (this.groups[var3] == null) {
					var1 = false;
				}
			}
		}

		return var1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "-1699435814"
	)
	@Export("takeFileFlat")
	public byte[] takeFileFlat(int var1) {
		if (this.files.length == 1) {
			return this.takeFile(0, var1);
		} else if (this.files[var1].length == 1) {
			return this.takeFile(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(III)[B",
		garbageValue = "1081005917"
	)
	@Export("getFile")
	public byte[] getFile(int var1, int var2) {
		if (var1 >= 0 && var1 < this.files.length && this.files[var1] != null && var2 >= 0 && var2 < this.files[var1].length) {
			if (this.files[var1][var2] == null) {
				boolean var3 = this.buildFiles(var1, (int[])null);
				if (!var3) {
					this.loadGroup(var1);
					var3 = this.buildFiles(var1, (int[])null);
					if (!var3) {
						return null;
					}
				}
			}

			byte[] var4 = class125.method2791(this.files[var1][var2], false);
			return var4;
		} else {
			return null;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "515956954"
	)
	@Export("getFileFlat")
	public byte[] getFileFlat(int var1) {
		if (this.files.length == 1) {
			return this.getFile(0, var1);
		} else if (this.files[var1].length == 1) {
			return this.getFile(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "100488775"
	)
	@Export("getGroupFileIds")
	public int[] getGroupFileIds(int var1) {
		return var1 >= 0 && var1 < this.fileIds.length ? this.fileIds[var1] : null;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-373253911"
	)
	@Export("getGroupFileCount")
	public int getGroupFileCount(int var1) {
		return this.files[var1].length;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1109930040"
	)
	@Export("getGroupCount")
	public int getGroupCount() {
		return this.files.length;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2116699017"
	)
	@Export("clearGroups")
	public void clearGroups() {
		for (int var1 = 0; var1 < this.groups.length; ++var1) {
			this.groups[var1] = null;
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "7"
	)
	@Export("clearFilesGroup")
	public void clearFilesGroup(int var1) {
		for (int var2 = 0; var2 < this.files[var1].length; ++var2) {
			this.files[var1][var2] = null;
		}

	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1417383387"
	)
	@Export("clearFiles")
	public void clearFiles() {
		for (int var1 = 0; var1 < this.files.length; ++var1) {
			if (this.files[var1] != null) {
				for (int var2 = 0; var2 < this.files[var1].length; ++var2) {
					this.files[var1][var2] = null;
				}
			}
		}

	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I[IB)Z",
		garbageValue = "53"
	)
	@Export("buildFiles")
	boolean buildFiles(int var1, int[] var2) {
		if (this.groups[var1] == null) {
			return false;
		} else {
			int var3 = this.fileCounts[var1];
			int[] var4 = this.fileIds[var1];
			Object[] var5 = this.files[var1];
			boolean var6 = true;

			for (int var7 = 0; var7 < var3; ++var7) {
				if (var5[var4[var7]] == null) {
					var6 = false;
					break;
				}
			}

			if (var6) {
				return true;
			} else {
				byte[] var18;
				if (var2 == null || var2[0] == 0 && var2[1] == 0 && var2[2] == 0 && var2[3] == 0) {
					var18 = class125.method2791(this.groups[var1], false);
				} else {
					var18 = class125.method2791(this.groups[var1], true);
					Buffer var8 = new Buffer(var18);
					var8.xteaDecrypt(var2, 5, var8.array.length);
				}

				byte[] var20 = Skills.decompressBytes(var18);
				if (this.releaseGroups) {
					this.groups[var1] = null;
				}

				if (var3 > 1) {
					int var9 = var20.length;
					--var9;
					int var10 = var20[var9] & 255;
					var9 -= var3 * var10 * 4;
					Buffer var11 = new Buffer(var20);
					int[] var12 = new int[var3];
					var11.offset = var9;

					int var14;
					int var15;
					for (int var13 = 0; var13 < var10; ++var13) {
						var14 = 0;

						for (var15 = 0; var15 < var3; ++var15) {
							var14 += var11.readInt();
							var12[var15] += var14;
						}
					}

					byte[][] var19 = new byte[var3][];

					for (var14 = 0; var14 < var3; ++var14) {
						var19[var14] = new byte[var12[var14]];
						var12[var14] = 0;
					}

					var11.offset = var9;
					var14 = 0;

					for (var15 = 0; var15 < var10; ++var15) {
						int var16 = 0;

						for (int var17 = 0; var17 < var3; ++var17) {
							var16 += var11.readInt();
							System.arraycopy(var20, var14, var19[var17], var12[var17], var16);
							var12[var17] += var16;
							var14 += var16;
						}
					}

					for (var15 = 0; var15 < var3; ++var15) {
						if (!this.shallowFiles) {
							var5[var4[var15]] = WorldMapEvent.method4929(var19[var15], false);
						} else {
							var5[var4[var15]] = var19[var15];
						}
					}
				} else if (!this.shallowFiles) {
					var5[var4[0]] = WorldMapEvent.method4929(var20, false);
				} else {
					var5[var4[0]] = var20;
				}

				return true;
			}
		}
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-459533989"
	)
	@Export("getGroupId")
	public int getGroupId(String var1) {
		var1 = var1.toLowerCase();
		return this.groupNameHashTable.get(class101.hashString(var1));
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)I",
		garbageValue = "-99961512"
	)
	@Export("getFileId")
	public int getFileId(int var1, String var2) {
		var2 = var2.toLowerCase();
		return this.fileNameHashTables[var1].get(class101.hashString(var2));
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z",
		garbageValue = "-1697073381"
	)
	@Export("isValidFileName")
	public boolean isValidFileName(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var3 = this.groupNameHashTable.get(class101.hashString(var1));
		if (var3 < 0) {
			return false;
		} else {
			int var4 = this.fileNameHashTables[var3].get(class101.hashString(var2));
			return var4 >= 0;
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B",
		garbageValue = "-1285301345"
	)
	@Export("takeFileByNames")
	public byte[] takeFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var3 = this.groupNameHashTable.get(class101.hashString(var1));
		int var4 = this.fileNameHashTables[var3].get(class101.hashString(var2));
		return this.takeFile(var3, var4);
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z",
		garbageValue = "569165055"
	)
	@Export("tryLoadFileByNames")
	public boolean tryLoadFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var3 = this.groupNameHashTable.get(class101.hashString(var1));
		int var4 = this.fileNameHashTables[var3].get(class101.hashString(var2));
		return this.tryLoadFile(var3, var4);
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "31747175"
	)
	@Export("tryLoadGroupByName")
	public boolean tryLoadGroupByName(String var1) {
		var1 = var1.toLowerCase();
		int var2 = this.groupNameHashTable.get(class101.hashString(var1));
		return this.tryLoadGroup(var2);
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "286297343"
	)
	@Export("loadRegionFromName")
	public void loadRegionFromName(String var1) {
		var1 = var1.toLowerCase();
		int var2 = this.groupNameHashTable.get(class101.hashString(var1));
		if (var2 >= 0) {
			this.loadRegionFromGroup(var2);
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-586809240"
	)
	@Export("groupLoadPercentByName")
	public int groupLoadPercentByName(String var1) {
		var1 = var1.toLowerCase();
		int var2 = this.groupNameHashTable.get(class101.hashString(var1));
		return this.groupLoadPercent(var2);
	}
}
