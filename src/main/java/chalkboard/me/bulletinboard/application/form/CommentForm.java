package chalkboard.me.bulletinboard.application.form;

import lombok.Data;

@Data
public class CommentForm {
  private String name;
  private String mailAddress;
  private String comment;
}
