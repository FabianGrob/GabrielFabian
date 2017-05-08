/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ncsu.monopoly;

import java.io.File;
import java.io.Serializable;

/**
 *
 * @author Fabian
 */
public class User implements Serializable {

    private String name;
    private File picture;
    private int playedGames;
    private int wonGames;

    public User() {
        name = "Not name asigned yet";
        picture = null;
        playedGames = 0;
        wonGames = 0;
    }

    public File getPicture() {
        return picture;
    }

    public void setPicture(File pic) {
        picture = pic;
    }

    public void setWonGames(int wGs) {
        wonGames = wGs;
    }

    public int getWonGames() {
        return wonGames;
    }

    public void setPlayedGames(int pGs) {
        playedGames = pGs;
    }

    public int getPlayedGames() {
        return playedGames;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        String txt = this.getName();
        return txt;
    }

    @Override
    public boolean equals(Object o) {
        User u2 = (User) o;
        return this.getName().equals(u2.getName());
    }

}
