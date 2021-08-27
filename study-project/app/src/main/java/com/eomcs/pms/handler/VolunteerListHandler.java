package com.eomcs.pms.handler;

import java.util.List;
import com.eomcs.pms.domain.Board;
import com.eomcs.pms.domain.OrganizationRequestDTO;
import com.eomcs.pms.domain.PersonalRequestDTO;
import com.eomcs.util.Prompt;

public class VolunteerListHandler {

  List<PersonalRequestDTO> personalList;
  List<OrganizationRequestDTO> organizationList;

  public VolunteerListHandler(List<PersonalRequestDTO> personalList) {
    this.personalList = personalList;
  }





  public void list() {
    System.out.println("[게시글 목록]");

    // 현재 BoardList에 보관된 값을 담을 수 있는 만큼 크기의 배열을 생성한다.
    Board[] boards = new Board[volunteerList.size()];

    // 배열을 파라미터로 넘겨서 값을 받아 온다.
    // => 넘겨 주는 배열의 크기가 충분하기 때문에 toArray()는 새 배열을 만들지 않을 것이다.
    volunteerList.toArray(boards);

    // 이렇게 제네릭이 적용된 List를 사용하면
    // List에서 값을 꺼낼 때 마다 형변환 할 필요가 없어 프로그래밍이 편리하다.
    for (Board board : boards) {
      System.out.printf("%d, %s, %s, %s, %d, %d\n", 
          board.getNo(), 
          board.getTitle(), 
          board.getWriter(),
          board.getRegisteredDate(),
          board.getViewCount(), 
          board.getLike());
    }
  }

  public void detail() {
    System.out.println("[게시글 상세보기]");
    int no = Prompt.inputInt("번호? ");

    Board board = findByNo(no);

    if (board == null) {
      System.out.println("해당 번호의 게시글이 없습니다.");
      return;
    }

    System.out.printf("제목: %s\n", board.getTitle());
    System.out.printf("내용: %s\n", board.getContent());
    System.out.printf("작성자: %s\n", board.getWriter());
    System.out.printf("등록일: %s\n", board.getRegisteredDate());

    board.setViewCount(board.getViewCount() + 1);
    System.out.printf("조회수: %d\n", board.getViewCount());
  }

  public String join() {

  }

  private Board findByNo(int no) {
    // 일부러 BoardList에 들어 있는 배열 보다 작은 배열을 넘겨준다.
    // => 그러면 ToArray()는 새 배열을 만들어 값을 저장한 후 리턴할 것이다.
    Board[] arr = volunteerList.toArray(new Board[0]);
    for (Board board : arr) {
      if (board.getNo() == no) {
        return board;
      }
    }
    return null;
  }
}

