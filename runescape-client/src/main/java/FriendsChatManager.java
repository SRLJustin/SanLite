import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nx")
@Implements("FriendsChatManager")
public class FriendsChatManager extends NameableContainer {
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	@Export("localUser")
	final Usernamed localUser;
	@ObfuscatedName("k")
	@Export("name")
	public String name;
	@ObfuscatedName("a")
	@Export("owner")
	public String owner;
	@ObfuscatedName("m")
	@Export("minKick")
	public byte minKick;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -546532963
	)
	@Export("rank")
	public int rank;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -335963343
	)
	int field4309;

	@ObfuscatedSignature(
		descriptor = "(Lpj;Lnj;)V"
	)
	public FriendsChatManager(LoginType var1, Usernamed var2) {
		super(100);
		this.name = null;
		this.owner = null;
		this.field4309 = 1;
		this.loginType = var1;
		this.localUser = var2;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Lnb;",
		garbageValue = "-1695844600"
	)
	@Export("newInstance")
	Nameable newInstance() {
		return new FriendsChatMember();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)[Lnb;",
		garbageValue = "1788836658"
	)
	@Export("newTypedArray")
	Nameable[] newTypedArray(int var1) {
		return new FriendsChatMember[var1];
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1717144210"
	)
	@Export("readName")
	final void readName(String var1) {
		String var3 = class263.base37DecodeLong(class114.method2626(var1));
		if (var3 == null) {
			var3 = "";
		}

		this.name = var3;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1165437728"
	)
	@Export("setOwner")
	final void setOwner(String var1) {
		String var3 = class263.base37DecodeLong(class114.method2626(var1));
		if (var3 == null) {
			var3 = "";
		}

		this.owner = var3;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lpx;B)V",
		garbageValue = "-38"
	)
	@Export("readUpdate")
	public final void readUpdate(Buffer var1) {
		this.setOwner(var1.readStringCp1252NullTerminated());
		long var2 = var1.readLong();
		this.readName(class293.method5431(var2));
		this.minKick = var1.readByte();
		int var4 = var1.readUnsignedByte();
		if (var4 != 255) {
			this.clear();

			for (int var5 = 0; var5 < var4; ++var5) {
				FriendsChatMember var6 = (FriendsChatMember)this.addLastNoPreviousUsername(new Username(var1.readStringCp1252NullTerminated(), this.loginType));
				int var7 = var1.readUnsignedShort();
				var6.set(var7, ++this.field4309 - 1);
				var6.rank = var1.readByte();
				var1.readStringCp1252NullTerminated();
				this.isLocalPlayer(var6);
			}

		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lpx;B)V",
		garbageValue = "2"
	)
	public final void method6463(Buffer var1) {
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

			var6.set(var3, ++this.field4309 - 1);
			var6.rank = var4;
			this.isLocalPlayer(var6);
		}

	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-570861245"
	)
	@Export("clearFriends")
	public final void clearFriends() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) {
			((FriendsChatMember)this.get(var1)).clearIsFriend();
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-295246975"
	)
	@Export("invalidateIgnoreds")
	public final void invalidateIgnoreds() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) {
			((FriendsChatMember)this.get(var1)).clearIsIgnored();
		}

	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lnm;I)V",
		garbageValue = "402509546"
	)
	@Export("isLocalPlayer")
	final void isLocalPlayer(FriendsChatMember var1) {
		if (var1.getUsername().equals(this.localUser.username())) {
			this.rank = var1.rank;
		}

	}
}
