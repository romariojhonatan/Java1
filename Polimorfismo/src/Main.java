
public class Main {

	public static void main(String[] args) {
		
		Employee[] a = new Employee[5]; 
		
		a[0] = new Professor("Roma", 50, 10);
		a[1] = new Professor("Pablo", 50, 9);
		a[2] = new Professor("Wiler", 50, 8);		
		a[3] = new Secretary("Emanuel", 100, 600);
		a[4] = new Secretary("Pietro", 1000, 600);
		
		for (Employee a1 : a) {
			System.out.println(a1);
		}
	}	
}
