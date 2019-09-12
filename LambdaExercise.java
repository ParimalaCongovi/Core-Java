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
        for (int i=0; i<people.size(); i++) 
            System.out.println(people.get(i));
        
        //Sorting the list By LastName
		Comparator<Person> sortByName = (Person a, Person b) -> a.getLastName().compareTo(b.getLastName());
		Collections.sort(people,sortByName);
		System.out.println("Sorted"); 
        for (int i=0; i<people.size(); i++) 
            System.out.println(people.get(i)); 
        
        //Printing Names whose LastName starts with 'C'
        System.out.println("List of people whose LastName start with C");
        people.forEach((a) -> {
        	if (a.getLastName().charAt(0) == 'C')
        		System.out.println(a);
        });
		
		}

}
