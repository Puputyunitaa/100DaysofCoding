public class D17 {
    public static void main(String[] args) {
       
        char nilai1 = 'a';       
        char nilai2 = 'b';
             nilai2 = 'c';  
        final char nilai3 = 'd';
        
        char kosong;
        kosong = nilai1;
        nilai1 = nilai2;
        nilai2 = kosong;
             
        
        System.out.println(nilai1);
        System.out.println(nilai2);
        System.out.println(nilai3);
             
        
    }
}

   
   
