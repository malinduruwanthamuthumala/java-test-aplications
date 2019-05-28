/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**;
 *
 * @author Malindu
 */
public class averagecal {
int total=0; 
int number;
int counter=0;
double average;
Scanner input = new Scanner(System.in);
public void average(){
while(counter<10){
number=input.nextInt();
total=total+number;
counter++;
}
average=total/10;
System.out.println("aveerage is " + average);
}
}
