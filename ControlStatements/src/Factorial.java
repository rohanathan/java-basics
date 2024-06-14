import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = s.nextInt();
		int f = fact(n);
		System.out.println("Factorial = " + f);
		s.close();
	}
	
	static int fact(int n)
	{
		int f = 1;
		for(int i=n; i>=1;i--)
			f = f * i;
		return f;
	}
}
