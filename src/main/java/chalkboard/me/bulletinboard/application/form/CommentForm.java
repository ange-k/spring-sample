package chalkboard.me.bulletinboard.application.form;

import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.lang.Nullable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Data
public class CommentForm {
  @Nullable
  @Length(max=20)
  private String name;
  @Nullable
  @Email
  @Length(max=100)
  private String mailAddress;
  @NotNull
  @Length(min=1, max=400)
  private String comment;
}
