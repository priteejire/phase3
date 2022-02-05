package methods;

public class newmethod implements Runnable{
 
    public static int myCount = 0;
    public newmethod(){
         
    }
    public void run() {
        while(newmethod.myCount <= 10){
            try{
                System.out.println("Expl Thread: "+(++newmethod.myCount));
                Thread.sleep(500);
            } catch (InterruptedException iex) {
                System.out.println("Exception in thread: "+iex.getMessage());
            }
        }
    }
    
    public static void main(String a[]){
    	System.out.println("Starting Main Thread...");
        newmethod mrt = new newmethod();
        Thread t = new Thread(mrt);
        t.start();
        while(newmethod.myCount <= 10){
            try{
                System.out.println("Main Thread: "+(++newmethod.myCount));
                Thread.sleep(500);
            } catch (InterruptedException iex){
                System.out.println("Exception in main thread: "+iex.getMessage());
            }
        }
        System.out.println("End of Main Thread...");
    }

	
    }
    	
    

	
