package edu.ncsu.monopoly.gui;

import edu.ncsu.monopoly.Cell;
import edu.ncsu.monopoly.Player;
import edu.ncsu.monopoly.RailRoadCell;
import java.awt.Dimension;
import java.awt.Toolkit;

public class RRCellInfoFormatter implements CellInfoFormatter {
    public String format(Cell cell) {
        RailRoadCell c = (RailRoadCell)cell;
        StringBuffer buf = new StringBuffer();
        Player owner = cell.getOwner();
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        int width = (int) Math.round(d.width/14.4);
        String ownerName = "";
        if(owner != null) {
        	ownerName = owner.getName();
        }
        buf.append("<html><div style='width:" + width + "px; height:100%; text-align:center'><div style='background-color:lime; height:10px;'></div><p style='font-size:90%'><b>")
                .append(cell.getName())
                .append("<b></p><p>")
                .append("$").append(c.getPrice())
				.append("<br>Owner: ").append(ownerName)
                .append("</p></div></html>");
        return buf.toString();
    }
}
