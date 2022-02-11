package Assesment;
import java.util.Scanner;
public class Operators {
	 Scanner sc = new Scanner(System.in);
	 public void checkPalindrome()  {
		 System.out.print("Enter the number" );
		 int number=sc.nextInt();
		 int sum=0,temp=0,result=number;
		 while (number>0){
			 temp=number%10;
			 sum=sum*10+temp;
			 number=number/10;
		 }
			 System.out.println(sum==result?result+" is palindrome":result+" is not palindrome" ) ;

     }
	 public void printPattern() {
		 System.out.print("Enter the number" );
		 int number=sc.nextInt();
		 for(int i=1;i<=number;i++){
	            for(int j=number;j>=i;j--){
	                System.out.print(" *");
	            }
	            System.out.println();
	        }
	 }
	 public void printFibonacciSeries() {
		 int first=0,second=1,next=0;
	        int number = sc.nextInt();
	        System.out.println(first);
	        System.out.println(second);
	        for(int i=1;i<number-1;i++){
	                next=second+first;
	                System.out.println(next);
	                first=second;
	                second=next;
	        }
	             
		 
	 }
	 public void checkPrimeNumber() {
		 int number = sc.nextInt();
		 for(int i=2;i<=number;i++) {
			 if(i==number){
				 System.out.println(number + " is a prime Number ");
			 }
			 else if(number%i==0) {
				 System.out.println(number + " is not a prime number");
				 break;
				 
			 }
			 else {
				 continue;
			 }
			
		 }
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Operators obj =new Operators();
		int choice;
		do {
		System.out.println("Enter your choice from below list.\\n\" + \"1. Find palindrome of number.\\n\"\n"
				+ "\n"
				+ "+ \"2. Print Pattern for a given no.\\n\" + \"3. Check whether the no is a  prime number.\\n\"\n"
				+ "\n"
				+ "+ \"4. Print Fibonacci series.\\n\" + \"--> Enter 0 to Exit.\\n\"");
		choice=sc.nextInt();
		switch(choice) {
		case 0: {
			System.out.println("Visit again........");
			choice = 0;
		}
		break;
		case 1: {
			obj.checkPalindrome();
			
		}
		break;
		case 2:{
			obj.printPattern();
		}
		break;
		case 3:{
			obj.checkPrimeNumber();
		}
		break;
		case 4:{
			obj.printFibonacciSeries();
		}
		break;
		default:

			System.out.println("Invalid choice. Enter a valid no.\n");

		}
		
		}while(choice!=0);
		sc.close();

	}

}
