import java.util.Scanner;

public class BandApp {
	
	static Scanner s = new Scanner(System.in);
	static int addingIndex = 0;

	public static void main(String[] args) {
	
	String[] band = new String[5];
	int decision = 0;
	
	while(decision != -1) {
		showMenu();
		decision = s.nextInt();
		
		if (decision < -1 || decision >5) {
			System.out.println("Please pick an option.");
		} else if (decision == 1) {
			showBands(band);
		} else if (decision == 2) {
			showBand(band);
		} else if (decision == 3) {
			addBand(band);
		} else if (decision ==4) {
			deleteBand(band);
		} else {
			deleteAllBands(band);
		}
	}

	}
	
	public static void deleteAllBands(String[] band) {
		for (int i = 0; i <band.length; i++) {
			band[i] = null;
		}
	}

	public static void deleteBand(String[] band) {
		System.out.println("Which band would you like to delete?");
		int bandToDelete = s.nextInt();
		if (isValid(bandToDelete)) {
			band[bandToDelete] = null;
		}
	}
	
	public static void showBands(String[] band) {
		System.out.println("Bands:");
		for (int i = 0; i < band.length; i++) {
			System.out.println(i + ": " + band[i]);
		}
	}
	
	public static void showBand(String[] band) {
		System.out.println("Which band would you like to see? ");
		int bandNumber = s.nextInt();
		if (isValid(bandNumber)) {
			System.out.println(bandNumber + ": " + band[bandNumber]);
		}
	}
	
	public static void addBand(String[] band) {
		System.out.println("Enter new band name: ");
		String newBand = s.next();
		if (isValid(addingIndex)) {
			band[addingIndex++] = newBand;
			
			}
		}
	
	public static boolean isValid(int input) {
		if (input >= 0 && input < 5) {
			return true;
		} else {
			System.out.println("Invalid entry. ");
			return false;
		}
	}
	
	public static void showMenu() {
		System.out.println("Please pick an option or enter -1 to exit. ");
		System.out.println("1) Show Bands");
		System.out.println("2) Show a Band");
		System.out.println("3) Add a Band");
		System.out.println("4) Delete a Band");
		System.out.println("5) Delete All Bands");
	}
	
}
