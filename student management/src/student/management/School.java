/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.management;
import java.util.List;
/**
 *
 * @author Malindu
 */
public class School {
 private List<Teacher> teacher;
 private List<Student> student;
 private int TotalmoneyEarned;
 private int TotalmoneySpent;
 
public School(List<Teacher> teacher,List<Student> student){
   this.teacher=teacher;
   this.student=student;
   TotalmoneyEarned=0;
   TotalmoneySpent=0;
    
}

    public List<Teacher> getTeacher() {
        return teacher;
    }
 
    public void addTeacher(Teacher teacher) {
        this.teacher.add(teacher);
    }

    public List<Student> getStudent() {
        return student;
    }

    public void addStudent(Student student) {
        this.student.add(student);
    }

    public int getTotalmoneyEarned() {
        return TotalmoneyEarned;
    }

    public void setTotalmoneyEarned(int TotalmoneyEarned) {
        this.TotalmoneyEarned += TotalmoneyEarned;
    }

    public int getTotalmoneySpent() {
        return TotalmoneySpent;
    }

    public void updateTotalmoneySpent(int TotalmoneySpent) {
        this.TotalmoneyEarned-=TotalmoneySpent;
    }

}
