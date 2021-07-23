package com.yash.arraydemo.util;
import java.util.Arrays;
public class Array4 {

	public static void main(String[] args) {
		int a[]= {33,45,5,3,4,56,7,8,91,2,11,31,12,13,15};
		System.out.println("odd number");
		for(int i=0;i<a.length;i++) {
 			if(a[i]%2!=0) {
 				System.out.println(a[i]);
 			}
 		}
		System.out.println("even number");
		for(int i=0;i<a.length;i++) {
 			if(a[i]%2==0) {
 				System.out.println(a[i]); 
	}
	
		}
		System.out.println("positive number");
		for(int i=0;i<a.length;i++) {
 			if(a[i]<0) {
 				System.out.println(a[i]);
		}
	}
	}
}
	

			
		

	


