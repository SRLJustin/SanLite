import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("x")
public class class16 implements ThreadFactory {
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 172876195
	)
	static int field81;
	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("archive13")
	static Archive archive13;
	@ObfuscatedName("o")
	final ThreadGroup field84;
	@ObfuscatedName("q")
	final AtomicInteger field80;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lt;"
	)
	final class14 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lt;)V"
	)
	class16(class14 var1) {
		this.this$0 = var1;
		this.field80 = new AtomicInteger(1);
		SecurityManager var2 = System.getSecurityManager();
		this.field84 = var2 != null ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup();
	}

	public Thread newThread(Runnable var1) {
		Thread var2 = new Thread(this.field84, var1, this.this$0.field74 + "-rest-request-" + this.field80.getAndIncrement(), 0L);
		var2.setDaemon(true);
		var2.setPriority(5);
		return var2;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Llp;B)V",
		garbageValue = "1"
	)
	public static void method179(AbstractArchive var0) {
	}

	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "(Lgq;IIII)V",
		garbageValue = "1179464267"
	)
	static void method182(SequenceDefinition var0, int var1, int var2, int var3) {
		if (Client.soundEffectCount < 50 && class12.clientPreferences.method2239() != 0) {
			if (var0.soundEffects != null && var1 < var0.soundEffects.length) {
				MouseHandler.method588(var0.soundEffects[var1], var2, var3);
			}
		}
	}
}
