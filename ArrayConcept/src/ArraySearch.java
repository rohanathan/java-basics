import java.util.Scanner;

public class ArraySearch {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Array Size: ");
		int size = s.nextInt();
		int [] n = new int[size];
		System.out.println("Enter "+ size +" values: ");
		
		for(int i =0; i <n.length;i++) {
			n[i] = s.nextInt();
		}
		
		System.out.println("Enter the value to search: ");
		int key = s.nextInt();
		
			if (search(n,key)) {
				System.out.println("Value Found");
			}
			else
				System.out.println("Value Not Found");
	s.close();
	}
	static boolean search (int[] n, int key){

		for(int i=0; i < n.length; i++) {
			if (key == n[i]) {
				return true;
			}
		}
		return false;
	}
}
