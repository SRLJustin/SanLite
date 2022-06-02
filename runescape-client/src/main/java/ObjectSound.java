import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bj")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("objectSounds")
	static NodeDeque objectSounds;
	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("archive10")
	static Archive archive10;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 732254663
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 974297984
	)
	@Export("x")
	int x;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 353993277
	)
	@Export("y")
	int y;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 2069201157
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1537948889
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 209965041
	)
	int field817;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -222773955
	)
	int field813;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lgy;"
	)
	@Export("obj")
	ObjectComposition obj;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1832672013
	)
	@Export("soundEffectId")
	int soundEffectId;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lah;"
	)
	@Export("stream1")
	RawPcmStream stream1;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 727974151
	)
	int field808;
	@ObfuscatedName("w")
	@Export("soundEffectIds")
	int[] soundEffectIds;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 10408455
	)
	int field810;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lah;"
	)
	@Export("stream2")
	RawPcmStream stream2;

	static {
		objectSounds = new NodeDeque();
	}

	ObjectSound() {
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2026640853"
	)
	@Export("set")
	void set() {
		int var1 = this.soundEffectId;
		ObjectComposition var2 = this.obj.transform();
		if (var2 != null) {
			this.soundEffectId = var2.ambientSoundId;
			this.field817 = var2.int7 * 128;
			this.field813 = var2.int5;
			this.field808 = var2.int6;
			this.soundEffectIds = var2.soundEffectIds;
		} else {
			this.soundEffectId = -1;
			this.field817 = 0;
			this.field813 = 0;
			this.field808 = 0;
			this.soundEffectIds = null;
		}

		if (var1 != this.soundEffectId && this.stream1 != null) {
			class122.pcmStreamMixer.removeSubStream(this.stream1);
			this.stream1 = null;
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-9"
	)
	public static int method1734() {
		return KeyHandler.KeyHandler_idleCycles;
	}

	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "2109603976"
	)
	static final void method1730(boolean var0) {
		if (var0) {
			Client.field615 = Login.field900 ? class124.field1557 : class124.field1551;
		} else {
			Client.field615 = class12.clientPreferences.parameters.containsKey(class239.method4810(Login.Login_username)) ? class124.field1556 : class124.field1553;
		}

	}
}
