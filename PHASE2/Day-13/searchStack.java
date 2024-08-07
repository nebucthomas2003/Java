import java.util.Stack;

public class searchStack { // it will serach forr the object from the top of the stack, or the last element that is added. it will only print the value no changes.
    public static void main(String[] args) {
        Stack s1 = new Stack<>();
        s1.push(10);
        s1.push(20);
        s1.push(30);

        System.out.println(s1);
        System.out.println(s1.search(10));
    
}
}
