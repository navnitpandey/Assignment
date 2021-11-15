import java.util.Scanner;
public class CountSumOfdegits {
	public static void main(String[] args) {
		//int num=1234;
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int rem, sum=0;
		while(num>0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;			
		}
		System.out.println("Sum of degits is : "+sum);
	}
}
