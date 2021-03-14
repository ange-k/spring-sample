package chalkboard.me.bulletinboard.presentation;

import chalkboard.me.bulletinboard.application.form.CommentForm;
import chalkboard.me.bulletinboard.application.usecase.UserCommentUseCase;
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
  private final UserCommentUseCase userCommentUseCase;

  @GetMapping("/board")
  public ModelAndView viewBoard(ModelAndView modelAndView){
    modelAndView.setViewName("board");
    modelAndView.addObject("commentForm", new CommentForm());
    return modelAndView;
  }

  @PostMapping("/board")
  public ModelAndView postComment(
      @Validated @ModelAttribute CommentForm comment,
      BindingResult bindingResult) {
    if(bindingResult.hasErrors()) {
      ModelAndView modelAndView = new ModelAndView("/board");
      modelAndView.addObject("commentForm", comment);
      return modelAndView;
    }
    // エラーが無ければ保存する
    userCommentUseCase.write(comment);
    return new ModelAndView("redirect:/board");
  }
}
