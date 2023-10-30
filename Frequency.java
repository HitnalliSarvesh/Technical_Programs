package com.xworkz.technicalPrograms;

public class Frequency {
	public static void main(String[] args) {
		int a[] = {1,7,2,7,3,7,4,7,5,7,6,7};
		int x=7;
		int count =0;
		int n = a.length;
		
		for (int i=0; i<n; i++) {
			if(a[i]==x) {
				count++;
			}
		}
		System.out.println(count);
	}

}
