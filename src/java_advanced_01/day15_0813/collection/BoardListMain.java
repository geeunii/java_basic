package java_advanced_01.day15_0813.collection;

import java.util.ArrayList;
import java.util.List;

public class BoardListMain {

    public static void main(String[] args) {
        List<Board> boardList = new ArrayList<>();

        // 글 하나를 작성하여 게시판에 올림.
        boardList.add(new Board("컬렉션 학습 first day", "so hard1", "khg"));
        boardList.add(new Board("컬렉션 학습 first day", "so hard2", "khg"));
        boardList.add(new Board("컬렉션 학습 first day", "so hard3", "khg"));
        boardList.add(new Board("컬렉션 학습 first day", "so hard4", "khg"));

        // 현재 게시판 글의 수
        int size = boardList.size();
        System.out.println("전체 글 수 : " + size);
        for (Board board : boardList) {
            System.out.println("제목 : " + board.getSubject());
            System.out.println("내용 : " + board.getContent());
            System.out.println("작성자 : " + board.getWriter());
        }

        Board board = boardList.get(2);
        System.out.println("제목 : " + board.getSubject());
        System.out.println("내용 : " + board.getContent());
        System.out.println("작성자 : " + board.getWriter());

        System.out.println();
    }
}
