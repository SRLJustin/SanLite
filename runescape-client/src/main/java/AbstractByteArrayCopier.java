import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hk")
@Implements("AbstractByteArrayCopier")
public abstract class AbstractByteArrayCopier {
	AbstractByteArrayCopier() {
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "(I)[B",
		garbageValue = "-938287989"
	)
	@Export("get")
	abstract byte[] get();

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "([BI)V",
		garbageValue = "-277286562"
	)
	@Export("set")
	public abstract void set(byte[] var1);
}
