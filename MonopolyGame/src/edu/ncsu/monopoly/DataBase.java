/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package edu.ncsu.monopoly;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Fabian
 */
public class DataBase implements Serializable {
    
    private ArrayList<User> users;
    
    public DataBase() {
        users = new ArrayList<User>();
        User none = new User();
        none.setName("Jugar como invitado");
        users.add(none);
    }
    
    public void setUsers(ArrayList<User> users) {
        users = users;
    }
    
    public ArrayList<User> getUsers() {
        return users;
    }
    
    public void addUser(User u) {
        this.users.add(u);
    }
    
    public boolean alreadyExists(User u) {
        return users.contains(u);
    }
    
    public User getUser(String name) {
        User returningUser = null;
        for (int i = 0; i < users.size(); i++) {
            User auxiliarUser = users.get(i);
            if(auxiliarUser.getName().equals(name)) {
                returningUser = auxiliarUser;
            }
        }
        return returningUser;
    }
}
