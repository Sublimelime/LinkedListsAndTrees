import java.util.Scanner;

/**
 * Created on 10/5/2016, 2:29 PM
 *
 * @author Noah Morton
 *         Tully 7th period
 *         Part of project BinaryTreeAndTester
 */

public class Mainfile {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        BinaryTree mTree = new BinaryTree();

        do {
            System.out.print("\n-Menu-\n");

            System.out.println("1. Print\n" +
                    "2. Size\n" + "3. Clear\n" + "4. Empty\n" + "5. Insert\n" + "6. Contains\n" + "7. Minimum Val\n" +
                    "8. Max val\n" + "9. Max depth\n" + "0. Exit");

            byte choice = keyboard.nextByte();

            switch (choice) {
                case 0:
                    System.exit(0);
                    break;
                case 1: //print
                    mTree.printSubMenu();
                    break;
                case 2: //size
                    break;
                case 3: //clear
                    break;
                case 4: //empty
                    break;
                case 5: //insert
                    break;
                case 6: //contains
                    break;
                case 7: //minimum val
                    break;
                case 8:  //max val
                    break;
                case 9: //max depth
                    break;
                default:
                    System.err.println("Invalid choice.");
                    break;
            }
        }while (true);

    }

}
