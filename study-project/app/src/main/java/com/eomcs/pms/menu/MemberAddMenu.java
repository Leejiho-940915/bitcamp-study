package com.eomcs.pms.menu;

import com.eomcs.pms.handler.MemberHandler;

public class MemberAddMenu extends Menu {

  MemberHandler memberHandler;

  public MemberAddMenu(MemberHandler memberHandler) {
    super("등록");
    this.memberHandler = memberHandler;
  }

  public void execute() {
    memberHandler.add();
  }
}
