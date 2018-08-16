
public class Results {
	private int phys = -5;
	private int chem = -5;
	private int math = -5;
	private String name;
	private float tot, per;
	
	void Physics(int a) {
		if (a>=0 && a<=150) phys = a;
//		else System.out.println(name + " has a valid mark for physics");
	}
	
	void Chemistry(int a) {
		if (a>=0 && a<=150) chem = a;
//		else System.out.println(name + " has valid mark for chemistry");
	}
	
	void Maths(int a) {
		if (a>=0 && a<=150) math = a;
//		else System.out.println(name + " has valid mark for maths");
	}
	
	void Name(String a) {
		name = a;
	}
	
	public void ShowResults() {
		int failcount = 0;
		
		if (phys < 0 || chem < 0 || math < 0) {
			System.out.println("\tInvalid marks for: " + name);
		}
		
		else if (phys < 60 || chem < 60 || math < 60) {
			if (phys<60) failcount++;
			if (chem<60) failcount++;
			if (math<60) failcount++;
			switch (failcount) {
			case 1:
				System.out.print("Retake the ");
				if (phys<60) System.out.print("Physics ");
				if (chem<60) System.out.print("Chemistry ");
				if (math<60) System.out.print("Maths ");
				System.out.println("exam "+ name);
				break;
			case 2: 
				System.out.println("Repeat the course " + name);
				break;
			case 3:
				System.out.println(name + " go home! ");
				break;
			}
		}
		
		else {
		tot = phys + chem + math;
		per = tot * 100/450;
		System.out.println("" + name + ":");
		System.out.println("Total: " + tot);
		System.out.println("Percentage: " + per);
		
		}
	}
}
