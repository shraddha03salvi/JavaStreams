package Stream;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class Stream_Function {

	public static void main(String args[]) 
	 {
		
		//List<Integer> myList = new ArrayList<Integer>();
		//for(int i=0; i<10; i++) myList.add(i);
		
		
		
		 // demonstration of map method 
		List<Integer> number = Arrays.asList(2,3,4,5);
		 List<Integer> square = number.stream().map(x -> x*x).collect(Collectors.toList());
		 System.out.println("Result is" +square);
		
		 
		// create a list of String 
		    List<String> names = Arrays.asList("Swapnil","Shraddha","Harshu","vivek");
		 // demonstration of filter method 
		 List<String> result = names.stream().filter(s ->s.startsWith("S")).collect(Collectors.toList());
		    System.out.println("Result for Names" +result);
		 // demonstration of sorted method 
		    List<String> show = names.stream().sorted().collect(Collectors.toList());
		    System.out.println("Names are sorted" +show);
		 
		    // create a list of integers 
		  List<Integer> number1 = Arrays.asList(3,5,7,9,3,5);
		  // collect method returns a set 
		  Set<Integer> squareSet = number1.stream().map(y -> y*y).collect(Collectors.toSet());
		  System.out.println("Given set is "+squareSet); 
		   
		  
		// create a list of String 
		    List<String> names1 = Arrays.asList("Swapnil","Shraddha","Harshu","vivek");
		 // demonstration of filter method 
		 List<String> result1 = names.stream().filter(s ->s.endsWith("l")).collect(Collectors.toList());
		 System.out.println("Names endwith" +result1);
		 
		/*--Terminal Operations---*/ 
		// demonstration of forEach method 
		 number.stream().map(x -> x*x).forEach(y ->System.out.println(y));
		
		// demonstration of reduce method 
		int odd = number.stream().filter(x->x%2!=0).reduce(0,(ans,i)-> ans+i); 
		System.out.println("odd numbers are"  +odd);
		
		//demonstration of collect() method 
	List<Integer> even = number.stream().filter(x->x%2==0).collect(Collectors.toList());
	System.out.println("Even numbers are" +even);
		 
	List<Integer> odd1 = number.stream().filter(x->x%2!=0).collect(Collectors.toList());
	System.out.println("odd numbers are" +odd1);
	
	//creates a stream of natural numbers:
	Stream<Long> numberprint = Stream.iterate(1L, n  ->  n  + 1).limit(10);
	numberprint.forEach(System.out::println);
	       //Generate 
	
	Stream.generate(Math::random).limit(10).forEach(System.out::println);
	
	
//	int sum = 0;
//    for (int n : number) {
//      if (n % 2 == 1) {
//        int square1 = n * n;
//        sum = sum + square1;
//      }
//    }
   // System.out.println(sum);
    
    int sum1 = number.stream().filter(n -> n % 2  == 1).map(n  -> n * n).reduce(0, Integer::sum);
    System.out.println("Addition is" +sum1);
           
           
 // the current date 
    LocalDate date = LocalDate.now(); 
    System.out.println("the current date is "+ 
                        date); 
    // the current time 
    LocalTime time = LocalTime.now(); 
    System.out.println("the current time is "+ 
                        time); 
       
    
    
	}
	
	
	
}
