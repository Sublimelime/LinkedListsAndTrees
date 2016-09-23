/*
  Created on 9/20/2016, 2:18 PM

  @author Noah Morton
 * Tully 7th period
 * Part of project LinkedListAndTester
 */

import java.util.Scanner;

public class MainFile {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        LinkedList<String> mList = new LinkedList<>();

        do {
            System.out.print("\n-Menu-\n");

            System.out.println("1. Size\n" + "2. Print\n" + "3. Print First\n" +
                    "4. Print Last\n" + "5. Get Location\n" + "6. Remove First\n" +
                    "7. Remove Last\n" + "8. Remove X\n" + "9. Add First\n" +
                    "10. Add Last\n" + "11. Insert\n" + "12. Set X\n" + "13. Is Empty\n" +
                    "14. Clear\n" + "0. Exit\n" +
                    "Enter selection:\n");

            byte choice = keyboard.nextByte();

            switch (choice) {
                case 0: //exit
                    System.out.print("\nGood Bye!!");
                    System.exit(0);
                    break;
                case 1: //size
                    System.out.println("The size of the list is: " + mList.size());
                    break;
                case 2: //print
                    System.out.println("Printing...\n" + mList.toString());
                    break;
                case 3: //print first
                    System.out.println("Printing...\n" + mList.getFirst());
                    break;
                case 4: //print last
                    System.out.println("Printing...\n" + mList.getLast());
                    break;
                case 5: //get location todo
                    break;
                case 6: //remove first
                    System.out.println("First node was removed, value was: " + mList.removeFirst());
                    break;
                case 7: //remove last
                    System.out.println("Last node was removed, value was: " + mList.removeLast());
                    break;
                case 8: //remove x todo
                    break;
                case 9: //add first
                    System.out.println("What should be added to first?");
                    mList.addFirst(keyboard.next());
                    break;
                case 10: //add last
                    System.out.println("What should be added to last?");
                    mList.addLast(keyboard.next());
                    break;
                case 11: //insert
                    System.out.println("Where should the new node be created?");
                    int index = keyboard.nextInt();
                    System.out.println("What data should be added?");
                    String data = keyboard.next();
                    mList.add(index,data);
                    break;
                case 12: //set x todo
                    break;
                case 13: //is empty
                    if (mList.empty()) System.out.println("List is empty.");
                    else System.out.println("List is not empty.");
                    break;
                case 14: //clear
                    System.out.println("Clearing...");
                    mList.clear();
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        } while (true);
    }
}