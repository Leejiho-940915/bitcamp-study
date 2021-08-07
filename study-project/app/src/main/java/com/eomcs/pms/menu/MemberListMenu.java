package com.eomcs.pms.menu;

import com.eomcs.pms.handler.MemberHandler;

public class MemberListMenu extends Menu {

  MemberHandler memberHandler;

  public MemberListMenu(MemberHandler memberHandler) {
    super("목록");
    this.memberHandler = memberHandler;
  }

  public void execute() {
    memberHandler.list();
  }
}
