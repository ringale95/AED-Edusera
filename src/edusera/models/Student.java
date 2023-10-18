/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edusera.models;

/**
 *
 * @author ingale.r
 */
public class Student extends Person {
    private String nuId;
        
    public Student(){
        super(); // calling Person's constructor
    }

    public String getNuId() {
        return nuId;
    }

    public void setNuId(String nuId) {
        this.nuId = nuId;
    }

    public Student(String nuId, String name, String email) {
        super(name, email);
        this.nuId = nuId;
    }
    
    
}
