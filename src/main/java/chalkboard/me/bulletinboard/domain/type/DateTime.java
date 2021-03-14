package chalkboard.me.bulletinboard.domain.type;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class DateTime {
  private final LocalDateTime value;

  public static DateTime from(LocalDateTime dateTime) {
    return new DateTime(dateTime);
  }
}
