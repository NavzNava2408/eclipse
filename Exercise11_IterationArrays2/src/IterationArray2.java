import java.util.Arrays;

public class IterationArray2 {
	public static void main(String[] args) {
		
		int array[] = new int[10];
		for (int i = 0; i <= array.length -1; i++) {
			array[i] = i+1;
		}
		
		System.out.println(Arrays.toString(array));
		for (int i = 0; i < array.length; i++) {
			array[i] *= 10; 
		
		}
		System.out.println(Arrays.toString(array));
		
		
	}
}
