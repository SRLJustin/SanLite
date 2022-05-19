import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("es")
public class class146 extends class128 {
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	@Export("ItemDefinition_fontPlain11")
	public static Font ItemDefinition_fontPlain11;
	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "[Lqr;"
	)
	@Export("mapMarkerSprites")
	static SpritePixels[] mapMarkerSprites;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 51449257
	)
	int field1692;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1435457431
	)
	int field1695;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Leh;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Leh;)V"
	)
	class146(class131 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)V",
		garbageValue = "-611912046"
	)
	void vmethod3040(Buffer var1) {
		this.field1692 = var1.readInt();
		this.field1695 = var1.readInt();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lek;B)V",
		garbageValue = "-73"
	)
	void vmethod3041(ClanSettings var1) {
		var1.method2909(this.field1692, this.field1695);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Lbx;",
		garbageValue = "-280328153"
	)
	@Export("getNextWorldListWorld")
	static World getNextWorldListWorld() {
		return World.World_listCount < World.World_count ? World.World_worlds[++World.World_listCount - 1] : null;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "605367947"
	)
	static final int method2993() {
		return ViewportMouse.ViewportMouse_x;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(II)Lds;",
		garbageValue = "1375495552"
	)
	static class122 method2997(int var0) {
		class122 var1 = (class122)SequenceDefinition.SequenceDefinition_cachedModel.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			var1 = PendingSpawn.method2161(SequenceDefinition.SequenceDefinition_animationsArchive, SequenceDefinition.SequenceDefinition_skeletonsArchive, var0, false);
			if (var1 != null) {
				SequenceDefinition.SequenceDefinition_cachedModel.put(var1, (long)var0);
			}

			return var1;
		}
	}

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "(Lki;B)Lki;",
		garbageValue = "-106"
	)
	static Widget method2992(Widget var0) {
		Widget var2 = var0;
		int var4 = UrlRequester.getWidgetFlags(var0);
		int var3 = var4 >> 17 & 7;
		int var5 = var3;
		Widget var1;
		if (var3 == 0) {
			var1 = null;
		} else {
			int var6 = 0;

			while (true) {
				if (var6 >= var5) {
					var1 = var2;
					break;
				}

				var2 = class92.getWidget(var2.parentId);
				if (var2 == null) {
					var1 = null;
					break;
				}

				++var6;
			}
		}

		Widget var7 = var1;
		if (var1 == null) {
			var7 = var0.parent;
		}

		return var7;
	}
}
