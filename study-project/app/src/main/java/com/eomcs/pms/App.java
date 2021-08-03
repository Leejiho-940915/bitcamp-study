package com.eomcs.pms;

import com.eomcs.pms.handler.BoardHandler;
import com.eomcs.pms.handler.MemberHandler;
import com.eomcs.pms.handler.ProjectHandler;
import com.eomcs.pms.handler.TaskHandler;
import com.eomcs.pms.menu.Menu;
import com.eomcs.pms.menu.MenuGroup;
import com.eomcs.pms.menu.ProjectDeleteMenu;
import com.eomcs.pms.menu.TaskAddMenu;
import com.eomcs.pms.menu.TaskDeleteMenu;
import com.eomcs.pms.menu.TaskDetailMenu;
import com.eomcs.pms.menu.TaskListMenu;
import com.eomcs.pms.menu.TaskUpdateMenu;
import com.eomcs.util.Prompt;
// 
public class App {

  // main() 메서드와 doXxxMenu() 메서드가 공유하는 변수는 
  // 같은 스태틱 멤버로 만든다.
  static BoardHandler boardHandler = new BoardHandler();
  static MemberHandler memberHandler = new MemberHandler();
  static ProjectHandler projectHandler = new ProjectHandler(memberHandler);
  static TaskHandler taskHandler = new TaskHandler(memberHandler);

  public static void main(String[] args) {

    Menu mainMenu = createMenu();
    mainMenu.execute();

    Prompt.close();

  }
  static Menu createMenu() {
    MenuGroup mainMenuGroup = new MenuGroup("메인");
    mainMenuGroup.setPrevMenuTitle("종료");

    MenuGroup boardMenu = new MenuGroup("게시판");
    mainMenuGroup.add(boardMenu);


    boardMenu.add(new Menu("등록") {
      public void execute() {
        boardHandler.add();
      }});
    boardMenu.add(new Menu("목록") {
      public void execute() {
        boardHandler.list();
      }});
    boardMenu.add(new Menu("상세보기") {
      public void execute() {
        boardHandler.detail();
      }});
    boardMenu.add(new Menu("변경") {
      public void execute() {
        boardHandler.update();
      }});
    boardMenu.add(new Menu("삭제") {
      public void execute() {
        boardHandler.delete();
      }});

    MenuGroup memberMenu = new MenuGroup("회원");
    mainMenuGroup.add(memberMenu);

    memberMenu.add(new Menu("등록") {
      public void execute() {
        memberHandler.add();
      }});
    memberMenu.add(new Menu("목록") {
      public void execute() {
        memberHandler.list();
      }});
    memberMenu.add(new Menu("상세보기") {
      public void execute() {
        memberHandler.detail();
      }});
    memberMenu.add(new Menu("변경") {
      public void execute() {
        memberHandler.update();
      }});
    memberMenu.add(new Menu("삭제") {
      public void execute() {
        memberHandler.delete();
      }});

    MenuGroup projectMenu = new MenuGroup("프로젝트");
    mainMenuGroup.add(projectMenu);

    projectMenu.add(new Menu("등록") {
      public void execute() {
        projectHandler.add();
      }});
    projectMenu.add(new Menu("목록") {
      public void execute() {
        projectHandler.list();
      }});
    projectMenu.add(new Menu("상세보기") {
      public void execute() {
        projectHandler.detail();
      }});
    projectMenu.add(new Menu("변경") {
      public void execute() {
        projectHandler.update();
      }});
    projectMenu.add(new ProjectDeleteMenu(projectHandler));

    MenuGroup taskMenu = new MenuGroup("작업");
    mainMenuGroup.add(taskMenu);

    taskMenu.add(new TaskAddMenu(taskHandler));
    taskMenu.add(new TaskListMenu(taskHandler));
    taskMenu.add(new TaskDetailMenu(taskHandler));
    taskMenu.add(new TaskUpdateMenu(taskHandler));
    taskMenu.add(new TaskDeleteMenu(taskHandler));


    return mainMenuGroup;
  }

}










