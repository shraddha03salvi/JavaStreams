package Stream;

import java.util.OptionalInt;
import java.util.PrimitiveIterator;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Reduce_LongStream {

	public static void main(String[] args) 
	
	{     //Range with Reduce
		OptionalInt reduced =
				  IntStream.range(1, 4).reduce((a, b) -> a + b);
		System.out.println("Reduced number using range are" + reduced);
		
		
		int reducedTwoParams =
				  IntStream.range(1, 4).reduce(10, (a, b) -> a + b);
		System.out.println("Reduced number using range are" + reducedTwoParams);
		
		// Stream of Primitives(three new special interfaces were created: IntStream, LongStream, DoubleStream.)
		IntStream intStream = IntStream.range(1, 6);
		// Using IntStream iterator() to return 
        // an iterator for elements of the stream 
		System.out.println("Numbers are display using range and IntStream"  );
        PrimitiveIterator.OfInt answer = intStream.iterator(); 
        // Displaying the stream elements 
        while (answer.hasNext()) { 
            System.out.println(answer.nextInt()); 
  
		
////		//--LongStream
//            System.out.println("Numbers are printed using range closed and LongStream"  );
//		LongStream Stream = LongStream.rangeClosed(1L, 3L);
//		Stream.forEach(System.out::println); 
//		
//		//---DoubleStream
//	Random random = new Random();
//	DoubleStream doubleStream = random.doubles(3);
//	doubleStream.forEach(System.out::println); 
//		System.out.println("Numbers are"  +doubleStream );
	}

}}
