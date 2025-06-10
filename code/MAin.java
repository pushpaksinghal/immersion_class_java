import java.util.*;

public class MAin {
    public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		int inp = sc.nextInt();
		int a = inp;
		int b=0;
		while(a!=0){
			int temp = a%10;
			b=(b*10)+temp;
			a=a/10;
		}
		
		if(inp==b){
			//System.out.println(b);
			System.out.print("YES, this is a palindrome");
		}
		else{
			//System.out.println(b);
			System.out.print("NO, this is not a palindrome");
		}
			
	}
}