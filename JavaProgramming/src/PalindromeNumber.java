import java.util.Scanner;
public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no");
		int num=sc.nextInt();
		int org_num=num;
		int rem, rev=0;
		while(num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if (org_num==rev) {
			System.out.println(org_num+"  number is palindrome");
		}
		else {
			System.out.println(org_num+"  not palindrome number");
		}

	}
}
