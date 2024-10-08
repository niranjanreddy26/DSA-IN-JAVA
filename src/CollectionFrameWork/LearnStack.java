package CollectionFrameWork;

import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        Stack<String> heros = new Stack<>();
        heros.push("zooma");// pushing elements into the stack
        heros.push("bhAAi");
        heros.push("cheddy");
        heros.push("pawala");
        System.out.println(heros);// display the stack elements
        System.out.println(heros.peek()); // seeing the top most element in the stack
        System.out.println(heros.pop());// removing the top element from the stack
        System.out.println(heros.peek());
    }
}
