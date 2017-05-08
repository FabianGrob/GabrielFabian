package edu.ncsu.monopoly.gui;

import javax.swing.JOptionPane;

import edu.ncsu.monopoly.*;
import edu.ncsu.monopoly.test.boardScenarios.GameBoardFull;

public class Main {
    
    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WelcomeMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WelcomeMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WelcomeMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WelcomeMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        DataBase dB;
        try {
            Serialize ser = new Serialize();
            dB = ser.recuperate();
        } catch (Exception ex) {
            dB = new DataBase();
        }
        WelcomeMenu window = new WelcomeMenu(dB,args);
        window.setVisible(true);
        
        
    }
}
