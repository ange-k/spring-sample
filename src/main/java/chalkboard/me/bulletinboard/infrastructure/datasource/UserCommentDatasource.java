package chalkboard.me.bulletinboard.infrastructure.datasource;

import chalkboard.me.bulletinboard.application.dto.UserCommentDto;
import chalkboard.me.bulletinboard.application.dto.UserCommentReadDto;
import chalkboard.me.bulletinboard.domain.model.UserComment;
import chalkboard.me.bulletinboard.domain.model.UserCommentRepository;
import chalkboard.me.bulletinboard.domain.model.UserComments;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Repository
public class UserCommentDatasource implements UserCommentRepository {
  private final UserCommentMapper mapper;

  @Override
  public void save(UserComment userComment) {
    mapper.insert(UserCommentDto.from(userComment));
  }

  @Override
  public UserComments select() {
    List<UserCommentReadDto> dtos = mapper.select();
    return UserComments.from(
        dtos.stream().map( dto -> UserComments.UserComment.from(
            dto.getId(),
            dto.getName(),
            dto.getMailAddress(),
            dto.getComment(),
            dto.getCreatedAt()
        )).collect(Collectors.toUnmodifiableList())
    );
  }
}
