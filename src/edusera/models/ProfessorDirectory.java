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
public class ProfessorDirectory {
    private List<Professor> users;
    
    public ProfessorDirectory(){
        this.users = new ArrayList<Professor>();
    }

    public List<Professor> getUsers() {
        return users;
    }
    
      public Professor addProfessor(String name, String email){
        Professor prof = new Professor(name, email);
        users.add(prof);
        return prof;
    }
    
}
