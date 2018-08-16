
public class Blackjack {
	public static void main(String[] args) {
		int a = (int)(Math.random()*30 + 1);
		int b = (int)(Math.random()*30 + 1);
		
		System.out.println("Player with: " + a);
		System.out.println("Dealer with: " + b);
		System.out.println(BlackjackResults(a, b));
	
	}
	
	public static String BlackjackResults(int x, int y) {
		if (x > 21 && y > 21) return ("Both Bust: 0, Dealer wins");
		else if (x == y) return ("Draw at: " + y);
		else if (x > 21 || y > 21) {
			if (x > 21) return ("Player Bust. Dealer wins with: " + y);
			else return("Dealer Bust. Player wins with: " + x);
		}
		else if (x>y) return("Player wins with: " + x);			
		else return("Dealer wins with: " + y);
	}
}

