import java.util.Scanner;
public class CountNumberOfDegits {
	public static void main(String[] args) {
		//int num=123456;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no");
		int num=sc.nextInt();
		int count=0;
		while(num>0) {
			count++;
			num=num/10;
			
		}
		System.out.println("number of degits : "+count);
	}
}
