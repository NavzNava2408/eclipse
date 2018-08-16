
public class Array {
	public static void main(String[] args) {
		int listlength = 10;
		int Mist[] = new int[listlength]; 
		for (int i = 0; i <= listlength-1; i++) {
			Mist[i] = i+1;
		}
		for (int i : Mist) {
			System.out.println(Mathing(2,i,true));			
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
