package linearsearching;

public class isearching {
	
	public static int linear(int[]arr,int key)
	{
		for(int i=0;i<arr.length;i++)
				
				
		{
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String a[])
	{
		int[]a1= {23,12,45,32,78};
		int key=12;
		System.out.print(key+"\nfound"+isearching(a1,key));
	}
	private static int isearching(int[] a1, int key) {
		// TODO Auto-generated method stub
		return 0;
	}

}
