import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@Deprecated
@ObfuscatedName("cu")
@Implements("Varcs")
public class Varcs {
	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	@Export("mouseRecorder")
	static MouseRecorder mouseRecorder;
	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	@Export("js5Socket")
	static AbstractSocket js5Socket;
	@ObfuscatedName("fl")
	@ObfuscatedGetter(
		intValue = 731803613
	)
	static int field1329;
	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	@Export("fontPlain11")
	static Font fontPlain11;
	@ObfuscatedName("l")
	@Export("intsPersistence")
	boolean[] intsPersistence;
	@ObfuscatedName("k")
	@Export("map")
	Map map;
	/** @deprecated */
	@ObfuscatedName("a")
	@Export("strings")
	String[] strings;
	@ObfuscatedName("m")
	@Export("unwrittenChanges")
	boolean unwrittenChanges;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		longValue = -8040896661134893849L
	)
	long field1324;

	Varcs() {
		this.unwrittenChanges = false;
		int var1 = class356.archive2.getGroupFileCount(19);
		this.map = new HashMap();
		this.intsPersistence = new boolean[var1];

		int var2;
		for (var2 = 0; var2 < var1; ++var2) {
			VarcInt var4 = (VarcInt)VarcInt.VarcInt_cached.get((long)var2);
			VarcInt var3;
			if (var4 != null) {
				var3 = var4;
			} else {
				byte[] var5 = VarcInt.VarcInt_archive.takeFile(19, var2);
				var4 = new VarcInt();
				if (var5 != null) {
					var4.method3315(new Buffer(var5));
				}

				VarcInt.VarcInt_cached.put(var4, (long)var2);
				var3 = var4;
			}

			this.intsPersistence[var2] = var3.persist;
		}

		var2 = 0;
		if (class356.archive2.method5634(15)) {
			var2 = class356.archive2.getGroupFileCount(15);
		}

		this.strings = new String[var2];
		this.read();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-43"
	)
	@Export("setInt")
	void setInt(int var1, int var2) {
		this.map.put(var1, var2);
		if (this.intsPersistence[var1]) {
			this.unwrittenChanges = true;
		}

	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1629880183"
	)
	@Export("getInt")
	int getInt(int var1) {
		Object var2 = this.map.get(var1);
		return var2 instanceof Integer ? (Integer)var2 : -1;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-89263666"
	)
	@Export("setString")
	void setString(int var1, String var2) {
		this.map.put(var1, var2);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1860266342"
	)
	@Export("getString")
	String getString(int var1) {
		Object var2 = this.map.get(var1);
		return var2 instanceof String ? (String)var2 : "";
	}

	/** @deprecated */
	@Deprecated
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "409167370"
	)
	@Export("setStringOld")
	void setStringOld(int var1, String var2) {
		this.strings[var1] = var2;
	}

	/** @deprecated */
	@Deprecated
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "2082376569"
	)
	@Export("getStringOld")
	String getStringOld(int var1) {
		return this.strings[var1];
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "181729030"
	)
	@Export("clearTransient")
	void clearTransient() {
		int var1;
		for (var1 = 0; var1 < this.intsPersistence.length; ++var1) {
			if (!this.intsPersistence[var1]) {
				this.map.remove(var1);
			}
		}

		for (var1 = 0; var1 < this.strings.length; ++var1) {
			this.strings[var1] = null;
		}

	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lpu;",
		garbageValue = "-1693869936"
	)
	@Export("getPreferencesFile")
	AccessFile getPreferencesFile(boolean var1) {
		return UserComparator3.getPreferencesFile("2", ApproximateRouteStrategy.field473.name, var1);
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "82"
	)
	@Export("write")
	void write() {
		AccessFile var1 = this.getPreferencesFile(true);

		try {
			int var2 = 3;
			int var3 = 0;
			Iterator var4 = this.map.entrySet().iterator();

			while (var4.hasNext()) {
				Entry var5 = (Entry)var4.next();
				int var6 = (Integer)var5.getKey();
				if (this.intsPersistence[var6]) {
					Object var7 = var5.getValue();
					var2 += 3;
					if (var7 instanceof Integer) {
						var2 += 4;
					} else if (var7 instanceof String) {
						var2 += class392.stringCp1252NullTerminatedByteSize((String)var7);
					}

					++var3;
				}
			}

			Buffer var28 = new Buffer(var2);
			var28.writeByte(2);
			var28.writeShort(var3);
			Iterator var29 = this.map.entrySet().iterator();

			label145:
			while (true) {
				Entry var17;
				int var18;
				do {
					if (!var29.hasNext()) {
						var1.write(var28.array, 0, var28.offset);
						break label145;
					}

					var17 = (Entry)var29.next();
					var18 = (Integer)var17.getKey();
				} while(!this.intsPersistence[var18]);

				var28.writeShort(var18);
				Object var8 = var17.getValue();
				Class var10 = var8.getClass();
				class433[] var11 = new class433[]{class433.field4655, class433.field4656, class433.field4664};
				class433[] var12 = var11;
				int var13 = 0;

				class433 var9;
				while (true) {
					if (var13 >= var12.length) {
						var9 = null;
						break;
					}

					class433 var14 = var12[var13];
					if (var10 == var14.field4667) {
						var9 = var14;
						break;
					}

					++var13;
				}

				var28.writeByte(var9.field4658);
				class433.method7420(var8, var28);
			}
		} catch (Exception var26) {
		} finally {
			try {
				var1.close();
			} catch (Exception var25) {
			}

		}

		this.unwrittenChanges = false;
		this.field1324 = class113.method2624();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-16764"
	)
	@Export("read")
	void read() {
		AccessFile var1 = this.getPreferencesFile(false);

		label213: {
			try {
				byte[] var2 = new byte[(int)var1.length()];

				int var4;
				for (int var3 = 0; var3 < var2.length; var3 += var4) {
					var4 = var1.read(var2, var3, var2.length - var3);
					if (var4 == -1) {
						throw new EOFException();
					}
				}

				Buffer var15 = new Buffer(var2);
				if (var15.array.length - var15.offset < 1) {
					return;
				}

				int var16 = var15.readUnsignedByte();
				if (var16 >= 0 && var16 <= 2) {
					int var7;
					int var8;
					int var9;
					int var17;
					if (var16 >= 2) {
						var17 = var15.readUnsignedShort();
						var7 = 0;

						while (true) {
							if (var7 >= var17) {
								break label213;
							}

							var8 = var15.readUnsignedShort();
							var9 = var15.readUnsignedByte();
							class433[] var10 = new class433[]{class433.field4655, class433.field4656, class433.field4664};
							class433 var11 = (class433)class291.findEnumerated(var10, var9);
							Object var12 = var11.method7423(var15);
							if (this.intsPersistence[var8]) {
								this.map.put(var8, var12);
							}

							++var7;
						}
					} else {
						var17 = var15.readUnsignedShort();

						for (var7 = 0; var7 < var17; ++var7) {
							var8 = var15.readUnsignedShort();
							var9 = var15.readInt();
							if (this.intsPersistence[var8]) {
								this.map.put(var8, var9);
							}
						}

						var7 = var15.readUnsignedShort();
						var8 = 0;

						while (true) {
							if (var8 >= var7) {
								break label213;
							}

							var15.readUnsignedShort();
							var15.readStringCp1252NullTerminated();
							++var8;
						}
					}
				}
			} catch (Exception var26) {
				break label213;
			} finally {
				try {
					var1.close();
				} catch (Exception var25) {
				}

			}

			return;
		}

		this.unwrittenChanges = false;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-590305740"
	)
	@Export("tryWrite")
	void tryWrite() {
		if (this.unwrittenChanges && this.field1324 < class113.method2624() - 60000L) {
			this.write();
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2147209332"
	)
	@Export("hasUnwrittenChanges")
	boolean hasUnwrittenChanges() {
		return this.unwrittenChanges;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-405806506"
	)
	static void method2466() {
		for (ObjectSound var0 = (ObjectSound)ObjectSound.objectSounds.last(); var0 != null; var0 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var0.stream1 != null) {
				class122.pcmStreamMixer.removeSubStream(var0.stream1);
				var0.stream1 = null;
			}

			if (var0.stream2 != null) {
				class122.pcmStreamMixer.removeSubStream(var0.stream2);
				var0.stream2 = null;
			}
		}

		ObjectSound.objectSounds.clear();
	}

	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "32"
	)
	@Export("forceDisconnect")
	static final void forceDisconnect(int var0) {
		SecureRandomCallable.logOut();
		switch(var0) {
		case 1:
			class126.method2799(24);
			class345.setLoginResponseString("", "You were disconnected from the server.", "");
			break;
		case 2:
			class126.method2799(24);
			class345.setLoginResponseString("The game servers are currently being updated.", "Please wait a few minutes and try again.", "");
		}

	}
}
