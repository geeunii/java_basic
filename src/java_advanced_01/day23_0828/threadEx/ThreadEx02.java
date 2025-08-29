package java_advanced_01.day23_0828.threadEx;

import lombok.Getter;
import lombok.Setter;

@Getter
class Calculator {
    private int memory;

    public synchronized void setMemory1(int memory) {   // 동기화 메소드
        this.memory = memory;
        try {
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + ": " + this.memory);
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + "Interrupted" + this.memory);
        }
    }

    public void setMemory2(int memory) {    // 동기화 블럭을 포함하는 메소드
        synchronized (this) {
            this.memory = memory;
            try {
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + ": " + this.memory);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + "Interrupted" + this.memory);
            }
        }
    }
}

@Setter
class User1 extends Thread {
    private Calculator calculator;

    public User1() {
        setName("User1 의 Thread");  // Thread 의 이름변경
    }

    @Override
    public void run() {
        calculator.setMemory1(100); // 동기화 메소드 호출
    }
}

@Setter
class User2 extends Thread {
    private Calculator calculator;

    public User2() {
        setName("User2 의 Thread");  // Thread 의 이름변경
    }

    @Override
    public void run() {
        calculator.setMemory2(200); // 동기화 메소드 호출
    }
}


public class ThreadEx02 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        User1 user1 = new User1();
        User2 user2 = new User2();

        user1.setCalculator(calculator);
        user2.setCalculator(calculator);

        user1.start();
        user2.start();
    }
}
