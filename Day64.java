public class D64p{
    public static void main(String[] args) {
        pupu:
        for (int p = 1; p <= 17; p++) {
            System.out.println("p = " + p);
            
            if (p == 13) {
                System.out.println("break p = " + p);
                break pupu;
            }
        }
       
    }
}
