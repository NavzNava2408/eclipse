
public class Conditionals2 {
	public static void main(String[] args) {
		int output = MathStuff(5,0,false);
		System.out.println(output);
	}
	
	public static int MathStuff(int x, int y, boolean z) {
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

