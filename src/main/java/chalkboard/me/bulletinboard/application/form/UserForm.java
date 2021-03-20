package chalkboard.me.bulletinboard.application.form;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
public class UserForm {
  @Size(max=20)
  @Pattern(regexp = "^[a-zA-Z0-9]*$")
  @NotNull
  private String username;
  @Size(max=64)
  @Pattern(regexp = "^[a-zA-Z0-9]*$")
  @NotNull
  private String password;
}
