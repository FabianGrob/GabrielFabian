/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ncsu.monopoly;

import java.io.File;

/**
 *
 * @author Fabian
 */
public class User {

    private String name;
    private File picture;
    private int playedGames;
    private int wonGames;

    
    public User(){
        name="Not name asigned yet";
        picture = null;    
    }
    
    public File getPicture() {
        return picture;
    }

    public void setPicture(File pic) {
        picture = pic;
    }
    public void setWonGames(int wGs){
        wonGames=wGs;
    }
    public int getWonGames(){
        return wonGames;
    }
    public void setPlayedGames(int pGs){
        playedGames=pGs;
    }
    public int getPlayedGames(){
        return playedGames;
    }

}
