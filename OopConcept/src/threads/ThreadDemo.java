package threads;

class MyThread extends Thread
{
	public void run()
	{
		//System.out.println("This is a Thread!");
		Thread t = Thread.currentThread();
		System.out.println(t);
		t.setName("Thread1");
		System.out.println(t);
	    System.out.println(t.getName());
	    t.setPriority(MAX_PRIORITY);
	    System.out.println(t);
	    System.out.println(t.getPriority());
	}
}
public class ThreadDemo {

	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
	}
}
