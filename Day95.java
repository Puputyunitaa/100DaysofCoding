public class D95 {

    public static void main(String[] args) {
        int p = 5;
        for (int i = 1; i <= p; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-----------------------");
        for (int i = p; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
