
public class TooHot {
	public static void main(String[] args) {
		int temperature = 95;
		boolean isSummer = false;
		System.out.println(Weather(temperature, isSummer));
	}
	
	public static boolean Weather (int temp, boolean summer) {
		int lowerlimit, upperlimit;
		lowerlimit = 60;
		if (summer == true) upperlimit = 100;
		else upperlimit = 90;
		if (temp >= lowerlimit && temp<=upperlimit) return true;
		else return false;
	}
}
