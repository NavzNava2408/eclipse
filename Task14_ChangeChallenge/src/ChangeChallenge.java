
public class ChangeChallenge {

	public static void main(String[] args) {
		float bill = 20f;
		float paid = 100.57f;
		int paidpence = (int) paid*100;
		int billpence = (int) bill*100;
		int change5000 = 0, change2000 = 0, change1000 = 0, change500 = 0, change200 = 0, change100 = 0, change50 = 0, change20 = 0, change10 = 0, change5 = 0, change2 = 0, change1 = 0;
		float change = paid-bill;
		if (change>=50) {
			change5000 = (int)(change*100-change*100%5000)/5000;
			change = (float) (change*100 - (change5000*50*100))/100;
			System.out.println("50.00 " + change);
			
		}
		if (change>=20) {
			change2000 = (int)(change-change%20)/20;
			change = (float) (change*100 - (change2000*20*100))/100;
			System.out.println("20.00 " + change);

		}
		if (change>=10) {
			change1000 = (int)(change-change%10)/10;
			change = (float) (change*100 - change1000*10*100)/100;
			System.out.println("10.00 " + change);

		}
		if (change>=5) {
			change500 = (int)(change-change%5)/5;
			change = (float) (change*100 - change500*5*100)/100;
			System.out.println("5.00 " + change);
			}
		if (change>=2) {
			change200 = (int)(change-change%2)/2;
			change = (float) (change*100 - change200*2*100)/100;
			System.out.println("2.00 " + change);
		}
		if (change>=1) {
			change100 = (int)(change-change%1)/1;
			change = (float) (change*100- change100*1*100)/100;
			System.out.println("1.00 " + change);		
		}
		
		if (change>=0.50) {
			change50 = (int)((change*100)-(change*100%50))/50;
			change = (float) (change*10000 - change50*5000)/10000;
			System.out.println("50 " + change);
		}
		if (change>=0.20) {
			change20 = (int)((change*100)-(change*100%20))/20;
			change = (float) (change*10000 - change20*2000)/10000;
			System.out.println("20 " + change);
		}
		if (change>=0.10) {
			change10 = (int)((change*100)-(change*100%10))/10;
			change = (float) (change*10000 - change10*1000)/10000;
			System.out.println("10 " + change);
		}
		if (change>=0.05) {
			change5 = (int)((change*100)-(change*100%5))/5;
			change  = (float) (change*10000 - change5*500)/10000;
			System.out.println("5 " + change);
		}
		if (change>=0.02) {
			change2 = (int)((change*100)-(change*100%2))/2;
			change = (float) (change*10000 - change2*200)/10000;
			System.out.println("2 " + change);
		}
		if (change>=0.01) {
			change1 = (int)((change*100)-((change*100)%1))/1;
			change = (float)(change*10000 - change1/100*100)/10000;
			System.out.println("1 " + change);
		}
		
		System.out.println("Change needed to be given in the amount of: �" + (paid-bill));
		System.out.println("�50 notes: " + change5000);
		System.out.println("�20 notes: " + change2000);
		System.out.println("�10 notes: " + change1000);
		System.out.println("�5 notes: " + change500);
		System.out.println("�2 coins: " + change200);
		System.out.println("�1 coins: " + change100);
		System.out.println("50p coins: " + change50);
		System.out.println("20p coins: " + change20);
		System.out.println("10p coins: " + change10);
		System.out.println("5p coins: " + change5);
		System.out.println("2p coins: " + change2);
		System.out.println("1p coins: " + change1);
		System.out.println(change);
		

	}

}