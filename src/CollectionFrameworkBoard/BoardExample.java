package CollectionFrameworkBoard;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList; // ArrayList 임포트 추가
import java.util.Collections; // Collections 임포트 추가
import java.util.Comparator;  // Comparator 임포트 추가 (람다 사용 시 필수는 아님)
import java.util.Date;
import java.util.List;    // List 인터페이스 임포트 추가
import java.util.Scanner;

public class BoardExample {

    static Scanner sc = new Scanner(System.in);
    static boolean controller = false;

    // 게시물들을 저장할 리스트 (메모리에 보관)
    static List<Board> boardList = new ArrayList<>();
    static int nextBno = 1; // 다음 글 번호를 자동으로 부여하기 위한 변수

    public static void mainMenu() { // 메인 메뉴 선택 기능

        String title = "[게시물 목록]";
        String underBar = "----------------------------------------------------";
        // Header를 String.format()을 사용하여 열 너비를 고정합니다.
        // %-4s: 4칸 왼쪽 정렬 문자열, %-10s: 10칸 왼쪽 정렬 문자열, %-16s: 16칸 왼쪽 정렬 문자열
        String header = String.format("%-4s %-10s %-16s %s", "no", "writer", "date", "title");
        String menuBar = "메인 메뉴: 1.Create | 2.Read | 3.Clear | 4.Exit";

        while (!controller) {

            System.out.println(title);
            System.out.println(underBar);
            System.out.println(header); // 수정된 header 사용
            System.out.println(underBar);
            list(); // 리스트 출력
            System.out.println();
            System.out.println(underBar);
            System.out.println(menuBar);
            System.out.print("메뉴 선택: ");
            int menuSelect = Integer.parseInt(sc.nextLine()); // int 입력 후 줄바꿈 처리 불필요

            switch (menuSelect) {
                case 1:
                    System.out.println("\n");
                    createPost();
                    break;
                case 2:
                    System.out.println("""
                            
                            *** read() 메소드 실행됨
                            """);
                    break;
                case 3:
                    System.out.println("""
                            
                            *** clear() 메소드 실행됨
                            """);
                    break;
                case 4:
                    System.out.println("""
                            
                            *** exit() 메소드 실행됨""");
                    controller = true;
                    break;
                default:
                    System.out.println("""
                            
                            *** 1~4 까지만 입력하시오.
                            """);
                    break;
            }

        }

    } // 메인 메뉴 선택 기능

    public static void list() { // 게시물 목록 기능

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");

        // 초기 테스트 게시물들을 boardList에 추가 (main 메소드에서 한 번만 실행되도록 하는 것이 좋습니다)
        if (boardList.isEmpty()) {
            Date bDate1 = null; // 2024.01.01
            try {
                bDate1 = new SimpleDateFormat("yyyy-MM-dd").parse("2024-01-01");
            } catch (ParseException e) {
                e.fillInStackTrace();
            }

            Date bDate2 = null; // 2024.01.02
            try {
                bDate2 = new SimpleDateFormat("yyyy-MM-dd").parse("2024-01-02");
            } catch (ParseException e) {
                e.fillInStackTrace();
            }

            boardList.add(new Board(nextBno++, "winter", bDate1, "눈 오는 날"));
            boardList.add(new Board(nextBno++, "winter", bDate1, "크리스마스"));
            boardList.add(new Board(nextBno++, "winter", bDate2, "봄의 정원"));
        }

        // 게시물 내림차순 정렬
        boardList.sort((b1, b2) -> {
            return Integer.compare(b2.getBno(), b1.getBno());
        });

        // String.format()을 사용하여 열 정렬을 맞춥니다.
        // %-4d: 4칸 왼쪽 정렬 정수, %-10s: 10칸 왼쪽 정렬 문자열, %-16s: 16칸 왼쪽 정렬 문자열
        for (Board board : boardList) {
            System.out.println(
                    String.format("%-4d %-10s %-16s %s",
                            board.getBno(),
                            board.getBWriter(),
                            sdf.format(board.getBDate()),
                            board.getBTitle()
                    )
            );
        }
    } // 게시믈 목록 기능

    public static void createPost() { // 게시물 생성 기능
        System.out.println("[새 게시물 입력]");

        System.out.print("제목: ");
        String bTitle = sc.nextLine();

        System.out.print("내용: ");
        String bContent = sc.nextLine();

        System.out.print("작성자: ");
        String bWriter = sc.nextLine();

        System.out.println("----------------------------------------------------");

        Date bDate = null; // Date 객체를 null로 초기화
        try {
            // 게시물 생성 시 날짜를 2024.01.03으로 설정합니다.
            bDate = new SimpleDateFormat("yyyy-MM-dd").parse("2024-01-03");
        } catch (ParseException e) {
            // 날짜 파싱 오류 발생 시 현재 날짜를 사용하거나 오류를 처리합니다.
            System.err.println("날짜 설정 오류가 발생했습니다. 현재 날짜를 사용합니다.");
            bDate = new Date(); // 오류 시 현재 날짜 사용
            e.fillInStackTrace();
        }

        // Board 클래스 생성자에 bContent가 없으므로 setter로 설정
        Board newBoard = new Board(nextBno, bWriter, bDate, bTitle);
        newBoard.setBContent(bContent); // Lombok @Data 덕분에 setter 사용 가능

        // 보조 메뉴
        System.out.println("보조 메뉴: 1.OK | 2.Cancel");
        System.out.print("메뉴 선택: ");
        int subMenuSelect = Integer.parseInt(sc.nextLine()); // int 입력 후 줄바꿈 처리 불필요

        if (subMenuSelect == 1) {
            boardList.add(newBoard); // 리스트에 추가
            nextBno++; // 다음 글 번호 증가
            System.out.println("\n");
        } else {
            System.out.println("\n*** 게시물 저장이 취소되었습니다."); // Cancel 시 메시지 추가
        }
    } // 게시물 생성 기능





    public static void main(String[] args) {
        mainMenu();
    }

}
