package com.eomcs.pms.menu;

import com.eomcs.pms.handler.BoardHandler;

public class BoardAddMenu extends Menu {

  BoardHandler boardHandler;

  public BoardAddMenu(BoardHandler boardHandler) {
    super("등록");
    this.boardHandler = boardHandler;
  }

  public void execute() {
    boardHandler.add();
  }
}
