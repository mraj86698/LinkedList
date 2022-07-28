package LinkedList;

class Node {
	Node next;
	int data;

	public Node() {
		data =0 ;
		next = null;
	}

	public Node(int d, Node node) {
		data = d;
		next = node;
	}

	public Node(int data2) {
		// TODO Auto-generated constructor stub
		this.data=data2;
		this.next=null;
	}

	public Node(Node newNode) {
		// TODO Auto-generated constructor stub
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
	Node head;
	Node tail;

	public LinkedList() {
		size = 0;
		start = null;
	}


	public int getListSize() {

		return size;
	}
	/**
	 * Linked List to Add items
	 * @param item
	 */

	public void add(int value) {

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
	 * Linked List to display Items
	 */

	public void display() {
		Node temp=start;;
		if (temp == null)
			System.out.println("List is Empty");
		else {

			for (int i = 1; i <= size; i++) {
				System.out.print(temp.getData() + " ");
				temp = temp.getNext();

			}
			System.out.println(temp.getData());
		}
	}
	public void printLinkedList() {
		// TODO Auto-generated method stub
		Node temp = start;
        if(start == null) {
            System.out.println("LinkedList is empty");
        }else {
            while(temp.next!=null) {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
	}

	/**
	 * Linked List to Element Insert into First
	 *
	 * @param value
	 */

	public void insertAtFirst(int value) {
		Node node = new Node();
		if(head == null)
			head = node;
		else
		{
			node.next = head;
			head = node;
			size++;
		}

	}

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
	 *
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

	public void deleteFirst() {
		if (start == null)
			System.out.println("List is Empty. How can I Delete... :P");
		else {
			start = start.getNext();
			size--;
		}

	}

	/**
	 * Linked List Item Deleted at Last
	 */

	public void deleteLast() {
		if (start == null)
			System.out.println("List is Empty.");
		else if (size == 1) {
			start = null;
			size--;
		} else {
			Node temp;
			temp = start;
			for (int i = 1; i < size - 1; i++)
				temp = temp.getNext();
			temp.setNext(null);
			size--;
		}
	}

	/**
	 * Linked List to Search Node
	 *
	 * @param value
	 * @return
	 */
	public Node search(int value) {
		Node tempNode = start;
		int index = 0;
		boolean flag = false;
		if (start == null) {
			System.out.println("List is Empty");
		} else {
			while (tempNode != null) {
				if (tempNode.getData() == value) {
					flag = true;
					break;
				}
				index++;
				tempNode = tempNode.getNext();
			}
		}
		if (flag == true) {
			System.out.println("Value : " + value + " is present at index : " + index);
		} else {
			System.out.println("Element is Not Present");
		}
		return tempNode;
	}


	public Node searchInsert(int value, Node newNode) {

		 Node searchNode = new Node(newNode);
		 Node var=this.search(value);
		 if(var!=null) {
			 Node tempNode=var.next;
			 var.next=newNode;
			 newNode.next=tempNode;
		 }
		return var;


	 }
	public void deleteNode(int value) {
		 if(this.start == null) {
			 System.out.println("List is Empty");
			 return;
		 }
		Node tempNode = start;
		while(tempNode.next.data != value) {
			tempNode = tempNode.next;
		}
		Node prvNode = tempNode;
		Node nextNode = tempNode.next.next;
		prvNode.next = nextNode;


	 }






}
