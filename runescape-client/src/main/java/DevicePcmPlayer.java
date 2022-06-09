import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ag")
@Implements("DevicePcmPlayer")
public class DevicePcmPlayer extends PcmPlayer {
	@ObfuscatedName("o")
	@Export("format")
	AudioFormat format;
	@ObfuscatedName("q")
	@Export("line")
	SourceDataLine line;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 30092841
	)
	@Export("capacity2")
	int capacity2;
	@ObfuscatedName("k")
	@Export("byteSamples")
	byte[] byteSamples;

	DevicePcmPlayer() {
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-125708948"
	)
	@Export("init")
	protected void init() {
		this.format = new AudioFormat((float)PcmPlayer.field300, 16, ArchiveDiskAction.PcmPlayer_stereo ? 2 : 1, true, false);
		this.byteSamples = new byte[256 << (ArchiveDiskAction.PcmPlayer_stereo ? 2 : 1)];
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-30840"
	)
	@Export("open")
	protected void open(int var1) throws LineUnavailableException {
		try {
			Info var2 = new Info(SourceDataLine.class, this.format, var1 << (ArchiveDiskAction.PcmPlayer_stereo ? 2 : 1));
			this.line = (SourceDataLine)AudioSystem.getLine(var2);
			this.line.open();
			this.line.start();
			this.capacity2 = var1;
		} catch (LineUnavailableException var3) {
			if (VarcInt.method3324(var1) != 1) {
				this.open(FontName.method7228(var1));
			} else {
				this.line = null;
				throw var3;
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "181"
	)
	@Export("position")
	protected int position() {
		return this.capacity2 - (this.line.available() >> (ArchiveDiskAction.PcmPlayer_stereo ? 2 : 1));
	}

	@ObfuscatedName("k")
	@Export("write")
	protected void write() {
		int var1 = 256;
		if (ArchiveDiskAction.PcmPlayer_stereo) {
			var1 <<= 1;
		}

		for (int var2 = 0; var2 < var1; ++var2) {
			int var3 = super.samples[var2];
			if ((var3 + 8388608 & -16777216) != 0) {
				var3 = 8388607 ^ var3 >> 31;
			}

			this.byteSamples[var2 * 2] = (byte)(var3 >> 8);
			this.byteSamples[var2 * 2 + 1] = (byte)(var3 >> 16);
		}

		this.line.write(this.byteSamples, 0, var1 << 1);
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "25"
	)
	@Export("close")
	protected void close() {
		if (this.line != null) {
			this.line.close();
			this.line = null;
		}

	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "207475579"
	)
	@Export("discard")
	protected void discard() {
		this.line.flush();
	}
}
