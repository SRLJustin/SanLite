import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ko")
@Implements("FriendsList")
public class FriendsList extends NameableContainer {
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "Lmu;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1380465553
	)
	int field3657;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "Ljj;"
	)
	@Export("friendLoginUpdates")
	public LinkDeque friendLoginUpdates;

	@ObfuscatedSignature(
		signature = "(Lmu;)V"
	)
	public FriendsList(LoginType var1) {
		super(400);
		this.field3657 = 1;
		this.friendLoginUpdates = new LinkDeque();
		this.loginType = var1;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "(B)Lju;",
		garbageValue = "-99"
	)
	@Export("newInstance")
	Nameable newInstance() {
		return new Friend();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "(II)[Lju;",
		garbageValue = "-1524839332"
	)
	@Export("newTypedArray")
	Nameable[] newTypedArray(int var1) {
		return new Friend[var1];
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(Lki;ZB)Z",
		garbageValue = "-6"
	)
	@Export("isFriended")
	public boolean isFriended(Username var1, boolean var2) {
		Friend var3 = (Friend)this.getByUsername(var1);
		if (var3 == null) {
			return false;
		} else {
			return !var2 || var3.world != 0;
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(Lkj;II)V",
		garbageValue = "-1122558022"
	)
	@Export("read")
	public void read(Buffer var1, int var2) {
		while (true) {
			if (var1.offset < var2) {
				boolean var3 = var1.readUnsignedByte() == 1;
				Username var4 = new Username(var1.readStringCp1252NullTerminated(), this.loginType);
				Username var5 = new Username(var1.readStringCp1252NullTerminated(), this.loginType);
				int var6 = var1.readUnsignedShort();
				int var7 = var1.readUnsignedByte();
				int var8 = var1.readUnsignedByte();
				boolean var9 = (var8 & 2) != 0;
				boolean var10 = (var8 & 1) != 0;
				if (var6 > 0) {
					var1.readStringCp1252NullTerminated();
					var1.readUnsignedByte();
					var1.readInt();
				}

				var1.readStringCp1252NullTerminated();
				if (var4 != null && var4.hasCleanName()) {
					Friend var11 = (Friend)this.getByCurrentUsername(var4);
					if (var3) {
						Friend var12 = (Friend)this.getByCurrentUsername(var5);
						if (var12 != null && var12 != var11) {
							if (var11 != null) {
								this.remove(var12);
							} else {
								var11 = var12;
							}
						}
					}

					if (var11 != null) {
						this.changeName(var11, var4, var5);
						if (var6 != var11.world) {
							boolean var14 = true;

							for (FriendLoginUpdate var13 = (FriendLoginUpdate)this.friendLoginUpdates.last(); var13 != null; var13 = (FriendLoginUpdate)this.friendLoginUpdates.previous()) {
								if (var13.username.equals(var4)) {
									if (var6 != 0 && var13.world == 0) {
										var13.remove();
										var14 = false;
									} else if (var6 == 0 && var13.world != 0) {
										var13.remove();
										var14 = false;
									}
								}
							}

							if (var14) {
								this.friendLoginUpdates.addFirst(new FriendLoginUpdate(var4, var6));
							}
						}
					} else {
						if (this.getSize() >= 400) {
							continue;
						}

						var11 = (Friend)this.addLast(var4, var5);
					}

					if (var6 != var11.world) {
						var11.int2 = ++this.field3657 - 1;
						if (var11.world == -1 && var6 == 0) {
							var11.int2 = -(var11.int2 * -579950033) * 503110863;
						}

						var11.world = var6;
					}

					var11.rank = var7;
					var11.field3666 = var9;
					var11.field3667 = var10;
					continue;
				}

				throw new IllegalStateException();
			}

			this.sort();
			return;
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "(IIIII)V",
		garbageValue = "754468419"
	)
	static void method5222(int var0, int var1, int var2, int var3) {
		for (ObjectSound var4 = (ObjectSound)ObjectSound.objectSounds.last(); var4 != null; var4 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var4.soundEffectId != -1 || var4.soundEffectIds != null) {
				int var5 = 0;
				if (var1 > var4.field1073 * 128) {
					var5 += var1 - var4.field1073 * 128;
				} else if (var1 < var4.x * 16384) {
					var5 += var4.x * 16384 - var1;
				}

				if (var2 > var4.field1078 * 16384) {
					var5 += var2 - var4.field1078 * 16384;
				} else if (var2 < var4.y * 128) {
					var5 += var4.y * 128 - var2;
				}

				if (var5 - 64 <= var4.field1086 && Timer.clientPreferences.areaSoundEffectsVolume != 0 && var0 == var4.plane) {
					var5 -= 64;
					if (var5 < 0) {
						var5 = 0;
					}

					int var6 = (var4.field1086 - var5) * Timer.clientPreferences.areaSoundEffectsVolume / var4.field1086;
					if (var4.stream1 == null) {
						if (var4.soundEffectId >= 0) {
							SoundEffect var7 = SoundEffect.readSoundEffect(class227.archive4, var4.soundEffectId, 0);
							if (var7 != null) {
								RawSound var8 = var7.toRawSound().resample(ItemLayer.decimator);
								RawPcmStream var9 = RawPcmStream.createRawPcmStream(var8, 100, var6);
								var9.setNumLoops(-1);
								WorldMapManager.pcmStreamMixer.addSubStream(var9);
								var4.stream1 = var9;
							}
						}
					} else {
						var4.stream1.method2610(var6);
					}

					if (var4.stream2 == null) {
						if (var4.soundEffectIds != null && (var4.field1081 -= var3) <= 0) {
							int var11 = (int)(Math.random() * (double)var4.soundEffectIds.length);
							SoundEffect var12 = SoundEffect.readSoundEffect(class227.archive4, var4.soundEffectIds[var11], 0);
							if (var12 != null) {
								RawSound var13 = var12.toRawSound().resample(ItemLayer.decimator);
								RawPcmStream var10 = RawPcmStream.createRawPcmStream(var13, 100, var6);
								var10.setNumLoops(0);
								WorldMapManager.pcmStreamMixer.addSubStream(var10);
								var4.stream2 = var10;
								var4.field1081 = var4.field1085 + (int)(Math.random() * (double)(var4.field1083 - var4.field1085));
							}
						}
					} else {
						var4.stream2.method2610(var6);
						if (!var4.stream2.hasNext()) {
							var4.stream2 = null;
						}
					}
				} else {
					if (var4.stream1 != null) {
						WorldMapManager.pcmStreamMixer.removeSubStream(var4.stream1);
						var4.stream1 = null;
					}

					if (var4.stream2 != null) {
						WorldMapManager.pcmStreamMixer.removeSubStream(var4.stream2);
						var4.stream2 = null;
					}
				}
			}
		}

	}
}
