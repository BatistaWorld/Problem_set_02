package problem_set_02;

public class test {

	public static void main(String[] args) {
		Node n1 = new Node();
		Node n2 = new Node();
		Node n3 = new Node();
		Node n4 = new Node();
		Node n5 = new Node();
		Node n6 = new Node();
		Node first = new Node();
		n1.item = "one";
		n2.item = "two";
		n3.item = "three";
		n4.item = "four";
		n5.item = "five";
		n6.item = "six";
		first = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		insertAfter(n1, n6);
		// 1.3.19 this is what done for the first problem to test it.
		// I would just comment out this section to continue working
		// Node last = first;
		// for (Node x = first; x != null; x = x.next) {
		// if (x.next == null) {
		// last = x;
		// }
		// }
		// for (Node x = first; x != null; x = x.next) {
		// if (x.next == last) {
		// x.next = null;
		// }
		// }
		// Testing for problems 1.3.24 and 1.3.25
		// removeAfter(n2);

		// Printing out the linkedList depending on what is running.
		for (Node x = n1; x != null; x = x.next) {
			System.out.println(x.item);

		}
	}

	// Problem 1.3.24
	public static void removeAfter(Node first) {
		if (first != null && first.next != null) {
			first.next = first.next.next;
		}
	}

	// Problem 1.3.25
	public static void insertAfter(Node x, Node y) {
		if (x != null && y != null) {
			Node temp = x.next;
			x.next = y;
			y.next = temp;
		}
	}

}
