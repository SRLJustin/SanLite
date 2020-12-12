import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ju")
@Implements("Nameable")
public class Nameable implements Comparable {
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "Lki;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "Lki;"
	)
	@Export("previousUsername")
	Username previousUsername;

	Nameable() {
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		signature = "(I)Lki;",
		garbageValue = "1670678120"
	)
	@Export("getUsername")
	public Username getUsername() {
		return this.username;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		signature = "(S)Ljava/lang/String;",
		garbageValue = "2928"
	)
	@Export("getName")
	public String getName() {
		return this.username == null ? "" : this.username.getName();
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		signature = "(I)Ljava/lang/String;",
		garbageValue = "1728130643"
	)
	@Export("getPreviousName")
	public String getPreviousName() {
		return this.previousUsername == null ? "" : this.previousUsername.getName();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		signature = "(Lki;Lki;I)V",
		garbageValue = "-1682462851"
	)
	@Export("set")
	void set(Username var1, Username var2) {
		if (var1 == null) {
			throw new NullPointerException();
		} else {
			this.username = var1;
			this.previousUsername = var2;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		signature = "(Lju;I)I",
		garbageValue = "-1545516578"
	)
	@Export("compareTo_user")
	public int compareTo_user(Nameable var1) {
		return this.username.compareToTyped(var1.username);
	}

	public int compareTo(Object var1) {
		return this.compareTo_user((Nameable)var1);
	}
}
