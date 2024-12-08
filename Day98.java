import java.util.Scanner;
public class D98 {
public static void main(String[] args) {
   Scanner input = new Scanner (System.in);
        System.out.print("batas nilai x : ");
        int x = input.nextInt();

        System.out.print("batas nilai y : ");
        int y = input.nextInt();
        int total = 0;
        int i = x; 
        while (i <= y) {
            if (i % 2 == 0) { 
                total += i; 
            }
            i++; 
        }
        System.out.println("total penjumlahan bilangan genap : "+ total);
        
    }

}
