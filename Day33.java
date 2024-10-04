public class D33 {
    public static void main(String[] args) {
     //type Casting mengubah tipe data primitif ke primitif
    //Implicit Casting : mengubah Tipe yang lebih kecil ke tipe yang lebih besar.
        int a = 100000;
        long IntkeLong = a;
        System.out.println("int ke long : " + IntkeLong);
        
        byte b = 10;
        int bytekeint = b;       
        System.out.println("byte ke int : " + bytekeint);
        
        short c = 1000;
        long shortkeLong = c;    
        System.out.println("short ke long : " + shortkeLong);
        
        float d = 10.5f;
        double FloatkeDouble = d;
        System.out.println("float ke double : " + FloatkeDouble);
    
    //Explicit Casting : Mengubah tipe yang lebih besar ke yang lebih kecil
        long e = 10000000L;
        int LongkeInt = (int) e;
        System.out.println("long ke int : " + LongkeInt);
        
        int f = 100000;
        short IntkeShort = (short) f;   
        System.out.println("int ke short : " + IntkeShort);
        
        short g = 3000;
        byte ShortkeByte = (byte) g;   
        System.out.println("short ke byte : " + ShortkeByte );
        
        double h = 100.75;
        float DoublekeFloat = (float) h; 
        System.out.println("double ke float : " + DoublekeFloat);
        
        double j = 3.1;
        int doublekeint = (int) j;
        System.out.println("double ke int : " + doublekeint );
        
        float k = 9.7f;
        byte floatkeByte =  (byte) k;
        System.out.println("float ke byte : " + floatkeByte );
    }
    
}
