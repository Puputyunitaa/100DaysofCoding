
import java.util.Scanner;

public class D75 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah kalimat : ");
        String p = input.nextLine();

        for (int i = 0; i < p.length(); i++) {
        
            char c = p.charAt(i);
            c = Character.toLowerCase(c);

            System.out.print(c);
        }

    }
}


   
