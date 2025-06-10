import java.util.*;

class abc{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean aa = true;
		if(n<=1){
			aa=false;
		}
		else{
			for(int i=2;i<n;i++){
				if(n%i==0){
					aa=false;
					break;
				}
			}
		}
		System.out.print(aa);
	}
}