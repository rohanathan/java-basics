package collections;

import java.util.*;

public class RemoveDuplicates {

	public static void main(String[] args) {
		/*List<Integer> mobileNos = new ArrayList<Integer>();
		mobileNos.add(9879);
		mobileNos.add(9875);
		mobileNos.add(9876);
		mobileNos.add(9879);
		mobileNos.add(9877);
		mobileNos.add(9879);*/
		//Collection Factory Method of()
		List<Integer> mobileNos = List.of(9879,9875,9876,9879,9877,9879);
		System.out.println("List : "+mobileNos);
		
		//Linked is ordered and no duplicates
		Set<Integer> hashUniqueMobileNos = new LinkedHashSet<Integer>();
		hashUniqueMobileNos.addAll(mobileNos);
		System.out.println("HashSet : "+hashUniqueMobileNos);
		for(Integer hMob : hashUniqueMobileNos)
		{
			System.out.println(hMob);
		}
		
		//Tree is sorted and no duplicates
		Set<Integer> treeUniqueMobileNos = new TreeSet<Integer>();
		treeUniqueMobileNos.addAll(mobileNos);//passing elements into collection
		System.out.println("Tree : "+treeUniqueMobileNos);
		for(Integer tMob : treeUniqueMobileNos)
		{
			System.out.println(tMob);
		}
	}

}
