package exceptions;

class AgeException extends Exception
{
	AgeException(String msg)
	{
		super(msg);
	}
	AgeException(){}
}

class Customer
{
	void setAge(int age) throws AgeException
	{
		if (age < 18 || age > 60)
			throw new AgeException("Age should be between 18 and 60.");
		else
			System.out.println("Your age: "+ age);
	}
}
public class CustomException {

	public static void main(String[] args) {
		Customer c = new Customer();
		try {
			c.setAge(21);
		} catch (AgeException e) {
			System.err.println(e);
		}
	}

}
