import java.util.Stack;

public class peekStack { //it will print the last element added or the elemment which is at the top of the stack
    public static void main(String[] args) {
        Stack s1 = new Stack<>();
         s1.push(10);
         s1.push(20);
         s1.push(30);

         System.out.println(s1);
         System.out.println(s1.peek());
    }
    
}
