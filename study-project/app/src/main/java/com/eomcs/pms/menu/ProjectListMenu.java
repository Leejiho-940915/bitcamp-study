package com.eomcs.pms.menu;

import com.eomcs.pms.handler.ProjectHandler;

public class ProjectListMenu extends Menu {

  ProjectHandler projectHandler;

  public ProjectListMenu(ProjectHandler projectHandler) {
    super("목록");
    this.projectHandler = projectHandler;
  }

  public void execute() {
    projectHandler.list();
  }
}
