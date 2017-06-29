package wrapper;

public class Wrapper {
	
	public static void main(String[] args) {
		int a = 1;
		System.out.println(a);
		
		Integer b = new Integer(2);
		Integer c = 3; //Autoboxing
		int d = c; //Autounboxing
		System.out.println(b);
	}
}
