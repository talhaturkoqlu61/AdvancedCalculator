package myProject33;
import java.util.Scanner;

public class AdvancedCalculator {
	static void Add(int a,int b) {
		int result =a+b;
		System.out.println(result);
	}
	static void Sub(int a,int b) {
		int result=a-b;
		System.out.println(result);
	}
	static void Multi(int a,int b) {
		int result=a*b;
		System.out.println(result);
	}
	static void Div(int a,int b) {
		int result=a/b;
		System.out.println(result);
	}
	static void Expo(int a,int b) {
		int result=1;
		for(int i=1;i<=b;i++) {
			result*=a;
			
		}
		System.out.println(result);
	}
	static void Mode(int a,int b) {
		int result=a%b;
		System.out.println(result);
	}
	static void Rect(int a,int b) {
		int area=a*b;
		int perimeter=(a+b)*2;
		System.out.println("Area of the rectangular: "+area);
		System.out.println("Perimeter of the rectangular: "+perimeter);
	}
	
	
	public static void main(String[]args) {
		String menu="1-Addition\n"
	+"2-Subtraction\n"
	+"3-Multiplication\n"
	+"4-Division\n"
	+"5-Exponential number\n"
	+"6-Calculating factorial\n"
	+"7-Calculating mode\n"
	+"8-Calculating perimeter and area of rectangular\n";
		int selection;
				
				
		while(true) {
			Scanner input=new Scanner(System.in);
			System.out.println(menu);
			System.out.print("Please enter a number to select process you want:" );
			selection=input.nextInt();
			if(selection==6) {
				System.out.print("Please enter a number:");
				int facNumber=input.nextInt();
				int result=1;
				for(int i=1;i<=facNumber;i++) {
					result*=i;
				}
				System.out.println(result);
				break;
			}
			System.out.print("Please enter first and second number:");
			int firstNumber=input.nextInt();
			int secondNumber=input.nextInt();
			switch(selection) {
			 case 1:Add(firstNumber,secondNumber);
			        break;
			 case 2:Sub(firstNumber,secondNumber);
			        break;
			 case 3:Multi(firstNumber,secondNumber);
			        break;
			 case 4:Div(firstNumber,secondNumber);
			        break;
			 case 5:Expo(firstNumber,secondNumber);
			        break;
			 case 7:Mode(firstNumber,secondNumber);
			        break;
			 case 8:Rect(firstNumber,secondNumber);
			        break;
			 
			        
			}
			
		}
		
	}

}
