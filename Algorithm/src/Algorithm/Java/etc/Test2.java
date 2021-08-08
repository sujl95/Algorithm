package Algorithm.Java.etc;

public class Test2 {

	public static void main(String[] args) {
		// ListNode head = new ListNode();
		// head.add(head, new ListNode(4), 1);
		// head.add(head, new ListNode(5), 2);
		// System.out.println("head = " + head);
		// System.out.println("head.getSize() = " + head.getSize());
		LinkedList linkedList = new LinkedList();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		System.out.println("linkedList = " + linkedList);
		System.out.println("linkedList.reverseToString() = " + linkedList.reverseToString());

		CustomLinkedList list = new CustomLinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println("list = " + list);

	}

}
