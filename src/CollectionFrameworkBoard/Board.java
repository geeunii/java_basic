package CollectionFrameworkBoard;

import lombok.Data;

import java.util.Date;

@Data
public class Board {
    private int bno;  //글번호
    private String bTitle;  // 글제목
    private String bContent; //글 내용
    private String bWriter;  //글쓴이
    private Date bDate;    //글쓴 날짜

    public Board(int bno, String bWriter, Date bDate, String bTitle) {
        this.bno = bno;
        this.bTitle = bTitle;
        this.bWriter = bWriter;
        this.bDate = bDate;
    }

    public Board(String bTitle, String bContent, String bWriter) {
    }
}
