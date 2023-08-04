import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        st.push(30);
        st.push(20);
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.peek();
        st.push(50);
       System.out.println( st.peek());
        System.out.println(st.size());
    }
}
