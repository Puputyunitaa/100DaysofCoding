import java.util.Scanner;

public class Day48p {

    public static void main(String[] args) {

        Scanner bal = new Scanner(System.in);

        System.out.print("masukkan nilai: ");
        int nilai = bal.nextInt();
        if (nilai > 70) {
            System.out.println("positif");

        } else {
            System.out.println("negatif");

        }
    }
}
