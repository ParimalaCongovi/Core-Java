import java.util.function.BiConsumer;

public class ExceptionHandlingLambdas {

	public static void main(String[] args) {
		int[] arrays= { 1,2,3,4,5};
		int key =0;
		
		process(arrays, key,wrapperLambda((v,k) -> System.out.println(v/k)));
		}

	private static void process(int[] arrays,int k, BiConsumer <Integer,Integer> consumer) {
		// TODO Auto-generated method stub
		for(int v:arrays)
			consumer.accept(v, k);	
	}
	
	private static BiConsumer<Integer,Integer> wrapperLambda (BiConsumer <Integer,Integer> consumer){	
	return (v,k) ->
	{
		try {
			consumer.accept(v,k);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception");
		}
	};
}
}

