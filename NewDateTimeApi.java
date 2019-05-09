package Stream;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class NewDateTimeApi {
	public static void main(String args[]) {
	 // the current date 
    LocalDate date = LocalDate.now(); 
  System.out.println("the current date is " +date);
  
    // the current time 
    LocalTime time = LocalTime.now(); 
    
    System.out.println("the current time is " +time);
   
    // will give us the current time and date 
    LocalDateTime current = LocalDateTime.now(); 
    System.out.println("current date and time : "+ 
                        current); 
    
    // to print in a particular format 
    DateTimeFormatter format =  
      DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");   
    
    String formatedDateTime = current.format(format);   
     
    System.out.println("in foramatted manner "+ 
                        formatedDateTime); 
    //  printing months days and seconds 
    Month month = current.getMonth();
    System.out.println("Current month is"+month);
    
    int day = current.getDayOfMonth();
    System.out.println("Current day of this month is" +day);
    
    int day1 = current.getDayOfYear();
    System.out.println("Current day of this year is" +day1);
    
    // printing some specified date 
    LocalDate date1 = LocalDate.of(2020, 8, 15);
    System.out.println("the independence day :"+date1); 
    
    
    // printing date with current time. 
    LocalDateTime specificDate =  
        current.withDayOfMonth(12).withYear(2019); 
  
    System.out.println("specfic date with "+ 
                       "current time : "+specificDate); 
}
}