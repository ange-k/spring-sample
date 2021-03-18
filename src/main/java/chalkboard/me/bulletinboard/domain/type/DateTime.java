package chalkboard.me.bulletinboard.domain.type;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class DateTime {
  private final LocalDateTime value;
  private final DateTimeFormatter formatter =
      DateTimeFormatter.ISO_DATE_TIME;

  public static DateTime from(LocalDateTime dateTime) {
    return new DateTime(dateTime);
  }

  @Override
  public String toString() {
    return value.format(formatter);
  }
}
