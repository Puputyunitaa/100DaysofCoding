import java.util.Scanner;

public class Day88{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama file : ");
        String namafile = input.nextLine();
        String format = "";
        boolean titik = false;
        int i = namafile.length() - 1;
        
        while (i >= 0) {
            if (namafile.charAt(i) == '.') {
                titik = true;
                break;  
            }
            format = namafile.charAt(i) + format; 
            i--;
        }

        if (titik) {
            System.out.println("Format file adalah: " + format);
        } else {
            System.out.println("File tidak memiliki format ekstensi.");
        }
    }
}
