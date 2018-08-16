
public class ForLoops {
	public static void main(String[] args) {
		for (int A = 1; A <= 10; A++) {
			System.out.println("Times table of: " + A);
			System.out.println("----------------");
				for(int B = 1; B <= 10; B++) {
					System.out.println(A + " x " + B + " = " + (B*A));
				}
			System.out.println();
	}

	}
}
