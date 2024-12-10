import java.time.LocalTime;
import java.util.Scanner;
public class D100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nama Anda : ");
        String nama = scanner.nextLine();
      
        LocalTime waktu = LocalTime.now();
        String  salam;

        if (waktu.isBefore(LocalTime.NOON)) {
            salam = "Selamat pagi";
        } else if (waktu.isBefore(LocalTime.of(17, 0))) {
            salam = "Selamat siang";
        } else {
            salam = "Selamat malam";
        }

        
        System.out.println("===================================");
        System.out.println("      selamat malam " + nama);
        System.out.println("      Program Anda Telah Selesai");
        System.out.println("===================================");
        
    }


        
      
    }
