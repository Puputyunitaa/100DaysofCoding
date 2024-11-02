import java.util.Scanner;

public class D62 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int angkaAwal = Integer.MIN_VALUE; 
        boolean p = true; 

        while (p) {
            int angka_input = input.nextInt(); 

            if (angka_input == angkaAwal + 1 || angkaAwal == Integer.MIN_VALUE) {
                angkaAwal = angka_input; 
            } else {
                System.out.println("angka tidak berurut");
                p = false; 
            }
        }

    }
}
