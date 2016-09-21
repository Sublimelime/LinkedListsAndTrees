/**
 * Created on 9/20/2016, 2:18 PM
 *
 * @author Noah Morton
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

            System.out.println();
            switch (choice) {
                case 0:
                    System.out.print("\nGood Bye!!");
                    System.exit(0);
                    break;
                case 1: //size
                    break;
                case 2: //print
                    break;
                case 3: //print first
                    break;
                case 4: //print last
                    break;
                case 5: //get location
                    break;
                case 6: //remove first
                    mList.removeFirst();
                    System.out.println("First node was removed.");
                    break;
                case 7: //remove last
                    break;
                case 8: //remove x
                    break;
                case 9: //add first
                    break;
                case 10: //add last
                    break;
                case 11: //insert
                    break;
                case 12: //set x
                    break;
                case 13: //is empty
                    break;
                case 14: //clear
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }

        } while (true);
    }
}