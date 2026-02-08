package ex_08022026;

import java.util.Stack;

public class Lab237 {
    public static void main(String[] args) {
        // Vector, Stack - Legacy - 95% of time we are not going to use it in automation
        // legacy? - old ->
        Stack s=new Stack();
        s.push("Sanket");
        s.push("Ajit");
        s.push("Umrani");
        System.out.println(s);
        System.out.println(s.peek());//displays latest information
        System.out.println(s.pop());

    }
}
