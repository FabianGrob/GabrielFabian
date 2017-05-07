package edu.ncsu.monopoly.gui;

import edu.ncsu.monopoly.Cell;
import edu.ncsu.monopoly.Player;
import edu.ncsu.monopoly.PropertyCell;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Base64;
import javax.swing.ImageIcon;

public class PropertyCellInfoFormatter implements CellInfoFormatter {
    public String format(Cell cell) {
        PropertyCell c = (PropertyCell)cell;
        StringBuffer buf = new StringBuffer();
        Player owner = cell.getOwner();
        String ownerName = "";
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        int width = (int) Math.round(d.width/14.4);
        if(owner != null) {
            ownerName = owner.getName();
        }
        
        buf.append("<html><div style='height:100%; width:" + width + "px; text-align:center'><div style='height:2px; background-color:"+ c.getColorGroup() +"'></div><p style='font-size:90%'><b>")
                .append(cell.getName())
                .append("</b></p><p>")
                .append("$").append(c.getPrice())
                .append("<br>* ")
                .append(c.getNumHouses())
                .append(" Owner: ").append(ownerName)
                .append("</p></div></html>");
        return buf.toString();
    }
}
