
public class ReturnTypes {

	public static void main(String[] args) {
		System.out.println(SayingHello("Hello"));

	}

	public static String SayingHello(String x) {
		x = x + " World!";
		return x;
	}
}
