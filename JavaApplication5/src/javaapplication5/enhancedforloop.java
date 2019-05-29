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
public class enhancedforloop {
    int a[]={4,5,7,8,5,6,2,5};
    int total=0;
 public void enhanced(){
 for (int s: a){
 total+=s;
 }
 System.out.println(total);
 }   
}
