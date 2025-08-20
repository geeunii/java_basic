package Collection_Que.Que01;

import lombok.Getter;

@Getter
public class Board {
    private String title;
    private String content;

    public Board(String title, String content) {
        this.title = title;
        this.content = content;
    }

}
