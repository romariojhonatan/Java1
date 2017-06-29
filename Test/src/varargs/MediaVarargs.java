package varargs;

public class MediaVarargs {
	
	public static int media(int a, int b, int... var){
			
		int result = a + b;
		for (int v : var) {
			result += v;
		}
		int media = result / (2 + var.length);
			
		return media;
	}
	
	public static void main(String[] args) {
		System.out.println(media(10, 10, 10, 5, 5));
	}
}
