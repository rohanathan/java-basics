package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Using generics with ArrayList
        ArrayList<Object> al = new ArrayList<>();
        al.add(5); // auto-boxing - convert primitive to reference and vice versa
        al.add("Rohan");
        al.add("The CNDev Guy!");
        al.add(14);
        al.add(14); // Duplicates allowed
        al.add("Glasgow");
        System.out.println(al);
        al.add(3, "The DEV Guy!"); // add at index (index, value)
        System.out.println(al);
        al.remove(4); // remove first 14
        System.out.println(al);
        String s = (String) al.get(5); // type casting based on hierarchy
        System.out.println(s);
        int i = (int) al.get(4);
        System.out.println(i);
        System.out.println("Size " + al.size()); // Size 6

        // Using generics with LinkedList
        LinkedList<Object> ll = new LinkedList<>();
        ll.add(5); // auto-boxing - convert primitive to reference and vice versa
        ll.add("Rohan");
        ll.add("The CNDev Guy!");
        ll.add(14);
        ll.add(14); // Duplicates allowed
        ll.add("Glasgow");
        System.out.println(ll);
        ll.add(3, "The DEV Guy!"); // add at index (index, value)
        System.out.println(ll);
        ll.remove(4); // remove first 14 (fixed)
        System.out.println(ll);
        String s1 = (String) ll.get(5); // type casting based on hierarchy
        System.out.println(s1);
        int i1 = (int) ll.get(4);
        System.out.println(i1);
        System.out.println("Size " + ll.size()); // Size 6
    }
}


/*package collections;
import java.util.*;
public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList al = new ArrayList(); 
		//Ordered
		al.add(5);
		//auto-boxing- convert primitive2reference vice versa
		//before al.add(new Integer(5))
		al.add("Rohan");
		al.add("The CNDev Guy!");
		al.add(14);
		al.add(14); //Duplicates allowed
		al.add("Glasgow");
		System.out.println(al);
		al.add(3,"The DEV Guy!");//replace (index,value)
		System.out.println(al);
		al.remove(4);//remove first 14
		System.out.println(al);
		String s = (String) al.get(5); //type casting based on hierarchy
		System.out.println(s);
		int i = (int) al.get(4);
		System.out.println(i);
		System.out.println("Size " + al.size()); //6
		
		LinkedList ll = new LinkedList(); 
		//Ordered
		ll.add(5);
		//auto-boxing- convert primitive2reference vice versa
		//before al.add(new Integer(5))
		ll.add("Rohan");
		ll.add("The CNDev Guy!");
		ll.add(14);
		ll.add(14); //Duplicates allowed
		ll.add("Glasgow");
		System.out.println(ll);
		ll.add(3,"The DEV Guy!");//replace (index,value)
		System.out.println(ll);
		al.remove(4);//remove first 14
		System.out.println(ll);
		String s1 = (String) ll.get(4); //type casting based on hierarchy
		System.out.println(s1);
		int i1 = (int) ll.get(4);
		System.out.println(i1);
		System.out.println("Size " + ll.size()); //6
	}
}*/
