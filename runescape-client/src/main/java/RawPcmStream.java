import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ah")
@Implements("RawPcmStream")
public class RawPcmStream extends PcmStream {
	@ObfuscatedName("o")
	int field336;
	@ObfuscatedName("q")
	int field333;
	@ObfuscatedName("l")
	int field339;
	@ObfuscatedName("k")
	int field334;
	@ObfuscatedName("a")
	int field335;
	@ObfuscatedName("m")
	int field337;
	@ObfuscatedName("p")
	int field338;
	@ObfuscatedName("s")
	@Export("numLoops")
	int numLoops;
	@ObfuscatedName("r")
	@Export("start")
	int start;
	@ObfuscatedName("v")
	@Export("end")
	int end;
	@ObfuscatedName("y")
	boolean field342;
	@ObfuscatedName("c")
	int field343;
	@ObfuscatedName("b")
	int field332;
	@ObfuscatedName("t")
	int field345;
	@ObfuscatedName("g")
	int field346;

	@ObfuscatedSignature(
		descriptor = "(Lak;III)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3, int var4) {
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field342 = var1.field266;
		this.field333 = var2;
		this.field339 = var3;
		this.field334 = var4;
		this.field336 = 0;
		this.method800();
	}

	@ObfuscatedSignature(
		descriptor = "(Lak;II)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3) {
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field342 = var1.field266;
		this.field333 = var2;
		this.field339 = var3;
		this.field334 = 8192;
		this.field336 = 0;
		this.method800();
	}

