package com.eomcs.pms.menu;

import com.eomcs.pms.handler.ProjectHandler;

public class ProjectDetailMenu extends Menu {

  ProjectHandler projectHandler;

  public ProjectDetailMenu(ProjectHandler projectHandler) {
    super("상세보기");
    this.projectHandler = projectHandler;
  }

  public void execute() {
    projectHandler.detail();
  }
}
