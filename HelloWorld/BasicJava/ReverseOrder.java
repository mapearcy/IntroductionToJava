package BasicJava;

public class ReverseOrder {
	public static void main(String[] args){
	    String[] cities = {"Atlanta", "Charlotte", "Dallas", "Los Angeles", "New York", "Orlando", "Philadelphia", "Seattle"};

	    /*reverse the order of the array below */

	    //print the result
	    for (int i = 0; i < cities.length; i++){
	      System.out.print(cities[i]);
	      System.out.print(",");
	    }
	    //reverse the order
	    System.out.println();
	    for (int i = (cities.length - 1); i >= 0; i--){
	      System.out.print(cities[i]);
	      System.out.print(",");
	    }
	  }

}
