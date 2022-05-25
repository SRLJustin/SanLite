import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("eq")
public class class155 {
	@ObfuscatedName("le")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	@Export("hoveredItemContainer")
	static Widget hoveredItemContainer;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1553344027
	)
	int field1744;
	@ObfuscatedName("v")
	String field1745;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lcb;"
	)
	UrlRequest field1746;
	@ObfuscatedName("c")
	String field1742;
	@ObfuscatedName("w")
	float[] field1749;
	@ObfuscatedName("b")
	ArrayList field1748;
	@ObfuscatedName("t")
	ArrayList field1750;
	@ObfuscatedName("g")
	ArrayList field1751;
	@ObfuscatedName("x")
	Map field1743;
	@ObfuscatedName("n")
	Map field1753;

	public class155() {
		this.field1744 = -1;
		this.field1742 = null;
		this.field1749 = new float[4];
		this.field1748 = new ArrayList();
		this.field1750 = new ArrayList();
		this.field1751 = new ArrayList();
		this.field1743 = new HashMap();
		this.field1753 = new HashMap();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lce;B)Z",
		garbageValue = "57"
	)
	public boolean method3085(String var1, UrlRequester var2) {
		if (var1 != null && !var1.isEmpty()) {
			if (var2 == null) {
				return false;
			} else {
				this.method3073();

				try {
					this.field1745 = var1;
					this.field1746 = var2.request(new URL(this.field1745));
					this.field1744 = 0;
					return true;
				} catch (MalformedURLException var4) {
					this.method3073();
					this.field1744 = 100;
					return false;
				}
			}
		} else {
			return false;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lce;I)V",
		garbageValue = "2008517320"
	)
	public void method3064(UrlRequester var1) {
		switch(this.field1744) {
		case 0:
			this.method3074(var1);
			break;
		case 1:
			this.method3121();
			break;
		default:
			return;
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "649568402"
	)
	public int method3067() {
		return this.field1744;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-1638920385"
	)
	public int method3066(String var1) {
		return this.field1743.containsKey(var1) ? (Integer)this.field1743.get(var1) : -1;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "-57"
	)
	public String method3097(String var1) {
		return (String)((String)(this.field1753.containsKey(var1) ? this.field1753.get(var1) : null));
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "1949744865"
	)
	public ArrayList method3110() {
		return this.field1750;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "1585296838"
	)
	public ArrayList method3069() {
		return this.field1751;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-304867639"
	)
	public String method3075() {
		return this.field1742;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "63"
	)
	public float[] method3071() {
		return this.field1749;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "126443556"
	)
	public ArrayList method3072() {
		return this.field1748;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1659374882"
	)
	void method3073() {
		this.field1746 = null;
		this.field1742 = null;
		this.field1749[0] = 0.0F;
		this.field1749[1] = 0.0F;
		this.field1749[2] = 1.0F;
		this.field1749[3] = 1.0F;
		this.field1748.clear();
		this.field1750.clear();
		this.field1751.clear();
		this.field1743.clear();
		this.field1753.clear();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lce;B)V",
		garbageValue = "107"
	)
	void method3074(UrlRequester var1) {
		if (this.field1746 != null && this.field1746.isDone()) {
			byte[] var2 = this.field1746.getResponse();
			if (var2 == null) {
				this.method3073();
				this.field1744 = 100;
			} else {
				JSONObject var3;
				try {
					class400 var4 = new class400(var2);
					var3 = var4.method6947();
					var3 = var3.getJSONObject("message");
				} catch (Exception var9) {
					this.method3073();
					this.field1744 = 102;
					return;
				}

				try {
					this.method3076(var3.getJSONArray("images"), var1);
				} catch (Exception var8) {
					this.field1750.clear();
				}

				try {
					this.method3098(var3.getJSONArray("labels"));
				} catch (Exception var7) {
					this.field1751.clear();
				}

				try {
					this.method3083(var3.getJSONObject("behaviour"));
				} catch (Exception var6) {
					this.field1742 = null;
					this.field1749[0] = 0.0F;
					this.field1749[1] = 0.0F;
					this.field1749[2] = 1.0F;
					this.field1749[3] = 1.0F;
					this.field1748.clear();
				}

				try {
					this.method3079(var3.getJSONObject("meta"));
				} catch (Exception var5) {
					this.field1743.clear();
					this.field1753.clear();
				}

				this.field1744 = this.field1750.size() > 0 ? 1 : 2;
				this.field1746 = null;
			}
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "533215283"
	)
	void method3121() {
		Iterator var1 = this.field1750.iterator();

		class160 var2;
		do {
			if (!var1.hasNext()) {
				var1 = this.field1750.iterator();

				while (var1.hasNext()) {
					var2 = (class160)var1.next();
					if (var2.field1783 != null) {
						byte[] var3 = var2.field1783.getResponse();
						if (var3 != null && var3.length > 0) {
							this.field1744 = 2;
							return;
						}
					}
				}

				this.method3073();
				this.field1744 = 101;
				return;
			}

			var2 = (class160)var1.next();
		} while(var2.field1783 == null || var2.field1783.isDone());

	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;Lce;B)V",
		garbageValue = "120"
	)
	void method3076(JSONArray var1, UrlRequester var2) throws JSONException {
		if (var1 != null) {
			for (int var3 = 0; var3 < var1.length(); ++var3) {
				try {
					JSONObject var4 = var1.getJSONObject(var3);
					class160 var5 = new class160(this);
					var5.field1783 = var2.request(new URL(var4.getString("src")));
					var5.field1782 = ChatChannel.method1965(var4, "placement");
					this.field1750.add(var5);
				} catch (MalformedURLException var6) {
				}
			}

		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;I)V",
		garbageValue = "-867893619"
	)
	void method3098(JSONArray var1) throws JSONException {
		if (var1 != null) {
			for (int var2 = 0; var2 < var1.length(); ++var2) {
				JSONObject var3 = var1.getJSONObject(var2);
				class162 var4 = new class162(this);
				var4.field1803 = var3.getString("text");
				var4.field1811 = class131.method2828(var3.getString("align_x"));
				var4.field1806 = class131.method2828(var3.getString("align_y"));
				var4.field1807 = var3.getInt("font");
				var4.field1804 = ChatChannel.method1965(var3, "placement");
				this.field1751.add(var4);
			}

		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V",
		garbageValue = "-1307418854"
	)
	void method3083(JSONObject var1) throws JSONException {
		if (var1 != null) {
			this.field1749 = ChatChannel.method1965(var1, "clickbounds");
			this.field1742 = var1.getString("endpoint");
			String[] var2 = JSONObject.getNames(var1);

			for (int var3 = 0; var3 < var1.length(); ++var3) {
				if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) {
					try {
						int var4 = var1.getInt(var2[var3]);
						this.field1748.add(new class163(this, var2[var3], var4));
					} catch (Exception var8) {
						try {
							String var5 = var1.getString(var2[var3]);
							if (var5.equals("true")) {
								this.field1748.add(new class163(this, var2[var3], 1));
							} else if (var5.equals("false")) {
								this.field1748.add(new class163(this, var2[var3], 0));
							} else {
								this.field1748.add(new class154(this, var2[var3], var5));
							}
						} catch (Exception var7) {
						}
					}
				}
			}

		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;B)V",
		garbageValue = "1"
	)
	void method3079(JSONObject var1) throws JSONException {
		String[] var2 = JSONObject.getNames(var1);

		for (int var3 = 0; var3 < var1.length(); ++var3) {
			try {
				int var4 = var1.getInt(var2[var3]);
				this.field1743.put(var2[var3], var4);
			} catch (Exception var8) {
				try {
					String var5 = var1.getString(var2[var3]);
					if (var5.equals("true")) {
						this.field1743.put(var2[var3], 1);
					} else if (var5.equals("false")) {
						this.field1743.put(var2[var3], 0);
					} else {
						this.field1753.put(var2[var3], var5);
					}
				} catch (Exception var7) {
				}
			}
		}

	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(ILbb;ZI)I",
		garbageValue = "1124617312"
	)
	static int method3124(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CLIENTCLOCK) {
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = Client.cycle;
			return 1;
		} else {
			int var3;
			int var4;
			if (var0 == ScriptOpcodes.INV_GETOBJ) {
				class12.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = Message.method1079(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_GETNUM) {
				class12.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = class290.ItemContainer_getCount(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_TOTAL) {
				class12.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = Skeleton.method4019(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_SIZE) {
				var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = DirectByteArrayCopier.getInvDefinition(var3).size;
				return 1;
			} else if (var0 == ScriptOpcodes.STAT) {
				var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = Client.currentLevels[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.STAT_BASE) {
				var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = Client.levels[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.STAT_XP) {
				var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = Client.experience[var3];
				return 1;
			} else {
				int var5;
				if (var0 == ScriptOpcodes.COORD) {
					var3 = class128.Client_plane;
					var4 = SecureRandomCallable.baseX * 64 + (ModelData0.localPlayer.x >> 7);
					var5 = GrandExchangeOfferOwnWorldComparator.baseY * 64 + (ModelData0.localPlayer.y >> 7);
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = (var4 << 14) + var5 + (var3 << 28);
					return 1;
				} else if (var0 == ScriptOpcodes.COORDX) {
					var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3 >> 14 & 16383;
					return 1;
				} else if (var0 == ScriptOpcodes.COORDZ) {
					var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3 >> 28;
					return 1;
				} else if (var0 == ScriptOpcodes.COORDY) {
					var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3 & 16383;
					return 1;
				} else if (var0 == ScriptOpcodes.MAP_MEMBERS) {
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = Client.isMembersWorld ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) {
					class12.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = Message.method1079(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) {
					class12.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = class290.ItemContainer_getCount(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) {
					class12.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = Skeleton.method4019(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.STAFFMODLEVEL) {
					if (Client.staffModLevel >= 2) {
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = Client.staffModLevel;
					} else {
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.REBOOTTIMER) {
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = Client.rebootTimer;
					return 1;
				} else if (var0 == ScriptOpcodes.MAP_WORLD) {
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = Client.worldId;
					return 1;
				} else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) {
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = Client.runEnergy;
					return 1;
				} else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) {
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = Client.weight;
					return 1;
				} else if (var0 == ScriptOpcodes.PLAYERMOD) {
					if (Client.playerMod) {
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.WORLDFLAGS) {
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = Client.worldProperties;
					return 1;
				} else if (var0 == ScriptOpcodes.MOVECOORD) {
					class12.Interpreter_intStackSize -= 4;
					var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize];
					var4 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 2];
					int var6 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 3];
					var3 += var4 << 14;
					var3 += var5 << 28;
					var3 += var6;
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3;
					return 1;
				} else if (var0 == 3326) {
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = Client.field492;
					return 1;
				} else if (var0 == 3327) {
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = Client.field681;
					return 1;
				} else {
					return 2;
				}
			}
		}
	}
}
