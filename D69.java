// soal no 1
import java.util.Scanner;

public class evaluasi {
    public static void main(String[] args) {
          Scanner input = new Scanner (System.in);
          System.out.print("batas awal : ");
        char batas = input.next().charAt(0);
        System.out.print("angka tidak di tampilkan : ");
        char tdkditampilkan = input.next().charAt(0);
        
        for (char i = 'A'; i <= batas; i++) {
                 if(i != tdkditampilkan){
                   
                      System.out.print(i + " ");
                     
                 }               
            
        }
        
    }
    
}

// soal nomor 4
import java.util.Scanner;

public class evaluasi4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan angka awal : ");
        int awal = input.nextInt();
        System.out.print("masukkan angka akhir : ");
        int akhir = input.nextInt();

        int jumlahGnp = 0;
        int jumlahGnjl = 0;

        for (int i = awal; i <= akhir; i++) {
            if (i % 2 == 0) {
                jumlahGnp++;
            } else {
                jumlahGnjl++;
            }
        }
           System.out.println("\ndalam rentang " + awal + " sampai " + akhir);
            System.out.println("jumlah bilanga genap : " + jumlahGnp);
            System.out.println("jumlah bilangan ganjil : " + jumlahGnjl);

    }

}

//soal nomor 5
import java.util.Scanner;

public class evaluasi5 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int total = 0;
         double jumlah = 0;
  
         for(;;){
             System.out.print("masukkan nilai : ");
             int nilai = input.nextInt();
             
             if (nilai > 0){
                 jumlah++;
                 
             }
             if (nilai < 0){
                 break;
             }
             total+=nilai;
         }
         System.out.println("total niali : " + total);
         double rata = total / jumlah;
         System.out.printf("rata %.2f", rata);
    }
    
}
