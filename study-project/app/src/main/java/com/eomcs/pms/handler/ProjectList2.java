package com.eomcs.pms.handler;

import com.eomcs.pms.domain.Project;

public class ProjectList2 {


  static class Node {
    Project project;
    Node next;

    public Node(Project project) {
      this.project = project;
    }
  }

  Node head;
  Node tail;
  int size;

  public void add(Project project) {

    Node node = new Node(project);

    if (head == null) {
      tail = head = node;
    } else {
      tail.next = node;

      tail = node;
    }
    size++;
  }

  public Project[] toArray() {
    Project[] arr = new Project[this.size];
    Node node = head;
    for (int i = 0; i < this.size; i++) {
      arr[i] = node.project;
      node = node.next;
    }
    return arr;
  }

  public boolean remove(Project project) {

    Node node = head;
    Node prev = null;

    while (node != null) {
      if (node.project == project) {
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

  public Project findByNo(int no) {
    Node node = head;
    while (node != null) {
      if (node.project.no == no) {
        return node.project;
      }
      node = node.next;
    }
    return null;
  }
}
