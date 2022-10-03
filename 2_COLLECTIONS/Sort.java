import java.util.ArrayList;
import java.util.Collections;

public class Sort {
    public static void main (String[] args) {

        // Creating list and insert values
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(7);
        list.add(4);
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(5);
        list.add(6);
        list.add(9);
        list.add(8);
        System.out.println("");

        // Print data using foreach
        System.out.println("Values inside the List: ");
        list.forEach(value -> System.out.print(value + " "));
        System.out.println("\n");

        // Sort data using Collections
        Collections.sort(list);

        // Print in sort way
        System.out.println("Values inside after sort: ");
        list.forEach(value -> System.out.print(value + " "));
        System.out.println("\n");

        //Sort Data with Collection using the reverse order
        Collections.sort(list,Collections.reverseOrder());

        // Print the reverse order
        System.out.println("Values inside after reverse sort: ");
        list.forEach(value -> System.out.print(value + " "));
        System.out.println("\n");
    }
}