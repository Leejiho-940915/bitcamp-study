package com.eomcs.pms.menu;

import com.eomcs.pms.handler.MemberHandler;

public class MemberDeleteMenu extends Menu {

  MemberHandler memberHandler;

  public MemberDeleteMenu(MemberHandler memberHandler) {
    super("삭제");
    this.memberHandler = memberHandler;
  }

  public void execute() {
    memberHandler.delete();
  }
}
