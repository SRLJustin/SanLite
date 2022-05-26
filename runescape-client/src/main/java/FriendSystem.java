import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bd")
@Implements("FriendSystem")
public class FriendSystem {
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lna;"
	)
	@Export("friendsList")
	public final FriendsList friendsList;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("ignoreList")
	public final IgnoreList ignoreList;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -2020260253
	)
	int field803;

	@ObfuscatedSignature(
		descriptor = "(Lpj;)V"
	)
	FriendSystem(LoginType var1) {
		this.field803 = 0;
		this.loginType = var1;
		this.friendsList = new FriendsList(var1);
		this.ignoreList = new IgnoreList(var1);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-76"
	)
	boolean method1666() {
		return this.field803 == 2;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-990336643"
	)
	final void method1667() {
		this.field803 = 1;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lpx;II)V",
		garbageValue = "1619915993"
	)
	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2);
		this.field803 = 2;

		for (int var3 = 0; var3 < Players.Players_count; ++var3) {
			Player var4 = Client.players[Players.Players_indices[var3]];
			var4.clearIsFriend();
		}

		Iterator var5 = Messages.Messages_hashTable.iterator();

		while (var5.hasNext()) {
			Message var6 = (Message)var5.next();
			var6.clearIsFromFriend();
		}

		if (PcmPlayer.friendsChatManager != null) {
			PcmPlayer.friendsChatManager.clearFriends();
		}

	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-29"
	)
	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) {
			if ((long)var1.field4314 < class113.method2624() / 1000L - 5L) {
				if (var1.world > 0) {
					WorldMapEvent.addGameMessage(5, "", var1.username + " has logged in.");
				}

				if (var1.world == 0) {
					WorldMapEvent.addGameMessage(5, "", var1.username + " has logged out.");
				}

				var1.remove();
			}
		}

	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-1844"
	)
	@Export("clear")
	final void clear() {
		this.field803 = 0;
		this.friendsList.clear();
		this.ignoreList.clear();
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lqv;ZS)Z",
		garbageValue = "753"
	)
	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) {
			return false;
		} else if (var1.equals(ModelData0.localPlayer.username)) {
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2);
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lqv;I)Z",
		garbageValue = "1274631135"
	)
	@Export("isIgnored")
	final boolean isIgnored(Username var1) {
		if (var1 == null) {
			return false;
		} else {
			return this.ignoreList.contains(var1);
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-35"
	)
	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsListIsFull()) {
					Tiles.method2017();
				} else if (ModelData0.localPlayer.username.equals(var2)) {
					InterfaceParent.method2067("You can't add yourself to your own friend list");
				} else if (this.isFriended(var2, false)) {
					InterfaceParent.method2067(var1 + " is already on your friend list");
				} else if (this.isIgnored(var2)) {
					InterfaceParent.method2067("Please remove " + var1 + " from your ignore list first");
				} else {
					PacketBufferNode var3 = DecorativeObject.getPacketBufferNode(ClientPacket.field2998, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(class392.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}
			}
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "731924017"
	)
	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field610 != 1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1674532630"
	)
	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.canAddIgnore()) {
					InterfaceParent.method2067("Your ignore list is full. Max of 100 for free users, and 400 for members");
				} else if (ModelData0.localPlayer.username.equals(var2)) {
					UserComparator9.method2601();
				} else if (this.isIgnored(var2)) {
					class230.method4731(var1);
				} else if (this.isFriended(var2, false)) {
					InterfaceParent.method2067("Please remove " + var1 + " from your friend list first");
				} else {
					PacketBufferNode var3 = DecorativeObject.getPacketBufferNode(ClientPacket.field2959, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(class392.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}
			}
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-799291101"
	)
	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field610 != 1;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1784311825"
	)
	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsList.removeByUsername(var2)) {
					Renderable.method4210();
					PacketBufferNode var3 = DecorativeObject.getPacketBufferNode(ClientPacket.field2954, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(class392.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}

				for (int var5 = 0; var5 < Players.Players_count; ++var5) {
					Player var4 = Client.players[Players.Players_indices[var5]];
					var4.clearIsFriend();
				}

				Iterator var6 = Messages.Messages_hashTable.iterator();

				while (var6.hasNext()) {
					Message var7 = (Message)var6.next();
					var7.clearIsFromFriend();
				}

				if (PcmPlayer.friendsChatManager != null) {
					PcmPlayer.friendsChatManager.clearFriends();
				}

			}
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "516139495"
	)
	@Export("removeIgnore")
	final void removeIgnore(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.ignoreList.removeByUsername(var2)) {
					Renderable.method4210();
					PacketBufferNode var3 = DecorativeObject.getPacketBufferNode(ClientPacket.field3034, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(class392.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}

				class121.FriendSystem_invalidateIgnoreds();
			}
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lqv;I)Z",
		garbageValue = "723636782"
	)
	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = (Friend)this.friendsList.getByUsername(var1);
		return var2 != null && var2.hasWorld();
	}
}
