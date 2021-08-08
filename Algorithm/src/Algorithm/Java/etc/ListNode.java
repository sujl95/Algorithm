package Algorithm.Java.etc;

public class ListNode {

	private int size;
	private int data;
	private boolean isHead;
	private ListNode next;

	public ListNode() {
		this.isHead = true;
	}

	public ListNode(int data) {
		this.data = data;
	}

	public ListNode add(ListNode head, ListNode nodeToAdd, int position) {



		return nodeToAdd;
	}

	public ListNode remove(ListNode head, int positionToRemove) {
		return head;
	}

	public boolean contains(ListNode head, ListNode nodeToCheck) {
		return false;
	}


	public int getSize() {
		return size;
	}

	public int getData() {
		return data;
	}
}
