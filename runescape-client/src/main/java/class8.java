import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("q")
public class class8 implements Callable {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 880738975
	)
	static int field45;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Lig;"
	)
	@Export("ItemDefinition_modelArchive")
	public static AbstractArchive ItemDefinition_modelArchive;
	@ObfuscatedName("du")
	@Export("mouseCam")
	static boolean mouseCam;
	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		signature = "Liy;"
	)
	@Export("archive5")
	static Archive archive5;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "Lkx;"
	)
	final Buffer field48;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "La;"
	)
	final class12 field44;
	// $FF: synthetic field
	@ObfuscatedSignature(
		signature = "Ll;"
	)
	final class9 this$0;

	@ObfuscatedSignature(
		signature = "(Ll;Lkx;La;)V"
	)
	class8(class9 var1, Buffer var2, class12 var3) {
		this.this$0 = var1;
		this.field48 = var2;
		this.field44 = var3;
	}

	public Object call() {
		return this.field44.vmethod120(this.field48);
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		garbageValue = "-1606674389",
		signature = "(I)V"
	)
	static void method88() {
		if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) {
			Login.currentLoginField = 1;
		} else {
			Login.currentLoginField = 0;
		}

	}

	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		garbageValue = "1683075564",
		signature = "(I)V"
	)
	static final void method90() {
		if (Client.logoutTimer > 0) {
			SecureRandomCallable.logOut();
		} else {
			Client.timer.method5206();
			ItemContainer.updateGameState(40);
			UserComparator6.field2008 = Client.packetWriter.getSocket();
			Client.packetWriter.removeSocket();
		}
	}
}
