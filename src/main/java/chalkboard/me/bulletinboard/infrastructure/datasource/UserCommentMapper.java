package chalkboard.me.bulletinboard.infrastructure.datasource;

import chalkboard.me.bulletinboard.application.dto.UserCommentDto;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserCommentMapper {
  @Insert("sql/insertUserComment.sql")
  void insert(@Param("dto") UserCommentDto dto);
}
