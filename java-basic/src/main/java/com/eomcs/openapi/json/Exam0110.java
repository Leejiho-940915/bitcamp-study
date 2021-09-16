// 객체 --> JSON문자열 : 객체의 필드 값을 json 형식의 문자열로 만들기
package com.eomcs.openapi.json;

import java.sql.Date;
import com.google.gson.Gson;

public class Exam0110 {
  public static void main(String[] args) {

    // 1) 객체 준비
    Member m = new Member();
    m.setNo(100);
    m.setName("홍길동");
    m.setEmail("hong@test.com");
    m.setPassword("1111");
    m.setPhoto("hong.gif");
    m.setTel("010-2222-2222");
    m.setRegisteredDate(new Date(System.currentTimeMillis()));

    // 2) JSON 처리 객체 준비
    Gson gson = new Gson();

    // 3) 객체의 값을 JSON 문자열로 얻기
    String jsonStr = gson.toJson(m);

    System.out.println(jsonStr);
  }
}
