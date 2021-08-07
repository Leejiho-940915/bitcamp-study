package com.eomcs.pms.menu;

import com.eomcs.pms.handler.BoardHandler;

public class BoardDetailMenu extends Menu {

  BoardHandler boardHandler;

  public BoardDetailMenu(BoardHandler boardHandler) {
    super("상세보기");
    this.boardHandler = boardHandler;
  }

  public void execute() {
    boardHandler.detail();
  }
}
