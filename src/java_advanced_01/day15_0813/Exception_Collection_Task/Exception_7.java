package java_advanced_01.day15_0813.Exception_Collection_Task;

public class Exception_7 {

    public static class NotExistIDException extends Exception {
        public NotExistIDException() {
        }

        public NotExistIDException(String message) {
            super(message); // Pass the message to the parent Exception constructor
        }
    }

    public static class WrongPasswordException extends Exception {
        public WrongPasswordException() {
        }

        public WrongPasswordException(String message) {
            super(message); // Pass the message to the parent Exception constructor
        }
    }


    public static void main(String[] args) {
        try {
            login("white", "12345");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            login("blue", "54321");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void login(String id, String password) throws NotExistIDException, WrongPasswordException {
        // id가 blue가 아니라면 NotExistIDException을 발생시킴 [cite: 73]
        if (!id.equals("blue")) {
            throw new NotExistIDException("아이디가 존재하지 않습니다.");
        }

        // password가 12345가 아니라면 WrongPasswordException을 발생시킬
        if (!password.equals("12345")) {
            throw new WrongPasswordException("패스워드가 틀립니다.");
        }
    }

}