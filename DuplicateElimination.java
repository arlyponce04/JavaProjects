/*
Exercise 16.10
Matthew Alfaro and Arly Ponce
Read in a series of first names and eliminate duplicates by
sorting them in a set. Allow the user to search for a first name.
*/ 
import java.util.Collection;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class DuplicateElimination
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a series of first names: ");
        String firstNames = input.nextLine();
        String[] namesArray = firstNames.split("\\s+");
        Set<String> nameSet = new TreeSet<>(Arrays.asList(namesArray));
        printNonDuplicates(nameSet);
        
        String name = " ";
        while(!name.equals("Exit"))
        {
            System.out.print("Enter a name to search (type Exit when finished): ");
            name = input.nextLine();
            if(!name.equals("Exit"))
            {
            printSearch(nameSet, name);
            }
        }
    }

    private static void printNonDuplicates(Collection<String> values)
    {
        Set<String> set = new TreeSet<>(values);
        System.out.printf("%nNonduplicates are: ");
        for(String value : set)
        {
            System.out.printf("%s ", value);
        }
        System.out.println();
    }

    private static void printSearch(Set<String> set, String key)
    {
        System.out.printf("%nSearching for %s%n", key);
        if(set.contains(key))
        {
            System.out.printf("Found: %s%n", key);
        }
        else
        {
            System.out.printf("Not Found%n");
        }
    }
}