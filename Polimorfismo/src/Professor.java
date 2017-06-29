
public class Professor extends Employee{
	
	private float hoursMonthly;
	private float hoursValue;
	
	public Professor(String name, float hoursMonthly, float hoursValue) {
		super(name);
		this.hoursMonthly = hoursMonthly;
		this.hoursValue = hoursValue;
	}

	public float getHoursMonthly() {
		return hoursMonthly;
	}

	public void setHoursMonthly(float hoursMonthly) {
		this.hoursMonthly = hoursMonthly;
	}

	public float getHoursValue() {
		return hoursValue;
	}

	public void setHoursValue(float hoursValue) {
		this.hoursValue = hoursValue;
	}
	
	@Override
	public float getSalary() {
		return this.hoursMonthly*this.hoursValue;
	}
	
	@Override
	public String toString() {
		return "Nome: " + getName() + "\n" + "Salario: " + getSalary() + "\n";
	}
}
