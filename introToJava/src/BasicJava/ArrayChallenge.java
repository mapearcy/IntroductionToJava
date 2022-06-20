package BasicJava;

public class ArrayChallenge {
public static void main(String[] args) {
//Given a non-empty array of integers nums, every element appears twice except for one. 
// Find that single one.
   
    
//	public int singleNumber(int[] nums) {
		 int[] nums = {2,1,4,2,1};
		 int intTwice = 0;
	   	    
		  
		    for (int i = 0; i < nums.length; i++) {
		    	for (int k =0; k < nums.length; k++) {
		            if (nums[i] == nums[k]) {
		                intTwice=intTwice+1;
		            }
		    	}
		    	if (intTwice == 1) System.out.println(nums[i]);
		    	//if (intTwice == 1) {ans=nums[i];}
		    	//else {ans = -1;}
		    	intTwice = 0;
		    	
		    }

	}
// }
	
}
