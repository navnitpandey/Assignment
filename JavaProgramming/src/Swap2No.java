import java.util.Scanner;
public class Swap2No {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of a and b");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("before swapping : "+a+"  "+b);
		
		/*c=a;
		a=b;
		b=c;*/
		
		/*a=a*b; //10*20=200
		b=a/b; //200/20=10
		a=a/b;*/ //200/10=20
		
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swaping : "+a+"  "+b);

	}
}
