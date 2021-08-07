package com.eomcs.pms.menu;

import com.eomcs.pms.handler.ProjectHandler;

public class ProjectDeleteMenu extends Menu {

  ProjectHandler projectHandler;

  public ProjectDeleteMenu(ProjectHandler projectHandler) {
    super("삭제");
    this.projectHandler = projectHandler;
  }

  public void execute() {
    projectHandler.delete();
  }
}
