package chalkboard.me.bulletinboard.presentation;

import chalkboard.me.bulletinboard.application.form.CommentForm;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequiredArgsConstructor
public class BoardController {

  @GetMapping("/board")
  public ModelAndView viewBoard(ModelAndView modelAndView){
    modelAndView.setViewName("board");
    modelAndView.addObject("commentForm", new CommentForm());
    return modelAndView;
  }

  @PostMapping("/board")
  public String postComment(@ModelAttribute CommentForm comment) {
    return "board";
  }
}
