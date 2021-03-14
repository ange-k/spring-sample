package chalkboard.me.bulletinboard.domain.type;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
@EqualsAndHashCode
public class Name {
  private final String value;

  public static Name from(String name) {
    return new Name(name);
  }

  public boolean equals(String name) {
    return value.equals(name);
  }

  @Override
  public String toString() {
    return value;
  }
}
