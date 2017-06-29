package classe_Abstract;

public abstract class Person {

	private String nome;

	public Person(String nome) {
		super();
		this.nome = nome;
	}
	public abstract void chuchu();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public static void main(String[] args) {
		/*
		 * Não se pode instanciar uma classe abstrata
		 */
		// new Person("Seu Madruaga");
	}

}
