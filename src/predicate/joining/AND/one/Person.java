package predicate.joining.AND.one;

public class Person 
{
	private String personName;
	private Integer personAge;
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public Integer getPersonAge() {
		return personAge;
	}
	public void setPersonAge(Integer personAge) {
		this.personAge = personAge;
	}
	@Override
	public String toString() {
		return "Person [personName=" + personName + ", personAge=" + personAge + "]";
	}
	public Person(String personName, Integer personAge) {
		super();
		this.personName = personName;
		this.personAge = personAge;
	}
	
	

}
