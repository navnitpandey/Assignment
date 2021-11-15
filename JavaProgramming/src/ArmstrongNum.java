import java.util.Scanner;
public class ArmstrongNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no :");
		int n=sc.nextInt();
		int sum=0,temp=n;
		while(n!=0) {
			int r=n%10;
			sum=sum+r*r*r;
			n=n/10;
		}
		if(sum==temp)
			System.out.println("Armstrong");
		else
			System.out.println("not armstrong");
	}

}
