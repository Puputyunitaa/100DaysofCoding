public class D87 {

    public static void main(String[] args) {
        int number[] = {30, 20, 27, 1};

        for (int p : number) {
            System.out.println(p);
        }
        number[3] = 8;
        System.out.println("\nisi array setelah index ke-3 diubah: ");
        for (int p : number) {
            System.out.println(p);
        }
    }

}
