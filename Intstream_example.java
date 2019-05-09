package Stream;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Intstream_example {

	public static void main(String[] args) {
		System.out.println("---Using Intstream with rangeClosed---");
		IntStream.rangeClosed(10,13).map(n -> n*n).forEach(System.out::println);
		
		System.out.println("---Using Instream with range-----");
		IntStream.range(10,13).map(n -> n*n).forEach(System.out::println);
		
		System.out.println("---sum of the range 1 to 20----");
		System.out.print(IntStream.rangeClosed(1,20).sum());
		
		System.out.println("\n--Sorted number--");
		IntStream.of(34,12,45,34,10,2).sorted().forEach(System.out::println);
		
	//java.util.stream.LongStream is a sequence of primitive long values and aggregate operations
	//	are performed using sequential and parallel operations.	
		
		System.out.println("---Using LongStream with rangeClosed-----");
		LongStream.rangeClosed(11,14).map(n ->n*n).forEach(System.out::println);
		
		System.out.println("\n--Using LongStream.range--");
		LongStream.range(11,14).map(n->n*n).forEach(System.out::println);
		
		
		System.out.println("-----Using DoubleStream ----");
		DoubleStream.of(5.33,2.34,5.32,2.31,3.51).map(d->d*1.5).forEach(System.out::println);
		
		System.out.println("\n--Using DoubleStream.average--");
		double val = DoubleStream.of(12.1,11.2,13.3).average().getAsDouble();
		System.out.println(val);
		
		System.out.println("--Using DoubleStream.max--");
		val = DoubleStream.of(12.1,11.2,13.3).max().getAsDouble();
		System.out.println(val);
		
		
		
				
	}

}
