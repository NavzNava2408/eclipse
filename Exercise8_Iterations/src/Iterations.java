
public class Iterations {
	public static void main(String[] args) {
		int output = 2;
		for (int i = 1; i <= 10; i++) {
			output = Mathing(output,2,false);
			System.out.println(output);
		}		
	}
	
	public static int Mathing(int x, int y, boolean z) {
		if (x == 0 | y == 0) {
			return x + y;}
		if (z == true) {
			return x + y;
		}
		else {
			return x*y;
		}
	}
}