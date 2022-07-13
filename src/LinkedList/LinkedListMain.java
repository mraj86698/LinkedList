package LinkedList;

public class LinkedListMain {
	public static void main(String args[]) {
		System.out.println("Welcome to the Linkedlist Program");
		LinkedList list = new LinkedList();
		boolean flag = true;
		while(flag)
		{
			System.out.println("1. Insert at first position\n2. Display List ");
			int choice = InputUtility.inputInteger();

			switch (choice)
			{
			case 1:
				System.out.println("How many items do u want to insert into the list: ");
				int totalItem = InputUtility.inputInteger();
				System.out.println("Enter Item");
				for(int i = 0; i < totalItem; i++) {
					int item = InputUtility.inputInteger();
					list.insertAtFirst(item);
				}
				System.out.println("List Item Added Successfully");

				break;
			case 2:
				System.out.println("List Items : ");
				list.display();
				break;
			default:
				System.out.println("Invalid Position");
				break;
			}
		}


	}

}
