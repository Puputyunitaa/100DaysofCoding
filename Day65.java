public class D65 {
 public static void main(String[] args) {
        int nomor = 5; 

        for (int i = 1; i <= 2; i++) { 
            for (int j = 1; j <= 2; j++) { 
                System.out.print(nomor + "\t"); 
                nomor += 5; 
            }
            System.out.println(); 
        }
    }
}
