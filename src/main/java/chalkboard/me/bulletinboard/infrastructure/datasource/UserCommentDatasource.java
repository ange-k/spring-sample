package chalkboard.me.bulletinboard.infrastructure.datasource;

import chalkboard.me.bulletinboard.application.dto.UserCommentDto;
import chalkboard.me.bulletinboard.application.dto.UserCommentReadDto;
import chalkboard.me.bulletinboard.domain.model.UserCommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class UserCommentDatasource implements UserCommentRepository {
  private final UserCommentMapper mapper;

  @Override
  public void save(UserCommentDto dto) {
    mapper.insert(dto);
  }

  @Override
  public List<UserCommentReadDto> select() {
    return mapper.select();
  }
}
