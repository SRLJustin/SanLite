import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("os")
@Implements("Node")
public class Node {
	@ObfuscatedName("gh")
	@Export("key")
	public long key;
	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "Los;"
	)
	@Export("previous")
	public Node previous;
	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "Los;"
	)
	@Export("next")
	public Node next;

	@ObfuscatedName("fv")
	@Export("remove")
	public void remove() {
		if (this.next != null) {
			this.next.previous = this.previous;
			this.previous.next = this.next;
			this.previous = null;
			this.next = null;
		}
	}

	@ObfuscatedName("ff")
	@Export("hasNext")
	public boolean hasNext() {
		return this.next != null;
	}
}
