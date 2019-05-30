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
public class varlen {
public static int average(int...number){
    int total=0;
for(int x:number){
 total=total+x;   
}
return total/number.length;
}   
}
