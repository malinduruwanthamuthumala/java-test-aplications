/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author Malindu
 */
public class tostring {
    private int month;
    private int day;
    private int year;
public tostring(int d,int m,int y){
    month=m;
    day=d;
    year=y;
    
    System.out.printf("this is a constructor for %s\n",this);
}  

    public String toString(){
    return String.format("%d/%d/%d",month,day,year);
    }
}
