
public class NestedWhiles {

	public static void main(String[] args) {
		int A = 1;
		int B = 1;
		while (A<= 10) {
			while (B <= A) {
				if (B == A) {
					System.out.print(B + ".");
				}
				else {
					System.out.print(B +", ");
				}
				B++;
			}
			A++;
			B = 1;
			System.out.println();
		}

	}

}
