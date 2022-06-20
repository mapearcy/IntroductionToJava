package BasicJava;

public class SwapElements {
	
	 public static void main(String[] args){
		    int[] elements = {1, 2, 3, 4, 5};
		      
		    /*Put your code here to swap the first element with the last*/
		    int first = elements[0];
		    elements[0]= elements[(elements.length - 1)];
		    elements[(elements.length - 1)]=first;
		    //print the results 
			for (int i = 0; i < elements.length; i++){ 
				System.out.println(elements[i]); 
			} 
		   
		  }

}
