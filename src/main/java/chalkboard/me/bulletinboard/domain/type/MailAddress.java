package chalkboard.me.bulletinboard.domain.type;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

import java.util.Objects;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
@EqualsAndHashCode
public class MailAddress {
  private final String value;

  public static MailAddress from(String mailAddress) {
    return new MailAddress(mailAddress);
  }

  @Override
  public String toString() {
    if(Objects.isNull(value)) {
      return "";
    }
    return value;
  }
}
