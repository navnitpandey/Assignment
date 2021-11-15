import java.util.Scanner;
public class EvenOddCount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("entr a int ");
		int n=sc.nextInt();
		int ec=0, oc=0;
		do {
			int r=n%10;
			if(r%2==0)
			ec++;
			else
				oc++;
		n=n/10;
		}
		while(n!=0);
		System.out.println(ec);
		System.out.println(oc);
		
	}

}
