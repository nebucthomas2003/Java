import java.util.Stack;

public class popStack { //Pop or delete elements from a stack
    public static void main(String[] args) {
        Stack s1 = new Stack<>();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        System.out.println(s1);
        s1.pop();
        System.out.println(s1);
        s1.pop();
        System.out.println(s1);
        s1.pop();
        System.out.println(s1);
        
    }
    
}
