import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cy")
@Implements("ClientPreferences")
public class ClientPreferences {
	@ObfuscatedName("z")
	boolean field1271;
	@ObfuscatedName("j")
	boolean field1267;
	@ObfuscatedName("i")
	boolean field1268;
	@ObfuscatedName("n")
	boolean field1269;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -757807693
	)
	int field1270;
	@ObfuscatedName("k")
	double field1265;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1582995675
	)
	int field1272;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -759122883
	)
	int field1273;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1069704695
	)
	int field1274;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -211175145
	)
	int field1275;
	@ObfuscatedName("t")
	String field1276;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1652253159
	)
	int field1266;
	@ObfuscatedName("p")
	@Export("parameters")
	final Map parameters;

	ClientPreferences() {
		this.field1267 = false;
		this.field1269 = false;
		this.field1265 = 0.8D;
		this.field1272 = 127;
		this.field1273 = 127;
		this.field1274 = 127;
		this.field1275 = -1;
		this.field1276 = null;
		this.field1266 = 1;
		this.parameters = new LinkedHashMap();
		this.method2480(true);
	}

	@ObfuscatedSignature(
		descriptor = "(Lrd;)V"
	)
	ClientPreferences(Buffer var1) {
		this.field1267 = false;
		this.field1269 = false;
		this.field1265 = 0.8D;
		this.field1272 = 127;
		this.field1273 = 127;
		this.field1274 = 127;
		this.field1275 = -1;
		this.field1276 = null;
		this.field1266 = 1;
		this.parameters = new LinkedHashMap();
		if (var1 != null && var1.array != null) {
			int var2 = var1.readUnsignedByte();
			if (var2 >= 0 && var2 <= 10) {
				if (var1.readUnsignedByte() == 1) {
					this.field1271 = true;
				}

				if (var2 > 1) {
					this.field1268 = var1.readUnsignedByte() == 1;
				}

				if (var2 > 3) {
					this.field1266 = var1.readUnsignedByte();
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
					this.field1276 = var1.readStringCp1252NullTerminatedOrNull();
				}

				if (var2 > 5) {
					this.field1267 = var1.readBoolean();
				}

				if (var2 > 6) {
					this.field1265 = (double)var1.readUnsignedByte() / 100.0D;
					this.field1272 = var1.readUnsignedByte();
					this.field1273 = var1.readUnsignedByte();
					this.field1274 = var1.readUnsignedByte();
				}

				if (var2 > 7) {
					this.field1275 = var1.readUnsignedByte();
				}

				if (var2 > 8) {
					this.field1269 = var1.readUnsignedByte() == 1;
				}

				if (var2 > 9) {
					this.field1270 = var1.readInt();
				}
			} else {
				this.method2480(true);
			}
		} else {
			this.method2480(true);
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "54"
	)
	void method2480(boolean var1) {
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Lrd;",
		garbageValue = "1661663667"
	)
	@Export("toBuffer")
	Buffer toBuffer() {
		Buffer var1 = new Buffer(417, true);
		var1.writeByte(10);
		var1.writeByte(this.field1271 ? 1 : 0);
		var1.writeByte(this.field1268 ? 1 : 0);
		var1.writeByte(this.field1266);
		var1.writeByte(this.parameters.size());
		Iterator var2 = this.parameters.entrySet().iterator();

		while (var2.hasNext()) {
			Entry var3 = (Entry)var2.next();
			var1.writeInt((Integer)var3.getKey());
			var1.writeInt((Integer)var3.getValue());
		}

		var1.writeStringCp1252NullTerminated(this.field1276 != null ? this.field1276 : "");
		var1.writeBoolean(this.field1267);
		var1.writeByte((int)(100.0D * this.field1265));
		var1.writeByte(this.field1272);
		var1.writeByte(this.field1273);
		var1.writeByte(this.field1274);
		var1.writeByte(this.field1275);
		var1.writeByte(this.field1269 ? 1 : 0);
		var1.writeInt(this.field1270);
		return var1;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-109"
	)
	void method2551(boolean var1) {
		this.field1271 = var1;
		SoundSystem.savePreferences();
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "180"
	)
	boolean method2572() {
		return this.field1271;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "2"
	)
	void method2483(boolean var1) {
		this.field1267 = var1;
		SoundSystem.savePreferences();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "8123"
	)
	boolean method2484() {
		return this.field1267;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-642291381"
	)
	void method2563(boolean var1) {
		this.field1268 = var1;
		SoundSystem.savePreferences();
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1585419909"
	)
	boolean method2570() {
		return this.field1268;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "810617878"
	)
	void method2485(boolean var1) {
		this.field1269 = var1;
		SoundSystem.savePreferences();
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "915076830"
	)
	void method2488() {
		this.method2485(!this.field1269);
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "2"
	)
	boolean method2489() {
		return this.field1269;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-8"
	)
	void method2490(int var1) {
		this.field1270 = var1;
		SoundSystem.savePreferences();
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2141806502"
	)
	int method2491() {
		return this.field1270;
	}

	@ObfuscatedName("h")
	void method2583(double var1) {
		this.field1265 = var1;
		SoundSystem.savePreferences();
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)D",
		garbageValue = "76"
	)
	double method2557() {
		return this.field1265;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "8"
	)
	void method2533(int var1) {
		this.field1272 = var1;
		SoundSystem.savePreferences();
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-348918421"
	)
	int method2495() {
		return this.field1272;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "107"
	)
	void method2577(int var1) {
		this.field1273 = var1;
		SoundSystem.savePreferences();
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1825265297"
	)
	int method2497() {
		return this.field1273;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1384124032"
	)
	void method2481(int var1) {
		this.field1274 = var1;
		SoundSystem.savePreferences();
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1799077602"
	)
	int method2499() {
		return this.field1274;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-83522118"
	)
	void method2500(String var1) {
		this.field1276 = var1;
		SoundSystem.savePreferences();
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-919916182"
	)
	String method2545() {
		return this.field1276;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1162088376"
	)
	void method2502(int var1) {
		this.field1275 = var1;
		SoundSystem.savePreferences();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	int method2503() {
		return this.field1275;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "724225707"
	)
	void method2504(int var1) {
		this.field1266 = var1;
		SoundSystem.savePreferences();
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1675025735"
	)
	int method2505() {
		return this.field1266;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "-1508652053"
	)
	void method2589(String var1, int var2) {
		int var3 = this.method2509(var1);
		if (this.parameters.size() >= 10 && !this.parameters.containsKey(var3)) {
			Iterator var4 = this.parameters.entrySet().iterator();
			var4.next();
			var4.remove();
		}

		this.parameters.put(var3, var2);
		SoundSystem.savePreferences();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-1879605728"
	)
	boolean method2507(String var1) {
		int var2 = this.method2509(var1);
		return this.parameters.containsKey(var2);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-2142036926"
	)
	int method2508(String var1) {
		int var2 = this.method2509(var1);
		return !this.parameters.containsKey(var2) ? 0 : (Integer)this.parameters.get(var2);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "14"
	)
	int method2509(String var1) {
		return GrandExchangeOfferAgeComparator.method6684(var1.toLowerCase());
	}
}
