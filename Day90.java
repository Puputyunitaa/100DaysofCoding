import java.util.Scanner;
public class Day90 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan bulat positif : ");
        int p = input.nextInt();
            
            for (int i = 1; i <= p; i++) {
                if (p % i == 0) {
                    System.out.print(i + " ");
                }
            }
    }
     
    }
    
