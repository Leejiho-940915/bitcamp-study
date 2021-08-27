package com.eomcs.pms.handler;

import java.util.List;
import com.eomcs.pms.domain.OrganizationRequestDTO;
import com.eomcs.util.Prompt;

public class OrganizationVolunteerRequestHandler {

  List<OrganizationRequestDTO> organizationList;

  public OrganizationVolunteerRequestHandler(List<OrganizationRequestDTO> organizationList) {
    this.organizationList = organizationList;
  }

  public void apply() {
    System.out.println("[기관 봉사신청]");

    OrganizationRequestDTO organizationRequestDTO = new OrganizationRequestDTO();

    organizationRequestDTO.setNo(Prompt.inputInt("번호? "));
    organizationRequestDTO.setTitle(Prompt.inputString("제목? "));
    organizationRequestDTO.setSort(Prompt.inputString("분류? "));
    organizationRequestDTO.setTel(Prompt.inputString("연락처? "));
    organizationRequestDTO.setEmail(Prompt.inputString("이메일? "));
    organizationRequestDTO.setVolunteerPeriod(Prompt.inputDate("봉사기간? "));
    organizationRequestDTO.setVolunteerTime(Prompt.inputString("봉사시간? "));
    organizationRequestDTO.setVolunteerList(Prompt.inputString("봉사목록? "));
    organizationRequestDTO.setContent(Prompt.inputString("내용입력? "));
    organizationRequestDTO.setFileUpload(Prompt.inputString("첨부이미지? "));

    organizationList.add(organizationRequestDTO);
  }
}