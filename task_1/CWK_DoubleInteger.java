package task_1;

public class CWK_DoubleInteger {
	
	public static int doubleInteger (int i) { return i + i; }
	
	public static void main(String [] args) {
		
		int value = 5;
		int result = doubleInteger(value);
		
		System.out.printf("Result %s", result);
	}
}