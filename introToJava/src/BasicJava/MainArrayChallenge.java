package BasicJava;

public class MainArrayChallenge {
	//Given a non-empty array of integers nums, every element appears twice except for one.
    // Find that single one.
	    public static void main(String[] args) {
	        ArrayChallengeSolution solutionClass = new ArrayChallengeSolution();
	        int[]  intArray = {2,2,1,2,5,1};
	        int answer = solutionClass.singleNumber(intArray);
	        if (answer != -1) {System.out.println("The single entry value in this array is : " + answer);}
	        else {System.out.println("There are no single entry values in the array");}
	    }
}
