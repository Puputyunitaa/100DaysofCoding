import java.util.Scanner;

public class D63 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan batas angka: ");
        int batas_angka = scanner.nextInt();

        System.out.println("Angka ganjil dari 1 hingga " + batas_angka + ":");

        for (int i = 1; i <= batas_angka; i++) {

            if (i % 2 == 0) {
                continue;
            }

            System.out.println(i);
        }

    }
}
