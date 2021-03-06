package edu.ncsu.monopoly.test;

import edu.ncsu.monopoly.Card;
import edu.ncsu.monopoly.Cell;
import edu.ncsu.monopoly.GameBoard;
import java.util.ArrayList;

import edu.ncsu.monopoly.GameMaster;
import edu.ncsu.monopoly.MonopolyGUI;
import edu.ncsu.monopoly.Player;
import edu.ncsu.monopoly.RespondDialog;
import edu.ncsu.monopoly.TaxiCard;
import edu.ncsu.monopoly.TradeDeal;
import edu.ncsu.monopoly.TradeDialog;
import edu.ncsu.monopoly.test.boardScenarios.GameBoardFull;

import junit.framework.TestCase;
import org.junit.Test;

public class GameMasterTest extends TestCase {

    GameMaster gameMaster;

    protected void setUp() throws Exception {
        gameMaster = GameMaster.instance();
        gameMaster.setGameBoard(new GameBoardFull());
        gameMaster.setNumberOfPlayers(2);
        gameMaster.getPlayer(0).setName("Player 1");
        gameMaster.getPlayer(1).setName("Player 2");
        gameMaster.reset();
        gameMaster.setTestMode(true);
        gameMaster.setGUI(new MockGUI());
        gameMaster.startGame();
    }

    @Test
    public void testInit() {
        assertEquals(gameMaster.getInitAmountOfMoney(),
                gameMaster.getPlayer(0).getMoney());
    }

    @Test
    public void testReset() {
        gameMaster.movePlayer(0, 3);
        gameMaster.movePlayer(1, 4);
        gameMaster.reset();
        for (int i = 0; i < gameMaster.getNumberOfPlayers(); i++) {
            Player player = gameMaster.getPlayer(i);
            assertEquals("Go", player.getPosition().getName());
        }
        assertEquals(0, gameMaster.getTurn());
    }

    @Test
    public void testTradeButtonEnabled() {
        MonopolyGUI gui = gameMaster.getGUI();
        assertTrue(gui.isTradeButtonEnabled(0));
    }

    @Test
    public void testTradeButtonDisabled() {
        MonopolyGUI gui = gameMaster.getGUI();
        assertFalse(gui.isTradeButtonEnabled(1));
    }

    @Test
    public void testTradeMoveButtonDisabled1() {
        MonopolyGUI gui = gameMaster.getGUI();
        gameMaster.movePlayer(0, 1);
        assertFalse(gui.isTradeButtonEnabled(0));
    }

    @Test
    public void testTradeMoveButtonDisabled2() {
        MonopolyGUI gui = gameMaster.getGUI();
        gameMaster.movePlayer(0, 1);
        assertFalse(gui.isTradeButtonEnabled(1));
    }

    @Test
    public void testTradeProcessEqCell() {
        MonopolyGUI gui = gameMaster.getGUI();
        gameMaster.movePlayer(0, 1);
        gameMaster.getCurrentPlayer().purchase();
        assertEquals(gameMaster.getGameBoard().getCell(1), gameMaster.getCurrentPlayer().getAllProperties()[0]);
    }

    @Test
    public void testTradeOneSeller() {
        MonopolyGUI gui = gameMaster.getGUI();
        gameMaster.movePlayer(0, 1);
        gameMaster.getCurrentPlayer().purchase();
        gameMaster.btnEndTurnClicked();
        TradeDialog dialog = gui.openTradeDialog();
        assertEquals(1, gameMaster.getNumberOfSellers());
    }

    @Test
    public void testTradeFirstSeller() {
        MonopolyGUI gui = gameMaster.getGUI();
        gameMaster.movePlayer(0, 1);
        gameMaster.getCurrentPlayer().purchase();
        gameMaster.btnEndTurnClicked();
        TradeDialog dialog = gui.openTradeDialog();
        ArrayList sellerList = gameMaster.getSellerList();
        assertEquals(gameMaster.getPlayer(0), sellerList.get(0));
    }

    @Test
    public void testTradeResponse() {
        MonopolyGUI gui = gameMaster.getGUI();
        gameMaster.movePlayer(0, 1);
        gameMaster.getCurrentPlayer().purchase();
        gameMaster.btnEndTurnClicked();
        TradeDialog dialog = gui.openTradeDialog();
        ArrayList sellerList = gameMaster.getSellerList();
        TradeDeal deal = dialog.getTradeDeal();
        RespondDialog respond = gui.openRespondDialog(deal);
        Player player1 = gameMaster.getPlayer(0);
        Player player2 = gameMaster.getPlayer(1);
        assertTrue(respond.getResponse());
    }

