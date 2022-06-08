import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("db")
public class class115 {
	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("archive12")
	static Archive archive12;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1981912443
	)
	public final int field1455;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Ldb;"
	)
	public class115 field1447;
	@ObfuscatedName("l")
	float[][] field1446;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "[Lnw;"
	)
	final class388[] field1449;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "[Lnw;"
	)
	class388[] field1452;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "[Lnw;"
	)
	class388[] field1451;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	class388 field1459;
	@ObfuscatedName("s")
	boolean field1450;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	class388 field1453;
	@ObfuscatedName("v")
	boolean field1454;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	class388 field1456;
	@ObfuscatedName("c")
	float[][] field1457;
	@ObfuscatedName("w")
	float[][] field1458;
	@ObfuscatedName("b")
	float[][] field1448;

	@ObfuscatedSignature(
		descriptor = "(ILpx;Z)V"
	)
	public class115(int var1, Buffer var2, boolean var3) {
		this.field1459 = new class388();
		this.field1450 = true;
		this.field1453 = new class388();
		this.field1454 = true;
		this.field1456 = new class388();
		this.field1455 = var2.readShort();
		this.field1449 = new class388[var1];
		this.field1452 = new class388[this.field1449.length];
		this.field1451 = new class388[this.field1449.length];
		this.field1446 = new float[this.field1449.length][3];

		for (int var4 = 0; var4 < this.field1449.length; ++var4) {
			this.field1449[var4] = new class388(var2, var3);
			this.field1446[var4][0] = var2.method7570();
			this.field1446[var4][1] = var2.method7570();
			this.field1446[var4][2] = var2.method7570();
		}

		this.method2677();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "54"
	)
	void method2677() {
		this.field1457 = new float[this.field1449.length][3];
		this.field1458 = new float[this.field1449.length][3];
		this.field1448 = new float[this.field1449.length][3];
		class388 var1 = Tile.method3904();

		for (int var2 = 0; var2 < this.field1449.length; ++var2) {
			class388 var3 = this.method2640(var2);
			var1.method6868(var3);
			var1.method6820();
			this.field1457[var2] = var1.method6810();
			this.field1458[var2][0] = var3.field4400[12];
			this.field1458[var2][1] = var3.field4400[13];
			this.field1458[var2][2] = var3.field4400[14];
			this.field1448[var2] = var3.method6821();
		}

		var1.method6865();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)Lnw;",
		garbageValue = "2055144288"
	)
	class388 method2640(int var1) {
		return this.field1449[var1];
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IB)Lnw;",
		garbageValue = "-82"
	)
	class388 method2641(int var1) {
		if (this.field1452[var1] == null) {
			this.field1452[var1] = new class388(this.method2640(var1));
			if (this.field1447 != null) {
				this.field1452[var1].method6816(this.field1447.method2641(var1));
			} else {
				this.field1452[var1].method6816(class388.field4403);
			}
		}

		return this.field1452[var1];
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)Lnw;",
		garbageValue = "543774546"
	)
	class388 method2642(int var1) {
		if (this.field1451[var1] == null) {
			this.field1451[var1] = new class388(this.method2641(var1));
			this.field1451[var1].method6820();
		}

		return this.field1451[var1];
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lnw;I)V",
		garbageValue = "1597711527"
	)
	void method2645(class388 var1) {
		this.field1459.method6868(var1);
		this.field1450 = true;
		this.field1454 = true;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)Lnw;",
		garbageValue = "-1889892168"
	)
	class388 method2672() {
		return this.field1459;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)Lnw;",
		garbageValue = "-1532476889"
	)
	class388 method2652() {
		if (this.field1450) {
			this.field1453.method6868(this.method2672());
			if (this.field1447 != null) {
				this.field1453.method6816(this.field1447.method2652());
			}

			this.field1450 = false;
		}

		return this.field1453;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)Lnw;",
		garbageValue = "1098148128"
	)
	public class388 method2666(int var1) {
		if (this.field1454) {
			this.field1456.method6868(this.method2642(var1));
			this.field1456.method6816(this.method2652());
			this.field1454 = false;
		}

		return this.field1456;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IS)[F",
		garbageValue = "15889"
	)
	float[] method2647(int var1) {
		return this.field1457[var1];
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "-2138262360"
	)
	float[] method2655(int var1) {
		return this.field1458[var1];
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IB)[F",
		garbageValue = "0"
	)
	float[] method2649(int var1) {
		return this.field1448[var1];
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/Date;",
		garbageValue = "12"
	)
	static Date method2679() throws ParseException {
		SimpleDateFormat var0 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
		var0.setLenient(false);
		StringBuilder var1 = new StringBuilder();
		String[] var2 = Login.field876;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			String var4 = var2[var3];
			if (var4 == null) {
				class126.method2799(7);
				class345.setLoginResponseString("Date not valid.", "Please ensure all characters are populated.", "");
				return null;
			}

			var1.append(var4);
		}

		var1.append("12");
		return var0.parse(var1.toString());
	}

	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "(Lcx;I)V",
		garbageValue = "641789779"
	)
	static final void method2680(Actor var0) {
		var0.movementSequence = var0.idleSequence;
		if (var0.pathLength == 0) {
			var0.field1194 = 0;
		} else {
			if (var0.sequence != -1 && var0.sequenceDelay == 0) {
				SequenceDefinition var1 = class114.SequenceDefinition_get(var0.sequence);
				if (var0.field1200 > 0 && var1.field2224 == 0) {
					++var0.field1194;
					return;
				}

				if (var0.field1200 <= 0 && var1.field2206 == 0) {
					++var0.field1194;
					return;
				}
			}

			int var10 = var0.x;
			int var2 = var0.y;
			int var3 = var0.pathX[var0.pathLength - 1] * 128 + var0.field1167 * 64;
			int var4 = var0.pathY[var0.pathLength - 1] * 128 + var0.field1167 * 64;
			if (var10 < var3) {
				if (var2 < var4) {
					var0.orientation = 1280;
				} else if (var2 > var4) {
					var0.orientation = 1792;
				} else {
					var0.orientation = 1536;
				}
			} else if (var10 > var3) {
				if (var2 < var4) {
					var0.orientation = 768;
				} else if (var2 > var4) {
					var0.orientation = 256;
				} else {
					var0.orientation = 512;
				}
			} else if (var2 < var4) {
				var0.orientation = 1024;
			} else if (var2 > var4) {
				var0.orientation = 0;
			}

			class193 var5 = var0.pathTraversed[var0.pathLength - 1];
			if (var3 - var10 <= 256 && var3 - var10 >= -256 && var4 - var2 <= 256 && var4 - var2 >= -256) {
				int var6 = var0.orientation - var0.rotation & 2047;
				if (var6 > 1024) {
					var6 -= 2048;
				}

				int var7 = var0.walkBackSequence;
				if (var6 >= -256 && var6 <= 256) {
					var7 = var0.walkSequence;
				} else if (var6 >= 256 && var6 < 768) {
					var7 = var0.walkRightSequence;
				} else if (var6 >= -768 && var6 <= -256) {
					var7 = var0.walkLeftSequence;
				}

				if (var7 == -1) {
					var7 = var0.walkSequence;
				}

				var0.movementSequence = var7;
				int var8 = 4;
				boolean var9 = true;
				if (var0 instanceof NPC) {
					var9 = ((NPC)var0).definition.isClickable;
				}

				if (var9) {
					if (var0.orientation != var0.rotation && var0.targetIndex == -1 && var0.field1204 != 0) {
						var8 = 2;
					}

					if (var0.pathLength > 2) {
						var8 = 6;
					}

					if (var0.pathLength > 3) {
						var8 = 8;
					}

					if (var0.field1194 > 0 && var0.pathLength > 1) {
						var8 = 8;
						--var0.field1194;
					}
				} else {
					if (var0.pathLength > 1) {
						var8 = 6;
					}

					if (var0.pathLength > 2) {
						var8 = 8;
					}

					if (var0.field1194 > 0 && var0.pathLength > 1) {
						var8 = 8;
						--var0.field1194;
					}
				}

				if (var5 == class193.field2248) {
					var8 <<= 1;
				} else if (var5 == class193.field2249) {
					var8 >>= 1;
				}

				if (var8 >= 8) {
					if (var0.walkSequence == var0.movementSequence && var0.runSequence != -1) {
						var0.movementSequence = var0.runSequence;
					} else if (var0.movementSequence == var0.walkBackSequence && var0.field1150 != -1) {
						var0.movementSequence = var0.field1150;
					} else if (var0.walkLeftSequence == var0.movementSequence && var0.field1183 != -1) {
						var0.movementSequence = var0.field1183;
					} else if (var0.walkRightSequence == var0.movementSequence && var0.field1152 != -1) {
						var0.movementSequence = var0.field1152;
					}
				} else if (var8 <= 1) {
					if (var0.walkSequence == var0.movementSequence && var0.field1160 != -1) {
						var0.movementSequence = var0.field1160;
					} else if (var0.movementSequence == var0.walkBackSequence && var0.field1154 != -1) {
						var0.movementSequence = var0.field1154;
					} else if (var0.movementSequence == var0.walkLeftSequence && var0.field1155 != -1) {
						var0.movementSequence = var0.field1155;
					} else if (var0.walkRightSequence == var0.movementSequence && var0.field1156 != -1) {
						var0.movementSequence = var0.field1156;
					}
				}

				if (var10 != var3 || var2 != var4) {
					if (var10 < var3) {
						var0.x += var8;
						if (var0.x > var3) {
							var0.x = var3;
						}
					} else if (var10 > var3) {
						var0.x -= var8;
						if (var0.x < var3) {
							var0.x = var3;
						}
					}

					if (var2 < var4) {
						var0.y += var8;
						if (var0.y > var4) {
							var0.y = var4;
						}
					} else if (var2 > var4) {
						var0.y -= var8;
						if (var0.y < var4) {
							var0.y = var4;
						}
					}
				}

				if (var3 == var0.x && var4 == var0.y) {
					--var0.pathLength;
					if (var0.field1200 > 0) {
						--var0.field1200;
					}
				}

			} else {
				var0.x = var3;
				var0.y = var4;
				--var0.pathLength;
				if (var0.field1200 > 0) {
					--var0.field1200;
				}

			}
		}
	}
}
