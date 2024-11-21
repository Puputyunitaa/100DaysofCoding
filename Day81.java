import java.util.Scanner;

public class D81 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int angka = input.nextInt();
            
        String p = (angka > 0) ? String.valueOf(angka + " angka positif"): "Angka negatif atau nol";
       
        System.out.println(p);
        
       
    }
}
