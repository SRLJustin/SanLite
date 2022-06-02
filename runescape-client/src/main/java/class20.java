import java.io.IOException;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("f")
public class class20 implements Callable {
	@ObfuscatedName("ix")
	@ObfuscatedGetter(
		intValue = -1111023185
	)
	@Export("selectedItemWidget")
	static int selectedItemWidget;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ly;"
	)
	final class10 field106;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lt;"
	)
	final class14 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lt;Ly;)V"
	)
	class20(class14 var1, class10 var2) {
		this.this$0 = var1;
		this.field106 = var2;
	}

	public Object call() throws Exception {
		try {
			while (this.field106.method79()) {
				class241.method4815(10L);
			}
		} catch (IOException var2) {
			return new class21("Error servicing REST query: " + var2.getMessage());
		}

		return this.field106.method82();
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lki;B)I",
		garbageValue = "-14"
	)
	static int method269(Widget var0) {
		if (var0.type != 11) {
			Interpreter.Interpreter_stringStack[class9.Interpreter_stringStackSize - 1] = "";
			return 1;
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize];
			Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var0.method5523(var1);
			return 1;
		}
	}

	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1249445157"
	)
	@Export("addCancelMenuEntry")
	static void addCancelMenuEntry() {
		HealthBar.method2336();
		Client.menuActions[0] = "Cancel";
		Client.menuTargets[0] = "";
		Client.menuOpcodes[0] = 1006;
		Client.menuShiftClick[0] = false;
		Client.menuOptionsCount = 1;
	}
}
