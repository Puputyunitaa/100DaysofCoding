public class D93 {
public static void main(String[] args) {
    int p = 5;
        for (int i = 1; i <= p; i++) {
              for (int j = p; j >= 1; j--){
                if (j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

           for (int j = 2 ; j <= p  ; j++) {
                if (j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
 }
}
}
