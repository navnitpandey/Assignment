import java.util.*;
public class revS {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("entr str");
		String s=sc.next();
		int l=s.length();
		String rev="";
		String temp=s;
		for(int i=l-1;i>=0;i--) {
		
			rev=rev+s.charAt(i);
			
		}
		//System.out.println(rev);
		if(rev.equals(temp)) {
		System.out.println("palidrome");}
		else
			System.out.println("not");
	}

}
