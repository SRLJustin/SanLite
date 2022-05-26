import java.net.URL;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cy")
@Implements("ClientPreferences")
public class ClientPreferences {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1127997151
	)
	@Export("ClientPreferences_optionCount")
	static int ClientPreferences_optionCount;
	@ObfuscatedName("l")
	@Export("roofsHidden")
	boolean roofsHidden;
	@ObfuscatedName("k")
	@Export("hideUsername")
	boolean hideUsername;
	@ObfuscatedName("a")
	@Export("titleMusicDisabled")
	boolean titleMusicDisabled;
	@ObfuscatedName("m")
	boolean field1243;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 698831053
	)
	int field1252;
	@ObfuscatedName("s")
	@Export("brightness")
	double brightness;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1690436583
	)
	@Export("musicVolume")
	int musicVolume;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1205613435
	)
	@Export("soundEffectsVolume")
	int soundEffectsVolume;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1618721713
	)
	@Export("areaSoundEffectsVolume")
	int areaSoundEffectsVolume;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1550048415
	)
	int field1249;
	@ObfuscatedName("w")
	@Export("rememberedUsername")
	String rememberedUsername;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1272591553
	)
	@Export("windowMode")
	int windowMode;
	@ObfuscatedName("t")
	@Export("parameters")
	LinkedHashMap parameters;

	static {
		ClientPreferences_optionCount = 10;
	}

	ClientPreferences() {
		this.hideUsername = false;
		this.field1243 = false;
		this.brightness = 0.8D;
		this.musicVolume = 127;
		this.soundEffectsVolume = 127;
		this.areaSoundEffectsVolume = 127;
		this.field1249 = -1;
		this.rememberedUsername = null;
		this.windowMode = 1;
		this.parameters = new LinkedHashMap();
		this.method2318(true);
	}

	@ObfuscatedSignature(
		descriptor = "(Lpx;)V"
	)
	ClientPreferences(Buffer var1) {
		this.hideUsername = false;
		this.field1243 = false;
		this.brightness = 0.8D;
		this.musicVolume = 127;
		this.soundEffectsVolume = 127;
		this.areaSoundEffectsVolume = 127;
		this.field1249 = -1;
		this.rememberedUsername = null;
		this.windowMode = 1;
		this.parameters = new LinkedHashMap();
		if (var1 != null && var1.array != null) {
			int var2 = var1.readUnsignedByte();
			if (var2 >= 0 && var2 <= ClientPreferences_optionCount) {
				if (var1.readUnsignedByte() == 1) {
					this.roofsHidden = true;
				}

				if (var2 > 1) {
					this.titleMusicDisabled = var1.readUnsignedByte() == 1;
				}

				if (var2 > 3) {
					this.windowMode = var1.readUnsignedByte();
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
					this.rememberedUsername = var1.readStringCp1252NullTerminatedOrNull();
				}

				if (var2 > 5) {
					this.hideUsername = var1.readBoolean();
				}

				if (var2 > 6) {
					this.brightness = (double)var1.readUnsignedByte() / 100.0D;
					this.musicVolume = var1.readUnsignedByte();
					this.soundEffectsVolume = var1.readUnsignedByte();
					this.areaSoundEffectsVolume = var1.readUnsignedByte();
				}

				if (var2 > 7) {
					this.field1249 = var1.readUnsignedByte();
				}

				if (var2 > 8) {
					this.field1243 = var1.readUnsignedByte() == 1;
				}

				if (var2 > 9) {
					this.field1252 = var1.readInt();
				}
			} else {
				this.method2318(true);
			}
		} else {
			this.method2318(true);
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1505304764"
	)
	void method2318(boolean var1) {
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Lpx;",
		garbageValue = "1983267736"
	)
	@Export("toBuffer")
	Buffer toBuffer() {
		Buffer var1 = new Buffer(100);
		var1.writeByte(ClientPreferences_optionCount);
		var1.writeByte(this.roofsHidden ? 1 : 0);
		var1.writeByte(this.titleMusicDisabled ? 1 : 0);
		var1.writeByte(this.windowMode);
		var1.writeByte(this.parameters.size());
		Iterator var2 = this.parameters.entrySet().iterator();

		while (var2.hasNext()) {
			Entry var3 = (Entry)var2.next();
			var1.writeInt((Integer)var3.getKey());
			var1.writeInt((Integer)var3.getValue());
		}

		var1.writeStringCp1252NullTerminated(this.rememberedUsername != null ? this.rememberedUsername : "");
		var1.writeBoolean(this.hideUsername);
		var1.writeByte((int)(this.brightness * 100.0D));
		var1.writeByte(this.musicVolume);
		var1.writeByte(this.soundEffectsVolume);
		var1.writeByte(this.areaSoundEffectsVolume);
		var1.writeByte(this.field1249);
		var1.writeByte(this.field1243 ? 1 : 0);
		var1.writeInt(this.field1252);
		return var1;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1415859216"
	)
	void method2219(boolean var1) {
		this.roofsHidden = var1;
		class270.savePreferences();
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1094538117"
	)
	boolean method2222() {
		return this.roofsHidden;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1823199962"
	)
	void method2223(boolean var1) {
		this.hideUsername = var1;
		class270.savePreferences();
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "242395257"
	)
	boolean method2257() {
		return this.hideUsername;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-2129317630"
	)
	void method2305(boolean var1) {
		this.titleMusicDisabled = var1;
		class270.savePreferences();
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1061667438"
	)
	boolean method2226() {
		return this.titleMusicDisabled;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1459067556"
	)
	void method2227(boolean var1) {
		this.field1243 = var1;
		class270.savePreferences();
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "96"
	)
	void method2228() {
		this.method2227(!this.field1243);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "6"
	)
	boolean method2229() {
		return this.field1243;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "936974237"
	)
	void method2230(int var1) {
		this.field1252 = var1;
		class270.savePreferences();
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2093496919"
	)
	int method2231() {
		return this.field1252;
	}

	@ObfuscatedName("t")
	void method2232(double var1) {
		this.brightness = var1;
		class270.savePreferences();
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)D",
		garbageValue = "-2107962943"
	)
	double method2225() {
		return this.brightness;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1172859341"
	)
	void method2234(int var1) {
		this.musicVolume = var1;
		class270.savePreferences();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-874911160"
	)
	int method2248() {
		return this.musicVolume;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1131698297"
	)
	void method2236(int var1) {
		this.soundEffectsVolume = var1;
		class270.savePreferences();
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-971935263"
	)
	int method2244() {
		return this.soundEffectsVolume;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1856408650"
	)
	void method2278(int var1) {
		this.areaSoundEffectsVolume = var1;
		class270.savePreferences();
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "750592599"
	)
	int method2239() {
		return this.areaSoundEffectsVolume;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-64324606"
	)
	void method2297(String var1) {
		this.rememberedUsername = var1;
		class270.savePreferences();
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "2088208815"
	)
	String method2241() {
		return this.rememberedUsername;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-586904848"
	)
	void method2306(int var1) {
		this.field1249 = var1;
		class270.savePreferences();
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "19888"
	)
	int method2243() {
		return this.field1249;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "54"
	)
	void method2245(int var1) {
		this.windowMode = var1;
		class270.savePreferences();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "82"
	)
	int method2274() {
		return this.windowMode;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-66"
	)
	@Export("loadWorlds")
	static boolean loadWorlds() {
		try {
			if (NPC.World_request == null) {
				NPC.World_request = UserComparator7.urlRequester.request(new URL(class93.field1280));
			} else if (NPC.World_request.isDone()) {
				byte[] var0 = NPC.World_request.getResponse();
				Buffer var1 = new Buffer(var0);
				var1.readInt();
				World.World_count = var1.readUnsignedShort();
				World.World_worlds = new World[World.World_count];

				World var3;
				for (int var2 = 0; var2 < World.World_count; var3.index = var2++) {
					var3 = World.World_worlds[var2] = new World();
					var3.id = var1.readUnsignedShort();
					var3.properties = var1.readInt();
					var3.host = var1.readStringCp1252NullTerminated();
					var3.activity = var1.readStringCp1252NullTerminated();
					var3.location = var1.readUnsignedByte();
					var3.population = var1.readShort();
				}

				UserComparator8.sortWorlds(World.World_worlds, 0, World.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
				NPC.World_request = null;
				return true;
			}
		} catch (Exception var4) {
			var4.printStackTrace();
			NPC.World_request = null;
		}

		return false;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)Lbx;",
		garbageValue = "-1660202002"
	)
	@Export("worldListStart")
	static World worldListStart() {
		World.World_listCount = 0;
		return class146.getNextWorldListWorld();
	}
}
