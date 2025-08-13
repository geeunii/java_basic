package java_advanced_01.day15_0813.collection;

import java.util.ArrayList;
import java.util.Stack;

public class MyStack<T> {
    Stack<T> stack = new Stack<>();

    public void pushStack(T item) {
        stack.push(item);
    }

    public T popStack() {
        if (stack.isEmpty()) {
            return null;
        }
        return stack.remove(0);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        MyStack<Integer> ms = new MyStack<>();

        ms.pushStack(5);
        ms.pushStack(10);
        ms.pushStack(15);

        System.out.println(ms.popStack());
        System.out.println(ms.popStack());

    }
}
