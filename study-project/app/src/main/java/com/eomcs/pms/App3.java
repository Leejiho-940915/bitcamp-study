package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

public class App3 {

  public static void main(String[] args) {
    System.out.println("[작업]");

    final int MAX_LENGTH = 100;

    Scanner keyboardScan = new Scanner(System.in);
    String[] project = new String[MAX_LENGTH];
    int[] no = new int[MAX_LENGTH];
    String[] content = new String[MAX_LENGTH];
    Date[] deadline = new Date[MAX_LENGTH];
    int[] status = new int[MAX_LENGTH];
    String[] owner = new String[MAX_LENGTH];

    int size = 0;

    for (int i = 0; i < MAX_LENGTH; i = i + 1) {
      System.out.print("프로젝트? ");
      project[i] = keyboardScan.nextLine();
      System.out.print("번호? ");
      no[i] = Integer.parseInt(keyboardScan.nextLine());
      System.out.print("내용? ");
      content[i] = keyboardScan.nextLine();
      System.out.print("마감일? ");
      deadline[i] = Date.valueOf(keyboardScan.nextLine());
      System.out.println("상태?");
      System.out.println("0: 신규");
      System.out.println("1: 진행중");
      System.out.println("2: 완료");
      System.out.print("> ");
      status[i] = Integer.valueOf(keyboardScan.nextLine());
      System.out.print("담당자? ");
      owner[i] = keyboardScan.nextLine();
      size = i + 1;
      System.out.println();

      System.out.print("계속 입력하시겠습니까? (y/N)");
      String input = keyboardScan.nextLine();
      if (input.equalsIgnoreCase("N") || input.equals("")) {
        break;
      }
    }


    keyboardScan.close();

    System.out.println("--------------------------------");


    for (int i = 0; i < size; i = i + 1 ) {
      System.out.printf("%s, %d, %s, %tY-%4$tm-%4$td, %s, %s\n",
          project[i],
          no[i],
          content[i],
          deadline[i],
          status[i],
          owner[i]);
      System.out.println();
    }
  }
}
