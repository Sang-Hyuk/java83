// 역할 : Service Object 
// => 비지니스 로직 구현 및 트랜젝션 관리
package java83.example.service;

import java.util.List;

import java83.example.vo.Board;

public interface BoardService {
  
  // 메서드 이름은 가능한 업무용어를 사용한다.
  void addBoard(Board board);
  List<Board> getBoardList(int pageNo, int pageSize);
  Board getBoard(int no);
  int updateBoard(Board board);
  int deleteBoard(int no);
  
}
