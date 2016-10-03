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
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    String removedValue = mList.removeFirst();
                    if (removedValue == null) {
                        System.out.println("List is empty. ");
                        break;
                    } else
                        System.out.println("First node was removed, value was: " + removedValue);
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9: //add first
                    System.out.println("What should be added to first?");
                    mList.addFirst(keyboard.next());
                    break;
                case 10: //add last
                    System.out.println("What should be added to Last?");
                    mList.addLast(keyboard.next());
                    break;
                case 11:
                    break;
                case 12:
                    break;
                case 13:
                    break;
                case 14:
                    break;
                case 15:
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        } while (true);
    }
}