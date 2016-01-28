package problem_set_02;

import java.util.Iterator;

public class linkedList<Item> implements Iterable<Item> {
	Node first;
	Node last;
	int N = 0;

	public class Node {
		Item item;
		Node next;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public void add(Item item) {
		Node oldlast = last;
		last = new Node();
		last.item = item;
		last.next = null;
		if (isEmpty())
			first = last;
		else
			oldlast.next = last;
		N++;
	}

	public void print() {
		for (Node x = this.first; x != null; x = x.next) {
			System.out.println(x.item);
		}
	}

	// 1.3.20
	public void delete(int k) {
		int count = 0;
		for (Node x = this.first; x != null; x = x.next) {
			count++;
			if (count == k - 1) {
				x.next = x.next.next;
				N--;
			}

		}

	}

	// 1.3.21
	public boolean find(String key) {
		for (Node x = this.first; x != null; x = x.next) {
			if (x.item.equals(key)) {
				return true;
			}
		}
		return false;
	}

	// 1.3.26
	public void remove(String key) {
		int count = 1;
		for (Node x = this.first; x != null; x = x.next) {
			if (x.item.equals(key)) {
				this.delete(count);
				count--;
			}
			count++;
		}

	}

	public static void main(String[] args) {
		linkedList<String> list = new linkedList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("three");
		list.add("four");
		list.add("five");
		// Different stuff I used for testing my problems out
		// list.delete(4);
		// list.remove("three");

		list.print();
		// System.out.println(list.find("five"));
		// System.out.println(list.find("six"));

		// System.out.println(list.first.item.equals("five"));
		//
		// list.print();
	}

	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}