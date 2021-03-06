package chalkboard.me.bulletinboard.presentation;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class HelloController {

  @GetMapping("/hello")
  public String hello(Model model){
    return "hello";
  }
}
