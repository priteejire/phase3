
public class Innerdemo {
 private String msg="Welcome to home"; 
	 
	 class Inner{  
	  void hello(){System.out.println(msg+", Let us start learning Inner Classes");}  
	 }  


	public static void main(String[] args) {

		Innerdemo obj=new Innerdemo();
		Innerdemo.Inner in=obj.new Inner();  
		in.hello();  
	}
}




