public class PatternPrinting {
    public static void main(String[] args) {

        // 1️⃣ Square pattern
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }

        System.out.println();

        // 2️⃣ Decreasing triangle pattern
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }

        System.out.println();

        // 3️⃣ Increasing triangle pattern
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }

        System.out.println("\nPyramid");

        // 4️⃣ Pyramid pattern
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
