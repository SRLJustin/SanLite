import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nd")
@Implements("IgnoreList")
public class IgnoreList extends NameableContainer {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	@Export("loginType")
	final LoginType loginType;

	@ObfuscatedSignature(
		descriptor = "(Lpj;)V"
	)
	public IgnoreList(LoginType var1) {
		super(400);
		this.loginType = var1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Lnb;",
		garbageValue = "-1695844600"
	)
	@Export("newInstance")
	Nameable newInstance() {
		return new Ignored();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)[Lnb;",
		garbageValue = "1788836658"
	)
	@Export("newTypedArray")
	Nameable[] newTypedArray(int var1) {
		return new Ignored[var1];
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lpx;IB)V",
		garbageValue = "0"
	)
	@Export("read")
	public void read(Buffer var1, int var2) {
		while (true) {
			if (var1.offset < var2) {
				int var3 = var1.readUnsignedByte();
				boolean var4 = (var3 & 1) == 1;
				Username var5 = new Username(var1.readStringCp1252NullTerminated(), this.loginType);
				Username var6 = new Username(var1.readStringCp1252NullTerminated(), this.loginType);
				var1.readStringCp1252NullTerminated();
				if (var5 != null && var5.hasCleanName()) {
					Ignored var7 = (Ignored)this.getByCurrentUsername(var5);
					if (var4) {
						Ignored var8 = (Ignored)this.getByCurrentUsername(var6);
						if (var8 != null && var7 != var8) {
							if (var7 != null) {
								this.remove(var8);
							} else {
								var7 = var8;
							}
						}
					}

					if (var7 != null) {
						this.changeName(var7, var5, var6);
						continue;
					}

					if (this.getSize() < 400) {
						int var9 = this.getSize();
						var7 = (Ignored)this.addLast(var5, var6);
						var7.id = var9;
					}
					continue;
				}

				throw new IllegalStateException();
			}

			return;
		}
	}

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "(III)Ljava/lang/String;",
		garbageValue = "1540266419"
	)
	static final String method6430(int var0, int var1) {
		int var2 = var1 - var0;
		if (var2 < -9) {
			return class166.colorStartTag(16711680);
		} else if (var2 < -6) {
			return class166.colorStartTag(16723968);
		} else if (var2 < -3) {
			return class166.colorStartTag(16740352);
		} else if (var2 < 0) {
			return class166.colorStartTag(16756736);
		} else if (var2 > 9) {
			return class166.colorStartTag(65280);
		} else if (var2 > 6) {
			return class166.colorStartTag(4259584);
		} else if (var2 > 3) {
			return class166.colorStartTag(8453888);
		} else {
			return var2 > 0 ? class166.colorStartTag(12648192) : class166.colorStartTag(16776960);
		}
	}
}
