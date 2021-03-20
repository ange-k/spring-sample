package chalkboard.me.bulletinboard.application.auth;

public interface UserAuthRepository {
  void createUser(String userName, String password);
}
