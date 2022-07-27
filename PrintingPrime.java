package week2.classes;

public class PrintingPrime {
	public static boolean isNoPrime(int n) {
		if(n==0||n==1) {
			return false;
		}
		else {
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					return false;
				}
			}
		}
		
		return true;
		
	}
	public static void main(String[] args) {
		
		int n=100;
		for(int i=1;i<=n;i++) {
			if(isNoPrime(i)) {
				System.out.print(i+",");
			}
		}
	}
}
