public class Day92 {
    public static void main(String[] args) {
        int p = 5;

        for (int i = 0; i < p; i++) {
            for (int j = 0; j < 2 * p - 1; j++) {
                if (j == i || j == 2 * p - 2 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
