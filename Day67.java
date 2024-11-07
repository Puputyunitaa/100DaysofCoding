
import java.util.Scanner;
public class D67 {

    public void cekAngka() {
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan angka : ");
        int angka = input.nextInt();       

        if (angka % 2 == 0) {
            System.out.println("adalah angka genap.");       
              
        } else {
            System.out.println("adalah angka ganjil.");
        }

    }
    public static void main(String[] args) {
        D67 p = new D67();

        p.cekAngka();
    }
}
