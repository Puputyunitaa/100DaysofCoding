import java.util.Scanner;
public class Day89 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan sebuah kalimat : ");
        String kalimat = scanner.nextLine();
        String hasil = "";
        boolean awalKata = true;
        
        for (int i = 0; i < kalimat.length(); i++) {
            char c = kalimat.charAt(i);

            if (c == ' ') {
                hasil = hasil + c; 
                awalKata = true;
            } else {
                if (awalKata) {
                    hasil += Character.toUpperCase(c); 
                    awalKata = false;
                } else {
                    hasil += Character.toLowerCase(c); 
                }
            }
        }
        System.out.println(hasil);
    }
}
