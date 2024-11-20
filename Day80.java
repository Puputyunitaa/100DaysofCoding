public class D80 {

	public static void main(String[] args) 
	{ 
	
		String p = " eakk "; 
             
		System.out.println("kata : " + p); 
		System.out.println("panjang huruf : " + p.length()); ;

		
		String p1 = p.trim(); 
		System.out.println("kata : " + p1); 
		System.out.println("panjang huruf : " + p1.length()); 

		if (p == p1) { 
			System.out.println("sama"); 
		} 
		else { 
			System.out.println("tidak sama"); 
		} 
	} 
}
