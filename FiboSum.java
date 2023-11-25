

import java.util.Scanner;

public class FiboSum {
	static Scanner s=new Scanner(System.in);
	
	public static void main(String[] args) {
		long n1=0;
		long n2=1;
		long n3=0;
		long sum=0L;
		System.out.println("enter no");
		int n=s.nextInt();
		for (int i = 0; i < n+10; i++) {
			if (i>=n) {
				sum+=n1;
			}
			n3=n1+n2;
			n1=n2;
			n2=n3;
		}
		System.out.println(sum);
	}
}

