package Collection_Que.Que01;

import java.util.List;
import java.util.ArrayList;

public class BoardDao {
    private List<Board> boardList;

    public BoardDao() {
        // 생성자에서 boardList 초기화
        this.boardList = new ArrayList<>();
        this.boardList.add(new Board("제목1", "내용1"));
        this.boardList.add(new Board("제목2", "내용2"));
        this.boardList.add(new Board("제목3", "내용3"));
    }

    public List<Board> getBoardList() {
        return boardList;
    }
}