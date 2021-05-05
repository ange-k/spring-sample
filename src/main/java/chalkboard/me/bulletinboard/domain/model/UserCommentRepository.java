package chalkboard.me.bulletinboard.domain.model;

public interface UserCommentRepository {
  void save(UserComment dto);
  UserComments select();
  UserComments select(UserId userId);
}
