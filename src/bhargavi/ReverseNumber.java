package bhargavi;

public class ReverseNumber {

	public static void main(String[] args)
	{
		int num = 407, x = 0,a;
		int revnum = 704;
		
		while(num>0)                  //407>0    40>0   4>0
		{
			a = num % 10;             //a=7        0      4
			num = num / 10;           //num=40     4      0
			x = (x * 10)+a;            //x=7       70     704
			
		}
		if(x==revnum)
		{
			System.out.println("Number is Reversed");
		}
		else
		{
			System.out.println("Number is not Reversed");
		}
		

	}

}
