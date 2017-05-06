package edu.ncsu.monopoly.gui;

import edu.ncsu.monopoly.Cell;
import edu.ncsu.monopoly.Player;
import edu.ncsu.monopoly.UtilityCell;
import java.awt.Dimension;
import java.awt.Toolkit;

public class UtilCellInfoFormatter implements CellInfoFormatter {

	public String format(Cell cell) {
        UtilityCell c = (UtilityCell)cell;
        StringBuffer buf = new StringBuffer();
        Player owner = cell.getOwner();
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        int width = (int) Math.round(d.width/14.4);
        String ownerName = "";
        if(owner != null) {
        	ownerName = owner.getName();
        }
        buf.append("<html><div style='height:100%; width:" + width + "px; text-align:center'><div style='background-color:olive; height:10px'></div><p style='font-size:90%'><b>")
                .append(cell.getName())
                .append("</b></p><p>")
                .append("$").append(c.getPrice())
				.append("<br>Owner: ").append(ownerName)
                .append("</p></div></html>");
        return buf.toString();
	}
}
