import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jv")
@Implements("MusicPatchPcmStream")
public class MusicPatchPcmStream extends PcmStream {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lad;"
	)
	@Export("soundSystem")
	static SoundSystem soundSystem;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ljw;"
	)
	@Export("superStream")
	MidiPcmStream superStream;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("queue")
	NodeDeque queue;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Las;"
	)
	@Export("mixer")
	PcmStreamMixer mixer;

	@ObfuscatedSignature(
		descriptor = "(Ljw;)V"
	)
	MusicPatchPcmStream(MidiPcmStream var1) {
		this.queue = new NodeDeque();
		this.mixer = new PcmStreamMixer();
		this.superStream = var1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lji;[IIIII)V",
		garbageValue = "-2062540713"
	)
	void method5281(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
		if ((this.superStream.field3247[var1.field3308] & 4) != 0 && var1.field3316 < 0) {
			int var6 = this.superStream.field3259[var1.field3308] / PcmPlayer.field300;

			while (true) {
				int var7 = (var6 + 1048575 - var1.field3322) / var6;
				if (var7 > var4) {
					var1.field3322 += var6 * var4;
					break;
				}

				var1.stream.fill(var2, var3, var7);
				var3 += var7;
				var4 -= var7;
				var1.field3322 += var6 * var7 - 1048576;
				int var8 = PcmPlayer.field300 / 100;
				int var9 = 262144 / var6;
				if (var9 < var8) {
					var8 = var9;
				}

				RawPcmStream var10 = var1.stream;
				if (this.superStream.field3257[var1.field3308] == 0) {
					var1.stream = RawPcmStream.method829(var1.rawSound, var10.method884(), var10.method805(), var10.method806());
				} else {
					var1.stream = RawPcmStream.method829(var1.rawSound, var10.method884(), 0, var10.method806());
					this.superStream.method5091(var1, var1.patch.field3287[var1.field3307] < 0);
					var1.stream.method810(var8, var10.method805());
				}

				if (var1.patch.field3287[var1.field3307] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var10.method812(var8);
				var10.fill(var2, var3, var5 - var3);
				if (var10.method935()) {
					this.mixer.addSubStream(var10);
				}
			}
		}

		var1.stream.fill(var2, var3, var4);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lji;II)V",
		garbageValue = "-1512136486"
	)
	void method5297(MusicPatchNode var1, int var2) {
		if ((this.superStream.field3247[var1.field3308] & 4) != 0 && var1.field3316 < 0) {
			int var3 = this.superStream.field3259[var1.field3308] / PcmPlayer.field300;
			int var4 = (var3 + 1048575 - var1.field3322) / var3;
			var1.field3322 = var3 * var2 + var1.field3322 & 1048575;
			if (var4 <= var2) {
				if (this.superStream.field3257[var1.field3308] == 0) {
					var1.stream = RawPcmStream.method829(var1.rawSound, var1.stream.method884(), var1.stream.method805(), var1.stream.method806());
				} else {
					var1.stream = RawPcmStream.method829(var1.rawSound, var1.stream.method884(), 0, var1.stream.method806());
					this.superStream.method5091(var1, var1.patch.field3287[var1.field3307] < 0);
				}

				if (var1.patch.field3287[var1.field3307] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var2 = var1.field3322 / var3;
			}
		}

		var1.stream.skip(var2);
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "()Lao;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		MusicPatchNode var1 = (MusicPatchNode)this.queue.last();
		if (var1 == null) {
			return null;
		} else {
			return (PcmStream)(var1.stream != null ? var1.stream : this.nextSubStream());
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "()Lao;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		MusicPatchNode var1;
		do {
			var1 = (MusicPatchNode)this.queue.previous();
			if (var1 == null) {
				return null;
			}
		} while(var1.stream == null);

		return var1.stream;
	}

	@ObfuscatedName("s")
	protected int vmethod5295() {
		return 0;
	}

	@ObfuscatedName("r")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		this.mixer.fill(var1, var2, var3);

		for (MusicPatchNode var6 = (MusicPatchNode)this.queue.last(); var6 != null; var6 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method5113(var6)) {
				int var4 = var2;
				int var5 = var3;

				do {
					if (var5 <= var6.field3321) {
						this.method5281(var6, var1, var4, var5, var4 + var5);
						var6.field3321 -= var5;
						break;
					}

					this.method5281(var6, var1, var4, var6.field3321, var5 + var4);
					var4 += var6.field3321;
					var5 -= var6.field3321;
				} while(!this.superStream.method5114(var6, var1, var4, var5));
			}
		}

	}

	@ObfuscatedName("y")
	@Export("skip")
	protected void skip(int var1) {
		this.mixer.skip(var1);

		for (MusicPatchNode var3 = (MusicPatchNode)this.queue.last(); var3 != null; var3 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method5113(var3)) {
				int var2 = var1;

				do {
					if (var2 <= var3.field3321) {
						this.method5297(var3, var2);
						var3.field3321 -= var2;
						break;
					}

					this.method5297(var3, var3.field3321);
					var2 -= var3.field3321;
				} while(!this.superStream.method5114(var3, (int[])null, 0, var2));
			}
		}

	}

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "([Lki;II)V",
		garbageValue = "1623622888"
	)
	@Export("runComponentCloseListeners")
	static final void runComponentCloseListeners(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) {
			Widget var3 = var0[var2];
			if (var3 != null) {
				if (var3.type == 0) {
					if (var3.children != null) {
						runComponentCloseListeners(var3.children, var1);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id);
					if (var4 != null) {
						WorldMapLabelSize.runIntfCloseListeners(var4.group, var1);
					}
				}

				ScriptEvent var5;
				if (var1 == 0 && var3.onDialogAbort != null) {
					var5 = new ScriptEvent();
					var5.widget = var3;
					var5.args = var3.onDialogAbort;
					class144.runScriptEvent(var5);
				}

				if (var1 == 1 && var3.onSubChange != null) {
					if (var3.childIndex >= 0) {
						Widget var6 = class92.getWidget(var3.id);
						if (var6 == null || var6.children == null || var3.childIndex >= var6.children.length || var3 != var6.children[var3.childIndex]) {
							continue;
						}
					}

					var5 = new ScriptEvent();
					var5.widget = var3;
					var5.args = var3.onSubChange;
					class144.runScriptEvent(var5);
				}
			}
		}

	}
}
