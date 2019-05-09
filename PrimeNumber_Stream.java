package Stream;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PrimeNumber_Stream {

	public static void main(String[] args) {
		
	 IntStream.rangeClosed(2, 25)
       .filter(i -> IntStream.rangeClosed(2, (int)Math.sqrt(i))
                .allMatch(j -> i%j != 0))
      .forEach(n -> {
            System.out.println(n);
        });
//	
		int i, m = 0, flag = 0;
		Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int n =sc.nextInt();	
	      m = n / 2;
	      if (n == 0 || n == 1) 
	      {
	         System.out.println(n + " not a prime number");
	      } else 
	      {
	         for (i = 2; i <= m; i++) 
	         {
	            if (n % i == 0) 
	            {
	               System.out.println(n + " not a prime number");
	               flag = 1;
	               break;
	            }
	         }
	         if (flag == 0) {
	            System.out.println(n + " is a prime number");
	         }
	      }
	     
	      
	   }
	
	public static boolean isPrime(long n1) {
	    return LongStream.rangeClosed(2, (long) Math.sqrt(n1))
	            .allMatch(i -> n1 % i != 0);
	}
	}
	


