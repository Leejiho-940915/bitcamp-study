package com.eomcs.menu;

public abstract class Menu {

  public static final int ENABLE_ALL = 0;
  public static final int ENABLE_LOGOUT = 1;
  public static final int ENABLE_LOGIN = 2;

  String title;

  int enableState;

  public Menu(String title) {
    this.title = title;
  }

  public Menu(String title, int enableState) {
    this.title = title; 
    this.enableState = enableState;
  }
  public abstract void execute();
}
