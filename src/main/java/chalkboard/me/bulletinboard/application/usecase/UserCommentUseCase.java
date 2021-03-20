package chalkboard.me.bulletinboard.application.usecase;

import chalkboard.me.bulletinboard.application.form.CommentForm;
import chalkboard.me.bulletinboard.domain.model.UserComment;
import chalkboard.me.bulletinboard.domain.model.UserCommentRepository;
import chalkboard.me.bulletinboard.domain.model.UserComments;
import chalkboard.me.bulletinboard.domain.model.UserId;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserCommentUseCase {
  private final UserCommentRepository repository;

  /**
   * ユーザの書き込みをDBに反映し、表示するデータをプレゼンテーション層に渡す
   * @param commentForm ユーザの入力データ
   * @return 表示するデータ
   */
  public void write(CommentForm commentForm, User user) {
    // フォームオブジェクトからドメインオブジェクトへ変換
    UserComment userComment = UserComment.from(
        commentForm.getName(),
        user.getUsername(),
        commentForm.getMailAddress(),
        commentForm.getComment()
    );

    // 例えばここで、直近の投稿の一覧を取得し、今回と同じ内容の投稿がないかチェックする

    repository.save(userComment);
  }

  /**
   * 投稿の取得
   * @return 投稿のリスト
   */
  public UserComments read(){
    return repository.select();
  }

  public UserComments read(UserId userId) {
    return repository.select(userId);
  }
}
