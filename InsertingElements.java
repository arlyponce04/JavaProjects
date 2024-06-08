/*
Exercise 16.14
Matthew Alfaro and Arly Ponce
Insert 25 random integers from 0 to 100 in order into a LinkedList object. 
Sort the elements, then calculate the sum of the elements and the 
floating-point average of elements. 
*/
import java.util.LinkedList;
import java.security.SecureRandom;
import java.util.List;
import java.util.ListIterator;
import java.util.Collections;

public class InsertingElements 
{
    public static void main (String[] args) 
    {
        LinkedList<Integer> list = new LinkedList<Integer> ();
        SecureRandom random = new SecureRandom();
        for(int i = 0; i<25; i++)
        {
            int ran = random.nextInt(101);
            list.add(ran);
        }
        Collections.sort(list);
        System.out.printf("Sorted list: %n");

        int sum = 0;
        double avg = 0.0;

        for(Integer i : list)
        {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println();

        avg = (double) sum /list.size();
        System.out.printf("Sum: %d%n", sum);
        System.out.printf("Floating-point Average: %.2f%n", avg);
    }

}
