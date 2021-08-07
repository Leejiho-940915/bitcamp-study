package com.eomcs.pms.menu;

import com.eomcs.pms.handler.TaskHandler;

public class TaskListMenu extends Menu {

  TaskHandler taskHandler;

  public TaskListMenu(TaskHandler taskHandler) {
    super("목록");
    this.taskHandler = taskHandler;
  }

  public void execute() {
    taskHandler.list();
  }
}
