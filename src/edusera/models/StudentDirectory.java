/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edusera.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ingale.r
 */
public class StudentDirectory {
    private List<Student> users;
    
    public StudentDirectory(){
        this.users = new ArrayList<Student>();
    }

    public List<Student> getUsers() {
        return users;
    }
    
    public Student addStudent(String nuId, String name, String email){
        Student student = new Student(nuId, name, email);
        users.add(student);
        return student;
    }
}
