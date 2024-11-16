import java.util.Scanner;

public class D76 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah kalimat : ");
        String kalimat = input.nextLine();

        if (kalimat.length() > 5) {
            String p = kalimat.toUpperCase();
            System.out.println("Kalimat dalam huruf besar: " + p);
        } else {
            String u = kalimat.toLowerCase();
            System.out.println("Kalimat dalam huruf kecil: " + u);
        }

    }
}
