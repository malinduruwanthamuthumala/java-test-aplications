/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.management;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Malindu
 */
public class StudentManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Teacher amith= new Teacher(1,"amith",500);
        Teacher lanka=new Teacher(2,"lanka",1000);
        Teacher nila=new Teacher(3,"nila",4500);
        
        List<Teacher> teacherlist=new ArrayList<>();
        teacherlist.add(amith);
        teacherlist.add(lanka);
        teacherlist.add(nila);
        
        Student maindu=new Student(1,"malindu",11);
        Student ali=new Student(2,"ali",5);
        Student adif=new Student(3,"adif",6);
        
        List<Student> studentlist=new ArrayList<>();
        studentlist.add(maindu);
        studentlist.add(ali);
        studentlist.add(adif);
        
        
        School Rcm=new School(teacherlist,studentlist);
        System.out.println(Rcm.getTotalmoneyEarned()); 
        
    }
    
}
