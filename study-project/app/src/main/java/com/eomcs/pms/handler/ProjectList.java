package com.eomcs.pms.handler;

import com.eomcs.pms.domain.Project;

public class ProjectList {
  static final int MAX_LENGTH = 5;

  Project[] projects = new Project[MAX_LENGTH];
  int size = 0;

  public void add(Project project) {
    if (size == projects.length) {
      Project[] arr = new Project[projects.length + (projects.length >> 1)];
      for (int i = 0; i < size; i++) {
        arr[i] = projects[i];
      }
      projects = arr;
    }
    this.projects[this.size++] = project;
  }

  public Project[] toArray() {
    Project[] arr = new Project[this.size];
    for (int i = 0; i < this.size; i++) {
      arr[i] = projects[i];
    }
    return arr;
  }

  public boolean remove(Project project) {
    int index = indexOf(project);
    if (index == -1) {
      return false;
    }
    for (int i = index + 1; i < this.size; i++) {
      this.projects[i - 1] = this.projects[i];
    }
    this.projects[--this.size] = null;

    return true;
  }

  public Project findByNo(int no) {
    for (int i = 0; i < this.size; i++) {
      if (this.projects[i].no == no) {
        return this.projects[i];
      }
    }
    return null;
  }

  private int indexOf(Project project) {
    for (int i = 0; i < this.size; i++) {
      if (this.projects[i] == project) {
        return i;
      }
    }
    return -1;
  }

}
