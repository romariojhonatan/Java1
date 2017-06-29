
public class Secretary extends Employee {

	private float bonus;
	private float baseSalary;
	
	public Secretary(String name, float bonus, float baseSalary) {
		super(name);
		this.bonus = bonus;
		this.baseSalary = baseSalary;
	}
	
	public float getBonus() {
		return bonus;
	}
	public void setBonus(float bonus) {
		this.bonus = bonus;
	}
	public float getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(float baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	@Override
	public float getSalary() {
		return this.baseSalary+this.bonus;
	}
	
	@Override
	public String toString() {
		return "Nome: " + getName() + "\n" + "Salario: " + getSalary() + "\n";
	}
	
}
