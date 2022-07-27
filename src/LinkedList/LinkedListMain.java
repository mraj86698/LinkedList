package LinkedList;

public class LinkedListMain {
	public static void main(String args[]) {
		System.out.println("Welcome to the Linkedlist Program");
		LinkedList list = new LinkedList();
		boolean flag = true;
		while (flag) {
			System.out.println("1. Add Elements\n2. Insert at first position\n3. Display List \n4. Insert at Last Position\n5. Insert at Any Position\n6. Delete First Element\n7. Delete Last Element\n8.Search item \n9.Search and Insert \nEnter your Choice: ");
			int choice = InputUtility.inputInteger();

			switch (choice) {
			case 1:
				System.out.println("How many items do u want to insert into the list: ");
				int totalItem3 = InputUtility.inputInteger();
				System.out.println("Enter Item");
				for (int i = 0; i < totalItem3; i++) {
					int item2 = InputUtility.inputInteger();
					list.add(item2);
				}
				System.out.println("List Item Added Successfully");

				break;
			case 2:
				System.out.println("How many items do u want to insert into the list: ");
				int totalItem = InputUtility.inputInteger();
				System.out.println("Enter Item");
				for (int i = 0; i < totalItem; i++) {
					int item3 = InputUtility.inputInteger();
					list.insertAtFirst(item3);
				}
				System.out.println("List Item Added Successfully");

				break;
			case 3:
				System.out.println("List Items : ");
				//list.display();
				list.printLinkedList();
				break;
			case 4:
				System.out.println("How many items do u want to insert into the list: ");
				int totalItem1 = InputUtility.inputInteger();
				System.out.println("Enter Item");
				for (int i = 0; i < totalItem1; i++) {
					int item1 = InputUtility.inputInteger();
					list.insertAtLast(item1);
				}
				System.out.println("List Item Added Successfully");
				break;
			case 5:
				System.out.println("Enter Position to Enter Value: ");
				int pos = InputUtility.inputInteger();
				System.out.println("Enter Item");
				int item2 = InputUtility.inputInteger();
				list.insertAtPosition(item2, pos);
				break;
			case 6:
				list.deleteFirst();
				System.out.println("List Item Deleted Successfully");
				break;
			case 7:
				list.deleteLast();
				System.out.println("List Item Deleted Successfully");
				break;
			case 8:
				System.out.println("\nEnter Value You want to search: ");
				int val = InputUtility.inputInteger();
				list.search(val);
				break;
			case 9:
				System.out.println("Enter to Insert Element:");
				int item4 = InputUtility.inputInteger();
				System.out.println("Enter to Search Element:");
				int item5 = InputUtility.inputInteger();

				Node newNode5 =new Node(item4);
				Node prvNode = list.searchInsert(item5, newNode5);
				System.out.print("Newly Added data in List : ");
				//list.display();
				list.printLinkedList();
				break;

			case 10:
				System.out.println("Enter to Element to Deleted in a List:");
				int item6 = InputUtility.inputInteger();
				list.deleteNode(item6);
				list.printLinkedList();
				break;
			default:
				System.out.println("Invalid Position");
				break;
			}
		}

	}

}
