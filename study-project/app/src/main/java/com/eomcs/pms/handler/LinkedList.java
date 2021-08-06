package com.eomcs.pms.handler;

public class LinkedList implements List{

  static class Node {
    Object item;
    Node next;

    public Node(Object item) {
      this.item = item;
    }
  }
  Node head;
  Node tail;
  int size = 0;

  @Override
  public void add(Object item) {
    Node node = new Node(item);

    if (head == null) {
      tail = head = node;
    } else {
      tail.next = node;
      tail = node;
    }
    size++;
  }

  @Override
  public Object[] toArray() {
    // 배열에 저장된 값을 담을 정도의 크기를 가진 새 배열을 만든다.
    Object[] arr = new Object[this.size]; 

    Node node = head;

    for (int i = 0; i < this.size; i++) {
      arr[i] = node.item;
      node = node.next;
    }

    return arr; // 새 배열을 리턴한다.
  }

  @Override
  public boolean remove(Object item) {
    Node node = head;
    Node prev = null;

    while (node != null) {
      if (node.item == item) { // 노드에 들어 있는 객체와 같다면
        if (node == head) { // 삭제할 노드가 하필이면 첫 번째 노드라면, 
          head = node.next; // head가 두 번째 노드를 가리키게 한다.
        } else { // 삭제할 노드가 첫 번째 노드가 아니라면
          prev.next = node.next; // 이전 노드를 다음 노드와 연결한다.
        }

        node.next = null; // 삭제할 노드가 더이상 다음 노드를 가리키지 않게 한다.

        if (node == tail) { // 삭제할 노드가 마지막 노드라면
          tail = prev; // tail이 이전 노드를 가리키게 한다.
        }
        size--;
        return true;
      }

      // 현재 노드가 아니라면,
      prev = node; // 현재 노드를 prev 에 저장하고,
      node = node.next; // node 는 다음 노드를 가리킨다.
    }

    return false;
  }
}
