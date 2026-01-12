
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }

    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int tracker = size - 1;
        for (int i = 0; i < size; i++) {
            printSpaces(tracker--);
            printStars(i + 1);

        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int stars = 1;
        int spaces = height - 1;
        for (int i = 0; i < height; i++) {
            for (int j = spaces; j != 0; j--) {
                System.out.print(" ");
            }
            printStars(stars);
            stars += 2;
            spaces--;
        }
        for (int k = 0; k < 2; k++) {
            printSpaces((height - 2));
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printStars(5);
        printSpaces(5);
        System.out.println("---");
        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
