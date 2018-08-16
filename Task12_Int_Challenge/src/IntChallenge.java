
public class IntChallenge {
	public static void main(String[] args) {
		int x;
		x = 56;
		//System.out.println((int)(((int)(x/10)) + ((int)(x-(x/10)))));
		System.out.println((int)(x/10 + (x-(x/10)*10)));
	}
}
