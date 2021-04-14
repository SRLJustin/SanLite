import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lv")
@Implements("Friend")
public class Friend extends Buddy {
	@ObfuscatedName("f")
	boolean field3828;
	@ObfuscatedName("o")
	boolean field3827;

	Friend() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Llv;B)I",
		garbageValue = "61"
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
		} else if (this.field3828 && !var1.field3828) {
			return -1;
		} else if (!this.field3828 && var1.field3828) {
			return 1;
		} else if (this.field3827 && !var1.field3827) {
			return -1;
		} else if (!this.field3827 && var1.field3827) {
			return 1;
		} else {
			return super.world != 0 ? super.int2 - var1.int2 : var1.int2 - super.int2;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Llt;I)I",
		garbageValue = "1200801892"
	)
	@Export("compareTo_user")
	public int compareTo_user(Nameable var1) {
		return this.compareToFriend((Friend)var1);
	}

	public int compareTo(Object var1) {
		return this.compareToFriend((Friend)var1);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;I)I",
		garbageValue = "-2006217942"
	)
	@Export("stringCp1252NullTerminatedByteSize")
	public static int stringCp1252NullTerminatedByteSize(String var0) {
		return var0.length() + 1;
	}
}
