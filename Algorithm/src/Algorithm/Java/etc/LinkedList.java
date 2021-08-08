package Algorithm.Java.etc;

public class LinkedList {

	private Node head;
	private Node tail;
	private int size = 0;

	private class Node {
		private Object data;
		private Node next;

		public Node(Object input) {
			this.data = input;
			this.next = null;
		}

		@Override
		public String toString() {
			return String.valueOf(this.data);
		}

	}

	public void add(Object input) {
		// 노드 생성
		Node newNode = new Node(input);
		// 새로운 노드의 다음 노드로 head를 지정
		newNode.next = head;
		// 헤드에 새로운 노드 지정
		head = newNode;
		size++;
		if (head.next == null) {
			tail = head;
		}
	}

	public Node node(int index) {
		Node node = head;
		for (int i = 0; i < index; i++) {
			node = node.next;
		}
		return node;
	}

	public void add(Object input, int index) {
		// 만약 index 가 0이면 첫번째 노드에 추가하는 것이다
		if (index == 0) {
			add(input);
		} else {
			Node temp = node(index - 1);
			// index 번째 노드를 temp2로 지정
			Node temp2 = temp.next;
			// 새로운 노드 생성
			Node newNode = new Node(input);
			// temp의 다음 노드로 새로운 노드 지정
			temp.next = newNode;
			// 새로운 노드의 다음 노드로 temp2지정
			newNode.next = temp2;
			size++;
			// 새로운 노드의 다음노드가 없으면 새로운 노드가 마지막 노드이기 때문에 그걸 반환
			if (newNode.next == null) {
				tail = newNode;
			}

		}
	}

	@Override
	public String toString() {
		System.out.println("size = " + size);
		if (head == null) {
			return "[]";
		}
		Node temp = head;
		String res = "[";
		while (temp.next != null) {
			res += temp.data + ", ";
			temp = temp.next;
		}
		res += temp.data;
		return res + "]";
	}

	public String reverseToString() {
		if (head == null) {
			return "[]";
		}
		String res = "[";
		Node node = null;
		for (int i = size - 1; i >= 0; i--) {
			node = node(i);
			res += i == 0 ? "" : node.data + ", ";
		}
		res += node.data;
		res += "]";
		return res;
	}
}
