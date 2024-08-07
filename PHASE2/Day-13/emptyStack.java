import java.util.Stack;

public class emptyStack { // it will check whether the stack is empty or not . it will return true or false
    public static void main(String[] args) {
        Stack s1 = new Stack<>();
        System.out.println(s1.empty());
        s1.push(10);
        s1.push(20);
        s1.push(30);
        System.out.println(s1.empty());
    }
    
}
