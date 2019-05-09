package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Parallel_Stream {

	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<Integer>();
		for(int i=1;i<=20;i++) 
		{
			
			myList.add(i);
			}
		System.out.println("Array List:" +myList);
		//Sequential Stream
		System.out.println("====sequential stream======");
		Stream<Integer> sequentialStream = myList.stream();
		
		Stream<Integer> evennumbers = sequentialStream.filter(x->x%2==0);
		
		evennumbers.forEach(x -> System.out.println("sequential even numbers ="+x));
		//sequentialStream.forEach(System.out::println);
		
			//parallel Stream
		System.out.println("====parallel stream======");
		Stream<Integer> parallelStream = myList.parallelStream();
		
		Stream<Integer> evennumbers1 =parallelStream.filter(x->x%2==0);
		
		evennumbers1.forEach(x -> System.out.println("parallel even numbers ="+x));
		
		
		
	}

}
