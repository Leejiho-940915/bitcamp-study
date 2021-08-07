package com.eomcs.pms.menu;

import com.eomcs.pms.handler.BoardHandler;

public class BoardUpdateMenu extends Menu {

  BoardHandler boardHandler;

  public BoardUpdateMenu(BoardHandler boardHandler) {
    super("변경");
    this.boardHandler = boardHandler;
  }

  public void execute() {
    boardHandler.update();
  }
}
