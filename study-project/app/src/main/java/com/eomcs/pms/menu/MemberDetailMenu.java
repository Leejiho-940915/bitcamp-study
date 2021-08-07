package com.eomcs.pms.menu;

import com.eomcs.pms.handler.MemberHandler;

public class MemberDetailMenu extends Menu {

  MemberHandler memberHandler;

  public MemberDetailMenu(MemberHandler memberHandler) {
    super("상세보기");
    this.memberHandler = memberHandler;
  }

  public void execute() {
    memberHandler.detail();
  }
}
