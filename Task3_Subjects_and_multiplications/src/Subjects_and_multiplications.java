
public class Subjects_and_multiplications {
	public static void main (String[] args) {

		int intPhys, intChem, intMath, intTotal;
		float floatPer;
		intPhys = 80;
		intChem = 80;
		intMath = 100;
		intTotal = intPhys + intChem + intMath;
		floatPer = (intTotal * 100) /450;
		
		System.out.print("Phys is: " + intPhys); System.out.print(", Chem is: " + intChem); System.out.println(", Math is: " + intMath); 

		System.out.println("Total is: " + intTotal);
		System.out.println("Total is: " + floatPer);
	}
}
