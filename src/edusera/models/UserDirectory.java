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
public class UserDirectory {
    private List<User> users;
    
    public UserDirectory(){
        this.users = new ArrayList<User>();
    }

    public List<User> getUsers() {
        return users;
    }
    
    public User addUser(String username, String password, Person person, Role role){
        User user = new User(username, password, person, role);
        users.add(user);
        return user;
    }
    
    public User findUser(String username, String password){
        for(User user : users){
            if(user.getUsername().equals(username) && user.getPassword().equals(password))
                return user;
        }
        return null;
                
    }
}
