package Algorithm.Java.etc;

public class LinkedList2<T> {

  private Node<T> head;
  private int size;

  private static class Node<T> {

    private T data;
    private Node<T> next;

    private Node (T data) {
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

  private void add(T data) {
    Node<T> node = new Node<>(data);
    node.next = this.head;
    this.head = node;
    this.size++;
  }

  private void add(int index, T data) {
    if (size == 0) {
      add(data);
      return;
    }
    Node temp = node(index);
    Node tempNext = temp.next;

    Node newNode = new Node(data);
    temp.next = newNode;
    newNode.next = tempNext;
    this.size++;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    Node temp = head;
    while (temp.next != null) {
      sb.append(temp.data).append(", ");
      temp = temp.next;
    }
    sb.append(temp.data);

    return sb.toString();
  }

  public static void main(String[] args) {
    LinkedList2<String> lists = new LinkedList2<>();
    lists.add("a");
    lists.add("b");
    lists.add("d");

    lists.add(0, "c");
    System.out.println("lists = " + lists);

  }
}
