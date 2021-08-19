package com.eomcs.pms.handler;

public class Stack extends ArrayList {

  public void push(Object item) {
    this.add(item);
  }

  public Object pop() {
    return this.remove(this.size() - 1);
  }
}
