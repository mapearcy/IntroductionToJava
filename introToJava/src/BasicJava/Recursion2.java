package BasicJava;

public class Recursion2 {
	//Use recursion to add all of the numbers between 5 to 10.
	 public static void main(String[] args) {
		    int result = sum(5, 10);
		    System.out.println(result);
		  }
		  public static int sum(int start, int end) {
		    if (end > start) {
		      return end + sum(start, end - 1);
		    } else {
		      return end;
		    }
		  }

}
