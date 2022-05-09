package Algorithm.Java.etc;

public class LinkedList1 <T> {

  private Node head;
  private int size;

  private static class Node <T> {

    private T data;
    private Node next;

    private Node(T data) {
      this.data = data;
      this.next = null;
    }
  }

  private Node node(int index) {
    Node node = head;
    for (int i = 0; i < index; i++) {
      node = node.next;
    }
    return node;

  }

  private <T> void add(T data) {
    Node<T> newData = new Node<>(data);
    newData.next = this.head;
    this.head = newData;
    this.size++;
  }

  private <T> void add(T data, int index) {
    if (size == 0) {
      add(data);
      return;
    }
    Node temp = node(index);
    Node tempNext = temp.next;

    Node newNode = new Node(data);
    temp.next = newNode;
    newNode.next = tempNext;
    size++;
  }


  public String toString() {
    StringBuilder res = new StringBuilder();
    Node temp = head;
    while (temp.next != null) {
      res.append(temp.data).append(", ");
      temp = temp.next;
    }
    res.append(temp.data);
    return res.toString();
  }

  public static void main(String[] args) {
    LinkedList1<String> linkedList1 = new LinkedList1<>();
    linkedList1.add("String1");
    linkedList1.add("String2");
    linkedList1.add("String3");


    System.out.println("linkedList1 = " + linkedList1);
  }

}
