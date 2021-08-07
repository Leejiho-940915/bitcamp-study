package com.eomcs.pms.menu;

import com.eomcs.pms.handler.TaskHandler;

public class TaskUpdateMenu extends Menu {

  TaskHandler taskHandler;

  public TaskUpdateMenu(TaskHandler taskHandler) {
    super("변경");
    this.taskHandler = taskHandler;
  }

  public void execute() {
    taskHandler.update();
  }
}
