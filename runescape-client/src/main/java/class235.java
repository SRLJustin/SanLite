import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ir")
public class class235 {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		garbageValue = "-1015609755",
		signature = "(Lig;Lig;I)V"
	)
	public static void method4331(AbstractArchive var0, AbstractArchive var1) {
		KitDefinition.KitDefinition_archive = var0;
		KitDefinition.KitDefinition_modelsArchive = var1;
		KitDefinition.KitDefinition_fileCount = KitDefinition.KitDefinition_archive.getGroupFileCount(3);
	}
}
