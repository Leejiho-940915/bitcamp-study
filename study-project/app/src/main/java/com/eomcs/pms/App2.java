package com.eomcs.pms;

public class App2 {
  public static void main(String[]args){
    java.util.Scanner keyboardScanner = new java.util.Scanner(System.in);
    java.sql.Date registeredDate = new java.sql.Date(System.currentTimeMillis());
    System.out.println("[프로젝트]");
    System.out.print("번호? ");
    int number = keyboardScanner.nextInt();
    keyboardScanner.nextLine();

    System.out.print("프로젝트명? ");
    String projectName = keyboardScanner.nextLine();

    System.out.print("내용? ");
    String what = keyboardScanner.nextLine();

    System.out.print("시작일? ");

    keyboardScanner.nextLine();

    System.out.print("종료일? ");

    keyboardScanner.nextLine();

    System.out.print("만든이? ");
    String owner = keyboardScanner.nextLine();

    System.out.print("팀원? ");
    String menber = keyboardScanner.nextLine();


    keyboardScanner.close();


    System.out.print("-------------------------");
    System.out.printf("[프로젝트]");
    System.out.printf("번호: %d\n",number);
    System.out.printf("프로젝트명: %s\n",projectName);
    System.out.printf("내용: %s\n",what);
    System.out.print("시작일:");
    System.out.print("종료일:");
    System.out.printf("만든이: %s\n",owner);
    System.out.printf("팀원: %s\n",menber);
  }
}