import java.util.Scanner;

public class program1 {

	public static void main(String args[]) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter Code:");
		char c = scan.next().charAt(0);

	     

	      switch(c) {
	         case 'R' :
	            System.out.println("Red"); 
	            break;
	         case 'B' :
	        	 System.out.println("Blue"); 
		            break;
	         case 'G' :
	            System.out.println("Green");
	            break;
	         case 'O' :
	            System.out.println("Orange");
	         case 'Y' :
	            System.out.println("Yellow");
	            break;
	         case 'W' :
		            System.out.println("White");
		            break;
	            
	         default :
	            System.out.println("Invalid code");
	      } }
	     
}
