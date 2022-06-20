package BasicJava;

public class MethodExcercise {
	public static void main(String[] args) {
		MethodExcercise me = new MethodExcercise();
		
		double num = me.randomNumber();
		char[] alphabet = me.getAlphabetArray();
		double [] square =me.square(1, 2, 3, 4);
		String runFirstWord = me.findFirstWord("Pearcy", "Mark");
		//create some dummy data for our method backward linear search
     	char letter = 'm';
     	char[] letters = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
			's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
     	int indexMatch = me.findIndexBackwards(letter, letters);

         System.out.println(num);
         System.out.println(alphabet);
         for (int i = 0; i < square.length; i++){
             System.out.print(square[i]);
             System.out.print(",");
         }
         System.out.println();         
         System.out.println(runFirstWord);
         System.out.println(letter + " is at position " + indexMatch + " in the array");
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
	  public int findIndexBackwards(char target, char[] data) {
		if (data == null ) return -1;
		
		int result = -1;
		
		//loop through the data
		for (int i = data.length - 1; i > -1; i--) {
			
			char temp = data[i];
			
			//test current element against target
			if (temp == target) {
				return i;
			}
		}
		
		return result;
	  }

	  
}
