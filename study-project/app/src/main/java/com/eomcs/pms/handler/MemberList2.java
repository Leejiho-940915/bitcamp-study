package com.eomcs.pms.handler;

import com.eomcs.pms.domain.Member;

public class MemberList2 {

  static class Node {
    Member member;
    Node next;

    public Node(Member member) {
      this.member = member;
    }
  }

  Node head;
  Node tail;
  int size;

  public void add(Member member) {

    Node node = new Node(member);

    if (head == null) {
      tail = head = node;
    } else {
      tail.next = node;

      tail = node;
    }
    size++;
  }

  public Member[] toArray() {
    Member[] arr = new Member[this.size];

    Node node = head;
    for (int i = 0; i < size; i++) {
      arr[i] = node.member;
      node = node.next;
    }
    return arr;
  }


  public Member findByNo(int no) {
    Node node = head;
    while (node != null) {
      if (node.member.no == no) {
        return node.member;
      }
      node = node.next;
    }
    return null;
  }

  public boolean remove(Member member) {

    Node node = head;
    Node prev = null;

    while (node != null) {
      if (node.member == member) {
        if (node == head) {
          head = node.next;
        } else {
          prev.next = node.next;
        }
        node.next = null;

        if (node == tail) {
          tail = prev;
        }
        size--;
        return true;
      }
      prev = node;
      node = node.next;
    }
    return false;
  }

  public boolean exist(String name) {
    Node node = head;
    while (node != null) {
      if (node.member.name.equals(name)) {
        return true;
      }
      node = node.next;
    }
    return false;
  }
}
