import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ch")
@Implements("ClientPreferences")
public class ClientPreferences {
	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("archive8")
	static Archive archive8;
	@ObfuscatedName("m")
	boolean field1288;
	@ObfuscatedName("q")
	boolean field1292;
	@ObfuscatedName("f")
	boolean field1293;
	@ObfuscatedName("r")
	boolean field1294;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 150827165
	)
	int field1296;
	@ObfuscatedName("b")
	double field1303;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -631517997
	)
	int field1297;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1737283137
	)
	int field1298;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1250836455
	)
	int field1299;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1676041029
	)
	int field1300;
	@ObfuscatedName("n")
	String field1301;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -628738235
	)
	int field1302;
	@ObfuscatedName("a")
	@Export("parameters")
	final Map parameters;

	ClientPreferences() {
		this.field1292 = false;
		this.field1294 = false;
		this.field1303 = 0.8D;
		this.field1297 = 127;
		this.field1298 = 127;
		this.field1299 = 127;
		this.field1300 = -1;
		this.field1301 = null;
		this.field1302 = 1;
		this.parameters = new LinkedHashMap();
		this.method2409(true);
	}

	@ObfuscatedSignature(
		descriptor = "(Lqy;)V"
	)
	ClientPreferences(Buffer var1) {
		this.field1292 = false;
		this.field1294 = false;
		this.field1303 = 0.8D;
		this.field1297 = 127;
		this.field1298 = 127;
		this.field1299 = 127;
		this.field1300 = -1;
		this.field1301 = null;
		this.field1302 = 1;
		this.parameters = new LinkedHashMap();
		if (var1 != null && var1.array != null) {
			int var2 = var1.readUnsignedByte();
			if (var2 >= 0 && var2 <= 10) {
				if (var1.readUnsignedByte() == 1) {
					this.field1288 = true;
				}

				if (var2 > 1) {
					this.field1293 = var1.readUnsignedByte() == 1;
				}

				if (var2 > 3) {
					this.field1302 = var1.readUnsignedByte();
				}

				if (var2 > 2) {
					int var3 = var1.readUnsignedByte();

					for (int var4 = 0; var4 < var3; ++var4) {
						int var5 = var1.readInt();
						int var6 = var1.readInt();
						this.parameters.put(var5, var6);
					}
				}

				if (var2 > 4) {
					this.field1301 = var1.readStringCp1252NullTerminatedOrNull();
				}

				if (var2 > 5) {
					this.field1292 = var1.readBoolean();
				}

				if (var2 > 6) {
					this.field1303 = (double)var1.readUnsignedByte() / 100.0D;
					this.field1297 = var1.readUnsignedByte();
					this.field1298 = var1.readUnsignedByte();
					this.field1299 = var1.readUnsignedByte();
				}

				if (var2 > 7) {
					this.field1300 = var1.readUnsignedByte();
				}

				if (var2 > 8) {
					this.field1294 = var1.readUnsignedByte() == 1;
				}

				if (var2 > 9) {
					this.field1296 = var1.readInt();
				}
			} else {
				this.method2409(true);
			}
		} else {
			this.method2409(true);
		}

	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "1"
	)
	void method2409(boolean var1) {
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)Lqy;",
		garbageValue = "-1732648006"
	)
	@Export("toBuffer")
	Buffer toBuffer() {
		Buffer var1 = new Buffer(417, true);
		var1.writeByte(10);
		var1.writeByte(this.field1288 ? 1 : 0);
		var1.writeByte(this.field1293 ? 1 : 0);
		var1.writeByte(this.field1302);
		var1.writeByte(this.parameters.size());
		Iterator var2 = this.parameters.entrySet().iterator();

		while (var2.hasNext()) {
			Entry var3 = (Entry)var2.next();
			var1.method8536((Integer)var3.getKey());
			var1.method8536((Integer)var3.getValue());
		}

		var1.writeStringCp1252NullTerminated(this.field1301 != null ? this.field1301 : "");
		var1.writeBoolean(this.field1292);
		var1.writeByte((int)(this.field1303 * 100.0D));
		var1.writeByte(this.field1297);
		var1.writeByte(this.field1298);
		var1.writeByte(this.field1299);
		var1.writeByte(this.field1300);
		var1.writeByte(this.field1294 ? 1 : 0);
		var1.method8536(this.field1296);
		return var1;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "533129640"
	)
	void method2486(boolean var1) {
		this.field1288 = var1;
		Tile.savePreferences();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "105464922"
	)
	boolean method2412() {
		return this.field1288;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "64"
	)
	void method2461(boolean var1) {
		this.field1292 = var1;
		Tile.savePreferences();
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1900607558"
	)
	boolean method2413() {
		return this.field1292;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "7"
	)
	void method2448(boolean var1) {
		this.field1293 = var1;
		Tile.savePreferences();
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "39"
	)
	boolean method2428() {
		return this.field1293;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "8323"
	)
	void method2470(boolean var1) {
		this.field1294 = var1;
		Tile.savePreferences();
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "141048333"
	)
	void method2433() {
		this.method2470(!this.field1294);
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1316033707"
	)
	boolean method2419() {
		return this.field1294;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "54"
	)
	void method2420(int var1) {
		this.field1296 = var1;
		Tile.savePreferences();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1786491107"
	)
	int method2421() {
		return this.field1296;
	}

	@ObfuscatedName("k")
	void method2475(double var1) {
		this.field1303 = var1;
		Tile.savePreferences();
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)D",
		garbageValue = "2073863373"
	)
	double method2422() {
		return this.field1303;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "18863"
	)
	void method2414(int var1) {
		this.field1297 = var1;
		Tile.savePreferences();
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-5026"
	)
	int method2425() {
		return this.field1297;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-25"
	)
	void method2471(int var1) {
		this.field1298 = var1;
		Tile.savePreferences();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1444608091"
	)
	int method2426() {
		return this.field1298;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-315220076"
	)
	void method2427(int var1) {
		this.field1299 = var1;
		Tile.savePreferences();
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1615345308"
	)
	int method2506() {
		return this.field1299;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1040224572"
	)
	void method2429(String var1) {
		this.field1301 = var1;
		Tile.savePreferences();
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-10"
	)
	String method2430() {
		return this.field1301;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1027292403"
	)
	void method2431(int var1) {
		this.field1300 = var1;
		Tile.savePreferences();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1999692147"
	)
	int method2424() {
		return this.field1300;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-9009"
	)
	void method2460(int var1) {
		this.field1302 = var1;
		Tile.savePreferences();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1455962060"
	)
	int method2434() {
		return this.field1302;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "8447783"
	)
	void method2435(String var1, int var2) {
		int var3 = this.method2438(var1);
		if (this.parameters.size() >= 10 && !this.parameters.containsKey(var3)) {
			Iterator var4 = this.parameters.entrySet().iterator();
			var4.next();
			var4.remove();
		}

		this.parameters.put(var3, var2);
		Tile.savePreferences();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-2059825929"
	)
	boolean method2436(String var1) {
		int var2 = this.method2438(var1);
		return this.parameters.containsKey(var2);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-2095892809"
	)
	int method2437(String var1) {
		int var2 = this.method2438(var1);
		return !this.parameters.containsKey(var2) ? 0 : (Integer)this.parameters.get(var2);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "41"
	)
	int method2438(String var1) {
		String var3 = var1.toLowerCase();
		int var4 = var3.length();
		int var5 = 0;

		for (int var6 = 0; var6 < var4; ++var6) {
			var5 = (var5 << 5) - var5 + var3.charAt(var6);
		}

		return var5;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1700481860"
	)
	@Export("ItemContainer_getCount")
	static int ItemContainer_getCount(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return 0;
		} else {
			return var1 >= 0 && var1 < var2.quantities.length ? var2.quantities[var1] : 0;
		}
	}

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "(Lct;II)V",
		garbageValue = "-935643958"
	)
	static final void method2513(Actor var0, int var1) {
		ScriptFrame.worldToScreen(var0.x, var0.y, var1);
	}
}
