package java83.example.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java83.example.dao.BoardDao;
import java83.example.service.BoardService;
import java83.example.vo.Board;

@Service
public class BoardServiceImpl implements BoardService{
  
  @Autowired
  BoardDao boardDao;
  
  @Override
  public void addBoard(Board board) {
    boardDao.insert(board);
    
  }

  @Override
  public List<Board> getBoardList(int pageNo, int pageSize) {
    HashMap<String, Object> params = new HashMap<>();
    params.put("startIndex", (pageNo - 1) * pageSize);
    params.put("len", pageSize);

    return boardDao.selectList(params);
  }

  @Override
  public Board getBoard(int no) {
    // TODO Auto-generated method stub
    return boardDao.selectOne(no);
  }

  @Override
  public int updateBoard(Board board) {
    // TODO Auto-generated method stub
    return boardDao.update(board);
  }

  @Override
  public int deleteBoard(int no) {
    // TODO Auto-generated method stub
    return boardDao.delete(no);
  }

}
