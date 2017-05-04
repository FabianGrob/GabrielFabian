package edu.ncsu.monopoly.gui;

import edu.ncsu.monopoly.Cell;

public class FreeParkingCellInfoFormatter implements CellInfoFormatter {
    
    public static final String FP_CELL_LABEL = "<html><div style='text-align:center; width:100px; height:100%'><p><b>Free Parking</b></p></html>";
    
    public String format(Cell cell) {
        return FP_CELL_LABEL;
    }
}
