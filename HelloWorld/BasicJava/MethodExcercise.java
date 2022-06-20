package BasicJava;

public class MethodExcercise {
	public static void main(String[] args) {
		MethodExcercise me = new MethodExcercise();
		
		double num = me.randomNumber();
		char[] alphabet = me.getAlphabetArray();
		double [] square =me.square(1, 2, 3, 4);
		
		System.out.println(num);
		System.out.println(alphabet);
		for (int i = 0; i < square.length; i++){
			System.out.print(square[i]);
			System.out.print(",");
        }
	
	}
	
	public double randomNumber() {
		//int result = (int) (Math.random() * 50) + 1;
		double result = Math.random();
		result = Math.PI;
		return result;
	}
	
	public char[] getAlphabetArray() {
		char[] letters = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		return letters;
	}
	
	public double[] square(int a, int b, int c, int d) {
		  double[] result = {a*a, b*b, c*c, d*d};
		  return result;
		}
	
	public String findFirstWord(String a, String b) {
		  //convert Strings to array for iterating over
		  char[] aArray = a.toCharArray();
		  char[] bArray = b.toCharArray();
		  
		  //loop through letters of each
		  for (int i = 0; i < aArray.length; i++) {
			  //if letter in a comes before b, then return a
			  if (aArray[i] < bArray[i]) {
				  return a;
			  }
			  
			  //check if letter in b comes before a
			  if (aArray[i] > bArray[i]) {
				  return b;
			  }
			  
			  //otherwise they are equal and you can move to the next letter
		  }
		  
		  //you need this line in case the above loop doesn't return anything.
		  //this is for the compiler. 
		  return a;
	  }

}
