
public class ReverseString {

	public static void main(String[] args) 
	{
		String s="NIKETAN";
		
		String rev="";
		
		int len=s.length();
		
		System.out.println(len);
        
		for(int i=len-1;i>=0;i--)
		{
			char m=s.charAt(i);
			rev=rev+(m);			
		}
		System.out.println(rev);
		
		StringBuffer sf=new StringBuffer(s);
		
		System.out.println(sf.reverse());
	}

}
