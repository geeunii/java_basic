package Board_Proj_v1;

import java.text.SimpleDateFormat;
import java.util.*;

// 사용자가 현재 게시물 목록 읽을 수 있다.
// 사용자가 메뉴를 선택하여 글을 생성, 생성한 글을 읽을 수도 있고, 삭제할 수도 있다.
// 사용자는 게시판 프로그램을 종료할 수 있다.
public class BoardExample {

    static Scanner sc = new Scanner(System.in); // static 처리 => sc 객체는 공용객체
    private static final String menuNumberRegex = "[1-4]";
    private static final String checkNumber = "[1-2]";
    private static final String readOptionRegex = "[1-3]";
    private static int bno = 1; // 공용변수

    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");   // data 때문에 text import 사용

    // Board 매니저가 게시판을 관리한다.
    BoardManager boardManager;

    public BoardExample(BoardManager boardManager) {
        this.boardManager = boardManager;
    }

    // 현재 게시판의 전체 게시물 목록을 출력하는 기능
    public void list() {
/*        String boardList = """
                [게시물 목록]
                -----------------------------------------------------------
                no      writer      date            title
                -----------------------------------------------------------
                """;
*/
        Map<String, Board> boardMap = boardManager.getBoardMap(); // 게피안은 매니저가 담당하고 있으므로, 매니저한테 받아온다.
//      System.out.println(boardList);
        System.out.println("\n[게시물 목록]");
        System.out.println("-".repeat(60));
        System.out.printf("%-4s %-20s %-20s %-20s\n", "no", "writer", "date", "title");

        // Manager 에게 저네 게시물 목록을 요청
        List<Map.Entry<String, Board>> entryList = new LinkedList<>(boardMap.entrySet());
        Collections.reverse(entryList);

        entryList.forEach(entry -> {
            Board value = entry.getValue();
            System.out.printf("%-4s %-20s %-20s %-20s\n",
                    value.getBno(), value.getBWriter(), dateFormat.format(value.getBDate()), value.getBTitle());
        });
        System.out.println("-".repeat(60));


        mainMenu();
    }

    // 메인 메뉴를 호출.
    public void mainMenu() {
        System.out.println("메인메뉴: 1.Create | 2.Read | 3.Clear | 4.Exit");
        System.out.print("메뉴 선택: ");
    }

    // 게시물 메인 메뉴 선택 기능
    public void run() {
        while (true) {
            list();
            String input = sc.nextLine();   // 외부에서 사용자가 입력한 데이터 타입은 모두 문자열 타입

            if (input.equals("4")) {
                System.out.println("\n게시판 종료");
                break;
            }
            if (input.matches(menuNumberRegex)) {
                switch (input) {
                    case "1":
                        // System.out.println("*** Create() 메소드 실행됨");
                        create();
                        break;
                    case "2":
                        // System.out.println("*** Read() 메소드 실행됨");
                        read();
                        break;
                    case "3":
                        System.out.println("*** Clear() 메소드 실행됨");
                        break;
                }
            } else {
                System.out.println("[1-4]번 번호를 입력하시오.");
            }
        }
    }

    // checkMenu() : 보조메뉴 확인, 선택 메서드
    public boolean checkMenu() {
        System.out.println("보조 메뉴: 1.OK | 2.Cancel");
        System.out.print("메뉴 선택: ");
        while (true) {
            String input = sc.nextLine();
            if (input.matches(checkNumber)) {
                return input.equals("1");
            } else {
                System.out.println("[1 or 2]번을 입력하시오.");
            }
        }
    }

    // 새 글 작성 저장기능 => Map 컬렉션에
    public void create() {
        System.out.println("\n[새 게시물 입력]");
        System.out.print("제목: ");
        String title = sc.nextLine();

        System.out.print("내용: ");
        String content = sc.nextLine();

        System.out.print("작성자: ");
        String writer = sc.nextLine();

        // 1번 입력
        if (checkMenu()) {
            // builder 를 이용하여 새 글을 생성한다.
            Board board = Board.builder()
                    .bno(bno)
                    .bWriter(writer)
                    .bTitle(title)
                    .bContent(content)
                    .bDate(new Date())
                    .build();
            Map<String, Board> boardMap = boardManager.getBoardMap();
            boardMap.put(String.valueOf(bno), board);
            boardManager.setBoardMap(boardMap);
            bno++;

        }
    }

    // 게시물 읽기 메소드
    public void read() {
        System.out.println("\n[게시물 읽기]");
        int numberInput = 0;
        while (true) {

            try {
                System.out.print("bno: ");
                numberInput = sc.nextInt();
                if (numberInput < 0 || numberInput > boardManager.getBoardMap().size()) {
                    throw new IllegalArgumentException("해당 게시물은 존재하지 않습니다.");
                } else {
                    Map<String, Board> boardMap = boardManager.getBoardMap();
                    System.out.println("#".repeat(30));
                    Board boardOne = boardMap.get(String.valueOf(numberInput));
                    System.out.println("번호: " + boardOne.getBno());
                    System.out.println("제목: " + boardOne.getBTitle());
                    System.out.println("내용: " + boardOne.getBContent());
                    System.out.println("작성자: " + boardOne.getBWriter());
                    System.out.printf((String.format(boardOne.getBDate().toString())));
                    System.out.println("#".repeat(30));
                    readOption(numberInput);
                    break;
                }
            } catch (IllegalArgumentException | InputMismatchException e) {
                System.out.println(e.getMessage());
            }

        }
    }

    // readOption() : 읽기 메서드의 옵션 메서드
    public void readOption(int bno) {
        System.out.println("보조 메뉴: 1.Update | 2. Delete | 3.List");
        System.out.print("메뉴 선택: ");
        while (true) {
            String numberInput = sc.nextLine();
            if (numberInput.matches(readOptionRegex)) {
                switch (numberInput) {
                    case "1":
                        update(bno);
                        break;
                    case "2":
                        delete(bno);
                        break;
                    case "3":
                        run();
                        break;
                }
                break;
            } else {
                System.out.println("[1-3]번 중 번호를 선택하세요.");
            }
        }
    }

    /*
        read의 옵션 update
     */
    public void update(int bno) {


    }

    /*
        read의 옵션 delete
     */
    public void delete(int bno) {

    }

    /*
        게시판 내용 전체 삭제
     */
    public void clear() {

    }

}
