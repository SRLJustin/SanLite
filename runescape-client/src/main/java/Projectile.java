import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bq")
@Implements("Projectile")
public final class Projectile extends Renderable {
	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "[Lqr;"
	)
	@Export("crossSprites")
	static SpritePixels[] crossSprites;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1270230427
	)
	@Export("id")
	int id;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -2041826239
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1745093525
	)
	@Export("sourceX")
	int sourceX;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1313084137
	)
	@Export("sourceY")
	int sourceY;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -771723281
	)
	@Export("sourceZ")
	int sourceZ;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1417687011
	)
	@Export("endHeight")
	int endHeight;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1939828539
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -269487725
	)
	@Export("cycleEnd")
	int cycleEnd;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1305552491
	)
	@Export("slope")
	int slope;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -717216545
	)
	@Export("startHeight")
	int startHeight;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -2047363817
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("c")
	@Export("isMoving")
	boolean isMoving;
	@ObfuscatedName("w")
	@Export("x")
	double x;
	@ObfuscatedName("b")
	@Export("y")
	double y;
	@ObfuscatedName("t")
	@Export("z")
	double z;
	@ObfuscatedName("g")
	@Export("speedX")
	double speedX;
	@ObfuscatedName("x")
	@Export("speedY")
	double speedY;
	@ObfuscatedName("n")
	@Export("speed")
	double speed;
	@ObfuscatedName("e")
	@Export("speedZ")
	double speedZ;
	@ObfuscatedName("h")
	@Export("accelerationZ")
	double accelerationZ;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1944098901
	)
	@Export("yaw")
	int yaw;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 932506569
	)
	@Export("pitch")
	int pitch;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lgq;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 804241453
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1940243561
	)
	@Export("frameCycle")
	int frameCycle;

	Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		this.isMoving = false;
		this.frame = 0;
		this.frameCycle = 0;
		this.id = var1;
		this.plane = var2;
		this.sourceX = var3;
		this.sourceY = var4;
		this.sourceZ = var5;
		this.cycleStart = var6;
		this.cycleEnd = var7;
		this.slope = var8;
		this.startHeight = var9;
		this.targetIndex = var10;
		this.endHeight = var11;
		this.isMoving = false;
		int var12 = class136.SpotAnimationDefinition_get(this.id).sequence;
		if (var12 != -1) {
			this.sequenceDefinition = class114.SequenceDefinition_get(var12);
		} else {
			this.sequenceDefinition = null;
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "253345363"
	)
	@Export("setDestination")
	final void setDestination(int var1, int var2, int var3, int var4) {
		double var5;
		if (!this.isMoving) {
			var5 = (double)(var1 - this.sourceX);
			double var7 = (double)(var2 - this.sourceY);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			this.x = (double)this.startHeight * var5 / var9 + (double)this.sourceX;
			this.y = (double)this.startHeight * var7 / var9 + (double)this.sourceY;
			this.z = (double)this.sourceZ;
		}

		var5 = (double)(this.cycleEnd + 1 - var4);
		this.speedX = ((double)var1 - this.x) / var5;
		this.speedY = ((double)var2 - this.y) / var5;
		this.speed = Math.sqrt(this.speedY * this.speedY + this.speedX * this.speedX);
		if (!this.isMoving) {
			this.speedZ = -this.speed * Math.tan(0.02454369D * (double)this.slope);
		}

		this.accelerationZ = ((double)var3 - this.z - this.speedZ * var5) * 2.0D / (var5 * var5);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Lhv;",
		garbageValue = "-238822980"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = class136.SpotAnimationDefinition_get(this.id);
		Model var2 = var1.getModel(this.frame);
		if (var2 == null) {
			return null;
		} else {
			var2.rotateZ(this.pitch);
			return var2;
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1804737749"
	)
	@Export("advance")
	final void advance(int var1) {
		this.isMoving = true;
		this.x += (double)var1 * this.speedX;
		this.y += (double)var1 * this.speedY;
		this.z += (double)var1 * this.speedZ + (double)var1 * this.accelerationZ * 0.5D * (double)var1;
		this.speedZ += this.accelerationZ * (double)var1;
		this.yaw = (int)(Math.atan2(this.speedX, this.speedY) * 325.949D) + 1024 & 2047;
		this.pitch = (int)(Math.atan2(this.speedZ, this.speed) * 325.949D) & 2047;
		if (this.sequenceDefinition != null) {
			if (!this.sequenceDefinition.method3712()) {
				this.frameCycle += var1;

				while (true) {
					do {
						do {
							if (this.frameCycle <= this.sequenceDefinition.frameLengths[this.frame]) {
								return;
							}

							this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame];
							++this.frame;
						} while(this.frame < this.sequenceDefinition.frameIds.length);

						this.frame -= this.sequenceDefinition.frameCount;
					} while(this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length);

					this.frame = 0;
				}
			} else {
				this.frame += var1;
				int var2 = this.sequenceDefinition.method3729();
				if (this.frame >= var2) {
					this.frame = var2 - this.sequenceDefinition.frameCount;
				}
			}
		}

	}

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIII)V",
		garbageValue = "1000139939"
	)
	@Export("insertMenuItemNoShift")
	public static final void insertMenuItemNoShift(String var0, String var1, int var2, int var3, int var4, int var5) {
		class175.insertMenuItem(var0, var1, var2, var3, var4, var5, false);
	}
}
