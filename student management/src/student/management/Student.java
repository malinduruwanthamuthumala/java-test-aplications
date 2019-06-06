/*
 * this class is responsible for keepning student details
 */
package student.management;

/**
 *
 * @author Malindu
 */
public class Student {
 private int id;
 private String name;
 private int grade;
 private int feespaid;
 private int feestotal;
 /**
  * 
  * @param id id of the student unique
  * @param name not unique name of the student
  * @param grade grade of the student
  */
 public Student(int id,String name,int grade){
  this.feespaid=0;
  this.feestotal=30000; 
  this.id=id;
  this.name=name;
  this.grade=grade;
 
 }
  
 public void setGrade(int grade){
     this.grade=grade;
 }
 
 public void updateFees(int fees){
     feespaid+=fees;
 }
 public int getgrade(){
     return this.grade;
 }
 
 public int getfeespaid(){
     return this.feespaid;
 }
 public String getname(){
     return this.name;
 }
 public int gettotoalfees(){
 return this.feestotal;
 }
}
