import java.util.Arrays;
import java.util.List;

public class StreamExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Person> people = Arrays.asList(
				new Person("Shailaja","Suresh",49),
				new Person("Parimala","Congovi",22),
				new Person("Padmaja","Prasad",52),
				new Person("Kavya","Congovi",20),
				new Person("Suresh","Congovi",50)
				);
		
		//Using Streams to print the firstNames of people whose LastName starts with "C"
		people.stream()
		.filter(p -> p.getLastName().startsWith("C"))
		.forEach(p -> System.out.println(p.getFirstName()));
	}
}
