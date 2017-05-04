package edu.ncsu.monopoly;

import javax.swing.JOptionPane;

public class TaxiCard extends Card {
    private int cardType;
    private String label;
    
    public TaxiCard(String label, int cardType) {
        this.cardType = cardType;
        this.label = label;
    }
    
    public void applyAction() {
        boolean correctNumber = false;
        int move = 0;
        while(!correctNumber) {
            try {
                move = Integer.parseInt(JOptionPane.showInputDialog(null, "How many cells do you wish to advance? (Max 6)", "Taxi", 1));
                if(move > 6 || move < 1) {
                    JOptionPane.showMessageDialog(null, "Must enter a number not greater than 6!");
                }else {
                    correctNumber = true;
                }
            }catch(NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Must enter a number not greater than 6!");
            }
        }
        Player currentPlayer = GameMaster.instance().getCurrentPlayer();
        GameMaster.instance().movePlayer(currentPlayer, move);
    }
    
    public int getCardType() {
        return this.cardType;
    }
    
    public String getLabel() {
        return this.label;
    }
}
