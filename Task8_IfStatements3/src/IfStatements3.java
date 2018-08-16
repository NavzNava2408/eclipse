
public class IfStatements3 {
	public static void main(String[] args) {
		String Name = "Dave";
		float Salary = 17000f;
		float TaxFreeAllowance = 11850f;
		float UpperBracket = 34501f;
		float Tax = 0f;
		float NetSalary = 0f;
		float TaxableAmount = Salary - TaxFreeAllowance;
		if	(Salary <= TaxFreeAllowance) {
			Tax = 0f;
			NetSalary = Salary - Tax;
			
		};
		
		if (Salary > TaxFreeAllowance) {
			Tax = (float) ((TaxableAmount)*0.2);
			NetSalary = Salary - Tax;
		}
		
		if (TaxableAmount > UpperBracket) {
			Tax = (float) (TaxableAmount - ((TaxableAmount- UpperBracket)* 0.4 + (UpperBracket-TaxFreeAllowance)*0.2));
			NetSalary = Salary - Tax;
		}
		
		System.out.println("Name: " + Name);
		System.out.println("Salary: " + Salary);
		System.out.println("Tax: " + Tax);
		System.out.println("Net Salary: " + NetSalary);
		System.out.println("Net Salary Per Month: " + (NetSalary/12));
	
	}

}
