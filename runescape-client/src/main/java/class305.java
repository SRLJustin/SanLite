import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("kz")
public class class305 {
	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("archive8")
	static Archive archive8;

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Llp;I)V",
		garbageValue = "1856967280"
	)
	public static void method5592(AbstractArchive var0) {
		ParamComposition.ParamDefinition_archive = var0;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ILbb;ZI)I",
		garbageValue = "286394891"
	)
	static int method5591(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.FRIEND_COUNT) {
			if (BufferedSource.friendSystem.field803 == 0) {
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -2;
			} else if (BufferedSource.friendSystem.field803 == 1) {
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1;
			} else {
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = BufferedSource.friendSystem.friendsList.getSize();
			}

			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
				var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
				if (BufferedSource.friendSystem.method1666() && var3 >= 0 && var3 < BufferedSource.friendSystem.friendsList.getSize()) {
					Friend var8 = (Friend)BufferedSource.friendSystem.friendsList.get(var3);
					Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var8.getName();
					Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var8.getPreviousName();
				} else {
					Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
				var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
				if (BufferedSource.friendSystem.method1666() && var3 >= 0 && var3 < BufferedSource.friendSystem.friendsList.getSize()) {
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = ((Buddy)BufferedSource.friendSystem.friendsList.get(var3)).world;
				} else {
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
				var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
				if (BufferedSource.friendSystem.method1666() && var3 >= 0 && var3 < BufferedSource.friendSystem.friendsList.getSize()) {
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = ((Buddy)BufferedSource.friendSystem.friendsList.get(var3)).rank;
				} else {
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else {
				String var5;
				if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
					var5 = Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize];
					int var6 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
					DecorativeObject.method4392(var5, var6);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize];
					BufferedSource.friendSystem.addFriend(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize];
					BufferedSource.friendSystem.removeFriend(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize];
					BufferedSource.friendSystem.addIgnore(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize];
					BufferedSource.friendSystem.removeIgnore(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize];
					var5 = class150.method3026(var5);
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = BufferedSource.friendSystem.isFriended(new Username(var5, class391.loginType), false) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
					if (PcmPlayer.friendsChatManager != null) {
						Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = PcmPlayer.friendsChatManager.name;
					} else {
						Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
					if (PcmPlayer.friendsChatManager != null) {
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = PcmPlayer.friendsChatManager.getSize();
					} else {
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
					var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
					if (PcmPlayer.friendsChatManager != null && var3 < PcmPlayer.friendsChatManager.getSize()) {
						Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = PcmPlayer.friendsChatManager.get(var3).getUsername().getName();
					} else {
						Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
					var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
					if (PcmPlayer.friendsChatManager != null && var3 < PcmPlayer.friendsChatManager.getSize()) {
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = ((Buddy)PcmPlayer.friendsChatManager.get(var3)).getWorld();
					} else {
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
					var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
					if (PcmPlayer.friendsChatManager != null && var3 < PcmPlayer.friendsChatManager.getSize()) {
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = ((Buddy)PcmPlayer.friendsChatManager.get(var3)).rank;
					} else {
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = PcmPlayer.friendsChatManager != null ? PcmPlayer.friendsChatManager.minKick : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
					var5 = Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize];
					class19.clanKickUser(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = PcmPlayer.friendsChatManager != null ? PcmPlayer.friendsChatManager.rank : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
					var5 = Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize];
					Skills.Clan_joinChat(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
					class78.Clan_leaveChat();
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
					if (!BufferedSource.friendSystem.method1666()) {
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = BufferedSource.friendSystem.ignoreList.getSize();
					}

					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
					var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
					if (BufferedSource.friendSystem.method1666() && var3 >= 0 && var3 < BufferedSource.friendSystem.ignoreList.getSize()) {
						Ignored var4 = (Ignored)BufferedSource.friendSystem.ignoreList.get(var3);
						Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var4.getName();
						Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var4.getPreviousName();
					} else {
						Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize];
					var5 = class150.method3026(var5);
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = BufferedSource.friendSystem.isIgnored(new Username(var5, class391.loginType)) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
					var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
					if (PcmPlayer.friendsChatManager != null && var3 < PcmPlayer.friendsChatManager.getSize() && PcmPlayer.friendsChatManager.get(var3).getUsername().equals(ModelData0.localPlayer.username)) {
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
					if (PcmPlayer.friendsChatManager != null && PcmPlayer.friendsChatManager.owner != null) {
						Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = PcmPlayer.friendsChatManager.owner;
					} else {
						Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
					var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
					if (PcmPlayer.friendsChatManager != null && var3 < PcmPlayer.friendsChatManager.getSize() && ((FriendsChatMember)PcmPlayer.friendsChatManager.get(var3)).isFriend()) {
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
					if (var0 == 3628) {
						BufferedSource.friendSystem.friendsList.removeComparator();
						return 1;
					} else {
						boolean var7;
						if (var0 == 3629) {
							var7 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1;
							BufferedSource.friendSystem.friendsList.addComparator(new UserComparator1(var7));
							return 1;
						} else if (var0 == 3630) {
							var7 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1;
							BufferedSource.friendSystem.friendsList.addComparator(new UserComparator2(var7));
							return 1;
						} else if (var0 == 3631) {
							var7 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1;
							BufferedSource.friendSystem.friendsList.addComparator(new UserComparator3(var7));
							return 1;
						} else if (var0 == 3632) {
							var7 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1;
							BufferedSource.friendSystem.friendsList.addComparator(new UserComparator4(var7));
							return 1;
						} else if (var0 == 3633) {
							var7 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1;
							BufferedSource.friendSystem.friendsList.addComparator(new UserComparator5(var7));
							return 1;
						} else if (var0 == 3634) {
							var7 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1;
							BufferedSource.friendSystem.friendsList.addComparator(new UserComparator6(var7));
							return 1;
						} else if (var0 == 3635) {
							var7 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1;
							BufferedSource.friendSystem.friendsList.addComparator(new UserComparator7(var7));
							return 1;
						} else if (var0 == 3636) {
							var7 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1;
							BufferedSource.friendSystem.friendsList.addComparator(new UserComparator8(var7));
							return 1;
						} else if (var0 == 3637) {
							var7 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1;
							BufferedSource.friendSystem.friendsList.addComparator(new UserComparator9(var7));
							return 1;
						} else if (var0 == 3638) {
							var7 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1;
							BufferedSource.friendSystem.friendsList.addComparator(new UserComparator10(var7));
							return 1;
						} else if (var0 == 3639) {
							BufferedSource.friendSystem.friendsList.sort();
							return 1;
						} else if (var0 == 3640) {
							BufferedSource.friendSystem.ignoreList.removeComparator();
							return 1;
						} else if (var0 == 3641) {
							var7 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1;
							BufferedSource.friendSystem.ignoreList.addComparator(new UserComparator1(var7));
							return 1;
						} else if (var0 == 3642) {
							var7 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1;
							BufferedSource.friendSystem.ignoreList.addComparator(new UserComparator2(var7));
							return 1;
						} else if (var0 == 3643) {
							BufferedSource.friendSystem.ignoreList.sort();
							return 1;
						} else if (var0 == 3644) {
							if (PcmPlayer.friendsChatManager != null) {
								PcmPlayer.friendsChatManager.removeComparator();
							}

							return 1;
						} else if (var0 == 3645) {
							var7 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1;
							if (PcmPlayer.friendsChatManager != null) {
								PcmPlayer.friendsChatManager.addComparator(new UserComparator1(var7));
							}

							return 1;
						} else if (var0 == 3646) {
							var7 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1;
							if (PcmPlayer.friendsChatManager != null) {
								PcmPlayer.friendsChatManager.addComparator(new UserComparator2(var7));
							}

							return 1;
						} else if (var0 == 3647) {
							var7 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1;
							if (PcmPlayer.friendsChatManager != null) {
								PcmPlayer.friendsChatManager.addComparator(new UserComparator3(var7));
							}

							return 1;
						} else if (var0 == 3648) {
							var7 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1;
							if (PcmPlayer.friendsChatManager != null) {
								PcmPlayer.friendsChatManager.addComparator(new UserComparator4(var7));
							}

							return 1;
						} else if (var0 == 3649) {
							var7 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1;
							if (PcmPlayer.friendsChatManager != null) {
								PcmPlayer.friendsChatManager.addComparator(new UserComparator5(var7));
							}

							return 1;
						} else if (var0 == 3650) {
							var7 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1;
							if (PcmPlayer.friendsChatManager != null) {
								PcmPlayer.friendsChatManager.addComparator(new UserComparator6(var7));
							}

							return 1;
						} else if (var0 == 3651) {
							var7 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1;
							if (PcmPlayer.friendsChatManager != null) {
								PcmPlayer.friendsChatManager.addComparator(new UserComparator7(var7));
							}

							return 1;
						} else if (var0 == 3652) {
							var7 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1;
							if (PcmPlayer.friendsChatManager != null) {
								PcmPlayer.friendsChatManager.addComparator(new UserComparator8(var7));
							}

							return 1;
						} else if (var0 == 3653) {
							var7 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1;
							if (PcmPlayer.friendsChatManager != null) {
								PcmPlayer.friendsChatManager.addComparator(new UserComparator9(var7));
							}

							return 1;
						} else if (var0 == 3654) {
							var7 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1;
							if (PcmPlayer.friendsChatManager != null) {
								PcmPlayer.friendsChatManager.addComparator(new UserComparator10(var7));
							}

							return 1;
						} else if (var0 == 3655) {
							if (PcmPlayer.friendsChatManager != null) {
								PcmPlayer.friendsChatManager.sort();
							}

							return 1;
						} else if (var0 == 3656) {
							var7 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1;
							BufferedSource.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7));
							return 1;
						} else if (var0 == 3657) {
							var7 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1;
							if (PcmPlayer.friendsChatManager != null) {
								PcmPlayer.friendsChatManager.addComparator(new BuddyRankComparator(var7));
							}

							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
					if (PcmPlayer.friendsChatManager != null && var3 < PcmPlayer.friendsChatManager.getSize() && ((FriendsChatMember)PcmPlayer.friendsChatManager.get(var3)).isIgnored()) {
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				}
			}
		}
	}
}
