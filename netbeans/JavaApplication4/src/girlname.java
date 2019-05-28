/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Malindu
 */
public class girlname {
   private String girlname;
   
   public void setname(String name){
      girlname=name;
   }
   
   public String getname(){
       return girlname;
   }
   
   public void display(){
       System.out.printf("my girl name is %s", getname());
   }
}
