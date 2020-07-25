package lambdastreams;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Average {
	public static void main(String[] args) 
    {
        IntStream stm = IntStream.of(68,56,122,44,99); 
        OptionalDouble avg_obj = stm.average(); 
        if (avg_obj.isPresent()) { 
            System.out.println(avg_obj.getAsDouble()); 
        } 
        else { 
            System.out.println("0"); 
        } 
    } 
}
