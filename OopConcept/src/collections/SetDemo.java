package collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        // HashSet
    	//Unordered
        //No Duplicates allowed
        HashSet<String> hs = new HashSet<>();//Using Generics

        // Adding an element to the HashSet
        hs.add("Keyboard");
        hs.add("Monitor");
        hs.add("LCD Screen");
        hs.add("Winter Wear");
        hs.add("Collect BRP");
        hs.add("Collect BRP");
        // Printing the HashSet
        System.out.println(hs.add("LCD Screen"));//Will return false
        System.out.println("HashSet: " + hs);
        
        // LinkedHashSet
    	//Ordered
        //No Duplicates allowed
        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        // Adding an element to the HashSet
        lhs.add("Keyboard");
        lhs.add("Monitor");
        lhs.add("LCD Screen");
        lhs.add("Winter Wear");
        lhs.add("Collect BRP");
        lhs.add("Collect BRP");
        // Printing the HashSet
        System.out.println(lhs.add("LCD Screen"));//Will return false
        System.out.println("HashSet: " + lhs);
        
        // TreeSet
    	//Sorted
        //No Duplicates allowed
        TreeSet<String> ts = new TreeSet<>();

        // Adding an element to the HashSet
        ts.add("Keyboard");
        ts.add("Monitor");
        ts.add("LCD Screen");
        ts.add("Winter Wear");
        ts.add("Collect BRP");
        ts.add("Collect BRP");
        // Printing the HashSet
        System.out.println(ts.add("LCD Screen"));//Will return false
        System.out.println("HashSet: " + ts);
        System.out.println("Descending HashSet: " + ts.descendingSet());
    }
}
