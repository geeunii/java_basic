package Board_Proj_v1;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data   // Lombok get,set,toString..
@Builder    // Lombok Builder
@NoArgsConstructor  // Lombok default 생성자
@AllArgsConstructor // Lombok 생성자
public class Board {
    private int bno;  //글번호
    private String bTitle;  // 글제목
    private String bContent; //글 내용
    private String bWriter;  //글쓴이
    private Date bDate;    //글쓴 날짜


}
