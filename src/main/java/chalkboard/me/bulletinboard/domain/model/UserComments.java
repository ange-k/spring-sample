package chalkboard.me.bulletinboard.domain.model;

import chalkboard.me.bulletinboard.domain.type.Comment;
import chalkboard.me.bulletinboard.domain.type.DateTime;
import chalkboard.me.bulletinboard.domain.type.MailAddress;
import chalkboard.me.bulletinboard.domain.type.Name;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.util.CollectionUtils;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class UserComments {
  private final List<UserComment> values;

  public static UserComments from(List<UserComment> comments) {
    if(CollectionUtils.isEmpty(comments)) return new UserComments(Collections.emptyList());
    return new UserComments(comments);
  }

  @RequiredArgsConstructor(access = AccessLevel.PRIVATE)
  @Getter
  public static class UserComment {
    private final int id;
    private final Name name;
    private final MailAddress mailAddress;
    private final Comment comment;
    private final DateTime dateTime;

    public static UserComment from(
        int id,
        String name,
        String mailAddress,
        String comment,
        LocalDateTime dateTime) {
      return new UserComment(
          id,
          Name.from(name),
          MailAddress.from(mailAddress),
          Comment.from(comment),
          DateTime.from(dateTime)
      );
    }
  }
}
