
//bagian kelas
public class D15 {
    
    //method
    public static void main(String[] args) {
       
        // Mendeklarasikan variabel dengan tipe data double
        double nilai = 7.2836482977;
        
        // Pencetakan 1-5 menggunakan printf dengan format yang berbeda
        System.out.printf("%.1f%n", nilai);  // 1 angka di belakang koma
        System.out.printf("%.2f%n", nilai);  // 2 angka di belakang koma
        System.out.printf("%.3f%n", nilai);  // 3 angka di belakang koma
        System.out.printf("%.4f%n", nilai);  // 4 angka di belakang koma
        System.out.printf("%.5f%n", nilai);  // 5 angka di belakang koma
        
        // Pencetakan 6-10 menggunakan println dengan format yang berbeda
        System.out.println(String.format("%.6f", nilai));  // 6 angka di belakang koma
        System.out.println(String.format("%.7f", nilai));  // 7 angka di belakang koma
        System.out.println(String.format("%.8f", nilai));  // 8 angka di belakang koma
        System.out.println(String.format("%.9f", nilai));  // 9 angka di belakang koma
        System.out.println(String.format("%.10f", nilai)); // 10 angka di belakang koma
    }
}

    
