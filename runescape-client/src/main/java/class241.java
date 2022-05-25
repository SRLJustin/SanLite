import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ih")
public class class241 {
	@ObfuscatedName("hj")
	@Export("regions")
	static int[] regions;

	@ObfuscatedName("o")
	public static final void method4815(long var0) {
		if (var0 > 0L) {
			if (var0 % 10L == 0L) {
				long var2 = var0 - 1L;

				try {
					Thread.sleep(var2);
				} catch (InterruptedException var8) {
				}

				try {
					Thread.sleep(1L);
				} catch (InterruptedException var7) {
				}
			} else {
				try {
					Thread.sleep(var0);
				} catch (InterruptedException var6) {
				}
			}

		}
	}

	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-973583928"
	)
	static final void method4813(int var0, int var1) {
		if (var0 < 128) {
			var0 = 128;
		}

		if (var0 > 383) {
			var0 = 383;
		}

		if (GameEngine.cameraPitch < var0) {
			GameEngine.cameraPitch = (var0 - GameEngine.cameraPitch) * PacketBufferNode.field3083 / 1000 + GameEngine.cameraPitch + class17.field88;
			if (GameEngine.cameraPitch > var0) {
				GameEngine.cameraPitch = var0;
			}
		}

		if (GameEngine.cameraPitch > var0) {
			GameEngine.cameraPitch -= (GameEngine.cameraPitch - var0) * PacketBufferNode.field3083 / 1000 + class17.field88;
			if (GameEngine.cameraPitch < var0) {
				GameEngine.cameraPitch = var0;
			}
		}

		int var2 = var1 - StudioGame.cameraYaw;
		if (var2 > 1024) {
			var2 -= 2048;
		}

		if (var2 < -1024) {
			var2 += 2048;
		}

		if (var2 > 0) {
			StudioGame.cameraYaw = StudioGame.cameraYaw + class17.field88 + var2 * PacketBufferNode.field3083 / 1000;
			StudioGame.cameraYaw &= 2047;
		}

		if (var2 < 0) {
			StudioGame.cameraYaw -= class17.field88 + -var2 * PacketBufferNode.field3083 / 1000;
			StudioGame.cameraYaw &= 2047;
		}

		int var3 = var1 - StudioGame.cameraYaw;
		if (var3 > 1024) {
			var3 -= 2048;
		}

		if (var3 < -1024) {
			var3 += 2048;
		}

		if (var3 < 0 && var2 > 0 || var3 > 0 && var2 < 0) {
			StudioGame.cameraYaw = var1;
		}

	}

	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Lck;",
		garbageValue = "52"
	)
	static final InterfaceParent method4812(int var0, int var1, int var2) {
		InterfaceParent var3 = new InterfaceParent();
		var3.group = var1;
		var3.type = var2;
		Client.interfaceParents.put(var3, (long)var0);
		GraphicsDefaults.Widget_resetModelFrames(var1);
		Widget var4 = class92.getWidget(var0);
		GrandExchangeOfferTotalQuantityComparator.method5781(var4);
		if (Client.meslayerContinueWidget != null) {
			GrandExchangeOfferTotalQuantityComparator.method5781(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}

		UserComparator8.revalidateWidgetScroll(NetSocket.Widget_interfaceComponents[var0 >> 16], var4, false);
		AbstractWorldMapData.runWidgetOnLoadListener(var1);
		if (Client.rootInterface != -1) {
			WorldMapLabelSize.runIntfCloseListeners(Client.rootInterface, 1);
		}

		return var3;
	}
}
