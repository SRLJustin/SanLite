import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jt")
@Implements("MusicPatch")
public class MusicPatch extends Node {
	@ObfuscatedName("y")
	@Export("Tiles_saturation")
	static int[] Tiles_saturation;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -690673201
	)
	int field3288;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "[Lak;"
	)
	@Export("rawSounds")
	RawSound[] rawSounds;
	@ObfuscatedName("l")
	short[] field3287;
	@ObfuscatedName("k")
	byte[] field3290;
	@ObfuscatedName("a")
	byte[] field3289;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "[Ljp;"
	)
	MusicPatchNode2[] field3291;
	@ObfuscatedName("p")
	byte[] field3285;
	@ObfuscatedName("s")
	int[] field3292;

	MusicPatch(byte[] var1) {
		this.rawSounds = new RawSound[128];
		this.field3287 = new short[128];
		this.field3290 = new byte[128];
		this.field3289 = new byte[128];
		this.field3291 = new MusicPatchNode2[128];
		this.field3285 = new byte[128];
		this.field3292 = new int[128];
		Buffer var2 = new Buffer(var1);

		int var3;
		for (var3 = 0; var2.array[var3 + var2.offset] != 0; ++var3) {
		}

		byte[] var4 = new byte[var3];

		int var5;
		for (var5 = 0; var5 < var3; ++var5) {
			var4[var5] = var2.readByte();
		}

		++var2.offset;
		++var3;
		var5 = var2.offset;
		var2.offset += var3;

		int var6;
		for (var6 = 0; var2.array[var6 + var2.offset] != 0; ++var6) {
		}

		byte[] var7 = new byte[var6];

		int var8;
		for (var8 = 0; var8 < var6; ++var8) {
			var7[var8] = var2.readByte();
		}

		++var2.offset;
		++var6;
		var8 = var2.offset;
		var2.offset += var6;

		int var9;
		for (var9 = 0; var2.array[var9 + var2.offset] != 0; ++var9) {
		}

		byte[] var10 = new byte[var9];

		for (int var11 = 0; var11 < var9; ++var11) {
			var10[var11] = var2.readByte();
		}

		++var2.offset;
		++var9;
		byte[] var36 = new byte[var9];
		int var12;
		int var14;
		if (var9 > 1) {
			var36[1] = 1;
			int var13 = 1;
			var12 = 2;

			for (var14 = 2; var14 < var9; ++var14) {
				int var41 = var2.readUnsignedByte();
				if (var41 == 0) {
					var13 = var12++;
				} else {
					if (var41 <= var13) {
						--var41;
					}

					var13 = var41;
				}

				var36[var14] = (byte)var13;
			}
		} else {
			var12 = var9;
		}

		MusicPatchNode2[] var37 = new MusicPatchNode2[var12];

		MusicPatchNode2 var15;
		for (var14 = 0; var14 < var37.length; ++var14) {
			var15 = var37[var14] = new MusicPatchNode2();
			int var40 = var2.readUnsignedByte();
			if (var40 > 0) {
				var15.field3232 = new byte[var40 * 2];
			}

			var40 = var2.readUnsignedByte();
			if (var40 > 0) {
				var15.field3223 = new byte[var40 * 2 + 2];
				var15.field3223[1] = 64;
			}
		}

		var14 = var2.readUnsignedByte();
		byte[] var42 = var14 > 0 ? new byte[var14 * 2] : null;
		var14 = var2.readUnsignedByte();
		byte[] var16 = var14 > 0 ? new byte[var14 * 2] : null;

		int var17;
		for (var17 = 0; var2.array[var17 + var2.offset] != 0; ++var17) {
		}

		byte[] var18 = new byte[var17];

		int var19;
		for (var19 = 0; var19 < var17; ++var19) {
			var18[var19] = var2.readByte();
		}

		++var2.offset;
		++var17;
		var19 = 0;

		int var20;
		for (var20 = 0; var20 < 128; ++var20) {
			var19 += var2.readUnsignedByte();
			this.field3287[var20] = (short)var19;
		}

		var19 = 0;

		short[] var48;
		for (var20 = 0; var20 < 128; ++var20) {
			var19 += var2.readUnsignedByte();
			var48 = this.field3287;
			var48[var20] = (short)(var48[var20] + (var19 << 8));
		}

		var20 = 0;
		int var21 = 0;
		int var22 = 0;

		int var23;
		for (var23 = 0; var23 < 128; ++var23) {
			if (var20 == 0) {
				if (var21 < var18.length) {
					var20 = var18[var21++];
				} else {
					var20 = -1;
				}

				var22 = var2.readVarInt();
			}

			var48 = this.field3287;
			var48[var23] = (short)(var48[var23] + ((var22 - 1 & 2) << 14));
			this.field3292[var23] = var22;
			--var20;
		}

		var20 = 0;
		var21 = 0;
		var23 = 0;

		int var24;
		for (var24 = 0; var24 < 128; ++var24) {
			if (this.field3292[var24] != 0) {
				if (var20 == 0) {
					if (var21 < var4.length) {
						var20 = var4[var21++];
					} else {
						var20 = -1;
					}

					var23 = var2.array[var5++] - 1;
				}

				this.field3285[var24] = (byte)var23;
				--var20;
			}
		}

		var20 = 0;
		var21 = 0;
		var24 = 0;

		for (int var25 = 0; var25 < 128; ++var25) {
			if (this.field3292[var25] != 0) {
				if (var20 == 0) {
					if (var21 < var7.length) {
						var20 = var7[var21++];
					} else {
						var20 = -1;
					}

					var24 = var2.array[var8++] + 16 << 2;
				}

				this.field3289[var25] = (byte)var24;
				--var20;
			}
		}

		var20 = 0;
		var21 = 0;
		MusicPatchNode2 var38 = null;

		int var26;
		for (var26 = 0; var26 < 128; ++var26) {
			if (this.field3292[var26] != 0) {
				if (var20 == 0) {
					var38 = var37[var36[var21]];
					if (var21 < var10.length) {
						var20 = var10[var21++];
					} else {
						var20 = -1;
					}
				}

				this.field3291[var26] = var38;
				--var20;
			}
		}

		var20 = 0;
		var21 = 0;
		var26 = 0;

		int var27;
		for (var27 = 0; var27 < 128; ++var27) {
			if (var20 == 0) {
				if (var21 < var18.length) {
					var20 = var18[var21++];
				} else {
					var20 = -1;
				}

				if (this.field3292[var27] > 0) {
					var26 = var2.readUnsignedByte() + 1;
				}
			}

			this.field3290[var27] = (byte)var26;
			--var20;
		}

		this.field3288 = var2.readUnsignedByte() + 1;

		int var29;
		MusicPatchNode2 var39;
		for (var27 = 0; var27 < var12; ++var27) {
			var39 = var37[var27];
			if (var39.field3232 != null) {
				for (var29 = 1; var29 < var39.field3232.length; var29 += 2) {
					var39.field3232[var29] = var2.readByte();
				}
			}

			if (var39.field3223 != null) {
				for (var29 = 3; var29 < var39.field3223.length - 2; var29 += 2) {
					var39.field3223[var29] = var2.readByte();
				}
			}
		}

		if (var42 != null) {
			for (var27 = 1; var27 < var42.length; var27 += 2) {
				var42[var27] = var2.readByte();
			}
		}

		if (var16 != null) {
			for (var27 = 1; var27 < var16.length; var27 += 2) {
				var16[var27] = var2.readByte();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var39 = var37[var27];
			if (var39.field3223 != null) {
				var19 = 0;

				for (var29 = 2; var29 < var39.field3223.length; var29 += 2) {
					var19 = var19 + 1 + var2.readUnsignedByte();
					var39.field3223[var29] = (byte)var19;
				}
			}
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var39 = var37[var27];
			if (var39.field3232 != null) {
				var19 = 0;

				for (var29 = 2; var29 < var39.field3232.length; var29 += 2) {
					var19 = var19 + 1 + var2.readUnsignedByte();
					var39.field3232[var29] = (byte)var19;
				}
			}
		}

		byte var30;
		int var32;
		int var33;
		int var34;
		int var45;
		byte var47;
		if (var42 != null) {
			var19 = var2.readUnsignedByte();
			var42[0] = (byte)var19;

			for (var27 = 2; var27 < var42.length; var27 += 2) {
				var19 = var19 + 1 + var2.readUnsignedByte();
				var42[var27] = (byte)var19;
			}

			var47 = var42[0];
			byte var28 = var42[1];

			for (var29 = 0; var29 < var47; ++var29) {
				this.field3290[var29] = (byte)(var28 * this.field3290[var29] + 32 >> 6);
			}

			for (var29 = 2; var29 < var42.length; var29 += 2) {
				var30 = var42[var29];
				byte var31 = var42[var29 + 1];
				var32 = var28 * (var30 - var47) + (var30 - var47) / 2;

				for (var33 = var47; var33 < var30; ++var33) {
					var34 = class134.method2841(var32, var30 - var47);
					this.field3290[var33] = (byte)(var34 * this.field3290[var33] + 32 >> 6);
					var32 += var31 - var28;
				}

				var47 = var30;
				var28 = var31;
			}

			for (var45 = var47; var45 < 128; ++var45) {
				this.field3290[var45] = (byte)(var28 * this.field3290[var45] + 32 >> 6);
			}

			var15 = null;
		}

		if (var16 != null) {
			var19 = var2.readUnsignedByte();
			var16[0] = (byte)var19;

			for (var27 = 2; var27 < var16.length; var27 += 2) {
				var19 = var19 + 1 + var2.readUnsignedByte();
				var16[var27] = (byte)var19;
			}

			var47 = var16[0];
			int var44 = var16[1] << 1;

			for (var29 = 0; var29 < var47; ++var29) {
				var45 = var44 + (this.field3289[var29] & 255);
				if (var45 < 0) {
					var45 = 0;
				}

				if (var45 > 128) {
					var45 = 128;
				}

				this.field3289[var29] = (byte)var45;
			}

			int var46;
			for (var29 = 2; var29 < var16.length; var29 += 2) {
				var30 = var16[var29];
				var46 = var16[var29 + 1] << 1;
				var32 = var44 * (var30 - var47) + (var30 - var47) / 2;

				for (var33 = var47; var33 < var30; ++var33) {
					var34 = class134.method2841(var32, var30 - var47);
					int var35 = var34 + (this.field3289[var33] & 255);
					if (var35 < 0) {
						var35 = 0;
					}

					if (var35 > 128) {
						var35 = 128;
					}

					this.field3289[var33] = (byte)var35;
					var32 += var46 - var44;
				}

				var47 = var30;
				var44 = var46;
			}

			for (var45 = var47; var45 < 128; ++var45) {
				var46 = var44 + (this.field3289[var45] & 255);
				if (var46 < 0) {
					var46 = 0;
				}

				if (var46 > 128) {
					var46 = 128;
				}

				this.field3289[var45] = (byte)var46;
			}

			Object var43 = null;
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var37[var27].field3226 = var2.readUnsignedByte();
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var39 = var37[var27];
			if (var39.field3232 != null) {
				var39.field3225 = var2.readUnsignedByte();
			}

			if (var39.field3223 != null) {
				var39.field3224 = var2.readUnsignedByte();
			}

			if (var39.field3226 > 0) {
				var39.field3227 = var2.readUnsignedByte();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var37[var27].field3229 = var2.readUnsignedByte();
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var39 = var37[var27];
			if (var39.field3229 > 0) {
				var39.field3228 = var2.readUnsignedByte();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var39 = var37[var27];
			if (var39.field3228 > 0) {
				var39.field3222 = var2.readUnsignedByte();
			}
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lan;[B[II)Z",
		garbageValue = "-489821860"
	)
	boolean method5272(SoundCache var1, byte[] var2, int[] var3) {
		boolean var4 = true;
		int var5 = 0;
		RawSound var6 = null;

		for (int var7 = 0; var7 < 128; ++var7) {
			if (var2 == null || var2[var7] != 0) {
				int var8 = this.field3292[var7];
				if (var8 != 0) {
					if (var8 != var5) {
						var5 = var8--;
						if ((var8 & 1) == 0) {
							var6 = var1.getSoundEffect(var8 >> 2, var3);
						} else {
							var6 = var1.getMusicSample(var8 >> 2, var3);
						}

						if (var6 == null) {
							var4 = false;
						}
					}

					if (var6 != null) {
						this.rawSounds[var7] = var6;
						this.field3292[var7] = 0;
					}
				}
			}
		}

		return var4;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "75"
	)
	@Export("clear")
	void clear() {
		this.field3292 = null;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILbb;ZI)I",
		garbageValue = "-879482214"
	)
	static int method5277(int var0, Script var1, boolean var2) {
		if (var0 == 7400) {
			--class12.Interpreter_intStackSize;
			--class9.Interpreter_stringStackSize;
			return 1;
		} else if (var0 == 7401) {
			--class12.Interpreter_intStackSize;
			--class9.Interpreter_stringStackSize;
			return 1;
		} else if (var0 == 7402) {
			class12.Interpreter_intStackSize -= 2;
			--class9.Interpreter_stringStackSize;
			return 1;
		} else if (var0 == 7403) {
			class12.Interpreter_intStackSize -= 2;
			--class9.Interpreter_stringStackSize;
			return 1;
		} else if (var0 == 7404) {
			--class12.Interpreter_intStackSize;
			--class9.Interpreter_stringStackSize;
			return 1;
		} else if (var0 == 7405) {
			class12.Interpreter_intStackSize -= 2;
			return 1;
		} else if (var0 == 7406) {
			--class12.Interpreter_intStackSize;
			Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = "";
			return 1;
		} else if (var0 == 7407) {
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 7408) {
			class12.Interpreter_intStackSize -= 2;
			--class9.Interpreter_stringStackSize;
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 7409) {
			--class12.Interpreter_intStackSize;
			return 1;
		} else {
			return 2;
		}
	}
}
