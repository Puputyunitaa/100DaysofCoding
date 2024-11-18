import java.util.Scanner;

public class D78 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kata pertama : ");
        String kata1 = scanner.nextLine();

        System.out.print("Masukkan kata kedua : ");
        String kata2 = scanner.nextLine();

        System.out.print("Masukkan kata ketiga : ");
        String kata3 = scanner.nextLine();

        boolean hasil1 = kata1.equalsIgnoreCase(kata2);
        boolean hasil2 = kata1.equalsIgnoreCase(kata3);

        if (hasil1) {
            System.out.println("Kata pertama sama dengan kata kedua ");
        } else {
            System.out.println("Kata pertama TIDAK sama dengan kata kedua ");
        }

        if (hasil2) {
            System.out.println("Kata pertama sama dengan kata ketiga ");
        } else {
            System.out.println("Kata pertama TIDAK sama dengan kata ketiga ");
        }
    }
}
