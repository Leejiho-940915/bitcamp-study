package com.eomcs.pms;

public class Test {

  static void deleteValue(int[] arr, int value) {

    int arrIndex = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == value) {

      }
    }

    arrIndex = arr[i];

  }

  public static void main(String[] args) {
    int[] arr = {100, 200, 300};
    deleteValue(arr, 200);


    for (int value : arr) {
      if (value == -1)
        break;
      System.out.println(value);
    }
  }
}
