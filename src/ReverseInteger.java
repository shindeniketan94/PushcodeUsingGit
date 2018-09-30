
public class ReverseInteger {

	public static void main(String[] args)
	{
		  
		long i=774858947;
		
		long rev=0;
		
		while(i!=0)
		{
			
			rev=rev*10+i%10;
			
			i=i/10;
			
			
		}
		System.out.println(rev);
		
		
		//Using string buffer
		
		long num1=85412;
		
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
		
		
		
		
		
		
		
		
	}

}
