package ponteiro;

public class Main {
	public static void main(String[] args) {
		Person p1, p2, p3, p4;
		
		p1 = new Person("Jorge");
		p2 = new Person("Iara");
		p3 = p1;
		p4 = new Person("Roma");
		//p1.setName("a");
		p1 = new Person("b");
		
		System.out.println(p1.getName());
		System.out.println(p2.getName());
		System.out.println(p3.getName());
		System.out.println(p4.getName());
		
	}

}
