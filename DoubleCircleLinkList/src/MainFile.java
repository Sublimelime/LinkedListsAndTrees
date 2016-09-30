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

            System.out.println("");

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
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    System.out.println("What should be added to first?");
                    mList.addFirst(keyboard.next());
                    break;
                case 10:
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