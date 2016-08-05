package java83.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloControl {
  
  @RequestMapping("/hello")
  public String hello() {
    return "/hello.jsp";
  }
}
