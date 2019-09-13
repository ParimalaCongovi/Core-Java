import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FunctionInterfaceExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Person> people = Arrays.asList(
				new Person("Shailaja","Suresh",49),
				new Person("Parimala","Congovi",22),
				new Person("Padmaja","Prasad",52),
				new Person("Kavya","Congovi",20),
				new Person("Suresh","Congovi",50)
				);
		
		//Printing the list of people using forEach method
		System.out.println("Unsorted"); 
        	people.forEach(System.out::println);
        
        //Sorting the list By LastName
		Collections.sort(people, (a,b) -> a.getLastName().compareTo(b.getLastName()));
		
		System.out.println("Sorted"); 
			performConditionally(people, p -> true, p -> System.out.println(p));
        
        //Printing Names whose LastName starts with 'C'
        System.out.println("List of people whose LastName start with C");
        performConditionally(people, (a) -> a.getLastName().startsWith("C"), System.out::println); //Method Reference [ p -> System.out.println(p) == System.out::println]

		// //Printing Names whose FirstName starts with 'P'
	    System.out.println("List of people whose FirstName start with P");
	    performConditionally(people, (a) -> a.getFirstName().startsWith("P"), p -> System.out.println(p.getFirstName()));
}
	private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
		// TODO Auto-generated method stub
		for(Person p:people)
		{
			if(predicate.test(p))
				consumer.accept(p);
		}
	}
	
}
