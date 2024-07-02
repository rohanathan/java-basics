package threads;

class ThreadR implements Runnable
{
	@Override
	public void run()
	{
		for(int i = 1; i <=10; i++)
			System.out.print(" "+i);
	}
}

public class RunnableThreadDemo {

	public static void main(String[] args) {
		ThreadR r1 = new ThreadR();
		Thread t = new Thread(r1);
		t.start();
	}
}
