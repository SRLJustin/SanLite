import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ll")
@Implements("IterableNodeDequeDescendingIterator")
public class IterableNodeDequeDescendingIterator implements Iterator {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("deque")
	IterableNodeDeque deque;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Los;"
	)
	Node field4144;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Los;"
	)
	@Export("last")
	Node last;

	@ObfuscatedSignature(
		descriptor = "(Llo;)V"
	)
	IterableNodeDequeDescendingIterator(IterableNodeDeque var1) {
		this.last = null;
		this.setDeque(var1);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Llo;)V"
	)
	@Export("setDeque")
	void setDeque(IterableNodeDeque var1) {
		this.deque = var1;
		this.start();
	}

	@ObfuscatedName("q")
	@Export("start")
	void start() {
		this.field4144 = this.deque != null ? this.deque.sentinel.previous : null;
		this.last = null;
	}

	public boolean hasNext() {
		return this.deque.sentinel != this.field4144 && this.field4144 != null;
	}

	public void remove() {
		if (this.last == null) {
			throw new IllegalStateException();
		} else {
			this.last.remove();
			this.last = null;
		}
	}

	public Object next() {
		Node var1 = this.field4144;
		if (var1 == this.deque.sentinel) {
			var1 = null;
			this.field4144 = null;
		} else {
			this.field4144 = var1.previous;
		}

		this.last = var1;
		return var1;
	}
}
