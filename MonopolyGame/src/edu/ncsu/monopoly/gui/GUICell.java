package edu.ncsu.monopoly.gui;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.BevelBorder;

import edu.ncsu.monopoly.*;
import java.awt.geom.Rectangle2D;
import java.io.File;
import javafx.stage.Screen;

public class GUICell extends JPanel {
    
    private Cell cell;
    private JLabel lblInfo;
    private JLabel[] lblPlayers = new JLabel[GameMaster.MAX_PLAYER];
    
    public GUICell(Cell cell) {
        this.cell = cell;
        setLayout(new OverlayLayout(this));
        setBorder(new BevelBorder(BevelBorder.LOWERED));
        JPanel pnlPlayer = new JPanel();
        pnlPlayer.setLayout(new GridLayout(2, 4));
        createPlayerLabels(pnlPlayer);
        pnlPlayer.setOpaque(false);
        add(pnlPlayer);
        setPreferredSize(new Dimension(135, 80));
        addCellInfo();
        this.doLayout();
    }
    
    private void addCellInfo() {
        lblInfo = new JLabel();
        displayInfo();
        JPanel pnlInfo = new JPanel();
        pnlInfo.setLayout(new GridLayout(1, 1));
        pnlInfo.add(lblInfo);
        add(pnlInfo);
    }
    
    public void addPlayer(int index) {
        Player player = GameMaster.instance().getPlayer(index);
        lblPlayers[index].setVisible(true);
        
    }
    
    private void createPlayerLabels(JPanel pnlPlayer) {
        for (int i = 0; i < GameMaster.instance().getNumberOfPlayers(); i++) {
            Player player = GameMaster.instance().getPlayer(i);
            ImageIcon imageIcon = null;
            if(player.getUser() != null) {
                imageIcon = new ImageIcon(player.getUser().getPicture().getAbsolutePath());
            } else {
                imageIcon = new ImageIcon("src/PredefPic/Pawn" + player.getColor() + ".png");
            }
            Image image = imageIcon.getImage();
            Image newimg = image.getScaledInstance(30, 40,  java.awt.Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(newimg);
            lblPlayers[i] = new JLabel(icon);
            lblPlayers[i].setVisible(false);
            pnlPlayer.add(lblPlayers[i]);
        }
    }
    
    public void displayInfo() {
        lblInfo.setText(InfoFormatter.cellInfo(cell));
        this.invalidate();
        this.repaint();
    }
    
    public Cell getCell() {
        return cell;
    }
    
    public void removePlayer(int index) {
        lblPlayers[index].setText("");
        lblPlayers[index].setVisible(false);
        this.repaint();
    }
}
