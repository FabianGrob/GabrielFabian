package edu.ncsu.monopoly.test;

import edu.ncsu.monopoly.GoCell;
import edu.ncsu.monopoly.Player;
import edu.ncsu.monopoly.PropertyCell;
import edu.ncsu.monopoly.gui.GoCellInfoFormatter;
import edu.ncsu.monopoly.gui.InfoFormatter;
import junit.framework.TestCase;

public class CellInfoFormatterTest extends TestCase {

    public void testGoCellTest() {
        GoCell cell = new GoCell();
        String goLabel = GoCellInfoFormatter.GO_CELL_LABEL;
        assertEquals(goLabel, InfoFormatter.cellInfo(cell));
    }

    public void testPropertyCellText() {
        String propertyName = "Blue 1";
        String propertyColor = "blue";
        String ownerName = "Owner1";
        int numHouses = 2;
        int propertyValue = 120;
        String propertyLabel = "<html><div style='height:100%; width:111px; text-align:center'><div style='height:2px; background-color:" + propertyColor + "'></div><p style='font-size:90%'><b>" + propertyName + "</b></p><p>$" + propertyValue + "<br>* " + numHouses + " Owner: " + ownerName + "</p></div></html>";

        PropertyCell cell = new PropertyCell();
        cell.setName(propertyName);
        cell.setPrice(propertyValue);
        cell.setColorGroup(propertyColor);
        Player p = new Player();
        p.setName(ownerName);
        cell.setOwner(p);
        cell.setNumHouses(numHouses);
        String cellInfo = InfoFormatter.cellInfo(cell);
        assertEquals(propertyLabel, cellInfo);
    }
}
