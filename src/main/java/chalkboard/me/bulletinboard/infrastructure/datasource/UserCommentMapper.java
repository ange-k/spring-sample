package chalkboard.me.bulletinboard.infrastructure.datasource;

import chalkboard.me.bulletinboard.application.dto.UserCommentDto;
import chalkboard.me.bulletinboard.application.dto.UserCommentReadDto;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserCommentMapper {
  @Insert("sql/insertUserComment.sql")
  void insert(@Param("dto") UserCommentDto dto);

  @Select("sql/selectUserComment.sql")
  List<UserCommentReadDto> select();

  @Select("sql/selectMyComment.sql")
  List<UserCommentReadDto> selectById(@Param("userId") String userId);
}
