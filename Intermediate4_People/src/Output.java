
public class Output {
	public static void main(String[] args) {
		Person peter, smith, jack;
		peter = new Person();
		peter.name = "Peter";
		peter.age = "24";
		peter.jobTitle = "Clown";
		smith = new Person();
		smith.name = "Smith";
		smith.age = "32";
		smith.jobTitle = "Landlord";
		jack = new Person();
		jack.name = "Jack";
		jack.age = "28";
		jack.jobTitle = "Barkeep";
		
		
		String peterArray[] = {peter.name, peter.age, peter.jobTitle};
		String smithArray[] = {smith.name, smith.age, smith.jobTitle};
		String jackArray[] = {jack.name, jack.age, jack.jobTitle};
		
		String peopleArray[][] = {peterArray, smithArray, jackArray};
		
		//Print each entry in the array of the array.
		// Ctrl + / from here to (a)...
		for (String indarray[] : peopleArray) {
			for (String j : indarray) {
				System.out.println(j);
			}
		}
		// ... (a) here to block out printing of all values
		
		//Search function
		// Ctrl + / from here to (b)...
		String searchedArray[] = Search("Peter", peopleArray);
		if (searchedArray == null) {
			System.out.println("Name not found in Array");
		}
		else {
			for (String i: searchedArray) {
				System.out.print(i + ", ");
			}
		}
		//... (b) here to block out searching
	}
	
	public static String[] Search(String name, String arraybig[][]) {
		for (String indarray[] : arraybig) {
			if (indarray[0] == name) {
				return indarray;
				}
			}
		return null;
	}
}

