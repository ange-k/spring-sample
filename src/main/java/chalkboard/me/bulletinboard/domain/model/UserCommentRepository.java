package chalkboard.me.bulletinboard.domain.model;

import chalkboard.me.bulletinboard.application.dto.UserCommentDto;
import chalkboard.me.bulletinboard.application.dto.UserCommentReadDto;

import java.util.List;

public interface UserCommentRepository {
  void save(UserCommentDto dto);

  List<UserCommentReadDto> select();
}
