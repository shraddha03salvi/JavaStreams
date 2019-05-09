package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Creation_ofStream {

	public static void main(String[] args) {
		//create Stream using Stream.of(comma seperated values)
		  System.out.println(" create Stream using Stream.of(comma seperated values)");
		Stream<Integer> intStream = Stream.of(12,14,16,18);
		intStream.forEach(System.out::println);
		
		System.out.println("create stream using array of elements");
		
		// create stream using array of elements(primitive array,)
		Stream<Integer> intStream1 = Stream.of(new Integer[] {11,1,0,0,12,1,11});
		intStream1.distinct().forEach(System.out::println);

		System.out.println("Stream creation using List object");
		// Stream creation using List object.
		List<String> tool = Arrays.asList("Appium","Selenium","QTP","Jmeter","Loadrunner");
		Stream<String> Testtool = tool.stream();
		Testtool.sorted().forEach(System.out::println);
		
		//For "object arrays", both Arrays.stream and Stream.of returns the same output.
		
		String [] array = {"d","a","b","d","c"};
		 //Arrays.stream
		System.out.println("Stream with Object arrays with Array.stream");
		Stream<String> string1 = Arrays.stream(array);
		string1.distinct().forEach(System.out::println);
		
		
		//Stream.of
		System.out.println("Stream with Object arrays with stream.of");
		Stream<String> string2 = Stream.of(array);
		string2.sorted().forEach(System.out::println);
		
		//Create stream using generate() method  
	    // to generate 5 random Integer values 
		System.out.println("Generate random number using generate() are:");
		Stream.generate(new Random()::nextInt).limit(7).forEach(System.out::println);
		
		//Create Stream using Iterate
		System.out.println("Using iterate() printing Fibonacci series");
		Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]}).limit(10).map(n -> n[0])
		.forEach(x -> System.out.println(x));
		
		
	}

}
