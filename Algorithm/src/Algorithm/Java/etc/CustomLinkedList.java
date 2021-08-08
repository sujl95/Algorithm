package Algorithm.Java.etc;

public class CustomLinkedList {

	private Node head;
	private int size;

	private static class Node {
		private Object data;
		private Node next;

		public Node(Object data) {
			this.data = data;
			this.next = null;
		}

		@Override
		public String toString() {
			return "Node{" +
					"data=" + data +
					", next=" + next +
					'}';
		}

	}

	public Node node(int index) {
		Node node = head;
		for (int i = 0; i < index; i++) {
			node = node.next;
		}
		return node;
	}

	public void add(Object data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		size++;
	}

	public void add(Object data, int index) {
		if (index == 0) {
			add(data);
		} else {
			Node temp = node(index);
			Node tempNext = temp.next;

			Node newNode = new Node(data);
			temp.next = newNode;
			newNode.next = tempNext;
			size++;
		}
	}

	@Override
	public String toString() {
		String res = "";
		Node temp = head;
		while (temp.next != null) {
			res += temp.data + ", ";
			temp = temp.next;
		}
		res += temp.data;
		return res;
	}
}
