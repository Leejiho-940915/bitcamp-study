package com.eomcs.lang.ex04;

//# 형변환 - 명시적 형변환이 불가능한 경우, 특별한 메서드를 사용하면 가능하다.
// 
public class Exam0950 {
  public static void main(String[] args) {



    boolean v1 = Boolean.valueOf ("true");
    char v2 = "가".charAt(0); // 컴파일 오류!

    int v3 = Integer.valueOf("123"); // 컴파일 오류!
    int v3 = Integer.valueOf("123"); // 컴파일 오류!

    float v4 = ; // 컴파일 오류!
    float v4 = ; // 컴파일 오류!


  }
}
