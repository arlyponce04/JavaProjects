/*
Exercise 16.13
Arly Ponce and Matthew Alfaro
Determine and print the number of duplicate words in a sentence. 
Treat uppercase and lowercase letters the same. Ignore punctuation.
*/
import java.util.TreeSet;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCounter 
{
    public static void main (String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String array = input.nextLine();
        String[] tokens = array.replaceAll("[^a-zA-Z0-9\\s]"," ").toLowerCase().split("\\s+");

        Map<String, Integer> map = new HashMap<>();

        for(String token : tokens)
        {
            
            if(map.containsKey(token))
            {
                int count = map.get(token);
                map.put(token, count + 1);
            }
            else
            {
                map.put(token, 1);
            }
            
        }

        Set<String> keys = map.keySet();
        TreeSet<String> sortedKeys = new TreeSet<>(keys);
        System.out.printf("%nDuplicated Words and their counts:%nKey\t\tValue%n");
        int duplicates = 0;
        for (String key: sortedKeys)
        {
            if(map.get(key)>1)
            {
                System.out.printf("%-10s%10s%n", key, map.get(key));
                duplicates++;
            }
        }
        System.out.printf("%nThe number of duplicate words are: %d%n", duplicates);
        System.out.printf("isEmpty: %b%n", map.isEmpty());

    }

}
