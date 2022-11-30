package predicate.joining.AND.one;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MainPerdicator 
{
	public static void main(String[] args) 
	{
		Person p1 = new Person("Chetan",22);
		Person p2 = new Person("Dhanu",18);
		Person p3 = new Person("Shahi",13);
		Person p4 = new Person("Gopi",77);
		Person p5 = new Person("Manu",82);
		Person p6 = new Person("Nandi",12);
		
		Predicate<Person> predicateAgeGreaterthan = (person) -> person.getPersonAge()>=18;
		
		Predicate<Person> predicateAgeLessthan = (person) -> person.getPersonAge()<=61;
		
		
		List<Person> persons = Arrays.asList(p1,p2,p3,p4,p5,p6);
		
		for(Person person : persons)
		{
			Predicate<Person> finalPredicate = predicateAgeGreaterthan.and(predicateAgeLessthan);
		boolean status = finalPredicate.test(person);
		if(status==true)
		{
			System.out.println(person.getPersonName());
		}
		}
		
		
		
		

		
	}

}
