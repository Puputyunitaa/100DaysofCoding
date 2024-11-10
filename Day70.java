
import java.util.Scanner;

public class D70 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Masukkan angka : ");
        int angka = scanner.nextInt();

        angkaNegatif(angka);

       
    }
    public static void angkaNegatif(int angka) {
        if (angka < 0) {
            System.out.println("Angka yang dimasukkan adalah angka negatif");
        } else {
            System.out.println("Angka yang dimasukkan bukan angka negatif");
        }
    }
}
     