	@ObfuscatedName("a")
	void method800() {
		this.field335 = this.field339;
		this.field337 = method827(this.field339, this.field334);
		this.field338 = method925(this.field339, this.field334);
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "()Lao;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return null;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "()Lao;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("s")
	protected int vmethod5295() {
		return this.field339 == 0 && this.field343 == 0 ? 0 : 1;
	}

	@ObfuscatedName("r")
	@Export("fill")
	public synchronized void fill(int[] var1, int var2, int var3) {
		if (this.field339 == 0 && this.field343 == 0) {
			this.skip(var3);
		} else {
			RawSound var4 = (RawSound)super.sound;
			int var5 = this.start << 8;
			int var6 = this.end << 8;
			int var7 = var4.samples.length << 8;
			int var8 = var6 - var5;
			if (var8 <= 0) {
				this.numLoops = 0;
			}

			int var9 = var2;
			var3 += var2;
			if (this.field336 < 0) {
				if (this.field333 <= 0) {
					this.method809();
					this.remove();
					return;
				}

				this.field336 = 0;
			}

			if (this.field336 >= var7) {
				if (this.field333 >= 0) {
					this.method809();
					this.remove();
					return;
				}

				this.field336 = var7 - 1;
			}

			if (this.numLoops < 0) {
				if (this.field342) {
					if (this.field333 < 0) {
						var9 = this.method934(var1, var2, var5, var3, var4.samples[this.start]);
						if (this.field336 >= var5) {
							return;
						}

						this.field336 = var5 + var5 - 1 - this.field336;
						this.field333 = -this.field333;
					}

					while (true) {
						var9 = this.method822(var1, var9, var6, var3, var4.samples[this.end - 1]);
						if (this.field336 < var6) {
							return;
						}

						this.field336 = var6 + var6 - 1 - this.field336;
						this.field333 = -this.field333;
						var9 = this.method934(var1, var9, var5, var3, var4.samples[this.start]);
						if (this.field336 >= var5) {
							return;
						}

						this.field336 = var5 + var5 - 1 - this.field336;
						this.field333 = -this.field333;
					}
				} else if (this.field333 < 0) {
					while (true) {
						var9 = this.method934(var1, var9, var5, var3, var4.samples[this.end - 1]);
						if (this.field336 >= var5) {
							return;
						}

						this.field336 = var6 - 1 - (var6 - 1 - this.field336) % var8;
					}
				} else {
					while (true) {
						var9 = this.method822(var1, var9, var6, var3, var4.samples[this.start]);
						if (this.field336 < var6) {
							return;
						}

						this.field336 = var5 + (this.field336 - var5) % var8;
					}
				}
			} else {
				if (this.numLoops > 0) {
					if (this.field342) {
						label127: {
							if (this.field333 < 0) {
								var9 = this.method934(var1, var2, var5, var3, var4.samples[this.start]);
								if (this.field336 >= var5) {
									return;
								}

								this.field336 = var5 + var5 - 1 - this.field336;
								this.field333 = -this.field333;
								if (--this.numLoops == 0) {
									break label127;
								}
							}

							do {
								var9 = this.method822(var1, var9, var6, var3, var4.samples[this.end - 1]);
								if (this.field336 < var6) {
									return;
								}

								this.field336 = var6 + var6 - 1 - this.field336;
								this.field333 = -this.field333;
								if (--this.numLoops == 0) {
									break;
								}

								var9 = this.method934(var1, var9, var5, var3, var4.samples[this.start]);
								if (this.field336 >= var5) {
									return;
								}

								this.field336 = var5 + var5 - 1 - this.field336;
								this.field333 = -this.field333;
							} while(--this.numLoops != 0);
						}
					} else {
						int var10;
						if (this.field333 < 0) {
							while (true) {
								var9 = this.method934(var1, var9, var5, var3, var4.samples[this.end - 1]);
								if (this.field336 >= var5) {
									return;
								}

								var10 = (var6 - 1 - this.field336) / var8;
								if (var10 >= this.numLoops) {
									this.field336 += var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}

								this.field336 += var8 * var10;
								this.numLoops -= var10;
							}
						} else {
							while (true) {
								var9 = this.method822(var1, var9, var6, var3, var4.samples[this.start]);
								if (this.field336 < var6) {
									return;
								}

								var10 = (this.field336 - var5) / var8;
								if (var10 >= this.numLoops) {
									this.field336 -= var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}

								this.field336 -= var8 * var10;
								this.numLoops -= var10;
							}
						}
					}
				}

				if (this.field333 < 0) {
					this.method934(var1, var9, 0, var3, 0);
					if (this.field336 < 0) {
						this.field336 = -1;
						this.method809();
						this.remove();
					}
				} else {
					this.method822(var1, var9, var7, var3, 0);
					if (this.field336 >= var7) {
						this.field336 = var7;
						this.method809();
						this.remove();
					}
				}

			}
		}
	}

	@ObfuscatedName("v")
	@Export("setNumLoops")
	public synchronized void setNumLoops(int var1) {
		this.numLoops = var1;
	}

	@ObfuscatedName("y")
	@Export("skip")
	public synchronized void skip(int var1) {
		if (this.field343 > 0) {
			if (var1 >= this.field343) {
				if (this.field339 == Integer.MIN_VALUE) {
					this.field339 = 0;
					this.field338 = 0;
					this.field337 = 0;
					this.field335 = 0;
					this.remove();
					var1 = this.field343;
				}

				this.field343 = 0;
				this.method800();
			} else {
				this.field335 += this.field332 * var1;
				this.field337 += this.field345 * var1;
				this.field338 += this.field346 * var1;
				this.field343 -= var1;
			}
		}

		RawSound var2 = (RawSound)super.sound;
		int var3 = this.start << 8;
		int var4 = this.end << 8;
		int var5 = var2.samples.length << 8;
		int var6 = var4 - var3;
		if (var6 <= 0) {
			this.numLoops = 0;
		}

		if (this.field336 < 0) {
			if (this.field333 <= 0) {
				this.method809();
				this.remove();
				return;
			}

			this.field336 = 0;
		}

		if (this.field336 >= var5) {
			if (this.field333 >= 0) {
				this.method809();
				this.remove();
				return;
			}

			this.field336 = var5 - 1;
		}

		this.field336 += this.field333 * var1;
		if (this.numLoops < 0) {
			if (!this.field342) {
				if (this.field333 < 0) {
					if (this.field336 >= var3) {
						return;
					}

					this.field336 = var4 - 1 - (var4 - 1 - this.field336) % var6;
				} else {
					if (this.field336 < var4) {
						return;
					}

					this.field336 = var3 + (this.field336 - var3) % var6;
				}

			} else {
				if (this.field333 < 0) {
					if (this.field336 >= var3) {
						return;
					}

					this.field336 = var3 + var3 - 1 - this.field336;
					this.field333 = -this.field333;
				}

				while (this.field336 >= var4) {
					this.field336 = var4 + var4 - 1 - this.field336;
					this.field333 = -this.field333;
					if (this.field336 >= var3) {
						return;
					}

					this.field336 = var3 + var3 - 1 - this.field336;
					this.field333 = -this.field333;
				}

			}
		} else {
			if (this.numLoops > 0) {
				if (this.field342) {
					label129: {
						if (this.field333 < 0) {
							if (this.field336 >= var3) {
								return;
							}

							this.field336 = var3 + var3 - 1 - this.field336;
							this.field333 = -this.field333;
							if (--this.numLoops == 0) {
								break label129;
							}
						}

						do {
							if (this.field336 < var4) {
								return;
							}

							this.field336 = var4 + var4 - 1 - this.field336;
							this.field333 = -this.field333;
							if (--this.numLoops == 0) {
								break;
							}

							if (this.field336 >= var3) {
								return;
							}

							this.field336 = var3 + var3 - 1 - this.field336;
							this.field333 = -this.field333;
						} while(--this.numLoops != 0);
					}
				} else {
					label161: {
						int var7;
						if (this.field333 < 0) {
							if (this.field336 >= var3) {
								return;
							}

							var7 = (var4 - 1 - this.field336) / var6;
							if (var7 >= this.numLoops) {
								this.field336 += var6 * this.numLoops;
								this.numLoops = 0;
								break label161;
							}

							this.field336 += var6 * var7;
							this.numLoops -= var7;
						} else {
							if (this.field336 < var4) {
								return;
							}

							var7 = (this.field336 - var3) / var6;
							if (var7 >= this.numLoops) {
								this.field336 -= var6 * this.numLoops;
								this.numLoops = 0;
								break label161;
							}

							this.field336 -= var6 * var7;
							this.numLoops -= var7;
						}

						return;
					}
				}
			}

			if (this.field333 < 0) {
				if (this.field336 < 0) {
					this.field336 = -1;
					this.method809();
					this.remove();
				}
			} else if (this.field336 >= var5) {
				this.field336 = var5;
				this.method809();
				this.remove();
			}

		}
	}

	@ObfuscatedName("c")
	public synchronized void method802(int var1) {
		this.method804(var1 << 6, this.method806());
	}

	@ObfuscatedName("w")
	synchronized void method803(int var1) {
		this.method804(var1, this.method806());
	}

	@ObfuscatedName("b")
	synchronized void method804(int var1, int var2) {
		this.field339 = var1;
		this.field334 = var2;
		this.field343 = 0;
		this.method800();
	}

	@ObfuscatedName("t")
	public synchronized int method805() {
		return this.field339 == Integer.MIN_VALUE ? 0 : this.field339;
	}

	@ObfuscatedName("g")
	public synchronized int method806() {
		return this.field334 < 0 ? -1 : this.field334;
	}

	@ObfuscatedName("x")
	public synchronized void method807(int var1) {
		int var2 = ((RawSound)super.sound).samples.length << 8;
		if (var1 < -1) {
			var1 = -1;
		}

		if (var1 > var2) {
			var1 = var2;
		}

		this.field336 = var1;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Z)V",
		garbageValue = "1"
	)
	public synchronized void method811() {
		this.field333 = (this.field333 ^ this.field333 >> 31) + (this.field333 >>> 31);
		this.field333 = -this.field333;
	}

