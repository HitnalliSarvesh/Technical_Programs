package com.xworkz.technicalPrograms;

public class PascalTriangle {
	
	public static void main(String[] args) {
		for(int i=0;i<5;i++) {  //rows i=1
		
			//spaces
			for(int j=1;j<5-i;j++) {
				System.out.print(" ");
			}
			
			//number
			int number =1;
			for(int k=0;k<=i;k++) {//k=0 k=0<=i=0(1)
				//k=0 ,k=0<=i=1(1) k=1,k=1<=i=1 (1)
				System.out.print(number+" ");
				number = number * (i-k)/(k+1);
			}
			
			System.out.println();
			
		}

	}
	
}
