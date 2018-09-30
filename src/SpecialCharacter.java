
public class SpecialCharacter {

	public static void main(String[] args)
	{
		String s="@# stri^ng nik&%$etan 123 GTY";
		
		//s.replaceAll("[^a-zA-Z0-9]", "");
		
		String m=s.replaceAll("[^a-zA-Z0-9]", " ");
		
		System.out.print(m);
    
	}

}