	@ObfuscatedName("e")
	void method809() {
		if (this.field343 != 0) {
			if (this.field339 == Integer.MIN_VALUE) {
				this.field339 = 0;
			}

			this.field343 = 0;
			this.method800();
		}

	}

	@ObfuscatedName("h")
	public synchronized void method810(int var1, int var2) {
		this.method799(var1, var2, this.method806());
	}

	@ObfuscatedName("f")
	public synchronized void method799(int var1, int var2, int var3) {
		if (var1 == 0) {
			this.method804(var2, var3);
		} else {
			int var4 = method827(var2, var3);
			int var5 = method925(var2, var3);
			if (var4 == this.field337 && var5 == this.field338) {
				this.field343 = 0;
			} else {
				int var6 = var2 - this.field335;
				if (this.field335 - var2 > var6) {
					var6 = this.field335 - var2;
				}

				if (var4 - this.field337 > var6) {
					var6 = var4 - this.field337;
				}

				if (this.field337 - var4 > var6) {
					var6 = this.field337 - var4;
				}

				if (var5 - this.field338 > var6) {
					var6 = var5 - this.field338;
				}

				if (this.field338 - var5 > var6) {
					var6 = this.field338 - var5;
				}

				if (var1 > var6) {
					var1 = var6;
				}

				this.field343 = var1;
				this.field339 = var2;
				this.field334 = var3;
				this.field332 = (var2 - this.field335) / var1;
				this.field345 = (var4 - this.field337) / var1;
				this.field346 = (var5 - this.field338) / var1;
			}
		}
	}

