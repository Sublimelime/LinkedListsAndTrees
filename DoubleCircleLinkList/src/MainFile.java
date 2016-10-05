/*
 * Created on 9/29/2016, 2:26 PM
 *
 * @author Noah Morton
 *         Tully 7th period
 *         Part of project DoubleCircleLinkList
 */

import java.util.*;

public class MainFile {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String removedValue = "";

        DoubleCircleLinkedList<String> mList = new DoubleCircleLinkedList<>();

        do {
            System.out.print("\n-Menu-\n");

            System.out.println("1. Print Forward\n"+ "2. Print Backward\n"+ "3. Print First\n"+ "4. Print Last\n"+ "5. Get X\n"+
            "6. Remove First\n" + "7. Remove Last\n"+ "8. Remove X\n"+ "9. Add to First\n"+ "10. Add to Last\n"+
            "11. Insert\n"+ "12. Set X\n"+ "13. Size\n"+ "14. Is Empty\n"+ "15. Clear\n"+ "0. Exit\n");

            byte choice = keyboard.nextByte();

            switch (choice) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("How many to print?");
                    System.out.println("Printing....\n"+mList.printForwards(keyboard.nextInt()));
                    break;
                case 2:
                    System.out.println("How many to print?");
                    System.out.println("Printing....\n"+mList.printBackwards(keyboard.nextInt()));
                    break;
                case 3:
                    System.out.println(mList.getFirst());
                    break;
                case 4:
                    System.out.println(mList.getLast());
                    break;
                case 5: //get x
                    System.out.println("What location to get?");
                    System.out.println("The node's data is: "+mList.get(keyboard.nextInt()));
                    break;
                case 6: //remove first
                    removedValue = mList.removeFirst();
                    if (removedValue == null) {
                        System.out.println("List is empty. ");
                        break;
                    } else
                        System.out.println("First node was removed, value was: " + removedValue);
                    break;
                case 7: //remove last
                    removedValue = mList.removeLast();
                    if (removedValue == null) {
                        System.out.println("List is empty. ");
                        break;
                    } else
                        System.out.println("Last node was removed, value was: " + removedValue);
                    break;
                case 8: //remove at index
                    System.out.println("What node should be removed?");
                    int indexToRemove = keyboard.nextInt();
                    if (indexToRemove>mList.size()-1 || indexToRemove<0) { //if the provided index is larger than the list
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
                    System.out.println("What should be added to Last?");
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
                case 12:
                    System.out.println("What node should be set?");
                    int indexToSet = keyboard.nextInt();
                    if (indexToSet>mList.size()-1) { //if the provided index is larger than the list
                        System.err.println("Cannot set at that location, list size is "+mList.size());
                        break;
                    }
                    System.out.println("What data should be set?");
                    String dataToSet = keyboard.next();
                    String replaced = mList.set(indexToSet,dataToSet);
                    if (replaced != null) System.out.println("Replaced value is "+replaced);
                    break;
                case 13:
                    System.out.println("The size of the list is: "+mList.size());
                    break;
                case 14:
                    if (mList.empty()) System.out.println("List is empty.");
                    else System.out.println("List is not empty.");
                    break;
                case 15:
                    mList.clear();
                    break;
                case 16:
                    System.out.println("Setting up list with 5 elements for debug purposes...");
                    mList.addFirst("test1");
                    for (int i = 2; i < 6 ; i++) {
                        mList.addLast("test"+i);
                    }
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        } while (true);
    }
}