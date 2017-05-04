package edu.ncsu.monopoly.gui;

import edu.ncsu.monopoly.Cell;
import edu.ncsu.monopoly.Player;
import edu.ncsu.monopoly.PropertyCell;

public class PropertyCellInfoFormatter implements CellInfoFormatter {
    public String format(Cell cell) {
        PropertyCell c = (PropertyCell)cell;
        StringBuffer buf = new StringBuffer();
        Player owner = cell.getOwner();
        String ownerName = "";
        if(owner != null) {
            ownerName = owner.getName();
        }
        buf.append("<html><div style='height:100%; width:100px; text-align:center'><div style='height:2px; background-color:"+ c.getColorGroup() +"'></div><p style='font-size:90%'><b>")
                .append(cell.getName())
                .append("</b></p><p>")
                .append("$").append(c.getPrice())
                .append("<br>* ").append(c.getNumHouses())
                .append(" Owner: ").append(ownerName)
                .append("</p></div></html>");
        return buf.toString();
    }
}
