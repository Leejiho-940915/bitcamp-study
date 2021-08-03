package com.eomcs.pms.menu;

import com.eomcs.pms.handler.TaskHandler;

public class TaskAddMenu extends Menu {

  TaskHandler taskHandler;

  public TaskAddMenu(TaskHandler taskHandler) {
    super("등록");
    this.taskHandler = taskHandler;
  }

  @Override
  public void execute() {
    taskHandler.add();
  }

}
