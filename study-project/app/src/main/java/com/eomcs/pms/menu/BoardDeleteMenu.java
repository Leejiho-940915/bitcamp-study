package com.eomcs.pms.menu;

import com.eomcs.pms.handler.BoardHandler;

public class BoardDeleteMenu extends Menu {

  BoardHandler boardHandler;

  public BoardDeleteMenu(BoardHandler boardHandler) {
    super("삭제");
    this.boardHandler = boardHandler;
  }

  public void execute() {
    boardHandler.delete();
  }
}
