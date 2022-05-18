import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ek")
@Implements("ClanSettings")
public class ClanSettings {
	@ObfuscatedName("q")
	@Export("useHashes")
	boolean useHashes;
	@ObfuscatedName("l")
	@Export("useNames")
	boolean useNames;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		longValue = -887635540627119073L
	)
	long field1635;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 2108379547
	)
	int field1636;
	@ObfuscatedName("m")
	@Export("name")
	public String name;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -2134617101
	)
	int field1638;
	@ObfuscatedName("s")
	@Export("allowGuests")
	public boolean allowGuests;
	@ObfuscatedName("r")
	public byte field1633;
	@ObfuscatedName("v")
	public byte field1641;
	@ObfuscatedName("y")
	public byte field1642;
	@ObfuscatedName("c")
	public byte field1648;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -224195769
	)
	@Export("memberCount")
	public int memberCount;
	@ObfuscatedName("b")
	@Export("memberHashes")
	long[] memberHashes;
	@ObfuscatedName("t")
	@Export("memberRanks")
	public byte[] memberRanks;
	@ObfuscatedName("g")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("x")
	int[] field1651;
	@ObfuscatedName("n")
	public int[] field1649;
	@ObfuscatedName("e")
	public boolean[] field1650;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -2063830339
	)
	@Export("currentOwner")
	public int currentOwner;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 2079411577
	)
	public int field1652;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 102858821
	)
	@Export("bannedMemberCount")
	public int bannedMemberCount;
	@ObfuscatedName("j")
	@Export("bannedMemberHashes")
	long[] bannedMemberHashes;
	@ObfuscatedName("z")
	@Export("memberNames")
	public String[] memberNames;
	@ObfuscatedName("i")
	@Export("bannedMemberNames")
	public String[] bannedMemberNames;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lpt;"
	)
	@Export("parameters")
	IterableNodeHashTable parameters;

	@ObfuscatedSignature(
		descriptor = "(Lpx;)V"
	)
	public ClanSettings(Buffer var1) {
		this.field1636 = 0;
		this.name = null;
		this.field1638 = 0;
		this.currentOwner = -1;
		this.field1652 = -1;
		this.method2901(var1);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	void method2882(int var1) {
		if (this.useHashes) {
			if (this.memberHashes != null) {
				System.arraycopy(this.memberHashes, 0, this.memberHashes = new long[var1], 0, this.memberCount);
			} else {
				this.memberHashes = new long[var1];
			}
		}

		if (this.useNames) {
			if (this.memberNames != null) {
				System.arraycopy(this.memberNames, 0, this.memberNames = new String[var1], 0, this.memberCount);
			} else {
				this.memberNames = new String[var1];
			}
		}

		if (this.memberRanks != null) {
			System.arraycopy(this.memberRanks, 0, this.memberRanks = new byte[var1], 0, this.memberCount);
		} else {
			this.memberRanks = new byte[var1];
		}

		if (this.field1651 != null) {
			System.arraycopy(this.field1651, 0, this.field1651 = new int[var1], 0, this.memberCount);
		} else {
			this.field1651 = new int[var1];
		}

		if (this.field1649 != null) {
			System.arraycopy(this.field1649, 0, this.field1649 = new int[var1], 0, this.memberCount);
		} else {
			this.field1649 = new int[var1];
		}

		if (this.field1650 != null) {
			System.arraycopy(this.field1650, 0, this.field1650 = new boolean[var1], 0, this.memberCount);
		} else {
			this.field1650 = new boolean[var1];
		}

	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1820150927"
	)
	void method2883(int var1) {
		if (this.useHashes) {
			if (this.bannedMemberHashes != null) {
				System.arraycopy(this.bannedMemberHashes, 0, this.bannedMemberHashes = new long[var1], 0, this.bannedMemberCount);
			} else {
				this.bannedMemberHashes = new long[var1];
			}
		}

		if (this.useNames) {
			if (this.bannedMemberNames != null) {
				System.arraycopy(this.bannedMemberNames, 0, this.bannedMemberNames = new String[var1], 0, this.bannedMemberCount);
			} else {
				this.bannedMemberNames = new String[var1];
			}
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-2117273951"
	)
	public int method2884(String var1) {
		if (var1 != null && var1.length() != 0) {
			for (int var2 = 0; var2 < this.memberCount; ++var2) {
				if (this.memberNames[var2].equals(var1)) {
					return var2;
				}
			}

			return -1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-126239409"
	)
	public int method2885(int var1, int var2, int var3) {
		int var4 = var3 == 31 ? -1 : (1 << var3 + 1) - 1;
		return (this.field1651[var1] & var4) >>> var2;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Integer;",
		garbageValue = "-1977188561"
	)
	@Export("getTitleGroupValue")
	public Integer getTitleGroupValue(int var1) {
		if (this.parameters == null) {
			return null;
		} else {
			Node var2 = this.parameters.get((long)var1);
			return var2 != null && var2 instanceof IntegerNode ? new Integer(((IntegerNode)var2).integer) : null;
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-861135746"
	)
	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) {
			String[] var1 = new String[this.memberCount];
			this.sortedMembers = new int[this.memberCount];

			for (int var2 = 0; var2 < this.memberCount; this.sortedMembers[var2] = var2++) {
				var1[var2] = this.memberNames[var2];
				if (var1[var2] != null) {
					var1[var2] = var1[var2].toLowerCase();
				}
			}

			class113.method2625(var1, this.sortedMembers);
		}

		return this.sortedMembers;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;II)V",
		garbageValue = "193395684"
	)
	void method2888(long var1, String var3, int var4) {
		if (var3 != null && var3.length() == 0) {
			var3 = null;
		}

		if (var1 > 0L != this.useHashes) {
			throw new RuntimeException("");
		} else if (this.useNames != (var3 != null)) {
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.memberHashes == null || this.memberCount >= this.memberHashes.length) || var3 != null && (this.memberNames == null || this.memberCount >= this.memberNames.length)) {
				this.method2882(this.memberCount + 5);
			}

			if (this.memberHashes != null) {
				this.memberHashes[this.memberCount] = var1;
			}

			if (this.memberNames != null) {
				this.memberNames[this.memberCount] = var3;
			}

			if (this.currentOwner == -1) {
				this.currentOwner = this.memberCount;
				this.memberRanks[this.memberCount] = 126;
			} else {
				this.memberRanks[this.memberCount] = 0;
			}

			this.field1651[this.memberCount] = 0;
			this.field1649[this.memberCount] = var4;
			this.field1650[this.memberCount] = false;
			++this.memberCount;
			this.sortedMembers = null;
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "41"
	)
	void method2926(int var1) {
		if (var1 >= 0 && var1 < this.memberCount) {
			--this.memberCount;
			this.sortedMembers = null;
			if (this.memberCount == 0) {
				this.memberHashes = null;
				this.memberNames = null;
				this.memberRanks = null;
				this.field1651 = null;
				this.field1649 = null;
				this.field1650 = null;
				this.currentOwner = -1;
				this.field1652 = -1;
			} else {
				System.arraycopy(this.memberRanks, var1 + 1, this.memberRanks, var1, this.memberCount - var1);
				System.arraycopy(this.field1651, var1 + 1, this.field1651, var1, this.memberCount - var1);
				System.arraycopy(this.field1649, var1 + 1, this.field1649, var1, this.memberCount - var1);
				System.arraycopy(this.field1650, var1 + 1, this.field1650, var1, this.memberCount - var1);
				if (this.memberHashes != null) {
					System.arraycopy(this.memberHashes, var1 + 1, this.memberHashes, var1, this.memberCount - var1);
				}

				if (this.memberNames != null) {
					System.arraycopy(this.memberNames, var1 + 1, this.memberNames, var1, this.memberCount - var1);
				}

				this.updateOwner();
			}

		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1770256781"
	)
	@Export("updateOwner")
	void updateOwner() {
		if (this.memberCount == 0) {
			this.currentOwner = -1;
			this.field1652 = -1;
		} else {
			this.currentOwner = -1;
			this.field1652 = -1;
			int var1 = 0;
			byte var2 = this.memberRanks[0];

			for (int var3 = 1; var3 < this.memberCount; ++var3) {
				if (this.memberRanks[var3] > var2) {
					if (var2 == 125) {
						this.field1652 = var1;
					}

					var1 = var3;
					var2 = this.memberRanks[var3];
				} else if (this.field1652 == -1 && this.memberRanks[var3] == 125) {
					this.field1652 = var3;
				}
			}

			this.currentOwner = var1;
			if (this.currentOwner != -1) {
				this.memberRanks[this.currentOwner] = 126;
			}

		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;B)V",
		garbageValue = "1"
	)
	void method2891(long var1, String var3) {
		if (var3 != null && var3.length() == 0) {
			var3 = null;
		}

		if (var1 > 0L != this.useHashes) {
			throw new RuntimeException("");
		} else if (var3 != null != this.useNames) {
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.bannedMemberHashes == null || this.bannedMemberCount >= this.bannedMemberHashes.length) || var3 != null && (this.bannedMemberNames == null || this.bannedMemberCount >= this.bannedMemberNames.length)) {
				this.method2883(this.bannedMemberCount + 5);
			}

			if (this.bannedMemberHashes != null) {
				this.bannedMemberHashes[this.bannedMemberCount] = var1;
			}

			if (this.bannedMemberNames != null) {
				this.bannedMemberNames[this.bannedMemberCount] = var3;
			}

			++this.bannedMemberCount;
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-40246503"
	)
	void method2892(int var1) {
		--this.bannedMemberCount;
		if (this.bannedMemberCount == 0) {
			this.bannedMemberHashes = null;
			this.bannedMemberNames = null;
		} else {
			if (this.bannedMemberHashes != null) {
				System.arraycopy(this.bannedMemberHashes, var1 + 1, this.bannedMemberHashes, var1, this.bannedMemberCount - var1);
			}

			if (this.bannedMemberNames != null) {
				System.arraycopy(this.bannedMemberNames, var1 + 1, this.bannedMemberNames, var1, this.bannedMemberCount - var1);
			}
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IBI)I",
		garbageValue = "46712984"
	)
	int method2930(int var1, byte var2) {
		if (var2 != 126 && var2 != 127) {
			if (this.currentOwner == var1 && (this.field1652 == -1 || this.memberRanks[this.field1652] < 125)) {
				return -1;
			} else if (this.memberRanks[var1] == var2) {
				return -1;
			} else {
				this.memberRanks[var1] = var2;
				this.updateOwner();
				return var1;
			}
		} else {
			return -1;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-2047746975"
	)
	boolean method2894(int var1) {
		if (this.currentOwner != var1 && this.memberRanks[var1] != 126) {
			this.memberRanks[this.currentOwner] = 125;
			this.field1652 = this.currentOwner;
			this.memberRanks[var1] = 126;
			this.currentOwner = var1;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IZI)I",
		garbageValue = "-1302763835"
	)
	int method2895(int var1, boolean var2) {
		if (this.field1650[var1] == var2) {
			return -1;
		} else {
			this.field1650[var1] = var2;
			return var1;
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I",
		garbageValue = "1423184573"
	)
	int method2896(int var1, int var2, int var3, int var4) {
		int var5 = (1 << var3) - 1;
		int var6 = var4 == 31 ? -1 : (1 << var4 + 1) - 1;
		int var7 = var6 ^ var5;
		var2 <<= var3;
		var2 &= var7;
		int var8 = this.field1651[var1];
		if ((var8 & var7) == var2) {
			return -1;
		} else {
			var8 &= ~var7;
			this.field1651[var1] = var8 | var2;
			return var1;
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1693351143"
	)
	boolean method2909(int var1, int var2) {
		if (this.parameters != null) {
			Node var3 = this.parameters.get((long)var1);
			if (var3 != null) {
				if (var3 instanceof IntegerNode) {
					IntegerNode var4 = (IntegerNode)var3;
					if (var2 == var4.integer) {
						return false;
					}

					var4.integer = var2;
					return true;
				}

				var3.remove();
			}
		} else {
			this.parameters = new IterableNodeHashTable(4);
		}

		this.parameters.put(new IntegerNode(var2), (long)var1);
		return true;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)Z",
		garbageValue = "55"
	)
	boolean method2898(int var1, int var2, int var3, int var4) {
		int var5 = (1 << var3) - 1;
		int var6 = var4 == 31 ? -1 : (1 << var4 + 1) - 1;
		int var7 = var6 ^ var5;
		var2 <<= var3;
		var2 &= var7;
		if (this.parameters != null) {
			Node var8 = this.parameters.get((long)var1);
			if (var8 != null) {
				if (var8 instanceof IntegerNode) {
					IntegerNode var9 = (IntegerNode)var8;
					if ((var9.integer & var7) == var2) {
						return false;
					}

					var9.integer &= ~var7;
					var9.integer |= var2;
					return true;
				}

				var8.remove();
			}
		} else {
			this.parameters = new IterableNodeHashTable(4);
		}

		this.parameters.put(new IntegerNode(var2), (long)var1);
		return true;
	}

	@ObfuscatedName("n")
	boolean method2889(int var1, long var2) {
		if (this.parameters != null) {
			Node var4 = this.parameters.get((long)var1);
			if (var4 != null) {
				if (var4 instanceof class408) {
					class408 var5 = (class408)var4;
					if (var2 == var5.field4463) {
						return false;
					}

					var5.field4463 = var2;
					return true;
				}

				var4.remove();
			}
		} else {
			this.parameters = new IterableNodeHashTable(4);
		}

		this.parameters.put(new class408(var2), (long)var1);
		return true;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Z",
		garbageValue = "-1953428658"
	)
	boolean method2900(int var1, String var2) {
		if (var2 == null) {
			var2 = "";
		} else if (var2.length() > 80) {
			var2 = var2.substring(0, 80);
		}

		if (this.parameters != null) {
			Node var3 = this.parameters.get((long)var1);
			if (var3 != null) {
				if (var3 instanceof ObjectNode) {
					ObjectNode var4 = (ObjectNode)var3;
					if (var4.obj instanceof String) {
						if (var2.equals(var4.obj)) {
							return false;
						}

						var4.remove();
						this.parameters.put(new ObjectNode(var2), var4.key);
						return true;
					}
				}

				var3.remove();
			}
		} else {
			this.parameters = new IterableNodeHashTable(4);
		}

		this.parameters.put(new ObjectNode(var2), (long)var1);
		return true;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lpx;B)V",
		garbageValue = "-122"
	)
	void method2901(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if (var2 >= 1 && var2 <= 6) {
			int var3 = var1.readUnsignedByte();
			if ((var3 & 1) != 0) {
				this.useHashes = true;
			}

			if ((var3 & 2) != 0) {
				this.useNames = true;
			}

			if (!this.useHashes) {
				this.memberHashes = null;
				this.bannedMemberHashes = null;
			}

			if (!this.useNames) {
				this.memberNames = null;
				this.bannedMemberNames = null;
			}

			this.field1636 = var1.readInt();
			this.field1638 = var1.readInt();
			if (var2 <= 3 && this.field1638 != 0) {
				this.field1638 += 16912800;
			}

			this.memberCount = var1.readUnsignedShort();
			this.bannedMemberCount = var1.readUnsignedByte();
			this.name = var1.readStringCp1252NullTerminated();
			if (var2 >= 4) {
				var1.readInt();
			}

			this.allowGuests = var1.readUnsignedByte() == 1;
			this.field1633 = var1.readByte();
			this.field1641 = var1.readByte();
			this.field1642 = var1.readByte();
			this.field1648 = var1.readByte();
			int var4;
			if (this.memberCount > 0) {
				if (this.useHashes && (this.memberHashes == null || this.memberHashes.length < this.memberCount)) {
					this.memberHashes = new long[this.memberCount];
				}

				if (this.useNames && (this.memberNames == null || this.memberNames.length < this.memberCount)) {
					this.memberNames = new String[this.memberCount];
				}

				if (this.memberRanks == null || this.memberRanks.length < this.memberCount) {
					this.memberRanks = new byte[this.memberCount];
				}

				if (this.field1651 == null || this.field1651.length < this.memberCount) {
					this.field1651 = new int[this.memberCount];
				}

				if (this.field1649 == null || this.field1649.length < this.memberCount) {
					this.field1649 = new int[this.memberCount];
				}

				if (this.field1650 == null || this.field1650.length < this.memberCount) {
					this.field1650 = new boolean[this.memberCount];
				}

				for (var4 = 0; var4 < this.memberCount; ++var4) {
					if (this.useHashes) {
						this.memberHashes[var4] = var1.readLong();
					}

					if (this.useNames) {
						this.memberNames[var4] = var1.readStringCp1252NullTerminatedOrNull();
					}

					this.memberRanks[var4] = var1.readByte();
					if (var2 >= 2) {
						this.field1651[var4] = var1.readInt();
					}

					if (var2 >= 5) {
						this.field1649[var4] = var1.readUnsignedShort();
					} else {
						this.field1649[var4] = 0;
					}

					if (var2 >= 6) {
						this.field1650[var4] = var1.readUnsignedByte() == 1;
					} else {
						this.field1650[var4] = false;
					}
				}

				this.updateOwner();
			}

			if (this.bannedMemberCount > 0) {
				if (this.useHashes && (this.bannedMemberHashes == null || this.bannedMemberHashes.length < this.bannedMemberCount)) {
					this.bannedMemberHashes = new long[this.bannedMemberCount];
				}

				if (this.useNames && (this.bannedMemberNames == null || this.bannedMemberNames.length < this.bannedMemberCount)) {
					this.bannedMemberNames = new String[this.bannedMemberCount];
				}

				for (var4 = 0; var4 < this.bannedMemberCount; ++var4) {
					if (this.useHashes) {
						this.bannedMemberHashes[var4] = var1.readLong();
					}

					if (this.useNames) {
						this.bannedMemberNames[var4] = var1.readStringCp1252NullTerminatedOrNull();
					}
				}
			}

			if (var2 >= 3) {
				var4 = var1.readUnsignedShort();
				if (var4 > 0) {
					this.parameters = new IterableNodeHashTable(var4 < 16 ? FontName.method7228(var4) : 16);

					while (var4-- > 0) {
						int var5 = var1.readInt();
						int var6 = var5 & 1073741823;
						int var7 = var5 >>> 30;
						if (var7 == 0) {
							int var12 = var1.readInt();
							this.parameters.put(new IntegerNode(var12), (long)var6);
						} else if (var7 == 1) {
							long var10 = var1.readLong();
							this.parameters.put(new class408(var10), (long)var6);
						} else if (var7 == 2) {
							String var8 = var1.readStringCp1252NullTerminated();
							this.parameters.put(new ObjectNode(var8), (long)var6);
						}
					}
				}
			}

		} else {
			throw new RuntimeException("" + var2);
		}
	}

	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "14"
	)
	@Export("load")
	static void load() {
		int var19;
		if (Client.titleLoadingStage == 0) {
			class175.scene = new Scene(4, 104, 104, Tiles.Tiles_heights);

			for (var19 = 0; var19 < 4; ++var19) {
				Client.collisionMaps[var19] = new CollisionMap(104, 104);
			}

			InterfaceParent.sceneMinimapSprite = new SpritePixels(512, 512);
			Login.Login_loadingText = "Starting game engine...";
			Login.Login_loadingPercent = 5;
			Client.titleLoadingStage = 20;
		} else if (Client.titleLoadingStage == 20) {
			Login.Login_loadingText = "Prepared visibility map";
			Login.Login_loadingPercent = 10;
			Client.titleLoadingStage = 30;
		} else if (Client.titleLoadingStage == 30) {
			NetSocket.archive0 = WorldMapRegion.newArchive(0, false, true, true);
			Clock.archive1 = WorldMapRegion.newArchive(1, false, true, true);
			class356.archive2 = WorldMapRegion.newArchive(2, true, false, true);
			class194.archive3 = WorldMapRegion.newArchive(3, false, true, true);
			MouseHandler.archive4 = WorldMapRegion.newArchive(4, false, true, true);
			Message.archive5 = WorldMapRegion.newArchive(5, true, true, true);
			AbstractUserComparator.archive6 = WorldMapRegion.newArchive(6, true, true, true);
			InterfaceParent.archive7 = WorldMapRegion.newArchive(7, false, true, true);
			class305.archive8 = WorldMapRegion.newArchive(8, false, true, true);
			TileItem.archive9 = WorldMapRegion.newArchive(9, false, true, true);
			ObjectSound.archive10 = WorldMapRegion.newArchive(10, false, true, true);
			UrlRequest.archive11 = WorldMapRegion.newArchive(11, false, true, true);
			class115.archive12 = WorldMapRegion.newArchive(12, false, true, true);
			class16.archive13 = WorldMapRegion.newArchive(13, true, false, true);
			class101.archive14 = WorldMapRegion.newArchive(14, false, true, true);
			Client.archive15 = WorldMapRegion.newArchive(15, false, true, true);
			class114.archive17 = WorldMapRegion.newArchive(17, true, true, true);
			class92.archive18 = WorldMapRegion.newArchive(18, false, true, true);
			VarpDefinition.archive19 = WorldMapRegion.newArchive(19, false, true, true);
			ItemContainer.archive20 = WorldMapRegion.newArchive(20, false, true, true);
			Login.Login_loadingText = "Connecting to update server";
			Login.Login_loadingPercent = 20;
			Client.titleLoadingStage = 40;
		} else if (Client.titleLoadingStage == 40) {
			byte var33 = 0;
			var19 = var33 + NetSocket.archive0.percentage() * 4 / 100;
			var19 += Clock.archive1.percentage() * 4 / 100;
			var19 += class356.archive2.percentage() * 2 / 100;
			var19 += class194.archive3.percentage() * 2 / 100;
			var19 += MouseHandler.archive4.percentage() * 6 / 100;
			var19 += Message.archive5.percentage() * 4 / 100;
			var19 += AbstractUserComparator.archive6.percentage() * 2 / 100;
			var19 += InterfaceParent.archive7.percentage() * 56 / 100;
			var19 += class305.archive8.percentage() * 2 / 100;
			var19 += TileItem.archive9.percentage() * 2 / 100;
			var19 += ObjectSound.archive10.percentage() * 2 / 100;
			var19 += UrlRequest.archive11.percentage() * 2 / 100;
			var19 += class115.archive12.percentage() * 2 / 100;
			var19 += class16.archive13.percentage() * 2 / 100;
			var19 += class101.archive14.percentage() * 2 / 100;
			var19 += Client.archive15.percentage() * 2 / 100;
			var19 += VarpDefinition.archive19.percentage() / 100;
			var19 += class92.archive18.percentage() / 100;
			var19 += ItemContainer.archive20.percentage() / 100;
			var19 += class114.archive17.method5624() && class114.archive17.isFullyLoaded() ? 1 : 0;
			if (var19 != 100) {
				if (var19 != 0) {
					Login.Login_loadingText = "Checking for updates - " + var19 + "%";
				}

				Login.Login_loadingPercent = 30;
			} else {
				HealthBar.method2335(NetSocket.archive0, "Animations");
				HealthBar.method2335(Clock.archive1, "Skeletons");
				HealthBar.method2335(MouseHandler.archive4, "Sound FX");
				HealthBar.method2335(Message.archive5, "Maps");
				HealthBar.method2335(AbstractUserComparator.archive6, "Music Tracks");
				HealthBar.method2335(InterfaceParent.archive7, "Models");
				HealthBar.method2335(class305.archive8, "Sprites");
				HealthBar.method2335(UrlRequest.archive11, "Music Jingles");
				HealthBar.method2335(class101.archive14, "Music Samples");
				HealthBar.method2335(Client.archive15, "Music Patches");
				HealthBar.method2335(VarpDefinition.archive19, "World Map");
				HealthBar.method2335(class92.archive18, "World Map Geography");
				HealthBar.method2335(ItemContainer.archive20, "World Map Ground");
				class28.spriteIds = new GraphicsDefaults();
				class28.spriteIds.decode(class114.archive17);
				Login.Login_loadingText = "Loaded update list";
				Login.Login_loadingPercent = 30;
				Client.titleLoadingStage = 45;
			}
		} else {
			Archive var2;
			Archive var23;
			Archive var30;
			if (Client.titleLoadingStage == 45) {
				WorldMapSprite.method4809(22050, !Client.isLowDetail, 2);
				MidiPcmStream var29 = new MidiPcmStream();
				var29.method5151(9, 128);
				SecureRandomCallable.pcmPlayer0 = class271.method5045(GameEngine.taskHandler, 0, 22050);
				SecureRandomCallable.pcmPlayer0.setStream(var29);
				var30 = Client.archive15;
				var2 = class101.archive14;
				var23 = MouseHandler.archive4;
				class273.musicPatchesArchive = var30;
				class462.musicSamplesArchive = var2;
				class273.soundEffectsArchive = var23;
				class273.midiPcmStream = var29;
				Fonts.pcmPlayer1 = class271.method5045(GameEngine.taskHandler, 1, 2048);
				class122.pcmStreamMixer = new PcmStreamMixer();
				Fonts.pcmPlayer1.setStream(class122.pcmStreamMixer);
				class403.field4455 = new Decimator(22050, PcmPlayer.field300);
				Login.Login_loadingText = "Prepared sound engine";
				Login.Login_loadingPercent = 35;
				Client.titleLoadingStage = 50;
				MouseHandler.WorldMapElement_fonts = new Fonts(class305.archive8, class16.archive13);
			} else if (Client.titleLoadingStage == 50) {
				var19 = FontName.method7232().length;
				Client.fontsMap = MouseHandler.WorldMapElement_fonts.createMap(FontName.method7232());
				if (Client.fontsMap.size() < var19) {
					Login.Login_loadingText = "Loading fonts - " + Client.fontsMap.size() * 100 / var19 + "%";
					Login.Login_loadingPercent = 40;
				} else {
					Varcs.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11);
					class149.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12);
					ChatChannel.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12);
					class135.platformInfo = Client.platformInfoProvider.get();
					Login.Login_loadingText = "Loaded fonts";
					Login.Login_loadingPercent = 40;
					Client.titleLoadingStage = 60;
				}
			} else {
				int var20;
				if (Client.titleLoadingStage == 60) {
					var19 = DevicePcmPlayerProvider.method338(ObjectSound.archive10, class305.archive8);
					var20 = Login.field911.length + Login.field910.length;
					if (var19 < var20) {
						Login.Login_loadingText = "Loading title screen - " + var19 * 100 / var20 + "%";
						Login.Login_loadingPercent = 50;
					} else {
						Login.Login_loadingText = "Loaded title screen";
						Login.Login_loadingPercent = 50;
						PendingSpawn.updateGameState(5);
						Client.titleLoadingStage = 70;
					}
				} else if (Client.titleLoadingStage == 70) {
					if (!class356.archive2.isFullyLoaded()) {
						Login.Login_loadingText = "Loading config - " + class356.archive2.loadPercent() + "%";
						Login.Login_loadingPercent = 60;
					} else {
						WorldMapLabelSize.method4417(class356.archive2);
						Archive var28 = class356.archive2;
						FloorUnderlayDefinition.FloorUnderlayDefinition_archive = var28;
						JagexCache.method3154(class356.archive2, InterfaceParent.archive7);
						class93.method2392(class356.archive2, InterfaceParent.archive7, Client.isLowDetail);
						var30 = class356.archive2;
						var2 = InterfaceParent.archive7;
						NPCComposition.NpcDefinition_archive = var30;
						class17.NpcDefinition_modelArchive = var2;
						World.method1662(class356.archive2);
						var23 = class356.archive2;
						Archive var4 = InterfaceParent.archive7;
						boolean var24 = Client.isMembersWorld;
						Font var25 = Varcs.fontPlain11;
						ItemComposition.ItemDefinition_archive = var23;
						ItemComposition.ItemDefinition_modelArchive = var4;
						class82.ItemDefinition_inMembersWorld = var24;
						ItemContainer.ItemDefinition_fileCount = ItemComposition.ItemDefinition_archive.getGroupFileCount(10);
						class146.ItemDefinition_fontPlain11 = var25;
						Archive var31 = class356.archive2;
						Archive var26 = NetSocket.archive0;
						Archive var32 = Clock.archive1;
						SequenceDefinition.SequenceDefinition_archive = var31;
						SequenceDefinition.SequenceDefinition_animationsArchive = var26;
						SequenceDefinition.SequenceDefinition_skeletonsArchive = var32;
						Archive var27 = class356.archive2;
						Archive var11 = InterfaceParent.archive7;
						SpotAnimationDefinition.SpotAnimationDefinition_archive = var27;
						class175.SpotAnimationDefinition_modelArchive = var11;
						Archive var12 = class356.archive2;
						VarbitComposition.VarbitDefinition_archive = var12;
						Archive var13 = class356.archive2;
						VarpDefinition.VarpDefinition_archive = var13;
						VarpDefinition.VarpDefinition_fileCount = VarpDefinition.VarpDefinition_archive.getGroupFileCount(16);
						Timer.method6381(class194.archive3, InterfaceParent.archive7, class305.archive8, class16.archive13);
						Archive var14 = class356.archive2;
						InvDefinition.InvDefinition_archive = var14;
						Archive var15 = class356.archive2;
						EnumComposition.EnumDefinition_archive = var15;
						Archive var16 = class356.archive2;
						VarcInt.VarcInt_archive = var16;
						class16.method179(class356.archive2);
						class305.method5592(class356.archive2);
						Login.HitSplatDefinition_cachedSprites = new class428(ApproximateRouteStrategy.field473, 54, class263.clientLanguage, class356.archive2);
						class221.Ignored_cached = new class428(ApproximateRouteStrategy.field473, 47, class263.clientLanguage, class356.archive2);
						class125.varcs = new Varcs();
						GameEngine.method505(class356.archive2, class305.archive8, class16.archive13);
						Archive var17 = class356.archive2;
						Archive var18 = class305.archive8;
						World.HealthBarDefinition_archive = var17;
						HealthBarDefinition.field1911 = var18;
						class154.method3059(class356.archive2, class305.archive8);
						Login.Login_loadingText = "Loaded config";
						Login.Login_loadingPercent = 60;
						Client.titleLoadingStage = 80;
					}
				} else if (Client.titleLoadingStage == 80) {
					var19 = 0;
					if (SoundSystem.compass == null) {
						SoundSystem.compass = StructComposition.SpriteBuffer_getSprite(class305.archive8, class28.spriteIds.compass, 0);
					} else {
						++var19;
					}

					if (class344.redHintArrowSprite == null) {
						class344.redHintArrowSprite = StructComposition.SpriteBuffer_getSprite(class305.archive8, class28.spriteIds.field4373, 0);
					} else {
						++var19;
					}

					if (class29.mapSceneSprites == null) {
						class29.mapSceneSprites = ItemContainer.method2062(class305.archive8, class28.spriteIds.mapScenes, 0);
					} else {
						++var19;
					}

					SpritePixels[] var1;
					int var3;
					SpritePixels[] var5;
					int var6;
					SpritePixels var7;
					int var8;
					byte[] var9;
					int var10;
					if (UserComparator4.headIconPkSprites == null) {
						var2 = class305.archive8;
						var3 = class28.spriteIds.headIconsPk;
						if (!Nameable.SpriteBuffer_loadSpritesFromArchive(var2, var3, 0)) {
							var1 = null;
						} else {
							var5 = new SpritePixels[class453.SpriteBuffer_spriteCount];
							var6 = 0;

							while (true) {
								if (var6 >= class453.SpriteBuffer_spriteCount) {
									VarcInt.method3325();
									var1 = var5;
									break;
								}

								var7 = var5[var6] = new SpritePixels();
								var7.width = class453.SpriteBuffer_spriteWidth;
								var7.height = class453.SpriteBuffer_spriteHeight;
								var7.xOffset = class453.SpriteBuffer_xOffsets[var6];
								var7.yOffset = class453.SpriteBuffer_yOffsets[var6];
								var7.subWidth = ScriptFrame.SpriteBuffer_spriteWidths[var6];
								var7.subHeight = class453.SpriteBuffer_spriteHeights[var6];
								var8 = var7.subHeight * var7.subWidth;
								var9 = class127.SpriteBuffer_pixels[var6];
								var7.pixels = new int[var8];

								for (var10 = 0; var10 < var8; ++var10) {
									var7.pixels[var10] = Decimator.SpriteBuffer_spritePalette[var9[var10] & 255];
								}

								++var6;
							}
						}

						UserComparator4.headIconPkSprites = var1;
					} else {
						++var19;
					}

					if (ChatChannel.headIconPrayerSprites == null) {
						var2 = class305.archive8;
						var3 = class28.spriteIds.field4376;
						if (!Nameable.SpriteBuffer_loadSpritesFromArchive(var2, var3, 0)) {
							var1 = null;
						} else {
							var5 = new SpritePixels[class453.SpriteBuffer_spriteCount];
							var6 = 0;

							while (true) {
								if (var6 >= class453.SpriteBuffer_spriteCount) {
									VarcInt.method3325();
									var1 = var5;
									break;
								}

								var7 = var5[var6] = new SpritePixels();
								var7.width = class453.SpriteBuffer_spriteWidth;
								var7.height = class453.SpriteBuffer_spriteHeight;
								var7.xOffset = class453.SpriteBuffer_xOffsets[var6];
								var7.yOffset = class453.SpriteBuffer_yOffsets[var6];
								var7.subWidth = ScriptFrame.SpriteBuffer_spriteWidths[var6];
								var7.subHeight = class453.SpriteBuffer_spriteHeights[var6];
								var8 = var7.subWidth * var7.subHeight;
								var9 = class127.SpriteBuffer_pixels[var6];
								var7.pixels = new int[var8];

								for (var10 = 0; var10 < var8; ++var10) {
									var7.pixels[var10] = Decimator.SpriteBuffer_spritePalette[var9[var10] & 255];
								}

								++var6;
							}
						}

						ChatChannel.headIconPrayerSprites = var1;
					} else {
						++var19;
					}

					if (class21.headIconHintSprites == null) {
						var2 = class305.archive8;
						var3 = class28.spriteIds.field4377;
						if (!Nameable.SpriteBuffer_loadSpritesFromArchive(var2, var3, 0)) {
							var1 = null;
						} else {
							var5 = new SpritePixels[class453.SpriteBuffer_spriteCount];
							var6 = 0;

							while (true) {
								if (var6 >= class453.SpriteBuffer_spriteCount) {
									VarcInt.method3325();
									var1 = var5;
									break;
								}

								var7 = var5[var6] = new SpritePixels();
								var7.width = class453.SpriteBuffer_spriteWidth;
								var7.height = class453.SpriteBuffer_spriteHeight;
								var7.xOffset = class453.SpriteBuffer_xOffsets[var6];
								var7.yOffset = class453.SpriteBuffer_yOffsets[var6];
								var7.subWidth = ScriptFrame.SpriteBuffer_spriteWidths[var6];
								var7.subHeight = class453.SpriteBuffer_spriteHeights[var6];
								var8 = var7.subWidth * var7.subHeight;
								var9 = class127.SpriteBuffer_pixels[var6];
								var7.pixels = new int[var8];

								for (var10 = 0; var10 < var8; ++var10) {
									var7.pixels[var10] = Decimator.SpriteBuffer_spritePalette[var9[var10] & 255];
								}

								++var6;
							}
						}

						class21.headIconHintSprites = var1;
					} else {
						++var19;
					}

					if (class146.mapMarkerSprites == null) {
						var2 = class305.archive8;
						var3 = class28.spriteIds.field4378;
						if (!Nameable.SpriteBuffer_loadSpritesFromArchive(var2, var3, 0)) {
							var1 = null;
						} else {
							var5 = new SpritePixels[class453.SpriteBuffer_spriteCount];
							var6 = 0;

							while (true) {
								if (var6 >= class453.SpriteBuffer_spriteCount) {
									VarcInt.method3325();
									var1 = var5;
									break;
								}

								var7 = var5[var6] = new SpritePixels();
								var7.width = class453.SpriteBuffer_spriteWidth;
								var7.height = class453.SpriteBuffer_spriteHeight;
								var7.xOffset = class453.SpriteBuffer_xOffsets[var6];
								var7.yOffset = class453.SpriteBuffer_yOffsets[var6];
								var7.subWidth = ScriptFrame.SpriteBuffer_spriteWidths[var6];
								var7.subHeight = class453.SpriteBuffer_spriteHeights[var6];
								var8 = var7.subWidth * var7.subHeight;
								var9 = class127.SpriteBuffer_pixels[var6];
								var7.pixels = new int[var8];

								for (var10 = 0; var10 < var8; ++var10) {
									var7.pixels[var10] = Decimator.SpriteBuffer_spritePalette[var9[var10] & 255];
								}

								++var6;
							}
						}

						class146.mapMarkerSprites = var1;
					} else {
						++var19;
					}

					if (Projectile.crossSprites == null) {
						var2 = class305.archive8;
						var3 = class28.spriteIds.field4374;
						if (!Nameable.SpriteBuffer_loadSpritesFromArchive(var2, var3, 0)) {
							var1 = null;
						} else {
							var5 = new SpritePixels[class453.SpriteBuffer_spriteCount];
							var6 = 0;

							while (true) {
								if (var6 >= class453.SpriteBuffer_spriteCount) {
									VarcInt.method3325();
									var1 = var5;
									break;
								}

								var7 = var5[var6] = new SpritePixels();
								var7.width = class453.SpriteBuffer_spriteWidth;
								var7.height = class453.SpriteBuffer_spriteHeight;
								var7.xOffset = class453.SpriteBuffer_xOffsets[var6];
								var7.yOffset = class453.SpriteBuffer_yOffsets[var6];
								var7.subWidth = ScriptFrame.SpriteBuffer_spriteWidths[var6];
								var7.subHeight = class453.SpriteBuffer_spriteHeights[var6];
								var8 = var7.subWidth * var7.subHeight;
								var9 = class127.SpriteBuffer_pixels[var6];
								var7.pixels = new int[var8];

								for (var10 = 0; var10 < var8; ++var10) {
									var7.pixels[var10] = Decimator.SpriteBuffer_spritePalette[var9[var10] & 255];
								}

								++var6;
							}
						}

						Projectile.crossSprites = var1;
					} else {
						++var19;
					}

					if (DecorativeObject.mapDotSprites == null) {
						var2 = class305.archive8;
						var3 = class28.spriteIds.field4375;
						if (!Nameable.SpriteBuffer_loadSpritesFromArchive(var2, var3, 0)) {
							var1 = null;
						} else {
							var5 = new SpritePixels[class453.SpriteBuffer_spriteCount];
							var6 = 0;

							while (true) {
								if (var6 >= class453.SpriteBuffer_spriteCount) {
									VarcInt.method3325();
									var1 = var5;
									break;
								}

								var7 = var5[var6] = new SpritePixels();
								var7.width = class453.SpriteBuffer_spriteWidth;
								var7.height = class453.SpriteBuffer_spriteHeight;
								var7.xOffset = class453.SpriteBuffer_xOffsets[var6];
								var7.yOffset = class453.SpriteBuffer_yOffsets[var6];
								var7.subWidth = ScriptFrame.SpriteBuffer_spriteWidths[var6];
								var7.subHeight = class453.SpriteBuffer_spriteHeights[var6];
								var8 = var7.subHeight * var7.subWidth;
								var9 = class127.SpriteBuffer_pixels[var6];
								var7.pixels = new int[var8];

								for (var10 = 0; var10 < var8; ++var10) {
									var7.pixels[var10] = Decimator.SpriteBuffer_spritePalette[var9[var10] & 255];
								}

								++var6;
							}
						}

						DecorativeObject.mapDotSprites = var1;
					} else {
						++var19;
					}

					if (class127.scrollBarSprites == null) {
						class127.scrollBarSprites = ItemContainer.method2062(class305.archive8, class28.spriteIds.field4381, 0);
					} else {
						++var19;
					}

					if (ScriptEvent.modIconSprites == null) {
						ScriptEvent.modIconSprites = ItemContainer.method2062(class305.archive8, class28.spriteIds.field4372, 0);
					} else {
						++var19;
					}

					if (var19 < 11) {
						Login.Login_loadingText = "Loading sprites - " + var19 * 100 / 12 + "%";
						Login.Login_loadingPercent = 70;
					} else {
						AbstractFont.AbstractFont_modIconSprites = ScriptEvent.modIconSprites;
						class344.redHintArrowSprite.normalize();
						var20 = (int)(Math.random() * 21.0D) - 10;
						int var21 = (int)(Math.random() * 21.0D) - 10;
						var3 = (int)(Math.random() * 21.0D) - 10;
						int var22 = (int)(Math.random() * 41.0D) - 20;
						class29.mapSceneSprites[0].shiftColors(var22 + var20, var21 + var22, var3 + var22);
						Login.Login_loadingText = "Loaded sprites";
						Login.Login_loadingPercent = 70;
						Client.titleLoadingStage = 90;
					}
				} else if (Client.titleLoadingStage == 90) {
					if (!TileItem.archive9.isFullyLoaded()) {
						Login.Login_loadingText = "Loading textures - " + "0%";
						Login.Login_loadingPercent = 90;
					} else {
						PcmPlayer.textureProvider = new TextureProvider(TileItem.archive9, class305.archive8, 20, class12.clientPreferences.method2225(), Client.isLowDetail ? 64 : 128);
						Rasterizer3D.method3910(PcmPlayer.textureProvider);
						Rasterizer3D.Rasterizer3D_setBrightness(class12.clientPreferences.method2225());
						Client.titleLoadingStage = 100;
					}
				} else if (Client.titleLoadingStage == 100) {
					var19 = PcmPlayer.textureProvider.getLoadedPercentage();
					if (var19 < 100) {
						Login.Login_loadingText = "Loading textures - " + var19 + "%";
						Login.Login_loadingPercent = 90;
					} else {
						Login.Login_loadingText = "Loaded textures";
						Login.Login_loadingPercent = 90;
						Client.titleLoadingStage = 110;
					}
				} else if (Client.titleLoadingStage == 110) {
					Varcs.mouseRecorder = new MouseRecorder();
					GameEngine.taskHandler.newThreadTask(Varcs.mouseRecorder, 10);
					Login.Login_loadingText = "Loaded input handler";
					Login.Login_loadingPercent = 92;
					Client.titleLoadingStage = 120;
				} else if (Client.titleLoadingStage == 120) {
					if (!ObjectSound.archive10.tryLoadFileByNames("huffman", "")) {
						Login.Login_loadingText = "Loading wordpack - " + 0 + "%";
						Login.Login_loadingPercent = 94;
					} else {
						Huffman var0 = new Huffman(ObjectSound.archive10.takeFileByNames("huffman", ""));
						GraphicsObject.method1870(var0);
						Login.Login_loadingText = "Loaded wordpack";
						Login.Login_loadingPercent = 94;
						Client.titleLoadingStage = 130;
					}
				} else if (Client.titleLoadingStage == 130) {
					if (!class194.archive3.isFullyLoaded()) {
						Login.Login_loadingText = "Loading interfaces - " + class194.archive3.loadPercent() * 4 / 5 + "%";
						Login.Login_loadingPercent = 96;
					} else if (!class115.archive12.isFullyLoaded()) {
						Login.Login_loadingText = "Loading interfaces - " + (80 + class115.archive12.loadPercent() / 6) + "%";
						Login.Login_loadingPercent = 96;
					} else if (!class16.archive13.isFullyLoaded()) {
						Login.Login_loadingText = "Loading interfaces - " + (96 + class16.archive13.loadPercent() / 50) + "%";
						Login.Login_loadingPercent = 96;
					} else {
						Login.Login_loadingText = "Loaded interfaces";
						Login.Login_loadingPercent = 98;
						Client.titleLoadingStage = 140;
					}
				} else if (Client.titleLoadingStage == 140) {
					Login.Login_loadingPercent = 100;
					if (!VarpDefinition.archive19.tryLoadGroupByName(WorldMapCacheName.field2910.name)) {
						Login.Login_loadingText = "Loading world map - " + VarpDefinition.archive19.groupLoadPercentByName(WorldMapCacheName.field2910.name) / 10 + "%";
					} else {
						if (ServerPacket.worldMap == null) {
							ServerPacket.worldMap = new WorldMap();
							ServerPacket.worldMap.init(VarpDefinition.archive19, class92.archive18, ItemContainer.archive20, ChatChannel.fontBold12, Client.fontsMap, class29.mapSceneSprites);
						}

						Login.Login_loadingText = "Loaded world map";
						Client.titleLoadingStage = 150;
					}
				} else if (Client.titleLoadingStage == 150) {
					PendingSpawn.updateGameState(10);
				}
			}
		}
	}
}
