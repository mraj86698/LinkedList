package LinkedList;

public class LinkedListMain {
	public static void main(String args[]) {
		System.out.println("Welcome to the Linkedlist Program");
		LinkedList list = new LinkedList();
		boolean flag = true;
		while (flag) {
			System.out.println(
					"1. Insert at first position\n2. Display List \n3. Insert at Last Position\n4. Insert at Any Position\n5. Delete First Element\n6. Delete Last Element\n7.Search item \nEnter your Choice: ");
			int choice = InputUtility.inputInteger();

			switch (choice) {
			case 1:
				System.out.println("How many items do u want to insert into the list: ");
				int totalItem = InputUtility.inputInteger();
				System.out.println("Enter Item");
				for (int i = 0; i < totalItem; i++) {
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
				for (int i = 0; i < totalItem1; i++) {
					int item1 = InputUtility.inputInteger();
					list.insertAtLast(item1);
				}
				System.out.println("List Item Added Successfully");
				break;
			case 4:
				System.out.println("Enter Position to Enter Value: ");
				int pos = InputUtility.inputInteger();
				System.out.println("Enter Item");
				int item2 = InputUtility.inputInteger();
				list.insertAtPosition(item2, pos);
				break;
			case 5:
				list.deleteFirst();
				System.out.println("List Item Deleted Successfully");
				break;
			case 6:
				list.deleteLast();
				System.out.println("List Item Deleted Successfully");
				break;
			case 7:
				System.out.println("\nEnter Value You want to search: ");
				int val = InputUtility.inputInteger();
				list.search(val);
				break;

			default:
				System.out.println("Invalid Position");
				break;
			}
		}

	}

}
