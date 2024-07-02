package threads;

class ThreadAdd extends Thread
{
	int sum;
	public void run()
	{
		for(int i =1; i<=100; i++)
			sum = sum + i;
		synchronized(this)
		{
			notify();
		}
		
	}
}

public class InterThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		ThreadAdd ts = new ThreadSum();
		ts.start();
		synchronized(ts)
		{
			ts.wait();
		}
		System.out.print("Sum = " + ts.sum);
	}

}
