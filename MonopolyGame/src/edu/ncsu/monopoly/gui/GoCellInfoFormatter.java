package edu.ncsu.monopoly.gui;

import edu.ncsu.monopoly.Cell;

public class GoCellInfoFormatter implements CellInfoFormatter {
    
    public static final String GO_CELL_LABEL = "<html><div style='text-align:center; width:100px; height:100%'><p><b>Go</b></p></div></html>";
    
    public String format(Cell cell) {
        return GO_CELL_LABEL;
    }
}
