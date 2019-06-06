/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.management;

/**
 *
 * @author Malindu
 */
public class Teacher {
   private int id;
   private String name;
   private int salary;
   
   public Teacher(int id,String name,int salary){
       this.id=id;
       this.name=name;
       this.salary=salary;
       
   }
   
   public String getName(){
       return this.name;
   }
   
   public int getSalary(){
       return  this.salary;
   }
   
   public void setSalary(int salary){
       this.salary=salary;
   }
   
}

 
