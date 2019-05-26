import java.util.Scanner;

class calculator{
public static void main(String args[]){
	Scanner inputs=new Scanner(System.in);
	double fnum,snum,answer;
	System.out.println("enter first number");
	fnum=inputs.nextDouble();
	System.out.println("enter the second number");
	snum=inputs.nextDouble();
	answer=fnum+snum;
	System.out.println("the answer is" + answer); 

}

}