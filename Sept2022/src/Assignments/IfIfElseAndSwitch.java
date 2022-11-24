package Assignments;

public class IfIfElseAndSwitch {
	public static void main(String args[]) {
		int a = 20;
		if(a%2==0) 
			
			System.out.println(a +" is a Even number");
		
		//if else
		a=19;
		if(a>=18)
			System.out.println("Eligible to vote");
		else
			
			System.out.println("Not eligible to vote");
		
		//switch case
			char grade = 'A';
			switch (grade)
			{
			case 'A': System.out.println("Excellent");
			break;
			case 'B': System.out.println("Very Good");
			break;
			case 'C': System.out.println("Good");
			break;
			default : System.out.println("Enter the value between A to C");
			
			
			}
				
			
		
			
	}

}
