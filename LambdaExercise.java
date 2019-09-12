import java.util.*;

public class LambdaExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Person> people = Arrays.asList(
				new Person("Shailaja","Suresh",49),
				new Person("Parimala","Congovi",22),
				new Person("Padmaja","Prasad",52),
				new Person("Kavya","Congovi",20),
				new Person("Suresh","Congovi",50)
				);
		
		//Printing the list of people
		System.out.println("Unsorted"); 
        	printConditionally(people, p -> true);
        
        //Sorting the list By LastName
		Collections.sort(people, (a,b) -> a.getLastName().compareTo(b.getLastName()));
		
		System.out.println("Sorted"); 
			printConditionally(people, p -> true);
        
        //Printing Names whose LastName starts with 'C'
        System.out.println("List of people whose LastName start with C");
        printConditionally(people, (a) -> a.getLastName().startsWith("C"));

		// //Printing Names whose FirstName starts with 'P'
	    System.out.println("List of people whose FirstName start with P");
	    printConditionally(people, (a) -> a.getFirstName().startsWith("P"));
}
	private static void printConditionally(List<Person> people, Condition condition) {
		// TODO Auto-generated method stub
		for(Person p:people)
		{
			if(condition.test(p))
				System.out.println(p);
		}
	}
	
	interface Condition
	{
		boolean test(Person p);
	}

}
