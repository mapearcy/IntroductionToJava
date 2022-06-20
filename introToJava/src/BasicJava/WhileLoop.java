package BasicJava;

public class WhileLoop {
	

		public static void main(String[] args) {
			int i = 1;
			char letter = 'a';
			char end = 'z';
		    byte[] b = {1, 2, 3, 4, 8, 16, 32, 64, 67, 120};
		    
		    
			while (i <= 10) {
				System.out.println(i);
				i++;
			}
			

		    do{
		      System.out.print(letter);
		      letter++;
		    } while (letter <= end);
		    
		
	         
	         for (int k = 0; k < b.length; k++) {
	        	 System.out.print(b[k]);
	        	 System.out.print(",");
	         }
	         
	       
	         
		}
	

}
