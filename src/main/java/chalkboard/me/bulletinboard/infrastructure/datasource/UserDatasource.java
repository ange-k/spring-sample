package chalkboard.me.bulletinboard.infrastructure.datasource;

import chalkboard.me.bulletinboard.application.auth.UserAuthRepository;
import com.google.common.collect.ImmutableSet;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class UserDatasource implements UserAuthRepository {
  private final UserDetailsManager manager;
  private final PasswordEncoder passwordEncoder;

  public void createUser(String userName, String password) {
    User user = new User(
        userName,
        passwordEncoder.encode(password),
        ImmutableSet.of(new SimpleGrantedAuthority("ROLE_USER"))
    );
    manager.createUser(user);
  }
}
