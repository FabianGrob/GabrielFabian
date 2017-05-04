package edu.ncsu.monopoly.gui;

import edu.ncsu.monopoly.Cell;

public class GotoJailCellInfoFormatter implements CellInfoFormatter {

    public static final String GOTO_JAIL_LABEL = "<html><div style='text-align:center; width:100px; height:100%'><p><b>Go to Jail</b><p></div></html>";

    public String format(Cell cell) {
    	return GOTO_JAIL_LABEL;
	}
}
