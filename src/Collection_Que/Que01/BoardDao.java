package Collection_Que.Que01;

import lombok.Getter;

import java.util.List;
import java.util.ArrayList;

@Getter
public class BoardDao {
    private List<Board> boardList;  // Board 객체들을 담을 List를 선언

    public BoardDao() {
        this.boardList = new ArrayList<>(); // boardList 변수를 ArrayList 객체로 초기화
        this.boardList.add(new Board("제목1", "내용1"));
        this.boardList.add(new Board("제목2", "내용2"));
        this.boardList.add(new Board("제목3", "내용3"));
    }

}