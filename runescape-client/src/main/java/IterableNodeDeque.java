import java.util.Collection;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lz")
@Implements("IterableNodeDeque")
public class IterableNodeDeque implements Iterable, Collection {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	@Export("sentinel")
	Node sentinel;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	Node field4171;

	public IterableNodeDeque() {
		this.sentinel = new Node();
		this.sentinel.previous = this.sentinel;
		this.sentinel.next = this.sentinel;
	}

	@ObfuscatedName("c")
	@Export("rsClear")
	public void rsClear() {
		while (this.sentinel.previous != this.sentinel) {
			this.sentinel.previous.remove();
		}

	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lov;)V"
	)
	@Export("addFirst")
	public void addFirst(Node var1) {
		if (var1.next != null) {
			var1.remove();
		}

		var1.next = this.sentinel.next;
		var1.previous = this.sentinel;
		var1.next.previous = var1;
		var1.previous.next = var1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lov;)V"
	)
	@Export("addLast")
	public void addLast(Node var1) {
		if (var1.next != null) {
			var1.remove();
		}

		var1.next = this.sentinel;
		var1.previous = this.sentinel.previous;
		var1.next.previous = var1;
		var1.previous.next = var1;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "()Lov;"
	)
	@Export("last")
	public Node last() {
		return this.method6306((Node)null);
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lov;)Lov;"
	)
	Node method6306(Node var1) {
		Node var2;
		if (var1 == null) {
			var2 = this.sentinel.previous;
		} else {
			var2 = var1;
		}

		if (var2 == this.sentinel) {
			this.field4171 = null;
			return null;
		} else {
			this.field4171 = var2.previous;
			return var2;
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "()Lov;"
	)
	@Export("previous")
	public Node previous() {
		Node var1 = this.field4171;
		if (var1 == this.sentinel) {
			this.field4171 = null;
			return null;
		} else {
			this.field4171 = var1.previous;
			return var1;
		}
	}

	@ObfuscatedName("q")
	int method6308() {
		int var1 = 0;

		for (Node var2 = this.sentinel.previous; var2 != this.sentinel; var2 = var2.previous) {
			++var1;
		}

		return var1;
	}

	@ObfuscatedName("m")
	public boolean method6309() {
		return this.sentinel.previous == this.sentinel;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "()[Lov;"
	)
	Node[] method6364() {
		Node[] var1 = new Node[this.method6308()];
		int var2 = 0;

		for (Node var3 = this.sentinel.previous; var3 != this.sentinel; var3 = var3.previous) {
			var1[var2++] = var3;
		}

		return var1;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lov;)Z"
	)
	boolean method6310(Node var1) {
		this.addFirst(var1);
		return true;
	}

	public int hashCode() {
		return super.hashCode();
	}

	public void clear() {
		this.rsClear();
	}

	public Iterator iterator() {
		return new IterableNodeDequeDescendingIterator(this);
	}

	public int size() {
		return this.method6308();
	}

	public boolean isEmpty() {
		return this.method6309();
	}

	public boolean contains(Object var1) {
		throw new RuntimeException();
	}

	public Object[] toArray() {
		return this.method6364();
	}

	public Object[] toArray(Object[] var1) {
		int var2 = 0;

		for (Node var3 = this.sentinel.previous; var3 != this.sentinel; var3 = var3.previous) {
			var1[var2++] = var3;
		}

		return var1;
	}

	public boolean remove(Object var1) {
		throw new RuntimeException();
	}

	public boolean addAll(Collection var1) {
		throw new RuntimeException();
	}

	public boolean removeAll(Collection var1) {
		throw new RuntimeException();
	}

	public boolean retainAll(Collection var1) {
		throw new RuntimeException();
	}

	public boolean add(Object var1) {
		return this.method6310((Node)var1);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public boolean containsAll(Collection var1) {
		throw new RuntimeException();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lov;Lov;)V"
	)
	@Export("IterableNodeDeque_addBefore")
	public static void IterableNodeDeque_addBefore(Node var0, Node var1) {
		if (var0.next != null) {
			var0.remove();
		}

		var0.next = var1;
		var0.previous = var1.previous;
		var0.next.previous = var0;
		var0.previous.next = var0;
	}
}
