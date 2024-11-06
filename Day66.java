
public class D66 {

    public static void main(String[] args) {
        System.out.println("pola persegi");
        int baris = 5;
        int kolom = 5;
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("* ");
            }
            System.out.println(); 
        }

        System.out.println("\n");
        System.out.println("pola persegi panjang");
        int baris2 = 4;
        int kolom2 = 8;
        for (int i = 0; i < baris2; i++) {
            for (int j = 0; j < kolom2; j++) {
                System.out.print("* ");
            }
            System.out.println(); 
        }
    }
}
