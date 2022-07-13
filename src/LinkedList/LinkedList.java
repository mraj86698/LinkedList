package LinkedList;


	class Node
	{
		private Node next;
		private int data;

		public Node()
		{
			data= 0;
			next = null;
		}
		public Node(int d, Node node)
		{
			data = d;
			next = node;
		}
		public void setNext(Node n)
		{
			this.next = n;
		}

		public Node getNext()
		{
			return next;
		}

		public void setData(int da)
		{
			this.data = da;
		}

		public int getData() {
			return data;
		}

	}

	public class LinkedList {

		private int size;
		private Node start;

		public LinkedList()
		{
			size = 0;
			start = null;
		}

		public boolean isEmpty()
		{
			if(start == null)
				return (true);
			else
				return (false);
		}

		public int getListSize()
		{

			return size;
		}

		public void display()
		{
			Node temp;
			if(isEmpty())
				System.out.println("List is Empty");
			else
			{
				temp = start;
				for (int i = 1; i <= size; i++)
				{
					System.out.print(temp.getData()+" ");
					temp = temp.getNext();

				}
				System.out.println();
			}
		}

	public void insertAtFirst(int value)
	{
		Node n = new Node();
		n.setData(value);
		n.setNext(start);
		start = n;
		size++;
	}

}
