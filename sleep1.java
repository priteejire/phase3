package methods;

public class sleep1 extends Thread {
	public void run(){  
		System.out.println("thread is running...");  
		}  
		public static void main(String args[]){  
		sleep1 t1=new sleep1();  
		t1.start();  
		 }  
		}  

	