	@ObfuscatedName("d")
	public synchronized void method812(int var1) {
		if (var1 == 0) {
			this.method803(0);
			this.remove();
		} else if (this.field337 == 0 && this.field338 == 0) {
			this.field343 = 0;
			this.field339 = 0;
			this.field335 = 0;
			this.remove();
		} else {
			int var2 = -this.field335;
			if (this.field335 > var2) {
				var2 = this.field335;
			}

			if (-this.field337 > var2) {
				var2 = -this.field337;
			}

			if (this.field337 > var2) {
				var2 = this.field337;
			}

			if (-this.field338 > var2) {
				var2 = -this.field338;
			}

			if (this.field338 > var2) {
				var2 = this.field338;
			}

			if (var1 > var2) {
				var1 = var2;
			}

			this.field343 = var1;
			this.field339 = Integer.MIN_VALUE;
			this.field332 = -this.field335 / var1;
			this.field345 = -this.field337 / var1;
			this.field346 = -this.field338 / var1;
		}
	}

	@ObfuscatedName("j")
	public synchronized void method813(int var1) {
		if (this.field333 < 0) {
			this.field333 = -var1;
		} else {
			this.field333 = var1;
		}

	}

	@ObfuscatedName("z")
	public synchronized int method884() {
		return this.field333 < 0 ? -this.field333 : this.field333;
	}

	@ObfuscatedName("ab")
	public boolean method815() {
		return this.field336 < 0 || this.field336 >= ((RawSound)super.sound).samples.length << 8;
	}

	@ObfuscatedName("aj")
	public boolean method935() {
		return this.field343 != 0;
	}

	@ObfuscatedName("as")
	int method822(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field343 > 0) {
				int var6 = var2 + this.field343;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field343 += var2;
				if (this.field333 == 256 && (this.field336 & 255) == 0) {
					if (ArchiveDiskAction.PcmPlayer_stereo) {
						var2 = method888(0, ((RawSound)super.sound).samples, var1, this.field336, var2, this.field337, this.field338, this.field345, this.field346, 0, var6, var3, this);
					} else {
						var2 = method833(((RawSound)super.sound).samples, var1, this.field336, var2, this.field335, this.field332, 0, var6, var3, this);
					}
				} else if (ArchiveDiskAction.PcmPlayer_stereo) {
					var2 = method838(0, 0, ((RawSound)super.sound).samples, var1, this.field336, var2, this.field337, this.field338, this.field345, this.field346, 0, var6, var3, this, this.field333, var5);
				} else {
					var2 = method837(0, 0, ((RawSound)super.sound).samples, var1, this.field336, var2, this.field335, this.field332, 0, var6, var3, this, this.field333, var5);
				}

				this.field343 -= var2;
				if (this.field343 != 0) {
					return var2;
				}

				if (!this.method824()) {
					continue;
				}

				return var4;
			}

			if (this.field333 == 256 && (this.field336 & 255) == 0) {
				if (ArchiveDiskAction.PcmPlayer_stereo) {
					return method826(0, ((RawSound)super.sound).samples, var1, this.field336, var2, this.field337, this.field338, 0, var4, var3, this);
				}

				return method853(((RawSound)super.sound).samples, var1, this.field336, var2, this.field335, 0, var4, var3, this);
			}

			if (ArchiveDiskAction.PcmPlayer_stereo) {
				return method928(0, 0, ((RawSound)super.sound).samples, var1, this.field336, var2, this.field337, this.field338, 0, var4, var3, this, this.field333, var5);
			}

