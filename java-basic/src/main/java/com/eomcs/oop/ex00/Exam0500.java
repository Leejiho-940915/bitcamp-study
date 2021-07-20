package com.eomcs.oop.ex00;

import com.eomcs.oop.ex00.util.Caculator;

public class Exam0500 {



  public static void main(String[] args) {
    // 식1) 2 + 3 - 1 * 7 / 3 = ?
    // 식2) 3 * 2 + 7 / 4 - 5 = ?
    Caculator c1 = new Caculator();
    Caculator c2 = new Caculator();


    c1.plus(2);
    c1.plus(3);
    c1.minus(1);
    c1.multiple(7);
    c1.divide(3);
    c2.plus(3);
    c2.multiple(2);
    c2.plus(7);
    c2.divide(4);
    c2.minus(5);

    System.out.printf("result = %d\n", c1.result);
    System.out.printf("result = %d\n", c2.result);

  }

}
