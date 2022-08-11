import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("qq")
@Implements("RunException")
public class RunException extends RuntimeException {
	@ObfuscatedName("o")
	@Export("RunException_applet")
	public static Applet RunException_applet;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 843967787
	)
	public static int field4844;
	@ObfuscatedName("w")
	@Export("message")
	String message;
	@ObfuscatedName("z")
	@Export("throwable")
	Throwable throwable;

	RunException(Throwable var1, String var2) {
		this.message = var2;
		this.throwable = var1;
	}
}
