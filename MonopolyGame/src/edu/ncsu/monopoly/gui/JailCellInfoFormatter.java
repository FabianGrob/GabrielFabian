package edu.ncsu.monopoly.gui;

import edu.ncsu.monopoly.Cell;

public class JailCellInfoFormatter implements CellInfoFormatter {

    public static final String JAIL_CELL_LABEL = "<html><div style='text-align:center; width:100px; height:100%'><p><b>Jail</b></p></div></html>";

    public String format(Cell cell) {
		return JAIL_CELL_LABEL;
	}

}
