package java8;

@FunctionalInterface
interface Phone {
	void call(int no);
}

/*
 * class AndroidPhone implements Phone {
 * 
 * @Override public void call() { System.out.println("Calling!"); } }
 */
public class LambdaDemo {
	public static void main(String[] args) {
		/*
		 * Phone p = new AndroidPhone(); p.call();
		 */
		//Anonymous Inner Class
		
		/*Phone p = new Phone()
				{
					public void call()
					{
						System.out.println("Calling!");
					}
				};
				p.call();*/
		
		//Using Lambda Expressions
		/*Phone p = () -> {System.out.println("Calling!");};
		p.call();*/
		Phone p = (no) -> {System.out.println("Calling: "+ no);};
		p.call(9176486);
	}
}