			return method936(0, 0, ((RawSound)super.sound).samples, var1, this.field336, var2, this.field335, 0, var4, var3, this, this.field333, var5);
		}
	}

	@ObfuscatedName("au")
	int method934(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field343 > 0) {
				int var6 = var2 + this.field343;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field343 += var2;
				if (this.field333 == -256 && (this.field336 & 255) == 0) {
					if (ArchiveDiskAction.PcmPlayer_stereo) {
						var2 = method863(0, ((RawSound)super.sound).samples, var1, this.field336, var2, this.field337, this.field338, this.field345, this.field346, 0, var6, var3, this);
					} else {
						var2 = method916(((RawSound)super.sound).samples, var1, this.field336, var2, this.field335, this.field332, 0, var6, var3, this);
					}
				} else if (ArchiveDiskAction.PcmPlayer_stereo) {
					var2 = method840(0, 0, ((RawSound)super.sound).samples, var1, this.field336, var2, this.field337, this.field338, this.field345, this.field346, 0, var6, var3, this, this.field333, var5);
				} else {
					var2 = method839(0, 0, ((RawSound)super.sound).samples, var1, this.field336, var2, this.field335, this.field332, 0, var6, var3, this, this.field333, var5);
				}

				this.field343 -= var2;
				if (this.field343 != 0) {
					return var2;
				}

				if (!this.method824()) {
					continue;
				}

				return var4;
			}

			if (this.field333 == -256 && (this.field336 & 255) == 0) {
				if (ArchiveDiskAction.PcmPlayer_stereo) {
					return method828(0, ((RawSound)super.sound).samples, var1, this.field336, var2, this.field337, this.field338, 0, var4, var3, this);
				}

				return method865(((RawSound)super.sound).samples, var1, this.field336, var2, this.field335, 0, var4, var3, this);
			}

			if (ArchiveDiskAction.PcmPlayer_stereo) {
				return method832(0, 0, ((RawSound)super.sound).samples, var1, this.field336, var2, this.field337, this.field338, 0, var4, var3, this, this.field333, var5);
			}

			return method831(0, 0, ((RawSound)super.sound).samples, var1, this.field336, var2, this.field335, 0, var4, var3, this, this.field333, var5);
		}
	}

	@ObfuscatedName("al")
	int vmethod951() {
		int var1 = this.field335 * 3 >> 6;
		var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
		if (this.numLoops == 0) {
			var1 -= var1 * this.field336 / (((RawSound)super.sound).samples.length << 8);
		} else if (this.numLoops >= 0) {
			var1 -= var1 * this.start / ((RawSound)super.sound).samples.length;
		}

		return var1 > 255 ? 255 : var1;
	}

	@ObfuscatedName("aq")
	boolean method824() {
		int var1 = this.field339;
		int var2;
		int var3;
		if (var1 == Integer.MIN_VALUE) {
			var3 = 0;
			var2 = 0;
			var1 = 0;
		} else {
			var2 = method827(var1, this.field334);
			var3 = method925(var1, this.field334);
		}

		if (var1 == this.field335 && var2 == this.field337 && var3 == this.field338) {
			if (this.field339 == Integer.MIN_VALUE) {
				this.field339 = 0;
				this.field338 = 0;
				this.field337 = 0;
				this.field335 = 0;
				this.remove();
				return true;
			} else {
				this.method800();
				return false;
			}
		} else {
			if (this.field335 < var1) {
				this.field332 = 1;
				this.field343 = var1 - this.field335;
			} else if (this.field335 > var1) {
				this.field332 = -1;
				this.field343 = this.field335 - var1;
			} else {
				this.field332 = 0;
			}

			if (this.field337 < var2) {
				this.field345 = 1;
				if (this.field343 == 0 || this.field343 > var2 - this.field337) {
					this.field343 = var2 - this.field337;
				}
			} else if (this.field337 > var2) {
				this.field345 = -1;
				if (this.field343 == 0 || this.field343 > this.field337 - var2) {
					this.field343 = this.field337 - var2;
				}
			} else {
				this.field345 = 0;
			}

			if (this.field338 < var3) {
				this.field346 = 1;
				if (this.field343 == 0 || this.field343 > var3 - this.field338) {
					this.field343 = var3 - this.field338;
				}
			} else if (this.field338 > var3) {
				this.field346 = -1;
				if (this.field343 == 0 || this.field343 > this.field338 - var3) {
					this.field343 = this.field338 - var3;
				}
			} else {
				this.field346 = 0;
			}

			return false;
		}
	}

	@ObfuscatedName("o")
	static int method827(int var0, int var1) {
		return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("q")
	static int method925(int var0, int var1) {
		return var1 < 0 ? -var0 : (int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lak;II)Lah;"
	)
	@Export("createRawPcmStream")
	public static RawPcmStream createRawPcmStream(RawSound var0, int var1, int var2) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, (int)((long)var0.sampleRate * 256L * (long)var1 / (long)(PcmPlayer.field300 * 100)), var2 << 6) : null;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lak;III)Lah;"
	)
	public static RawPcmStream method829(RawSound var0, int var1, int var2, int var3) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, var1, var2, var3) : null;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIILah;)I"
	)
	static int method853(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
		var2 >>= 8;
		var7 >>= 8;
		var4 <<= 2;
		if ((var5 = var3 + var7 - var2) > var6) {
			var5 = var6;
		}

		int var10001;
		for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
		}

		for (var5 += 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
			var10001 = var3++;
		}

		var8.field336 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIILah;)I"
	)
	static int method826(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
		var3 >>= 8;
		var9 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		if ((var7 = var4 + var9 - var3) > var8) {
			var7 = var8;
		}

		var4 <<= 1;
		var7 <<= 1;

		int var10001;
		byte var11;
		for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		var10.field336 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIILah;)I"
	)
	static int method865(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
		var2 >>= 8;
		var7 >>= 8;
		var4 <<= 2;
		if ((var5 = var3 + var2 - (var7 - 1)) > var6) {
			var5 = var6;
		}

		int var10001;
		for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
		}

		for (var5 += 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
			var10001 = var3++;
		}

		var8.field336 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIILah;)I"
	)
	static int method828(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
		var3 >>= 8;
		var9 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		if ((var7 = var3 + var4 - (var9 - 1)) > var8) {
			var7 = var8;
		}

		var4 <<= 1;
		var7 <<= 1;

		int var10001;
		byte var11;
		for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		var10.field336 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIILah;II)I"
	)
	static int method936(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
		if (var11 == 0 || (var7 = var5 + (var11 + (var9 - var4) - 257) / var11) > var8) {
			var7 = var8;
		}

		byte var13;
		int var10001;
		while (var5 < var7) {
			var1 = var4 >> 8;
			var13 = var2[var1];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & 255)) * var6 >> 6;
			var4 += var11;
		}

		if (var11 == 0 || (var7 = var5 + (var11 + (var9 - var4) - 1) / var11) > var8) {
			var7 = var8;
		}

		for (var1 = var12; var5 < var7; var4 += var11) {
			var13 = var2[var4 >> 8];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var1 - var13) * (var4 & 255)) * var6 >> 6;
		}

		var10.field336 = var4;
		return var5;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILah;II)I"
	)
	static int method928(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
			var8 = var9;
		}

		var5 <<= 1;

		byte var14;
		int var10001;
		for (var8 <<= 1; var5 < var8; var4 += var12) {
			var1 = var4 >> 8;
			var14 = var2[var1];
			var0 = (var14 << 8) + (var4 & 255) * (var2[var1 + 1] - var14);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) {
			var8 = var9;
		}

		var8 <<= 1;

		for (var1 = var13; var5 < var8; var4 += var12) {
			var14 = var2[var4 >> 8];
			var0 = (var14 << 8) + (var1 - var14) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		var11.field336 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIILah;II)I"
	)
	static int method831(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
		if (var11 == 0 || (var7 = var5 + (var11 + (var9 + 256 - var4)) / var11) > var8) {
			var7 = var8;
		}

		int var10001;
		while (var5 < var7) {
			var1 = var4 >> 8;
			byte var13 = var2[var1 - 1];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var2[var1] - var13) * (var4 & 255)) * var6 >> 6;
			var4 += var11;
		}

		if (var11 == 0 || (var7 = var5 + (var11 + (var9 - var4)) / var11) > var8) {
			var7 = var8;
		}

		var0 = var12;

		for (var1 = var11; var5 < var7; var4 += var1) {
			var10001 = var5++;
			var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
		}

		var10.field336 = var4;
		return var5;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILah;II)I"
	)
	static int method832(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var5 <<= 1;

		int var10001;
		for (var8 <<= 1; var5 < var8; var4 += var12) {
			var1 = var4 >> 8;
			byte var14 = var2[var1 - 1];
			var0 = (var2[var1] - var14) * (var4 & 255) + (var14 << 8);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var8 <<= 1;

		for (var1 = var13; var5 < var8; var4 += var12) {
			var0 = (var1 << 8) + (var4 & 255) * (var2[var4 >> 8] - var1);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		var11.field336 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIIILah;)I"
	)
	static int method833(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var8 - var2) > var7) {
			var6 = var7;
		}

		var9.field337 += var9.field345 * (var6 - var3);
		var9.field338 += var9.field346 * (var6 - var3);

		int var10001;
		for (var6 -= 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
		}

		for (var6 += 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
		}

		var9.field335 = var4 >> 2;
		var9.field336 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIIIILah;)I"
	)
	static int method888(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var11 + var4 - var3) > var10) {
			var9 = var10;
		}

		var12.field335 += var12.field332 * (var9 - var4);
		var4 <<= 1;
		var9 <<= 1;

		byte var13;
		int var10001;
		for (var9 -= 6; var4 < var9; var6 += var8) {
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		for (var9 += 6; var4 < var9; var6 += var8) {
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		var12.field337 = var5 >> 2;
		var12.field338 = var6 >> 2;
		var12.field336 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIIILah;)I"
	)
	static int method916(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
			var6 = var7;
		}

		var9.field337 += var9.field345 * (var6 - var3);
		var9.field338 += var9.field346 * (var6 - var3);

		int var10001;
		for (var6 -= 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
		}

		for (var6 += 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
		}

		var9.field335 = var4 >> 2;
		var9.field336 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIIIILah;)I"
	)
	static int method863(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var3 + var4 - (var11 - 1)) > var10) {
			var9 = var10;
		}

		var12.field335 += var12.field332 * (var9 - var4);
		var4 <<= 1;
		var9 <<= 1;

		byte var13;
		int var10001;
		for (var9 -= 6; var4 < var9; var6 += var8) {
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		for (var9 += 6; var4 < var9; var6 += var8) {
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		var12.field337 = var5 >> 2;
		var12.field338 = var6 >> 2;
		var12.field336 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILah;II)I"
	)
	static int method837(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field337 -= var11.field345 * var5;
		var11.field338 -= var11.field346 * var5;
		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
			var8 = var9;
		}

		byte var14;
		int var10001;
		while (var5 < var8) {
			var1 = var4 >> 8;
			var14 = var2[var1];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
			var4 += var12;
		}

		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
			var8 = var9;
		}

		for (var1 = var13; var5 < var8; var4 += var12) {
			var14 = var2[var4 >> 8];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var1 - var14) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
		}

		var11.field337 += var11.field345 * var5;
		var11.field338 += var11.field346 * var5;
		var11.field335 = var6;
		var11.field336 = var4;
		return var5;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIIIILah;II)I"
	)
	static int method838(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field335 -= var5 * var13.field332;
		if (var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
			var10 = var11;
		}

		var5 <<= 1;

		byte var16;
		int var10001;
		for (var10 <<= 1; var5 < var10; var4 += var14) {
			var1 = var4 >> 8;
			var16 = var2[var1];
			var0 = (var16 << 8) + (var4 & 255) * (var2[var1 + 1] - var16);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
			var10 = var11;
		}

		var10 <<= 1;

		for (var1 = var15; var5 < var10; var4 += var14) {
			var16 = var2[var4 >> 8];
			var0 = (var16 << 8) + (var1 - var16) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		var5 >>= 1;
		var13.field335 += var13.field332 * var5;
		var13.field337 = var6;
		var13.field338 = var7;
		var13.field336 = var4;
		return var5;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILah;II)I"
	)
	static int method839(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field337 -= var11.field345 * var5;
		var11.field338 -= var11.field346 * var5;
		if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		int var10001;
		while (var5 < var8) {
			var1 = var4 >> 8;
			byte var14 = var2[var1 - 1];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var2[var1] - var14) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
			var4 += var12;
		}

		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var0 = var13;

		for (var1 = var12; var5 < var8; var4 += var1) {
			var10001 = var5++;
			var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
		}

		var11.field337 += var11.field345 * var5;
		var11.field338 += var11.field346 * var5;
		var11.field335 = var6;
		var11.field336 = var4;
		return var5;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIIIILah;II)I"
	)
	static int method840(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field335 -= var5 * var13.field332;
		if (var14 == 0 || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) {
			var10 = var11;
		}

		var5 <<= 1;

		int var10001;
		for (var10 <<= 1; var5 < var10; var4 += var14) {
			var1 = var4 >> 8;
			byte var16 = var2[var1 - 1];
			var0 = (var2[var1] - var16) * (var4 & 255) + (var16 << 8);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) {
			var10 = var11;
		}

		var10 <<= 1;

		for (var1 = var15; var5 < var10; var4 += var14) {
			var0 = (var1 << 8) + (var4 & 255) * (var2[var4 >> 8] - var1);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		var5 >>= 1;
		var13.field335 += var13.field332 * var5;
		var13.field337 = var6;
		var13.field338 = var7;
		var13.field336 = var4;
		return var5;
	}
}
