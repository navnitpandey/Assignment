import java.util.Scanner;
public class Swapping2Numbers {
	
	public static void main(String[] args) {
		//int a=10, b=20;
		int x,y,t;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the value of x and y");
		x=scan.nextInt();
		y=scan.nextInt();
		//System.out.println("before swapping value are.."+a+"  "+b);
		System.out.println("before swapping : "+ x +"  "+y);
		 t=x;
		x=y;
		y=t;
		System.out.println("After Swapping : "+ x+"  "+y);
		//System.out.println();
		
		/*a=a+b;
		b=a-b;
		a=a-b;*/
		
	    /*a=a*b;
		b=a/b;
		a=a/b;*/
		
		
		
		//System.out.println("After swapping value are.."+a+"  "+b);

	
	}
}

