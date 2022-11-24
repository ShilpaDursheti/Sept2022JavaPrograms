package assignments3;

import java.util.Scanner;

public class MncRevSalary {
	
	public static void main(String args[]) {
		
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter the employee's Experience = ");
		int exp = Sc.nextInt();
		System.out.print("Enter the Employee's salary= ");
		double sal = Sc.nextDouble();
		double RevSal = 0;
		
		if(exp>=3 && exp<=5) {
			RevSal = sal + (sal * 0.1);			
		}
		else if(exp>=6 && exp<=9) {
			RevSal = sal + (sal * 	0.15);
		}
		else if(exp>=10 && exp<=20) {
			RevSal = sal + (sal * 0.20);
		}
		else {
			RevSal = sal + (sal * 0.25);
		}
		System.out.print("Did the Employee Recieve a reward ? ");
		Boolean rew = Sc.nextBoolean();
		if(rew==true) {
			RevSal = RevSal + 1000;
		}
		System.out.println("The Revised Salary is = "+ RevSal);
		Sc.close();
	}

}
