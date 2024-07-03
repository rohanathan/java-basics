package collections;

import java.util.*;

public class GenericCollection {

	public static void main(String[] args) {
		LinkedList<String> lls = new LinkedList<String>(); //add reference type not primitive
		lls.add("R0HAN");
		lls.add("14-Dec-1996");
		lls.add("rohanathan.s@outlook.com");
		System.out.println(lls);
		for(String s: lls) {
			System.out.println(s);
		}
		
		LinkedList<Integer> lli = new LinkedList<Integer>(); //add reference type not primitive
		lli.add(1996);
		lli.add(12);
		lli.add(14);
		System.out.println(lli);
		for(Integer i: lli) {
			System.out.println(i);
		}
		
	}

}
