import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jw")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lpv;"
	)
	@Export("musicPatches")
	NodeHashTable musicPatches;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1448190869
	)
	int field3243;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 830339397
	)
	int field3264;
	@ObfuscatedName("k")
	int[] field3245;
	@ObfuscatedName("a")
	int[] field3246;
	@ObfuscatedName("m")
	int[] field3269;
	@ObfuscatedName("p")
	int[] field3248;
	@ObfuscatedName("s")
	int[] field3249;
	@ObfuscatedName("r")
	int[] field3250;
	@ObfuscatedName("v")
	int[] field3251;
	@ObfuscatedName("y")
	int[] field3252;
	@ObfuscatedName("c")
	int[] field3253;
	@ObfuscatedName("h")
	int[] field3247;
	@ObfuscatedName("f")
	int[] field3242;
	@ObfuscatedName("d")
	int[] field3265;
	@ObfuscatedName("j")
	int[] field3257;
	@ObfuscatedName("z")
	int[] field3261;
	@ObfuscatedName("i")
	int[] field3259;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "[[Lji;"
	)
	MusicPatchNode[][] field3258;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[[Lji;"
	)
	MusicPatchNode[][] field3255;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lje;"
	)
	@Export("midiFile")
	MidiFileReader midiFile;
	@ObfuscatedName("am")
	boolean field3263;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -2049940197
	)
	@Export("track")
	int track;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -124001117
	)
	@Export("trackLength")
	int trackLength;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		longValue = -8059779539702401793L
	)
	long field3266;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		longValue = 127445036892202121L
	)
	long field3267;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("patchStream")
	MusicPatchPcmStream patchStream;

	public MidiPcmStream() {
		this.field3243 = 256;
		this.field3264 = 1000000;
		this.field3245 = new int[16];
		this.field3246 = new int[16];
		this.field3269 = new int[16];
		this.field3248 = new int[16];
		this.field3249 = new int[16];
		this.field3250 = new int[16];
		this.field3251 = new int[16];
		this.field3252 = new int[16];
		this.field3253 = new int[16];
		this.field3247 = new int[16];
		this.field3242 = new int[16];
		this.field3265 = new int[16];
		this.field3257 = new int[16];
		this.field3261 = new int[16];
		this.field3259 = new int[16];
		this.field3258 = new MusicPatchNode[16][128];
		this.field3255 = new MusicPatchNode[16][128];
		this.midiFile = new MidiFileReader();
		this.patchStream = new MusicPatchPcmStream(this);
		this.musicPatches = new NodeHashTable(128);
		this.method5099();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-4293"
	)
	@Export("setPcmStreamVolume")
	public synchronized void setPcmStreamVolume(int var1) {
		this.field3243 = var1;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1552053459"
	)
	public int method5080() {
		return this.field3243;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljy;Llp;Lan;IB)Z",
		garbageValue = "-8"
	)
	@Export("loadMusicTrack")
	synchronized boolean loadMusicTrack(MusicTrack var1, AbstractArchive var2, SoundCache var3, int var4) {
		var1.method5310();
		boolean var5 = true;
		int[] var6 = null;
		if (var4 > 0) {
			var6 = new int[]{var4};
		}

		for (ByteArrayNode var7 = (ByteArrayNode)var1.table.first(); var7 != null; var7 = (ByteArrayNode)var1.table.next()) {
			int var8 = (int)var7.key;
			MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)var8);
			if (var9 == null) {
				byte[] var11 = var2.takeFileFlat(var8);
				MusicPatch var10;
				if (var11 == null) {
					var10 = null;
				} else {
					var10 = new MusicPatch(var11);
				}

				var9 = var10;
				if (var10 == null) {
					var5 = false;
					continue;
				}

				this.musicPatches.put(var10, (long)var8);
			}

			if (!var9.method5272(var3, var7.byteArray, var6)) {
				var5 = false;
			}
		}

		if (var5) {
			var1.clear();
		}

		return var5;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1506862644"
	)
	@Export("clearAll")
	synchronized void clearAll() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) {
			var1.clear();
		}

	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-768637497"
	)
	@Export("removeAll")
	public synchronized void removeAll() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) {
			var1.remove();
		}

	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "()Lao;"
	)
	@Export("firstSubStream")
	protected synchronized PcmStream firstSubStream() {
		return this.patchStream;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "()Lao;"
	)
	@Export("nextSubStream")
	protected synchronized PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("s")
	protected synchronized int vmethod5295() {
		return 0;
	}

	@ObfuscatedName("r")
	@Export("fill")
	protected synchronized void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) {
			int var4 = this.midiFile.division * this.field3264 * -727379968 / PcmPlayer.field300;

			do {
				long var5 = this.field3266 + (long)var4 * (long)var3;
				if (this.field3267 - var5 >= 0L) {
					this.field3266 = var5;
					break;
				}

				int var7 = (int)((this.field3267 - this.field3266 + (long)var4 - 1L) / (long)var4);
				this.field3266 += (long)var7 * (long)var4;
				this.patchStream.fill(var1, var2, var7);
				var2 += var7;
				var3 -= var7;
				this.method5112();
			} while(this.midiFile.isReady());
		}

		this.patchStream.fill(var1, var2, var3);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljy;ZI)V",
		garbageValue = "-1388253754"
	)
	@Export("setMusicTrack")
	synchronized void setMusicTrack(MusicTrack var1, boolean var2) {
		this.clear();
		this.midiFile.parse(var1.midi);
		this.field3263 = var2;
		this.field3266 = 0L;
		int var3 = this.midiFile.trackCount();

		for (int var4 = 0; var4 < var3; ++var4) {
			this.midiFile.gotoTrack(var4);
			this.midiFile.readTrackLength(var4);
			this.midiFile.markTrackPosition(var4);
		}

		this.track = this.midiFile.getPrioritizedTrack();
		this.trackLength = this.midiFile.trackLengths[this.track];
		this.field3267 = this.midiFile.method5227(this.trackLength);
	}

	@ObfuscatedName("y")
	@Export("skip")
	protected synchronized void skip(int var1) {
		if (this.midiFile.isReady()) {
			int var2 = this.midiFile.division * this.field3264 * -727379968 / PcmPlayer.field300;

			do {
				long var3 = this.field3266 + (long)var1 * (long)var2;
				if (this.field3267 - var3 >= 0L) {
					this.field3266 = var3;
					break;
				}

				int var5 = (int)(((long)var2 + (this.field3267 - this.field3266) - 1L) / (long)var2);
				this.field3266 += (long)var5 * (long)var2;
				this.patchStream.skip(var5);
				var1 -= var5;
				this.method5112();
			} while(this.midiFile.isReady());
		}

		this.patchStream.skip(var1);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "187"
	)
	@Export("clear")
	public synchronized void clear() {
		this.midiFile.clear();
		this.method5099();
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1853291213"
	)
	@Export("isReady")
	public synchronized boolean isReady() {
		return this.midiFile.isReady();
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1725996416"
	)
	public synchronized void method5151(int var1, int var2) {
		this.method5184(var1, var2);
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-201628098"
	)
	void method5184(int var1, int var2) {
		this.field3248[var1] = var2;
		this.field3250[var1] = var2 & -128;
		this.method5089(var1, var2);
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1928331958"
	)
	void method5089(int var1, int var2) {
		if (var2 != this.field3249[var1]) {
			this.field3249[var1] = var2;

			for (int var3 = 0; var3 < 128; ++var3) {
				this.field3255[var1][var3] = null;
			}
		}

	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1114673013"
	)
	void method5212(int var1, int var2, int var3) {
		this.method5160(var1, var2, 64);
		if ((this.field3247[var1] & 2) != 0) {
			for (MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) {
				if (var4.field3308 == var1 && var4.field3316 < 0) {
					this.field3258[var1][var4.field3307] = null;
					this.field3258[var1][var2] = var4;
					int var8 = (var4.field3302 * var4.field3309 >> 12) + var4.field3310;
					var4.field3310 += var2 - var4.field3307 << 8;
					var4.field3309 = var8 - var4.field3310;
					var4.field3302 = 4096;
					var4.field3307 = var2;
					return;
				}
			}
		}

		MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field3249[var1]);
		if (var9 != null) {
			RawSound var5 = var9.rawSounds[var2];
			if (var5 != null) {
				MusicPatchNode var6 = new MusicPatchNode();
				var6.field3308 = var1;
				var6.patch = var9;
				var6.rawSound = var5;
				var6.field3306 = var9.field3291[var2];
				var6.field3319 = var9.field3285[var2];
				var6.field3307 = var2;
				var6.field3311 = var3 * var3 * var9.field3290[var2] * var9.field3288 + 1024 >> 11;
				var6.field3312 = var9.field3289[var2] & 255;
				var6.field3310 = (var2 << 8) - (var9.field3287[var2] & 32767);
				var6.field3313 = 0;
				var6.field3314 = 0;
				var6.field3315 = 0;
				var6.field3316 = -1;
				var6.field3317 = 0;
				if (this.field3257[var1] == 0) {
					var6.stream = RawPcmStream.method829(var5, this.method5141(var6), this.method5105(var6), this.method5106(var6));
				} else {
					var6.stream = RawPcmStream.method829(var5, this.method5141(var6), 0, this.method5106(var6));
					this.method5091(var6, var9.field3287[var2] < 0);
				}

				if (var9.field3287[var2] < 0) {
					var6.stream.setNumLoops(-1);
				}

				if (var6.field3319 >= 0) {
					MusicPatchNode var7 = this.field3255[var1][var6.field3319];
					if (var7 != null && var7.field3316 < 0) {
						this.field3258[var1][var7.field3307] = null;
						var7.field3316 = 0;
					}

					this.field3255[var1][var6.field3319] = var6;
				}

				this.patchStream.queue.addFirst(var6);
				this.field3258[var1][var2] = var6;
			}
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lji;ZI)V",
		garbageValue = "1848917000"
	)
	void method5091(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length;
		int var4;
		if (var2 && var1.rawSound.field266) {
			int var5 = var3 + var3 - var1.rawSound.start;
			var4 = (int)((long)this.field3257[var1.field3308] * (long)var5 >> 6);
			var3 <<= 8;
			if (var4 >= var3) {
				var4 = var3 + var3 - 1 - var4;
				var1.stream.method811();
			}
		} else {
			var4 = (int)((long)var3 * (long)this.field3257[var1.field3308] >> 6);
		}

		var1.stream.method807(var4);
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "-59"
	)
	void method5160(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field3258[var1][var2];
		if (var4 != null) {
			this.field3258[var1][var2] = null;
			if ((this.field3247[var1] & 2) != 0) {
				for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) {
					if (var4.field3308 == var5.field3308 && var5.field3316 < 0 && var5 != var4) {
						var4.field3316 = 0;
						break;
					}
				}
			} else {
				var4.field3316 = 0;
			}

		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "823222013"
	)
	void method5093(int var1, int var2, int var3) {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-750627525"
	)
	void method5087(int var1, int var2) {
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-926778021"
	)
	void method5095(int var1, int var2) {
		this.field3251[var1] = var2;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-25"
	)
	void method5096(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if (var1 < 0 || var2.field3308 == var1) {
				if (var2.stream != null) {
					var2.stream.method812(PcmPlayer.field300 / 100);
					if (var2.stream.method935()) {
						this.patchStream.mixer.addSubStream(var2.stream);
					}

					var2.method5316();
				}

				if (var2.field3316 < 0) {
					this.field3258[var2.field3308][var2.field3307] = null;
				}

				var2.remove();
			}
		}

	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1406320585"
	)
	void method5120(int var1) {
		if (var1 >= 0) {
			this.field3245[var1] = 12800;
			this.field3246[var1] = 8192;
			this.field3269[var1] = 16383;
			this.field3251[var1] = 8192;
			this.field3252[var1] = 0;
			this.field3253[var1] = 8192;
			this.method5100(var1);
			this.method5101(var1);
			this.field3247[var1] = 0;
			this.field3242[var1] = 32767;
			this.field3265[var1] = 256;
			this.field3257[var1] = 0;
			this.method5138(var1, 8192);
		} else {
			for (var1 = 0; var1 < 16; ++var1) {
				this.method5120(var1);
			}

		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "3"
	)
	void method5098(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if ((var1 < 0 || var2.field3308 == var1) && var2.field3316 < 0) {
				this.field3258[var2.field3308][var2.field3307] = null;
				var2.field3316 = 0;
			}
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1766234512"
	)
	void method5099() {
		this.method5096(-1);
		this.method5120(-1);

		int var1;
		for (var1 = 0; var1 < 16; ++var1) {
			this.field3249[var1] = this.field3248[var1];
		}

		for (var1 = 0; var1 < 16; ++var1) {
			this.field3250[var1] = this.field3248[var1] & -128;
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1091575779"
	)
	void method5100(int var1) {
		if ((this.field3247[var1] & 2) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field3308 == var1 && this.field3258[var1][var2.field3307] == null && var2.field3316 < 0) {
					var2.field3316 = 0;
				}
			}
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1548994766"
	)
	void method5101(int var1) {
		if ((this.field3247[var1] & 4) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field3308 == var1) {
					var2.field3322 = 0;
				}
			}
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "181741177"
	)
	void method5102(int var1) {
		int var2 = var1 & 240;
		int var3;
		int var4;
		int var5;
		if (var2 == 128) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method5160(var3, var4, var5);
		} else if (var2 == 144) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var5 > 0) {
				this.method5212(var3, var4, var5);
			} else {
				this.method5160(var3, var4, 64);
			}

		} else if (var2 == 160) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method5093(var3, var4, var5);
		} else if (var2 == 176) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var4 == 0) {
				this.field3250[var3] = (var5 << 14) + (this.field3250[var3] & -2080769);
			}

			if (var4 == 32) {
				this.field3250[var3] = (var5 << 7) + (this.field3250[var3] & -16257);
			}

			if (var4 == 1) {
				this.field3252[var3] = (var5 << 7) + (this.field3252[var3] & -16257);
			}

			if (var4 == 33) {
				this.field3252[var3] = var5 + (this.field3252[var3] & -128);
			}

			if (var4 == 5) {
				this.field3253[var3] = (var5 << 7) + (this.field3253[var3] & -16257);
			}

			if (var4 == 37) {
				this.field3253[var3] = var5 + (this.field3253[var3] & -128);
			}

			if (var4 == 7) {
				this.field3245[var3] = (var5 << 7) + (this.field3245[var3] & -16257);
			}

			if (var4 == 39) {
				this.field3245[var3] = var5 + (this.field3245[var3] & -128);
			}

			if (var4 == 10) {
				this.field3246[var3] = (var5 << 7) + (this.field3246[var3] & -16257);
			}

			if (var4 == 42) {
				this.field3246[var3] = var5 + (this.field3246[var3] & -128);
			}

			if (var4 == 11) {
				this.field3269[var3] = (var5 << 7) + (this.field3269[var3] & -16257);
			}

			if (var4 == 43) {
				this.field3269[var3] = var5 + (this.field3269[var3] & -128);
			}

			int[] var10000;
			if (var4 == 64) {
				if (var5 >= 64) {
					var10000 = this.field3247;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field3247;
					var10000[var3] &= -2;
				}
			}

			if (var4 == 65) {
				if (var5 >= 64) {
					var10000 = this.field3247;
					var10000[var3] |= 2;
				} else {
					this.method5100(var3);
					var10000 = this.field3247;
					var10000[var3] &= -3;
				}
			}

			if (var4 == 99) {
				this.field3242[var3] = (var5 << 7) + (this.field3242[var3] & 127);
			}

			if (var4 == 98) {
				this.field3242[var3] = (this.field3242[var3] & 16256) + var5;
			}

			if (var4 == 101) {
				this.field3242[var3] = (var5 << 7) + (this.field3242[var3] & 127) + 16384;
			}

			if (var4 == 100) {
				this.field3242[var3] = (this.field3242[var3] & 16256) + var5 + 16384;
			}

			if (var4 == 120) {
				this.method5096(var3);
			}

			if (var4 == 121) {
				this.method5120(var3);
			}

			if (var4 == 123) {
				this.method5098(var3);
			}

			int var6;
			if (var4 == 6) {
				var6 = this.field3242[var3];
				if (var6 == 16384) {
					this.field3265[var3] = (var5 << 7) + (this.field3265[var3] & -16257);
				}
			}

			if (var4 == 38) {
				var6 = this.field3242[var3];
				if (var6 == 16384) {
					this.field3265[var3] = var5 + (this.field3265[var3] & -128);
				}
			}

			if (var4 == 16) {
				this.field3257[var3] = (var5 << 7) + (this.field3257[var3] & -16257);
			}

			if (var4 == 48) {
				this.field3257[var3] = var5 + (this.field3257[var3] & -128);
			}

			if (var4 == 81) {
				if (var5 >= 64) {
					var10000 = this.field3247;
					var10000[var3] |= 4;
				} else {
					this.method5101(var3);
					var10000 = this.field3247;
					var10000[var3] &= -5;
				}
			}

			if (var4 == 17) {
				this.method5138(var3, (var5 << 7) + (this.field3261[var3] & -16257));
			}

			if (var4 == 49) {
				this.method5138(var3, var5 + (this.field3261[var3] & -128));
			}

		} else if (var2 == 192) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method5089(var3, var4 + this.field3250[var3]);
		} else if (var2 == 208) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method5087(var3, var4);
		} else if (var2 == 224) {
			var3 = var1 & 15;
			var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
			this.method5095(var3, var4);
		} else {
			var2 = var1 & 255;
			if (var2 == 255) {
				this.method5099();
			}
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "205692091"
	)
	void method5138(int var1, int var2) {
		this.field3261[var1] = var2;
		this.field3259[var1] = (int)(2097152.0D * Math.pow(2.0D, (double)var2 * 5.4931640625E-4D) + 0.5D);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lji;I)I",
		garbageValue = "853798741"
	)
	int method5141(MusicPatchNode var1) {
		int var2 = (var1.field3302 * var1.field3309 >> 12) + var1.field3310;
		var2 += (this.field3251[var1.field3308] - 8192) * this.field3265[var1.field3308] >> 12;
		MusicPatchNode2 var3 = var1.field3306;
		int var4;
		if (var3.field3229 > 0 && (var3.field3228 > 0 || this.field3252[var1.field3308] > 0)) {
			var4 = var3.field3228 << 2;
			int var5 = var3.field3222 << 1;
			if (var1.field3318 < var5) {
				var4 = var4 * var1.field3318 / var5;
			}

			var4 += this.field3252[var1.field3308] >> 7;
			double var6 = Math.sin((double)(var1.field3304 & 511) * 0.01227184630308513D);
			var2 += (int)((double)var4 * var6);
		}

		var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0D, (double)var2 * 3.255208333333333E-4D) / (double)PcmPlayer.field300 + 0.5D);
		return var4 < 1 ? 1 : var4;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lji;I)I",
		garbageValue = "-1655765523"
	)
	int method5105(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field3306;
		int var3 = this.field3269[var1.field3308] * this.field3245[var1.field3308] + 4096 >> 13;
		var3 = var3 * var3 + 16384 >> 15;
		var3 = var3 * var1.field3311 + 16384 >> 15;
		var3 = var3 * this.field3243 + 128 >> 8;
		if (var2.field3226 > 0) {
			var3 = (int)((double)var3 * Math.pow(0.5D, 1.953125E-5D * (double)0 * (double)var2.field3226) + 0.5D);
		}

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field3232 != null) {
			var4 = var1.field3314;
			var5 = var2.field3232[var1.field3315 * 2 + 1];
			if (var1.field3315 * 2 < var2.field3232.length - 2) {
				var6 = (var2.field3232[var1.field3315 * 2] & 255) << 8;
				var7 = (var2.field3232[var1.field3315 * 2 + 2] & 255) << 8;
				var5 += (var2.field3232[var1.field3315 * 2 + 3] - var5) * (var4 - var6) / (var7 - var6);
			}

			var3 = var3 * var5 + 32 >> 6;
		}

		if (var1.field3316 > 0 && var2.field3223 != null) {
			var4 = var1.field3316;
			var5 = var2.field3223[var1.field3317 * 4 + 1];
			if (var1.field3317 * 4 < var2.field3223.length - 2) {
				var6 = (var2.field3223[var1.field3317 * 4] & 255) << 8;
				var7 = (var2.field3223[var1.field3317 * 4 + 2] & 255) << 8;
				var5 += (var4 - var6) * (var2.field3223[var1.field3317 * 4 + 3] - var5) / (var7 - var6);
			}

			var3 = var5 * var3 + 32 >> 6;
		}

		return var3;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lji;I)I",
		garbageValue = "-1374034074"
	)
	int method5106(MusicPatchNode var1) {
		int var2 = this.field3246[var1.field3308];
		return var2 < 8192 ? var2 * var1.field3312 + 32 >> 6 : 16384 - ((128 - var1.field3312) * (16384 - var2) + 32 >> 6);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-37"
	)
	void method5112() {
		int var1 = this.track;
		int var2 = this.trackLength;

		long var3;
		for (var3 = this.field3267; var2 == this.trackLength; var3 = this.midiFile.method5227(var2)) {
			while (var2 == this.midiFile.trackLengths[var1]) {
				this.midiFile.gotoTrack(var1);
				int var5 = this.midiFile.readMessage(var1);
				if (var5 == 1) {
					this.midiFile.setTrackDone();
					this.midiFile.markTrackPosition(var1);
					if (this.midiFile.isDone()) {
						if (!this.field3263 || var2 == 0) {
							this.method5099();
							this.midiFile.clear();
							return;
						}

						this.midiFile.reset(var3);
					}
					break;
				}

				if ((var5 & 128) != 0) {
					this.method5102(var5);
				}

				this.midiFile.readTrackLength(var1);
				this.midiFile.markTrackPosition(var1);
			}

			var1 = this.midiFile.getPrioritizedTrack();
			var2 = this.midiFile.trackLengths[var1];
		}

		this.track = var1;
		this.trackLength = var2;
		this.field3267 = var3;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lji;I)Z",
		garbageValue = "-1708353778"
	)
	boolean method5113(MusicPatchNode var1) {
		if (var1.stream == null) {
			if (var1.field3316 >= 0) {
				var1.remove();
				if (var1.field3319 > 0 && var1 == this.field3255[var1.field3308][var1.field3319]) {
					this.field3255[var1.field3308][var1.field3319] = null;
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lji;[IIII)Z",
		garbageValue = "-2129548616"
	)
	boolean method5114(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field3321 = PcmPlayer.field300 / 100;
		if (var1.field3316 < 0 || var1.stream != null && !var1.stream.method815()) {
			int var5 = var1.field3302;
			if (var5 > 0) {
				var5 -= (int)(16.0D * Math.pow(2.0D, (double)this.field3253[var1.field3308] * 4.921259842519685E-4D) + 0.5D);
				if (var5 < 0) {
					var5 = 0;
				}

				var1.field3302 = var5;
			}

			var1.stream.method813(this.method5141(var1));
			MusicPatchNode2 var6 = var1.field3306;
			boolean var7 = false;
			++var1.field3318;
			var1.field3304 += var6.field3229;
			double var8 = 5.086263020833333E-6D * (double)((var1.field3307 - 60 << 8) + (var1.field3309 * var1.field3302 >> 12));
			if (var6.field3226 > 0) {
				if (var6.field3227 > 0) {
					var1.field3313 = 0 + (int)(128.0D * Math.pow(2.0D, (double)var6.field3227 * var8) + 0.5D) * -780648448;
				} else {
					var1.field3313 = 0 + -1138753536;
				}
			}

			if (var6.field3232 != null) {
				if (var6.field3225 > 0) {
					var1.field3314 += (int)(128.0D * Math.pow(2.0D, (double)var6.field3225 * var8) + 0.5D);
				} else {
					var1.field3314 += 128;
				}

				while (var1.field3315 * 2 < var6.field3232.length - 2 && var1.field3314 > (var6.field3232[var1.field3315 * 2 + 2] & 255) << 8) {
					var1.field3315 = var1.field3315 * 4 + 4;
				}

				if (var1.field3315 * 2 == var6.field3232.length - 2 && var6.field3232[var1.field3315 * 2 + 1] == 0) {
					var7 = true;
				}
			}

			if (var1.field3316 >= 0 && var6.field3223 != null && (this.field3247[var1.field3308] & 1) == 0 && (var1.field3319 < 0 || var1 != this.field3255[var1.field3308][var1.field3319])) {
				if (var6.field3224 > 0) {
					var1.field3316 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field3224) + 0.5D);
				} else {
					var1.field3316 += 128;
				}

				while (var1.field3317 * 4 < var6.field3223.length - 2 && var1.field3316 > (var6.field3223[var1.field3317 * 4 + 2] & 255) << 8) {
					var1.field3317 = var1.field3317 * 4 + 2;
				}

				if (var1.field3317 * 4 == var6.field3223.length - 2) {
					var7 = true;
				}
			}

			if (var7) {
				var1.stream.method812(var1.field3321);
				if (var2 != null) {
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4);
				}

				if (var1.stream.method935()) {
					this.patchStream.mixer.addSubStream(var1.stream);
				}

				var1.method5316();
				if (var1.field3316 >= 0) {
					var1.remove();
					if (var1.field3319 > 0 && var1 == this.field3255[var1.field3308][var1.field3319]) {
						this.field3255[var1.field3308][var1.field3319] = null;
					}
				}

				return true;
			} else {
				var1.stream.method799(var1.field3321, this.method5105(var1), this.method5106(var1));
				return false;
			}
		} else {
			var1.method5316();
			var1.remove();
			if (var1.field3319 > 0 && var1 == this.field3255[var1.field3308][var1.field3319]) {
				this.field3255[var1.field3308][var1.field3319] = null;
			}

			return true;
		}
	}
}
