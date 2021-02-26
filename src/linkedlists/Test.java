package linkedlists;

public class Test {

  public static void main(String[] args) {
    Node head = null;
    head = insertAtBeginning(head, 10);
    head = insertAtBeginning(head, 12);
    head = insertAtBeginning(head, 5);
    head = insertAtNthPosition(head, 50, 4);
    printRecursive(head);
    head = reverseListRecursive(head);
    printRecursive(head);
  }

  static Node insertAtBeginning(Node head, int data) {
    Node preNode = new Node();
    preNode.data = data;
    preNode.link = head;
    head = preNode;
    return head;
  }

  static void print(Node head) {
    Node iter = head;
    while (iter != null) {
      System.out.println(iter.data);
      iter = iter.link;
    }
  }


  static void printRecursive(Node head) {
    if(head == null){
      return;
    }
    System.out.println(head.data);
    printRecursive(head.link);
  }
  static void printReverseRecursive(Node head){
    if(head == null){
      return;
    }
    printReverseRecursive(head.link);
    System.out.println(head.data);
  }

  static void insertAtLast(Node head, int data) {
    Node postNode = new Node();
    postNode.data = data;
    Node iter = head;
    while (iter.link != null) {
      iter = iter.link;
    }
    iter.link = postNode;
  }

  static Node insertAtNthPosition(Node head, int data, int position) {
    Node iter = head;
    Node iterCount = head;
    int count = 0;
    while (iterCount != null) {
      iterCount = iterCount.link;
      count++;
    }
    if (position > count + 1 || position < 1) {
      return head;
    }
    if (position == 1) {
      return insertAtBeginning(head, data);
    }
    for (int i = 1; i <= position - 2; i++) {
      iter = iter.link;
    }
    Node midNode = new Node();
    midNode.data = data;
    midNode.link = iter.link;
    iter.link = midNode;
    return head;
  }

  static Node deleteFromLast(Node head) {
    Node iter = head;
    if (head == null || head.link == null) {
      head = null;
      return head;
    }
    while (iter.link.link != null) {
      iter = iter.link;
    }
    iter.link = null;
    return head;
  }

  static Node deleteFromBeginning(Node head) {
    if (head == null) {
      return null;
    }
    Node deleteNode = head;
    head = head.link;
    deleteNode.link = null;
    return head;
  }

  static Node deleteFromNthPosition(Node head, int position) {
    Node iter = head;
    Node iterCount = head;
    int count = 0;
    while (iterCount != null) {
      iterCount = iterCount.link;
      count++;
    }
    if (position > count  || position < 1) {
      return head;
    }
    if(position==1){
      head = deleteFromBeginning(head);
      return head;
    }
    for(int i = 1; i<= position - 2; i++){
      iter = iter.link;
    }
    Node deleteNode = iter.link;
    iter.link = deleteNode.link;
    deleteNode.link = null;
    return head;
  }

  static Node reverseList(Node head){

    Node prev = null;
    Node current = head;
    while(current != null){
      Node next = current.link;
      current.link = prev;
      prev = current;
      current = next;
    }
    head = prev;
    return head;
  }
  static Node reverseListRecursive(Node current){
    if(current.link == null){
     Node head = current;
     return head;
    }
    Node head = reverseListRecursive(current.link);
    Node prev = current.link;
    prev.link = current;
    current.link = null;
    return head;
  }

}
