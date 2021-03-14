package chalkboard.me.bulletinboard.application.dto;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class UserCommentReadDto {
  private final int id;
  private final String name;
  private final String mailAddress;
  private final LocalDateTime createdAt;
  private final String comment;
}
