/*
  Created on 9/20/2016, 2:18 PM

  @author Noah Morton
 * Tully 7th period
 * Part of project LinkedListAndTester
 */

import java.util.*;

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
                    System.out.println("Printing all...\n" + mList.toString());
                    break;
                case 3: //print first
                    System.out.println("Printing first...\n" + mList.getFirst());
                    break;
                case 4: //print last
                    System.out.println("Printing first...\n" + mList.getLast());
                    break;
                case 5: //get location
                    System.out.println("What location to get?");
                    System.out.println("The node's data is: "+mList.get(keyboard.nextInt()));
                    break;
                case 6: //remove first
                    LLNode<String> removedValue = mList.removeFirst();
                    if (removedValue == null) {
                        System.out.println("List is empty. ");
                        break;
                    } else
                        System.out.println("First node was removed, value was: " + mList.removeLast());
                    break;
                case 7: //remove last
                    LLNode<String> removedValue2 = mList.removeLast();
                    if (removedValue2 == null) {
                        System.out.println("List is empty. ");
                        break;
                    } else
                        System.out.println("Last node was removed, value was: " + mList.removeLast());
                    break;
                case 8: //remove x
                    System.out.println("What node should be removed?");
                    int indexToRemove = keyboard.nextInt();
                    if (indexToRemove>mList.size()-1) { //if the provided index is larger than the list
                        System.err.println("Cannot remove from that location, list size is "+mList.size());
                        break;
                    }
                    System.out.println("The removed node is: "+mList.remove(indexToRemove));
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
                    if (index>mList.size()) { //if the provided index is larger than the list
                        System.err.println("Cannot add at that location, list size is "+mList.size());
                        break;
                    }
                    System.out.println("What data should be added?");
                    String data = keyboard.next();
                    mList.add(index,data);
                    break;
                case 12: //set x
                    System.out.println("What node should be set?");
                    int indexToSet = keyboard.nextInt();
                    if (indexToSet>mList.size()-1) { //if the provided index is larger than the list
                        System.err.println("Cannot set at that location, list size is "+mList.size());
                        break;
                    }
                    System.out.println("What data should be set?");
                    String dataToSet = keyboard.next();
                    mList.set(indexToSet,dataToSet);
                    break;
                case 13: //is empty
                    if (mList.empty()) System.out.println("List is empty.");
                    else System.out.println("List is not empty.");
                    break;
                case 14: //clear
                    System.out.println("Clearing...");
                    mList.clear();
                    System.out.println("Cleared.");
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        } while (true);
    }
}