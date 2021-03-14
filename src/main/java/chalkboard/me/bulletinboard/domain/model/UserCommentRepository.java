package chalkboard.me.bulletinboard.domain.model;

import chalkboard.me.bulletinboard.application.dto.UserCommentReadDto;

import java.util.List;

public interface UserCommentRepository {
  void save(UserComment dto);
  List<UserCommentReadDto> select();
}
