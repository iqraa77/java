import java.util.Scanner;
class PrimeNumber
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
    		System.out.println("Enter a number: ");
    		int no=sc.nextInt();

    		int abc=0;
		for(int i=2;i<=no-1;i++)
		{
			if(no%i==0)
			{
				abc=abc+1;
			}
		}
		if(abc==0)
		{
    		System.out.println(no+"is a prime numnber");
		}	
		else
		{
		System.out.println(no+"is not prime numnber");
		}	
	
		}
}