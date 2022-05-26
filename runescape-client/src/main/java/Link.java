import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("og")
@Implements("Link")
public class Link {
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Log;"
	)
	@Export("previous")
	public Link previous;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Log;"
	)
	@Export("next")
	public Link next;

	@ObfuscatedName("o")
	@Export("remove")
	public void remove() {
		if (this.next != null) {
			this.next.previous = this.previous;
			this.previous.next = this.next;
			this.previous = null;
			this.next = null;
		}
	}
}
