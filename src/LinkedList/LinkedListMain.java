package LinkedList;

public class LinkedListMain {
	public static void main(String args[]) {
		System.out.println("Welcome to the Linkedlist Program");
		LinkedList list = new LinkedList();
		boolean flag = true;
		while(flag)
		{
			System.out.println("1. Insert at first position\n2. Display List \n2. insert at Last Position");
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
			case 3:
				System.out.println("How many items do u want to insert into the list: ");
				int totalItem1 = InputUtility.inputInteger();
				System.out.println("Enter Item");
				for(int i = 0; i < totalItem1; i++) {
				int item1 = InputUtility.inputInteger();
				list.insertAtLast(item1);
				}
				System.out.println("List Item Added Successfully");
				break;
			default:
				System.out.println("Invalid Position");
				break;
			}
		}


	}

}
