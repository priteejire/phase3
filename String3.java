
public class String3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("hi");
		System.out.println(s1.length());

		//substring
		String sub=new String("Welcome");
		System.out.println(sub.substring(2));

		//String Comparison
		String s11="Hello";
		String s2="Heldo";
		System.out.println(s11.compareTo(s2));

		String s4="";
		System.out.println(s4.isEmpty());

		//toLowerCase
		String s5="Hello";
		System.out.println(s1.toLowerCase());
		
		//replace
		String s6="Heldo";
		String replace=s2.replace('d', 'l');
		System.out.println(replace);

		//equals
		String x="Welcome to Java";
		String y="WeLcOmE tO JaVa";
		System.out.println(x.equals(y));
 
		System.out.println("\n");
		System.out.println("Creating StringBuffer");
		//Creating StringBuffer and append method
		StringBuffer s=new StringBuffer("Welcome to Java!");
		s.append("Enjoy your learning");
		System.out.println(s);

		//insert method
		s.insert(0, 'w');
		System.out.println(s);
		//delete method
			
				
				//StringBuilder
				System.out.println("\n");
				System.out.println("Creating StringBuilder");
				StringBuilder sb1=new StringBuilder("Happy");
				sb1.append("Learning");
				System.out.println(sb1);

				System.out.println(sb1.delete(0, 1));

				System.out.println(sb1.insert(1, "Welcome"));

				System.out.println(sb1.reverse());
						
				//conversion	
				System.out.println("\n");
				System.out.println("Conversion of Strings to StringBuffer and StringBuilder");
				
				String str = "Hello"; 
		        
				//delete method
			

	}


	}




