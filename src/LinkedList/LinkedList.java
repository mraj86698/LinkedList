package LinkedList;

class Node {
	private Node next;
	private int data;

	public Node() {
		data = 0;
		next = null;
	}

	public Node(int d, Node node) {
		data = d;
		next = node;
	}

	public void setNext(Node n) {
		this.next = n;
	}

	public Node getNext() {
		return next;
	}

	public void setData(int da) {
		this.data = da;
	}

	public int getData() {
		return data;
	}

}

public class LinkedList {

	private int size;
	private Node start;

	public LinkedList() {
		size = 0;
		start = null;
	}

	public boolean isEmpty() {
		if (start == null)
			return (true);
		else
			return (false);
	}

	public int getListSize() {

		return size;
	}

	public void display() {
		Node temp;
		if (isEmpty())
			System.out.println("List is Empty");
		else {
			temp = start;
			for (int i = 1; i <= size; i++) {
				System.out.print(temp.getData() + " ");
				temp = temp.getNext();

			}
			System.out.println();
		}
	}
	/**
	 * Linked List to Element Insert into First
	 * @param value
	 */

	public void insertAtFirst(int value) {
		Node n = new Node();
		n.setData(value);
		n.setNext(start);
		start = n;
		size++;
	}
	/**
	 * Linked List to Element InsertAtLast
	 * @param value
	 */

	public void insertAtLast(int value) {
		Node n, temp;
		n = new Node();
		n.setData(value);
		temp = start;
		if (temp == null)
			start = n;
		else {
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(n);
		}
		size++;
	}
	/**
	 * Linked List inserted value in between
	 * @param value
	 * @param position
	 */
	public void insertAtPosition(int value, int position) {
		if (position == 1)
			insertAtFirst(value);
		else if (position == size + 1)
			insertAtLast(value);
		else if (position > 1 && position <= size) {
			Node n, t;
			n = new Node(value, null);
			t = start;
			for (int i = 1; i < position - 1; i++)
				t = t.getNext();
			n.setNext(t.getNext());
			t.setNext(n);
			size++;
		} else
			System.out.println("Invalid position " + position);

	}
	/**
	 * Delete the First Element
	 */

	public void deleteFirst()
	{
		if(start == null)
			System.out.println("List is Empty. How can I Delete... :P");
		else
		{
			start = start.getNext();
			size--;
		}

	}

}
