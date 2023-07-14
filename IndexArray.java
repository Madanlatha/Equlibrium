package Equilibrium_Index;

import java.util.Scanner;

public class IndexArray {
	static int n;
	public static int equilibriumIndex(int arr[]) {
		int p[]	=new int[n];
		p[0]=arr[0];
		for(int i=1;i<n;i++) {
			p[i]=p[i-1]+arr[i];
			
		}
		int count=0;
		int min=Integer.MAX_VALUE;
		for(int i=1;i<n;i++) {
			
			if(p[i-1]==p[n-1]-p[i]) {
				count++;
				if(min>i) {
					min=i;
				}
			}
		}
		if(count==0) {
			return -1;
		}
		
		return min;
				}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int count=equilibriumIndex(arr);
		System.out.println(count);

	}

}
