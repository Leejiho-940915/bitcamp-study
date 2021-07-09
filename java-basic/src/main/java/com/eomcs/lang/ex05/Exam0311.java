package com.eomcs.lang.ex05;

//# 논리 연산자 : &&, ||, !(not), ^(XOR; exclusive-OR)
//
public class Exam0310 {
  public static void main(String[] args) {
    // boolean 타입이 아닌 데이터 타입에 대해서는 사용할 수 없다.
    //System.out.println(0 && 1); //컴파일 오류
    //System.out.println(0 || 1); //컴파일 오류
    //System.out.println(!0); //컴파일 오류


    // ^ 연산자를 정수 값에 대해 수행하면
    // 비트 단위로 연산을 수행한다.
    //
    System.out.println(1 ^ 0); // ok!
    // 00000000_00000000_00000000_00000010 (2)
    // 00000000_00000000_00000000_00000011 (3)
    //-------------------------------------

  }
}
