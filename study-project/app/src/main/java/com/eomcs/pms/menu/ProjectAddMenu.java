package com.eomcs.pms.menu;

import com.eomcs.pms.handler.ProjectHandler;

public class ProjectAddMenu extends Menu {

  ProjectHandler projectHandler;

  public ProjectAddMenu(ProjectHandler projectHandler) {
    super("등록");
    this.projectHandler = projectHandler;
  }

  public void execute() {
    projectHandler.add();
  }
}
