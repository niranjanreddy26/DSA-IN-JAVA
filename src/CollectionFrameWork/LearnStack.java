package CollectionFrameWork;

import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        Stack<String> heros = new Stack<>();
        heros.push("zooma");
        heros.push("bhAAi");
        heros.push("cheddy");
        heros.push("pawala");
        System.out.println(heros);
        System.out.println(heros.pop());
        System.out.println(heros.peek());
    }
}
