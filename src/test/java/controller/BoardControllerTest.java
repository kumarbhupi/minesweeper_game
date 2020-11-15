package controller;

import junit.framework.TestCase;
import model.Cell;

public class BoardControllerTest extends TestCase {
  BoardController boardController;
  MockBoard mockBoard;
  MockView mockView;

  public void setUp() throws Exception {
    super.setUp();
    mockBoard = new MockBoard();
    mockView = new MockView();
    boardController = new BoardController(mockView, mockBoard);

  }

  public void testWhenCellIsPressedMakeItVisible() {
    boardController.cellPressed(10);
    assert mockBoard.getCells()[10].isVisible();
  }

  public void testSetCellWithFlagOnRightClick(){
    boardController.cellPressed(10);
    assertEquals(Cell.FLAG, mockBoard.getCells()[10].getType());

  }


}