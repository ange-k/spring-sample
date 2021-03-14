package chalkboard.me.bulletinboard.domain.model;

import chalkboard.me.bulletinboard.application.dto.UserCommentDto;

public interface UserCommentRepository {
  void save(UserCommentDto dto);
}
