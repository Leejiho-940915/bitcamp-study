package com.eomcs.pms.handler;

import java.util.List;
import com.eomcs.pms.domain.PersonalRequestDTO;
import com.eomcs.util.Prompt;

public class PersonalVolunteerRequestHandler {

  List<PersonalRequestDTO> personalList;

  public PersonalVolunteerRequestHandler(List<PersonalRequestDTO> personalList) {
    this.personalList = personalList;
  }

  public void apply() {
    System.out.println("[개인 봉사신청]");

    PersonalRequestDTO personalRequestDTO = new PersonalRequestDTO();

    personalRequestDTO.setNo(Prompt.inputInt("번호? "));
    personalRequestDTO.setTitle(Prompt.inputString("제목? "));
    personalRequestDTO.setSort(Prompt.inputString("분류? "));
    personalRequestDTO.setTel(Prompt.inputString("연락처? "));
    personalRequestDTO.setEmail(Prompt.inputString("이메일? "));
    personalRequestDTO.setVolunteerPeriod(Prompt.inputDate("봉사기간? "));
    personalRequestDTO.setVolunteerTime(Prompt.inputString("봉사시간? "));
    personalRequestDTO.setVolunteerList(Prompt.inputString("봉사목록? "));
    personalRequestDTO.setContent(Prompt.inputString("내용입력? "));
    personalRequestDTO.setFileUpload(Prompt.inputString("첨부이미지? "));

    personalList.add(personalRequestDTO);
  }

}
