import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("s")
public class class7 {
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -1318475581
	)
	static int field26;
	@ObfuscatedName("mg")
	@ObfuscatedGetter(
		intValue = 881204407
	)
	@Export("menuHeight")
	static int menuHeight;
	@ObfuscatedName("o")
	ExecutorService field25;
	@ObfuscatedName("q")
	Future field20;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	final Buffer field19;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lk;"
	)
	final class3 field22;

	@ObfuscatedSignature(
		descriptor = "(Lpx;Lk;)V"
	)
	public class7(Buffer var1, class3 var2) {
		this.field25 = Executors.newSingleThreadExecutor();
		this.field19 = var1;
		this.field22 = var2;
		this.method52();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "16"
	)
	public boolean method49() {
		return this.field20.isDone();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-81"
	)
	public void method50() {
		this.field25.shutdown();
		this.field25 = null;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(S)Lpx;",
		garbageValue = "26345"
	)
	public Buffer method51() {
		try {
			return (Buffer)this.field20.get();
		} catch (Exception var2) {
			return null;
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "16321"
	)
	void method52() {
		this.field20 = this.field25.submit(new class1(this, this.field19, this.field22));
	}
}
