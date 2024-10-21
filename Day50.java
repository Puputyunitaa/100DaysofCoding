import java.util.Scanner;

public class D49p {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan : ");
        int to = input.nextInt();

        if (to > 80) {
            System.out.println("Nilai Anda: A");
        } else if (to >= 50) {
            System.out.println("Nilai Anda: B");
        } else {
            System.out.println("bukan nilai keduanya : "); 
        }

    }
}
