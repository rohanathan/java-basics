package collections;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList<Object> linkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nLinkedList Operations Menu:");
            System.out.println("1. Add element at last");
            System.out.println("2. Add element at first");
            System.out.println("3. Add element at given index");
            System.out.println("4. Update the element at given index");
            System.out.println("5. Delete the first element");
            System.out.println("6. Delete the last element");
            System.out.println("7. Delete the given element");
            System.out.println("8. Delete the element at given index");
            System.out.println("9. Display the elements");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to add at last: ");
                    linkedList.addLast(scanner.nextLine());
                    break;
                case 2:
                    System.out.print("Enter the element to add at first: ");
                    linkedList.addFirst(scanner.nextLine());
                    break;
                case 3:
                    System.out.print("Enter the index to add the element: ");
                    int indexAdd = scanner.nextInt();
                    scanner.nextLine();  // Consume the newline character
                    if (indexAdd >= 0 && indexAdd <= linkedList.size()) {
                        System.out.print("Enter the element to add: ");
                        linkedList.add(indexAdd, scanner.nextLine());
                    } else {
                        System.out.println("Index out of bounds.");
                    }
                    break;

                case 4:
                    System.out.print("Enter the index to update the element: ");
                    int indexUpdate = scanner.nextInt();
                    scanner.nextLine();  // Consume the newline character
                    if (indexUpdate >= 0 && indexUpdate < linkedList.size()) {
                        System.out.print("Enter the new element: ");
                        linkedList.set(indexUpdate, scanner.nextLine());
                    } else {
                        System.out.println("Index out of bounds.");
                    }
                    break;
                case 5:
                    if (linkedList.size() > 0) {
                        linkedList.removeFirst();
                        System.out.println("First element deleted.");
                    } else {
                        System.out.println("The list is empty.");
                    }
                    break;
                case 6:
                    if (linkedList.size() > 0) {
                        linkedList.removeLast();
                        System.out.println("Last element deleted.");
                    } else {
                        System.out.println("The list is empty.");
                    }
                    break;
                case 7:
                    System.out.print("Enter the element to delete: ");
                    String elementToDelete = scanner.nextLine();
                    if (linkedList.remove(elementToDelete)) {
                        System.out.println("Element deleted.");
                    } else {
                        System.out.println("Element not found.");
                    }
                    break;
                case 8:
                    System.out.print("Enter the index to delete the element: ");
                    int indexDelete = scanner.nextInt();
                    scanner.nextLine();  // Consume the newline character
                    if (indexDelete >= 0 && indexDelete < linkedList.size()) {
                        linkedList.remove(indexDelete);
                        System.out.println("Element at index " + indexDelete + " deleted.");
                    } else {
                        System.out.println("Index out of bounds.");
                    }
                    break;
                case 9:
                    System.out.println("Elements in the LinkedList: " + linkedList);
                    break;
                case 10:
                    System.out.println("Exiting.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 10);

        scanner.close();
    }
}

/*- The loop continues until the user chooses to exit (`choice == 10`).
- Close the `Scanner` to release resources.

### Summary
This program provides a menu-driven interface to perform various operations on a `LinkedList`. 
It uses a `switch` statement to handle user choices and a `do-while` loop to repeatedly display 
the menu until the user chooses to exit. 
Each case in the switch statement corresponds to a specific operation, 
ensuring that the `LinkedList` is manipulated according to user input.
*/