import java.util.Scanner;

/**
 * Created on 10/5/2016, 2:29 PM
 *
 * @author Noah Morton
 *         Tully 7th period
 *         Part of project BinaryTreeAndTester
 */

@SuppressWarnings("WeakerAccess")
public class Mainfile {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        BinaryTree<Integer> mTree = new BinaryTree<>();

        do {
            System.out.print("\n-Menu-\n");

            System.out.println("1. Print\n" +
                    "2. Size\n" + "3. Clear\n" + "4. Empty\n" + "5. Insert\n" + "6. Contains\n" + "7. Minimum Val\n" +
                    "8. Max val\n" + "9. Max depth\n" + "10. Remove\n" + "0. Exit");

            byte choice = keyboard.nextByte();

            switch (choice) {
                case 0:
                    System.exit(0);
                    break;
                case 1: //print
                    mTree.printSubMenu();
                    break;
                case 2: //size
                    System.out.println("The size of the tree is " + mTree.size());
                    break;
                case 3: //clear
                    mTree.clear();
                    break;
                case 4: //empty
                    System.out.println((mTree.empty()) ? "Tree is empty." : "Tree is not empty.");
                    break;
                case 5: //insert
                    System.out.println("What should be inserted?");
                    if (mTree.insert(keyboard.nextInt()))
                        System.out.println("Successfully added.");
                    else
                        System.out.println("Failed to add, already in Tree.");
                    break;
                case 6: //contains
                    System.out.println("Check for what?");
                    if (mTree.contains(keyboard.nextInt()))
                        System.out.println("Already in the table.");
                    else
                        System.out.println("Not found, can be added.");
                    break;
                case 7: //minimum val
                    System.out.println("The minimum value is " + mTree.minValue(mTree.getRoot()));
                    break;
                case 8:  //max val
                    System.out.println("The max value is: " + mTree.maxValue());
                    break;
                case 9: //max depth
                    System.out.println("The max depth is " + mTree.maxDepth());
                    break;
                case 10: //remove
                    System.out.println("What value should be removed?");
                    if (mTree.remove(keyboard.nextInt()))
                        System.out.println("Successfully removed.");
                    else
                        System.out.println("Could not remove that value.");
                    break;
                case 11:
                    System.out.println("Setting up tree for debugging...");

                    mTree.insert(8);
                    mTree.insert(3);
                    mTree.insert(10);
                    mTree.insert(1);
                    mTree.insert(6);
                    mTree.insert(14);
                    mTree.insert(4);
                    mTree.insert(7);
                    mTree.insert(13);

                    System.out.println("Preorder------");
                    mTree.preOrder(mTree.getRoot());
                    System.out.println("Inorder--------");
                    mTree.inOrder(mTree.getRoot());
                    System.out.println("Postorder-------");
                    mTree.postOrder(mTree.getRoot());
                    System.out.println("Finished.");
                    break;
                default:
                    System.err.println("Invalid choice.");
                    break;
            }
        } while (true);

    }

}
