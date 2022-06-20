package BasicJava;
import java.util.Scanner;
public class ScannerUserInput {
	public static void main(String[] args) {
		//invoke method
		mover();
	}
	
	public static void mover() {
		//Create scanner
		Scanner scanner = new Scanner(System.in);
		boolean exit = false;
		
		//Print menu
		System.out.println("Please type in one of the following then press enter:");
		System.out.println("* 1 - Move Right");
		System.out.println("* 2 - Move Left");
		System.out.println("* 3 - Move Up");
		System.out.println("* 4 - Move Down");
		System.out.println("* q - exit program");

		while (scanner.hasNext()) {
			//Get input
			String input = scanner.next();
			//Depending on input print appropriate value
			switch (input) {
				case "1": {
					System.out.println("Moving Right");
					break;//Breaks out of the switch statement- not the loop
				}
				case "2": {
					System.out.println("Moving Left");
					break;
				}
				case "3": {
					System.out.println("Moving Up");
					break;
				}
				case "4": {
					System.out.println("Moving Down");
					break;
				}
				case "q": {
					exit = true;
					break;
				}
				default: {
					System.out.println("Try again. Acceptable "
							+ "input: [1 - Move right, "
							+ "2 - Move Left, 3 - Move Up, "
							+ "4 - Move Down, q - exit program]");
				}
			}
			//Check if the user chose to exit
			if (exit) {
				System.out.println("Exiting program...");
				break; //This breaks out of the while loop
			}
			//Prompt the user for next choice if they haven't quit
			System.out.println("Choose your next move.");
		}
		
		//Close the scanner
		scanner.close();
	}

}
