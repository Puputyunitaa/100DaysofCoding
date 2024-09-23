public class D22 {
    public static void main(String[] args) {
         // Menggunakan tipe data primitif
        int a = 5;

        // Menggunakan kelas pembungkus Integer
        Integer b = a; // Autoboxing
         
        // Menampilkan nilai
        System.out.println("Nilai primitif: " + a);
        System.out.println("Nilai referensi: " + b);
        
        // Mengubah nilai melalui reference
                b = 10;
         // Menampilkan nilai setelah perubahan
        System.out.println("Nilai referensi setelah diubah: " + b);

        
    }
    
}
