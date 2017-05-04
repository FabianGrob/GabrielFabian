package edu.ncsu.monopoly.gui;

import edu.ncsu.monopoly.Cell;

public class ChanceCellInfoFormatter implements CellInfoFormatter {
    
    public static final String CHANCE_CELL_LABEL = "<html><div style='text-align:center; width:100px; height:100%'><p><b>Chance</b></p></div></html>";
    
    public String format(Cell cell) {
        return CHANCE_CELL_LABEL;
    }
}
