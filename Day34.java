import java.util.Scanner;
public class D34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nama : ");
        String nama = input.nextLine();
        System.out.print("Nim : ");
        String nim = input.nextLine();
        System.out.print("Umur: ");
        short umur = input.nextShort();
        System.out.print("Alamat: ");
        String alamat = input.nextLine();
        input.nextLine();
        System.out.print("Kelas : ");
        char kelas = input.next().charAt(0);
        System.out.print("Berat Badan: ");
        float bb = input.nextFloat();
        System.out.print("Tinggi Badan: ");
        int tinggi = input.nextInt();
        System.out.print("motivasi : ");
        String Motivasi = input.nextLine();
         input.nextLine();
        System.out.print("pesan dan Kesan : ");
        String PesandanKesan = input.nextLine();
        
        
    }
    
}
