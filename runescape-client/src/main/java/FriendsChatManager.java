import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kt")
@Implements("FriendsChatManager")
public class FriendsChatManager extends NameableContainer {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "Lmu;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "Lka;"
	)
	@Export("localUser")
	final Usernamed localUser;
	@ObfuscatedName("z")
	@Export("name")
	public String name;
	@ObfuscatedName("u")
	@Export("owner")
	public String owner;
	@ObfuscatedName("e")
	@Export("minKick")
	public byte minKick;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1015634539
	)
	@Export("rank")
	public int rank;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1149112931
	)
	int field3676;

	@ObfuscatedSignature(
		signature = "(Lmu;Lka;)V"
	)
	public FriendsChatManager(LoginType var1, Usernamed var2) {
		super(100);
		this.name = null;
		this.owner = null;
		this.field3676 = 1;
		this.loginType = var1;
		this.localUser = var2;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "(B)Lju;",
		garbageValue = "-99"
	)
	@Export("newInstance")
	Nameable newInstance() {
		return new FriendsChatMember();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "(II)[Lju;",
		garbageValue = "-1524839332"
	)
	@Export("newTypedArray")
	Nameable[] newTypedArray(int var1) {
		return new FriendsChatMember[var1];
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;I)V",
		garbageValue = "-513801120"
	)
	@Export("readName")
	final void readName(String var1) {
		this.name = class238.method4166(var1);
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;B)V",
		garbageValue = "-83"
	)
	@Export("setOwner")
	final void setOwner(String var1) {
		this.owner = class238.method4166(var1);
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(Lkj;I)V",
		garbageValue = "-147839496"
	)
	@Export("readUpdate")
	public final void readUpdate(Buffer var1) {
		this.setOwner(var1.readStringCp1252NullTerminated());
		long var2 = var1.readLong();
		this.readName(SecureRandomCallable.method1218(var2));
		this.minKick = var1.readByte();
		int var4 = var1.readUnsignedByte();
		if (var4 != 255) {
			this.clear();

			for (int var5 = 0; var5 < var4; ++var5) {
				FriendsChatMember var6 = (FriendsChatMember)this.addLastNoPreviousUsername(new Username(var1.readStringCp1252NullTerminated(), this.loginType));
				int var7 = var1.readUnsignedShort();
				var6.set(var7, ++this.field3676 - 1);
				var6.rank = var1.readByte();
				var1.readStringCp1252NullTerminated();
				this.isLocalPlayer(var6);
			}

		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(Lkj;S)V",
		garbageValue = "255"
	)
	public final void method5251(Buffer var1) {
		Username var2 = new Username(var1.readStringCp1252NullTerminated(), this.loginType);
		int var3 = var1.readUnsignedShort();
		byte var4 = var1.readByte();
		boolean var5 = false;
		if (var4 == -128) {
			var5 = true;
		}

		FriendsChatMember var6;
		if (var5) {
			if (this.getSize() == 0) {
				return;
			}

			var6 = (FriendsChatMember)this.getByCurrentUsername(var2);
			if (var6 != null && var6.getWorld() == var3) {
				this.remove(var6);
			}
		} else {
			var1.readStringCp1252NullTerminated();
			var6 = (FriendsChatMember)this.getByCurrentUsername(var2);
			if (var6 == null) {
				if (this.getSize() > super.capacity) {
					return;
				}

				var6 = (FriendsChatMember)this.addLastNoPreviousUsername(var2);
			}

			var6.set(var3, ++this.field3676 - 1);
			var6.rank = var4;
			this.isLocalPlayer(var6);
		}

	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "29"
	)
	@Export("clearFriends")
	public final void clearFriends() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) {
			((FriendsChatMember)this.get(var1)).clearIsFriend();
		}

	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "82"
	)
	@Export("invalidateIgnoreds")
	public final void invalidateIgnoreds() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) {
			((FriendsChatMember)this.get(var1)).clearIsIgnored();
		}

	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		signature = "(Ljz;I)V",
		garbageValue = "353715814"
	)
	@Export("isLocalPlayer")
	final void isLocalPlayer(FriendsChatMember var1) {
		if (var1.getUsername().equals(this.localUser.username())) {
			this.rank = var1.rank;
		}

	}
}
