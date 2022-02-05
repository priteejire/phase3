package methods;

public class threadss extends Thread{
	
	 	public void run()
	 	{
	  		System.out.println(" thread started running..");
	}
	 	public static void main( String args[] )
	 	{
	  		threadss mt = new  threadss();
	  		mt.start();
	 	}


}
