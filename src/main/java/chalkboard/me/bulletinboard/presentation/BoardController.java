package chalkboard.me.bulletinboard.presentation;

import chalkboard.me.bulletinboard.presentation.form.CommentForm;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
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
  public String postComment(
      @Validated @ModelAttribute CommentForm comment,
      BindingResult bindingResult) {
    return "redirect:/board";
  }
}
