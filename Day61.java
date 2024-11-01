import java.util.Scanner;

public class D61 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int batasAwal = 0;
        int batasAkhir = 100;
        int bom = 77;
        int tebakan = 7;
        while (tebakan != bom) {
            System.out.println("masukkan angka " + batasAwal + "-" + batasAkhir + ":");
            tebakan = input.nextInt();
            if (tebakan < batasAwal || tebakan > batasAkhir) {
                System.out.println("tidak boleh ");
                
            } else {
                if (tebakan < bom) {
                    batasAwal = tebakan;
                } else if (tebakan > bom) {
                    batasAkhir = tebakan;

                } else if (tebakan == bom) {
                    System.out.println("dummm tararara dummm tararara");
                }
            }
        }
    }
}
