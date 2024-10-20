import java.util.Scanner;

public class D49p {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan : ");
        int to = input.nextInt();

        if (to < 100 ) {
            System.out.println("di bawah seratus");
        } else if (to >= 100) {
            System.out.println("sama dengan seratus dan di atas seratus ");
       
        }

    }
}
