import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter str");
		String s=sc.nextLine();
		String str=s;
		String rev="";
		int len=s.length();
		for (int i = len-1; i >= 0; i--) {
			rev=rev+s.charAt(i);
			
		}if (str.equals(rev)) {
			System.out.println("palindrome");
			
		}else {
			System.out.println("not");
		}
	}

}
