import java.util.Scanner;

public class ArrayCreate {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Array Size: ");
		int size = s.nextInt();
		int [] n = new int[size];
		System.out.println("Enter "+ size +" values: ");
		for (int i =0; i<n.length;i++)
			n[i] = s.nextInt();
		System.out.println("Given Array Elements are: ");
		for(int i=0;i<n.length;i++)
			System.out.println(n[i]);
		//Enhanced for loop {foreach} 
		System.out.println("Given Array Elements (using foreach) are: ");
		for(int x:n)
			System.out.println(x);
		s.close();
	}

}
