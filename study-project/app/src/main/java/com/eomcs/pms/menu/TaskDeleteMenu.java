package com.eomcs.pms.menu;

import com.eomcs.pms.handler.TaskHandler;

public class TaskDeleteMenu extends Menu {

  TaskHandler taskHandler;

  public TaskDeleteMenu(TaskHandler taskHandler) {
    super("삭제");
    this.taskHandler = taskHandler;
  }

  @Override
  public void execute() {
    taskHandler.delete();
  }

}
