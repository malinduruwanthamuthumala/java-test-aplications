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
public class compex {
   private String name;
   private tostring birthday;
   public compex(String theName,tostring TheDate){
       name=theName;
       birthday=TheDate;
       
      
       
   } 
   public String toString(){
           return String.format("my name is %s,my birthday is %s",name,birthday);
                   
   }
}
