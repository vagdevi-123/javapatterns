package com.Pattern;

public class PatternFive {
	public static void main(String args[]) {
		int n=5;
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			
			
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			
			for(int j=n;j>=i;j--) {
				System.out.print("*");
			}
	
				
			
			System.out.println();
		}
		for(int i=n;i>=1;i--) {
			
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			
			
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			
			for(int j=n;j>=i;j--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			
			
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			
			for(int j=n;j>=i;j--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}



}
