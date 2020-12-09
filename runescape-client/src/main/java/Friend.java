import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kx")
@Implements("Friend")
public class Friend extends Buddy {
	@ObfuscatedName("h")
	boolean field3666;
	@ObfuscatedName("v")
	boolean field3667;

	Friend() {
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "(Lkx;I)I",
		garbageValue = "-1658027604"
	)
	@Export("compareToFriend")
	int compareToFriend(Friend var1) {
		if (super.world == Client.worldId && Client.worldId != var1.world) {
			return -1;
		} else if (Client.worldId == var1.world && super.world != Client.worldId) {
			return 1;
		} else if (super.world != 0 && var1.world == 0) {
			return -1;
		} else if (var1.world != 0 && super.world == 0) {
			return 1;
		} else if (this.field3666 && !var1.field3666) {
			return -1;
		} else if (!this.field3666 && var1.field3666) {
			return 1;
		} else if (this.field3667 && !var1.field3667) {
			return -1;
		} else if (!this.field3667 && var1.field3667) {
			return 1;
		} else {
			return super.world != 0 ? super.int2 - var1.int2 : var1.int2 - super.int2;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		signature = "(Lju;I)I",
		garbageValue = "-1545516578"
	)
	@Export("compareTo_user")
	public int compareTo_user(Nameable var1) {
		return this.compareToFriend((Friend)var1);
	}

	public int compareTo(Object var1) {
		return this.compareToFriend((Friend)var1);
	}
}
