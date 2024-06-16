import java.util.Scanner;

public class BigThreeConditonal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any three integers: ");
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int n3 = s.nextInt();
		int big = (n1 > n2 && n1 > n3) ? n1 : (n2 > n3) ? n2 : n3;
		System.out.println("The biggest number is: " + big);
		s.close();
	}

}
