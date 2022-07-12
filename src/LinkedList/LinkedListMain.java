package LinkedList;

public class LinkedListMain {
	public static void main(String args[]) {
		System.out.println("Welcome to the Linkedlist Program");
		LinkedList list = new LinkedList();

        Node head = list.add(null, 56);
        head = list.add(head, 30);
        head = list.add(head, 70);
        list.display(head);
	}

}
