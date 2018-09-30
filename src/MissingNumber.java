
public class MissingNumber {

	public static void main(String[] args)
	{
        int a[]={1,2,3,4,5,6};
        
        //1+2+3+4+5+6+7=28
        //1+2+3+4+5+7=22
        //28-22=6
        
        int len=a.length;
        
        int sum=0;
        
        //System.out.println(len);
        
        for(int i=0;i<len;i++)
        {
        	sum=sum+a[i];
        }
        System.out.println(sum); 
        
        int sum2=0;
        
        for(int i=1;i<=7;i++)
        {
        	 sum2=sum2+i;
        }
        System.out.println(sum2); 
        
        
        System.out.println(sum2-sum);
	}

}
