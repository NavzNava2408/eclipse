
public class School {
	public static void main(String[] args) {
		Results peter, smith, jack, liam;
		
		peter = new Results();
		smith = new Results();
		jack = new Results();
		liam = new Results();
		
		peter.Name("Peter");
		peter.Physics(50);
		peter.Chemistry(70);
		peter.Maths(100);
		peter.ShowResults();
		
		smith.Name("Smith");
		smith.Physics(95);
		smith.Chemistry(92);
		smith.Maths (95);
		smith.ShowResults();
		
		jack.Name("Jack");
		jack.Physics(32);
		jack.Chemistry(26);
		jack.Maths(98);
		jack.ShowResults();	
		
		liam.Name("Liam");
		liam.Physics(32);
		liam.Chemistry(26);
		liam.Maths(28);
		liam.ShowResults();	
		
	}

}