package Board_Proj_v1;

import java.util.LinkedHashMap;
import java.util.Map;

public class BoardManager {

    private Map<String, Board> boardMap = new LinkedHashMap<>();

    // 싱글톤 패턴을 적용하여 어드민 계정은 하나이다. 어드민 계정은 게시글 저장소를 관리한다.
    private static BoardManager boardManagerSingleton = new BoardManager();

    public static BoardManager getInstance() {
        return boardManagerSingleton;
    }

    public Map<String, Board> getBoardMap() {
        return boardMap;
    }

    public void setBoardMap(Map<String, Board> boardMap) {
        this.boardMap = boardMap;
    }

    public static BoardManager getBoardManagerSingleton() {
        return boardManagerSingleton;
    }

    public static void setBoardManagerSingleton(BoardManager boardManagerSingleton) {
        BoardManager.boardManagerSingleton = boardManagerSingleton;
    }
}
