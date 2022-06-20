package BasicJava;

import java.util.HashMap;
public class ArrayChallengeSolution {

	    //Given a non-empty array of integers nums, every element appears twice except for one.
	    // Find that single one.
	    public int singleNumber(int[] nums) {
	        int ans=-1;
	        // create a HashMap to store key,value pairs
	        HashMap<Integer,Integer> intDictionary = new HashMap<>();
	        for (int i = 0; i < nums.length; i++) {
	            if (intDictionary.containsKey(nums[i])){
	                intDictionary.put(nums[i], 2);
	            }else {
	                intDictionary.put(nums[i], 1);
	            }
	        }
	        for (int temp:nums){
	            if (intDictionary.get(temp)==1) {ans=temp;}
	            //else {ans=-1;}
	        }
	        return ans;

	    }

}
