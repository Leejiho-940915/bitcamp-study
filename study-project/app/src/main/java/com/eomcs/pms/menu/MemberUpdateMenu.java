package com.eomcs.pms.menu;

import com.eomcs.pms.handler.MemberHandler;

public class MemberUpdateMenu extends Menu {

  MemberHandler memberHandler;

  public MemberUpdateMenu(MemberHandler memberHandler) {
    super("변경");
    this.memberHandler = memberHandler;
  }

  public void execute() {
    memberHandler.update();
  }
}
