
public class IfElseifElse {

	public static void main(String[] args) {
		int Salary;
		float Tax = 0, Net = 0;
		Salary = 3000;
		if (Salary>1000) Tax = Salary * 5/1000;
		if (Salary >=1000 && Salary < 2000) Tax = Salary * 15/100;
		if (Salary >=2000 && Salary < 3000) Tax = Salary * 17/100;
		if (Salary >=3000 && Salary < 4000) Tax = Salary * 21/100;
		if (Salary >=4000) Tax = Salary * 25/100;
		Net = Salary - Tax;
		System.out.println("Salary is: " + Salary);
		System.out.println("Tax is: " + Tax);
		System.out.println("Net is: " + Net);

	}

}
