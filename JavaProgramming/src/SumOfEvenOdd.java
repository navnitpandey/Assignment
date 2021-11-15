import java.util.Scanner;
public class SumOfEvenOdd {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter int");
	int n=sc.nextInt();
	int even=0;
	int odd=0;
	while(n!=0)
	
	{
		
		int r=n%10;
		
		if(r%2==0) {
			even=even+r;
			
		}
		else
			odd=odd+r;
		n=n/10;
	}
	System.out.println(even);
	System.out.println(odd);
}
}
