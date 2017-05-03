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
    
    public DataBase(){
        users=new ArrayList<User>();
    }
    public void setUsers(ArrayList<User> usrs){
        users = usrs;
    }
    public ArrayList<User> getUsers(){
        return users;
    }
}
