import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fx")
public class class167 {
	@ObfuscatedName("w")
	public short[] field1790;
	@ObfuscatedName("v")
	public short[] field1791;

	class167(int var1) {
		ItemComposition var2 = AttackOption.ItemDefinition_get(var1);
		if (var2.method3641()) {
			this.field1790 = new short[var2.recolorTo.length];
			System.arraycopy(var2.recolorTo, 0, this.field1790, 0, this.field1790.length);
		}

		if (var2.method3642()) {
			this.field1791 = new short[var2.retextureTo.length];
			System.arraycopy(var2.retextureTo, 0, this.field1791, 0, this.field1791.length);
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "1804401503"
	)
	static int method3266(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.GETWINDOWMODE) {
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = Canvas.getWindowedMode();
			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.SETWINDOWMODE) {
				var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize];
				if (var3 == 1 || var3 == 2) {
					ClanSettings.setWindowedMode(var3);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) {
				Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = FriendsChatMember.clientPreferences.method2231();
				return 1;
			} else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) {
				if (var0 == 5310) {
					--Nameable.Interpreter_intStackSize;
					return 1;
				} else if (var0 == 5311) {
					Nameable.Interpreter_intStackSize -= 2;
					return 1;
				} else if (var0 == 5312) {
					--Nameable.Interpreter_intStackSize;
					return 1;
				} else if (var0 == 5350) {
					UserComparator8.Interpreter_stringStackSize -= 2;
					--Nameable.Interpreter_intStackSize;
					return 1;
				} else {
					return var0 == 5351 ? 1 : 2;
				}
			} else {
				var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize];
				if (var3 == 1 || var3 == 2) {
					FriendsChatMember.clientPreferences.method2244(var3);
				}

				return 1;
			}
		}
	}
}
