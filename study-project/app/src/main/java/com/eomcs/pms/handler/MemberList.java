package com.eomcs.pms.handler;

import com.eomcs.pms.domain.Member;

public class MemberList {
  static final int MAX_LENGTH = 5;

  Member[] members = new Member[MAX_LENGTH];
  int size = 0;


  public void add(Member member) {
    if (size == members.length) {
      Member[] arr = new Member[members.length + (members.length >> 1)];
      for (int i = 0; i < size; i++) {
        arr[i] = members[i];
      }
      members = arr;
    }
    this.members[this.size++] = member;
  }


  public Member[] toArray() {
    Member[] arr = new Member[this.size];
    for (int i = 0; i < size; i++) {
      arr[i] = members[i];
    }
    return arr;
  }

  public boolean remove(Member member) {
    int index = indexOf(member);
    if (index == -1) {
      return false;
    }
    for (int i = index + 1; i < this.size; i++) {
      this.members[i - 1] = this.members[i];
    }
    this.members[--this.size] = null;

    return true;
  }

  public Member findByNo(int no) {
    for (int i = 0; i < this.size; i++) {
      if (this.members[i].no == no) {
        return this.members[i];
      }
    }
    return null;
  }

  private int indexOf(Member member) {
    for (int i = 0; i < this.size; i++) {
      if (this.members[i] == member) {
        return i;
      }
    }
    return -1;
  }

  boolean exist(String name) {
    for (int i = 0; i < this.size; i++) {
      if (this.members[i].name.equals(name)) {
        return true;
      }
    }
    return false;
  }
}
