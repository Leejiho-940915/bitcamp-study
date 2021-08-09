package com.eomcs.pms.domain;

import java.sql.Date;

// 한 개의 작업 정보를 저장할 변수를 구성한다.
// => 작업 정보를 저장할 새 데이터 타입을 정의한다.
public class Task {
  private int no;
  private String content;
  private Date deadline;
  private String owner;
  private int status;
  public int getNo() {
    return no;
  }
  public void setNo(int no) {
    this.no = no;
  }
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }
  public Date getDeadline() {
    return deadline;
  }
  public void setDeadline(Date deadline) {
    this.deadline = deadline;
  }
  public String getOwner() {
    return owner;
  }
  public void setOwner(String owner) {
    this.owner = owner;
  }
  public int getStatus() {
    return status;
  }
  public void setStatus(int status) {
    this.status = status;
  }

}
