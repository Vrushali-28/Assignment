package day2;

import java.util.Scanner;

public class program8 {
	public static void main(String args[]){  
		  int r,sum=0,temp;    
		  
		  System.out.println("Enter Number: ");
	        Scanner scan=new Scanner(System.in);
	        int n=scan.nextInt();
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		}  

}
