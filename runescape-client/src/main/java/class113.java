import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dd")
public class class113 {
	@ObfuscatedName("nl")
	@ObfuscatedGetter(
		intValue = -1352804003
	)
	@Export("selectedSpellWidget")
	static int selectedSpellWidget;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1280061279
	)
	int field1390;
	@ObfuscatedName("q")
	float field1389;
	@ObfuscatedName("f")
	float field1391;
	@ObfuscatedName("u")
	float field1396;
	@ObfuscatedName("c")
	float field1392;
	@ObfuscatedName("w")
	float field1393;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	class113 field1388;

	class113() {
		this.field1391 = Float.MAX_VALUE;
		this.field1396 = Float.MAX_VALUE;
		this.field1392 = Float.MAX_VALUE;
		this.field1393 = Float.MAX_VALUE;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lqw;II)V",
		garbageValue = "-514505311"
	)
	void method2708(Buffer var1, int var2) {
		this.field1390 = var1.readShort();
		this.field1389 = var1.method7740();
		this.field1391 = var1.method7740();
		this.field1396 = var1.method7740();
		this.field1392 = var1.method7740();
		this.field1393 = var1.method7740();
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lbd;",
		garbageValue = "121"
	)
	@Export("Messages_getByChannelAndID")
	static Message Messages_getByChannelAndID(int var0, int var1) {
		ChatChannel var2 = (ChatChannel)Messages.Messages_channels.get(var0);
		return var2.getMessage(var1);
	}

	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2039507809"
	)
	static void method2713(int var0) {
		class136.tempMenuAction = new MenuAction();
		class136.tempMenuAction.param0 = Client.menuArguments1[var0];
		class136.tempMenuAction.param1 = Client.menuArguments2[var0];
		class136.tempMenuAction.opcode = Client.menuOpcodes[var0];
		class136.tempMenuAction.identifier = Client.menuIdentifiers[var0];
		class136.tempMenuAction.field879 = Client.field638[var0];
		class136.tempMenuAction.field880 = Client.menuActions[var0];
		class136.tempMenuAction.field881 = Client.menuTargets[var0];
	}
}
