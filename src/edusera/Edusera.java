/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edusera;

import edusera.models.Professor;
import edusera.models.ProfessorDirectory;
import edusera.models.Role;
import edusera.models.Student;
import edusera.models.StudentDirectory;
import edusera.models.User;
import edusera.models.UserDirectory;

/**
 *
 * @author ingale.r
 */
public class Edusera {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        ProfessorDirectory profDir = new ProfessorDirectory();
        StudentDirectory studentDir = new StudentDirectory();
        UserDirectory userDir = new UserDirectory();
        
        // Create student 
        Student raveena = studentDir.addStudent("002837209", "Raveena", "ingale.r@northeastern.edu" );
        
        // Create user
        userDir.addUser("ringale95", "123", raveena, Role.STUDENT);
        
        
    }
    
}
