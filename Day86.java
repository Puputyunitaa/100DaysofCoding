public class D86 {

    public static void main(String[] args) {
        
        int[] array = new int [5];
        array [0] = 10;
        array [1] = 20;
        array [2] = 30;
        array [3] = 40;
        array [4] = 50;

        System.out.println("Elemen-elemen dalam array :");
        for (int i = 0; i < 5; i++) {
            System.out.println("indeks ke-" + i + " : " + array[i]);
        }
    }
}
