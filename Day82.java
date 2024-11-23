import java.util.Scanner;

public class D82 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pertama : ");
        double angka1 = scanner.nextDouble();

        System.out.print("Masukkan angka kedua : ");
        double angka2 = scanner.nextDouble();

        System.out.println("=== Math.ceil() ===");
        System.out.println("Ceil dari " + angka1 + " adalah : " + Math.ceil(angka1));
        System.out.println("Ceil dari " + angka2 + " adalah : " + Math.ceil(angka2));

        System.out.println("=== Math.floor() ===");
        System.out.println("Floor dari " + angka1 + " adalah : " + Math.floor(angka1));
        System.out.println("Floor dari " + angka2 + " adalah : " + Math.floor(angka2));

        System.out.println("=== Math.round() ===");
        System.out.println("Round dari " + angka1 + " adalah : " + Math.round(angka1));
        System.out.println("Round dari " + angka2 + " adalah : " + Math.round(angka2));

        
}
    
}
