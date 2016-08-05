package java83.example.controller.json;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import java83.example.service.BoardService;
import java83.example.vo.Board;

@Controller
@RequestMapping("/board/")
public class BoardController {

  @Autowired
  BoardService boardService;

  @RequestMapping(path = "list", produces = "application/json;charset=UTF-8") // json
                                                                              // data
                                                                              // 한글깨짐
                                                                              // 방지
  @ResponseBody // client에게 바로 뿌려질 것 이다. 없을경우 return 값을 jsp 페이지의 이름으로 생각한다.
  public String list(@RequestParam(defaultValue = "1") int pageNo, 
                     @RequestParam(defaultValue = "3") int pageSize) {
    // model.addAttribute("list", boardService.getBoardList(pageNo, pageSize));
    // jsp 에게 주기 위해 Model 에 담는다. json 으로 줄때는 필요 없다.
    HashMap<String, Object> result = new HashMap<>();
    try {
      List<Board> list = boardService.getBoardList(pageNo, pageSize);
      result.put("status", "success");
      result.put("data", list);
    } catch (Exception e) {
      result.put("status", "failure");
    }

    return new Gson().toJson(result);
  }

  @RequestMapping(path = "detail", produces = "application/json;charset=UTF-8")
  @ResponseBody
  // 받아야하는 Parameter명과 변수명이 같다면 @RequestParam 필요없음
  public String detail(int no) {

    HashMap<String, Object> result = new HashMap<>();
    try {

      result.put("status", "success");
      result.put("data", boardService.getBoard(no));
    } catch (Exception e) {
      result.put("status", "failure");
    }
    return new Gson().toJson(result);

  }

  @RequestMapping(path = "add", method = RequestMethod.GET)
  // 받아야하는 Parameter명과 변수명이 같다면 @RequestParam 필요없음
  public String form() {
    return "board/form";
  }

  @RequestMapping(path = "add", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
  @ResponseBody
  // 받아야하는 Parameter명과 변수명이 같다면 @RequestParam 필요없음
  public String add(Board board) {

    HashMap<String, Object> result = new HashMap<>();
    try {
      boardService.addBoard(board);
      result.put("status", "success");
    } catch (Exception e) {
      result.put("status", "failure");
    }
    return new Gson().toJson(result);
  }

  @RequestMapping(path = "delete", produces = "application/json;charset=UTF-8")
  @ResponseBody
  // 받아야하는 Parameter명과 변수명이 같다면 @RequestParam 필요없음
  public String delete(int no) {

    HashMap<String, Object> result = new HashMap<>();
    try {
      boardService.deleteBoard(no);
      result.put("status", "success");

    } catch (Exception e) {
      result.put("status", "failure");
    }
    return new Gson().toJson(result);

  }

  @RequestMapping(path = "update", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
  @ResponseBody
  // 받아야하는 Parameter명과 변수명이 같다면 @RequestParam 필요없음
  public String update(Board board) {

    HashMap<String, Object> result = new HashMap<>();
    try {
      boardService.updateBoard(board);
      result.put("status", "success");
    } catch (Exception e) {
      result.put("status", "failure");
    }
    return new Gson().toJson(result);
  }

}
