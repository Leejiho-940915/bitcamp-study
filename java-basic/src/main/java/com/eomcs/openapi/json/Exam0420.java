// JSON 문자열 --> 객체 : 다른 객체를 포함하는 경우
package com.eomcs.openapi.json;

import com.google.gson.Gson;

public class Exam0420 {
  public static void main(String[] args) {

    // 1) JSON 문자열 준비
    String jsonStr = "{\"no\":1,\"title\":\"제목\",\"content\":\"내용\",\"writer\":{\"no\":100,\"name\":\"홍길동\",\"email\":\"hong@test.com\",\"password\":\"1111\",\"photo\":\"hong.gif\",\"tel\":\"010-2222-2222\",\"registeredDate\":\"9월 16, 2021\"},\"registeredDate\":\"9월 16, 2021\",\"viewCount\":98,\"like\":5}\r\n"
        + "";

    // 3) JSON 문자열을 가지고 객체 만들기
    Board b = new Gson().fromJson(jsonStr, Board.class);

    System.out.println(b);
  }
}
