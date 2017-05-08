/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ncsu.monopoly;

import java.util.ArrayList;
import javax.swing.JComboBox;

/**
 *
 * @author Fabian
 */
public class ParametersCheckSelection {

    private JComboBox comboBox;
    private boolean selectedToPlay;
    private ArrayList<User> actualUsers;
    private ArrayList<String> names;
    private boolean[] repeatedColors;
    private ArrayList<String> chosenColors;
    private int choseColorIndex;
    private boolean[] repeated;

    public boolean[] getRepeated() {
        return repeated;
    }

    public void setRepeated(boolean[] repeated) {
        this.repeated = repeated;
    }

    public ParametersCheckSelection() {
        comboBox = null;
        selectedToPlay = false;
        actualUsers = new ArrayList<User>();
        names = new ArrayList<String>();
        repeatedColors = new boolean[9];
        repeated = new boolean[9];
        chosenColors = new ArrayList<String>();
        choseColorIndex=0;

    }

    public JComboBox getComboBox() {
        return comboBox;
    }

    public void setComboBox(JComboBox comboBox) {
        this.comboBox = comboBox;
    }

    public boolean isSelectedToPlay() {
        return selectedToPlay;
    }

    public void setSelectedToPlay(boolean selectedToPlay) {
        this.selectedToPlay = selectedToPlay;
    }

    public ArrayList<User> getActualUsers() {
        return actualUsers;
    }

    public void setActualUsers(ArrayList<User> actualUsers) {
        this.actualUsers = actualUsers;
    }

    public ArrayList<String> getNames() {
        return names;
    }

    public void setNames(ArrayList<String> names) {
        this.names = names;
    }

    public boolean[] getRepeatedColors() {
        return repeatedColors;
    }

    public void setRepeatedColors(boolean[] repeatedColors) {
        this.repeatedColors = repeatedColors;
    }

    public ArrayList<String> getChosenColors() {
        return chosenColors;
    }

    public void setChosenColors(ArrayList<String> chosenColors) {
        this.chosenColors = chosenColors;
    }

    public int getChoseColorIndex() {
        return choseColorIndex;
    }

    public void setChoseColorIndex(int choseColorIndex) {
        this.choseColorIndex = choseColorIndex;
    }

}
