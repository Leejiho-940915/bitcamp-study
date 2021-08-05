package com.eomcs.pms.handler;

import com.eomcs.pms.domain.Task;

public class TaskList {
  static final int MAX_LENGTH = 5;

  Task[] tasks = new Task[MAX_LENGTH];
  int size = 0;

  public void add(Task task) {
    this.tasks[this.size++] = task;
  }

  public Task[] toArray() {
    Task[] arr = new Task[this.size];
    for (int i = 0; i < this.size; i++) {
      arr[i] = tasks[i];
    }
    return arr;
  }

  public Task findByNo(int no) {
    for (int i = 0; i < this.size; i++) {
      if (this.tasks[i].no == no) {
        return this.tasks[i];
      }
    }
    return null;
  }

  public boolean remove(Task task) {
    int index = indexOf(task);
    if (index == -1) {
      return false;
    }
    for (int i = index + 1; i < this.size; i++) {
      this.tasks[i - 1] = this.tasks[i];
    }
    this.tasks[--this.size] = null;
    return true;
  }

  private int indexOf(Task task) {
    for (int i = 0; i < this.size; i++) {
      if (this.tasks[i] == task) {
        return i;
      }
    }
    return -1;
  }
}
