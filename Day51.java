import java.util.Scanner;

public class D51 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kesukaan = input.nextInt();
        String menu;

        switch (kesukaan) {
            case 1:
                menu = "Bakso";
                break;
            case 2:
                menu = "Nasgor";
                break;
            case 3:
                menu = "Mie ayam";
                break;
            case 4:
                menu = "Ayam geprek";
                break;
            case 5:
                menu = "Lalapan";
                break;
            default:
                menu = "tidak ada dalam daftar menu";
        }
        System.out.println(menu);

    }

}
