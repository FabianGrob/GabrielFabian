/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopolygame;

import edu.ncsu.monopoly.DataBase;
import edu.ncsu.monopoly.Serialize;
import edu.ncsu.monopoly.User;
import edu.ncsu.monopoly.gui.WelcomeMenu;


public class MonopolyGame {

   
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
        User guest = new User();
        guest.setName("Play as guest");
        if (!dB.getUsers().contains(guest)) {
            dB.getUsers().add(guest);
        }
        WelcomeMenu window = new WelcomeMenu(dB,args);
        window.setVisible(true);
    }
    
}
