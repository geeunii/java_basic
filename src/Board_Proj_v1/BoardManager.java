package Board_Proj_v1;

import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashMap;
import java.util.Map;

@Setter
public class BoardManager {

    @Getter
    private Map<String, Board> boardMap = new LinkedHashMap<>();

    // 싱글톤 패턴을 적용하여 어드민 계정은 하나이다. 어드민 계정은 게시글 저장소를 관리한다.
    @Getter
    private static BoardManager boardManagerSingleton = new BoardManager();

    public static BoardManager getInstance() {
        return boardManagerSingleton;
    }

    public static void setBoardManagerSingleton(BoardManager boardManagerSingleton) {
        BoardManager.boardManagerSingleton = boardManagerSingleton;
    }
}
