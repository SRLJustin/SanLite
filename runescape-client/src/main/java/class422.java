import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pw")
public class class422 implements class421 {
	@ObfuscatedName("o")
	Map field4606;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lqo;"
	)
	final class446 field4607;

	@ObfuscatedSignature(
		descriptor = "(Lqo;)V"
	)
	public class422(class446 var1) {
		this.field4607 = var1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "41"
	)
	public int vmethod7293(int var1) {
		if (this.field4606 != null) {
			class447 var2 = (class447)this.field4606.get(var1);
			if (var2 != null) {
				return (Integer)var2.field4742;
			}
		}

		return (Integer)this.field4607.vmethod7814(var1);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;B)V",
		garbageValue = "113"
	)
	public void vmethod7295(int var1, Object var2) {
		if (this.field4606 == null) {
			this.field4606 = new HashMap();
			this.field4606.put(var1, new class447(var1, var2));
		} else {
			class447 var3 = (class447)this.field4606.get(var1);
			if (var3 == null) {
				this.field4606.put(var1, new class447(var1, var2));
			} else {
				var3.field4742 = var2;
			}
		}

	}

	public Iterator iterator() {
		return this.field4606 == null ? Collections.emptyList().iterator() : this.field4606.values().iterator();
	}

	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-2021735109"
	)
	static final void method7303(int var0, int var1, int var2) {
		if (class343.cameraX < var0) {
			class343.cameraX = (var0 - class343.cameraX) * HitSplatDefinition.field2077 / 1000 + class343.cameraX + class229.field2805;
			if (class343.cameraX > var0) {
				class343.cameraX = var0;
			}
		}

		if (class343.cameraX > var0) {
			class343.cameraX -= (class343.cameraX - var0) * HitSplatDefinition.field2077 / 1000 + class229.field2805;
			if (class343.cameraX < var0) {
				class343.cameraX = var0;
			}
		}

		if (class295.cameraY < var1) {
			class295.cameraY = (var1 - class295.cameraY) * HitSplatDefinition.field2077 / 1000 + class295.cameraY + class229.field2805;
			if (class295.cameraY > var1) {
				class295.cameraY = var1;
			}
		}

		if (class295.cameraY > var1) {
			class295.cameraY -= (class295.cameraY - var1) * HitSplatDefinition.field2077 / 1000 + class229.field2805;
			if (class295.cameraY < var1) {
				class295.cameraY = var1;
			}
		}

		if (FaceNormal.cameraZ < var2) {
			FaceNormal.cameraZ = (var2 - FaceNormal.cameraZ) * HitSplatDefinition.field2077 / 1000 + FaceNormal.cameraZ + class229.field2805;
			if (FaceNormal.cameraZ > var2) {
				FaceNormal.cameraZ = var2;
			}
		}

		if (FaceNormal.cameraZ > var2) {
			FaceNormal.cameraZ -= (FaceNormal.cameraZ - var2) * HitSplatDefinition.field2077 / 1000 + class229.field2805;
			if (FaceNormal.cameraZ < var2) {
				FaceNormal.cameraZ = var2;
			}
		}

	}
}