    @Test
    public void testTradeProcessAmounts() {
        MonopolyGUI gui = gameMaster.getGUI();
        gameMaster.movePlayer(0, 1);
        gameMaster.getCurrentPlayer().purchase();
        gameMaster.btnEndTurnClicked();
        TradeDialog dialog = gui.openTradeDialog();
        ArrayList sellerList = gameMaster.getSellerList();
        TradeDeal deal = dialog.getTradeDeal();
        RespondDialog respond = gui.openRespondDialog(deal);
        Player player1 = gameMaster.getPlayer(0);
        Player player2 = gameMaster.getPlayer(1);
        gameMaster.completeTrade(deal);
        assertEquals(1440 + deal.getAmount(), player1.getMoney());
        assertEquals(1500 - deal.getAmount(), player2.getMoney());
        assertFalse(player1.checkProperty(deal.getPropertyName()));
        assertTrue(player2.checkProperty(deal.getPropertyName()));

    }

    @Test
    public void testTurn() {
        assertEquals(0, gameMaster.getTurn());
        gameMaster.switchTurn();
        assertEquals(1, gameMaster.getTurn());
        gameMaster.switchTurn();
        assertEquals(0, gameMaster.getTurn());
    }

    @Test
    public void testButtonPurchasePropertyClicked() {
        MonopolyGUI gui = gameMaster.getGUI();
        gameMaster.movePlayer(0, 1);
        gameMaster.btnPurchasePropertyClicked();
        assertEquals(gameMaster.getGameBoard().getCell(1), gameMaster.getCurrentPlayer().getAllProperties()[0]);
        assertEquals(1440, gameMaster.getCurrentPlayer().getMoney());
    }

    @Test
    public void testButtonRollDiceClicked1() {
        gameMaster.reset();
        MonopolyGUI gui = gameMaster.getGUI();
        Cell result0 = gameMaster.getPlayer(0).getPosition();
        int rolled = gameMaster.btnRollDiceClicked();
        int posIndex = gameMaster.getCurrentPlayerIndex();
        assertEquals(0, posIndex);
        Cell expResult = gameMaster.getGameBoard().getCell(rolled);
        Cell result = gameMaster.getPlayer(0).getPosition();
        assertEquals(expResult, result);
    }

    @Test
    public void testButtonTradeClicked() {
        MonopolyGUI gui = gameMaster.getGUI();
        gameMaster.movePlayer(0, 1);
        gameMaster.getCurrentPlayer().purchase();
        gameMaster.btnEndTurnClicked();
        gameMaster.btnTradeClicked();
        assertEquals(gameMaster.getGameBoard().getCell(1), gameMaster.getCurrentPlayer().getAllProperties()[0]);
        assertEquals(1640, gameMaster.getPlayer(0).getMoney());
        assertEquals(1300, gameMaster.getPlayer(1).getMoney());
    }

    @Test
    public void testSetInitAmountOfMoney() {
        int initialAmount = gameMaster.getInitAmountOfMoney();
        gameMaster.setInitAmountOfMoney(0);
        assertEquals(gameMaster.getInitAmountOfMoney(), 0);
        gameMaster.setInitAmountOfMoney(initialAmount);
    }

    @Test
    public void testBtnGetOutOfJailClicked() {
        MonopolyGUI gui = gameMaster.getGUI();
        Player testP = gameMaster.getCurrentPlayer();
        gameMaster.sendToJail(testP);
        gameMaster.btnEndTurnClicked();
        gameMaster.btnEndTurnClicked();
        gameMaster.btnGetOutOfJailClicked();
        assertEquals(gui.isRollDiceButtonEnabled(), true);
    }

    @Test
    public void testTaxi() {
        gameMaster.setNumberOfPlayers(2);
        GameBoard gb = new GameBoard();
        TaxiCard tc = new TaxiCard("Journey completed", Card.TYPE_CHANCE);
        gb.addCard(tc);
        gameMaster.setGameBoard(gb);
        TaxiCard c = (TaxiCard)gb.drawChanceCard();
        c.applyAction(true);
        gameMaster.btnEndTurnClicked();
        c.applyAction(true);
        assertEquals(gameMaster.getPlayer(0).getPosition(), gameMaster.getPlayer(1).getPosition());
    }

}
