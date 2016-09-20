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
        //todo menu

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
                case 1:
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
                default:
                    System.out.println("Invalid choice.");
                    break;
            }

        } while (true);
    }
}