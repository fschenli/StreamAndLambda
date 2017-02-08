package evolution.collectionSort;

public class AnyEntity {
	private String name;
	private Integer age;
	private Double salary;
	
	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public AnyEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AnyEntity(String name, Integer age, Double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "AnyEntity [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
}
