import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ew")
public class class141 extends class144 {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -390226113
	)
	int field1670;
	@ObfuscatedName("q")
	byte field1668;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1954797197
	)
	int field1669;
	@ObfuscatedName("k")
	String field1671;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lee;"
	)
	final class145 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lee;)V"
	)
	class141(class145 var1) {
		this.this$0 = var1;
		this.field1670 = -1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)V",
		garbageValue = "1212008489"
	)
	void vmethod3037(Buffer var1) {
		var1.readUnsignedByte();
		this.field1670 = var1.readUnsignedShort();
		this.field1668 = var1.readByte();
		this.field1669 = var1.readUnsignedShort();
		var1.readLong();
		this.field1671 = var1.readStringCp1252NullTerminated();
		var1.readUnsignedByte();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Let;I)V",
		garbageValue = "1640110130"
	)
	void vmethod3032(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1670);
		var2.rank = this.field1668;
		var2.world = this.field1669;
		var2.username = new Username(this.field1671);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)[Lcm;",
		garbageValue = "-33"
	)
	static class83[] method2962() {
		return new class83[]{class83.field1087, class83.field1088, class83.field1092, class83.field1084, class83.field1086, class83.field1083};
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IB)Lgt;",
		garbageValue = "19"
	)
	@Export("getFrames")
	static Frames getFrames(int var0) {
		Frames var1 = (Frames)SequenceDefinition.SequenceDefinition_cachedFrames.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			AbstractArchive var3 = SequenceDefinition.SequenceDefinition_animationsArchive;
			AbstractArchive var4 = SequenceDefinition.SequenceDefinition_skeletonsArchive;
			boolean var5 = true;
			int[] var6 = var3.getGroupFileIds(var0);

			for (int var7 = 0; var7 < var6.length; ++var7) {
				byte[] var8 = var3.getFile(var0, var6[var7]);
				if (var8 == null) {
					var5 = false;
				} else {
					int var9 = (var8[0] & 255) << 8 | var8[1] & 255;
					byte[] var10 = var4.getFile(var9, 0);
					if (var10 == null) {
						var5 = false;
					}
				}
			}

			Frames var2;
			if (!var5) {
				var2 = null;
			} else {
				try {
					var2 = new Frames(var3, var4, var0, false);
				} catch (Exception var12) {
					var2 = null;
				}
			}

			if (var2 != null) {
				SequenceDefinition.SequenceDefinition_cachedFrames.put(var2, (long)var0);
			}

			return var2;
		}
	}
}
