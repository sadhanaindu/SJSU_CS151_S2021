import java.util.ArrayList;

public class ShapeExecutor extends Thread {
	
	private Thread executionThread;
	private String threadName;
	private Shapes s;
	
	public ShapeExecutor(String name, Shapes s)
	{
		threadName = name;
		this.s = s;
	}
	
	public void run()
	{
		s.compute();
		System.out.println("\nThread " + this.threadName + " is exiting\n");
		
	}
	
	public void start()
	{
		System.out.println("\nThread " + this.threadName + " is starting\n");
		try
		{
			executionThread = new Thread(this, this.threadName);
			executionThread.start();
		}catch(NullPointerException e) {
			System.out.println(e);
		}
	}

}
