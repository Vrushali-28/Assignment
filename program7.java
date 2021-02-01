package day2;

import java.util.Scanner;

public class program7 {
	public static void main(String[] args) {
        int reversed=0;
        System.out.println("Enter Number: ");
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
    }

}
