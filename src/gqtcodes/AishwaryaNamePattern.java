package gqtcodes;

import java.util.Scanner;

public class AishwaryaNamePattern {
	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		System.out.println("enter the value:");
		int n=sc.nextInt();
		for(int i=0;i<=n-1;i++) {
			for(int j=0;j<=n-1;j++) {
				if(j==0||j==n-1 ||(i==n/2 && j<=n)||i==0){
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			 }
			System.out.print("  ");
		//logic for i
			for(int j=0;j<=n-1;j++) {
				if(i==0||i==n-1 ||j==n/2){
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			         
			
			}
			System.out.print("  ");
		//logic for s
			for(int j=0;j<=n-1;j++) {
				if(i==0||i==n-1||(j==n-1 && i>n/2)||(j==0 && i<n/2)||i==n/2){
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			         
			
			}
			
			System.out.print("  ");
		//logic for h
			for(int j=1;j<=n;j++) {
				if(j==1||j==n ||(i==n/2 && j<=n)){
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			 }
			System.out.print("  ");
		//logic for w
		
			for(int j=0;j<=n;j++) {
				if(j==0||j==n||(i+j==n && i>n/2)||(i==j && i>n/2)){
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			         
		System.out.print(" ");
		//logic for a
		for(int j=0;j<=n-1;j++) {
			if(j==0||j==n-1 ||(i==n/2 && j<=n)||i==0){
			System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		 }
		System.out.print("  ");
		//logic for r
			for(int j=0;j<=n;j++) {
				if((j==0 )||(i==0 && j<n/2  )||
				  (i==n/2 && j<=n/2 && j!=n/2)||
				   (i-j==n/2)||(j==n/2 && i<=n/2  && i!=n/2 )){
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			   }
			
		//logic for y
			for(int j=0;j<=n;j++) {
				if((i==j && j<=n/2)|| (i+j==n && j>=n/2)||(j==n/2 && i>=n/2)){
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			   }
			System.out.print(" ");
			System.out.print(" ");
		//logic for a
			for(int j=0;j<=n-1;j++) {
				if(j==0||j==n-1 ||(i==n/2 && j<=n)||i==0){
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			 }
			  System.out.print("  ");
              System.out.println(" ");
        }

	}


}
