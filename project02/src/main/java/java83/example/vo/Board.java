//역할 : VO(Value Object)
package java83.example.vo;

import java.io.Serializable;
import java.sql.Date;

public class Board implements Serializable{
  // 직렬화(Byte 배열로 변환하여 출력) 할때 데이터의 버전 정보를 기록하기 위함.
  // => 역 직렬화(Byte 배열을 읽어 객체로 만들기) 하는 쪽에서 이 버전 정보를 검사하여 유효 여부를 판단
  private static final long serialVersionUID = 1L;
  
  protected int no;
  protected String title;
  protected String content;
  protected Date createDate;
  protected int viewCount;
  
  public int getNo() {
    return no;
  }
  public void setNo(int no) {
    this.no = no;
  }
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }
  public Date getCreateDate() {
    return createDate;
  }
  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }
  public int getViewCount() {
    return viewCount;
  }
  public void setViewCount(int viewCount) {
    this.viewCount = viewCount;
  }
  
  

}
