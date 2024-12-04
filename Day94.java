public class D94 {

    public static void main(String[] args) {

        int p = 10;
        for (int i = 1; i <= p; i++) {
            for (int j = i; j < p; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
