package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AnotherStream_Function {

	public static void main(String[] args) {
		//Getting maximum Number
		Integer maximum = Stream.of(56,89,600,0,106,900,900).max(Integer::compareTo).get();
		 
		//getting minimum  number
		Integer minimum = Stream.of(56,89,600,0,106,900,900).min(Integer::compareTo).get();
		 
		System.out.println("Max number is: " + maximum);
		System.out.println("Min number is: " + minimum);
		
		
		//Stream operations directly with maximum number and minimum number using Stream
		Optional<Integer> max = IntStream.of(1,2,3,4,5)
                .boxed()
                .max(Integer::compareTo);
 
System.out.println("Maximum Number is:" +max);


     Optional<Integer>min = IntStream.of(1,2,3,4,5).boxed().min(Integer::compareTo);
     System.out.println("Minimum Number is:" +min);
     
     
     //Java 8 Stream: concat, count, Examples
     List<String> list1 = Arrays.asList("Testing Tools","Testing Type","Test case ","DefectLife Cycle");
     List<String> list2 = Arrays.asList("QTP","Automation testing","Functional Testcase","New Defect");
     
     Stream<String> combination = Stream.concat(list1.stream(), list2.stream());
     System.out.println("Using Concat Method");
     combination.forEach(s->System.out.println(s));
     
//     List<String> list = Arrays.asList("Shraddha","Shruti","Swapnil","Sagar");
//     //Predicate<String> predicate = s-> s.startsWith("Sh");
  
     long  count = Stream.of(1,2,3,4,5,6,7,8,9).filter(i -> i%2 == 0).collect(Collectors.counting());
     System.out.printf("There are %d elements in the stream %n", count);
     
     long count1 = Stream.of("Shraddha","Shruti","Swapnil","Sagar").count();
     System.out.printf("There are %d elements in the stream %n", count1);
     
     //---**** Peek() method usage****-------
     //Using map() method
   Stream.of("Shraddha","Shruti","Swapnil","Sagar").map(String::toLowerCase).peek(e -> System.out.println("Mapped value: " + e))
     .collect(Collectors.toList());
   
   //Using filter() method
   Stream.of("Shraddha","Prakash","Pratima","Harshda").filter(s->s.length()>7).peek(s ->System.out.println("Filtered value :" +s))
   .collect(Collectors.toList());
     
    
	}

}
