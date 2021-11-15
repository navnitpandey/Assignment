import java.util.*;
public class rev {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("entr str");
		String s=sc.next();
		int leng=s.length();
		String rev="";
		for(int i=leng-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}

}
