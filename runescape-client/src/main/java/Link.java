import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nf")
@Implements("Link")
public class Link {
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	@Export("previous")
	public Link previous;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	@Export("next")
	public Link next;

	@ObfuscatedName("c")
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
