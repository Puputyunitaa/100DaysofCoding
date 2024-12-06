public class Day96 {

    public static void main(String[] args) {

        int p = 5;

        for (int i = 1; i <= p; i++) {
            for (int j = p; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = p - 1; i >= 1; i--) {
            for (int j = p; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
