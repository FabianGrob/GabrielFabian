package edu.ncsu.monopoly.gui;

import edu.ncsu.monopoly.Cell;

public class CCCellInfoFormatter implements CellInfoFormatter {
    public String format(Cell cell) {
        return "<html><div style='width:100px; text-align:center'><p style='font-size:90%'><b>" + cell.getName() + "</b></p></div></html>";
    }
}
