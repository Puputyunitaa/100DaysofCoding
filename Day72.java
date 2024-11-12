
import java.util.Scanner;

public class D72{
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka : ");
        int angka = scanner.nextInt();

        int hasil = hitungJumlah(angka);
        System.out.println("Jumlah dari 0 hingga " + angka + " adalah: " + hasil);     
    }
    
    public static int hitungJumlah(int p) {
     
        if (p <= 0) {
            return 0;
        }
        
        return p + hitungJumlah(p - 1);
    }
}
